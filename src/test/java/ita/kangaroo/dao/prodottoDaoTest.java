package ita.kangaroo.dao;

import ita.kangaroo.model.ProdottoBean;
import ita.kangaroo.model.tipo;
import org.junit.jupiter. api.BeforeEach;
import org.junit.jupiter. api.Test;
import org.junit. jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org. mockito.junit. jupiter.MockitoExtension;

import javax.sql.DataSource;
import java. lang.reflect.Field;
import java. sql.*;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter. api.Assertions.*;
import static org. mockito.ArgumentMatchers.*;
import static org.mockito. Mockito.*;

@ExtendWith(MockitoExtension.class)
class prodottoDaoTest {

    @Mock
    private DataSource mockDataSource;

    @Mock
    private Connection mockConnection;

    @Mock
    private PreparedStatement mockPreparedStatement;

    @Mock
    private ResultSet mockResultSet;

    private prodottoDao prodottoDao;

    @BeforeEach
    void setUp() throws Exception {
        prodottoDao = new prodottoDao();
        setStaticDataSource(mockDataSource);
    }

    private void setStaticDataSource(DataSource dataSource) throws Exception {
        Field dsField = prodottoDao.class.getDeclaredField("ds");
        dsField.setAccessible(true);
        dsField.set(null, dataSource);
    }

    private ProdottoBean createValidProdottoBean() {
        ProdottoBean prod = new ProdottoBean();
        prod.setId(1);
        prod.setNome("Croccantini Premium");
        prod.setDescrizione("Croccantini per cani adulti");
        prod.setPrezzo(25.99f); // Keep float, but expect double conversion in tests
        prod.setQuantita(100);
        prod.setTipo(tipo.cibo);
        prod.setIva(22.0f);
        prod.setImmagine("croccantini.jpg");
        return prod;
    }


    private void setupResultSetForProduct() throws SQLException {
        when(mockResultSet. getInt("Id")).thenReturn(1);
        when(mockResultSet.getString("Nome")).thenReturn("Croccantini Premium");
        when(mockResultSet.getString("Descrizione")).thenReturn("Croccantini per cani adulti");
        when(mockResultSet.getFloat("Prezzo")).thenReturn(25.99f);
        when(mockResultSet. getInt("QuantitaDisponibile")).thenReturn(100);
        when(mockResultSet.getString("Tipo")).thenReturn("cibo");
        when(mockResultSet.getFloat("IVA")).thenReturn(22.0f);
        when(mockResultSet.getString("immagine")).thenReturn("croccantini.jpg");
    }

    /**
     * Helper method to verify ALL fields of a ProdottoBean are properly set.
     * This is crucial for achieving high mutation coverage by killing SURVIVED mutations.
     */
    private void assertCompleteProdottoBean(ProdottoBean prod, int expectedId, String expectedNome,
                                            String expectedDescrizione, float expectedPrezzo,
                                            int expectedQuantita, tipo expectedTipo,
                                            float expectedIva, String expectedImmagine) {
        // Verify ID and basic info (usually already tested)
        assertEquals(expectedId, prod. getId(), "Product ID mismatch");
        assertEquals(expectedNome, prod. getNome(), "Product name mismatch");

        // Critical: Verify ALL these fields to kill SURVIVED mutations
        assertEquals(expectedDescrizione, prod.getDescrizione(), "Product description mismatch"); // Lines 171, 214, 295, 362, 402
        assertEquals(expectedPrezzo, prod. getPrezzo(), 0.001, "Product price mismatch");         // Lines 172, 215, 296, 363, 403
        assertEquals(expectedQuantita, prod.getQuantita(), "Product quantity mismatch");          // Lines 173, 216, 297, 364, 404
        assertEquals(expectedTipo, prod.getTipo(), "Product type mismatch");                      // Lines 174, 217, 365, 405
        assertEquals(expectedIva, prod. getIva(), 0.001, "Product IVA mismatch");                 // Lines 175, 218, 299, 366, 406
        assertEquals(expectedImmagine, prod.getImmagine(), "Product image mismatch");             // Lines 176, 219, 300, 367, 407
    }

    // === TESTS FOR doSave() ===

