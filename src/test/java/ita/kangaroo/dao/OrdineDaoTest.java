package ita.kangaroo.dao;

import ita.kangaroo.model.OrderProductBean;
import ita.kangaroo.model.OrdineBean;
import ita.kangaroo.model.utenteBean;
import org. junit.jupiter.api.BeforeEach;
import org.junit. jupiter.api.Test;
import org. junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockedConstruction;
import org.mockito.MockedStatic;
import org.mockito. junit.jupiter.MockitoExtension;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java. lang.reflect.Field;
import java. sql.*;
import java.util.ArrayList;

import static org.junit.jupiter.api. Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org. mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class OrdineDaoTest {

    @Mock
    private DataSource mockDataSource;

    @Mock
    private Connection mockConnection;

    @Mock
    private PreparedStatement mockPreparedStatement;

    @Mock
    private ResultSet mockResultSet;

    private OrdineDao ordineDao;

    @BeforeEach
    void setUp() throws Exception {
        ordineDao = new OrdineDao();
        setStaticDataSource(mockDataSource);
    }

    private void setStaticDataSource(DataSource dataSource) throws Exception {
        Field dsField = OrdineDao.class.getDeclaredField("ds");
        dsField.setAccessible(true);
        dsField.set(null, dataSource);
    }

    private OrdineBean createValidOrdineBean() {
        utenteBean client = new utenteBean();
        client.setUsername("testuser");
        client.setNome("Test");
        client.setCognome("User");

        ArrayList<OrderProductBean> products = new ArrayList<>();
        OrderProductBean product1 = new OrderProductBean();
        product1.setId_ordine(1);
        product1.setId_prodotto(10);
        product1.setPrezzo(25.99f);
        product1.setQuantita(2);
        product1.setIVA(5.20f);
        products.add(product1);

        OrdineBean order = new OrdineBean(products);
        order.setId(1);
        order.setClient(client);
        order.setPrezzo_totale(51.98f);
        order.setDestinatario("Mario Rossi");
        order.setMetodo_di_pagamento("Carta di credito");
        order.setCircuito("Visa");
        order.setNumero_carta("1234567890123456");
        order.setIndirizzo_di_spedizione("Via Roma 123, Milano");
        order.setNumero_di_tracking("TRK123456789");
        order.setData(Date.valueOf("2024-01-15"));
        order.setMetodo_di_spedizione("Express");

        return order;
    }

    private void setupResultSetForOrder() throws SQLException {
        when(mockResultSet. getInt("Id")).thenReturn(1);
        when(mockResultSet.getString("Username")).thenReturn("testuser");
        when(mockResultSet.getFloat("PrezzoTotale")).thenReturn(51.98f);
        when(mockResultSet.getString("destinatario")).thenReturn("Mario Rossi");
        when(mockResultSet. getString("metodo_di_pagamento")).thenReturn("Carta di credito");
        when(mockResultSet.getString("circuito")).thenReturn("Visa");
        when(mockResultSet.getString("numero_carta")).thenReturn("1234567890123456");
        when(mockResultSet.getString("indirizzo_di_spedizione")).thenReturn("Via Roma 123, Milano");
        when(mockResultSet.getString("numero_di_tracking")).thenReturn("TRK123456789");
        when(mockResultSet.getDate("data")).thenReturn(Date.valueOf("2024-01-15"));
        when(mockResultSet.getString("metodo_di_spedizione")).thenReturn("Express");
    }

    /**
     * Helper method to verify ALL fields of an OrdineBean are properly set.
     * This is crucial for achieving high mutation coverage.
     */
    private void assertCompleteOrdineBean(OrdineBean bean, String expectedUsername, float expectedPrezzo,
                                          String expectedDestinatario, String expectedMetodoPagamento,
                                          String expectedCircuito, String expectedNumeroCarta,
                                          String expectedIndirizzoSpedizione, String expectedNumeroTracking,
                                          Date expectedData, String expectedMetodoSpedizione) {
        // Verify client (addresses SURVIVED mutations on lines 136, 177, 222, 274, 324, 370)
        assertNotNull(bean.getClient(), "Client should not be null");
        assertEquals(expectedUsername, bean.getClient().getUsername(), "Client username mismatch");

        // Verify basic fields
        assertEquals(expectedPrezzo, bean.getPrezzo_totale(), 0.001, "Prezzo totale mismatch");
        assertEquals(expectedDestinatario, bean.getDestinatario(), "Destinatario mismatch");

        // Verify payment fields (addresses SURVIVED mutations on lines 180, 225, 277, 327, 373)
        assertEquals(expectedMetodoPagamento, bean.getMetodo_di_pagamento(), "Metodo di pagamento mismatch");
        assertEquals(expectedCircuito, bean.getCircuito(), "Circuito mismatch");
        assertEquals(expectedNumeroCarta, bean.getNumero_carta(), "Numero carta mismatch");

        // Verify shipping fields (addresses SURVIVED mutations on lines 183, 228, 280, 330, 376)
        assertEquals(expectedIndirizzoSpedizione, bean.getIndirizzo_di_spedizione(), "Indirizzo spedizione mismatch");
        assertEquals(expectedNumeroTracking, bean.getNumero_di_tracking(), "Numero tracking mismatch");
        assertEquals(expectedMetodoSpedizione, bean.getMetodo_di_spedizione(), "Metodo spedizione mismatch");

        // Verify date (addresses SURVIVED mutations on lines 185, 230, 282, 332, 378)
        assertEquals(expectedData, bean. getData(), "Data mismatch");
    }

    // === TESTS FOR doSave() ===

    @Test
    void testDoSave_ValidOrderWithProducts_SavesSuccessfully() throws SQLException {
        // Arrange
        OrdineBean order = createValidOrdineBean();

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeUpdate()).thenReturn(1);

        try (MockedConstruction<ComposizioneDao> mockedComposizione = mockConstruction(ComposizioneDao.class,
                (mock, context) -> doNothing().when(mock).doSave(any(OrderProductBean.class)))) {

            // Act
            assertDoesNotThrow(() -> ordineDao.doSave(order));

            // Assert
            verify(mockPreparedStatement).setInt(1, 1);
            verify(mockPreparedStatement).setString(2, "testuser");
            verify(mockPreparedStatement).setFloat(3, 51.98f);
            verify(mockPreparedStatement).setString(4, "Mario Rossi");
            verify(mockPreparedStatement).setString(5, "Carta di credito");
            verify(mockPreparedStatement).setString(6, "Visa");
            verify(mockPreparedStatement).setString(7, "1234567890123456");
            verify(mockPreparedStatement).setString(8, "Via Roma 123, Milano");
            verify(mockPreparedStatement).setString(9, "TRK123456789");
            verify(mockPreparedStatement).setDate(10, Date.valueOf("2024-01-15"));
            verify(mockPreparedStatement).setString(11, "Express");
            verify(mockPreparedStatement).executeUpdate();

            // Verifica che ComposizioneDao.doSave sia stato chiamato per ogni prodotto
            assertEquals(1, mockedComposizione. constructed().size());
            verify(mockedComposizione.constructed().get(0), times(1)).doSave(any(OrderProductBean. class));
        }
    }

    @Test
    void testDoSave_OrderWithNullProducts_SavesSuccessfully() throws SQLException {
        // Arrange
        OrdineBean order = createValidOrdineBean();
        order.setProducts(null);

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeUpdate()).thenReturn(1);

        try (MockedConstruction<ComposizioneDao> mockedComposizione = mockConstruction(ComposizioneDao.class)) {

            // Act
            assertDoesNotThrow(() -> ordineDao. doSave(order));

            // Assert
            verify(mockPreparedStatement).executeUpdate();
            // ComposizioneDao.doSave non dovrebbe essere chiamato
            assertEquals(1, mockedComposizione.constructed().size());
            verify(mockedComposizione.constructed().get(0), never()).doSave(any(OrderProductBean.class));
        }
    }

    @Test
    void testDoSave_OrderWithEmptyProducts_SavesSuccessfully() throws SQLException {
        // Arrange
        OrdineBean order = createValidOrdineBean();
        order.setProducts(new ArrayList<>());

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeUpdate()).thenReturn(1);

        try (MockedConstruction<ComposizioneDao> mockedComposizione = mockConstruction(ComposizioneDao.class)) {

            // Act
            assertDoesNotThrow(() -> ordineDao.doSave(order));

            // Assert
            verify(mockPreparedStatement).executeUpdate();
            assertEquals(1, mockedComposizione.constructed().size());
            verify(mockedComposizione. constructed().get(0), never()).doSave(any(OrderProductBean.class));
        }
    }

    @Test
    void testDoSave_MultipleProducts_SavesAllProducts() throws SQLException {
        // Arrange
        OrdineBean order = createValidOrdineBean();
        OrderProductBean product2 = new OrderProductBean();
        product2.setId_ordine(1);
        product2.setId_prodotto(20);
        product2.setPrezzo(15.00f);
        product2.setQuantita(1);
        product2.setIVA(3.00f);
        order.getProducts().add(product2);

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeUpdate()).thenReturn(1);

        try (MockedConstruction<ComposizioneDao> mockedComposizione = mockConstruction(ComposizioneDao.class,
                (mock, context) -> doNothing().when(mock).doSave(any(OrderProductBean.class)))) {

            // Act
            assertDoesNotThrow(() -> ordineDao.doSave(order));

            // Assert
            assertEquals(1, mockedComposizione.constructed().size());
            verify(mockedComposizione.constructed().get(0), times(2)).doSave(any(OrderProductBean.class));
        }
    }

    @Test
    void testDoSave_DataSourceNotConfigured_ThrowsIllegalStateException() throws Exception {
        // Arrange
        setStaticDataSource(null);
        OrdineBean order = createValidOrdineBean();

        try (MockedConstruction<ComposizioneDao> mockedComposizione = mockConstruction(ComposizioneDao.class)) {
            // Act & Assert
            IllegalStateException exception = assertThrows(IllegalStateException.class,
                    () -> ordineDao.doSave(order));
            assertEquals("DataSource not configured", exception.getMessage());
        }
    }

    @Test
    void testDoSave_ConnectionFails_ThrowsSQLException() throws SQLException {
        // Arrange
        OrdineBean order = createValidOrdineBean();
        SQLException expectedException = new SQLException("Connection failed");

        when(mockDataSource.getConnection()).thenThrow(expectedException);

        try (MockedConstruction<ComposizioneDao> mockedComposizione = mockConstruction(ComposizioneDao. class)) {
            // Act & Assert
            SQLException exception = assertThrows(SQLException.class, () -> ordineDao.doSave(order));
            assertEquals("Connection failed", exception. getMessage());
        }
    }

    @Test
    void testDoSave_ExecuteUpdateFails_ThrowsSQLException() throws SQLException {
        // Arrange
        OrdineBean order = createValidOrdineBean();
        SQLException expectedException = new SQLException("Execute update failed");

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeUpdate()).thenThrow(expectedException);

        try (MockedConstruction<ComposizioneDao> mockedComposizione = mockConstruction(ComposizioneDao.class)) {
            // Act & Assert
            SQLException exception = assertThrows(SQLException.class, () -> ordineDao.doSave(order));
            assertEquals("Execute update failed", exception.getMessage());
        }
    }

    // === TESTS FOR doRetrieveByKey() ===

    @Test
    void testDoRetrieveByKey_ExistingId_ReturnsOrdineBean() throws SQLException {
        // Arrange
        int id = 1;
        ArrayList<OrderProductBean> mockProducts = new ArrayList<>();
        OrderProductBean product = new OrderProductBean();
        product.setId_ordine(1);
        product.setId_prodotto(10);
        mockProducts.add(product);

        utenteBean mockUser = new utenteBean();
        mockUser.setUsername("testuser");

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeQuery()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(true, false);
        setupResultSetForOrder();

        try (MockedConstruction<ComposizioneDao> mockedComposizione = mockConstruction(ComposizioneDao. class,
                (mock, context) -> when(mock. doRetrieveByKey(anyInt())).thenReturn(mockProducts));
             MockedConstruction<utenteDao> mockedUtente = mockConstruction(utenteDao.class,
                     (mock, context) -> when(mock. doRetrieveByKey(anyString())).thenReturn(mockUser))) {

            // Act
            OrdineBean result = ordineDao. doRetrieveByKey(id);

            // Assert - Complete verification to kill all SURVIVED mutations
            assertNotNull(result);
            assertEquals(1, result.getId());

            // Critical:  Verify ALL fields to kill SURVIVED mutations (lines 136, 137-145)
            assertCompleteOrdineBean(result, "testuser", 51.98f, "Mario Rossi",
                    "Carta di credito", "Visa", "1234567890123456",
                    "Via Roma 123, Milano", "TRK123456789",
                    Date.valueOf("2024-01-15"), "Express");

            verify(mockPreparedStatement).setInt(1, id);
        }
    }

    @Test
    void testDoRetrieveByKey_NonExistingId_ReturnsEmptyBean() throws SQLException {
        // Arrange
        int id = 999;

        when(mockDataSource. getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement. executeQuery()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(false);

        try (MockedConstruction<ComposizioneDao> mockedComposizione = mockConstruction(ComposizioneDao. class,
                (mock, context) -> when(mock. doRetrieveByKey(anyInt())).thenReturn(new ArrayList<>()));
             MockedConstruction<utenteDao> mockedUtente = mockConstruction(utenteDao.class)) {

            // Act
            OrdineBean result = ordineDao.doRetrieveByKey(id);

            // Assert
            assertNotNull(result);
            assertEquals(0, result.getId());
        }
    }

    @Test
    void testDoRetrieveByKey_DataSourceNotConfigured_ThrowsIllegalStateException() throws Exception {
        // Arrange
        setStaticDataSource(null);

        try (MockedConstruction<ComposizioneDao> mockedComposizione = mockConstruction(ComposizioneDao. class,
                (mock, context) -> when(mock.doRetrieveByKey(anyInt())).thenReturn(new ArrayList<>()));
             MockedConstruction<utenteDao> mockedUtente = mockConstruction(utenteDao.class)) {

            // Act & Assert
            IllegalStateException exception = assertThrows(IllegalStateException.class,
                    () -> ordineDao. doRetrieveByKey(1));
            assertEquals("DataSource not configured", exception. getMessage());
        }
    }

    @Test
    void testDoRetrieveByKey_SQLException_Propagated() throws SQLException {
        // Arrange
        SQLException expectedException = new SQLException("Query failed");
        when(mockDataSource. getConnection()).thenThrow(expectedException);

        try (MockedConstruction<ComposizioneDao> mockedComposizione = mockConstruction(ComposizioneDao.class,
                (mock, context) -> when(mock.doRetrieveByKey(anyInt())).thenReturn(new ArrayList<>()));
             MockedConstruction<utenteDao> mockedUtente = mockConstruction(utenteDao.class)) {

            // Act & Assert
            SQLException exception = assertThrows(SQLException.class, () -> ordineDao.doRetrieveByKey(1));
            assertEquals("Query failed", exception. getMessage());
        }
    }

    // === TESTS FOR lastOrder() ===

    @Test
    void testLastOrder_ExistingOrders_ReturnsLastOrder() throws SQLException {
        // Arrange
        utenteBean mockUser = new utenteBean();
        mockUser.setUsername("testuser");

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeQuery()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(true, false);
        setupResultSetForOrder();

        try (MockedConstruction<utenteDao> mockedUtente = mockConstruction(utenteDao.class,
                (mock, context) -> when(mock. doRetrieveByKey(anyString())).thenReturn(mockUser))) {

            // Act
            OrdineBean result = ordineDao. lastOrder();

            // Assert - Complete verification to kill ALL SURVIVED mutations (lines 177-186)
            assertNotNull(result);
            assertCompleteOrdineBean(result, "testuser", 51.98f, "Mario Rossi",
                    "Carta di credito", "Visa", "1234567890123456",
                    "Via Roma 123, Milano", "TRK123456789",
                    Date. valueOf("2024-01-15"), "Express");
        }
    }

    @Test
    void testLastOrder_NoOrders_ReturnsEmptyBean() throws SQLException {
        // Arrange
        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeQuery()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(false);

        try (MockedConstruction<utenteDao> mockedUtente = mockConstruction(utenteDao.class)) {

            // Act
            OrdineBean result = ordineDao.lastOrder();

            // Assert
            assertNotNull(result);
            assertEquals(0, result. getId());
        }
    }

    @Test
    void testLastOrder_DataSourceNotConfigured_ThrowsIllegalStateException() throws Exception {
        // Arrange
        setStaticDataSource(null);

        try (MockedConstruction<utenteDao> mockedUtente = mockConstruction(utenteDao.class)) {

            // Act & Assert
            IllegalStateException exception = assertThrows(IllegalStateException.class,
                    () -> ordineDao.lastOrder());
            assertEquals("DataSource not configured", exception.getMessage());
        }
    }

    @Test
    void testLastOrder_SQLException_Propagated() throws SQLException {
        // Arrange
        SQLException expectedException = new SQLException("Query failed");
        when(mockDataSource. getConnection()).thenThrow(expectedException);

        try (MockedConstruction<utenteDao> mockedUtente = mockConstruction(utenteDao.class)) {

            // Act & Assert
            SQLException exception = assertThrows(SQLException.class, () -> ordineDao.lastOrder());
            assertEquals("Query failed", exception.getMessage());
        }
    }

    // === TESTS FOR doRetrieveByClient() ===

    @Test
    void testDoRetrieveByClient_ExistingUsername_ReturnsList() throws SQLException {
        // Arrange
        String username = "testuser";
        utenteBean mockUser = new utenteBean();
        mockUser.setUsername(username);

        when(mockDataSource. getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement. executeQuery()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(true, true, false);

        // Due ordini - Setup completo per uccidere i SURVIVED mutations (lines 222-231)
        when(mockResultSet. getInt("Id")).thenReturn(1, 2);
        when(mockResultSet.getString("Username")).thenReturn(username, username);
        when(mockResultSet.getFloat("PrezzoTotale")).thenReturn(51.98f, 100.00f);
        when(mockResultSet.getString("destinatario")).thenReturn("Mario Rossi", "Luigi Verdi");
        when(mockResultSet. getString("metodo_di_pagamento")).thenReturn("Carta di credito", "PayPal");
        when(mockResultSet.getString("circuito")).thenReturn("Visa", "MasterCard");
        when(mockResultSet.getString("numero_carta")).thenReturn("1234567890123456", "9876543210987654");
        when(mockResultSet. getString("indirizzo_di_spedizione")).thenReturn("Via Roma 123, Milano", "Via Milano 456, Roma");
        when(mockResultSet. getString("numero_di_tracking")).thenReturn("TRK123456789", "TRK987654321");
        when(mockResultSet.getDate("data")).thenReturn(Date.valueOf("2024-01-15"), Date.valueOf("2024-02-20"));
        when(mockResultSet.getString("metodo_di_spedizione")).thenReturn("Express", "Standard");

        try (MockedConstruction<utenteDao> mockedUtente = mockConstruction(utenteDao.class,
                (mock, context) -> when(mock.doRetrieveByKey(anyString())).thenReturn(mockUser))) {

            // Act
            ArrayList<OrdineBean> result = ordineDao. doRetrieveByClient(username);

            // Assert - Complete verification for ALL orders to kill SURVIVED mutations
            assertNotNull(result);
            assertEquals(2, result. size());

            // Verify first order completely (kills SURVIVED mutations lines 222-231)
            OrdineBean firstOrder = result.get(0);
            assertCompleteOrdineBean(firstOrder, "testuser", 51.98f, "Mario Rossi",
                    "Carta di credito", "Visa", "1234567890123456",
                    "Via Roma 123, Milano", "TRK123456789",
                    Date.valueOf("2024-01-15"), "Express");

            // Verify second order completely
            OrdineBean secondOrder = result. get(1);
            assertCompleteOrdineBean(secondOrder, "testuser", 100.00f, "Luigi Verdi",
                    "PayPal", "MasterCard", "9876543210987654",
                    "Via Milano 456, Roma", "TRK987654321",
                    Date. valueOf("2024-02-20"), "Standard");

            verify(mockPreparedStatement).setString(1, username);
        }
    }

    @Test
    void testDoRetrieveByClient_NonExistingUsername_ReturnsEmptyList() throws SQLException {
        // Arrange
        String username = "nonexistent";

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeQuery()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(false);

        try (MockedConstruction<utenteDao> mockedUtente = mockConstruction(utenteDao.class)) {

            // Act
            ArrayList<OrdineBean> result = ordineDao. doRetrieveByClient(username);

            // Assert
            assertNotNull(result);
            assertTrue(result.isEmpty());
        }
    }

    @Test
    void testDoRetrieveByClient_DataSourceNotConfigured_ThrowsIllegalStateException() throws Exception {
        // Arrange
        setStaticDataSource(null);

        try (MockedConstruction<utenteDao> mockedUtente = mockConstruction(utenteDao.class)) {

            // Act & Assert
            IllegalStateException exception = assertThrows(IllegalStateException.class,
                    () -> ordineDao. doRetrieveByClient("testuser"));
            assertEquals("DataSource not configured", exception.getMessage());
        }
    }

    @Test
    void testDoRetrieveByClient_SQLException_Propagated() throws SQLException {
        // Arrange
        SQLException expectedException = new SQLException("Query failed");
        when(mockDataSource.getConnection()).thenThrow(expectedException);

        try (MockedConstruction<utenteDao> mockedUtente = mockConstruction(utenteDao.class)) {

            // Act & Assert
            SQLException exception = assertThrows(SQLException.class,
                    () -> ordineDao. doRetrieveByClient("testuser"));
            assertEquals("Query failed", exception.getMessage());
        }
    }

    // === TESTS FOR ClientDateOrders() ===

    @Test
    void testClientDateOrders_ValidParameters_ReturnsList() throws SQLException {
        // Arrange
        String username = "testuser";
        String dataFrom = "2024-01-01";
        String dataTo = "2024-12-31";
        utenteBean mockUser = new utenteBean();
        mockUser.setUsername(username);

        when(mockDataSource. getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement. executeQuery()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(true, false);
        setupResultSetForOrder();

        try (MockedConstruction<utenteDao> mockedUtente = mockConstruction(utenteDao.class,
                (mock, context) -> when(mock.doRetrieveByKey(anyString())).thenReturn(mockUser))) {

            // Act
            ArrayList<OrdineBean> result = ordineDao.ClientDateOrders(username, dataFrom, dataTo);

            // Assert - Complete verification to kill SURVIVED mutations (lines 274-283)
            assertNotNull(result);
            assertEquals(1, result.size());

            OrdineBean order = result.get(0);
            assertCompleteOrdineBean(order, "testuser", 51.98f, "Mario Rossi",
                    "Carta di credito", "Visa", "1234567890123456",
                    "Via Roma 123, Milano", "TRK123456789",
                    Date.valueOf("2024-01-15"), "Express");

            verify(mockPreparedStatement).setString(1, username);
            verify(mockPreparedStatement).setString(2, dataFrom);
            verify(mockPreparedStatement).setString(3, dataTo);
        }
    }

    @Test
    void testClientDateOrders_NoOrdersInRange_ReturnsEmptyList() throws SQLException {
        // Arrange
        String username = "testuser";
        String dataFrom = "2025-01-01";
        String dataTo = "2025-12-31";

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeQuery()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(false);

        try (MockedConstruction<utenteDao> mockedUtente = mockConstruction(utenteDao.class)) {

            // Act
            ArrayList<OrdineBean> result = ordineDao.ClientDateOrders(username, dataFrom, dataTo);

            // Assert
            assertNotNull(result);
            assertTrue(result. isEmpty());
        }
    }

    @Test
    void testClientDateOrders_DataSourceNotConfigured_ThrowsIllegalStateException() throws Exception {
        // Arrange
        setStaticDataSource(null);

        try (MockedConstruction<utenteDao> mockedUtente = mockConstruction(utenteDao.class)) {

            // Act & Assert
            IllegalStateException exception = assertThrows(IllegalStateException.class,
                    () -> ordineDao.ClientDateOrders("testuser", "2024-01-01", "2024-12-31"));
            assertEquals("DataSource not configured", exception.getMessage());
        }
    }

    @Test
    void testClientDateOrders_SQLException_Propagated() throws SQLException {
        // Arrange
        SQLException expectedException = new SQLException("Query failed");
        when(mockDataSource.getConnection()).thenThrow(expectedException);

        try (MockedConstruction<utenteDao> mockedUtente = mockConstruction(utenteDao.class)) {

            // Act & Assert
            SQLException exception = assertThrows(SQLException.class,
                    () -> ordineDao.ClientDateOrders("testuser", "2024-01-01", "2024-12-31"));
            assertEquals("Query failed", exception. getMessage());
        }
    }

    // === TESTS FOR DateOrders() ===

    @Test
    void testDateOrders_ValidParameters_ReturnsList() throws SQLException {
        // Arrange
        String dataFrom = "2024-01-01";
        String dataTo = "2024-12-31";
        utenteBean mockUser = new utenteBean();
        mockUser.setUsername("testuser");

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection. prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeQuery()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(true, false);
        setupResultSetForOrder();

        try (MockedConstruction<utenteDao> mockedUtente = mockConstruction(utenteDao.class,
                (mock, context) -> when(mock.doRetrieveByKey(anyString())).thenReturn(mockUser))) {

            // Act
            ArrayList<OrdineBean> result = ordineDao.DateOrders(dataFrom, dataTo);

            // Assert - Complete verification to kill SURVIVED mutations (lines 324-333)
            assertNotNull(result);
            assertEquals(1, result.size());

            OrdineBean order = result.get(0);
            assertCompleteOrdineBean(order, "testuser", 51.98f, "Mario Rossi",
                    "Carta di credito", "Visa", "1234567890123456",
                    "Via Roma 123, Milano", "TRK123456789",
                    Date.valueOf("2024-01-15"), "Express");

            verify(mockPreparedStatement).setString(1, dataFrom);
            verify(mockPreparedStatement).setString(2, dataTo);
        }
    }

    @Test
    void testDateOrders_NoOrdersInRange_ReturnsEmptyList() throws SQLException {
        // Arrange
        String dataFrom = "2025-01-01";
        String dataTo = "2025-12-31";

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeQuery()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(false);

        try (MockedConstruction<utenteDao> mockedUtente = mockConstruction(utenteDao.class)) {

            // Act
            ArrayList<OrdineBean> result = ordineDao.DateOrders(dataFrom, dataTo);

            // Assert
            assertNotNull(result);
            assertTrue(result.isEmpty());
        }
    }

    @Test
    void testDateOrders_DataSourceNotConfigured_ThrowsIllegalStateException() throws Exception {
        // Arrange
        setStaticDataSource(null);

        try (MockedConstruction<utenteDao> mockedUtente = mockConstruction(utenteDao.class)) {

            // Act & Assert
            IllegalStateException exception = assertThrows(IllegalStateException.class,
                    () -> ordineDao.DateOrders("2024-01-01", "2024-12-31"));
            assertEquals("DataSource not configured", exception. getMessage());
        }
    }

    @Test
    void testDateOrders_SQLException_Propagated() throws SQLException {
        // Arrange
        SQLException expectedException = new SQLException("Query failed");
        when(mockDataSource.getConnection()).thenThrow(expectedException);

        try (MockedConstruction<utenteDao> mockedUtente = mockConstruction(utenteDao.class)) {

            // Act & Assert
            SQLException exception = assertThrows(SQLException.class,
                    () -> ordineDao.DateOrders("2024-01-01", "2024-12-31"));
            assertEquals("Query failed", exception. getMessage());
        }
    }

    // === TESTS FOR doRetrieveAll() ===

    @Test
    void testDoRetrieveAll_MultipleOrders_ReturnsList() throws SQLException {
        // Arrange
        utenteBean mockUser = new utenteBean();
        mockUser.setUsername("testuser");

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeQuery()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(true, true, false);

        // Setup per due ordini completi - per uccidere SURVIVED mutations (lines 370-379)
        when(mockResultSet.getInt("Id")).thenReturn(1, 2);
        when(mockResultSet.getString("Username")).thenReturn("testuser", "testuser2");
        when(mockResultSet.getFloat("PrezzoTotale")).thenReturn(51.98f, 100.00f);
        when(mockResultSet.getString("destinatario")).thenReturn("Mario Rossi", "Luigi Verdi");
        when(mockResultSet.getString("metodo_di_pagamento")).thenReturn("Carta di credito", "PayPal");
        when(mockResultSet.getString("circuito")).thenReturn("Visa", "MasterCard");
        when(mockResultSet. getString("numero_carta")).thenReturn("1234567890123456", "9876543210987654");
        when(mockResultSet.getString("indirizzo_di_spedizione")).thenReturn("Via Roma 123, Milano", "Via Milano 456, Roma");
        when(mockResultSet.getString("numero_di_tracking")).thenReturn("TRK123456789", "TRK987654321");
        when(mockResultSet. getDate("data")).thenReturn(Date.valueOf("2024-01-15"), Date.valueOf("2024-02-20"));
        when(mockResultSet.getString("metodo_di_spedizione")).thenReturn("Express", "Standard");

        try (MockedConstruction<utenteDao> mockedUtente = mockConstruction(utenteDao. class,
                (mock, context) -> when(mock.doRetrieveByKey(anyString())).thenReturn(mockUser))) {

            // Act
            ArrayList<OrdineBean> result = ordineDao.doRetrieveAll();

            // Assert - Complete verification for ALL orders to kill SURVIVED mutations
            assertNotNull(result);
            assertEquals(2, result. size());

            // Verify first order completely (kills SURVIVED mutations lines 370-379)
            OrdineBean firstOrder = result.get(0);
            assertCompleteOrdineBean(firstOrder, "testuser", 51.98f, "Mario Rossi",
                    "Carta di credito", "Visa", "1234567890123456",
                    "Via Roma 123, Milano", "TRK123456789",
                    Date.valueOf("2024-01-15"), "Express");

            // Verify second order completely
            OrdineBean secondOrder = result. get(1);
            assertCompleteOrdineBean(secondOrder, "testuser", 100.00f, "Luigi Verdi",
                    "PayPal", "MasterCard", "9876543210987654",
                    "Via Milano 456, Roma", "TRK987654321",
                    Date.valueOf("2024-02-20"), "Standard");
        }
    }

    @Test
    void testDoRetrieveAll_NoOrders_ReturnsEmptyList() throws SQLException {
        // Arrange
        when(mockDataSource. getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement. executeQuery()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(false);

        try (MockedConstruction<utenteDao> mockedUtente = mockConstruction(utenteDao. class)) {

            // Act
            ArrayList<OrdineBean> result = ordineDao.doRetrieveAll();

            // Assert
            assertNotNull(result);
            assertTrue(result.isEmpty());
        }
    }

    @Test
    void testDoRetrieveAll_DataSourceNotConfigured_ThrowsIllegalStateException() throws Exception {
        // Arrange
        setStaticDataSource(null);

        try (MockedConstruction<utenteDao> mockedUtente = mockConstruction(utenteDao.class)) {

            // Act & Assert
            IllegalStateException exception = assertThrows(IllegalStateException. class,
                    () -> ordineDao.doRetrieveAll());
            assertEquals("DataSource not configured", exception.getMessage());
        }
    }

    @Test
    void testDoRetrieveAll_SQLException_Propagated() throws SQLException {
        // Arrange
        SQLException expectedException = new SQLException("Query failed");
        when(mockDataSource.getConnection()).thenThrow(expectedException);

        try (MockedConstruction<utenteDao> mockedUtente = mockConstruction(utenteDao.class)) {

            // Act & Assert
            SQLException exception = assertThrows(SQLException.class, () -> ordineDao.doRetrieveAll());
            assertEquals("Query failed", exception.getMessage());
        }
    }

    // === RESOURCE MANAGEMENT AND SYNCHRONIZATION TESTS ===

    @Test
    void testResourceManagement_AllResourcesClosed() throws SQLException {
        // Arrange
        when(mockDataSource. getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement. executeQuery()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(false);

        try (MockedConstruction<utenteDao> mockedUtente = mockConstruction(utenteDao. class)) {

            // Act
            ordineDao.doRetrieveAll();

            // Assert
            verify(mockConnection).close();
            verify(mockPreparedStatement).close();
            verify(mockResultSet).close();
        }
    }

    @Test
    void testSynchronizedBehavior_MultipleCalls_WorkCorrectly() throws SQLException {
        // Arrange
        when(mockDataSource. getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement. executeQuery()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(false);

        try (MockedConstruction<utenteDao> mockedUtente = mockConstruction(utenteDao.class);
             MockedConstruction<ComposizioneDao> mockedComposizione = mockConstruction(ComposizioneDao.class,
                     (mock, context) -> when(mock. doRetrieveByKey(anyInt())).thenReturn(new ArrayList<>()))) {

            // Act
            ArrayList<OrdineBean> result1 = ordineDao.doRetrieveAll();
            OrdineBean result2 = ordineDao.lastOrder();
            OrdineBean result3 = ordineDao. doRetrieveByKey(1);

            // Assert
            assertNotNull(result1);
            assertNotNull(result2);
            assertNotNull(result3);
        }
    }

    @Test
    void testStaticInitialization_JNDILookupFailure() throws Exception {
        try (MockedStatic<InitialContext> mockedInitialContext = mockStatic(InitialContext.class)) {
            mockedInitialContext.when(() -> new InitialContext())
                    .thenThrow(new RuntimeException(new NamingException("JNDI not available")));

            setStaticDataSource(null);

            OrdineDao dao = new OrdineDao();

            try (MockedConstruction<utenteDao> mockedUtente = mockConstruction(utenteDao.class)) {
                assertThrows(IllegalStateException.class, () -> dao.doRetrieveAll());
            }
        }
    }
}