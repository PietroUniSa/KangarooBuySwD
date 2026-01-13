package ita.kangaroo.model;

public class MetodoPagamentoBean {

    /*@ spec_public @*/ private int id;

    /*@ nullable spec_public @*/ private String numero_carta;
    /*@ nullable spec_public @*/ private String cvv;
    /*@ nullable spec_public @*/ private String data_scadenza;
    /*@ nullable spec_public @*/ private String circuito;
    /*@ nullable spec_public @*/ private String username;

    public MetodoPagamentoBean() {
        // costruttore vuoto
    }

    /*@ pure @*/
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    /*@ pure nullable @*/
    public String getNumero_carta() {
        return numero_carta;
    }

    public void setNumero_carta(String numero_carta) {
        this.numero_carta = numero_carta;
    }

    /*@ pure nullable @*/
    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    /*@ pure nullable @*/
    public String getData_scadenza() {
        return data_scadenza;
    }

    public void setData_scadenza(String data_scadenza) {
        this.data_scadenza = data_scadenza;
    }

    /*@ pure nullable @*/
    public String getCircuito() {
        return circuito;
    }

    public void setCircuito(String circuito) {
        this.circuito = circuito;
    }

    /*@ pure nullable @*/
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    // Evitiamo che OpenJML si infiltri nelle specs di String/CharSequence
    //@ skipesc
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof MetodoPagamentoBean)) return false;
        MetodoPagamentoBean other = (MetodoPagamentoBean) obj;
        return this.id == other.id;
    }
}
