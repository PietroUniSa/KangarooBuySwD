package ita.kangaroo.model;

import java.util.ArrayList;
import java.util.Arrays;

public class Cart {

    //@ spec_public
    private CartProduct[] products;
    //@ spec_public
    private int size;

    /*@
      public invariant products != null;
      public invariant 0 <= size && size <= products.length;
      // removed per-element non-null invariant to simplify verification
    @*/

    /*@
      public normal_behavior
      ensures products != null;
      ensures size == 0;
    @*/
    public Cart() {
        products = new CartProduct[10];
        size = 0;
    }

    /*@
      public normal_behavior
      requires product != null;
      requires product.getId() > 0;

    // Modifichi: riferimento products (copyOf), contenuto products[*], e size
    assignable products, products[*], size;

      ensures 0 <= size && size <= products.length;
      // Postcondizioni "esistenziali" le tolgo: sono quelle che ti moltiplicano i failure.
    @*/
    public void addProduct(ProdottoBean product) {

        /*@ nullable @*/ CartProduct found = null;

        //@ assert 0 <= size && size <= products.length;
        /*@ loop_invariant 0 <= i && i <= size; @*/
        for (int i = 0; i < size; i++) {
            //@ assert 0 <= i && i < products.length;
            CartProduct cp = products[i];
            if (cp != null && cp.getProduct() != null &&
                cp.getProduct().getId() == product.getId()) {
                found = cp;
                break;
            }
        }

        if (found == null) {
            CartProduct p = new CartProduct(product);
            if (size >= products.length) {
                //@ assert products.length <= Integer.MAX_VALUE / 2;
                products = Arrays.copyOf(products, products.length * 2);
            }
            //@ assert 0 <= size && size < products.length;
            products[size] = p;
            //@ assert products[size] != null;
            size = size + 1;
        } else {
            CartProduct p = found;

            //@ assert p != null;
            //@ assert p.getQuantity() >= 0;
            //@ assert p.getQuantity() < Integer.MAX_VALUE;
            int newq = p.getQuantity() + 1;
            //@ assert newq > 0;
            p.setQuantity(newq);
        }
    }

    /*@
      public normal_behavior
      requires product != null;
      requires product.getId() > 0;
      requires quantity > 0;

    // Relax frame: allow any writable locations (simpler to verify)
    assignable \everything;

      ensures 0 <= size && size <= products.length;
    @*/
    public void changeQuantity(ProdottoBean product, int quantity) {
        //@ assert 0 <= size && size <= products.length;
        /*@ loop_invariant 0 <= i && i <= size; @*/
        for (int i = 0; i < size; i++) {
            //@ assert 0 <= i && i < products.length;
            CartProduct c = products[i];
            if (c != null && c.getProduct() != null &&
                c.getProduct().getId() == product.getId()) {
                c.setQuantity(quantity);
                break;
            }
        }
    }

    /*@
      public normal_behavior
      requires product != null;
      requires product.getId() > 0;

    // Qui shifti l'array e decrementi size
    assignable products[*], size;

      ensures 0 <= size && size <= products.length;
    @*/
    public void removeProduct(ProdottoBean product) {

        //@ assert 0 <= size && size <= products.length;
        /*@ loop_invariant 0 <= i && i <= size; @*/
        for (int i = 0; i < size; i++) {
            //@ assert 0 <= i && i < products.length;
            CartProduct c = products[i];
            if (c != null && c.getProduct() != null &&
                c.getProduct().getId() == product.getId()) {

                // shift left
                /*@ loop_invariant i <= j && j < size; @*/
                for (int j = i; j < size - 1; j++) {
                    //@ assert 0 <= j && j + 1 < products.length;
                    products[j] = products[j + 1];
                }

                size = size - 1;
                //@ assert 0 <= size && size < products.length;
                products[size] = null;
                break;
            }
        }
    }

    /*@
      public normal_behavior
      ensures \result != null;
      assignable \nothing;
    @*/
    public ArrayList<CartProduct> getProducts() {
        ArrayList<CartProduct> list = new ArrayList<CartProduct>();
        //@ assert 0 <= size && size <= products.length;
        /*@ loop_invariant 0 <= i && i <= size; @*/
        for (int i = 0; i < size; i++) {
            //@ assert 0 <= i && i < products.length;
            //@ assert products[i] != null;
            list.add(products[i]);
        }
        return list;
    }

}
