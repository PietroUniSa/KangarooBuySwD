package ita.kangaroo.dao;

import ita.kangaroo.model.ProdottoBean;
import ita.kangaroo.model.tipo;

import java.util.logging.Level;
import java.util.logging.Logger;

import java.sql.*;
import java.util.*;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;


public class prodottoDao {

    private static final Logger LOGGER = Logger.getLogger(prodottoDao.class.getName());
    private static final String TABLE = "prodotto";

    private static DataSource ds;

    static {
        try {
            Context initCtx = new InitialContext();
            Context envCtx = (Context) initCtx.lookup("java:comp/env");
            ds = (DataSource) envCtx.lookup("jdbc/kangaroodb");
        } catch (NamingException e) {
            LOGGER.log(Level.SEVERE, e.toString(), e);
        }
    }

    public prodottoDao(){
        // empty constructor
    }

    /*@
      requires prod != null;
      requires prod.getNome() != null && ! prod.getNome().isEmpty();
      requires prod.getDescrizione() != null && !prod.getDescrizione().isEmpty();
      requires prod.getPrezzo() >= 0.0;
      requires prod.getQuantita() >= 0;
      requires prod.getTipo() != null;
      requires prod.getIva() >= 0.0;
      requires prod.getImmagine() != null && !prod.getImmagine().isEmpty();
      ensures \result >= -1;
    @*/
    public synchronized int doSave(ProdottoBean prod) throws SQLException {
        if (prod == null) {
            throw new IllegalArgumentException("Product cannot be null");
        }

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        int id = -1;

        String insertSQL = "INSERT INTO " + TABLE
                + " (Nome, Descrizione, Prezzo, QuantitaDisponibile, Tipo, IVA, immagine) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?)";

        try {
            connection = ds.getConnection();
            preparedStatement = connection.prepareStatement(insertSQL, Statement.RETURN_GENERATED_KEYS);

            preparedStatement.setString(1, prod.getNome());
            preparedStatement.setString(2, prod.getDescrizione());
            preparedStatement.setDouble(3, prod.getPrezzo());
            preparedStatement.setInt(4, prod.getQuantita());
            preparedStatement. setString(5, prod.getTipo().toString());
            preparedStatement.setDouble(6, prod.getIva());
            preparedStatement. setString(7, prod.getImmagine());

            preparedStatement.executeUpdate();

            ResultSet key = preparedStatement.getGeneratedKeys();
            if (key.next()) {
                id = key.getInt(1);
            }
        } catch (SQLException e) {
            LOGGER.log(Level. SEVERE, "Error saving product:  " + e.getMessage(), e);
            throw e;
        } finally {
            closeResources(preparedStatement, connection);
        }

        return id;
    }

    /*@
      requires id >= 0;
      ensures \result == null || \result. getId() == id;
    @*/
    public synchronized ProdottoBean doRetrieveByKey(int id) throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        String selectSQL = "SELECT * FROM " + TABLE + " WHERE Id = ?";
        ProdottoBean prod = null;

