package ita.kangaroo.model;

import java.util.ArrayList;

public class Cart {

    private ArrayList<CartProduct> products;

    /*@
      invariant products != null;

      // Niente duplicati: due CartProduct diversi non possono riferirsi allo stesso product id
      invariant (\forall int i, j;
            0 <= i && i < products.size() &&
            0 <= j && j < products.size() && i != j;
            products.get(i) != null && products.get(j) != null &&
            products.get(i).getProduct() != null && products.get(j).getProduct() != null
            ==> products.get(i).getProduct().getId() != products.get(j).getProduct().getId()
      );

      // Ogni elemento nel carrello deve avere quantità positiva e product non null
      invariant (\forall int i; 0 <= i && i < products.size();
            products.get(i) != null &&
            products.get(i).getProduct() != null &&
            products.get(i).getQuantity() > 0
      );
    @*/
    public Cart() {
        products = new ArrayList<CartProduct>();
    }

    /*@
      requires product != null;
      requires product.getId() > 0;

      // Dopo, esiste almeno un elemento nel carrello con quell'id prodotto
      ensures (\exists int i; 0 <= i && i < products.size();
                products.get(i) != null &&
                products.get(i).getProduct() != null &&
                products.get(i).getProduct().getId() == product.getId()
      );

      // E la quantità associata a quell'id è >= 1
      ensures (\forall int i; 0 <= i && i < products.size();
                products.get(i) != null &&
                products.get(i).getProduct() != null &&
                products.get(i).getProduct().getId() == product.getId()
                ==> products.get(i).getQuantity() >= 1
      );
    @*/
    public void addProduct(ProdottoBean product) {

        int pos = -1;

        for (int i = 0; i < products.size(); i++) {
            CartProduct cp = products.get(i);
            if (cp != null && cp.getProduct() != null && cp.getProduct().getId() == product.getId()) {
                pos = i;
                break;
            }
        }

        // Elemento non presente nel carrello
        if (pos == -1) {
            CartProduct p = new CartProduct(product);
            // Assumiamo che CartProduct(product) imposti quantity = 1
            this.products.add(p);
        }
        // Elemento presente: incrementa
        else {
            CartProduct p = this.products.get(pos);
            p.setQuantity(p.getQuantity() + 1);
        }
    }

    /*@
      requires product != null;
      requires product.getId() > 0;
      requires quantity > 0;

      // Se l'elemento esiste, dopo avrà quantità == quantity
      ensures (\forall int i; 0 <= i && i < products.size();
                products.get(i) != null &&
                products.get(i).getProduct() != null &&
                products.get(i).getProduct().getId() == product.getId()
                ==> products.get(i).getQuantity() == quantity
      );
    @*/
    public void changeQuantity(ProdottoBean product, int quantity) {
        for (CartProduct c : products) {
            if (c != null && c.getProduct() != null && c.getProduct().getId() == product.getId()) {
                c.setQuantity(quantity);
                break;
            }
        }
    }

    /*@
      requires product != null;
      requires product.getId() > 0;

      // Dopo la rimozione non esiste più un elemento con quell'id prodotto
      ensures (\forall int i; 0 <= i && i < products.size();
                products.get(i) != null &&
                products.get(i).getProduct() != null
                ==> products.get(i).getProduct().getId() != product.getId()
      );
    @*/
    public void removeProduct(ProdottoBean product) {
        // Fix: niente remove dentro for-each (evita ConcurrentModificationException)
        for (int i = 0; i < products.size(); i++) {
            CartProduct c = products.get(i);
            if (c != null && c.getProduct() != null && c.getProduct().getId() == product.getId()) {
                products.remove(i);
                break;
            }
        }
    }

    /*@
      ensures \result != null;
      // Ritorniamo una copia, così dall'esterno non possono rompere l'invariante del carrello
    @*/
    public ArrayList<CartProduct> getProducts() {
        return new ArrayList<CartProduct>(products);
    }
}
