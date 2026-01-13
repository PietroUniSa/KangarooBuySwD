package ita.kangaroo.dao;

import ita.kangaroo.model.OrderProductBean;
import ita.kangaroo.model.OrdineBean;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OrdineDao {

    private static final Logger LOGGER = Logger.getLogger(OrdineDao.class.getName() );
    private static final String TABLE_NAME = "ordine";


    private static DataSource ds;

    static {
        try {
            Context initCtx = new InitialContext();
            Context envCtx = (Context) initCtx.lookup("java:comp/env");

            ds = (DataSource) envCtx.lookup("jdbc/kangaroodb");

        } catch (NamingException e) {
            LOGGER.log( Level.SEVERE, e.toString(), e );
        }
    }

    public OrdineDao(){
        //costruttore vuoto
    }
    /**
     * @requires order != null;
     * @ensures (\exists OrdineBean o; o.getId() == order.getId(); o.equals(order));
     * @throws SQLException if a database access error occurs.
     */
    public void doSave(OrdineBean order) throws SQLException {
        // Validazione dei dati in ingresso
        if (order == null || order.getClient() == null || order.getClient().getUsername() == null) {
            throw new IllegalArgumentException("Order or client information is invalid.");
        }

        String insertSQL = "INSERT INTO " + TABLE_NAME +
                " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        // Miglioramento: Uso di try-with-resources per gestire le risorse
        try (Connection connection = ds.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(insertSQL)) {

            preparedStatement.setInt(1, order.getId());
            preparedStatement.setString(2, order.getClient().getUsername());
            preparedStatement.setFloat(3, order.getPrezzo_totale());
            preparedStatement.setString(4, order.getDestinatario());
            preparedStatement.setString(5, order.getMetodo_di_pagamento());
            preparedStatement.setString(6, order.getCircuito());
            preparedStatement.setString(7, order.getNumero_carta());
            preparedStatement.setString(8, order.getIndirizzo_di_spedizione());
            preparedStatement.setString(9, order.getNumero_di_tracking());
            preparedStatement.setDate(10, order.getData());
            preparedStatement.setString(11, order.getMetodo_di_spedizione());

            preparedStatement.executeUpdate();

            ComposizioneDao model = new ComposizioneDao();
            for (OrderProductBean prodotto : order.getProducts()) {
                model.doSave(prodotto);
            }
        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Error saving order: " + e.getMessage(), e);
            throw e;
        }
    }
    /**
     * @requires id > 0;
     * @ensures (\result != null) && (\result.getId() == id);
     * @throws SQLException if a database access error occurs.
     */
    public OrdineBean doRetrieveByKey(int id) throws SQLException {
        // Validazione dell'input
        if (id <= 0) {
            throw new IllegalArgumentException("Invalid order ID.");
        }

        String selectSQL = "SELECT * FROM " + TABLE_NAME + " WHERE Id = ?";
        try (Connection connection = ds.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(selectSQL)) {

            preparedStatement.setInt(1, id);

            try (ResultSet rs = preparedStatement.executeQuery()) {
                if (rs.next()) {
                    OrdineBean bean = new OrdineBean();
                    bean.setId(rs.getInt("Id"));
                    bean.setClient(new utenteDao().doRetrieveByKey(rs.getString("Username")) );
                    bean.setPrezzo_totale(rs.getFloat("PrezzoTotale"));
                    bean.setDestinatario(rs.getString("destinatario"));
                    bean.setMetodo_di_pagamento(rs.getString("metodo_di_pagamento"));
                    bean.setCircuito(rs.getString("circuito"));
                    bean.setNumero_carta(rs.getString("numero_carta"));
                    bean.setIndirizzo_di_spedizione(rs.getString("indirizzo_di_spedizione"));
                    bean.setNumero_di_tracking(rs.getString("numero_di_tracking"));
                    bean.setData(rs.getDate("data"));
                    bean.setMetodo_di_spedizione(rs.getString("metodo_di_spedizione"));
                    return bean;
                }
            }
        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Error retrieving order by key: " + e.getMessage(), e);
            throw e;
        }
        return null;
    }
    /**
     * @ensures (\result != null) && (\result.getId() ==
     *          (\max OrdineBean o; o in ordine; o.getId()));
     * @throws SQLException if a database access error occurs.
     */
    public synchronized OrdineBean lastOrder() throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        utenteDao userModel = new utenteDao();

        OrdineBean bean = new OrdineBean();

        String selectSQL = "SELECT * FROM " + TABLE_NAME + " ORDER BY Id DESC LIMIT 1";

        try {
            connection = ds.getConnection();
            preparedStatement = connection.prepareStatement(selectSQL);

            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                bean.setId(rs.getInt("Id"));
                bean.setClient(userModel.doRetrieveByKey(rs.getString("Username")) );
                bean.setPrezzo_totale(rs.getFloat("PrezzoTotale"));
                bean.setDestinatario(rs.getString("destinatario"));
                bean.setMetodo_di_pagamento(rs.getString("metodo_di_pagamento"));
                bean.setCircuito(rs.getString("circuito"));
                bean.setNumero_carta(rs.getString("numero_carta"));
                bean.setIndirizzo_di_spedizione(rs.getString("indirizzo_di_spedizione"));
                bean.setNumero_di_tracking(rs.getString("numero_di_tracking"));
                bean.setData(rs.getDate("data"));
                bean.setMetodo_di_spedizione(rs.getString("metodo_di_spedizione"));
            }

        } finally {
            try {
                if (preparedStatement != null)
                    preparedStatement.close();
            } finally {
                if (connection != null)
                    connection.close();
            }
        }
        return bean;
    }
    /**
     * @requires username != null && !username.isEmpty();
     * @ensures (\forall OrdineBean o; o in \result; o.getClient().getUsername().equals(username));
     * @throws SQLException if a database access error occurs.
     */
    public ArrayList<OrdineBean> doRetrieveByClient(String username) throws SQLException {
        // Validazione dell'input
        if (username == null || username.isEmpty()) {
            throw new IllegalArgumentException("Username cannot be null or empty.");
        }

        String selectSQL = "SELECT * FROM " + TABLE_NAME + " WHERE Username = ? ORDER BY Id DESC";
        ArrayList<OrdineBean> orders = new ArrayList<>();

        try (Connection connection = ds.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(selectSQL)) {

            preparedStatement.setString(1, username);

            try (ResultSet rs = preparedStatement.executeQuery()) {
                while (rs.next()) {
                    OrdineBean bean = new OrdineBean();

                    bean.setId(rs.getInt("Id"));
                    bean.setClient(new utenteDao().doRetrieveByKey(rs.getString("Username")) );
                    bean.setPrezzo_totale(rs.getFloat("PrezzoTotale"));
                    bean.setDestinatario(rs.getString("destinatario"));
                    bean.setMetodo_di_pagamento(rs.getString("metodo_di_pagamento"));
                    bean.setCircuito(rs.getString("circuito"));
                    bean.setNumero_carta(rs.getString("numero_carta"));
                    bean.setIndirizzo_di_spedizione(rs.getString("indirizzo_di_spedizione"));
                    bean.setNumero_di_tracking(rs.getString("numero_di_tracking"));
                    bean.setData(rs.getDate("data"));
                    bean.setMetodo_di_spedizione(rs.getString("metodo_di_spedizione"));

                    orders.add(bean);
                }
            }
        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Error retrieving orders by client: " + e.getMessage(), e);
            throw e;
        }
        return orders;
    }
    /**
     * @requires username != null && !username.isEmpty() && data_da != null && data_a != null;
     * @ensures (\forall OrdineBean o; o in \result;
     *          o.getClient().getUsername().equals(username) &&
     *          o.getData().compareTo(Date.valueOf(data_da)) >= 0 &&
     *          o.getData().compareTo(Date.valueOf(data_a)) <= 0);
     * @throws SQLException if a database access error occurs.
     */
    public synchronized ArrayList<OrdineBean> ClientDateOrders(String username, String data_da, String data_a) throws SQLException {
        // Validazione dell'input
        if (username == null || username.isEmpty() || data_da == null || data_a == null) {
            throw new IllegalArgumentException("Invalid input parameters.");
        }

        String selectSQL = "SELECT * FROM " + TABLE_NAME + " WHERE Username = ? AND data >= ? AND data <= ? ORDER BY Id DESC";
        ArrayList<OrdineBean> orders = new ArrayList<>();

        try (Connection connection = ds.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(selectSQL)) {

            preparedStatement.setString(1, username);
            preparedStatement.setString(2, data_da);
            preparedStatement.setString(3, data_a);

            try (ResultSet rs = preparedStatement.executeQuery()) {
                while (rs.next()) {
                    OrdineBean bean = new OrdineBean();

                    bean.setId(rs.getInt("Id"));
                    bean.setClient(new utenteDao().doRetrieveByKey(rs.getString("Username")) );
                    bean.setPrezzo_totale(rs.getFloat("PrezzoTotale"));
                    bean.setDestinatario(rs.getString("destinatario"));
                    bean.setMetodo_di_pagamento(rs.getString("metodo_di_pagamento"));
                    bean.setCircuito(rs.getString("circuito"));
                    bean.setNumero_carta(rs.getString("numero_carta"));
                    bean.setIndirizzo_di_spedizione(rs.getString("indirizzo_di_spedizione"));
                    bean.setNumero_di_tracking(rs.getString("numero_di_tracking"));
                    bean.setData(rs.getDate("data"));
                    bean.setMetodo_di_spedizione(rs.getString("metodo_di_spedizione"));

                    orders.add(bean);
                }
            }
        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Error retrieving client date orders: " + e.getMessage(), e);
            throw e;
        }
        return orders;
    }
    /**
     * @requires data_da != null && data_a != null;
     * @ensures (\forall OrdineBean o; o in \result;
     *          o.getData().compareTo(Date.valueOf(data_da)) >= 0 &&
     *          o.getData().compareTo(Date.valueOf(data_a)) <= 0);
     * @throws SQLException if a database access error occurs.
     */
    public synchronized ArrayList<OrdineBean> DateOrders(String data_da, String data_a) throws SQLException {
        // Validazione dell'input
        if (data_da == null || data_a == null) {
            throw new IllegalArgumentException("Invalid date range.");
        }

        String selectSQL = "SELECT * FROM " + TABLE_NAME + " WHERE data >= ? AND data <= ? ORDER BY id DESC";
        ArrayList<OrdineBean> orders = new ArrayList<>();

        try (Connection connection = ds.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(selectSQL)) {

            preparedStatement.setString(1, data_da);
            preparedStatement.setString(2, data_a);

            try (ResultSet rs = preparedStatement.executeQuery()) {
                while (rs.next()) {
                    OrdineBean bean = new OrdineBean();

                    bean.setId(rs.getInt("Id"));
                    bean.setClient(new utenteDao().doRetrieveByKey(rs.getString("Username")) );
                    bean.setPrezzo_totale(rs.getFloat("PrezzoTotale"));
                    bean.setDestinatario(rs.getString("destinatario"));
                    bean.setMetodo_di_pagamento(rs.getString("metodo_di_pagamento"));
                    bean.setCircuito(rs.getString("circuito"));
                    bean.setNumero_carta(rs.getString("numero_carta"));
                    bean.setIndirizzo_di_spedizione(rs.getString("indirizzo_di_spedizione"));
                    bean.setNumero_di_tracking(rs.getString("numero_di_tracking"));
                    bean.setData(rs.getDate("data"));
                    bean.setMetodo_di_spedizione(rs.getString("metodo_di_spedizione"));

                    orders.add(bean);
                }
            }
        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Error retrieving date orders: " + e.getMessage(), e);
            throw e;
        }
        return orders;
    }



    /**
     * @ensures \result != null;
     * @throws SQLException if a database access error occurs.
     */
    public synchronized ArrayList<OrdineBean> doRetrieveAll() throws SQLException {
        String selectSQL = "SELECT * FROM " + TABLE_NAME;
        ArrayList<OrdineBean> orders = new ArrayList<>();

        try (Connection connection = ds.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(selectSQL);
             ResultSet rs = preparedStatement.executeQuery()) {

            while (rs.next()) {
                OrdineBean bean = new OrdineBean();

                bean.setId(rs.getInt("Id"));
                bean.setClient(new utenteDao().doRetrieveByKey(rs.getString("Username")) );
                bean.setPrezzo_totale(rs.getFloat("PrezzoTotale"));
                bean.setDestinatario(rs.getString("destinatario"));
                bean.setMetodo_di_pagamento(rs.getString("metodo_di_pagamento"));
                bean.setCircuito(rs.getString("circuito"));
                bean.setNumero_carta(rs.getString("numero_carta"));
                bean.setIndirizzo_di_spedizione(rs.getString("indirizzo_di_spedizione"));
                bean.setNumero_di_tracking(rs.getString("numero_di_tracking"));
                bean.setData(rs.getDate("data"));
                bean.setMetodo_di_spedizione(rs.getString("metodo_di_spedizione"));


                orders.add(bean);
            }
        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Error retrieving all orders: " + e.getMessage(), e);
            throw e;
        }
        return orders;
    }
}
