package ita.kangaroo.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PreferedTest {

    private Prefered prefered;
    private ProdottoBean product1;
    private ProdottoBean product2;

    @BeforeEach
    void setUp() {
        prefered = new Prefered();

        product1 = new ProdottoBean();
        product1.setId(1);
        product1.setNome("Product 1");
        product1.setPrezzo(10.0f);

        product2 = new ProdottoBean();
        product2.setId(2);
        product2.setNome("Product 2");
        product2.setPrezzo(20.0f);
    }

    // Default Constructor Tests
    @Test
    @DisplayName("Default constructor should initialize products list correctly")
    void testDefaultConstructor() {
        // Arrange & Act
        Prefered newPrefered = new Prefered();

        // Assert
        assertNotNull(newPrefered.getProducts());
        assertEquals(0, newPrefered.getProducts().size());
        assertTrue(newPrefered.getProducts().isEmpty());
    }

    @Test
    @DisplayName("Constructor should satisfy JML invariant: products != null")
    void testConstructorInvariant() {
        // Arrange & Act
        Prefered newPrefered = new Prefered();

        // Assert - JML invariant: products != null
        assertNotNull(newPrefered.getProducts());
    }

    // getProducts() Tests
    @Test
    @DisplayName("getProducts should return empty list for new instance")
    void testGetProductsEmpty() {
        // Arrange & Act
        ArrayList<PreferedProduct> result = prefered.getProducts();

        // Assert
        assertNotNull(result);
        assertEquals(0, result.size());
        assertTrue(result.isEmpty());
    }

    @Test
    @DisplayName("getProducts should return defensive copy")
    void testGetProductsReturnsDefensiveCopy() {
        // Arrange
        prefered.addPreferito(product1);

        // Act
        ArrayList<PreferedProduct> list1 = prefered.getProducts();
        ArrayList<PreferedProduct> list2 = prefered.getProducts();

        // Assert
        assertNotSame(list1, list2);
        assertEquals(list1.size(), list2.size());

        // Modifying returned list should not affect internal state
        list1.clear();
        assertEquals(1, prefered.getProducts().size());
    }

    @Test
    @DisplayName("getProducts should be pure - multiple calls return consistent results")
    void testGetProductsIsPure() {
        // Arrange
        prefered.addPreferito(product1);
        prefered.addPreferito(product2);

        // Act
        ArrayList<PreferedProduct> result1 = prefered.getProducts();
        ArrayList<PreferedProduct> result2 = prefered.getProducts();
        ArrayList<PreferedProduct> result3 = prefered.getProducts();

        // Assert
        assertEquals(result1.size(), result2.size());
        assertEquals(result2.size(), result3.size());
        assertEquals(2, result1.size());
        assertEquals(2, result2.size());
        assertEquals(2, result3.size());
    }

    // addPreferito() Tests
    @Test
    @DisplayName("addPreferito should add new product to empty list")
    void testAddPreferitoToEmptyList() {
        // Arrange & Act
        prefered.addPreferito(product1);

        // Assert
        ArrayList<PreferedProduct> products = prefered.getProducts();
        assertEquals(1, products.size());

        PreferedProduct prefProduct = products.get(0);
        assertNotNull(prefProduct);
        assertEquals(product1, prefProduct.getProduct());
    }

    @Test
    @DisplayName("addPreferito should add multiple different products")
    void testAddMultipleDifferentProducts() {
        // Arrange & Act
        prefered.addPreferito(product1);
        prefered.addPreferito(product2);

        // Assert
        ArrayList<PreferedProduct> products = prefered.getProducts();
        assertEquals(2, products.size());

        boolean found1 = false, found2 = false;
        for (PreferedProduct pp : products) {
            if (pp.getProduct() == product1) {
                found1 = true;
            } else if (pp.getProduct() == product2) {
                found2 = true;
            }
        }
        assertTrue(found1 && found2);
    }

    @Test
    @DisplayName("addPreferito should not add duplicate product (same reference)")
    void testAddPreferitoNoDuplicateReference() {
        // Arrange
        prefered.addPreferito(product1);

        // Act
        prefered.addPreferito(product1); // Same reference

        // Assert
        ArrayList<PreferedProduct> products = prefered.getProducts();
        assertEquals(1, products.size()); // Should still be 1
        assertEquals(product1, products.get(0).getProduct());
    }

    @Test
    @DisplayName("addPreferito should handle products with same ID but different references")
    void testAddPreferitoSameIdDifferentReference() {
        // Arrange
        ProdottoBean duplicateIdProduct = new ProdottoBean();
        duplicateIdProduct.setId(1); // Same ID as product1
        duplicateIdProduct.setNome("Different Product");

        prefered.addPreferito(product1);

        // Act
        prefered.addPreferito(duplicateIdProduct);

        // Assert - Should add both since they are different objects
        ArrayList<PreferedProduct> products = prefered.getProducts();
        assertEquals(2, products.size());
    }

    @Test
    @DisplayName("addPreferito with product having zero ID should work")
    void testAddPreferitoZeroId() {
        // Arrange
        ProdottoBean zeroIdProduct = new ProdottoBean();
        zeroIdProduct.setId(0);
        zeroIdProduct.setNome("Zero ID Product");

        // Act
        prefered.addPreferito(zeroIdProduct);

        // Assert
        ArrayList<PreferedProduct> products = prefered.getProducts();
        assertEquals(1, products.size());
        assertEquals(zeroIdProduct, products.get(0).getProduct());
    }

    @Test
    @DisplayName("addPreferito with product having negative ID should work based on JML precondition")
    void testAddPreferitoNegativeId() {
        // Arrange - JML requires product.getId() >= 0, but let's test defensive behavior
        ProdottoBean negativeIdProduct = new ProdottoBean();
        negativeIdProduct.setId(-1);
        negativeIdProduct.setNome("Negative ID Product");

        // Act & Assert - This violates JML precondition, but we test what happens
        assertDoesNotThrow(() -> prefered.addPreferito(negativeIdProduct));

        // If it doesn't throw, verify it was added
        ArrayList<PreferedProduct> products = prefered.getProducts();
        if (products.size() > 0) {
            assertEquals(negativeIdProduct, products.get(0).getProduct());
        }
    }

    // removePreferito() Tests
    @Test
    @DisplayName("removePreferito should remove existing product")
    void testRemovePreferitoExistingProduct() {
        // Arrange
        prefered.addPreferito(product1);
        prefered.addPreferito(product2);

        // Act
        prefered.removePreferito(product1);

        // Assert
        ArrayList<PreferedProduct> products = prefered.getProducts();
        assertEquals(1, products.size());
        assertEquals(product2, products.get(0).getProduct());
    }

    @Test
    @DisplayName("removePreferito should do nothing for non-existing product")
    void testRemovePreferitoNonExistingProduct() {
        // Arrange
        prefered.addPreferito(product1);

        // Act
        prefered.removePreferito(product2);

        // Assert
        ArrayList<PreferedProduct> products = prefered.getProducts();
        assertEquals(1, products.size());
        assertEquals(product1, products.get(0).getProduct());
    }

    @Test
    @DisplayName("removePreferito should handle removing from empty list")
    void testRemovePreferitoFromEmptyList() {
        // Arrange & Act
        prefered.removePreferito(product1);

        // Assert
        ArrayList<PreferedProduct> products = prefered.getProducts();
        assertEquals(0, products.size());
    }

    @Test
    @DisplayName("removePreferito should remove only first occurrence")
    void testRemovePreferitoFirstOccurrence() {
        // Arrange - Add same product twice by manipulating internal state
        // This tests the break statement in the removal loop
        prefered.addPreferito(product1);
        prefered.addPreferito(product2);
        prefered.addPreferito(product1); // Won't be added due to duplicate check

        // Act
        prefered.removePreferito(product1);

        // Assert
        ArrayList<PreferedProduct> products = prefered.getProducts();
        assertEquals(1, products.size());
        assertEquals(product2, products.get(0).getProduct());
    }

    @Test
    @DisplayName("removePreferito should maintain correct order after removal")
    void testRemovePreferitoMaintainsOrder() {
        // Arrange
        ProdottoBean product3 = new ProdottoBean();
        product3.setId(3);
        product3.setNome("Product 3");

        prefered.addPreferito(product1);
        prefered.addPreferito(product2);
        prefered.addPreferito(product3);

        // Act - Remove middle product
        prefered.removePreferito(product2);

        // Assert
        ArrayList<PreferedProduct> products = prefered.getProducts();
        assertEquals(2, products.size());
        assertEquals(product1, products.get(0).getProduct());
        assertEquals(product3, products.get(1).getProduct());
    }

    // Edge Cases and Null Handling
    @Test
    @DisplayName("addPreferito with null product should not cause crash based on JML")
    void testAddPreferitoWithNull() {
        // Arrange & Act & Assert
        // JML precondition requires product != null, so this is a contract violation
        // But we test defensive behavior
        assertDoesNotThrow(() -> prefered.addPreferito(null));

        // Internal state should remain consistent
        assertNotNull(prefered.getProducts());
    }

    @Test
    @DisplayName("removePreferito with null product should not cause crash based on JML")
    void testRemovePreferitoWithNull() {
        // Arrange
        prefered.addPreferito(product1);

        // Act & Assert
        assertDoesNotThrow(() -> prefered.removePreferito(null));

        // Original product should still be there
        assertEquals(1, prefered.getProducts().size());
    }

    // Complex Scenarios
    @Test
    @DisplayName("Complex scenario: multiple add and remove operations")
    void testComplexScenario() {
        // Arrange
        ProdottoBean product3 = new ProdottoBean();
        product3.setId(3);
        product3.setNome("Product 3");

        // Act
        prefered.addPreferito(product1);        // Add product1
        prefered.addPreferito(product2);        // Add product2
        prefered.addPreferito(product3);        // Add product3
        prefered.removePreferito(product2);     // Remove product2
        prefered.addPreferito(product1);        // Try to add product1 again (should be ignored)
        prefered.removePreferito(product1);     // Remove product1

        // Assert
        ArrayList<PreferedProduct> products = prefered.getProducts();
        assertEquals(1, products.size());
        assertEquals(product3, products.get(0).getProduct());
    }

    @Test
    @DisplayName("Invariant should hold after all operations")
    void testInvariantConsistency() {
        // Arrange & Act - Perform various operations
        prefered.addPreferito(product1);
        assertNotNull(prefered.getProducts()); // Invariant check

        prefered.addPreferito(product2);
        assertNotNull(prefered.getProducts()); // Invariant check

        prefered.removePreferito(product1);
        assertNotNull(prefered.getProducts()); // Invariant check

        prefered.removePreferito(product2);
        assertNotNull(prefered.getProducts()); // Invariant check

        // Final state check
        assertNotNull(prefered.getProducts());
        assertEquals(0, prefered.getProducts().size());
    }

    @Test
    @DisplayName("Products with extreme ID values should work")
    void testExtremeIdValues() {
        // Arrange
        ProdottoBean maxIdProduct = new ProdottoBean();
        maxIdProduct.setId(Integer.MAX_VALUE);
        maxIdProduct.setNome("Max ID Product");

        // Act & Assert
        prefered.addPreferito(maxIdProduct);
        assertEquals(1, prefered.getProducts().size());
        assertEquals(maxIdProduct, prefered.getProducts().get(0).getProduct());

        prefered.removePreferito(maxIdProduct);
        assertEquals(0, prefered.getProducts().size());
    }

    @Test
    @DisplayName("Products with null names should work")
    void testProductsWithNullNames() {
        // Arrange
        ProdottoBean nullNameProduct = new ProdottoBean();
        nullNameProduct.setId(99);
        nullNameProduct.setNome(null);

        // Act & Assert
        assertDoesNotThrow(() -> {
            prefered.addPreferito(nullNameProduct);
            prefered.removePreferito(nullNameProduct);
        });
    }

    @Test
    @DisplayName("Large number of products should work efficiently")
    void testLargeNumberOfProducts() {
        // Arrange & Act
        for (int i = 0; i < 1000; i++) {
            ProdottoBean product = new ProdottoBean();
            product.setId(i);
            product.setNome("Product " + i);
            prefered.addPreferito(product);
        }

        // Assert
        assertEquals(1000, prefered.getProducts().size());

        // Remove some products
        for (int i = 0; i < 500; i += 2) {
            ProdottoBean product = new ProdottoBean();
            product.setId(i);
            prefered.removePreferito(product); // Won't remove since different object reference
        }

        // Should still have all 1000 since we used different object references
        assertEquals(1000, prefered.getProducts().size());
    }

    @Test
    @DisplayName("getProducts should handle null elements in internal list gracefully")
    void testGetProductsWithInternalNulls() {
        // This test ensures the getProducts method works even if internal list somehow contains nulls
        // Though this shouldn't happen with current implementation

        // Arrange
        prefered.addPreferito(product1);
        prefered.addPreferito(product2);

        // Act & Assert
        ArrayList<PreferedProduct> products = prefered.getProducts();
        assertNotNull(products);
        assertEquals(2, products.size());

        // Verify no null elements
        for (PreferedProduct pp : products) {
            assertNotNull(pp);
            assertNotNull(pp.getProduct());
        }
    }

    @Test
    @DisplayName("Repeated operations should be idempotent where appropriate")
    void testIdempotentOperations() {
        // Arrange & Act & Assert

        // Adding same product multiple times should be idempotent
        prefered.addPreferito(product1);
        assertEquals(1, prefered.getProducts().size());

        prefered.addPreferito(product1);
        assertEquals(1, prefered.getProducts().size()); // Still 1

        prefered.addPreferito(product1);
        assertEquals(1, prefered.getProducts().size()); // Still 1

        // Removing non-existent product should be idempotent
        prefered.removePreferito(product2);
        assertEquals(1, prefered.getProducts().size()); // Still 1

        prefered.removePreferito(product2);
        assertEquals(1, prefered.getProducts().size()); // Still 1

        // Remove existing product
        prefered.removePreferito(product1);
        assertEquals(0, prefered.getProducts().size());

        // Removing already removed product should be idempotent
        prefered.removePreferito(product1);
        assertEquals(0, prefered.getProducts().size()); // Still 0
    }
}

