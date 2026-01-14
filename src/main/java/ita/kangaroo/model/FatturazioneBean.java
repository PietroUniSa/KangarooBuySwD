package ita.kangaroo.model;

public class FatturazioneBean {

    /*@ spec_public nullable @*/ private String sdi;
    /*@ spec_public @*/ private float importo;
    /*@ spec_public nullable @*/ private String data_scadenza;
    /*@ spec_public nullable @*/ private String data_emissione;
    /*@ spec_public nullable @*/ private String stato_pagamento;
    /*@ spec_public @*/ private float iva;
    /*@ spec_public @*/ private int id;

    //@ public invariant id >= 0;
    //@ public invariant importo >= 0.0f;
    //@ public invariant iva >= 0.0f;

    /*@
      @ public normal_behavior
      @   assignable \everything;
      @   ensures id == 0;
      @   ensures importo == 0.0f;
      @   ensures iva == 0.0f;
      @   ensures sdi == null;
      @   ensures data_scadenza == null;
      @   ensures data_emissione == null;
      @   ensures stato_pagamento == null;
      @*/
    public FatturazioneBean() {
        this.id = 0;
        this.importo = 0.0f;
        this.iva = 0.0f;
        this.sdi = null;
        this.data_scadenza = null;
        this.data_emissione = null;
        this.stato_pagamento = null;
    }

    /*@ public normal_behavior
      @   ensures \result == sdi;
      @   assignable \nothing;
      @*/
    public /*@ pure nullable @*/ String getSdi() { return sdi; }

    /*@ public normal_behavior
      @   assignable this.sdi;
      @   ensures this.sdi == sdi;
      @*/
    public void setSdi(/*@ nullable @*/ String sdi) { this.sdi = sdi; }

    /*@ public normal_behavior
      @   ensures \result == importo;
      @   assignable \nothing;
      @*/
    public /*@ pure @*/ float getImporto() { return importo; }

    /*@ public normal_behavior
      @   requires importo >= 0.0f;
      @   assignable this.importo;
      @   ensures this.importo == importo;
      @*/
    public void setImporto(float importo) { this.importo = importo; }

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
      @   ensures \result == data_emissione;
      @   assignable \nothing;
      @*/
    public /*@ pure nullable @*/ String getData_emissione() { return data_emissione; }

    /*@ public normal_behavior
      @   assignable this.data_emissione;
      @   ensures this.data_emissione == data_emissione;
      @*/
    public void setData_emissione(/*@ nullable @*/ String data_emissione) {
        this.data_emissione = data_emissione;
    }

    /*@ public normal_behavior
      @   ensures \result == stato_pagamento;
      @   assignable \nothing;
      @*/
    public /*@ pure nullable @*/ String getStato_pagamento() { return stato_pagamento; }

    /*@ public normal_behavior
      @   assignable this.stato_pagamento;
      @   ensures this.stato_pagamento == stato_pagamento;
      @*/
    public void setStato_pagamento(/*@ nullable @*/ String stato_pagamento) {
        this.stato_pagamento = stato_pagamento;
    }

    /*@ public normal_behavior
      @   ensures \result == iva;
      @   assignable \nothing;
      @*/
    public /*@ pure @*/ float getIva() { return iva; }

    /*@ public normal_behavior
      @   requires iva >= 0.0f;
      @   assignable this.iva;
      @   ensures this.iva == iva;
      @*/
    public void setIva(float iva) { this.iva = iva; }

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
}
