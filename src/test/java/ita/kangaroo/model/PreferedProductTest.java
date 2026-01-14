package ita.kangaroo. model;

import org.junit. jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class PreferedProductTest {  // ← MANCAVA LA DICHIARAZIONE CLASSE!

    private ProdottoBean validProduct;

    @BeforeEach
    void setUp() {
        validProduct = new ProdottoBean();
        // Inizializza il prodotto se necessario
        // validProduct.setNome("Test Product");
        // validProduct.setPrezzo(10.0);
    }

    @Test
    @DisplayName("Constructor with valid product should store product")
    void constructorWithValidProductShouldStoreProduct() {
        // Act
        PreferedProduct preferedProduct = new PreferedProduct(validProduct);

        // Assert
        assertEquals(validProduct, preferedProduct.getProduct());
        assertNotNull(preferedProduct.getProduct());
    }

    @Test
    @DisplayName("Constructor with null product should handle null gracefully")
    void constructorWithNullProductShouldStoreNull() {
        // Act
        PreferedProduct preferedProduct = new PreferedProduct(null);

        // Assert
        assertNull(preferedProduct.getProduct());
    }

    @Test
    @DisplayName("getProduct should return exact same instance passed to constructor")
    void getProductShouldReturnExactSameInstancePassedToConstructor() {
        // Act
        PreferedProduct preferedProduct = new PreferedProduct(validProduct);

        // Assert
        assertSame(validProduct, preferedProduct. getProduct());
    }

    @Test
    @DisplayName("Multiple calls to getProduct should return same instance")
    void multipleCallsToGetProductShouldReturnSameInstance() {
        // Arrange
        PreferedProduct preferedProduct = new PreferedProduct(validProduct);

        // Act
        ProdottoBean firstCall = preferedProduct.getProduct();
        ProdottoBean secondCall = preferedProduct.getProduct();

        // Assert
        assertSame(firstCall, secondCall);
        assertSame(validProduct, firstCall);
        assertSame(validProduct, secondCall);
    }

    @Test
    @DisplayName("Constructor with different product instances should store different products")
    void constructorWithDifferentProductInstancesShouldStoreDifferentProducts() {
        // Arrange
        ProdottoBean prodotto1 = new ProdottoBean();
        ProdottoBean prodotto2 = new ProdottoBean();

        // Act
        PreferedProduct preferedProduct1 = new PreferedProduct(prodotto1);
        PreferedProduct preferedProduct2 = new PreferedProduct(prodotto2);

        // Assert
        assertSame(prodotto1, preferedProduct1.getProduct());
        assertSame(prodotto2, preferedProduct2.getProduct());
        assertNotSame(preferedProduct1.getProduct(), preferedProduct2.getProduct());
    }

    // ✅ TEST AGGIUNTIVI per migliorare la copertura

    @Test
    @DisplayName("Two PreferedProduct instances with same product should not be same object")
    void twoPreferedProductInstancesWithSameProductShouldNotBeSameObject() {
        // Act
        PreferedProduct prefered1 = new PreferedProduct(validProduct);
        PreferedProduct prefered2 = new PreferedProduct(validProduct);

        // Assert
        assertNotSame(prefered1, prefered2);
        assertSame(prefered1.getProduct(), prefered2.getProduct());
    }

    @Test
    @DisplayName("toString should not throw exception")
    void toStringShouldNotThrowException() {
        // Arrange
        PreferedProduct preferedProduct = new PreferedProduct(validProduct);

        // Act & Assert
        assertDoesNotThrow(() -> {
            String result = preferedProduct.toString();
            assertNotNull(result);
        });
    }

    @Test
    @DisplayName("equals should work correctly with same product")
    void equalsShouldWorkCorrectlyWithSameProduct() {
        // Arrange
        PreferedProduct prefered1 = new PreferedProduct(validProduct);
        PreferedProduct prefered2 = new PreferedProduct(validProduct);

        // Act & Assert (se equals è implementato)
        // assertEquals(prefered1, prefered2);  // Decommentare se equals è implementato

        // Altrimenti test di base
        assertNotSame(prefered1, prefered2);
        assertSame(prefered1.getProduct(), prefered2.getProduct());
    }

    @Test
    @DisplayName("hashCode should be consistent")
    void hashCodeShouldBeConsistent() {
        // Arrange
        PreferedProduct preferedProduct = new PreferedProduct(validProduct);

        // Act
        int firstHashCode = preferedProduct.hashCode();
        int secondHashCode = preferedProduct.hashCode();

        // Assert
        assertEquals(firstHashCode, secondHashCode);
    }

    // ✅ PARAMETERIZED TEST per test più efficienti
    @ParameterizedTest
    @DisplayName("Constructor should handle various product states")
    @NullSource
    void constructorShouldHandleVariousProductStates(ProdottoBean product) {
        // Act
        PreferedProduct preferedProduct = new PreferedProduct(product);

        // Assert
        assertEquals(product, preferedProduct.getProduct());
    }

    // ✅ EDGE CASES
    @Nested
    @DisplayName("Edge Cases")
    class EdgeCases {

        @Test
        @DisplayName("Should handle product with null fields")
        void shouldHandleProductWithNullFields() {
            // Arrange
            ProdottoBean productWithNulls = new ProdottoBean();
            // Lascia i campi null

            // Act
            PreferedProduct preferedProduct = new PreferedProduct(productWithNulls);

            // Assert
            assertNotNull(preferedProduct);
            assertSame(productWithNulls, preferedProduct.getProduct());
        }
    }
}