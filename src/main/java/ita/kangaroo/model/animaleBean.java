package ita.kangaroo.model;

public class animaleBean extends ProdottoBean {

    //@ spec_public
    private int id1;
    //@ spec_public
    private String continente;
    //@ spec_public
    private int eta;
    //@ spec_public
    private double peso;
    //@ spec_public
    private String sesso;

    //@ public invariant id1 >= 0;
    //@ public invariant continente != null;
    //@ public invariant eta >= 0;
    //@ public invariant peso >= 0.0;
    //@ public invariant sesso != null;

    /*@
      @ public behavior
      @   assignable \everything;
      @   ensures id1 == 0;
      @   ensures continente != null && continente.equals("");
      @   ensures eta == 0;
      @   ensures peso == 0.0;
      @   ensures sesso != null && sesso.equals("");
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
      @ public behavior
      @   // --- Precondizioni per soddisfare ProdottoBean(...) ---
      @   requires id >= 0;
      @   requires descrizione != null;
      @   requires nome != null;
      @   requires immagine != null;
      @   requires prezzo >= 0.0f;
      @   requires quantita >= 0;
      @   requires iva >= 0.0f;
      @   requires tipo != null;
      @
      @   // --- Precondizioni specifiche di animaleBean ---
      @   requires id1 >= 0;
      @   requires continente != null;
      @   requires eta >= 0;
      @   requires peso >= 0.0;
      @   requires sesso != null;
      @
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
            int id1, /*@ non_null @*/ String continente, int eta, double peso, /*@ non_null @*/ String sesso) {

        super(id, descrizione, nome, immagine, prezzo, quantita, iva, tipo);
        this.id1 = id1;
        this.continente = continente;
        this.eta = eta;
        this.peso = peso;
        this.sesso = sesso;
    }

    /*@ public normal_behavior
      @   assignable \nothing;
      @   ensures \result == id1;
      @*/
    public int getId1() { return id1; }

    /*@ public normal_behavior
      @   requires id1 >= 0;
      @   assignable this.id1;
      @   ensures this.id1 == id1;
      @*/
    public void setId1(int id1) { this.id1 = id1; }

    /*@ public normal_behavior
      @   assignable \nothing;
      @   ensures \result == continente;
      @*/
    public String getContinente() { return continente; }

    /*@ public normal_behavior
      @   requires continente != null;
      @   assignable this.continente;
      @   ensures this.continente == continente;
      @*/
    public void setContinente(String continente) { this.continente = continente; }

    /*@ public normal_behavior
      @   assignable \nothing;
      @   ensures \result == eta;
      @*/
    public int getEta() { return eta; }

    /*@ public normal_behavior
      @   requires eta >= 0;
      @   assignable this.eta;
      @   ensures this.eta == eta;
      @*/
    public void setEta(int eta) { this.eta = eta; }

    /*@ public normal_behavior
      @   assignable \nothing;
      @   ensures \result == peso;
      @*/
    public double getPeso() { return peso; }

    /*@ public normal_behavior
      @   requires peso >= 0.0;
      @   assignable this.peso;
      @   ensures this.peso == peso;
      @*/
    public void setPeso(double peso) { this.peso = peso; }

    /*@ public normal_behavior
      @   assignable \nothing;
      @   ensures \result == sesso;
      @*/
    public String getSesso() { return sesso; }

    /*@ public normal_behavior
      @   requires sesso != null;
      @   assignable this.sesso;
      @   ensures this.sesso == sesso;
      @*/
    public void setSesso(String sesso) { this.sesso = sesso; }

    /*@ also
      @ public normal_behavior
      @   assignable \nothing;
      @   ensures \result == super.getId();
      @*/
    @Override
    public int getId() { return super.getId(); }
}
