package ita.kangaroo.model;

public class PreferedProduct {

    /*@ spec_public @*/ private ProdottoBean product;

    //@ public invariant product != null;

    /*@
      @ public normal_behavior
      @   requires product != null;
      @   assignable this.product;
      @   ensures this.product == product;
      @*/
    public PreferedProduct(ProdottoBean product) {
        this.product = product;
    }

    /*@
      @ public normal_behavior
      @   ensures \result == product;
      @   assignable \nothing;
      @*/
    public /*@ pure @*/ ProdottoBean getProduct() {
        return product;
    }
}
