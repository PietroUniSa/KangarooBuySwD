package ita.kangaroo.model;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;

public class OrdineBean {

    /*@ nullable @*/ private ArrayList<OrderProductBean> products;
    private int id;
    /*@ nullable @*/ private utenteBean client;
    private float prezzo_totale;

    /*@ nullable @*/ private String destinatario;
    /*@ nullable @*/ private String metodo_di_pagamento;
    /*@ nullable @*/ private String circuito;
    /*@ nullable @*/ private String numero_carta;
    /*@ nullable @*/ private String indirizzo_di_spedizione;
    /*@ nullable @*/ private String numero_di_tracking;
    /*@ nullable @*/ private Date data;
    /*@ nullable @*/ private String metodo_di_spedizione;

    // costruttore per le inizializzazioni nulle
    public OrdineBean() {
        products = new ArrayList<OrderProductBean>();
        this.id = 0;
        this.client = null;
        this.prezzo_totale = 0;
        this.destinatario = null;
        this.metodo_di_pagamento = null;
        this.circuito = null;
        this.numero_carta = null;
        this.indirizzo_di_spedizione = null;
        this.numero_di_tracking = null;
        this.data = null;
        this.metodo_di_spedizione = null;
    }

    // costruttore con prodotti pronti
    public OrdineBean(/*@ nullable @*/ ArrayList<OrderProductBean> products) {
        setProducts(products);
        this.id = 0;
        this.client = null;
        this.prezzo_totale = 0;
        this.destinatario = null;
        this.metodo_di_pagamento = null;
        this.circuito = null;
        this.numero_carta = null;
        this.indirizzo_di_spedizione = null;
        this.numero_di_tracking = null;
        this.data = null;
        this.metodo_di_spedizione = null;
    }

    // costruttore con cliente pronto
    public OrdineBean(/*@ nullable @*/ utenteBean client) {
        products = new ArrayList<OrderProductBean>();
        this.id = 0;
        setClient(client);
        this.prezzo_totale = 0;
        this.destinatario = null;
        this.metodo_di_pagamento = null;
        this.circuito = null;
        this.numero_carta = null;
        this.indirizzo_di_spedizione = null;
        this.numero_di_tracking = null;
        this.data = null;
        this.metodo_di_spedizione = null;
    }

    public OrdineBean(int id, /*@ nullable @*/ utenteBean client, float prezzo_totale,
                      /*@ nullable @*/ String destinatario, /*@ nullable @*/ String metodo_di_pagamento,
                      /*@ nullable @*/ String circuito, /*@ nullable @*/ String numero_carta,
                      /*@ nullable @*/ String indirizzo_di_spedizione, /*@ nullable @*/ String numero_di_tracking,
                      /*@ nullable @*/ Date data, /*@ nullable @*/ String metodo_di_spedizione) {

        this.id = id;
        this.client = client;
        this.prezzo_totale = prezzo_totale;
        this.destinatario = destinatario;
        this.metodo_di_pagamento = metodo_di_pagamento;
        this.circuito = circuito;
        this.numero_carta = numero_carta;
        this.indirizzo_di_spedizione = indirizzo_di_spedizione;
        this.numero_di_tracking = numero_di_tracking;
        this.data = data;
        this.metodo_di_spedizione = metodo_di_spedizione;
        this.products = new ArrayList<OrderProductBean>();
    }

    /*@ pure nullable @*/
    public ArrayList<OrderProductBean> getProducts() {
        return products;
    }

    public void setProducts(/*@ nullable @*/ ArrayList<OrderProductBean> products) {
        this.products = products;
    }

    /*@ pure @*/
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    /*@ pure nullable @*/
    public utenteBean getClient() {
        return client;
    }

    public void setClient(/*@ nullable @*/ utenteBean client) {
        this.client = client;
    }

    /*@ pure @*/
    public float getPrezzo_totale() {
        return prezzo_totale;
    }

    public void setPrezzo_totale(float prezzo_totale) {
        this.prezzo_totale = prezzo_totale;
    }

    /*@ pure nullable @*/
    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    /*@ pure nullable @*/
    public String getMetodo_di_pagamento() {
        return metodo_di_pagamento;
    }

    public void setMetodo_di_pagamento(String metodo_di_pagamento) {
        this.metodo_di_pagamento = metodo_di_pagamento;
    }

    /*@ pure nullable @*/
    public String getCircuito() {
        return circuito;
    }

    public void setCircuito(String circuito) {
        this.circuito = circuito;
    }

    /*@ pure nullable @*/
    public String getNumero_carta() {
        return numero_carta;
    }

    public void setNumero_carta(String numero_carta) {
        this.numero_carta = numero_carta;
    }

    /*@ pure nullable @*/
    public String getIndirizzo_di_spedizione() {
        return indirizzo_di_spedizione;
    }

    public void setIndirizzo_di_spedizione(String indirizzo_di_spedizione) {
        this.indirizzo_di_spedizione = indirizzo_di_spedizione;
    }

    /*@ pure nullable @*/
    public String getNumero_di_tracking() {
        return numero_di_tracking;
    }

    public void setNumero_di_tracking(String numero_di_tracking) {
        this.numero_di_tracking = numero_di_tracking;
    }

    /*@ pure nullable @*/
    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    /*@ pure nullable @*/
    public String getMetodo_di_spedizione() {
        return metodo_di_spedizione;
    }

    public void setMetodo_di_spedizione(String metodo_di_spedizione) {
        this.metodo_di_spedizione = metodo_di_spedizione;
    }

    // Qui ci sono Date/LocalDate: non vale la pena farlo verificare a OpenJML
    //@ skipesc
    @Override
    public String toString() {
        if (data != null) {
            LocalDate date = data.toLocalDate();
            return date.getDayOfMonth() + "-" + date.getMonthValue() + "-" + date.getYear();
        } else {
            return "Data non disponibile";
        }
    }
}
