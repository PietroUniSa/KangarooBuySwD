package ita.kangaroo.dao;

import ita.kangaroo.model.OrderProductBean;
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
class ComposizioneDaoTest {

    @Mock
    private DataSource mockDataSource;

    @Mock
    private Connection mockConnection;

    @Mock
    private PreparedStatement mockPreparedStatement;

    @Mock
    private ResultSet mockResultSet;

    private ComposizioneDao composizioneDao;

    @BeforeEach
    void setUp() throws Exception {
        composizioneDao = new ComposizioneDao();
        setStaticDataSource(mockDataSource);
    }

    private void setStaticDataSource(DataSource dataSource) throws Exception {
        Field dsField = ComposizioneDao.class.getDeclaredField("ds");
        dsField.setAccessible(true);
        dsField.set(null, dataSource);
    }

    private OrderProductBean createValidOrderProductBean() {
        OrderProductBean product = new OrderProductBean();
        product.setId_ordine(1);
        product.setId_prodotto(10);
        product.setPrezzo(25.99f);
        product.setQuantita(2);
        product.setIVA(5.18f);
        return product;
    }

    // === TESTS FOR doSave() ===

    @Test
    void testDoSave_ValidProduct_InsertsSuccessfully() throws SQLException {
        // Arrange
        OrderProductBean product = createValidOrderProductBean();

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeUpdate()).thenReturn(1);

        // Act
        assertDoesNotThrow(() -> composizioneDao.doSave(product));

