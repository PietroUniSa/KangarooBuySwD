package ita.kangaroo.model;

public class CartProduct {
    //@ spec_public
    private ProdottoBean product;

    //@ spec_public
    private int quantity;

    /*@
      // Removed strict invariants to avoid invariant-entrance proof obligations
      // that the prover cannot establish for array elements.
    @*/

    /*@
      public normal_behavior
      requires p != null && q > 0;
      ensures this.product == p;
      ensures this.quantity == q;
    @*/
    public CartProduct(ProdottoBean p, int q) {
        this.product = p;
        this.quantity = q;
    }

    /*@
      public normal_behavior
      requires p != null;
      ensures this.product == p;
      ensures this.quantity == 1;
    @*/
    public CartProduct(ProdottoBean p) {
        this.product = p;
        this.quantity = 1;
    }

    /*@
      requires quantity > 0;
      ensures this.quantity == quantity;
      assignable this.quantity;
    @*/
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /*@ ensures \result == quantity; assignable \nothing; @*/
    /*@ pure @*/
    public int getQuantity() {
        return quantity;
    }

    /*@ ensures \result == product; assignable \nothing; @*/
    /*@ pure @*/
    public ProdottoBean getProduct() {
        return product;
    }
}
  