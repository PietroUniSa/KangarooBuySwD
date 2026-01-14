package ita.kangaroo.model;

import ita.kangaroo.model.PreferedProduct;
import ita.kangaroo.model.ProdottoBean;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PreferedProductTest {

    @Test
    void constructorShouldInitializeProductCorrectly() {
        ProdottoBean prodotto = new ProdottoBean();
        PreferedProduct preferedProduct = new PreferedProduct(prodotto);

        assertEquals(prodotto, preferedProduct.getProduct());
    }

    @Test
    void getProductShouldReturnNullIfInitializedWithNull() {
        PreferedProduct preferedProduct = new PreferedProduct(null);

        assertNull(preferedProduct.getProduct());
    }

    @Test
    void getProductShouldReturnSameInstanceAsSetInConstructor() {
        ProdottoBean prodotto = new ProdottoBean();
        PreferedProduct preferedProduct = new PreferedProduct(prodotto);

        assertSame(prodotto, preferedProduct.getProduct());
    }
}
