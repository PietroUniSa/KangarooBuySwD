package ita.kangaroo.model;

public class CartProduct {

    //@ spec_public
    private ProdottoBean product;

    //@ spec_public
    private int quantity;

    //@ public invariant product != null;
    //@ public invariant quantity > 0;

    /*@
      @ public normal_behavior
      @   requires p != null;
      @   requires q > 0;
      @   assignable \everything;
      @   ensures this.product == p;
      @   ensures this.quantity == q;
      @*/
    public CartProduct(ProdottoBean p, int q) {
        this.product = p;
        this.quantity = q;
    }

    /*@
      @ public normal_behavior
      @   requires p != null;
      @   assignable \everything;
      @   ensures this.product == p;
      @   ensures this.quantity == 1;
      @*/
    public CartProduct(ProdottoBean p) {
        this.product = p;
        this.quantity = 1;
    }

    /*@
      @ public normal_behavior
      @   requires quantity > 0;
      @   assignable this.quantity;
      @   ensures this.quantity == quantity;
      @*/
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /*@
      @ public normal_behavior
      @   ensures \result == quantity;
      @   assignable \nothing;
      @*/
    public /*@ pure @*/ int getQuantity() {
        return quantity;
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
