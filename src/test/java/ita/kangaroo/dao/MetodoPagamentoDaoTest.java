package ita.kangaroo.dao;

import ita.kangaroo.model.MetodoPagamentoBean;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockedStatic;
import org.mockito.junit.jupiter.MockitoExtension;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.lang.reflect.Field;
import java.sql.*;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class MetodoPagamentoDaoTest {

    @Mock
    private DataSource mockDataSource;

    @Mock
    private Connection mockConnection;

    @Mock
    private PreparedStatement mockPreparedStatement;

    @Mock
    private ResultSet mockResultSet;

    private MetodoPagamentoDao metodoPagamentoDao;

    @BeforeEach
    void setUp() throws Exception {
        metodoPagamentoDao = new MetodoPagamentoDao();
        setStaticDataSource(mockDataSource);
    }

    private void setStaticDataSource(DataSource dataSource) throws Exception {
        Field dsField = MetodoPagamentoDao.class.getDeclaredField("ds");
        dsField.setAccessible(true);
        dsField.set(null, dataSource);
    }

    private MetodoPagamentoBean createValidMetodoPagamentoBean() {
        MetodoPagamentoBean bean = new MetodoPagamentoBean();
        bean.setId(1);
        bean.setNumero_carta("1234567890123456");
        bean.setCvv("123");
        bean.setData_scadenza("12/25");
        bean.setCircuito("Visa");
        bean.setUsername("testuser");
        return bean;
    }

    // === TESTS FOR doSave() ===

    @Test
    void testDoSave_ValidBean_ReturnsGeneratedId() throws SQLException {
        // Arrange
        MetodoPagamentoBean bean = createValidMetodoPagamentoBean();
        int expectedId = 42;

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString(), eq(Statement.RETURN_GENERATED_KEYS)))
                .thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeUpdate()).thenReturn(1);
        when(mockPreparedStatement.getGeneratedKeys()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(true);
        when(mockResultSet.getInt(1)).thenReturn(expectedId);

        // Act
        int result = metodoPagamentoDao.doSave(bean);

        // Assert
        assertEquals(expectedId, result);
        verify(mockPreparedStatement).setString(1, "1234567890123456");
        verify(mockPreparedStatement).setString(2, "123");
        verify(mockPreparedStatement).setString(3, "12/25");
        verify(mockPreparedStatement).setString(4, "Visa");
        verify(mockPreparedStatement).setString(5, "testuser");
        verify(mockPreparedStatement).executeUpdate();
    }

    @Test
    void testDoSave_NullCircuito_InsertsSuccessfully() throws SQLException {
        // Arrange
        MetodoPagamentoBean bean = createValidMetodoPagamentoBean();
        bean.setCircuito(null);

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString(), eq(Statement.RETURN_GENERATED_KEYS)))
                .thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeUpdate()).thenReturn(1);
        when(mockPreparedStatement.getGeneratedKeys()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(true);
        when(mockResultSet.getInt(1)).thenReturn(1);

        // Act
        int result = metodoPagamentoDao.doSave(bean);

        // Assert
        assertEquals(1, result);
        verify(mockPreparedStatement).setString(4, null);
    }

    @Test
    void testDoSave_NoRowsAffected_ThrowsSQLException() throws SQLException {
        // Arrange
        MetodoPagamentoBean bean = createValidMetodoPagamentoBean();

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString(), eq(Statement.RETURN_GENERATED_KEYS)))
                .thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeUpdate()).thenReturn(0);

        // Act & Assert
        SQLException exception = assertThrows(SQLException.class, () -> metodoPagamentoDao.doSave(bean));
        assertEquals("Insert failed, no rows affected.", exception.getMessage());
    }

    @Test
    void testDoSave_NoGeneratedKey_ThrowsSQLException() throws SQLException {
        // Arrange
        MetodoPagamentoBean bean = createValidMetodoPagamentoBean();

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString(), eq(Statement.RETURN_GENERATED_KEYS)))
                .thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeUpdate()).thenReturn(1);
        when(mockPreparedStatement.getGeneratedKeys()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(false);

        // Act & Assert
        SQLException exception = assertThrows(SQLException.class, () -> metodoPagamentoDao.doSave(bean));
        assertEquals("Insert succeeded but no generated key returned.", exception.getMessage());
    }

    @Test
    void testDoSave_InvalidGeneratedKey_Zero_ThrowsSQLException() throws SQLException {
        // Arrange
        MetodoPagamentoBean bean = createValidMetodoPagamentoBean();

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString(), eq(Statement.RETURN_GENERATED_KEYS)))
                .thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeUpdate()).thenReturn(1);
        when(mockPreparedStatement.getGeneratedKeys()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(true);
        when(mockResultSet.getInt(1)).thenReturn(0);

        // Act & Assert
        SQLException exception = assertThrows(SQLException.class, () -> metodoPagamentoDao.doSave(bean));
        assertTrue(exception.getMessage().contains("generated key is invalid"));
    }

    @Test
    void testDoSave_InvalidGeneratedKey_Negative_ThrowsSQLException() throws SQLException {
        // Arrange
        MetodoPagamentoBean bean = createValidMetodoPagamentoBean();

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString(), eq(Statement.RETURN_GENERATED_KEYS)))
                .thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeUpdate()).thenReturn(1);
        when(mockPreparedStatement.getGeneratedKeys()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(true);
        when(mockResultSet.getInt(1)).thenReturn(-5);

        // Act & Assert
        SQLException exception = assertThrows(SQLException.class, () -> metodoPagamentoDao.doSave(bean));
        assertTrue(exception.getMessage().contains("generated key is invalid: -5"));
    }

    @Test
    void testDoSave_DataSourceNotConfigured_ThrowsIllegalStateException() throws Exception {
        // Arrange
        setStaticDataSource(null);
        MetodoPagamentoBean bean = createValidMetodoPagamentoBean();

        // Act & Assert
        IllegalStateException exception = assertThrows(IllegalStateException.class,
                () -> metodoPagamentoDao.doSave(bean));
        assertEquals("DataSource not configured", exception.getMessage());
    }

    @Test
    void testDoSave_ConnectionFails_ThrowsSQLException() throws SQLException {
        // Arrange
        MetodoPagamentoBean bean = createValidMetodoPagamentoBean();
        SQLException expectedException = new SQLException("Connection failed");

        when(mockDataSource.getConnection()).thenThrow(expectedException);

        // Act & Assert
        SQLException exception = assertThrows(SQLException.class, () -> metodoPagamentoDao.doSave(bean));
        assertEquals("Connection failed", exception.getMessage());
    }

    @Test
    void testDoSave_ExecuteUpdateFails_ThrowsSQLException() throws SQLException {
        // Arrange
        MetodoPagamentoBean bean = createValidMetodoPagamentoBean();
        SQLException expectedException = new SQLException("Execute update failed");

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString(), eq(Statement.RETURN_GENERATED_KEYS)))
                .thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeUpdate()).thenThrow(expectedException);

        // Act & Assert
        SQLException exception = assertThrows(SQLException.class, () -> metodoPagamentoDao.doSave(bean));
        assertEquals("Execute update failed", exception.getMessage());
    }

    // === TESTS FOR doDelete() ===

    @Test
    void testDoDelete_ExistingId_ReturnsTrue() throws SQLException {
        // Arrange
        int id = 1;

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeUpdate()).thenReturn(1);

        // Act
        boolean result = metodoPagamentoDao.doDelete(id);

        // Assert
        assertTrue(result);
        verify(mockPreparedStatement).setInt(1, id);
        verify(mockPreparedStatement).executeUpdate();
    }

    @Test
    void testDoDelete_MultipleRowsDeleted_ReturnsTrue() throws SQLException {
        // Arrange
        int id = 1;

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeUpdate()).thenReturn(3); // più righe

        // Act
        boolean result = metodoPagamentoDao.doDelete(id);

        // Assert
        assertTrue(result);
    }

    @Test
    void testDoDelete_NonExistingId_ReturnsFalse() throws SQLException {
        // Arrange
        int id = 999;

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeUpdate()).thenReturn(0);

        // Act
        boolean result = metodoPagamentoDao.doDelete(id);

        // Assert
        assertFalse(result);
        verify(mockPreparedStatement).setInt(1, id);
    }

    @Test
    void testDoDelete_ZeroId_HandledCorrectly() throws SQLException {
        // Arrange
        int id = 0;

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeUpdate()).thenReturn(0);

        // Act
        boolean result = metodoPagamentoDao.doDelete(id);

        // Assert
        assertFalse(result);
        verify(mockPreparedStatement).setInt(1, 0);
    }

    @Test
    void testDoDelete_NegativeId_HandledCorrectly() throws SQLException {
        // Arrange
        int id = -1;

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeUpdate()).thenReturn(0);

        // Act
        boolean result = metodoPagamentoDao.doDelete(id);

        // Assert
        assertFalse(result);
        verify(mockPreparedStatement).setInt(1, -1);
    }

    @Test
    void testDoDelete_DataSourceNotConfigured_ThrowsIllegalStateException() throws Exception {
        // Arrange
        setStaticDataSource(null);

        // Act & Assert
        IllegalStateException exception = assertThrows(IllegalStateException.class,
                () -> metodoPagamentoDao.doDelete(1));
        assertEquals("DataSource not configured", exception.getMessage());
    }

    @Test
    void testDoDelete_SQLException_Propagated() throws SQLException {
        // Arrange
        SQLException expectedException = new SQLException("Delete failed");
        when(mockDataSource.getConnection()).thenThrow(expectedException);

        // Act & Assert
        SQLException exception = assertThrows(SQLException.class, () -> metodoPagamentoDao.doDelete(1));
        assertEquals("Delete failed", exception.getMessage());
    }

    // === TESTS FOR doRetrieveByKey() ===

    @Test
    void testDoRetrieveByKey_ExistingId_ReturnsBean() throws SQLException {
        // Arrange
        int id = 1;

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeQuery()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(true, false);
        when(mockResultSet.getInt("id")).thenReturn(id);
        when(mockResultSet.getString("numero_di_carta")).thenReturn("1234567890123456");
        when(mockResultSet.getString("cvv")).thenReturn("123");
        when(mockResultSet.getString("data_scadenza")).thenReturn("12/25");
        when(mockResultSet.getString("circuito")).thenReturn("Visa");
        when(mockResultSet.getString("username")).thenReturn("testuser");

        // Act
        MetodoPagamentoBean result = metodoPagamentoDao.doRetrieveByKey(id);

        // Assert
        assertNotNull(result);
        assertEquals(id, result.getId());
        assertEquals("1234567890123456", result.getNumero_carta());
        assertEquals("123", result.getCvv());
        assertEquals("12/25", result.getData_scadenza());
        assertEquals("Visa", result.getCircuito());
        assertEquals("testuser", result.getUsername());
        verify(mockPreparedStatement).setInt(1, id);
    }

    @Test
    void testDoRetrieveByKey_UsernameColumnVariant_ReturnsBean() throws SQLException {
        // Arrange - Testa il caso dove "username" è null e usa "Username"
        int id = 1;

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeQuery()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(true, false);
        when(mockResultSet.getInt("id")).thenReturn(id);
        when(mockResultSet.getString("numero_di_carta")).thenReturn("1234567890123456");
        when(mockResultSet.getString("cvv")).thenReturn("123");
        when(mockResultSet.getString("data_scadenza")).thenReturn("12/25");
        when(mockResultSet.getString("circuito")).thenReturn("MasterCard");
        when(mockResultSet.getString("username")).thenReturn(null);
        when(mockResultSet.getString("Username")).thenReturn("fallbackuser");

        // Act
        MetodoPagamentoBean result = metodoPagamentoDao.doRetrieveByKey(id);

        // Assert
        assertNotNull(result);
        assertEquals("fallbackuser", result.getUsername());
    }

    @Test
    void testDoRetrieveByKey_NonExistingId_ReturnsEmptyBean() throws SQLException {
        int id = 999;

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeQuery()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(false);

        MetodoPagamentoBean result = metodoPagamentoDao.doRetrieveByKey(id);

        assertNotNull(result);
        assertEquals(0, result.getId());
        assertNull(result.getNumero_carta());
        assertNull(result.getCvv());
        assertNull(result.getData_scadenza());
        assertNull(result.getCircuito());
        assertNull(result.getUsername());
        verify(mockPreparedStatement).setInt(1, id);
    }

    @Test
    void testDoRetrieveByKey_ZeroId_ReturnsEmptyBean() throws SQLException {
        // Arrange
        int id = 0;

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeQuery()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(false);

        // Act
        MetodoPagamentoBean result = metodoPagamentoDao.doRetrieveByKey(id);

        // Assert
        assertNotNull(result);
        assertEquals(0, result.getId());
    }

    @Test
    void testDoRetrieveByKey_DataSourceNotConfigured_ThrowsIllegalStateException() throws Exception {
        // Arrange
        setStaticDataSource(null);

        // Act & Assert
        IllegalStateException exception = assertThrows(IllegalStateException.class,
                () -> metodoPagamentoDao.doRetrieveByKey(1));
        assertEquals("DataSource not configured", exception.getMessage());
    }

    @Test
    void testDoRetrieveByKey_SQLException_Propagated() throws SQLException {
        // Arrange
        SQLException expectedException = new SQLException("Query failed");
        when(mockDataSource.getConnection()).thenThrow(expectedException);

        // Act & Assert
        SQLException exception = assertThrows(SQLException.class, () -> metodoPagamentoDao.doRetrieveByKey(1));
        assertEquals("Query failed", exception.getMessage());
    }

    @Test
    void testDoRetrieveByKey_ExecuteQueryFails_ThrowsSQLException() throws SQLException {
        // Arrange
        SQLException expectedException = new SQLException("Execute query failed");
        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeQuery()).thenThrow(expectedException);

        // Act & Assert
        SQLException exception = assertThrows(SQLException.class, () -> metodoPagamentoDao.doRetrieveByKey(1));
        assertEquals("Execute query failed", exception.getMessage());
    }

    // === TESTS FOR doRetrieveByClient() ===

    @Test
    void testDoRetrieveByClient_ExistingUsername_ReturnsList() throws SQLException {
        // Arrange
        String username = "testuser";

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeQuery()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(true, true, false);

        when(mockResultSet.getInt("id")).thenReturn(1, 2);
        when(mockResultSet.getString("numero_di_carta")).thenReturn("1234567890123456", "9876543210987654");
        when(mockResultSet.getString("cvv")).thenReturn("123", "456");
        when(mockResultSet.getString("data_scadenza")).thenReturn("12/25", "06/26");
        when(mockResultSet.getString("circuito")).thenReturn("Visa", "MasterCard");
        when(mockResultSet.getString("username")).thenReturn(username, username);

        // Act
        ArrayList<MetodoPagamentoBean> result = metodoPagamentoDao.doRetrieveByClient(username);

        // Assert
        assertNotNull(result);
        assertEquals(2, result.size());

        MetodoPagamentoBean first = result.get(0);
        assertEquals(1, first.getId());
        assertEquals("1234567890123456", first.getNumero_carta());
        assertEquals("123", first.getCvv());
        assertEquals("12/25", first.getData_scadenza());
        assertEquals("Visa", first.getCircuito());
        assertEquals(username, first.getUsername());

        MetodoPagamentoBean second = result.get(1);
        assertEquals(2, second.getId());
        assertEquals("9876543210987654", second.getNumero_carta());
        assertEquals("456", second.getCvv());
        assertEquals("06/26", second.getData_scadenza());
        assertEquals("MasterCard", second.getCircuito());
        assertEquals(username, second.getUsername());

        verify(mockPreparedStatement).setString(1, username);
    }

    @Test
    void testDoRetrieveByClient_UsernameColumnVariant_ReturnsList() throws SQLException {
        // Arrange - Testa il caso dove "username" è null e usa "Username"
        String username = "testuser";

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeQuery()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(true, false);
        when(mockResultSet.getInt("id")).thenReturn(1);
        when(mockResultSet.getString("numero_di_carta")).thenReturn("1234567890123456");
        when(mockResultSet.getString("cvv")).thenReturn("123");
        when(mockResultSet.getString("data_scadenza")).thenReturn("12/25");
        when(mockResultSet.getString("circuito")).thenReturn("Visa");
        when(mockResultSet.getString("username")).thenReturn(null);
        when(mockResultSet.getString("Username")).thenReturn("FallbackUser");

        // Act
        ArrayList<MetodoPagamentoBean> result = metodoPagamentoDao.doRetrieveByClient(username);

        // Assert
        assertNotNull(result);
        assertEquals(1, result.size());
        assertEquals("FallbackUser", result.get(0).getUsername());
    }

    @Test
    void testDoRetrieveByClient_NonExistingUsername_ReturnsEmptyList() throws SQLException {
        // Arrange
        String username = "nonexistent";

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeQuery()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(false);

        // Act
        ArrayList<MetodoPagamentoBean> result = metodoPagamentoDao.doRetrieveByClient(username);

        // Assert
        assertNotNull(result);
        assertTrue(result.isEmpty());
        verify(mockPreparedStatement).setString(1, username);
    }

    @Test
    void testDoRetrieveByClient_EmptyUsername_ReturnsEmptyList() throws SQLException {
        // Arrange
        String username = "";

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeQuery()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(false);

        // Act
        ArrayList<MetodoPagamentoBean> result = metodoPagamentoDao.doRetrieveByClient(username);

        // Assert
        assertNotNull(result);
        assertTrue(result.isEmpty());
        verify(mockPreparedStatement).setString(1, "");
    }

    @Test
    void testDoRetrieveByClient_NullUsername_HandledCorrectly() throws SQLException {
        // Arrange
        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeQuery()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(false);

        // Act
        ArrayList<MetodoPagamentoBean> result = metodoPagamentoDao.doRetrieveByClient(null);

        // Assert
        assertNotNull(result);
        assertTrue(result.isEmpty());
        verify(mockPreparedStatement).setString(1, null);
    }

    @Test
    void testDoRetrieveByClient_DataSourceNotConfigured_ThrowsIllegalStateException() throws Exception {
        // Arrange
        setStaticDataSource(null);

        // Act & Assert
        IllegalStateException exception = assertThrows(IllegalStateException.class,
                () -> metodoPagamentoDao.doRetrieveByClient("testuser"));
        assertEquals("DataSource not configured", exception.getMessage());
    }

    @Test
    void testDoRetrieveByClient_SQLException_Propagated() throws SQLException {
        // Arrange
        SQLException expectedException = new SQLException("Query failed");
        when(mockDataSource.getConnection()).thenThrow(expectedException);

        // Act & Assert
        SQLException exception = assertThrows(SQLException.class,
                () -> metodoPagamentoDao.doRetrieveByClient("testuser"));
        assertEquals("Query failed", exception.getMessage());
    }

    @Test
    void testDoRetrieveByClient_ExecuteQueryFails_ThrowsSQLException() throws SQLException {
        // Arrange
        SQLException expectedException = new SQLException("Execute query failed");
        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeQuery()).thenThrow(expectedException);

        // Act & Assert
        SQLException exception = assertThrows(SQLException.class,
                () -> metodoPagamentoDao.doRetrieveByClient("testuser"));
        assertEquals("Execute query failed", exception.getMessage());
    }

    // === RESOURCE MANAGEMENT AND SYNCHRONIZATION TESTS ===

    @Test
    void testDoSave_ResourceManagement_AllResourcesClosed() throws SQLException {
        // Arrange
        MetodoPagamentoBean bean = createValidMetodoPagamentoBean();

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString(), eq(Statement.RETURN_GENERATED_KEYS)))
                .thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeUpdate()).thenReturn(1);
        when(mockPreparedStatement.getGeneratedKeys()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(true);
        when(mockResultSet.getInt(1)).thenReturn(1);

        // Act
        metodoPagamentoDao.doSave(bean);

        // Assert
        verify(mockConnection).close();
        verify(mockPreparedStatement).close();
        verify(mockResultSet).close();
    }

    @Test
    void testDoDelete_ResourceManagement_AllResourcesClosed() throws SQLException {
        // Arrange
        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeUpdate()).thenReturn(1);

        // Act
        metodoPagamentoDao.doDelete(1);

        // Assert
        verify(mockConnection).close();
        verify(mockPreparedStatement).close();
    }

    @Test
    void testDoRetrieveByKey_ResourceManagement_AllResourcesClosed() throws SQLException {
        // Arrange
        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeQuery()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(false);

        // Act
        metodoPagamentoDao.doRetrieveByKey(1);

        // Assert
        verify(mockConnection).close();
        verify(mockPreparedStatement).close();
        verify(mockResultSet).close();
    }

    @Test
    void testDoRetrieveByClient_ResourceManagement_AllResourcesClosed() throws SQLException {
        // Arrange
        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeQuery()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(false);

        // Act
        metodoPagamentoDao.doRetrieveByClient("testuser");

        // Assert
        verify(mockConnection).close();
        verify(mockPreparedStatement).close();
        verify(mockResultSet).close();
    }

    @Test
    void testSynchronizedBehavior_MultipleCalls_WorkCorrectly() throws SQLException {
        // Arrange
        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeQuery()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(false);

        // Act - multiple synchronized calls
        MetodoPagamentoBean result1 = metodoPagamentoDao.doRetrieveByKey(1);
        MetodoPagamentoBean result2 = metodoPagamentoDao.doRetrieveByKey(2);
        ArrayList<MetodoPagamentoBean> result3 = metodoPagamentoDao.doRetrieveByClient("user1");

        // Assert
        assertNotNull(result1);
        assertNotNull(result2);
        assertNotNull(result3);
    }

    @Test
    void testStaticInitialization_JNDILookupFailure() throws Exception {
        // Rimuovi completamente il DataSource per simulare il fallimento JNDI
        setStaticDataSource(null);

        // Il DAO è già stato inizializzato nel setUp(), quindi testa direttamente
        // il comportamento quando DataSource è null
        IllegalStateException exception = assertThrows(IllegalStateException.class,
                () -> metodoPagamentoDao.doRetrieveByKey(1));
        assertEquals("DataSource not configured", exception.getMessage());
    }



}

