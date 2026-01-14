package ita.kangaroo.model;

public class AccessorioBean {

    /*@ spec_public @*/ private int id;
    /*@ spec_public @*/ private String colore;
    /*@ spec_public @*/ private String taglia;
    /*@ spec_public @*/ private ProdottoBean ProdottoId;

    //@ public invariant id >= 0;
    //@ public invariant colore != null;
    //@ public invariant taglia != null;
    //@ public invariant ProdottoId != null;

    /*@
      @ public normal_behavior
      @   requires id >= 0;
      @   requires colore != null;
      @   requires taglia != null;
      @   requires prodottoId != null;
      @   assignable \everything;
      @   ensures this.id == id;
      @   ensures this.colore == colore;
      @   ensures this.taglia == taglia;
      @   ensures this.ProdottoId == prodottoId;
      @*/
    public AccessorioBean(int id, String colore, String taglia, ProdottoBean prodottoId) {
        this.id = id;
        this.colore = colore;
        this.taglia = taglia;
        ProdottoId = prodottoId;
    }

    /*@
      @ public normal_behavior
      @   ensures \result == id;
      @   assignable \nothing;
      @*/
    public int getId() {
        return id;
    }

    /*@
      @ public normal_behavior
      @   requires id >= 0;
      @   assignable this.id;
      @   ensures this.id == id;
      @*/
    public void setId(int id) {
        this.id = id;
    }

    /*@
      @ public normal_behavior
      @   ensures \result == colore;
      @   assignable \nothing;
      @*/
    public String getColore() {
        return colore;
    }

    /*@
      @ public normal_behavior
      @   requires colore != null;
      @   assignable this.colore;
      @   ensures this.colore == colore;
      @*/
    public void setColore(String colore) {
        this.colore = colore;
    }

    /*@
      @ public normal_behavior
      @   ensures \result == taglia;
      @   assignable \nothing;
      @*/
    public String getTaglia() {
        return taglia;
    }

    /*@
      @ public normal_behavior
      @   requires taglia != null;
      @   assignable this.taglia;
      @   ensures this.taglia == taglia;
      @*/
    public void setTaglia(String taglia) {
        this.taglia = taglia;
    }

/*@
  @ public behavior
  @   requires ProdottoId != null;
  @   assignable \nothing;
  @   ensures \result == ProdottoId.getId();
  @ also
  @ public exceptional_behavior
  @   requires ProdottoId == null;
  @   assignable \nothing;
  @   signals_only NullPointerException;
  @*/
public int getProdottoId() {
    return ProdottoId.getId();
}





    /*@
      @ public normal_behavior
      @   requires prodottoId != null;
      @   assignable this.ProdottoId;
      @   ensures this.ProdottoId == prodottoId;
      @*/
    public void setProdottoId(ProdottoBean prodottoId) {
        ProdottoId = prodottoId;
    }
}
