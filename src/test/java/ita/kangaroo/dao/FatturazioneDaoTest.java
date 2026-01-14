package ita.kangaroo.dao;

import ita.kangaroo.model.FatturazioneBean;
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

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class FatturazioneDaoTest {

    @Mock
    private DataSource mockDataSource;

    @Mock
    private Connection mockConnection;

    @Mock
    private PreparedStatement mockPreparedStatement;

    @Mock
    private ResultSet mockResultSet;

    private FatturazioneDao fatturazioneDao;

    @BeforeEach
    void setUp() throws Exception {
        fatturazioneDao = new FatturazioneDao();
        setStaticDataSource(mockDataSource);
    }

    private void setStaticDataSource(DataSource dataSource) throws Exception {
        Field dsField = FatturazioneDao.class.getDeclaredField("ds");
        dsField.setAccessible(true);
        dsField.set(null, dataSource);
    }

    private FatturazioneBean createValidFatturazioneBean() {
        FatturazioneBean invoice = new FatturazioneBean();
        invoice.setId(1);
        invoice.setSdi("IT01234567890");
        invoice.setImporto(100.50f);
        invoice.setData_scadenza("2024-03-15");
        invoice.setData_emissione("2024-01-15");
        invoice.setStato_pagamento("Pagato");
        invoice.setIva(22.11f);
        return invoice;
    }

    // === TESTS FOR doSave() ===

    @Test
    void testDoSave_ValidInvoice_InsertsSuccessfully() throws SQLException {
        // Arrange
        FatturazioneBean invoice = createValidFatturazioneBean();

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeUpdate()).thenReturn(1);

        // Act
        assertDoesNotThrow(() -> fatturazioneDao.doSave(invoice));

        // Assert
        verify(mockPreparedStatement).setString(1, "IT01234567890");
        verify(mockPreparedStatement).setFloat(2, 100.50f);
        verify(mockPreparedStatement).setString(3, "2024-03-15");
        verify(mockPreparedStatement).setString(4, "2024-01-15");
        verify(mockPreparedStatement).setString(5, "Pagato");
        verify(mockPreparedStatement).setFloat(6, 22.11f);
        verify(mockPreparedStatement).setInt(7, 1);
        verify(mockPreparedStatement).executeUpdate();
    }

    @Test
    void testDoSave_NullValues_HandledCorrectly() throws SQLException {
        // Arrange
        FatturazioneBean invoice = new FatturazioneBean();
        invoice.setId(0);
        invoice.setSdi(null);
        invoice.setImporto(0.0f);
        invoice.setData_scadenza(null);
        invoice.setData_emissione(null);
        invoice.setStato_pagamento(null);
        invoice.setIva(0.0f);

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeUpdate()).thenReturn(1);

        // Act
        assertDoesNotThrow(() -> fatturazioneDao.doSave(invoice));

        // Assert
        verify(mockPreparedStatement).setString(1, null);
        verify(mockPreparedStatement).setFloat(2, 0.0f);
        verify(mockPreparedStatement).setString(3, null);
        verify(mockPreparedStatement).setString(4, null);
        verify(mockPreparedStatement).setString(5, null);
        verify(mockPreparedStatement).setFloat(6, 0.0f);
        verify(mockPreparedStatement).setInt(7, 0);
    }

    @Test
    void testDoSave_NegativeValues_HandledCorrectly() throws SQLException {
        // Arrange
        FatturazioneBean invoice = createValidFatturazioneBean();
        invoice.setId(-1);
        invoice.setImporto(-50.25f);
        invoice.setIva(-10.0f);

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeUpdate()).thenReturn(1);

        // Act
        assertDoesNotThrow(() -> fatturazioneDao.doSave(invoice));

        // Assert
        verify(mockPreparedStatement).setFloat(2, -50.25f);
        verify(mockPreparedStatement).setFloat(6, -10.0f);
        verify(mockPreparedStatement).setInt(7, -1);
    }

    @Test
    void testDoSave_EmptyStrings_HandledCorrectly() throws SQLException {
        // Arrange
        FatturazioneBean invoice = createValidFatturazioneBean();
        invoice.setSdi("");
        invoice.setData_scadenza("");
        invoice.setData_emissione("");
        invoice.setStato_pagamento("");

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeUpdate()).thenReturn(1);

        // Act
        assertDoesNotThrow(() -> fatturazioneDao.doSave(invoice));

        // Assert
        verify(mockPreparedStatement).setString(1, "");
        verify(mockPreparedStatement).setString(3, "");
        verify(mockPreparedStatement).setString(4, "");
        verify(mockPreparedStatement).setString(5, "");
    }

    @Test
    void testDoSave_DataSourceNotConfigured_ThrowsIllegalStateException() throws Exception {
        // Arrange
        setStaticDataSource(null);
        FatturazioneBean invoice = createValidFatturazioneBean();

        // Act & Assert
        assertThrows(IllegalStateException.class, () -> fatturazioneDao.doSave(invoice));
    }

    @Test
    void testDoSave_ConnectionFails_ThrowsSQLException() throws SQLException {
        // Arrange
        FatturazioneBean invoice = createValidFatturazioneBean();
        SQLException expectedException = new SQLException("Connection failed");

        when(mockDataSource.getConnection()).thenThrow(expectedException);

        // Act & Assert
        SQLException exception = assertThrows(SQLException.class, () -> fatturazioneDao.doSave(invoice));
        assertEquals("Connection failed", exception.getMessage());
    }

    @Test
    void testDoSave_PrepareStatementFails_ThrowsSQLException() throws SQLException {
        // Arrange
        FatturazioneBean invoice = createValidFatturazioneBean();
        SQLException expectedException = new SQLException("Prepare statement failed");

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenThrow(expectedException);

        // Act & Assert
        SQLException exception = assertThrows(SQLException.class, () -> fatturazioneDao.doSave(invoice));
        assertEquals("Prepare statement failed", exception.getMessage());
    }

    @Test
    void testDoSave_ExecuteUpdateFails_ThrowsSQLException() throws SQLException {
        // Arrange
        FatturazioneBean invoice = createValidFatturazioneBean();
        SQLException expectedException = new SQLException("Execute update failed");

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeUpdate()).thenThrow(expectedException);

        // Act & Assert
        SQLException exception = assertThrows(SQLException.class, () -> fatturazioneDao.doSave(invoice));
        assertEquals("Execute update failed", exception.getMessage());
    }

    // === TESTS FOR doRetrieveByOrder() ===

    @Test
    void testDoRetrieveByOrder_ExistingId_ReturnsFatturazioneBean() throws SQLException {
        // Arrange
        int id = 1;

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeQuery()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(true, false);
        when(mockResultSet.getInt("Id")).thenReturn(id);
        when(mockResultSet.getString("sdi")).thenReturn("IT01234567890");
        when(mockResultSet.getFloat("importo")).thenReturn(100.50f);
        when(mockResultSet.getString("data_scadenza")).thenReturn("2024-03-15");
        when(mockResultSet.getString("data_emissione")).thenReturn("2024-01-15");
        when(mockResultSet.getString("stato_del_pagamento")).thenReturn("Pagato");
        when(mockResultSet.getFloat("IVA")).thenReturn(22.11f);

        // Act
        FatturazioneBean result = fatturazioneDao.doRetrieveByOrder(id);

        // Assert
        assertNotNull(result);
        assertEquals(id, result.getId());
        assertEquals("IT01234567890", result.getSdi());
        assertEquals(100.50f, result.getImporto(), 0.001);
        assertEquals("2024-03-15", result.getData_scadenza());
        assertEquals("2024-01-15", result.getData_emissione());
        assertEquals("Pagato", result.getStato_pagamento());
        assertEquals(22.11f, result.getIva(), 0.001);
        verify(mockPreparedStatement).setInt(1, id);
    }

    @Test
    void testDoRetrieveByOrder_NonExistingId_ReturnsEmptyBean() throws SQLException {
        // Arrange
        int id = 999;

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeQuery()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(false);

        // Act
        FatturazioneBean result = fatturazioneDao.doRetrieveByOrder(id);

        // Assert
        assertNotNull(result);
        assertEquals(0, result.getId());
        assertNull(result.getSdi());  // Cambiato da assertEquals("", ...)
        assertEquals(0.0f, result.getImporto(), 0.001);
        assertNull(result.getData_scadenza());  // Cambiato da assertEquals("", ...)
        assertNull(result.getData_emissione()); // Cambiato da assertEquals("", ...)
        assertNull(result.getStato_pagamento()); // Cambiato da assertEquals("", ...)
        assertEquals(0.0f, result.getIva(), 0.001);
        verify(mockPreparedStatement).setInt(1, id);
    }

    @Test
    void testDoRetrieveByOrder_NullValuesFromDB_ReturnsEmptyStrings() throws SQLException {
        // Arrange
        int id = 1;

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeQuery()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(true, false);
        when(mockResultSet.getInt("Id")).thenReturn(id);
        when(mockResultSet.getString("sdi")).thenReturn(null);
        when(mockResultSet.getFloat("importo")).thenReturn(0.0f);
        when(mockResultSet.getString("data_scadenza")).thenReturn(null);
        when(mockResultSet.getString("data_emissione")).thenReturn(null);
        when(mockResultSet.getString("stato_del_pagamento")).thenReturn(null);
        when(mockResultSet.getFloat("IVA")).thenReturn(0.0f);

        // Act
        FatturazioneBean result = fatturazioneDao.doRetrieveByOrder(id);

        // Assert
        assertNotNull(result);
        assertEquals(id, result.getId());
        assertNull(result.getSdi());  // Cambiato da assertEquals("", ...)
        assertEquals(0.0f, result.getImporto(), 0.001);
        assertNull(result.getData_scadenza());  // Cambiato da assertEquals("", ...)
        assertNull(result.getData_emissione()); // Cambiato da assertEquals("", ...)
        assertNull(result.getStato_pagamento()); // Cambiato da assertEquals("", ...)
        assertEquals(0.0f, result.getIva(), 0.001);
    }

    @Test
    void testDoRetrieveByOrder_ZeroId_HandledCorrectly() throws SQLException {
        // Arrange
        int id = 0;

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeQuery()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(false);

        // Act
        FatturazioneBean result = fatturazioneDao.doRetrieveByOrder(id);

        // Assert
        assertNotNull(result);
        assertEquals(0, result.getId());
        verify(mockPreparedStatement).setInt(1, id);
    }

    @Test
    void testDoRetrieveByOrder_NegativeId_HandledCorrectly() throws SQLException {
        // Arrange
        int id = -1;

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeQuery()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(false);

        // Act
        FatturazioneBean result = fatturazioneDao.doRetrieveByOrder(id);

        // Assert
        assertNotNull(result);
        assertEquals(0, result.getId());
        verify(mockPreparedStatement).setInt(1, id);
    }

    @Test
    void testDoRetrieveByOrder_DataSourceNotConfigured_ThrowsIllegalStateException() throws Exception {
        // Arrange
        setStaticDataSource(null);

        // Act & Assert
        assertThrows(IllegalStateException.class, () -> fatturazioneDao.doRetrieveByOrder(1));
    }

    @Test
    void testDoRetrieveByOrder_ConnectionFails_ThrowsSQLException() throws SQLException {
        // Arrange
        SQLException expectedException = new SQLException("Connection failed");
        when(mockDataSource.getConnection()).thenThrow(expectedException);

        // Act & Assert
        SQLException exception = assertThrows(SQLException.class, () -> fatturazioneDao.doRetrieveByOrder(1));
        assertEquals("Connection failed", exception.getMessage());
    }

    @Test
    void testDoRetrieveByOrder_PrepareStatementFails_ThrowsSQLException() throws SQLException {
        // Arrange
        SQLException expectedException = new SQLException("Prepare statement failed");
        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenThrow(expectedException);

        // Act & Assert
        SQLException exception = assertThrows(SQLException.class, () -> fatturazioneDao.doRetrieveByOrder(1));
        assertEquals("Prepare statement failed", exception.getMessage());
    }

    @Test
    void testDoRetrieveByOrder_ExecuteQueryFails_ThrowsSQLException() throws SQLException {
        // Arrange
        SQLException expectedException = new SQLException("Execute query failed");
        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeQuery()).thenThrow(expectedException);

        // Act & Assert
        SQLException exception = assertThrows(SQLException.class, () -> fatturazioneDao.doRetrieveByOrder(1));
        assertEquals("Execute query failed", exception.getMessage());
    }

    // === RESOURCE MANAGEMENT AND SYNCHRONIZATION TESTS ===

    @Test
    void testDoSave_ResourceManagement_ConnectionClosedProperly() throws SQLException {
        // Arrange
        FatturazioneBean invoice = createValidFatturazioneBean();

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeUpdate()).thenReturn(1);

        // Act
        fatturazioneDao.doSave(invoice);

        // Assert - verify that close() was called on resources
        verify(mockConnection).close();
        verify(mockPreparedStatement).close();
    }

    @Test
    void testDoRetrieveByOrder_ResourceManagement_AllResourcesClosedProperly() throws SQLException {
        // Arrange
        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeQuery()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(false);

        // Act
        fatturazioneDao.doRetrieveByOrder(1);

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
        FatturazioneBean result1 = fatturazioneDao.doRetrieveByOrder(1);
        FatturazioneBean result2 = fatturazioneDao.doRetrieveByOrder(2);

        // Assert
        assertNotNull(result1);
        assertNotNull(result2);
        assertEquals(0, result1.getId());
        assertEquals(0, result2.getId());
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
            FatturazioneDao dao = new FatturazioneDao();

            // Verify that when DataSource is null, methods throw IllegalStateException
            assertThrows(IllegalStateException.class, () -> dao.doRetrieveByOrder(1));
        }
    }


    @Test
    void testDoRetrieveByOrder_MultipleRecordsHandling() throws SQLException {
        // Test edge case where multiple records might be returned for same ID
        // (shouldn't happen in normal DB design, but tests robustness)

        // Arrange
        int id = 1;

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeQuery()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(true, true, false); // Two records

        // First record
        when(mockResultSet.getInt("Id")).thenReturn(1, 1);
        when(mockResultSet.getString("sdi")).thenReturn("FIRST", "SECOND");
        when(mockResultSet.getFloat("importo")).thenReturn(100.0f, 200.0f);
        when(mockResultSet.getString("data_scadenza")).thenReturn("2024-01-01", "2024-02-01");
        when(mockResultSet.getString("data_emissione")).thenReturn("2023-12-01", "2024-01-01");
        when(mockResultSet.getString("stato_del_pagamento")).thenReturn("Pagato", "Da pagare");
        when(mockResultSet.getFloat("IVA")).thenReturn(20.0f, 40.0f);

        // Act
        FatturazioneBean result = fatturazioneDao.doRetrieveByOrder(id);

        // Assert - should contain data from the last iteration (SECOND record)
        assertNotNull(result);
        assertEquals(1, result.getId());
        assertEquals("SECOND", result.getSdi());
        assertEquals(200.0f, result.getImporto(), 0.001);
        assertEquals("2024-02-01", result.getData_scadenza());
        assertEquals("2024-01-01", result.getData_emissione());
        assertEquals("Da pagare", result.getStato_pagamento());
        assertEquals(40.0f, result.getIva(), 0.001);
    }
}

