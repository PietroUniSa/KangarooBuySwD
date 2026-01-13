package ita.kangaroo.model;

public class FatturazioneBean {

    /*@ nullable @*/ private String sdi;
    private float importo;
    /*@ nullable @*/ private String data_scadenza;
    /*@ nullable @*/ private String data_emissione;
    /*@ nullable @*/ private String stato_pagamento;
    private float iva;
    private int id;

    public FatturazioneBean() {}

    /*@ pure nullable @*/
    public String getSdi() {
        return sdi;
    }

    public void setSdi(String sdi) {
        this.sdi = sdi;
    }

    /*@ pure @*/
    public float getImporto() {
        return importo;
    }

    public void setImporto(float importo) {
        this.importo = importo;
    }

    /*@ pure nullable @*/
    public String getData_scadenza() {
        return data_scadenza;
    }

    public void setData_scadenza(String data_scadenza) {
        this.data_scadenza = data_scadenza;
    }

    /*@ pure nullable @*/
    public String getData_emissione() {
        return data_emissione;
    }

    public void setData_emissione(String data_emissione) {
        this.data_emissione = data_emissione;
    }

    /*@ pure nullable @*/
    public String getStato_pagamento() {
        return stato_pagamento;
    }

    public void setStato_pagamento(String stato_pagamento) {
        this.stato_pagamento = stato_pagamento;
    }

    /*@ pure @*/
    public float getIva() {
        return iva;
    }

    public void setIva(float iva) {
        this.iva = iva;
    }

    /*@ pure @*/
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
