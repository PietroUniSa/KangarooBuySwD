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
            throw new IllegalStateException("DataSource not configured");
        }
        return ds;
    }

    // Normalizza le stringhe dal DB: mai null, coerente con AddressBean
    private static String nn(String s) {
        return (s == null) ? "" : s;
    }

    /*@
      @ public normal_behavior
      @   requires address != null
      @        && address.getVia() != null && !address.getVia().isEmpty()
      @        && address.getCitta() != null && !address.getCitta().isEmpty()
      @        && address.getCAP() != null && !address.getCAP().isEmpty()
      @        && address.getUsername() != null && !address.getUsername().isEmpty();
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

            preparedStatement.setString(1, address.getVia());
            preparedStatement.setString(2, address.getCitta());
            preparedStatement.setString(3, address.getCAP());
            preparedStatement.setString(4, address.getUsername());

            int affected = preparedStatement.executeUpdate();
            if (affected == 0) {
                throw new SQLException("Insert failed, no rows affected.");
            }

            try (ResultSet key = preparedStatement.getGeneratedKeys()) {
                if (!key.next()) {
                    throw new SQLException("No generated key returned.");
                }
                int id = key.getInt(1);
                if (id <= 0) {
                    throw new SQLException("Generated key invalid: " + id);
                }
                return id;
            }
        }
    }

    /*@
      @ public normal_behavior
      @   requires id > 0;
      @   ensures \result != null;
      @   ensures \result.getId() == 0 || \result.getId() == id;
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
                    bean.setVia(nn(rs.getString("via")));
                    bean.setCitta(nn(rs.getString("citta")));
                    bean.setCAP(nn(rs.getString("cap")));          // "" è valido per AddressBean
                    bean.setUsername(nn(rs.getString("username")));
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
                    bean.setVia(nn(rs.getString("via")));
                    bean.setCitta(nn(rs.getString("citta")));
                    bean.setCAP(nn(rs.getString("cap")));
                    bean.setUsername(nn(rs.getString("username")));
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
