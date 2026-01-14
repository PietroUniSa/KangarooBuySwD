package ita.kangaroo.model;

public class MetodoPagamentoBean {

    /*@ spec_public @*/ private int id;

    /*@ spec_public nullable @*/ private String numero_carta;
    /*@ spec_public nullable @*/ private String cvv;
    /*@ spec_public nullable @*/ private String data_scadenza;
    /*@ spec_public nullable @*/ private String circuito;
    /*@ spec_public nullable @*/ private String username;

    //@ public invariant id >= 0;

    /*@
      @ public normal_behavior
      @   assignable \everything;
      @   ensures id == 0;
      @   ensures numero_carta == null;
      @   ensures cvv == null;
      @   ensures data_scadenza == null;
      @   ensures circuito == null;
      @   ensures username == null;
      @*/
    public MetodoPagamentoBean() {
        this.id = 0;
        this.numero_carta = null;
        this.cvv = null;
        this.data_scadenza = null;
        this.circuito = null;
        this.username = null;
    }

    /*@ public normal_behavior
      @   ensures \result == id;
      @   assignable \nothing;
      @*/
    public /*@ pure @*/ int getId() { return id; }

    /*@ public normal_behavior
      @   requires id >= 0;
      @   assignable this.id;
      @   ensures this.id == id;
      @*/
    public void setId(int id) { this.id = id; }

    /*@ public normal_behavior
      @   ensures \result == numero_carta;
      @   assignable \nothing;
      @*/
    public /*@ pure nullable @*/ String getNumero_carta() { return numero_carta; }

    /*@ public normal_behavior
      @   assignable this.numero_carta;
      @   ensures this.numero_carta == numero_carta;
      @*/
    public void setNumero_carta(/*@ nullable @*/ String numero_carta) {
        this.numero_carta = numero_carta;
    }

    /*@ public normal_behavior
      @   ensures \result == cvv;
      @   assignable \nothing;
      @*/
    public /*@ pure nullable @*/ String getCvv() { return cvv; }

    /*@ public normal_behavior
      @   assignable this.cvv;
      @   ensures this.cvv == cvv;
      @*/
    public void setCvv(/*@ nullable @*/ String cvv) { this.cvv = cvv; }

    /*@ public normal_behavior
      @   ensures \result == data_scadenza;
      @   assignable \nothing;
      @*/
    public /*@ pure nullable @*/ String getData_scadenza() { return data_scadenza; }

    /*@ public normal_behavior
      @   assignable this.data_scadenza;
      @   ensures this.data_scadenza == data_scadenza;
      @*/
    public void setData_scadenza(/*@ nullable @*/ String data_scadenza) {
        this.data_scadenza = data_scadenza;
    }

    /*@ public normal_behavior
      @   ensures \result == circuito;
      @   assignable \nothing;
      @*/
    public /*@ pure nullable @*/ String getCircuito() { return circuito; }

    /*@ public normal_behavior
      @   assignable this.circuito;
      @   ensures this.circuito == circuito;
      @*/
    public void setCircuito(/*@ nullable @*/ String circuito) { this.circuito = circuito; }

    /*@ public normal_behavior
      @   ensures \result == username;
      @   assignable \nothing;
      @*/
    public /*@ pure nullable @*/ String getUsername() { return username; }

    /*@ public normal_behavior
      @   assignable this.username;
      @   ensures this.username == username;
      @*/
    public void setUsername(/*@ nullable @*/ String username) { this.username = username; }

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