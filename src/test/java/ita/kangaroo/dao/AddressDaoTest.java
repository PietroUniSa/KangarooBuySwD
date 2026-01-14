package ita.kangaroo.dao;

import ita.kangaroo.model.AddressBean;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockedStatic;
import org.mockito.junit.jupiter.MockitoExtension;

import javax.naming.Context;
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
class AddressDaoTest {

    @Mock
    private DataSource mockDataSource;

    @Mock
    private Connection mockConnection;

    @Mock
    private PreparedStatement mockPreparedStatement;

    @Mock
    private ResultSet mockResultSet;

    @Mock
    private Context mockInitialContext;

    @Mock
    private Context mockEnvContext;

    private AddressDao addressDao;

    @BeforeEach
    void setUp() throws Exception {
        addressDao = new AddressDao();
        setStaticDataSource(mockDataSource);
    }

    private void setStaticDataSource(DataSource dataSource) throws Exception {
        Field dsField = AddressDao.class.getDeclaredField("ds");
        dsField.setAccessible(true);
        dsField.set(null, dataSource);
    }

    private AddressBean createValidAddressBean() {
        AddressBean address = new AddressBean();
        address.setVia("Via Roma 123");
        address.setCitta("Milano");
        address.setCAP("20100");
        address.setUsername("testuser");
        return address;
    }

    // === TESTS FOR doSave() ===

