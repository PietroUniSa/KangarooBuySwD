package ita.kangaroo.dao;

import ita.kangaroo.model.ProdottoBean;
import ita.kangaroo.model.tipo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import javax.sql.DataSource;
import java.lang.reflect.Field;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;

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
        prod.setPrezzo(25.99f);
        prod.setQuantita(100);
        prod.setTipo(tipo.cibo);
        prod.setIva(22.0f);
        prod.setImmagine("croccantini.jpg");
        return prod;
    }

    private void setupResultSetForProduct() throws SQLException {
        when(mockResultSet.getInt("Id")).thenReturn(1);
        when(mockResultSet.getString("Nome")).thenReturn("Croccantini Premium");
        when(mockResultSet.getString("Descrizione")).thenReturn("Croccantini per cani adulti");
        when(mockResultSet.getFloat("Prezzo")).thenReturn(25.99f);
        when(mockResultSet.getInt("QuantitaDisponibile")).thenReturn(100);
        when(mockResultSet.getString("Tipo")).thenReturn("cibo"); // cambiato da "Cibo" a "cibo"
        when(mockResultSet.getFloat("IVA")).thenReturn(22.0f);
        when(mockResultSet.getString("immagine")).thenReturn("croccantini.jpg");
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
        verify(mockPreparedStatement).setInt(1, 1);
        verify(mockPreparedStatement).setString(2, "Croccantini Premium");
        verify(mockPreparedStatement).setString(3, "Croccantini per cani adulti");
        verify(mockPreparedStatement).setDouble(4, 25.99f);
        verify(mockPreparedStatement).setInt(5, 100);
        verify(mockPreparedStatement).setString(6, "cibo"); // era sulla posizione sbagliata
        verify(mockPreparedStatement).setDouble(7, 22.0f);
        verify(mockPreparedStatement).setString(8, "croccantini.jpg");
        verify(mockPreparedStatement).executeUpdate();
    }

    @Test
    void testDoSave_NoGeneratedKey_ReturnsMinusOne() throws SQLException {
        // Arrange
        ProdottoBean prod = createValidProdottoBean();

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString(), eq(Statement.RETURN_GENERATED_KEYS)))
                .thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeUpdate()).thenReturn(1);
        when(mockPreparedStatement.getGeneratedKeys()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(false);

        // Act
        int result = prodottoDao.doSave(prod);

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
        SQLException exception = assertThrows(SQLException.class, () -> prodottoDao.doSave(prod));
        assertEquals("Connection failed", exception.getMessage());
    }

    @Test
    void testDoSave_ExecuteUpdateFails_ThrowsSQLException() throws SQLException {
        // Arrange
        ProdottoBean prod = createValidProdottoBean();
        SQLException expectedException = new SQLException("Execute update failed");

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString(), eq(Statement.RETURN_GENERATED_KEYS)))
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
        prodottoDao.doSave(prod);

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

        // Assert
        assertNotNull(result);
        assertEquals(1, result.getId());
        assertEquals("Croccantini Premium", result.getNome());
        assertEquals("Croccantini per cani adulti", result.getDescrizione());
        assertEquals(25.99f, result.getPrezzo(), 0.001);
        assertEquals(100, result.getQuantita());
        assertEquals(tipo.cibo, result.getTipo());
        assertEquals(22.0f, result.getIva(), 0.001);
        assertEquals("croccantini.jpg", result.getImmagine());
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
        ProdottoBean result = prodottoDao.doRetrieveByKey(id);

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
        SQLException exception = assertThrows(SQLException.class, () -> prodottoDao.doRetrieveByKey(1));
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
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
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
        boolean result = prodottoDao.doDelete(id);

        // Assert
        assertFalse(result);
        verify(mockPreparedStatement).setInt(1, id);
    }

    @Test
    void testDoDelete_SQLException_Propagated() throws SQLException {
        // Arrange
        SQLException expectedException = new SQLException("Delete failed");
        when(mockDataSource.getConnection()).thenThrow(expectedException);

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
        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeQuery()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(true, true, false);

        when(mockResultSet.getInt("Id")).thenReturn(1, 2);
        when(mockResultSet.getString("Nome")).thenReturn("Prodotto 1", "Prodotto 2");
        when(mockResultSet.getString("Descrizione")).thenReturn("Descrizione 1", "Descrizione 2");
        when(mockResultSet.getFloat("Prezzo")).thenReturn(10.0f, 20.0f);
        when(mockResultSet.getInt("QuantitaDisponibile")).thenReturn(50, 100);
        when(mockResultSet.getString("Tipo")).thenReturn("cibo", "accessorio");
        when(mockResultSet.getFloat("IVA")).thenReturn(22.0f, 22.0f);
        when(mockResultSet.getString("immagine")).thenReturn("img1.jpg", "img2.jpg");

        // Act
        List<ProdottoBean> result = prodottoDao.doRetrieveAll();

        // Assert
        assertNotNull(result);
        assertEquals(2, result.size());
        assertEquals(1, result.get(0).getId());
        assertEquals("Prodotto 1", result.get(0).getNome());
        assertEquals(2, result.get(1).getId());
        assertEquals("Prodotto 2", result.get(1).getNome());
    }

    @Test
    void testDoRetrieveAll_NoProducts_ReturnsEmptyList() throws SQLException {
        // Arrange
        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeQuery()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(false);

        // Act
        List<ProdottoBean> result = prodottoDao.doRetrieveAll();

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
        SQLException exception = assertThrows(SQLException.class, () -> prodottoDao.doRetrieveAll());
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
        prodottoDao.doRetrieveAll();

        // Assert
        verify(mockPreparedStatement).close();
        verify(mockConnection).close();
    }

    // === TESTS FOR doRetrieveAllLimit() ===

    @Test
    void testDoRetrieveAllLimit_ReturnsMaxTenProducts() throws SQLException {
        // Arrange
        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeQuery()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(true, true, true, false);

        when(mockResultSet.getInt("Id")).thenReturn(1, 2, 3);
        when(mockResultSet.getString("Nome")).thenReturn("Prodotto 1", "Prodotto 2", "Prodotto 3");
        when(mockResultSet.getString("Descrizione")).thenReturn("Desc 1", "Desc 2", "Desc 3");
        when(mockResultSet.getFloat("Prezzo")).thenReturn(10.0f, 20.0f, 30.0f);
        when(mockResultSet.getInt("QuantitaDisponibile")).thenReturn(50, 100, 150);
        when(mockResultSet.getString("Tipo")).thenReturn("cibo", "accessorio", "animale");
        when(mockResultSet.getFloat("IVA")).thenReturn(22.0f, 22.0f, 22.0f);
        when(mockResultSet.getString("immagine")).thenReturn("img1.jpg", "img2.jpg", "img3.jpg");

        // Act
        ArrayList<ProdottoBean> result = prodottoDao.doRetrieveAllLimit();

        // Assert
        assertNotNull(result);
        assertEquals(3, result.size());
    }

    @Test
    void testDoRetrieveAllLimit_NoProducts_ReturnsEmptyList() throws SQLException {
        // Arrange
        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeQuery()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(false);

        // Act
        ArrayList<ProdottoBean> result = prodottoDao.doRetrieveAllLimit();

        // Assert
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    void testDoRetrieveAllLimit_SQLException_Propagated() throws SQLException {
        // Arrange
        SQLException expectedException = new SQLException("Query failed");
        when(mockDataSource.getConnection()).thenThrow(expectedException);

        // Act & Assert
        SQLException exception = assertThrows(SQLException.class, () -> prodottoDao.doRetrieveAllLimit());
        assertEquals("Query failed", exception.getMessage());
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
        verify(mockPreparedStatement).setString(1, "Croccantini Premium");
        verify(mockPreparedStatement).setString(2, "Croccantini per cani adulti");
        verify(mockPreparedStatement).setDouble(3, 25.99f);
        verify(mockPreparedStatement).setInt(4, 100);
        verify(mockPreparedStatement).setString(5, "cibo");
        verify(mockPreparedStatement).setDouble(6, 22.0f);
        verify(mockPreparedStatement).setString(7, "croccantini.jpg");
        verify(mockPreparedStatement).setInt(8, 1);
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
        boolean result = prodottoDao.doModify(prod);

        // Assert
        assertFalse(result);
    }

    @Test
    void testDoModify_SQLException_Propagated() throws SQLException {
        // Arrange
        ProdottoBean prod = createValidProdottoBean();
        SQLException expectedException = new SQLException("Update failed");
        when(mockDataSource.getConnection()).thenThrow(expectedException);

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

        when(mockResultSet.getInt("Id")).thenReturn(1, 2);
        when(mockResultSet.getString("Nome")).thenReturn("Croccantini", "Biscotti");
        when(mockResultSet.getString("Descrizione")).thenReturn("Desc 1", "Desc 2");
        when(mockResultSet.getFloat("Prezzo")).thenReturn(10.0f, 15.0f);
        when(mockResultSet.getInt("QuantitaDisponibile")).thenReturn(50, 60);
        when(mockResultSet.getString("Tipo")).thenReturn("cibo", "cibo");
        when(mockResultSet.getFloat("IVA")).thenReturn(22.0f, 22.0f);
        when(mockResultSet.getString("immagine")).thenReturn("img1.jpg", "img2.jpg");

        // Act
        ArrayList<ProdottoBean> result = prodottoDao.doRetrieveAllByCategory(category);

        // Assert
        assertNotNull(result);
        assertEquals(2, result.size());
        assertEquals(tipo.cibo, result.get(0).getTipo());
        assertEquals(tipo.cibo, result.get(1).getTipo());
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
                () -> prodottoDao.doRetrieveAllByCategory("cibo"));
        assertEquals("Query failed", exception.getMessage());
    }

    @Test
    void testDoRetrieveAllByCategory_ResourcesClosed() throws SQLException {
        // Arrange
        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
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
        SQLException exception = assertThrows(SQLException.class,
                () -> prodottoDao.updateQuantity(1, 100));
        assertEquals("Update failed", exception.getMessage());
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
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeQuery()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(true, false);
        setupResultSetForProduct();

        // Act
        ArrayList<ProdottoBean> result = prodottoDao.doRetrieveAllByKeyword(keyword, query);

        // Assert
        assertNotNull(result);
        assertEquals(1, result.size());
    }

    @Test
    void testDoRetrieveAllByKeyword_NoMatch_ReturnsEmptyList() throws SQLException {
        // Arrange
        String keyword = "nonexistent";
        String query = "";

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeQuery()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(false);

        // Act
        ArrayList<ProdottoBean> result = prodottoDao.doRetrieveAllByKeyword(keyword, query);

        // Assert
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    void testDoRetrieveAllByKeyword_WithAdditionalQuery_ReturnsList() throws SQLException {
        // Arrange
        String keyword = "cane";
        String query = " ORDER BY Prezzo ASC";

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeQuery()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(true, false);
        setupResultSetForProduct();

        // Act
        ArrayList<ProdottoBean> result = prodottoDao.doRetrieveAllByKeyword(keyword, query);

        // Assert
        assertNotNull(result);
        assertEquals(1, result.size());
    }

    @Test
    void testDoRetrieveAllByKeyword_SQLException_Propagated() throws SQLException {
        // Arrange
        SQLException expectedException = new SQLException("Query failed");
        when(mockDataSource.getConnection()).thenThrow(expectedException);

        // Act & Assert
        SQLException exception = assertThrows(SQLException.class,
                () -> prodottoDao.doRetrieveAllByKeyword("keyword", ""));
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
        prodottoDao.doRetrieveAllByKeyword("keyword", "");

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
        setupResultSetForProduct();

        // Act
        ArrayList<ProdottoBean> result = prodottoDao.doRetrieveAllByName(keyword);

        // Assert
        assertNotNull(result);
        assertEquals(1, result.size());
        assertTrue(result.get(0).getNome().startsWith("Crocc"));
    }

    @Test
    void testDoRetrieveAllByName_NoMatch_ReturnsEmptyList() throws SQLException {
        // Arrange
        String keyword = "ZZZ";

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeQuery()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(false);

        // Act
        ArrayList<ProdottoBean> result = prodottoDao.doRetrieveAllByName(keyword);

        // Assert
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    void testDoRetrieveAllByName_EmptyKeyword_ReturnsList() throws SQLException {
        // Arrange
        String keyword = "";

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeQuery()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(true, false);
        setupResultSetForProduct();

        // Act
        ArrayList<ProdottoBean> result = prodottoDao.doRetrieveAllByName(keyword);

        // Assert
        assertNotNull(result);
        assertEquals(1, result.size());
    }

    @Test
    void testDoRetrieveAllByName_SQLException_Propagated() throws SQLException {
        // Arrange
        SQLException expectedException = new SQLException("Query failed");
        when(mockDataSource.getConnection()).thenThrow(expectedException);

        // Act & Assert
        SQLException exception = assertThrows(SQLException.class,
                () -> prodottoDao.doRetrieveAllByName("keyword"));
        assertEquals("Query failed", exception.getMessage());
    }

    @Test
    void testDoRetrieveAllByName_ResourcesClosed() throws SQLException {
        // Arrange
        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
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
        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeQuery()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(false);

        // Act - multiple synchronized calls
        List<ProdottoBean> result1 = prodottoDao.doRetrieveAll();
        ArrayList<ProdottoBean> result2 = prodottoDao.doRetrieveAllLimit();
        ArrayList<ProdottoBean> result3 = prodottoDao.doRetrieveAllByCategory("cibo");

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
}

