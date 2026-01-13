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

    private static DataSource getDataSource() {
        if (ds == null) {
            throw new IllegalStateException(
                "DataSource not configured. Missing JNDI resource '" + JNDI_NAME + "' under java:comp/env."
            );
        }
        return ds;
    }

    public ComposizioneDao() {
        // costruttore vuoto
    }

    public synchronized void doSave(OrderProductBean product) throws SQLException {
        /*@
            requires product != null;
            requires product.getId_ordine() > 0;
            requires product.getId_prodotto() > 0;
            requires product.getQuantita() > 0;
            requires product.getPrezzo() >= 0.0f;
            requires product.getIVA() >= 0.0f;
            // Non possiamo garantire "è stato salvato" senza modello DB, però almeno:
            ensures true;
            signals (SQLException e) true;
        @*/
        String insertSQL = "INSERT INTO " + TABLE + " (id_ordine, id_prodotto, prezzo, quantita, IVA) VALUES (?, ?, ?, ?, ?)";

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

    public synchronized ArrayList<OrderProductBean> doRetrieveByKey(int id_ordine) throws SQLException {
        /*@
            requires id_ordine > 0;
            ensures \result != null;
            ensures (\forall int i; 0 <= i && i < \result.size();
                        \result.get(i) != null && \result.get(i).getId_ordine() == id_ordine);
            signals (SQLException e) true;
        @*/
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
