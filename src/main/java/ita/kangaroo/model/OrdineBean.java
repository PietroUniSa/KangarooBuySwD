package ita.kangaroo.model;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;

public class OrdineBean {

    /*@ spec_public @*/ private ArrayList<OrderProductBean> products;
    /*@ spec_public @*/ private int id;
    /*@ spec_public nullable @*/ private utenteBean client;
    /*@ spec_public @*/ private float prezzo_totale;

    /*@ spec_public nullable @*/ private String destinatario;
    /*@ spec_public nullable @*/ private String metodo_di_pagamento;
    /*@ spec_public nullable @*/ private String circuito;
    /*@ spec_public nullable @*/ private String numero_carta;
    /*@ spec_public nullable @*/ private String indirizzo_di_spedizione;
    /*@ spec_public nullable @*/ private String numero_di_tracking;
    /*@ spec_public nullable @*/ private Date data;
    /*@ spec_public nullable @*/ private String metodo_di_spedizione;

    //@ public invariant products != null;
    //@ public invariant id >= 0;
    //@ public invariant prezzo_totale >= 0.0f;

    /*@
      @ public normal_behavior
      @   assignable \everything;
      @   ensures products != null;
      @   ensures products.size() == 0;
      @   ensures id == 0;
      @   ensures client == null;
      @   ensures prezzo_totale == 0.0f;
      @*/
    public OrdineBean() {
        products = new ArrayList<>();
        this.id = 0;
        this.client = null;
        this.prezzo_totale = 0.0f;
        this.destinatario = null;
        this.metodo_di_pagamento = null;
        this.circuito = null;
        this.numero_carta = null;
        this.indirizzo_di_spedizione = null;
        this.numero_di_tracking = null;
        this.data = null;
        this.metodo_di_spedizione = null;
    }

    /*@
      @ public normal_behavior
      @   requires products != null;
      @   assignable \everything;
      @   ensures this.products == products;
      @   ensures id == 0;
      @   ensures client == null;
      @   ensures prezzo_totale == 0.0f;
      @*/
    public OrdineBean(ArrayList<OrderProductBean> products) {
        this.products = products;
        this.id = 0;
        this.client = null;
        this.prezzo_totale = 0.0f;
        this.destinatario = null;
        this.metodo_di_pagamento = null;
        this.circuito = null;
        this.numero_carta = null;
        this.indirizzo_di_spedizione = null;
        this.numero_di_tracking = null;
        this.data = null;
        this.metodo_di_spedizione = null;
    }

    /*@
      @ public normal_behavior
      @   assignable \everything;
      @   ensures products != null;
      @   ensures products.size() == 0;
      @   ensures id == 0;
      @   ensures this.client == client;
      @   ensures prezzo_totale == 0.0f;
      @*/
    public OrdineBean(/*@ nullable @*/ utenteBean client) {
        products = new ArrayList<>();
        this.id = 0;
        this.client = client;
        this.prezzo_totale = 0.0f;
        this.destinatario = null;
        this.metodo_di_pagamento = null;
        this.circuito = null;
        this.numero_carta = null;
        this.indirizzo_di_spedizione = null;
        this.numero_di_tracking = null;
        this.data = null;
        this.metodo_di_spedizione = null;
    }

