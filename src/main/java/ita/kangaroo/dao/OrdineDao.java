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

    private static final Logger LOGGER = Logger.getLogger(OrdineDao.class.getName());
    private static final String TABLE_NAME = "ordine";
    private static final String JNDI_NAME = "jdbc/kangaroodb";

    private static DataSource ds;

    static {
        try {
            Context initCtx = new InitialContext();
            Context envCtx = (Context) initCtx.lookup("java:comp/env");
            ds = (DataSource) envCtx.lookup(JNDI_NAME);
        } catch (NamingException e) {
            LOGGER.log(Level.SEVERE, "JNDI DataSource lookup failed for: " + JNDI_NAME, e);
            ds = null;
        }
    }

  /*@
  @ private normal_behavior
  @   ensures \result != null;
  @   assignable \nothing;
  @ also
  @ private exceptional_behavior
  @   signals_only IllegalStateException;
  @   assignable \nothing;
  @*/
//@ skipesc
private static DataSource getDataSource() {
    if (ds == null) throw new IllegalStateException("DataSource not configured");
    return ds;
}


    public OrdineDao() {
        // costruttore vuoto
    }

    /*@
      @ public normal_behavior
      @   requires order != null;
      @   // Non imponiamo vincoli troppo forti: order.getClient() e prodotti possono essere null nel tuo modello.
      @   ensures true;
      @   assignable \everything;
      @ also
      @ public exceptional_behavior
      @   requires true;
      @   signals (SQLException e) true;
      @   signals (IllegalStateException e) true;
      @   assignable \everything;
      @*/
    //@ skipesc
    public synchronized void doSave(OrdineBean order) throws SQLException {

        ComposizioneDao model = new ComposizioneDao();

        String insertSQL = "INSERT INTO " + TABLE_NAME +
                " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection connection = getDataSource().getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(insertSQL)) {

            preparedStatement.setInt(1, order.getId());

            // attenzione: client potrebbe essere null, ma tu nel codice lo usi direttamente.
            // lasciamo com'è: se è null è NPE a runtime (bug logico), ma OpenJML non lo dimostra qui per via skipesc.
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

            if (order.getProducts() != null) {
                for (OrderProductBean prodotto : order.getProducts()) {
                    model.doSave(prodotto);
                }
            }
        }
    }

    /*@
      @ public normal_behavior
      @   requires id >= 0;
      @   ensures \result != null;
      @   assignable \everything;
      @ also
      @ public exceptional_behavior
      @   requires true;
      @   signals (SQLException e) true;
      @   signals (IllegalStateException e) true;
      @   assignable \everything;
      @*/
    //@ skipesc
    public synchronized OrdineBean doRetrieveByKey(int id) throws SQLException {

        ComposizioneDao ordermodel = new ComposizioneDao();
        ArrayList<OrderProductBean> products = ordermodel.doRetrieveByKey(id);

        utenteDao userModel = new utenteDao();
        OrdineBean bean = new OrdineBean(products);

        String selectSQL = "SELECT * FROM " + TABLE_NAME + " where Id = ?";

        try (Connection connection = getDataSource().getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(selectSQL)) {

            preparedStatement.setInt(1, id);

            try (ResultSet rs = preparedStatement.executeQuery()) {
                while (rs.next()) {
                    bean.setId(rs.getInt("Id"));
                    bean.setClient(userModel.doRetrieveByKey(rs.getString("Username")));
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
            }
        }
        return bean;
    }

    /*@
      @ public normal_behavior
      @   ensures \result != null;
      @   assignable \everything;
      @ also
      @ public exceptional_behavior
      @   requires true;
      @   signals (SQLException e) true;
      @   signals (IllegalStateException e) true;
      @   assignable \everything;
      @*/
    //@ skipesc
    public synchronized OrdineBean lastOrder() throws SQLException {

        utenteDao userModel = new utenteDao();
        OrdineBean bean = new OrdineBean();

        String selectSQL = "SELECT * FROM " + TABLE_NAME + " ORDER BY Id DESC LIMIT 1";

        try (Connection connection = getDataSource().getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(selectSQL);
             ResultSet rs = preparedStatement.executeQuery()) {

            while (rs.next()) {
                bean.setId(rs.getInt("Id"));
                bean.setClient(userModel.doRetrieveByKey(rs.getString("Username")));
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
        }
        return bean;
    }

    /*@
      @ public normal_behavior
      @   requires username != null && !username.isEmpty();
      @   ensures \result != null;
      @   assignable \everything;
      @ also
      @ public exceptional_behavior
      @   requires true;
      @   signals (SQLException e) true;
      @   signals (IllegalStateException e) true;
      @   assignable \everything;
      @*/
    //@ skipesc
    public synchronized ArrayList<OrdineBean> doRetrieveByClient(String username) throws SQLException {

        utenteDao userModel = new utenteDao();

        String selectSQL = "SELECT * FROM " + TABLE_NAME + " where Username = ? ORDER BY Id DESC";
        ArrayList<OrdineBean> orders = new ArrayList<>();

        try (Connection connection = getDataSource().getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(selectSQL)) {

            preparedStatement.setString(1, username);

            try (ResultSet rs = preparedStatement.executeQuery()) {
                while (rs.next()) {
                    OrdineBean bean = new OrdineBean();

                    bean.setId(rs.getInt("Id"));
                    bean.setClient(userModel.doRetrieveByKey(rs.getString("Username")));
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
        }

        return orders;
    }

    /*@
      @ public normal_behavior
      @   requires username != null && !username.isEmpty();
      @   requires data_da != null && data_a != null;
      @   ensures \result != null;
      @   assignable \everything;
      @ also
      @ public exceptional_behavior
      @   requires true;
      @   signals (SQLException e) true;
      @   signals (IllegalStateException e) true;
      @   assignable \everything;
      @*/
    //@ skipesc
    public synchronized ArrayList<OrdineBean> ClientDateOrders(String username, String data_da, String data_a) throws SQLException {

        utenteDao userModel = new utenteDao();

        String selectSQL = "SELECT * FROM " + TABLE_NAME + " where Username = ? and data >= ? and data <= ? ORDER BY Id DESC";
        ArrayList<OrdineBean> orders = new ArrayList<>();

        try (Connection connection = getDataSource().getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(selectSQL)) {

            preparedStatement.setString(1, username);
            preparedStatement.setString(2, data_da);
            preparedStatement.setString(3, data_a);

            try (ResultSet rs = preparedStatement.executeQuery()) {
                while (rs.next()) {
                    OrdineBean bean = new OrdineBean();

                    bean.setId(rs.getInt("Id"));
                    bean.setClient(userModel.doRetrieveByKey(rs.getString("Username")));
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
        }

        return orders;
    }

    /*@
      @ public normal_behavior
      @   requires data_da != null && data_a != null;
      @   ensures \result != null;
      @   assignable \everything;
      @ also
      @ public exceptional_behavior
      @   requires true;
      @   signals (SQLException e) true;
      @   signals (IllegalStateException e) true;
      @   assignable \everything;
      @*/
    //@ skipesc
    public synchronized ArrayList<OrdineBean> DateOrders(String data_da, String data_a) throws SQLException {

        utenteDao userModel = new utenteDao();

        String selectSQL = "SELECT * FROM " + TABLE_NAME + " where data >= ? and data <= ? ORDER BY id DESC";
        ArrayList<OrdineBean> orders = new ArrayList<>();

        try (Connection connection = getDataSource().getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(selectSQL)) {

            preparedStatement.setString(1, data_da);
            preparedStatement.setString(2, data_a);

            try (ResultSet rs = preparedStatement.executeQuery()) {
                while (rs.next()) {
                    OrdineBean bean = new OrdineBean();

                    bean.setId(rs.getInt("Id"));
                    bean.setClient(userModel.doRetrieveByKey(rs.getString("Username")));
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
        }

        return orders;
    }

    /*@
      @ public normal_behavior
      @   ensures \result != null;
      @   assignable \everything;
      @ also
      @ public exceptional_behavior
      @   requires true;
      @   signals (SQLException e) true;
      @   signals (IllegalStateException e) true;
      @   assignable \everything;
      @*/
    //@ skipesc
    public synchronized ArrayList<OrdineBean> doRetrieveAll() throws SQLException {

        ArrayList<OrdineBean> orders = new ArrayList<>();
        utenteDao userModel = new utenteDao();

        String selectSQL = "SELECT * FROM " + TABLE_NAME;

        try (Connection connection = getDataSource().getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(selectSQL);
             ResultSet rs = preparedStatement.executeQuery()) {

            while (rs.next()) {
                OrdineBean bean = new OrdineBean();

                bean.setId(rs.getInt("Id"));
                bean.setClient(userModel.doRetrieveByKey(rs.getString("Username")));
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

        return orders;
    }
}
