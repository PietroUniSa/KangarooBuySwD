package ita.kangaroo.model;

public class animaleBean extends ProdottoBean {

    /*@ spec_public @*/ private int id1;
    /*@ spec_public @*/ private String continente;
    /*@ spec_public @*/ private int eta;
    /*@ spec_public @*/ private double peso;
    /*@ spec_public @*/ private String sesso;

    //@ public invariant id1 >= 0;
    //@ public invariant continente != null;
    //@ public invariant eta >= 0;
    //@ public invariant peso >= 0.0;
    //@ public invariant sesso != null;

    /*@
      @ public normal_behavior
      @   assignable \everything;
      @*/
    public animaleBean() {
        super();
        this.id1 = 0;
        this.continente = "";
        this.eta = 0;
        this.peso = 0.0;
        this.sesso = "";
    }

    /*@
      @ public normal_behavior
      @   requires id1 >= 0;
      @   requires continente != null;
      @   requires eta >= 0;
      @   requires peso >= 0.0;
      @   requires sesso != null;
      @   assignable \everything;
      @   ensures this.id1 == id1;
      @   ensures this.continente == continente;
      @   ensures this.eta == eta;
      @   ensures this.peso == peso;
      @   ensures this.sesso == sesso;
      @*/
    public animaleBean(
            int id, String descrizione, String nome, String immagine,
            float prezzo, int quantita, float iva, tipo tipo,
            int id1, String continente, int eta, double peso, String sesso) {

        super(id, descrizione, nome, immagine, prezzo, quantita, iva, tipo);
        this.id1 = id1;
        this.continente = continente;
        this.eta = eta;
        this.peso = peso;
        this.sesso = sesso;
    }

    /*@ public normal_behavior ensures \result == id1; assignable \nothing; @*/
    public /*@ pure @*/ int getId1() { return id1; }

    /*@ public normal_behavior requires id1 >= 0; assignable this.id1; ensures this.id1 == id1; @*/
    public void setId1(int id1) { this.id1 = id1; }

    /*@ public normal_behavior ensures \result == continente; assignable \nothing; @*/
    public /*@ pure @*/ String getContinente() { return continente; }

    /*@ public normal_behavior requires continente != null; assignable this.continente; ensures this.continente == continente; @*/
    public void setContinente(String continente) { this.continente = continente; }

    /*@ public normal_behavior ensures \result == eta; assignable \nothing; @*/
    public /*@ pure @*/ int getEta() { return eta; }

    /*@ public normal_behavior requires eta >= 0; assignable this.eta; ensures this.eta == eta; @*/
    public void setEta(int eta) { this.eta = eta; }

    /*@ public normal_behavior ensures \result == peso; assignable \nothing; @*/
    public /*@ pure @*/ double getPeso() { return peso; }

    /*@ public normal_behavior requires peso >= 0.0; assignable this.peso; ensures this.peso == peso; @*/
    public void setPeso(double peso) { this.peso = peso; }

    /*@ public normal_behavior ensures \result == sesso; assignable \nothing; @*/
    public /*@ pure @*/ String getSesso() { return sesso; }

    /*@ public normal_behavior requires sesso != null; assignable this.sesso; ensures this.sesso == sesso; @*/
    public void setSesso(String sesso) { this.sesso = sesso; }

    @Override
    public /*@ pure @*/ int getId() { return super.getId(); }
}