        // Assert
        verify(mockPreparedStatement).setInt(1, 1);
        verify(mockPreparedStatement).setInt(2, 10);
        verify(mockPreparedStatement).setFloat(3, 25.99f);
        verify(mockPreparedStatement).setInt(4, 2);
        verify(mockPreparedStatement).setFloat(5, 5.18f);
        verify(mockPreparedStatement).executeUpdate();
    }

    @Test
    void testDoSave_ZeroPrice_InsertsSuccessfully() throws SQLException {
        // Arrange
        OrderProductBean product = createValidOrderProductBean();
        product.setPrezzo(0.0f);

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeUpdate()).thenReturn(1);

        // Act
        assertDoesNotThrow(() -> composizioneDao.doSave(product));

        // Assert
        verify(mockPreparedStatement).setFloat(3, 0.0f);
        verify(mockPreparedStatement).executeUpdate();
    }

    @Test
    void testDoSave_ZeroIVA_InsertsSuccessfully() throws SQLException {
        // Arrange
        OrderProductBean product = createValidOrderProductBean();
        product.setIVA(0.0f);

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeUpdate()).thenReturn(1);

        // Act
        assertDoesNotThrow(() -> composizioneDao.doSave(product));

        // Assert
        verify(mockPreparedStatement).setFloat(5, 0.0f);
        verify(mockPreparedStatement).executeUpdate();
    }

    @Test
    void testDoSave_NoRowsAffected_ThrowsSQLException() throws SQLException {
        // Arrange
        OrderProductBean product = createValidOrderProductBean();

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeUpdate()).thenReturn(0);

        // Act & Assert
        SQLException exception = assertThrows(SQLException.class, () -> composizioneDao.doSave(product));
        assertEquals("Insert failed, no rows affected.", exception.getMessage());
        verify(mockPreparedStatement).executeUpdate();
    }

    @Test
    void testDoSave_DataSourceNotConfigured_ThrowsIllegalStateException() throws Exception {
        // Arrange
        setStaticDataSource(null);
        OrderProductBean product = createValidOrderProductBean();

        // Act & Assert
        assertThrows(IllegalStateException.class, () -> composizioneDao.doSave(product));
    }

    @Test
    void testDoSave_ConnectionFails_ThrowsSQLException() throws SQLException {
        // Arrange
        OrderProductBean product = createValidOrderProductBean();
        SQLException expectedException = new SQLException("Connection failed");

        when(mockDataSource.getConnection()).thenThrow(expectedException);

        // Act & Assert
        SQLException exception = assertThrows(SQLException.class, () -> composizioneDao.doSave(product));
        assertEquals("Connection failed", exception.getMessage());
    }

    @Test
    void testDoSave_PrepareStatementFails_ThrowsSQLException() throws SQLException {
        // Arrange
        OrderProductBean product = createValidOrderProductBean();
        SQLException expectedException = new SQLException("Prepare statement failed");

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenThrow(expectedException);

        // Act & Assert
        SQLException exception = assertThrows(SQLException.class, () -> composizioneDao.doSave(product));
        assertEquals("Prepare statement failed", exception.getMessage());
    }

    @Test
    void testDoSave_ExecuteUpdateFails_ThrowsSQLException() throws SQLException {
        // Arrange
        OrderProductBean product = createValidOrderProductBean();
        SQLException expectedException = new SQLException("Execute update failed");

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeUpdate()).thenThrow(expectedException);

        // Act & Assert
        SQLException exception = assertThrows(SQLException.class, () -> composizioneDao.doSave(product));
        assertEquals("Execute update failed", exception.getMessage());
    }

    // === TESTS FOR doRetrieveByKey() ===

    @Test
    void testDoRetrieveByKey_ExistingOrderId_ReturnsProductList() throws SQLException {
        // Arrange
        int orderId = 1;

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeQuery()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(true, true, false);

        // First product
        when(mockResultSet.getInt("id_ordine")).thenReturn(1, 1);
        when(mockResultSet.getInt("id_prodotto")).thenReturn(10, 11);
        when(mockResultSet.getFloat("prezzo")).thenReturn(25.99f, 15.50f);
        when(mockResultSet.getInt("quantita")).thenReturn(2, 1);
        when(mockResultSet.getFloat("IVA")).thenReturn(5.18f, 3.10f);

        // Act
        ArrayList<OrderProductBean> result = composizioneDao.doRetrieveByKey(orderId);

        // Assert
        assertNotNull(result);
        assertEquals(2, result.size());

        OrderProductBean first = result.get(0);
        assertEquals(1, first.getId_ordine());
        assertEquals(10, first.getId_prodotto());
        assertEquals(25.99f, first.getPrezzo(), 0.001);
        assertEquals(2, first.getQuantita());
        assertEquals(5.18f, first.getIVA(), 0.001);

        OrderProductBean second = result.get(1);
        assertEquals(1, second.getId_ordine());
        assertEquals(11, second.getId_prodotto());
        assertEquals(15.50f, second.getPrezzo(), 0.001);
        assertEquals(1, second.getQuantita());
        assertEquals(3.10f, second.getIVA(), 0.001);

        verify(mockPreparedStatement).setInt(1, orderId);
        verify(mockPreparedStatement).executeQuery();
    }

    @Test
    void testDoRetrieveByKey_NonExistingOrderId_ReturnsEmptyList() throws SQLException {
        // Arrange
        int orderId = 999;

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeQuery()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(false);

        // Act
        ArrayList<OrderProductBean> result = composizioneDao.doRetrieveByKey(orderId);

        // Assert
        assertNotNull(result);
        assertTrue(result.isEmpty());
        verify(mockPreparedStatement).setInt(1, orderId);
        verify(mockPreparedStatement).executeQuery();
    }

    @Test
    void testDoRetrieveByKey_SingleProduct_ReturnsCorrectList() throws SQLException {
        // Arrange
        int orderId = 5;

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeQuery()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(true, false);

        when(mockResultSet.getInt("id_ordine")).thenReturn(5);
        when(mockResultSet.getInt("id_prodotto")).thenReturn(20);
        when(mockResultSet.getFloat("prezzo")).thenReturn(99.99f);
        when(mockResultSet.getInt("quantita")).thenReturn(3);
        when(mockResultSet.getFloat("IVA")).thenReturn(20.00f);

        // Act
        ArrayList<OrderProductBean> result = composizioneDao.doRetrieveByKey(orderId);

        // Assert
        assertNotNull(result);
        assertEquals(1, result.size());

        OrderProductBean product = result.get(0);
        assertEquals(5, product.getId_ordine());
        assertEquals(20, product.getId_prodotto());
        assertEquals(99.99f, product.getPrezzo(), 0.001);
        assertEquals(3, product.getQuantita());
        assertEquals(20.00f, product.getIVA(), 0.001);
    }

    @Test
    void testDoRetrieveByKey_DataSourceNotConfigured_ThrowsIllegalStateException() throws Exception {
        // Arrange
        setStaticDataSource(null);

        // Act & Assert
        assertThrows(IllegalStateException.class, () -> composizioneDao.doRetrieveByKey(1));
    }

    @Test
    void testDoRetrieveByKey_ConnectionFails_ThrowsSQLException() throws SQLException {
        // Arrange
        SQLException expectedException = new SQLException("Connection failed");
        when(mockDataSource.getConnection()).thenThrow(expectedException);

        // Act & Assert
        SQLException exception = assertThrows(SQLException.class, () -> composizioneDao.doRetrieveByKey(1));
        assertEquals("Connection failed", exception.getMessage());
    }

    @Test
    void testDoRetrieveByKey_PrepareStatementFails_ThrowsSQLException() throws SQLException {
        // Arrange
        SQLException expectedException = new SQLException("Prepare statement failed");
        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenThrow(expectedException);

        // Act & Assert
        SQLException exception = assertThrows(SQLException.class, () -> composizioneDao.doRetrieveByKey(1));
        assertEquals("Prepare statement failed", exception.getMessage());
    }

    @Test
    void testDoRetrieveByKey_ExecuteQueryFails_ThrowsSQLException() throws SQLException {
        // Arrange
        SQLException expectedException = new SQLException("Execute query failed");
        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeQuery()).thenThrow(expectedException);

        // Act & Assert
        SQLException exception = assertThrows(SQLException.class, () -> composizioneDao.doRetrieveByKey(1));
        assertEquals("Execute query failed", exception.getMessage());
    }

    // === RESOURCE MANAGEMENT AND SYNCHRONIZATION TESTS ===

    @Test
    void testDoSave_ResourceManagement_ConnectionClosedProperly() throws SQLException {
        // Arrange
        OrderProductBean product = createValidOrderProductBean();

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeUpdate()).thenReturn(1);

        // Act
        composizioneDao.doSave(product);

        // Assert - verify that close() was called on resources
        verify(mockConnection).close();
        verify(mockPreparedStatement).close();
    }

    @Test
    void testDoRetrieveByKey_ResourceManagement_AllResourcesClosedProperly() throws SQLException {
        // Arrange
        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeQuery()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(false);

        // Act
        composizioneDao.doRetrieveByKey(1);

        // Assert - verify that close() was called on all resources
        verify(mockConnection).close();
        verify(mockPreparedStatement).close();
        verify(mockResultSet).close();
    }

    @Test
    void testSynchronizedBehavior_MultipleCallsWork() throws SQLException {
        // This test verifies that synchronized methods don't break normal operation

        // Arrange
        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeQuery()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(false);

        // Act - multiple calls should work fine
        ArrayList<OrderProductBean> result1 = composizioneDao.doRetrieveByKey(1);
        ArrayList<OrderProductBean> result2 = composizioneDao.doRetrieveByKey(2);

        // Assert
        assertNotNull(result1);
        assertNotNull(result2);
        assertTrue(result1.isEmpty());
        assertTrue(result2.isEmpty());
    }

    @Test
    void testDoSave_WithZeroQuantity_HandledCorrectly() throws SQLException {
        // Arrange
        OrderProductBean product = createValidOrderProductBean();
        product.setQuantita(0); // Edge case: zero quantity

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeUpdate()).thenReturn(1);

        // Act & Assert
        assertDoesNotThrow(() -> composizioneDao.doSave(product));
        verify(mockPreparedStatement).setInt(4, 0);
    }

    @Test
    void testDoRetrieveByKey_WithZeroId_HandledCorrectly() throws SQLException {
        // Arrange - testing with id 0 (edge case)
        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeQuery()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(false);

        // Act
        ArrayList<OrderProductBean> result = composizioneDao.doRetrieveByKey(0);

        // Assert
        assertNotNull(result);
        assertTrue(result.isEmpty());
        verify(mockPreparedStatement).setInt(1, 0);
    }

    @Test
    void testStaticInitialization_JNDILookupFailure() throws Exception {
        // Test verifies the static initialization behavior when JNDI lookup fails
        try (MockedStatic<InitialContext> mockedInitialContext = mockStatic(InitialContext.class)) {
            mockedInitialContext.when(() -> new InitialContext())
                    .thenThrow(new RuntimeException(new NamingException("JNDI not available")));

            // Reset the static field to simulate fresh initialization
            setStaticDataSource(null);

            // Force re-initialization by creating a new instance
            ComposizioneDao dao = new ComposizioneDao();

            // Verify that when DataSource is null, methods throw IllegalStateException
            assertThrows(IllegalStateException.class, () -> dao.doRetrieveByKey(1));
        }
    }
}

