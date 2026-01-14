package ita.kangaroo.dao;

import ita.kangaroo.model.MetodoPagamentoBean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class MetodoPagamentoDao {

    private static final Logger LOGGER = Logger.getLogger(MetodoPagamentoDao.class.getName());

    private static final String TABLE_NAME = "Metodo_di_pagamento";
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
            // Niente concatenazioni: OpenJML/Z3 ogni tanto si impalla sulle stringhe
            throw new IllegalStateException("DataSource not configured");
        }
        return ds;
    }

    /*@
      @ public normal_behavior
      @   requires bean != null
      @        && bean.numero_carta != null && !bean.numero_carta.isEmpty()
      @        && bean.cvv != null && !bean.cvv.isEmpty()
      @        && bean.data_scadenza != null && !bean.data_scadenza.isEmpty()
      @        && bean.username != null && !bean.username.isEmpty();
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
    public synchronized int doSave(MetodoPagamentoBean bean) throws SQLException {

        String insertSQL =
                "INSERT INTO " + TABLE_NAME + " (numero_di_carta, cvv, data_scadenza, circuito, Username) " +
                        "VALUES (?, ?, ?, ?, ?)";

        try (Connection connection = getDataSource().getConnection();
             PreparedStatement preparedStatement =
                     connection.prepareStatement(insertSQL, Statement.RETURN_GENERATED_KEYS)) {

            preparedStatement.setString(1, bean.getNumero_carta());
            preparedStatement.setString(2, bean.getCvv());
            preparedStatement.setString(3, bean.getData_scadenza());
            preparedStatement.setString(4, bean.getCircuito());
            preparedStatement.setString(5, bean.getUsername());

            int affected = preparedStatement.executeUpdate();
            if (affected == 0) {
                throw new SQLException("Insert failed, no rows affected.");
            }

            try (ResultSet key = preparedStatement.getGeneratedKeys()) {
                if (key.next()) {
                    int id = key.getInt(1);
                    if (id <= 0) {
                        throw new SQLException("Insert succeeded but generated key is invalid: " + id);
                    }
                    return id;
                } else {
                    throw new SQLException("Insert succeeded but no generated key returned.");
                }
            }
        }
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

    /*@
      @ public normal_behavior
      @   requires id > 0;
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
    public synchronized MetodoPagamentoBean doRetrieveByKey(int id) throws SQLException {

        MetodoPagamentoBean bean = new MetodoPagamentoBean();
        String selectSQL = "SELECT * FROM " + TABLE_NAME + " WHERE id = ?";

        try (Connection connection = getDataSource().getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(selectSQL)) {

            preparedStatement.setInt(1, id);

            try (ResultSet rs = preparedStatement.executeQuery()) {
                if (rs.next()) {
                    bean.setId(rs.getInt("id"));
                    bean.setNumero_carta(rs.getString("numero_di_carta"));
                    bean.setCvv(rs.getString("cvv"));
                    bean.setData_scadenza(rs.getString("data_scadenza"));
                    bean.setCircuito(rs.getString("circuito"));

                    String u = rs.getString("username");
                    if (u == null) u = rs.getString("Username");
                    bean.setUsername(u);
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
    public synchronized ArrayList<MetodoPagamentoBean> doRetrieveByClient(String username) throws SQLException {

        String selectSQL = "SELECT * FROM " + TABLE_NAME + " WHERE Username = ?";

        ArrayList<MetodoPagamentoBean> beans = new ArrayList<>();

        try (Connection connection = getDataSource().getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(selectSQL)) {

            preparedStatement.setString(1, username);

            try (ResultSet rs = preparedStatement.executeQuery()) {
                while (rs.next()) {
                    MetodoPagamentoBean bean = new MetodoPagamentoBean();

                    bean.setId(rs.getInt("id"));
                    bean.setNumero_carta(rs.getString("numero_di_carta"));
                    bean.setCvv(rs.getString("cvv"));
                    bean.setData_scadenza(rs.getString("data_scadenza"));
                    bean.setCircuito(rs.getString("circuito"));

                    String u = rs.getString("username");
                    if (u == null) u = rs.getString("Username");
                    bean.setUsername(u);

                    beans.add(bean);
                }
            }
        }

        return beans;
    }
}