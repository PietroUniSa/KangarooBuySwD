package ita.kangaroo.model;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class utenteBean {

    /*@ nullable spec_public @*/ private String nome;
    /*@ nullable spec_public @*/ private String cognome;
    /*@ nullable spec_public @*/ private String email;

    /*@ nullable spec_public @*/ private String password;
    /*@ nullable spec_public @*/ private String username;
    /*@ nullable spec_public @*/ private tipo tipo;

    /*@ nullable spec_public @*/ private String via;
    /*@ nullable spec_public @*/ private String citta;
    /*@ nullable spec_public @*/ private String provincia;
    /*@ nullable spec_public @*/ private String telefono;
    /*@ nullable spec_public @*/ private String cap;

    public utenteBean() { }

    public utenteBean(String nome, String cognome, String email, String password,
                      String username, tipo tipo, String via, String citta,
                      String provincia, String telefono, String cap) {
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.password = password; // se vuoi hashed, chiama setPassword
        this.username = username;
        this.tipo = tipo;
        this.via = via;
        this.citta = citta;
        this.provincia = provincia;
        this.telefono = telefono;
        this.cap = cap;
    }

    /*@ pure nullable @*/
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    /*@ pure nullable @*/
    public String getCognome() { return cognome; }
    public void setCognome(String cognome) { this.cognome = cognome; }

    /*@ pure nullable @*/
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    /*@ pure nullable @*/
    public String getPassword() { return password; }

    /*@
      @ public normal_behavior
      @   requires password != null;
      @   ensures this.password != null;
      @   assignable this.password;
      @ also
      @ public exceptional_behavior
      @   requires password != null;
      @   signals (RuntimeException e) true;
      @   assignable this.password;
      @*/
    //@ skipesc
    public void setPassword(String password) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-1");
            digest.reset();
            digest.update(password.getBytes(StandardCharsets.UTF_8));
            this.password = String.format("%040x", new BigInteger(1, digest.digest()));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    /*@ pure nullable @*/
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    /*@ pure nullable @*/
    public tipo getTipo() { return tipo; }
    public void setTipo(tipo tipo) { this.tipo = tipo; }

    /*@ pure nullable @*/
    public String getVia() { return via; }
    public void setVia(String via) { this.via = via; }

    /*@ pure nullable @*/
    public String getCitta() { return citta; }
    public void setCitta(String citta) { this.citta = citta; }

    /*@ pure nullable @*/
    public String getProvincia() { return provincia; }
    public void setProvincia(String provincia) { this.provincia = provincia; }

    /*@ pure nullable @*/
    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    /*@ pure nullable @*/
    public String getCap() { return cap; }
    public void setCap(String cap) { this.cap = cap; }
}
