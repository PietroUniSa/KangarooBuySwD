package ita.kangaroo.dao;

import ita.kangaroo.model.FatturazioneBean;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FatturazioneDao {

    private static final Logger LOGGER = Logger.getLogger(FatturazioneDao.class.getName());
    private static final String TABLE = "fatturazione";
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

    public FatturazioneDao() {
        // costruttore vuoto
    }

    /*@
      @ public normal_behavior
      @   requires invoice != null
      @        && invoice.getId() >= 0
      @        && invoice.getData_emissione() != null;
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
    public synchronized void doSave(FatturazioneBean invoice) throws SQLException {

        String insertSQL = "INSERT INTO " + TABLE
                + " (sdi, importo, data_scadenza, data_emissione, stato_del_pagamento, IVA, Id) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (Connection connection = getDataSource().getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(insertSQL)) {

            preparedStatement.setString(1, invoice.getSdi());
            preparedStatement.setFloat(2, invoice.getImporto());
            preparedStatement.setString(3, invoice.getData_scadenza());
            preparedStatement.setString(4, invoice.getData_emissione());
            preparedStatement.setString(5, invoice.getStato_pagamento());
            preparedStatement.setFloat(6, invoice.getIva());
            preparedStatement.setInt(7, invoice.getId());

            preparedStatement.executeUpdate();
        }
    }

    /*@
      @ public normal_behavior
      @   requires id >= 0;
      @   ensures \result != null;
      @   ensures (\result.getId() == id) || (\result.getId() == 0);
      @   assignable \everything;
      @ also
      @ public exceptional_behavior
      @   requires true;
      @   signals (SQLException e) true;
      @   signals (IllegalStateException e) true;
      @   assignable \everything;
      @*/
    //@ skipesc
    public synchronized FatturazioneBean doRetrieveByOrder(int id) throws SQLException {

        String selectSQL = "SELECT * FROM " + TABLE + " WHERE id = ?";
        FatturazioneBean invoice = new FatturazioneBean();

        try (Connection connection = getDataSource().getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(selectSQL)) {

            preparedStatement.setInt(1, id);
            try (ResultSet rs = preparedStatement.executeQuery()) {

                while (rs.next()) {
                    invoice.setId(rs.getInt("Id"));
                    invoice.setSdi(rs.getString("sdi"));
                    invoice.setImporto(rs.getFloat("importo"));
                    invoice.setData_scadenza(rs.getString("data_scadenza"));
                    invoice.setData_emissione(rs.getString("data_emissione"));
                    invoice.setStato_pagamento(rs.getString("stato_del_pagamento"));
                    invoice.setIva(rs.getFloat("IVA"));
                }
            }
        }

        return invoice;
    }
}
