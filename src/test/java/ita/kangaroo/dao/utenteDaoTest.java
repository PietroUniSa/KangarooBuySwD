package ita.kangaroo.dao;

import ita.kangaroo.model.tipo;
import ita.kangaroo.model.utenteBean;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import javax.sql.DataSource;
import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class utenteDaoTest {

    @Mock
    private DataSource mockDataSource;

    @Mock
    private Connection mockConnection;

    @Mock
    private PreparedStatement mockPreparedStatement;

    @Mock
    private ResultSet mockResultSet;

    private utenteDao utenteDao;

    @BeforeEach
    void setUp() throws Exception {
        utenteDao = new utenteDao();
        setStaticDataSource(mockDataSource);
    }

    private void setStaticDataSource(DataSource dataSource) throws Exception {
        Field dsField = utenteDao.class.getDeclaredField("ds");
        dsField.setAccessible(true);
        dsField.set(null, dataSource);
    }

    private utenteBean createValidUtenteBean() {
        utenteBean client = new utenteBean();
        client.setUsername("testuser");
        client.setPassword("password123");
        client.setCognome("Rossi");
        client.setNome("Mario");
        client.setEmail("mario.rossi@test.com");
        client.setTipo(tipo.cliente);
        client.setVia("Via Roma 123");
        client.setCitta("Milano");
        client.setProvincia("MI");
        client.setTelefono("0212345678");
        client.setCap("20100");
        return client;
    }

    private void setupResultSetForUtente() throws SQLException {
        when(mockResultSet.getString("Username")).thenReturn("testuser");
        when(mockResultSet.getString("Password")).thenReturn("hashedpassword");
        when(mockResultSet.getString("Cognome")).thenReturn("Rossi");
        when(mockResultSet.getString("Nome")).thenReturn("Mario");
        when(mockResultSet.getString("Email")).thenReturn("mario.rossi@test.com");
        when(mockResultSet.getString("Tipo")).thenReturn("cliente");
        when(mockResultSet.getString("via")).thenReturn("Via Roma 123");
        when(mockResultSet.getString("Citta")).thenReturn("Milano");
        when(mockResultSet.getString("provincia")).thenReturn("MI");
        when(mockResultSet.getString("telefono")).thenReturn("0212345678");
        when(mockResultSet.getString("cap")).thenReturn("20100");
    }

    // === TESTS FOR doSave() ===

    @Test
    void testDoSave_ValidClient_ReturnsPositiveResult() throws SQLException {
        // Arrange
        utenteBean client = createValidUtenteBean();

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeUpdate()).thenReturn(1);

        // Act
        int result = utenteDao.doSave(client);

        // Assert
        assertEquals(1, result);
        verify(mockPreparedStatement).setString(1, "testuser");
        verify(mockPreparedStatement).setString(2, client.getPassword());
        verify(mockPreparedStatement).setString(3, "Rossi");
        verify(mockPreparedStatement).setString(4, "Mario");
        verify(mockPreparedStatement).setString(5, "mario.rossi@test.com");
        verify(mockPreparedStatement).setString(6, "cliente");
        verify(mockPreparedStatement).setString(7, "Via Roma 123");
        verify(mockPreparedStatement).setString(8, "Milano");
        verify(mockPreparedStatement).setString(9, "MI");
        verify(mockPreparedStatement).setString(10, "0212345678");
        verify(mockPreparedStatement).setString(11, "20100");
        verify(mockPreparedStatement).executeUpdate();
    }

    @Test
    void testDoSave_AdminUser_SavesCorrectly() throws SQLException {
        // Arrange
        utenteBean client = createValidUtenteBean();
        client.setTipo(tipo.admin);

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeUpdate()).thenReturn(1);

        // Act
        int result = utenteDao.doSave(client);

        // Assert
        assertEquals(1, result);
        verify(mockPreparedStatement).setString(6, "admin");
    }

    @Test
    void testDoSave_DataSourceNotConfigured_ThrowsIllegalStateException() throws Exception {
        // Arrange
        setStaticDataSource(null);
        utenteBean client = createValidUtenteBean();

        // Act & Assert
        IllegalStateException exception = assertThrows(IllegalStateException.class,
                () -> utenteDao.doSave(client));
        assertEquals("DataSource not configured", exception.getMessage());
    }

    @Test
    void testDoSave_ConnectionFails_ThrowsSQLException() throws SQLException {
        // Arrange
        utenteBean client = createValidUtenteBean();
        SQLException expectedException = new SQLException("Connection failed");

        when(mockDataSource.getConnection()).thenThrow(expectedException);

        // Act & Assert
        SQLException exception = assertThrows(SQLException.class, () -> utenteDao.doSave(client));
        assertEquals("Connection failed", exception.getMessage());
    }

    @Test
    void testDoSave_ExecuteUpdateFails_ThrowsSQLException() throws SQLException {
        // Arrange
        utenteBean client = createValidUtenteBean();
        SQLException expectedException = new SQLException("Execute update failed");

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeUpdate()).thenThrow(expectedException);

        // Act & Assert
        SQLException exception = assertThrows(SQLException.class, () -> utenteDao.doSave(client));
        assertEquals("Execute update failed", exception.getMessage());
    }

    @Test
    void testDoSave_ResourcesClosed() throws SQLException {
        // Arrange
        utenteBean client = createValidUtenteBean();

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeUpdate()).thenReturn(1);

        // Act
        utenteDao.doSave(client);

        // Assert
        verify(mockPreparedStatement).close();
        verify(mockConnection).close();
    }

    // === TESTS FOR doRetrieveByEmailAndPassword() ===

    @Test
    void testDoRetrieveByEmailAndPassword_ValidCredentials_ReturnsUtente() throws SQLException {
        // Arrange
        String email = "mario.rossi@test.com";
        String password = "password123";

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeQuery()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(true, false);
        setupResultSetForUtente();

        // Act
        utenteBean result = utenteDao.doRetrieveByEmailAndPassword(email, password);

        // Assert
        assertNotNull(result);
        assertEquals("testuser", result.getUsername());
        assertEquals("Rossi", result.getCognome());
        assertEquals("Mario", result.getNome());
        assertEquals("mario.rossi@test.com", result.getEmail());
        assertEquals(tipo.cliente, result.getTipo());
        assertEquals("Via Roma 123", result.getVia());
        assertEquals("Milano", result.getCitta());
        assertEquals("MI", result.getProvincia());
        assertEquals("0212345678", result.getTelefono());
        assertEquals("20100", result.getCap());

        verify(mockPreparedStatement).setString(1, email);
        verify(mockPreparedStatement).setString(2, password);
    }

    @Test
    void testDoRetrieveByEmailAndPassword_InvalidCredentials_ReturnsNull() throws SQLException {
        // Arrange
        String email = "wrong@test.com";
        String password = "wrongpassword";

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeQuery()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(false);

        // Act
        utenteBean result = utenteDao.doRetrieveByEmailAndPassword(email, password);

        // Assert
        assertNull(result);
    }

    @Test
    void testDoRetrieveByEmailAndPassword_DataSourceNotConfigured_ThrowsIllegalStateException() throws Exception {
        // Arrange
        setStaticDataSource(null);

        // Act & Assert
        IllegalStateException exception = assertThrows(IllegalStateException.class,
                () -> utenteDao.doRetrieveByEmailAndPassword("email@test.com", "password"));
        assertEquals("DataSource not configured", exception.getMessage());
    }

    @Test
    void testDoRetrieveByEmailAndPassword_SQLException_Propagated() throws SQLException {
        // Arrange
        SQLException expectedException = new SQLException("Query failed");
        when(mockDataSource.getConnection()).thenThrow(expectedException);

        // Act & Assert
        SQLException exception = assertThrows(SQLException.class,
                () -> utenteDao.doRetrieveByEmailAndPassword("email@test.com", "password"));
        assertEquals("Query failed", exception.getMessage());
    }

    @Test
    void testDoRetrieveByEmailAndPassword_ResourcesClosed() throws SQLException {
        // Arrange
        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeQuery()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(false);

        // Act
        utenteDao.doRetrieveByEmailAndPassword("email@test.com", "password");

        // Assert
        verify(mockPreparedStatement).close();
        verify(mockConnection).close();
    }

    // === TESTS FOR doRetrieveByKey() ===

    @Test
    void testDoRetrieveByKey_ExistingUsername_ReturnsUtente() throws SQLException {
        // Arrange
        String username = "testuser";

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeQuery()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(true, false);
        setupResultSetForUtente();

        // Act
        utenteBean result = utenteDao.doRetrieveByKey(username);

        // Assert
        assertNotNull(result);
        assertEquals("testuser", result.getUsername());
        assertEquals("Rossi", result.getCognome());
        assertEquals("Mario", result.getNome());
        assertEquals("mario.rossi@test.com", result.getEmail());
        assertEquals(tipo.cliente, result.getTipo());
        assertEquals("Via Roma 123", result.getVia());
        assertEquals("Milano", result.getCitta());
        assertEquals("MI", result.getProvincia());
        assertEquals("0212345678", result.getTelefono());
        assertEquals("20100", result.getCap());

        verify(mockPreparedStatement).setString(1, username);
    }

    @Test
    void testDoRetrieveByKey_NonExistingUsername_ReturnsNull() throws SQLException {
        // Arrange
        String username = "nonexistent";

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeQuery()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(false);

        // Act
        utenteBean result = utenteDao.doRetrieveByKey(username);

        // Assert
        assertNull(result);
        verify(mockPreparedStatement).setString(1, username);
    }

    @Test
    void testDoRetrieveByKey_DataSourceNotConfigured_ThrowsIllegalStateException() throws Exception {
        // Arrange
        setStaticDataSource(null);

        // Act & Assert
        IllegalStateException exception = assertThrows(IllegalStateException.class,
                () -> utenteDao.doRetrieveByKey("testuser"));
        assertEquals("DataSource not configured", exception.getMessage());
    }

    @Test
    void testDoRetrieveByKey_SQLException_Propagated() throws SQLException {
        // Arrange
        SQLException expectedException = new SQLException("Query failed");
        when(mockDataSource.getConnection()).thenThrow(expectedException);

        // Act & Assert
        SQLException exception = assertThrows(SQLException.class,
                () -> utenteDao.doRetrieveByKey("testuser"));
        assertEquals("Query failed", exception.getMessage());
    }

    @Test
    void testDoRetrieveByKey_ResourcesClosed() throws SQLException {
        // Arrange
        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeQuery()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(false);

        // Act
        utenteDao.doRetrieveByKey("testuser");

        // Assert
        verify(mockPreparedStatement).close();
        verify(mockConnection).close();
    }

    // === TESTS FOR doModify() ===

    @Test
    void testDoModify_ExistingUser_ReturnsPositiveResult() throws SQLException {
        // Arrange
        utenteBean client = createValidUtenteBean();

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeUpdate()).thenReturn(1);

        // Act
        int result = utenteDao.doModify(client);

        // Assert
        assertEquals(1, result);
        verify(mockPreparedStatement).setString(1, "Rossi");
        verify(mockPreparedStatement).setString(2, "Mario");
        verify(mockPreparedStatement).setString(3, "mario.rossi@test.com");
        verify(mockPreparedStatement).setString(4, "Via Roma 123");
        verify(mockPreparedStatement).setString(5, "Milano");
        verify(mockPreparedStatement).setString(6, "MI");
        verify(mockPreparedStatement).setString(7, "0212345678");
        verify(mockPreparedStatement).setString(8, "20100");
        verify(mockPreparedStatement).setString(9, "testuser");
    }

    @Test
    void testDoModify_NonExistingUser_ReturnsZero() throws SQLException {
        // Arrange
        utenteBean client = createValidUtenteBean();
        client.setUsername("nonexistent");

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeUpdate()).thenReturn(0);

        // Act
        int result = utenteDao.doModify(client);

        // Assert
        assertEquals(0, result);
    }

    @Test
    void testDoModify_DataSourceNotConfigured_ThrowsIllegalStateException() throws Exception {
        // Arrange
        setStaticDataSource(null);
        utenteBean client = createValidUtenteBean();

        // Act & Assert
        IllegalStateException exception = assertThrows(IllegalStateException.class,
                () -> utenteDao.doModify(client));
        assertEquals("DataSource not configured", exception.getMessage());
    }

    @Test
    void testDoModify_SQLException_Propagated() throws SQLException {
        // Arrange
        utenteBean client = createValidUtenteBean();
        SQLException expectedException = new SQLException("Update failed");

        when(mockDataSource.getConnection()).thenThrow(expectedException);

        // Act & Assert
        SQLException exception = assertThrows(SQLException.class, () -> utenteDao.doModify(client));
        assertEquals("Update failed", exception.getMessage());
    }

    @Test
    void testDoModify_ResourcesClosed() throws SQLException {
        // Arrange
        utenteBean client = createValidUtenteBean();

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeUpdate()).thenReturn(1);

        // Act
        utenteDao.doModify(client);

        // Assert
        verify(mockPreparedStatement).close();
        verify(mockConnection).close();
    }

    // === TESTS FOR doRetrieveByEmail() ===

    @Test
    void testDoRetrieveByEmail_ExistingEmail_ReturnsUtente() throws SQLException {
        // Arrange
        String email = "mario.rossi@test.com";

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeQuery()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(true, false);
        setupResultSetForUtente();

        // Act
        utenteBean result = utenteDao.doRetrieveByEmail(email);

        // Assert
        assertNotNull(result);
        assertEquals("testuser", result.getUsername());
        assertEquals("mario.rossi@test.com", result.getEmail());
        assertEquals("Rossi", result.getCognome());
        assertEquals("Mario", result.getNome());
        assertEquals(tipo.cliente, result.getTipo());

        verify(mockPreparedStatement).setString(1, email);
    }

    @Test
    void testDoRetrieveByEmail_NonExistingEmail_ReturnsNull() throws SQLException {
        // Arrange
        String email = "nonexistent@test.com";

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeQuery()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(false);

        // Act
        utenteBean result = utenteDao.doRetrieveByEmail(email);

        // Assert
        assertNull(result);
        verify(mockPreparedStatement).setString(1, email);
    }

    @Test
    void testDoRetrieveByEmail_DataSourceNotConfigured_ThrowsIllegalStateException() throws Exception {
        // Arrange
        setStaticDataSource(null);

        // Act & Assert
        IllegalStateException exception = assertThrows(IllegalStateException.class,
                () -> utenteDao.doRetrieveByEmail("email@test.com"));
        assertEquals("DataSource not configured", exception.getMessage());
    }

    @Test
    void testDoRetrieveByEmail_SQLException_Propagated() throws SQLException {
        // Arrange
        SQLException expectedException = new SQLException("Query failed");
        when(mockDataSource.getConnection()).thenThrow(expectedException);

        // Act & Assert
        SQLException exception = assertThrows(SQLException.class,
                () -> utenteDao.doRetrieveByEmail("email@test.com"));
        assertEquals("Query failed", exception.getMessage());
    }

    @Test
    void testDoRetrieveByEmail_ResourcesClosed() throws SQLException {
        // Arrange
        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeQuery()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(false);

        // Act
        utenteDao.doRetrieveByEmail("email@test.com");

        // Assert
        verify(mockPreparedStatement).close();
        verify(mockConnection).close();
    }

    // === TESTS FOR doRetrieveAll() ===

    @Test
    void testDoRetrieveAll_MultipleUsers_ReturnsList() throws SQLException {
        // Arrange
        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeQuery()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(true, true, false);

        when(mockResultSet.getString("Username")).thenReturn("user1", "user2");
        when(mockResultSet.getString("Password")).thenReturn("hash1", "hash2");
        when(mockResultSet.getString("Cognome")).thenReturn("Rossi", "Verdi");
        when(mockResultSet.getString("Nome")).thenReturn("Mario", "Luigi");
        when(mockResultSet.getString("Email")).thenReturn("mario@test.com", "luigi@test.com");
        when(mockResultSet.getString("Tipo")).thenReturn("cliente", "admin"); // cambiato da maiuscolo a minuscolo
        when(mockResultSet.getString("via")).thenReturn("Via Roma 1", "Via Milano 2");
        when(mockResultSet.getString("Citta")).thenReturn("Milano", "Roma");
        when(mockResultSet.getString("provincia")).thenReturn("MI", "RM");
        when(mockResultSet.getString("telefono")).thenReturn("0212345678", "0698765432");
        when(mockResultSet.getString("cap")).thenReturn("20100", "00100");
        // Act
        ArrayList<utenteBean> result = utenteDao.doRetrieveAll();

        // Assert
        assertNotNull(result);
        assertEquals(2, result.size());

        assertEquals("user1", result.get(0).getUsername());
        assertEquals("Rossi", result.get(0).getCognome());
        assertEquals("Mario", result.get(0).getNome());
        assertEquals(tipo.cliente, result.get(0).getTipo());

        assertEquals("user2", result.get(1).getUsername());
        assertEquals("Verdi", result.get(1).getCognome());
        assertEquals("Luigi", result.get(1).getNome());
        assertEquals(tipo.admin, result.get(1).getTipo());
    }

    @Test
    void testDoRetrieveAll_NoUsers_ReturnsEmptyList() throws SQLException {
        // Arrange
        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeQuery()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(false);

        // Act
        ArrayList<utenteBean> result = utenteDao.doRetrieveAll();

        // Assert
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    void testDoRetrieveAll_DataSourceNotConfigured_ThrowsIllegalStateException() throws Exception {
        // Arrange
        setStaticDataSource(null);

        // Act & Assert
        IllegalStateException exception = assertThrows(IllegalStateException.class,
                () -> utenteDao.doRetrieveAll());
        assertEquals("DataSource not configured", exception.getMessage());
    }

    @Test
    void testDoRetrieveAll_SQLException_Propagated() throws SQLException {
        // Arrange
        SQLException expectedException = new SQLException("Query failed");
        when(mockDataSource.getConnection()).thenThrow(expectedException);

        // Act & Assert
        SQLException exception = assertThrows(SQLException.class, () -> utenteDao.doRetrieveAll());
        assertEquals("Query failed", exception.getMessage());
    }

    @Test
    void testDoRetrieveAll_ResourcesClosed() throws SQLException {
        // Arrange
        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeQuery()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(false);

        // Act
        utenteDao.doRetrieveAll();

        // Assert
        verify(mockPreparedStatement).close();
        verify(mockConnection).close();
    }

    // === SYNCHRONIZATION TESTS ===

    @Test
    void testSynchronizedBehavior_MultipleCalls_WorkCorrectly() throws SQLException {
        // Arrange
        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeQuery()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(false);

        // Act - multiple synchronized calls
        utenteBean result1 = utenteDao.doRetrieveByKey("user1");
        utenteBean result2 = utenteDao.doRetrieveByEmail("email@test.com");
        ArrayList<utenteBean> result3 = utenteDao.doRetrieveAll();

        // Assert
        assertNull(result1);
        assertNull(result2);
        assertNotNull(result3);
        assertTrue(result3.isEmpty());
    }

    // === EDGE CASES ===

    @Test
    void testDoRetrieveByKey_EmptyUsername_HandledCorrectly() throws SQLException {
        // Arrange
        String username = "";

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeQuery()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(false);

        // Act
        utenteBean result = utenteDao.doRetrieveByKey(username);

        // Assert
        assertNull(result);
        verify(mockPreparedStatement).setString(1, "");
    }

    @Test
    void testDoRetrieveByEmail_NullFieldsFromDB_HandledCorrectly() throws SQLException {
        // Arrange
        String email = "test@test.com";


        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeQuery()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(true, false);

        when(mockResultSet.getString("Username")).thenReturn("testuser");
        when(mockResultSet.getString("Password")).thenReturn(""); // cambiare da null a stringa vuota
        when(mockResultSet.getString("Cognome")).thenReturn(null);
        when(mockResultSet.getString("Nome")).thenReturn(null);
        when(mockResultSet.getString("Email")).thenReturn(email);
        when(mockResultSet.getString("Tipo")).thenReturn("cliente");
        when(mockResultSet.getString("via")).thenReturn(null);
        when(mockResultSet.getString("Citta")).thenReturn(null);
        when(mockResultSet.getString("provincia")).thenReturn(null);
        when(mockResultSet.getString("telefono")).thenReturn(null);
        when(mockResultSet.getString("cap")).thenReturn(null);

        // Act
        utenteBean result = utenteDao.doRetrieveByEmail(email);

        // Assert
        assertNotNull(result);
        assertEquals("testuser", result.getUsername());
        assertNull(result.getCognome());
        assertNull(result.getNome());
        assertEquals(email, result.getEmail());
    }

    @Test
    void testDoSave_NullOptionalFields_SavesCorrectly() throws SQLException {
        // Arrange
        utenteBean client = createValidUtenteBean();
        client.setVia(null);
        client.setCitta(null);
        client.setProvincia(null);
        client.setTelefono(null);
        client.setCap(null);

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeUpdate()).thenReturn(1);

        // Act
        int result = utenteDao.doSave(client);

        // Assert
        assertEquals(1, result);
        verify(mockPreparedStatement).setString(7, null);
        verify(mockPreparedStatement).setString(8, null);
        verify(mockPreparedStatement).setString(9, null);
        verify(mockPreparedStatement).setString(10, null);
        verify(mockPreparedStatement).setString(11, null);
    }

    @Test
    void testDoModify_NullOptionalFields_UpdatesCorrectly() throws SQLException {
        // Arrange
        utenteBean client = createValidUtenteBean();
        client.setVia(null);
        client.setCitta(null);
        client.setProvincia(null);
        client.setTelefono(null);
        client.setCap(null);

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeUpdate()).thenReturn(1);

        // Act
        int result = utenteDao.doModify(client);

        // Assert
        assertEquals(1, result);
        verify(mockPreparedStatement).setString(4, null);
        verify(mockPreparedStatement).setString(5, null);
        verify(mockPreparedStatement).setString(6, null);
        verify(mockPreparedStatement).setString(7, null);
        verify(mockPreparedStatement).setString(8, null);
    }
}