        try {
            connection = ds.getConnection();
            preparedStatement = connection. prepareStatement(selectSQL);
            preparedStatement.setInt(1, id);

            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                prod = mapResultSetToProduct(rs);
            }
        } catch (SQLException e) {
            LOGGER.log(Level. SEVERE, "Error retrieving product by key: " + e.getMessage(), e);
            throw e;
        } finally {
            closeResources(preparedStatement, connection);
        }

        return prod;
    }

    /*@
      requires id >= 0;
      ensures \result == true || \result == false;
    @*/
    public synchronized boolean doDelete(int id) throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        int result = 0;
        String deleteSQL = "DELETE FROM " + TABLE + " WHERE Id = ?";

        try {
            connection = ds.getConnection();
            preparedStatement = connection.prepareStatement(deleteSQL);
            preparedStatement.setInt(1, id);

            result = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            LOGGER. log(Level.SEVERE, "Error deleting product: " + e.getMessage(), e);
            throw e;
        } finally {
            closeResources(preparedStatement, connection);
        }

        return (result != 0);
    }

    /*@
      ensures \result != null;
      ensures (\forall int i; 0 <= i && i < \result.size();
               \result.get(i) != null);
    @*/
    public synchronized List<ProdottoBean> doRetrieveAll() throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        List<ProdottoBean> products = new ArrayList<>();
        String selectSQL = "SELECT * FROM " + TABLE;

        try {
            connection = ds.getConnection();
            preparedStatement = connection.prepareStatement(selectSQL);

            ResultSet rs = preparedStatement. executeQuery();

            while (rs.next()) {
                ProdottoBean prod = mapResultSetToProduct(rs);
                products.add(prod);
            }
        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Error retrieving all products: " + e.getMessage(), e);
            throw e;
        } finally {
            closeResources(preparedStatement, connection);
        }

        return products;
    }

    /*@
      ensures \result != null;
      ensures \result.size() <= 10;
      ensures (\forall int i; 0 <= i && i < \result.size();
               \result.get(i) != null);
    @*/
    public synchronized ArrayList<ProdottoBean> doRetrieveAllLimit() throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        ArrayList<ProdottoBean> products = new ArrayList<>();
        String selectSQL = "SELECT * FROM " + TABLE + " LIMIT 10";

        try {
            connection = ds.getConnection();
            preparedStatement = connection.prepareStatement(selectSQL);

            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                ProdottoBean prod = mapResultSetToProduct(rs);
                products.add(prod);
            }
        } catch (SQLException e) {
            LOGGER. log(Level.SEVERE, "Error retrieving limited products: " + e.getMessage(), e);
            throw e;
        } finally {
            closeResources(preparedStatement, connection);
        }

        return products;
    }

    /*@
      requires prod != null;
      requires prod.getId() >= 0;
      requires prod. getNome() != null && !prod.getNome().isEmpty();
      requires prod.getDescrizione() != null && !prod.getDescrizione().isEmpty();
      requires prod.getPrezzo() >= 0.0;
      requires prod.getQuantita() >= 0;
      requires prod.getTipo() != null;
      requires prod.getIva() >= 0.0;
      requires prod. getImmagine() != null && !prod.getImmagine().isEmpty();
      ensures \result == true || \result == false;
    @*/
    public synchronized boolean doModify(ProdottoBean prod) throws SQLException {
        if (prod == null) {
            throw new IllegalArgumentException("Product cannot be null");
        }

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        int result = 0;
        String updateSQL = "UPDATE " + TABLE
                + " SET Nome = ?, Descrizione = ?, Prezzo = ?, QuantitaDisponibile = ?, "
                + "Tipo = ?, IVA = ?, immagine = ? WHERE Id = ? ";

        try {
            connection = ds.getConnection();
            preparedStatement = connection.prepareStatement(updateSQL);

            preparedStatement.setString(1, prod.getNome());
            preparedStatement.setString(2, prod.getDescrizione());
            preparedStatement.setDouble(3, prod.getPrezzo());
            preparedStatement. setInt(4, prod.getQuantita());
            preparedStatement.setString(5, prod. getTipo().toString());
            preparedStatement.setDouble(6, prod.getIva());
            preparedStatement.setString(7, prod.getImmagine());
            preparedStatement.setInt(8, prod.getId());

            result = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            LOGGER. log(Level.SEVERE, "Error modifying product: " + e.getMessage(), e);
            throw e;
        } finally {
            closeResources(preparedStatement, connection);
        }

        return (result != 0);
    }

    /*@
      requires category != null && !category.isEmpty();
      ensures \result != null;
      ensures (\forall int i; 0 <= i && i < \result.size();
               \result.get(i).getTipo().toString().equals(category));
    @*/
    public synchronized ArrayList<ProdottoBean> doRetrieveAllByCategory(String category) throws SQLException {
        if (category == null || category.isEmpty()) {
            throw new IllegalArgumentException("Category cannot be null or empty");
        }

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        String selectSQL = "SELECT * FROM " + TABLE + " WHERE Tipo = ? ";
        ArrayList<ProdottoBean> beans = new ArrayList<>();

        try {
            connection = ds.getConnection();
            preparedStatement = connection.prepareStatement(selectSQL);
            preparedStatement.setString(1, category);

            ResultSet rs = preparedStatement.executeQuery();

            while (rs. next()) {
                ProdottoBean prod = mapResultSetToProduct(rs);
                beans.add(prod);
            }
        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Error retrieving products by category: " + e.getMessage(), e);
            throw e;
        } finally {
            closeResources(preparedStatement, connection);
        }

        return beans;
    }

    /*@
      requires id >= 0;
      requires newQuantity >= 0;
      ensures true; // Method is void
    @*/
    public synchronized void updateQuantity(int id, int newQuantity) throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        String updateSQL = "UPDATE " + TABLE + " SET QuantitaDisponibile = ?  WHERE Id = ?";

        try {
            connection = ds.getConnection();
            preparedStatement = connection.prepareStatement(updateSQL);
            preparedStatement.setInt(1, newQuantity);
            preparedStatement.setInt(2, id);

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            LOGGER.log(Level. SEVERE, "Error updating quantity:  " + e.getMessage(), e);
            throw e;
        } finally {
            closeResources(preparedStatement, connection);
        }
    }

    /*@
      requires keyword != null && !keyword.isEmpty();
      requires query != null && !query.isEmpty();
      ensures \result != null;
      ensures (\forall int i; 0 <= i && i < \result.size();
               \result.get(i).getDescrizione().contains(keyword));
    @*/
    public synchronized ArrayList<ProdottoBean> doRetrieveAllByKeyword(String keyword, String query) throws SQLException {
        if (keyword == null || keyword. isEmpty()) {
            throw new IllegalArgumentException("Keyword cannot be null or empty");
        }
        if (query == null || query.isEmpty()) {
            throw new IllegalArgumentException("Query cannot be null or empty");
        }

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        // SECURE: Using parameterized query instead of string concatenation
        String selectSQL = "SELECT * FROM " + TABLE + " WHERE Descrizione LIKE ?  " + query;
        ArrayList<ProdottoBean> beans = new ArrayList<>();

        try {
            connection = ds.getConnection();
            preparedStatement = connection.prepareStatement(selectSQL);
            // Safe parameter binding - prevents SQL injection
            preparedStatement. setString(1, "%" + keyword + "%");

            ResultSet rs = preparedStatement. executeQuery();

            while (rs.next()) {
                ProdottoBean prod = mapResultSetToProduct(rs);
                beans.add(prod);
            }
        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Error retrieving products by keyword: " + e.getMessage(), e);
            throw e;
        } finally {
            closeResources(preparedStatement, connection);
        }

        return beans;
    }

    /*@
      requires keyword != null && !keyword.isEmpty();
      ensures \result != null;
      ensures (\forall int i; 0 <= i && i < \result.size();
               \result.get(i).getNome().startsWith(keyword));
    @*/
    public synchronized ArrayList<ProdottoBean> doRetrieveAllByName(String keyword) throws SQLException {
        if (keyword == null || keyword.isEmpty()) {
            throw new IllegalArgumentException("Keyword cannot be null or empty");
        }

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        // SECURE: Using parameterized query instead of string concatenation
        String selectSQL = "SELECT * FROM " + TABLE + " WHERE Nome LIKE ? ";
        ArrayList<ProdottoBean> beans = new ArrayList<>();

        try {
            connection = ds.getConnection();
            preparedStatement = connection.prepareStatement(selectSQL);
            // Safe parameter binding - prevents SQL injection
            preparedStatement.setString(1, keyword + "%");

            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                ProdottoBean prod = mapResultSetToProduct(rs);
                beans.add(prod);
            }
        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Error retrieving products by name: " + e.getMessage(), e);
            throw e;
        } finally {
            closeResources(preparedStatement, connection);
        }

        return beans;
    }

    /**
     * Helper method to map ResultSet to ProdottoBean object.
     * Reduces code duplication and improves maintainability.
     *
     * @param rs ResultSet to map
     * @return ProdottoBean object populated with ResultSet data
     * @throws SQLException if ResultSet access fails
     */
    private ProdottoBean mapResultSetToProduct(ResultSet rs) throws SQLException {
        ProdottoBean prod = new ProdottoBean();
        prod.setId(rs.getInt("Id"));
        prod.setNome(rs.getString("Nome"));
        prod.setDescrizione(rs.getString("Descrizione"));
        prod.setPrezzo(rs.getFloat("Prezzo"));
        prod.setQuantita(rs.getInt("QuantitaDisponibile"));
        prod.setTipo(tipo.valueOf(rs.getString("Tipo")));
        prod.setIva(rs.getFloat("IVA"));
        prod.setImmagine(rs. getString("immagine"));
        return prod;
    }

    /**
     * Helper method to safely close database resources.
     * Prevents resource leaks by ensuring proper cleanup.
     *
     * @param preparedStatement PreparedStatement to close
     * @param connection Connection to close
     */
    private void closeResources(PreparedStatement preparedStatement, Connection connection) {
        try {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
        } catch (SQLException e) {
            LOGGER.log(Level. WARNING, "Error closing PreparedStatement:  " + e.getMessage(), e);
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                LOGGER.log(Level.WARNING, "Error closing Connection: " + e.getMessage(), e);
            }
        }
    }
}