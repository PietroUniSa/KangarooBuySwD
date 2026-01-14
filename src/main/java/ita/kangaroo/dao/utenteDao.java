package ita.kangaroo.dao;

import ita.kangaroo.model.utenteBean;
import ita.kangaroo.model.tipo;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class utenteDao {

    private static final Logger LOGGER = Logger.getLogger(utenteDao.class.getName());
    private static final String TABLE = "utente";
    private static final String JNDI_NAME = "jdbc/kangaroodb";

    private static DataSource ds;

    static {
        try {
            Context initCtx = new InitialContext();
            Context envCtx = (Context) initCtx.lookup("java:comp/env");
            ds = (DataSource) envCtx.lookup(JNDI_NAME);
        } catch (NamingException e) {
            LOGGER.log(Level.SEVERE, e.toString(), e);
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
        if (ds == null) {
            throw new IllegalStateException("DataSource not configured");
        }
        return ds;
    }


    public utenteDao() {
        // costruttore vuoto
    }

    /*@
      @ public normal_behavior
      @   requires client != null;
      @   requires client.username != null && !client.username.isEmpty();
      @   requires client.password != null && !client.password.isEmpty();
      @   requires client.cognome != null && !client.cognome.isEmpty();
      @   requires client.nome != null && !client.nome.isEmpty();
      @   requires client.email != null && !client.email.isEmpty();
      @   requires client.tipo != null;
      @   ensures \result >= 0;
      @   assignable \nothing;
      @ also
      @ public exceptional_behavior
      @   signals (SQLException e) true;
      @   signals (IllegalStateException e) true;
      @   assignable \nothing;
      @*/
    //@ skipesc
    public synchronized int doSave(utenteBean client) throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        int result;

        String insertSQL = "INSERT INTO " + TABLE
                + " (Username, Password, Cognome, Nome, Email, Tipo, via, citta, provincia, telefono, cap)"
                + " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            connection = getDataSource().getConnection();
            preparedStatement = connection.prepareStatement(insertSQL);
            preparedStatement.setString(1, client.getUsername());
            preparedStatement.setString(2, client.getPassword());
            preparedStatement.setString(3, client.getCognome());
            preparedStatement.setString(4, client.getNome());
            preparedStatement.setString(5, client.getEmail());
            preparedStatement.setString(6, String.valueOf(client.getTipo()));
            preparedStatement.setString(7, client.getVia());
            preparedStatement.setString(8, client.getCitta());
            preparedStatement.setString(9, client.getProvincia());
            preparedStatement.setString(10, client.getTelefono());
            preparedStatement.setString(11, client.getCap());

            result = preparedStatement.executeUpdate();

        } finally {
            try {
                if (preparedStatement != null) preparedStatement.close();
            } finally {
                if (connection != null) connection.close();
            }
        }
        return result;
    }

    /*@
      @ public normal_behavior
      @   requires email != null && !email.isEmpty();
      @   requires password != null && !password.isEmpty();
      @   ensures true;
      @   assignable \nothing;
      @ also
      @ public exceptional_behavior
      @   signals (SQLException e) true;
      @   signals (IllegalStateException e) true;
      @   assignable \nothing;
      @*/
    //@ skipesc
    public synchronized utenteBean doRetrieveByEmailAndPassword(String email, String password) throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        String selectSQL = "SELECT * FROM " + TABLE + " WHERE Email=? AND Password=SHA1(?)";
        utenteBean client = null;

        try {
            connection = getDataSource().getConnection();
            preparedStatement = connection.prepareStatement(selectSQL);
            preparedStatement.setString(1, email);
            preparedStatement.setString(2, password);

            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                client = new utenteBean();
                client.setUsername(rs.getString("Username"));
                // ATTENZIONE: setPassword fa hashing; qui stai leggendo un hash dal DB.
                // Se vuoi mantenere l'hash, idealmente dovresti avere un setter "setPasswordHash".
                client.setPassword(rs.getString("Password"));
                client.setCognome(rs.getString("Cognome"));
                client.setNome(rs.getString("Nome"));
                client.setEmail(rs.getString("Email"));
                client.setTipo(tipo.valueOf(rs.getString("Tipo")));
                client.setVia(rs.getString("via"));
                client.setCitta(rs.getString("Citta"));
                client.setProvincia(rs.getString("provincia"));
                client.setTelefono(rs.getString("telefono"));
                client.setCap(rs.getString("cap"));
            }

        } finally {
            try {
                if (preparedStatement != null) preparedStatement.close();
            } finally {
                if (connection != null) connection.close();
            }
        }

        return client;
    }

    /*@
      @ public normal_behavior
      @   requires username != null && !username.isEmpty();
      @   ensures true;
      @   assignable \nothing;
      @ also
      @ public exceptional_behavior
      @   signals (SQLException e) true;
      @   signals (IllegalStateException e) true;
      @   assignable \nothing;
      @*/
    //@ skipesc
    public synchronized utenteBean doRetrieveByKey(String username) throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        String selectSQL = "SELECT * FROM " + TABLE + " WHERE Username=?";
        utenteBean client = null;

        try {
            connection = getDataSource().getConnection();
            preparedStatement = connection.prepareStatement(selectSQL);
            preparedStatement.setString(1, username);

            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                client = new utenteBean();
                client.setUsername(rs.getString("Username"));
                client.setPassword(rs.getString("Password"));
                client.setCognome(rs.getString("Cognome"));
                client.setNome(rs.getString("Nome"));
                client.setEmail(rs.getString("Email"));
                client.setTipo(tipo.valueOf(rs.getString("Tipo")));
                client.setVia(rs.getString("via"));
                client.setCitta(rs.getString("Citta"));
                client.setProvincia(rs.getString("provincia"));
                client.setTelefono(rs.getString("telefono"));
                client.setCap(rs.getString("cap"));
            }

        } finally {
            try {
                if (preparedStatement != null) preparedStatement.close();
            } finally {
                if (connection != null) connection.close();
            }
        }

        return client;
    }

    /*@
      @ public normal_behavior
      @   requires client != null;
      @   requires client.username != null && !client.username.isEmpty();
      @   requires client.cognome != null && !client.cognome.isEmpty();
      @   requires client.nome != null && !client.nome.isEmpty();
      @   requires client.email != null && !client.email.isEmpty();
      @   ensures \result >= 0;
      @   assignable \nothing;
      @ also
      @ public exceptional_behavior
      @   signals (SQLException e) true;
      @   signals (IllegalStateException e) true;
      @   assignable \nothing;
      @*/
    //@ skipesc
    public synchronized int doModify(utenteBean client) throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        int result;

        String updateSQL = "UPDATE " + TABLE
                + " SET Cognome = ?, Nome = ?, Email = ?, via = ?, citta = ?, provincia = ?, telefono = ?, cap = ?"
                + " WHERE Username = ?";

        try {
            connection = getDataSource().getConnection();
            preparedStatement = connection.prepareStatement(updateSQL);
            preparedStatement.setString(1, client.getCognome());
            preparedStatement.setString(2, client.getNome());
            preparedStatement.setString(3, client.getEmail());
            preparedStatement.setString(4, client.getVia());
            preparedStatement.setString(5, client.getCitta());
            preparedStatement.setString(6, client.getProvincia());
            preparedStatement.setString(7, client.getTelefono());
            preparedStatement.setString(8, client.getCap());
            preparedStatement.setString(9, client.getUsername());

            result = preparedStatement.executeUpdate();

        } finally {
            try {
                if (preparedStatement != null) preparedStatement.close();
            } finally {
                if (connection != null) connection.close();
            }
        }
        return result;
    }

    /*@
      @ public normal_behavior
      @   requires email != null && !email.isEmpty();
      @   ensures true;
      @   assignable \nothing;
      @ also
      @ public exceptional_behavior
      @   signals (SQLException e) true;
      @   signals (IllegalStateException e) true;
      @   assignable \nothing;
      @*/
    //@ skipesc
    public synchronized utenteBean doRetrieveByEmail(String email) throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        String selectSQL = "SELECT * FROM " + TABLE + " WHERE Email=?";
        utenteBean client = null;

        try {
            connection = getDataSource().getConnection();
            preparedStatement = connection.prepareStatement(selectSQL);
            preparedStatement.setString(1, email);

            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                client = new utenteBean();
                client.setUsername(rs.getString("Username"));
                client.setPassword(rs.getString("Password"));
                client.setCognome(rs.getString("Cognome"));
                client.setNome(rs.getString("Nome"));
                client.setEmail(rs.getString("Email"));
                client.setTipo(tipo.valueOf(rs.getString("Tipo")));
                client.setVia(rs.getString("via"));
                client.setCitta(rs.getString("Citta"));
                client.setProvincia(rs.getString("provincia"));
                client.setTelefono(rs.getString("telefono"));
                client.setCap(rs.getString("cap"));
            }

        } finally {
            try {
                if (preparedStatement != null) preparedStatement.close();
            } finally {
                if (connection != null) connection.close();
            }
        }

        return client;
    }

    /*@
      @ public normal_behavior
      @   ensures \result != null;
      @   assignable \nothing;
      @ also
      @ public exceptional_behavior
      @   signals (SQLException e) true;
      @   signals (IllegalStateException e) true;
      @   assignable \nothing;
      @*/
    //@ skipesc
    public synchronized ArrayList<utenteBean> doRetrieveAll() throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        ArrayList<utenteBean> clients = new ArrayList<>();

        String selectSQL = "SELECT * FROM " + TABLE + " WHERE Username <> 'rossif'";

        try {
            connection = getDataSource().getConnection();
            preparedStatement = connection.prepareStatement(selectSQL);

            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                utenteBean client = new utenteBean();
                client.setUsername(rs.getString("Username"));
                client.setPassword(rs.getString("Password"));
                client.setCognome(rs.getString("Cognome"));
                client.setNome(rs.getString("Nome"));
                client.setEmail(rs.getString("Email"));
                client.setTipo(tipo.valueOf(rs.getString("Tipo")));
                client.setVia(rs.getString("via"));
                client.setCitta(rs.getString("Citta"));
                client.setProvincia(rs.getString("provincia"));
                client.setTelefono(rs.getString("telefono"));
                client.setCap(rs.getString("cap"));

                clients.add(client);
            }
        } finally {
            try {
                if (preparedStatement != null) preparedStatement.close();
            } finally {
                if (connection != null) connection.close();
            }
        }
        return clients;
    }
}