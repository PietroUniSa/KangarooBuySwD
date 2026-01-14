package ita.kangaroo.model;

import java.util.ArrayList;

public class Prefered {

    //@ spec_public
    private ArrayList<PreferedProduct> products;

    //@ public invariant products != null;

    /*@
      public normal_behavior
        assignable \everything;
        ensures products != null;
        ensures products.size() == 0;
    @*/
    public Prefered() {
        products = new ArrayList<PreferedProduct>();
    }

    /*@
      public normal_behavior
        requires product != null;
        requires product.getId() >= 0;

        // stai modificando la lista internamente
        assignable products.*;

        ensures products.size() >= \old(products.size());
    @*/
    public void addPreferito(ProdottoBean product) {
        for (int i = 0; i < products.size(); i++) {
            PreferedProduct pp = products.get(i);
            if (pp != null && pp.getProduct() == product) return;
        }
        products.add(new PreferedProduct(product));
    }

    /*@
      public normal_behavior
        requires product != null;
        requires product.getId() >= 0;

        assignable products.*;

        ensures products.size() <= \old(products.size());
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
      public normal_behavior
        ensures \result != null;
        assignable \nothing;
    @*/
    public /*@ pure @*/ ArrayList<PreferedProduct> getProducts() {
        return new ArrayList<PreferedProduct>(products);
    }
}
