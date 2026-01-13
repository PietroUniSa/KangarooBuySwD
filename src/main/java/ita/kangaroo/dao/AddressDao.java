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

    private static DataSource getDataSource() {
        if (ds == null) {
            throw new IllegalStateException(
                "DataSource not configured. Missing JNDI resource '" + JNDI_NAME + "' under java:comp/env."
            );
        }
        return ds;
    }

    public synchronized int doSave(AddressBean address) throws SQLException {
        /*@
            requires address != null;
            requires address.getVia() != null && !address.getVia().isEmpty();
            requires address.getCitta() != null && !address.getCitta().isEmpty();
            requires address.getCAP() != null && !address.getCAP().isEmpty();
            requires address.getUsername() != null && !address.getUsername().isEmpty();

            // Se il metodo termina normalmente, allora ha ottenuto una generated key valida.
            ensures \result > 0;

            // Se qualcosa va storto lato DB, può lanciare SQLException e allora nessuna postcondizione su \result vale.
            signals (SQLException e) true;

            // Opzionale ma più “pulito” per OpenJML:
            signals_only SQLException;
        @*/
        String insertSQL = "INSERT INTO " + TABLE_NAME + " (via, citta, cap, username) VALUES (?, ?, ?, ?)";

        try (Connection connection = getDataSource().getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(insertSQL, Statement.RETURN_GENERATED_KEYS)) {

            preparedStatement.setString(1, address.getVia());
            preparedStatement.setString(2, address.getCitta());
            preparedStatement.setString(3, address.getCAP());
            preparedStatement.setString(4, address.getUsername());

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

    public synchronized AddressBean doRetrieveByKey(int id) throws SQLException {
        /*@
            requires id > 0;

            ensures \result != null;

            // Se non trova nulla, ritorna un bean "vuoto" (id = 0). Se trova, l'id combacia.
            ensures (\result.getId() == 0) || (\result.getId() == id);

            // Se trova un record (id != 0), allora i campi principali non sono null
            // (a meno che il DB contenga null, ma assumiamo schema sensato).
            ensures (\result.getId() != 0) ==> (\result.getVia() != null && \result.getCitta() != null
                                               && \result.getCAP() != null && \result.getUsername() != null);

            signals (SQLException e) true;
            signals_only SQLException;
        @*/
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

    public synchronized ArrayList<AddressBean> doRetrieveByClient(String username) throws SQLException {
        /*@
            requires username != null && !username.isEmpty();

            ensures \result != null;

            // Ogni elemento ritornato appartiene allo stesso username.
            ensures (\forall int i; 0 <= i && i < \result.size();
                        \result.get(i) != null &&
                        \result.get(i).getUsername() != null &&
                        \result.get(i).getUsername().equals(username));

            signals (SQLException e) true;
            signals_only SQLException;
        @*/
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

    public synchronized boolean doDelete(int id) throws SQLException {
        /*@
            requires id > 0;

            // Se termina normalmente, ritorna un boolean.
            ensures \result == true || \result == false;

            // Specifica “semantica”: true significa che almeno una riga è stata eliminata.
            // Non possiamo esprimerlo formalmente senza modellare rowsAffected, quindi restiamo conservativi.

            signals (SQLException e) true;
            signals_only SQLException;
        @*/
        String deleteSQL = "DELETE FROM " + TABLE_NAME + " WHERE id = ?";

        try (Connection connection = getDataSource().getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(deleteSQL)) {

            preparedStatement.setInt(1, id);

            int result = preparedStatement.executeUpdate();
            return result != 0;
        }
    }
}
