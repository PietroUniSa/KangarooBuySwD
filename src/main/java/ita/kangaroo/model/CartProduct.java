package ita.kangaroo.model;

public class CartProduct {

    //@ spec_public
    private ProdottoBean product;

    //@ spec_public
    private int quantity;

    /*@
      @ public normal_behavior
      @   requires p != null;
      @   requires q > 0;
      @   assignable \everything;
      @   ensures product == p;
      @   ensures quantity == q;
      @*/
    public CartProduct(ProdottoBean p, int q) {
        this.product = p;
        this.quantity = q;
    }

    /*@
      @ public normal_behavior
      @   requires p != null;
      @   assignable \everything;
      @   ensures product == p;
      @   ensures quantity == 1;
      @*/
    public CartProduct(ProdottoBean p) {
        this.product = p;
        this.quantity = 1;
    }

    /*@
      @ public normal_behavior
      @   requires q > 0;
      @   assignable quantity;
      @   ensures quantity == q;
      @*/
    public void setQuantity(int q) {
        this.quantity = q;
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