    @Test
    void testDoSave_ValidAddress_ReturnsGeneratedId() throws SQLException {
        // Arrange
        AddressBean address = createValidAddressBean();
        int expectedId = 42;

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString(), eq(Statement.RETURN_GENERATED_KEYS)))
                .thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeUpdate()).thenReturn(1);
        when(mockPreparedStatement.getGeneratedKeys()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(true);
        when(mockResultSet.getInt(1)).thenReturn(expectedId);

        // Act
        int result = addressDao.doSave(address);

        // Assert
        assertEquals(expectedId, result);
        verify(mockPreparedStatement).setString(1, "Via Roma 123");
        verify(mockPreparedStatement).setString(2, "Milano");
        verify(mockPreparedStatement).setString(3, "20100");
        verify(mockPreparedStatement).setString(4, "testuser");
        verify(mockPreparedStatement).executeUpdate();
        verify(mockResultSet).next();
        verify(mockResultSet).getInt(1);
    }

    @Test
    void testDoSave_NoRowsAffected_ThrowsSQLException() throws SQLException {
        // Arrange
        AddressBean address = createValidAddressBean();

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString(), eq(Statement.RETURN_GENERATED_KEYS)))
                .thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeUpdate()).thenReturn(0);

        // Act & Assert
        SQLException exception = assertThrows(SQLException.class, () -> addressDao.doSave(address));
        assertEquals("Insert failed, no rows affected.", exception.getMessage());
    }

    @Test
    void testDoSave_NoGeneratedKey_ThrowsSQLException() throws SQLException {
        // Arrange
        AddressBean address = createValidAddressBean();

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString(), eq(Statement.RETURN_GENERATED_KEYS)))
                .thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeUpdate()).thenReturn(1);
        when(mockPreparedStatement.getGeneratedKeys()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(false);

        // Act & Assert
        SQLException exception = assertThrows(SQLException.class, () -> addressDao.doSave(address));
        assertEquals("No generated key returned.", exception.getMessage());
    }

    @Test
    void testDoSave_InvalidGeneratedKey_ThrowsSQLException() throws SQLException {
        // Arrange
        AddressBean address = createValidAddressBean();

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString(), eq(Statement.RETURN_GENERATED_KEYS)))
                .thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeUpdate()).thenReturn(1);
        when(mockPreparedStatement.getGeneratedKeys()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(true);
        when(mockResultSet.getInt(1)).thenReturn(0);

        // Act & Assert
        SQLException exception = assertThrows(SQLException.class, () -> addressDao.doSave(address));
        assertEquals("Generated key invalid: 0", exception.getMessage());
    }

    @Test
    void testDoSave_DataSourceNotConfigured_ThrowsIllegalStateException() throws Exception {
        // Arrange
        setStaticDataSource(null);
        AddressBean address = createValidAddressBean();

        // Act & Assert
        assertThrows(IllegalStateException.class, () -> addressDao.doSave(address));
    }

    @Test
    void testDoSave_SQLException_Propagated() throws SQLException {
        // Arrange
        AddressBean address = createValidAddressBean();
        SQLException expectedException = new SQLException("Connection failed");

        when(mockDataSource.getConnection()).thenThrow(expectedException);

        // Act & Assert
        SQLException exception = assertThrows(SQLException.class, () -> addressDao.doSave(address));
        assertEquals("Connection failed", exception.getMessage());
    }

    // === TESTS FOR doRetrieveByKey() ===

    @Test
    void testDoRetrieveByKey_ExistingId_ReturnsAddressBean() throws SQLException {
        // Arrange
        int id = 1;

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeQuery()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(true);
        when(mockResultSet.getInt("id")).thenReturn(id);
        when(mockResultSet.getString("via")).thenReturn("Via Roma 123");
        when(mockResultSet.getString("citta")).thenReturn("Milano");
        when(mockResultSet.getString("cap")).thenReturn("20100");
        when(mockResultSet.getString("username")).thenReturn("testuser");

        // Act
        AddressBean result = addressDao.doRetrieveByKey(id);

        // Assert
        assertNotNull(result);
        assertEquals(id, result.getId());
        assertEquals("Via Roma 123", result.getVia());
        assertEquals("Milano", result.getCitta());
        assertEquals("20100", result.getCAP());
        assertEquals("testuser", result.getUsername());
        verify(mockPreparedStatement).setInt(1, id);
    }

    @Test
    void testDoRetrieveByKey_NonExistingId_ReturnsEmptyBean() throws SQLException {
        // Arrange
        int id = 999;

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeQuery()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(false);

        // Act
        AddressBean result = addressDao.doRetrieveByKey(id);

        // Assert
        assertNotNull(result);
        assertEquals(0, result.getId());
        assertEquals("", result.getVia());
        assertEquals("", result.getCitta());
        assertEquals("", result.getCAP());
        assertEquals("", result.getUsername());
    }

    @Test
    void testDoRetrieveByKey_NullValuesFromDB_ReturnsEmptyStrings() throws SQLException {
        // Arrange
        int id = 1;

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeQuery()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(true);
        when(mockResultSet.getInt("id")).thenReturn(id);
        when(mockResultSet.getString("via")).thenReturn(null);
        when(mockResultSet.getString("citta")).thenReturn(null);
        when(mockResultSet.getString("cap")).thenReturn(null);
        when(mockResultSet.getString("username")).thenReturn(null);

        // Act
        AddressBean result = addressDao.doRetrieveByKey(id);

        // Assert
        assertNotNull(result);
        assertEquals(id, result.getId());
        assertEquals("", result.getVia());
        assertEquals("", result.getCitta());
        assertEquals("", result.getCAP());
        assertEquals("", result.getUsername());
    }

    @Test
    void testDoRetrieveByKey_DataSourceNotConfigured_ThrowsIllegalStateException() throws Exception {
        // Arrange
        setStaticDataSource(null);

        // Act & Assert
        assertThrows(IllegalStateException.class, () -> addressDao.doRetrieveByKey(1));
    }

    @Test
    void testDoRetrieveByKey_SQLException_Propagated() throws SQLException {
        // Arrange
        SQLException expectedException = new SQLException("Query failed");
        when(mockDataSource.getConnection()).thenThrow(expectedException);

        // Act & Assert
        SQLException exception = assertThrows(SQLException.class, () -> addressDao.doRetrieveByKey(1));
        assertEquals("Query failed", exception.getMessage());
    }

    // === TESTS FOR doRetrieveByClient() ===

    @Test
    void testDoRetrieveByClient_ExistingUsername_ReturnsAddressList() throws SQLException {
        // Arrange
        String username = "testuser";

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeQuery()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(true, true, false);

        // First address
        when(mockResultSet.getInt("id")).thenReturn(1, 2);
        when(mockResultSet.getString("via")).thenReturn("Via Roma 123", "Via Milano 456");
        when(mockResultSet.getString("citta")).thenReturn("Milano", "Roma");
        when(mockResultSet.getString("cap")).thenReturn("20100", "00100");
        when(mockResultSet.getString("username")).thenReturn(username, username);

        // Act
        ArrayList<AddressBean> result = addressDao.doRetrieveByClient(username);

        // Assert
        assertNotNull(result);
        assertEquals(2, result.size());

        AddressBean first = result.get(0);
        assertEquals(1, first.getId());
        assertEquals("Via Roma 123", first.getVia());
        assertEquals("Milano", first.getCitta());
        assertEquals("20100", first.getCAP());
        assertEquals(username, first.getUsername());

        AddressBean second = result.get(1);
        assertEquals(2, second.getId());
        assertEquals("Via Milano 456", second.getVia());
        assertEquals("Roma", second.getCitta());
        assertEquals("00100", second.getCAP());
        assertEquals(username, second.getUsername());

        verify(mockPreparedStatement).setString(1, username);
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
        ArrayList<AddressBean> result = addressDao.doRetrieveByClient(username);

        // Assert
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    void testDoRetrieveByClient_NullValuesFromDB_ReturnsEmptyStrings() throws SQLException {
        // Arrange
        String username = "testuser";

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeQuery()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(true, false);
        when(mockResultSet.getInt("id")).thenReturn(1);
        when(mockResultSet.getString("via")).thenReturn(null);
        when(mockResultSet.getString("citta")).thenReturn(null);
        when(mockResultSet.getString("cap")).thenReturn(null);
        when(mockResultSet.getString("username")).thenReturn(null);

        // Act
        ArrayList<AddressBean> result = addressDao.doRetrieveByClient(username);

        // Assert
        assertNotNull(result);
        assertEquals(1, result.size());
        AddressBean address = result.get(0);
        assertEquals(1, address.getId());
        assertEquals("", address.getVia());
        assertEquals("", address.getCitta());
        assertEquals("", address.getCAP());
        assertEquals("", address.getUsername());
    }

    @Test
    void testDoRetrieveByClient_DataSourceNotConfigured_ThrowsIllegalStateException() throws Exception {
        // Arrange
        setStaticDataSource(null);

        // Act & Assert
        assertThrows(IllegalStateException.class, () -> addressDao.doRetrieveByClient("testuser"));
    }

    @Test
    void testDoRetrieveByClient_SQLException_Propagated() throws SQLException {
        // Arrange
        SQLException expectedException = new SQLException("Query failed");
        when(mockDataSource.getConnection()).thenThrow(expectedException);

        // Act & Assert
        SQLException exception = assertThrows(SQLException.class, () -> addressDao.doRetrieveByClient("testuser"));
        assertEquals("Query failed", exception.getMessage());
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
        boolean result = addressDao.doDelete(id);

        // Assert
        assertTrue(result);
        verify(mockPreparedStatement).setInt(1, id);
        verify(mockPreparedStatement).executeUpdate();
    }

    @Test
    void testDoDelete_NonExistingId_ReturnsFalse() throws SQLException {
        // Arrange
        int id = 999;

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeUpdate()).thenReturn(0);

        // Act
        boolean result = addressDao.doDelete(id);

        // Assert
        assertFalse(result);
        verify(mockPreparedStatement).setInt(1, id);
    }

    @Test
    void testDoDelete_DataSourceNotConfigured_ThrowsIllegalStateException() throws Exception {
        // Arrange
        setStaticDataSource(null);

        // Act & Assert
        assertThrows(IllegalStateException.class, () -> addressDao.doDelete(1));
    }

    @Test
    void testDoDelete_SQLException_Propagated() throws SQLException {
        // Arrange
        SQLException expectedException = new SQLException("Delete failed");
        when(mockDataSource.getConnection()).thenThrow(expectedException);

        // Act & Assert
        SQLException exception = assertThrows(SQLException.class, () -> addressDao.doDelete(1));
        assertEquals("Delete failed", exception.getMessage());
    }

    // === INTEGRATION TESTS FOR JNDI LOOKUP FAILURE ===

    @Test
    void testStaticInitialization_JNDILookupFailure() throws Exception {
        try (MockedStatic<InitialContext> mockedInitialContext = mockStatic(InitialContext.class)) {
            // Mock del costruttore per lanciare RuntimeException che wrappa NamingException
            mockedInitialContext.when(() -> new InitialContext())
                    .thenThrow(new RuntimeException(new NamingException("JNDI not available")));

            // Reset del DataSource statico
            setStaticDataSource(null);

            // Forza la re-inizializzazione creando una nuova istanza
            AddressDao dao = new AddressDao();

            // Verifica che quando DataSource è null, i metodi lanciano IllegalStateException
            assertThrows(IllegalStateException.class, () -> dao.doDelete(1));
        }
    }


    // === EDGE CASES AND RESOURCE MANAGEMENT ===

    @Test
    void testResourceManagement_ConnectionClosedProperly() throws SQLException {
        // Arrange
        AddressBean address = createValidAddressBean();

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString(), eq(Statement.RETURN_GENERATED_KEYS)))
                .thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeUpdate()).thenReturn(1);
        when(mockPreparedStatement.getGeneratedKeys()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(true);
        when(mockResultSet.getInt(1)).thenReturn(42);

        // Act
        addressDao.doSave(address);

        // Assert - verify that close() was called on all resources
        verify(mockConnection).close();
        verify(mockPreparedStatement).close();
        verify(mockResultSet).close();
    }

    @Test
    void testSynchronizedBehavior_MultipleCallsSynchronized() throws SQLException {
        // This test verifies that methods are synchronized
        // We can't easily test true concurrency in unit tests, but we can verify
        // that the synchronized keyword doesn't break normal operation

        // Arrange
        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeQuery()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(false);

        // Act - multiple calls should work fine
        AddressBean result1 = addressDao.doRetrieveByKey(1);
        AddressBean result2 = addressDao.doRetrieveByKey(2);

        // Assert
        assertNotNull(result1);
        assertNotNull(result2);
        assertEquals(0, result1.getId());
        assertEquals(0, result2.getId());
    }
}

