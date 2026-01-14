package ita.kangaroo.model;

import java.util.ArrayList;

public class Prefered {

    /*@ spec_public @*/
    private ArrayList<PreferedProduct> products = new ArrayList<PreferedProduct>();

    //@ public invariant products != null;

    /*@
      @ public normal_behavior
      @   ensures products != null;
      @*/
    public Prefered() {
        // già inizializzata sopra, lasciamo vuoto
    }

    /*@
      @ public behavior
      @   requires products != null;      // aiuta il prover (sì, è ridondante)
      @   requires product != null;
      @   requires product.getId() >= 0;
      @   assignable \everything;
      @   ensures products != null;
      @*/
    public void addPreferito(ProdottoBean product) {
        for (int i = 0; i < products.size(); i++) {
            PreferedProduct pp = products.get(i);
            if (pp != null && pp.getProduct() == product) return;
        }
        products.add(new PreferedProduct(product));
    }

    /*@
      @ public behavior
      @   requires products != null;
      @   requires product != null;
      @   requires product.getId() >= 0;
      @   assignable \everything;
      @   ensures products != null;
      @*/
    public void removePreferito(ProdottoBean product) {
        for (int i = 0; i < products.size(); i++) {
            PreferedProduct pp = products.get(i);
            if (pp != null && pp.getProduct() == product) {
                products.remove(i);
                break;
            }
        }
    }

    /*@
      @ public normal_behavior
      @   ensures \result != null;
      @   assignable \nothing;
      @*/
    public /*@ pure @*/ ArrayList<PreferedProduct> getProducts() {
        return new ArrayList<PreferedProduct>(products);
    }
}