    /*@
      @ public normal_behavior
      @   requires id >= 0;
      @   requires prezzo_totale >= 0.0f;
      @   assignable \everything;
      @   ensures this.id == id;
      @   ensures this.client == client;
      @   ensures this.prezzo_totale == prezzo_totale;
      @   ensures this.destinatario == destinatario;
      @   ensures this.metodo_di_pagamento == metodo_di_pagamento;
      @   ensures this.circuito == circuito;
      @   ensures this.numero_carta == numero_carta;
      @   ensures this.indirizzo_di_spedizione == indirizzo_di_spedizione;
      @   ensures this.numero_di_tracking == numero_di_tracking;
      @   ensures this.data == data;
      @   ensures this.metodo_di_spedizione == metodo_di_spedizione;
      @   ensures this.products != null;
      @   ensures this.products.size() == 0;
      @*/
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
        this.products = new ArrayList<>();
    }

    /*@ public normal_behavior ensures \result == products; assignable \nothing; @*/
    public /*@ pure @*/ ArrayList<OrderProductBean> getProducts() { return products; }

    /*@
      @ public normal_behavior
      @   requires products != null;
      @   assignable this.products;
      @   ensures this.products == products;
      @*/
    public void setProducts(ArrayList<OrderProductBean> products) { this.products = products; }

    /*@ public normal_behavior ensures \result == id; assignable \nothing; @*/
    public /*@ pure @*/ int getId() { return id; }

    /*@
      @ public normal_behavior
      @   requires id >= 0;
      @   assignable this.id;
      @   ensures this.id == id;
      @*/
    public void setId(int id) { this.id = id; }

    /*@ public normal_behavior ensures \result == client; assignable \nothing; @*/
    public /*@ pure nullable @*/ utenteBean getClient() { return client; }

    /*@
      @ public normal_behavior
      @   assignable this.client;
      @   ensures this.client == client;
      @*/
    public void setClient(/*@ nullable @*/ utenteBean client) { this.client = client; }

    /*@ public normal_behavior ensures \result == prezzo_totale; assignable \nothing; @*/
    public /*@ pure @*/ float getPrezzo_totale() { return prezzo_totale; }

    /*@
      @ public normal_behavior
      @   requires prezzo_totale >= 0.0f;
      @   assignable this.prezzo_totale;
      @   ensures this.prezzo_totale == prezzo_totale;
      @*/
    public void setPrezzo_totale(float prezzo_totale) { this.prezzo_totale = prezzo_totale; }

    /*@ public normal_behavior ensures \result == destinatario; assignable \nothing; @*/
    public /*@ pure nullable @*/ String getDestinatario() { return destinatario; }

    /*@ public normal_behavior assignable this.destinatario; ensures this.destinatario == destinatario; @*/
    public void setDestinatario(/*@ nullable @*/ String destinatario) { this.destinatario = destinatario; }

    /*@ public normal_behavior ensures \result == metodo_di_pagamento; assignable \nothing; @*/
    public /*@ pure nullable @*/ String getMetodo_di_pagamento() { return metodo_di_pagamento; }

    /*@ public normal_behavior assignable this.metodo_di_pagamento; ensures this.metodo_di_pagamento == metodo_di_pagamento; @*/
    public void setMetodo_di_pagamento(/*@ nullable @*/ String metodo_di_pagamento) { this.metodo_di_pagamento = metodo_di_pagamento; }

    /*@ public normal_behavior ensures \result == circuito; assignable \nothing; @*/
    public /*@ pure nullable @*/ String getCircuito() { return circuito; }

    /*@ public normal_behavior assignable this.circuito; ensures this.circuito == circuito; @*/
    public void setCircuito(/*@ nullable @*/ String circuito) { this.circuito = circuito; }

    /*@ public normal_behavior ensures \result == numero_carta; assignable \nothing; @*/
    public /*@ pure nullable @*/ String getNumero_carta() { return numero_carta; }

    /*@ public normal_behavior assignable this.numero_carta; ensures this.numero_carta == numero_carta; @*/
    public void setNumero_carta(/*@ nullable @*/ String numero_carta) { this.numero_carta = numero_carta; }

    /*@ public normal_behavior ensures \result == indirizzo_di_spedizione; assignable \nothing; @*/
    public /*@ pure nullable @*/ String getIndirizzo_di_spedizione() { return indirizzo_di_spedizione; }

    /*@ public normal_behavior assignable this.indirizzo_di_spedizione; ensures this.indirizzo_di_spedizione == indirizzo_di_spedizione; @*/
    public void setIndirizzo_di_spedizione(/*@ nullable @*/ String indirizzo_di_spedizione) { this.indirizzo_di_spedizione = indirizzo_di_spedizione; }

    /*@ public normal_behavior ensures \result == numero_di_tracking; assignable \nothing; @*/
    public /*@ pure nullable @*/ String getNumero_di_tracking() { return numero_di_tracking; }

    /*@ public normal_behavior assignable this.numero_di_tracking; ensures this.numero_di_tracking == numero_di_tracking; @*/
    public void setNumero_di_tracking(/*@ nullable @*/ String numero_di_tracking) { this.numero_di_tracking = numero_di_tracking; }

    /*@ public normal_behavior ensures \result == data; assignable \nothing; @*/
    public /*@ pure nullable @*/ Date getData() { return data; }

    /*@ public normal_behavior assignable this.data; ensures this.data == data; @*/
    public void setData(/*@ nullable @*/ Date data) { this.data = data; }

    /*@ public normal_behavior ensures \result == metodo_di_spedizione; assignable \nothing; @*/
    public /*@ pure nullable @*/ String getMetodo_di_spedizione() { return metodo_di_spedizione; }

    /*@ public normal_behavior assignable this.metodo_di_spedizione; ensures this.metodo_di_spedizione == metodo_di_spedizione; @*/
    public void setMetodo_di_spedizione(/*@ nullable @*/ String metodo_di_spedizione) { this.metodo_di_spedizione = metodo_di_spedizione; }

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