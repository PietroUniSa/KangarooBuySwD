package ita.kangaroo.dao;

import ita.kangaroo.model.OrderProductBean;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ComposizioneDao {

    private static final Logger LOGGER = Logger.getLogger(ComposizioneDao.class.getName());

    private static final String TABLE = "composizione";
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
      @   requires ds != null;
      @   ensures \result == ds;
      @   assignable \nothing;
      @ also
      @ private exceptional_behavior
      @   requires ds == null;
      @   signals (IllegalStateException e) true;
      @   signals_only IllegalStateException;
      @   assignable \nothing;
      @*/
    private static DataSource getDataSource() {
        if (ds == null) {
            throw new IllegalStateException("DataSource not configured");
        }
        return ds;
    }

    public ComposizioneDao() {
        // costruttore vuoto
    }

    /*@
      @ public normal_behavior
      @   requires product != null
      @        && product.getId_ordine() > 0
      @        && product.getId_prodotto() > 0
      @        && product.getQuantita() > 0
      @        && product.getPrezzo() >= 0.0f
      @        && product.getIVA() >= 0.0f;
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
    public synchronized void doSave(OrderProductBean product) throws SQLException {

        String insertSQL =
                "INSERT INTO " + TABLE + " (id_ordine, id_prodotto, prezzo, quantita, IVA) VALUES (?, ?, ?, ?, ?)";

        try (Connection connection = getDataSource().getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(insertSQL)) {

            preparedStatement.setInt(1, product.getId_ordine());
            preparedStatement.setInt(2, product.getId_prodotto());
            preparedStatement.setFloat(3, product.getPrezzo());
            preparedStatement.setInt(4, product.getQuantita());
            preparedStatement.setFloat(5, product.getIVA());

            int affected = preparedStatement.executeUpdate();
            if (affected == 0) {
                throw new SQLException("Insert failed, no rows affected.");
            }
        }
    }

    /*@
      @ public normal_behavior
      @   requires id_ordine > 0;
      @   ensures \result != null;
      @   // Evitiamo quantificatori forti su ArrayList+JDBC: OpenJML ci soffre
      @   assignable \everything;
      @ also
      @ public exceptional_behavior
      @   requires true;
      @   signals (SQLException e) true;
      @   signals (IllegalStateException e) true;
      @   assignable \everything;
      @*/
    //@ skipesc
    public synchronized ArrayList<OrderProductBean> doRetrieveByKey(int id_ordine) throws SQLException {

        ArrayList<OrderProductBean> products = new ArrayList<>();
        String selectSQL = "SELECT * FROM " + TABLE + " WHERE id_ordine = ?";

        try (Connection connection = getDataSource().getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(selectSQL)) {

            preparedStatement.setInt(1, id_ordine);

            try (ResultSet rs = preparedStatement.executeQuery()) {
                while (rs.next()) {
                    OrderProductBean product = new OrderProductBean();

                    product.setId_ordine(rs.getInt("id_ordine"));
                    product.setId_prodotto(rs.getInt("id_prodotto"));
                    product.setPrezzo(rs.getFloat("prezzo"));
                    product.setQuantita(rs.getInt("quantita"));
                    product.setIVA(rs.getFloat("IVA"));

                    products.add(product);
                }
            }
        }

        return products;
    }
}