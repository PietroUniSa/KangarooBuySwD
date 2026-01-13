package ita.kangaroo.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import ita.kangaroo.model.AddressBean;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class AddressDao {

    private static final Logger LOGGER = Logger.getLogger(AddressDao.class.getName());
    private static final String TABLE_NAME = "indirizzo";
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
            // Niente concatenazioni: Z3 ci inciampa spesso
            throw new IllegalStateException("DataSource not configured");
        }
        return ds;
    }

    /*@
      @ public normal_behavior
      @   requires address != null
      @        && address.via != null && !address.via.isEmpty()
      @        && address.citta != null && !address.citta.isEmpty()
      @        && address.CAP != null && !address.CAP.isEmpty()
      @        && address.username != null && !address.username.isEmpty();
      @   ensures \result > 0;
      @   assignable \everything;
      @ also
      @ public exceptional_behavior
      @   requires true;
      @   signals (SQLException e) true;
      @   signals (IllegalStateException e) true;
      @   assignable \everything;
      @*/
    //@ skipesc
    public synchronized int doSave(AddressBean address) throws SQLException {
        String insertSQL =
            "INSERT INTO " + TABLE_NAME + " (via, citta, cap, username) VALUES (?, ?, ?, ?)";

        try (Connection connection = getDataSource().getConnection();
             PreparedStatement preparedStatement =
                 connection.prepareStatement(insertSQL, Statement.RETURN_GENERATED_KEYS)) {

            // coerente con le requires sui campi
            preparedStatement.setString(1, address.via);
            preparedStatement.setString(2, address.citta);
            preparedStatement.setString(3, address.CAP);
            preparedStatement.setString(4, address.username);

            int affected = preparedStatement.executeUpdate();
            if (affected == 0) {
                throw new SQLException("Insert failed, no rows affected.");
            }

            try (ResultSet key = preparedStatement.getGeneratedKeys()) {
                if (key.next()) {
                    int id = key.getInt(1);
                    if (id <= 0) throw new SQLException("Generated key invalid: " + id);
                    return id;
                }
                throw new SQLException("No generated key returned.");
            }
        }
    }

    /*@
      @ public normal_behavior
      @   requires id > 0;
      @   ensures \result != null;
      @   ensures \result.id == 0 || \result.id == id;
      @   assignable \everything;
      @ also
      @ public exceptional_behavior
      @   requires true;
      @   signals (SQLException e) true;
      @   signals (IllegalStateException e) true;
      @   assignable \everything;
      @*/
    //@ skipesc
    public synchronized AddressBean doRetrieveByKey(int id) throws SQLException {
        String selectSQL = "SELECT * FROM " + TABLE_NAME + " WHERE id = ?";

        AddressBean bean = new AddressBean();

        try (Connection connection = getDataSource().getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(selectSQL)) {

            preparedStatement.setInt(1, id);

            try (ResultSet rs = preparedStatement.executeQuery()) {
                if (rs.next()) {
                    bean.setId(rs.getInt("id"));
                    bean.setVia(rs.getString("via"));
                    bean.setCitta(rs.getString("citta"));
                    bean.setCAP(rs.getString("cap"));
                    bean.setUsername(rs.getString("username"));
                }
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
    public synchronized ArrayList<AddressBean> doRetrieveByClient(String username) throws SQLException {
        String selectSQL = "SELECT * FROM " + TABLE_NAME + " WHERE username = ?";

        ArrayList<AddressBean> addresses = new ArrayList<>();

        try (Connection connection = getDataSource().getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(selectSQL)) {

            preparedStatement.setString(1, username);

            try (ResultSet rs = preparedStatement.executeQuery()) {
                while (rs.next()) {
                    AddressBean bean = new AddressBean();
                    bean.setId(rs.getInt("id"));
                    bean.setVia(rs.getString("via"));
                    bean.setCitta(rs.getString("citta"));
                    bean.setCAP(rs.getString("cap"));
                    bean.setUsername(rs.getString("username"));
                    addresses.add(bean);
                }
            }
        }
        return addresses;
    }

    /*@
      @ public normal_behavior
      @   requires id > 0;
      @   assignable \everything;
      @ also
      @ public exceptional_behavior
      @   requires true;
      @   signals (SQLException e) true;
      @   signals (IllegalStateException e) true;
      @   assignable \everything;
      @*/
    //@ skipesc
    public synchronized boolean doDelete(int id) throws SQLException {
        String deleteSQL = "DELETE FROM " + TABLE_NAME + " WHERE id = ?";

        try (Connection connection = getDataSource().getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(deleteSQL)) {

            preparedStatement.setInt(1, id);

            int result = preparedStatement.executeUpdate();
            return result != 0;
        }
    }
}