    @Test
    void testDoSave_ValidProduct_ReturnsGeneratedId() throws SQLException {
        // Arrange
        ProdottoBean prod = createValidProdottoBean();
        int expectedId = 42;
        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString(), eq(Statement.RETURN_GENERATED_KEYS)))
                .thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeUpdate()).thenReturn(1);
        when(mockPreparedStatement.getGeneratedKeys()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(true, false);
        when(mockResultSet.getInt(1)).thenReturn(expectedId);

        // Act
        int result = prodottoDao.doSave(prod);

        // Assert
        assertEquals(expectedId, result);

        // ✅ Usa matcher per double values
        verify(mockPreparedStatement).setInt(1, 1);
        verify(mockPreparedStatement).setString(2, "Croccantini Premium");
        verify(mockPreparedStatement).setString(3, "Croccantini per cani adulti");
        verify(mockPreparedStatement).setDouble(eq(4), doubleThat(d -> Math.abs(d - 25.99) < 0.01));
        verify(mockPreparedStatement).setInt(5, 100);
        verify(mockPreparedStatement).setString(6, "cibo");
        verify(mockPreparedStatement).setDouble(7, 22.0d);
        verify(mockPreparedStatement).setString(8, "croccantini.jpg");
        verify(mockPreparedStatement).executeUpdate();
    }




    @Test
    void testDoSave_NoGeneratedKey_ReturnsMinusOne() throws SQLException {
        // Arrange
        ProdottoBean prod = createValidProdottoBean();

        when(mockDataSource. getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString(), eq(Statement. RETURN_GENERATED_KEYS)))
                .thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeUpdate()).thenReturn(1);
        when(mockPreparedStatement.getGeneratedKeys()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(false);

        // Act
        int result = prodottoDao. doSave(prod);

        // Assert
        assertEquals(-1, result);
    }

    @Test
    void testDoSave_SQLException_Propagated() throws SQLException {
        // Arrange
        ProdottoBean prod = createValidProdottoBean();
        SQLException expectedException = new SQLException("Connection failed");

        when(mockDataSource.getConnection()).thenThrow(expectedException);

        // Act & Assert
        SQLException exception = assertThrows(SQLException.class, () -> prodottoDao. doSave(prod));
        assertEquals("Connection failed", exception.getMessage());
    }

    @Test
    void testDoSave_ExecuteUpdateFails_ThrowsSQLException() throws SQLException {
        // Arrange
        ProdottoBean prod = createValidProdottoBean();
        SQLException expectedException = new SQLException("Execute update failed");

        when(mockDataSource. getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString(), eq(Statement. RETURN_GENERATED_KEYS)))
                .thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeUpdate()).thenThrow(expectedException);

        // Act & Assert
        SQLException exception = assertThrows(SQLException.class, () -> prodottoDao.doSave(prod));
        assertEquals("Execute update failed", exception.getMessage());
    }

    @Test
    void testDoSave_ResourcesClosed() throws SQLException {
        // Arrange
        ProdottoBean prod = createValidProdottoBean();

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString(), eq(Statement.RETURN_GENERATED_KEYS)))
                .thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeUpdate()).thenReturn(1);
        when(mockPreparedStatement.getGeneratedKeys()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(false);

        // Act
        prodottoDao. doSave(prod);

        // Assert
        verify(mockPreparedStatement).close();
        verify(mockConnection).close();
    }

    // === TESTS FOR doRetrieveByKey() ===

    @Test
    void testDoRetrieveByKey_ExistingId_ReturnsProdottoBean() throws SQLException {
        // Arrange
        int id = 1;

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeQuery()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(true);
        setupResultSetForProduct();

        // Act
        ProdottoBean result = prodottoDao.doRetrieveByKey(id);

        // Assert - Complete verification to kill ALL setter mutations
        assertNotNull(result);
        assertCompleteProdottoBean(result, 1, "Croccantini Premium", "Croccantini per cani adulti",
                25.99f, 100, tipo.cibo, 22.0f, "croccantini.jpg");
        verify(mockPreparedStatement).setInt(1, id);
    }

    @Test
    void testDoRetrieveByKey_NonExistingId_ReturnsNull() throws SQLException {
        // Arrange
        int id = 999;

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeQuery()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(false);

        // Act
        ProdottoBean result = prodottoDao. doRetrieveByKey(id);

        // Assert
        assertNull(result);
        verify(mockPreparedStatement).setInt(1, id);
    }

    @Test
    void testDoRetrieveByKey_SQLException_Propagated() throws SQLException {
        // Arrange
        SQLException expectedException = new SQLException("Query failed");
        when(mockDataSource.getConnection()).thenThrow(expectedException);

        // Act & Assert
        SQLException exception = assertThrows(SQLException. class, () -> prodottoDao. doRetrieveByKey(1));
        assertEquals("Query failed", exception.getMessage());
    }

    @Test
    void testDoRetrieveByKey_ResourcesClosed() throws SQLException {
        // Arrange
        when(mockDataSource. getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement. executeQuery()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(false);

        // Act
        prodottoDao.doRetrieveByKey(1);

        // Assert
        verify(mockPreparedStatement).close();
        verify(mockConnection).close();
    }

    // === TESTS FOR doDelete() ===

    @Test
    void testDoDelete_ExistingId_ReturnsTrue() throws SQLException {
        // Arrange
        int id = 1;

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection. prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeUpdate()).thenReturn(1);

        // Act
        boolean result = prodottoDao.doDelete(id);

        // Assert
        assertTrue(result);
        verify(mockPreparedStatement).setInt(1, id);
    }

    @Test
    void testDoDelete_NonExistingId_ReturnsFalse() throws SQLException {
        // Arrange
        int id = 999;

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeUpdate()).thenReturn(0);

        // Act
        boolean result = prodottoDao. doDelete(id);

        // Assert
        assertFalse(result);
        verify(mockPreparedStatement).setInt(1, id);
    }

    @Test
    void testDoDelete_SQLException_Propagated() throws SQLException {
        // Arrange
        SQLException expectedException = new SQLException("Delete failed");
        when(mockDataSource. getConnection()).thenThrow(expectedException);

        // Act & Assert
        SQLException exception = assertThrows(SQLException.class, () -> prodottoDao.doDelete(1));
        assertEquals("Delete failed", exception.getMessage());
    }

    @Test
    void testDoDelete_ResourcesClosed() throws SQLException {
        // Arrange
        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeUpdate()).thenReturn(1);

        // Act
        prodottoDao.doDelete(1);

        // Assert
        verify(mockPreparedStatement).close();
        verify(mockConnection).close();
    }

    // === TESTS FOR doRetrieveAll() ===

    @Test
    void testDoRetrieveAll_MultipleProducts_ReturnsList() throws SQLException {
        // Arrange
        when(mockDataSource. getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement. executeQuery()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(true, true, false);

        // Setup complete data for two products to kill SURVIVED mutations (lines 171-176)
        when(mockResultSet. getInt("Id")).thenReturn(1, 2);
        when(mockResultSet.getString("Nome")).thenReturn("Prodotto 1", "Prodotto 2");
        when(mockResultSet. getString("Descrizione")).thenReturn("Descrizione 1", "Descrizione 2");
        when(mockResultSet.getFloat("Prezzo")).thenReturn(10.0f, 20.0f);
        when(mockResultSet.getInt("QuantitaDisponibile")).thenReturn(50, 100);
        when(mockResultSet.getString("Tipo")).thenReturn("cibo", "accessorio");
        when(mockResultSet. getFloat("IVA")).thenReturn(22.0f, 10.0f);
        when(mockResultSet.getString("immagine")).thenReturn("img1.jpg", "img2.jpg");

        // Act
        List<ProdottoBean> result = prodottoDao.doRetrieveAll();

        // Assert - Complete verification to kill SURVIVED mutations (lines 171-176)
        assertNotNull(result);
        assertEquals(2, result.size());

        // Verify first product completely
        assertCompleteProdottoBean(result. get(0), 1, "Prodotto 1", "Descrizione 1",
                10.0f, 50, tipo.cibo, 22.0f, "img1.jpg");

        // Verify second product completely
        assertCompleteProdottoBean(result.get(1), 2, "Prodotto 2", "Descrizione 2",
                20.0f, 100, tipo. accessorio, 10.0f, "img2.jpg");
    }

    @Test
    void testDoRetrieveAll_NoProducts_ReturnsEmptyList() throws SQLException {
        // Arrange
        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeQuery()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(false);

        // Act
        List<ProdottoBean> result = prodottoDao. doRetrieveAll();

        // Assert
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    void testDoRetrieveAll_SQLException_Propagated() throws SQLException {
        // Arrange
        SQLException expectedException = new SQLException("Query failed");
        when(mockDataSource.getConnection()).thenThrow(expectedException);

        // Act & Assert
        SQLException exception = assertThrows(SQLException.class, () -> prodottoDao. doRetrieveAll());
        assertEquals("Query failed", exception.getMessage());
    }

    @Test
    void testDoRetrieveAll_ResourcesClosed() throws SQLException {
        // Arrange
        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeQuery()).thenReturn(mockResultSet);
        when(mockResultSet. next()).thenReturn(false);

        // Act
        prodottoDao. doRetrieveAll();

        // Assert
        verify(mockPreparedStatement).close();
        verify(mockConnection).close();
    }

    // === TESTS FOR doRetrieveAllLimit() ===

    @Test
    void testDoRetrieveAllLimit_ReturnsMaxTenProducts() throws SQLException {
        // Arrange
        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection. prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeQuery()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(true, true, true, false);

        // Setup complete data to kill ALL SURVIVED mutations (lines 212-219)
        when(mockResultSet.getInt("Id")).thenReturn(1, 2, 3);
        when(mockResultSet.getString("Nome")).thenReturn("Prodotto 1", "Prodotto 2", "Prodotto 3");
        when(mockResultSet.getString("Descrizione")).thenReturn("Desc 1", "Desc 2", "Desc 3");
        when(mockResultSet.getFloat("Prezzo")).thenReturn(10.0f, 20.0f, 30.0f);
        when(mockResultSet.getInt("QuantitaDisponibile")).thenReturn(50, 100, 150);
        when(mockResultSet. getString("Tipo")).thenReturn("cibo", "accessorio", "animale");
        when(mockResultSet. getFloat("IVA")).thenReturn(22.0f, 10.0f, 4.0f);
        when(mockResultSet.getString("immagine")).thenReturn("img1.jpg", "img2.jpg", "img3.jpg");

        // Act
        ArrayList<ProdottoBean> result = prodottoDao. doRetrieveAllLimit();

        // Assert - Complete verification to kill ALL SURVIVED mutations (lines 212-219)
        assertNotNull(result);
        assertEquals(3, result.size());

        // Verify all products completely to kill ALL setter mutations
        assertCompleteProdottoBean(result. get(0), 1, "Prodotto 1", "Desc 1",
                10.0f, 50, tipo.cibo, 22.0f, "img1.jpg");
        assertCompleteProdottoBean(result.get(1), 2, "Prodotto 2", "Desc 2",
                20.0f, 100, tipo.accessorio, 10.0f, "img2.jpg");
        assertCompleteProdottoBean(result.get(2), 3, "Prodotto 3", "Desc 3",
                30.0f, 150, tipo.animale, 4.0f, "img3.jpg");
    }

    @Test
    void testDoRetrieveAllLimit_NoProducts_ReturnsEmptyList() throws SQLException {
        // Arrange
        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeQuery()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(false);

        // Act
        ArrayList<ProdottoBean> result = prodottoDao. doRetrieveAllLimit();

        // Assert
        assertNotNull(result);
        assertTrue(result. isEmpty());
    }

    @Test
    void testDoRetrieveAllLimit_SQLException_Propagated() throws SQLException {
        // Arrange
        SQLException expectedException = new SQLException("Query failed");
        when(mockDataSource. getConnection()).thenThrow(expectedException);

        // Act & Assert
        SQLException exception = assertThrows(SQLException.class, () -> prodottoDao.doRetrieveAllLimit());
        assertEquals("Query failed", exception.getMessage());
    }

    @Test
    void testDoRetrieveAllLimit_ResourcesClosed() throws SQLException {
        // Arrange
        when(mockDataSource. getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement. executeQuery()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(false);

        // Act
        prodottoDao.doRetrieveAllLimit();

        // Assert - Verify resources are closed to kill line 227, 229, 230 mutations
        verify(mockPreparedStatement).close();
        verify(mockConnection).close();
    }

    // === TESTS FOR doModify() ===

    @Test
    void testDoModify_ExistingProduct_ReturnsTrue() throws SQLException {
        // Arrange
        ProdottoBean prod = createValidProdottoBean();
        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeUpdate()).thenReturn(1);

        // Act
        boolean result = prodottoDao.doModify(prod);

        // Assert
        assertTrue(result);

        // ✅ CORRETTO: Ordine dei parametri per doModify
        verify(mockPreparedStatement).setString(1, "Croccantini Premium");       // Nome
        verify(mockPreparedStatement).setString(2, "Croccantini per cani adulti"); // Descrizione
        verify(mockPreparedStatement).setDouble(3, 25.989999771118164d);          // Prezzo (valore preciso)
        verify(mockPreparedStatement).setInt(4, 100);                             // Quantita
        verify(mockPreparedStatement).setString(5, "cibo");                       // Tipo
        verify(mockPreparedStatement).setDouble(6, 22.0d);                        // IVA
        verify(mockPreparedStatement).setString(7, "croccantini.jpg");            // Immagine
        verify(mockPreparedStatement).setInt(8, 1);                               // ID (WHERE clause)
        verify(mockPreparedStatement).executeUpdate();
    }


    @Test
    void testDoModify_NonExistingProduct_ReturnsFalse() throws SQLException {
        // Arrange
        ProdottoBean prod = createValidProdottoBean();
        prod.setId(999);

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeUpdate()).thenReturn(0);

        // Act
        boolean result = prodottoDao. doModify(prod);

        // Assert
        assertFalse(result);
    }

    @Test
    void testDoModify_SQLException_Propagated() throws SQLException {
        // Arrange
        ProdottoBean prod = createValidProdottoBean();
        SQLException expectedException = new SQLException("Update failed");
        when(mockDataSource. getConnection()).thenThrow(expectedException);

        // Act & Assert
        SQLException exception = assertThrows(SQLException.class, () -> prodottoDao.doModify(prod));
        assertEquals("Update failed", exception.getMessage());
    }

    @Test
    void testDoModify_ResourcesClosed() throws SQLException {
        // Arrange
        ProdottoBean prod = createValidProdottoBean();

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeUpdate()).thenReturn(1);

        // Act
        prodottoDao.doModify(prod);

        // Assert
        verify(mockPreparedStatement).close();
        verify(mockConnection).close();
    }

    // === TESTS FOR doRetrieveAllByCategory() ===

    @Test
    void testDoRetrieveAllByCategory_ExistingCategory_ReturnsList() throws SQLException {
        // Arrange
        String category = "cibo";

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeQuery()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(true, true, false);

        // Setup complete data to kill SURVIVED mutations (lines 293-300)
        when(mockResultSet.getInt("Id")).thenReturn(1, 2);
        when(mockResultSet.getString("Nome")).thenReturn("Croccantini", "Biscotti");
        when(mockResultSet.getString("Descrizione")).thenReturn("Desc croccantini", "Desc biscotti");
        when(mockResultSet.getFloat("Prezzo")).thenReturn(10.0f, 15.0f);
        when(mockResultSet.getInt("QuantitaDisponibile")).thenReturn(50, 60);
        when(mockResultSet.getString("Tipo")).thenReturn("cibo", "cibo");
        when(mockResultSet. getFloat("IVA")).thenReturn(22.0f, 22.0f);
        when(mockResultSet.getString("immagine")).thenReturn("img1.jpg", "img2.jpg");

        // Act
        ArrayList<ProdottoBean> result = prodottoDao.doRetrieveAllByCategory(category);

        // Assert - Complete verification to kill SURVIVED mutations (lines 293-300)
        assertNotNull(result);
        assertEquals(2, result.size());

        // Verify all fields to kill ALL setter mutations
        assertCompleteProdottoBean(result.get(0), 1, "Croccantini", "Desc croccantini",
                10.0f, 50, tipo.cibo, 22.0f, "img1.jpg");
        assertCompleteProdottoBean(result.get(1), 2, "Biscotti", "Desc biscotti",
                15.0f, 60, tipo.cibo, 22.0f, "img2.jpg");

        verify(mockPreparedStatement).setString(1, category);
    }

    @Test
    void testDoRetrieveAllByCategory_NonExistingCategory_ReturnsEmptyList() throws SQLException {
        // Arrange
        String category = "NonExistent";

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeQuery()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(false);

        // Act
        ArrayList<ProdottoBean> result = prodottoDao.doRetrieveAllByCategory(category);

        // Assert
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    void testDoRetrieveAllByCategory_SQLException_Propagated() throws SQLException {
        // Arrange
        SQLException expectedException = new SQLException("Query failed");
        when(mockDataSource.getConnection()).thenThrow(expectedException);

        // Act & Assert
        SQLException exception = assertThrows(SQLException.class,
                () -> prodottoDao. doRetrieveAllByCategory("cibo"));
        assertEquals("Query failed", exception.getMessage());
    }

    @Test
    void testDoRetrieveAllByCategory_ResourcesClosed() throws SQLException {
        // Arrange
        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection. prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeQuery()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(false);

        // Act
        prodottoDao.doRetrieveAllByCategory("cibo");

        // Assert
        verify(mockPreparedStatement).close();
        verify(mockConnection).close();
    }

    // === TESTS FOR updateQuantity() ===

    @Test
    void testUpdateQuantity_ValidIdAndQuantity_UpdatesSuccessfully() throws SQLException {
        // Arrange
        int id = 1;
        int newQuantity = 200;

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeUpdate()).thenReturn(1);

        // Act
        assertDoesNotThrow(() -> prodottoDao.updateQuantity(id, newQuantity));

        // Assert
        verify(mockPreparedStatement).setInt(1, newQuantity);
        verify(mockPreparedStatement).setInt(2, id);
        verify(mockPreparedStatement).executeUpdate();
    }

    @Test
    void testUpdateQuantity_ZeroQuantity_UpdatesSuccessfully() throws SQLException {
        // Arrange
        int id = 1;
        int newQuantity = 0;

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeUpdate()).thenReturn(1);

        // Act
        assertDoesNotThrow(() -> prodottoDao.updateQuantity(id, newQuantity));

        // Assert
        verify(mockPreparedStatement).setInt(1, 0);
    }

    @Test
    void testUpdateQuantity_SQLException_Propagated() throws SQLException {
        // Arrange
        SQLException expectedException = new SQLException("Update failed");
        when(mockDataSource.getConnection()).thenThrow(expectedException);

        // Act & Assert
        SQLException exception = assertThrows(SQLException. class,
                () -> prodottoDao.updateQuantity(1, 100));
        assertEquals("Update failed", exception. getMessage());
    }

    @Test
    void testUpdateQuantity_ResourcesClosed() throws SQLException {
        // Arrange
        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeUpdate()).thenReturn(1);

        // Act
        prodottoDao.updateQuantity(1, 100);

        // Assert
        verify(mockPreparedStatement).close();
        verify(mockConnection).close();
    }

    // === TESTS FOR doRetrieveAllByKeyword() ===

    @Test
    void testDoRetrieveAllByKeyword_MatchingKeyword_ReturnsList() throws SQLException {
        // Arrange
        String keyword = "cane";
        String query = "";

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection. prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeQuery()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(true, false);

        // Setup complete data to kill SURVIVED mutations (lines 360-367)
        when(mockResultSet.getInt("Id")).thenReturn(1);
        when(mockResultSet.getString("Nome")).thenReturn("Croccantini Premium");
        when(mockResultSet.getString("Descrizione")).thenReturn("Croccantini per cani adulti");
        when(mockResultSet.getFloat("Prezzo")).thenReturn(25.99f);
        when(mockResultSet.getInt("QuantitaDisponibile")).thenReturn(100);
        when(mockResultSet.getString("Tipo")).thenReturn("cibo");
        when(mockResultSet.getFloat("IVA")).thenReturn(22.0f);
        when(mockResultSet.getString("immagine")).thenReturn("croccantini.jpg");

        // Act
        ArrayList<ProdottoBean> result = prodottoDao.doRetrieveAllByKeyword(keyword, query);

        // Assert - Complete verification to kill SURVIVED mutations (lines 360-367)
        assertNotNull(result);
        assertEquals(1, result.size());

        assertCompleteProdottoBean(result. get(0), 1, "Croccantini Premium", "Croccantini per cani adulti",
                25.99f, 100, tipo.cibo, 22.0f, "croccantini.jpg");
    }

    @Test
    void testDoRetrieveAllByKeyword_NoMatch_ReturnsEmptyList() throws SQLException {
        // Arrange
        String keyword = "nonexistent";
        String query = "";

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeQuery()).thenReturn(mockResultSet);
        when(mockResultSet. next()).thenReturn(false);

        // Act
        ArrayList<ProdottoBean> result = prodottoDao. doRetrieveAllByKeyword(keyword, query);

        // Assert
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    void testDoRetrieveAllByKeyword_WithAdditionalQuery_ReturnsList() throws SQLException {
        // Arrange
        String keyword = "cane";
        String query = " ORDER BY Prezzo ASC";

        when(mockDataSource. getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement. executeQuery()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(true, false);

        // Setup complete data
        when(mockResultSet.getInt("Id")).thenReturn(1);
        when(mockResultSet.getString("Nome")).thenReturn("Croccantini Premium");
        when(mockResultSet.getString("Descrizione")).thenReturn("Croccantini per cani adulti");
        when(mockResultSet.getFloat("Prezzo")).thenReturn(25.99f);
        when(mockResultSet.getInt("QuantitaDisponibile")).thenReturn(100);
        when(mockResultSet.getString("Tipo")).thenReturn("cibo");
        when(mockResultSet.getFloat("IVA")).thenReturn(22.0f);
        when(mockResultSet.getString("immagine")).thenReturn("croccantini.jpg");

        // Act
        ArrayList<ProdottoBean> result = prodottoDao. doRetrieveAllByKeyword(keyword, query);

        // Assert
        assertNotNull(result);
        assertEquals(1, result. size());
        assertCompleteProdottoBean(result. get(0), 1, "Croccantini Premium", "Croccantini per cani adulti",
                25.99f, 100, tipo.cibo, 22.0f, "croccantini.jpg");
    }

    @Test
    void testDoRetrieveAllByKeyword_SQLException_Propagated() throws SQLException {
        // Arrange
        SQLException expectedException = new SQLException("Query failed");
        when(mockDataSource.getConnection()).thenThrow(expectedException);

        // Act & Assert
        SQLException exception = assertThrows(SQLException.class,
                () -> prodottoDao. doRetrieveAllByKeyword("keyword", ""));
        assertEquals("Query failed", exception.getMessage());
    }

    @Test
    void testDoRetrieveAllByKeyword_ResourcesClosed() throws SQLException {
        // Arrange
        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeQuery()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(false);

        // Act
        prodottoDao. doRetrieveAllByKeyword("keyword", "");

        // Assert
        verify(mockPreparedStatement).close();
        verify(mockConnection).close();
    }

    // === TESTS FOR doRetrieveAllByName() ===

    @Test
    void testDoRetrieveAllByName_MatchingName_ReturnsList() throws SQLException {
        // Arrange
        String keyword = "Crocc";

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeQuery()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(true, false);

        // Setup complete data to kill SURVIVED mutations (lines 400-407)
        when(mockResultSet.getInt("Id")).thenReturn(1);
        when(mockResultSet.getString("Nome")).thenReturn("Croccantini Premium");
        when(mockResultSet.getString("Descrizione")).thenReturn("Croccantini per cani adulti");
        when(mockResultSet.getFloat("Prezzo")).thenReturn(25.99f);
        when(mockResultSet.getInt("QuantitaDisponibile")).thenReturn(100);
        when(mockResultSet.getString("Tipo")).thenReturn("cibo");
        when(mockResultSet.getFloat("IVA")).thenReturn(22.0f);
        when(mockResultSet.getString("immagine")).thenReturn("croccantini.jpg");

        // Act
        ArrayList<ProdottoBean> result = prodottoDao. doRetrieveAllByName(keyword);

        // Assert - Complete verification to kill SURVIVED mutations (lines 400-407)
        assertNotNull(result);
        assertEquals(1, result. size());

        ProdottoBean product = result.get(0);
        assertTrue(product.getNome().startsWith("Crocc"));
        assertCompleteProdottoBean(product, 1, "Croccantini Premium", "Croccantini per cani adulti",
                25.99f, 100, tipo.cibo, 22.0f, "croccantini.jpg");
    }

    @Test
    void testDoRetrieveAllByName_NoMatch_ReturnsEmptyList() throws SQLException {
        // Arrange
        String keyword = "ZZZ";

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeQuery()).thenReturn(mockResultSet);
        when(mockResultSet. next()).thenReturn(false);

        // Act
        ArrayList<ProdottoBean> result = prodottoDao. doRetrieveAllByName(keyword);

        // Assert
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    void testDoRetrieveAllByName_EmptyKeyword_ReturnsList() throws SQLException {
        // Arrange
        String keyword = "";

        when(mockDataSource. getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement. executeQuery()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(true, false);

        // Setup complete data
        when(mockResultSet. getInt("Id")).thenReturn(1);
        when(mockResultSet.getString("Nome")).thenReturn("Croccantini Premium");
        when(mockResultSet.getString("Descrizione")).thenReturn("Croccantini per cani adulti");
        when(mockResultSet.getFloat("Prezzo")).thenReturn(25.99f);
        when(mockResultSet. getInt("QuantitaDisponibile")).thenReturn(100);
        when(mockResultSet. getString("Tipo")).thenReturn("cibo");
        when(mockResultSet. getFloat("IVA")).thenReturn(22.0f);
        when(mockResultSet.getString("immagine")).thenReturn("croccantini.jpg");

        // Act
        ArrayList<ProdottoBean> result = prodottoDao.doRetrieveAllByName(keyword);

        // Assert
        assertNotNull(result);
        assertEquals(1, result.size());
        assertCompleteProdottoBean(result.get(0), 1, "Croccantini Premium", "Croccantini per cani adulti",
                25.99f, 100, tipo. cibo, 22.0f, "croccantini.jpg");
    }

    @Test
    void testDoRetrieveAllByName_SQLException_Propagated() throws SQLException {
        // Arrange
        SQLException expectedException = new SQLException("Query failed");
        when(mockDataSource.getConnection()).thenThrow(expectedException);

        // Act & Assert
        SQLException exception = assertThrows(SQLException. class,
                () -> prodottoDao.doRetrieveAllByName("keyword"));
        assertEquals("Query failed", exception.getMessage());
    }

    @Test
    void testDoRetrieveAllByName_ResourcesClosed() throws SQLException {
        // Arrange
        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection. prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeQuery()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(false);

        // Act
        prodottoDao.doRetrieveAllByName("keyword");

        // Assert
        verify(mockPreparedStatement).close();
        verify(mockConnection).close();
    }

    // === SYNCHRONIZATION TESTS ===

    @Test
    void testSynchronizedBehavior_MultipleCalls_WorkCorrectly() throws SQLException {
        // Arrange
        when(mockDataSource. getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement. executeQuery()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(false);

        // Act - multiple synchronized calls
        List<ProdottoBean> result1 = prodottoDao.doRetrieveAll();
        ArrayList<ProdottoBean> result2 = prodottoDao.doRetrieveAllLimit();
        ArrayList<ProdottoBean> result3 = prodottoDao. doRetrieveAllByCategory("cibo");

        // Assert
        assertNotNull(result1);
        assertNotNull(result2);
        assertNotNull(result3);
    }

    // === EDGE CASES ===

    @Test
    void testDoRetrieveByKey_NegativeId_HandledCorrectly() throws SQLException {
        // Arrange
        int id = -1;

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeQuery()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(false);

        // Act
        ProdottoBean result = prodottoDao.doRetrieveByKey(id);

        // Assert
        assertNull(result);
        verify(mockPreparedStatement).setInt(1, -1);
    }

    @Test
    void testDoDelete_NegativeId_ReturnsFalse() throws SQLException {
        // Arrange
        int id = -1;

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeUpdate()).thenReturn(0);

        // Act
        boolean result = prodottoDao.doDelete(id);

        // Assert
        assertFalse(result);
    }

    @Test
    void testUpdateQuantity_NegativeQuantity_ExecutesUpdate() throws SQLException {
        // Arrange
        int id = 1;
        int newQuantity = -10;

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeUpdate()).thenReturn(1);

        // Act - no validation in DAO, so this should execute
        assertDoesNotThrow(() -> prodottoDao.updateQuantity(id, newQuantity));

        // Assert
        verify(mockPreparedStatement).setInt(1, -10);
    }
    @Test
    void testDoSave_ConnectionCloseException_HandledCorrectly() throws SQLException {
        // Test per coprire il mutante SURVIVED alla riga 74
        ProdottoBean prod = createValidProdottoBean();

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString(), eq(Statement.RETURN_GENERATED_KEYS)))
                .thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeUpdate()).thenReturn(1);
        when(mockPreparedStatement.getGeneratedKeys()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(false);

        // Simulate exception on connection close
        doThrow(new SQLException("Connection close failed")).when(mockConnection).close();

        // L'eccezione durante la chiusura viene propagata
        SQLException exception = assertThrows(SQLException.class, () -> prodottoDao.doSave(prod));
        assertEquals("Connection close failed", exception.getMessage());

        verify(mockConnection).close(); // Verify close was attempted
    }

}