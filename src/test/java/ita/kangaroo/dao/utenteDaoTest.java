package ita.kangaroo.dao;

import ita.kangaroo.model.ProdottoBean;
import ita.kangaroo.model.tipo;
import ita.kangaroo.model.utenteBean;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import javax.sql.DataSource;
import java.lang.reflect.Field;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.*;
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
    private String sha1(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-1");
            byte[] hash = md. digest(input.getBytes());
            StringBuilder hexString = new StringBuilder();
            for (byte b : hash) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) {
                    hexString.append('0');
                }
                hexString.append(hex);
            }
            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
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
        when(mockResultSet. getString("Password")).thenReturn("password123"); // ← Cambiato da hash hardcoded
        when(mockResultSet.getString("Cognome")).thenReturn("Rossi");
        when(mockResultSet. getString("Nome")).thenReturn("Mario");
        when(mockResultSet. getString("Email")).thenReturn("mario.rossi@test.com");
        when(mockResultSet. getString("Tipo")).thenReturn("cliente");
        when(mockResultSet. getString("via")).thenReturn("Via Roma 123");
        when(mockResultSet.getString("Citta")).thenReturn("Milano");
        when(mockResultSet.getString("provincia")).thenReturn("MI");
        when(mockResultSet. getString("telefono")).thenReturn("0212345678");
        when(mockResultSet.getString("cap")).thenReturn("20100");
    }

    /**
     * Helper method to verify ALL fields of a utenteBean are properly set.
     * This is crucial for achieving high mutation coverage by killing SURVIVED mutations.
     */
    private void assertCompleteUtenteBean(utenteBean utente, String expectedUsername,
                                          String expectedPassword, String expectedCognome,
                                          String expectedNome, String expectedEmail,
                                          tipo expectedTipo, String expectedVia,
                                          String expectedCitta, String expectedProvincia,
                                          String expectedTelefono, String expectedCap) {
        assertEquals(expectedUsername, utente.getUsername(), "Username mismatch");
        assertEquals(expectedPassword, utente.getPassword(), "Password mismatch"); // ← CRITICO per SURVIVED
        assertEquals(expectedCognome, utente.getCognome(), "Cognome mismatch");
        assertEquals(expectedNome, utente.getNome(), "Nome mismatch");
        assertEquals(expectedEmail, utente.getEmail(), "Email mismatch");
        assertEquals(expectedTipo, utente.getTipo(), "Tipo mismatch");
        assertEquals(expectedVia, utente.getVia(), "Via mismatch");               // ← CRITICO per SURVIVED
        assertEquals(expectedCitta, utente.getCitta(), "Citta mismatch");         // ← CRITICO per SURVIVED
        assertEquals(expectedProvincia, utente.getProvincia(), "Provincia mismatch"); // ← CRITICO per SURVIVED
        assertEquals(expectedTelefono, utente.getTelefono(), "Telefono mismatch");     // ← CRITICO per SURVIVED
        assertEquals(expectedCap, utente.getCap(), "Cap mismatch");               // ← CRITICO per SURVIVED
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

        // Assert - Usa sha1() dinamico
        assertNotNull(result);
        assertCompleteUtenteBean(result, "testuser", sha1("password123"), "Rossi", "Mario",
                "mario.rossi@test.com", tipo.cliente, "Via Roma 123",
                "Milano", "MI", "0212345678", "20100");

        verify(mockPreparedStatement).setString(1, email);
        verify(mockPreparedStatement).setString(2, password); // ← Il DAO passa la password in chiaro
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

        // Assert - Email corretta senza spazi
        assertNotNull(result);
        assertCompleteUtenteBean(result, "testuser", sha1("password123"), "Rossi", "Mario",
                "mario.rossi@test.com", tipo.cliente, "Via Roma 123", // ← Email senza spazi
                "Milano", "MI", "0212345678", "20100");

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

        // Assert - Usa sha1() dinamico
        assertNotNull(result);
        assertCompleteUtenteBean(result, "testuser", sha1("password123"), "Rossi", "Mario", // ← Cambiato
                "mario.rossi@test.com", tipo.cliente, "Via Roma 123",
                "Milano", "MI", "0212345678", "20100");

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
        when(mockResultSet.getString("Email")).thenReturn("mario@test.com", "luigi@test.com"); // ← Rimuovi spazi
        when(mockResultSet.getString("Tipo")).thenReturn("cliente", "admin");
        when(mockResultSet.getString("via")).thenReturn("Via Roma 1", "Via Milano 2");
        when(mockResultSet.getString("Citta")).thenReturn("Milano", "Roma");
        when(mockResultSet.getString("provincia")).thenReturn("MI", "RM");
        when(mockResultSet.getString("telefono")).thenReturn("0212345678", "0698765432");
        when(mockResultSet.getString("cap")).thenReturn("20100", "00100");

        // Act
        ArrayList<utenteBean> result = utenteDao.doRetrieveAll();

        // Assert - Email corrette senza spazi
        assertNotNull(result);
        assertEquals(2, result.size());

        // Verify first user completely
        assertCompleteUtenteBean(result.get(0), "user1", sha1("hash1"), "Rossi", "Mario",
                "mario@test.com", tipo.cliente, "Via Roma 1", // ← Email senza spazi
                "Milano", "MI", "0212345678", "20100");

        // Verify second user completely
        assertCompleteUtenteBean(result.get(1), "user2", sha1("hash2"), "Verdi", "Luigi",
                "luigi@test.com", tipo.admin, "Via Milano 2", // ← Email senza spazi
                "Roma", "RM", "0698765432", "00100");
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
    @Test
    void testDoSave_ConnectionCloseException_HandledCorrectly() throws SQLException {
        // Test per coprire il mutante SURVIVED alla riga 103
        utenteBean client = createValidUtenteBean();

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeUpdate()).thenReturn(1);

        // Simulate exception on connection close
        doThrow(new SQLException("Connection close failed")).when(mockConnection).close();

        // L'eccezione durante la chiusura viene propagata
        SQLException exception = assertThrows(SQLException.class, () -> utenteDao.doSave(client));
        assertEquals("Connection close failed", exception.getMessage());

        verify(mockConnection).close(); // Verify close was attempted
    }


}

