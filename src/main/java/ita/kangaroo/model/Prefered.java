package ita.kangaroo.model;

import java.util.ArrayList;

public class Prefered {

    private ArrayList<PreferedProduct> products;

    /*@
      invariant products != null;

      // Nessun duplicato: due PreferedProduct diversi non possono riferirsi allo stesso product id
      invariant (\forall int i, j;
            0 <= i && i < products.size() &&
            0 <= j && j < products.size() && i != j;
            products.get(i) != null && products.get(j) != null &&
            products.get(i).getProduct() != null && products.get(j).getProduct() != null
            ==> products.get(i).getProduct().getId() != products.get(j).getProduct().getId()
      );

      // Ogni elemento deve avere product non null
      invariant (\forall int i; 0 <= i && i < products.size();
            products.get(i) != null &&
            products.get(i).getProduct() != null
      );
    @*/
    public Prefered() {
        products = new ArrayList<PreferedProduct>();
    }

    /*@
      requires product != null;
      requires product.getId() > 0;

      // Dopo l'operazione, il prodotto è nei preferiti (esiste almeno un elemento con quell'id)
      ensures (\exists int i; 0 <= i && i < products.size();
                products.get(i) != null &&
                products.get(i).getProduct() != null &&
                products.get(i).getProduct().getId() == product.getId()
      );
    @*/
    public void addPreferito(ProdottoBean product) {

        int pos = -1;

        for (int i = 0; i < products.size(); i++) {
            PreferedProduct pp = products.get(i);
            if (pp != null && pp.getProduct() != null && pp.getProduct().getId() == product.getId()) {
                pos = i;
                break;
            }
        }

        // Elemento non presente: aggiungi
        if (pos == -1) {
            PreferedProduct p = new PreferedProduct(product);
            this.products.add(p);
        }
        // Elemento già presente: non fare nulla (comportamento voluto)
        else {
            // no-op
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
    public void removePreferito(ProdottoBean product) {
        // Fix: niente remove dentro for-each (evita ConcurrentModificationException)
        for (int i = 0; i < products.size(); i++) {
            PreferedProduct c = products.get(i);
            if (c != null && c.getProduct() != null && c.getProduct().getId() == product.getId()) {
                products.remove(i);
                break;
            }
        }
    }

    /*@
      ensures \result != null;
      // Ritorniamo una copia per non permettere modifiche esterne che violano gli invarianti
    @*/
    public ArrayList<PreferedProduct> getProducts() {
        return new ArrayList<PreferedProduct>(products);
    }
}
