package ita.kangaroo.model;

import java.util.ArrayList;
import java.util.Arrays;

public class Cart {

    /*@ spec_public @*/ private CartProduct[] products = new CartProduct[10];
    /*@ spec_public @*/ private int size = 0;

    /*@
      @ public invariant products != null;
      @ public invariant 0 <= size && size <= products.length;
      @*/

    /*@
      @ public normal_behavior
      @   ensures products != null;
      @   ensures size == 0;
      @*/
    public Cart() {
        // già inizializzati sopra (così OpenJML non si inventa null)
    }

    /*@
      @ public normal_behavior
      @   requires product != null;
      @   requires product.getId() > 0;
      @   assignable \everything;
      @   ensures products != null;
      @   ensures 0 <= size && size <= products.length;
      @*/
    public void addProduct(ProdottoBean product) {

        // cerca prodotto già presente
        for (int i = 0; i < size; i++) {
            CartProduct cp = products[i];
            if (cp != null) {
                ProdottoBean p = cp.getProduct();
                if (p != null && p.getId() == product.getId()) {
                    int newq = cp.getQuantity() + 1;
                    // garantito >0 perché getQuantity è int e qui incrementi
                    cp.setQuantity(newq);
                    return;
                }
            }
        }

        // aggiunta nuova entry
        if (size >= products.length) {
            products = Arrays.copyOf(products, products.length * 2);
        }

        products[size] = new CartProduct(product);
        size = size + 1;
    }

    /*@
      @ public normal_behavior
      @   requires product != null;
      @   requires product.getId() > 0;
      @   requires quantity > 0;
      @   assignable \everything;
      @   ensures products != null;
      @   ensures 0 <= size && size <= products.length;
      @*/
    public void changeQuantity(ProdottoBean product, int quantity) {
        for (int i = 0; i < size; i++) {
            CartProduct c = products[i];
            if (c != null) {
                ProdottoBean p = c.getProduct();
                if (p != null && p.getId() == product.getId()) {
                    c.setQuantity(quantity);
                    return;
                }
            }
        }
    }

    /*@
      @ public normal_behavior
      @   requires product != null;
      @   requires product.getId() > 0;
      @   assignable \everything;
      @   ensures products != null;
      @   ensures 0 <= size && size <= products.length;
      @*/
    public void removeProduct(ProdottoBean product) {

        for (int i = 0; i < size; i++) {
            CartProduct c = products[i];
            if (c != null) {
                ProdottoBean p = c.getProduct();
                if (p != null && p.getId() == product.getId()) {

                    // shift a sinistra
                    for (int j = i; j < size - 1; j++) {
                        products[j] = products[j + 1];
                    }

                    size = size - 1;
                    products[size] = null;
                    return;
                }
            }
        }
    }

    /*@
      @ public normal_behavior
      @   ensures \result != null;
      @   assignable \nothing;
      @*/
    public ArrayList<CartProduct> getProducts() {
        ArrayList<CartProduct> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            // difensivo: se per qualche motivo c'è un null, non esplodiamo
            if (products[i] != null) list.add(products[i]);
        }
        return list;
    }
}