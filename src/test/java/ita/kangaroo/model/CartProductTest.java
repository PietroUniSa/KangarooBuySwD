package ita.kangaroo.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static java.lang.Float.MAX_VALUE;
import static org.junit.jupiter.api.Assertions.*;

class CartProductTest {

    private ProdottoBean testProduct;

    @BeforeEach
    void setUp() {
        testProduct = new ProdottoBean();
        testProduct.setId(1);
        testProduct.setNome("Test Product");
        testProduct.setPrezzo(15);
    }

    @Test
    @DisplayName("Constructor with product and quantity should set both fields correctly")
    void testConstructorWithProductAndQuantity() {
        // Arrange
        int expectedQuantity = 5;

        // Act
        CartProduct cartProduct = new CartProduct(testProduct, expectedQuantity);

        // Assert
        assertEquals(testProduct, cartProduct.getProduct());
        assertEquals(expectedQuantity, cartProduct.getQuantity());
    }

    @Test
    @DisplayName("Constructor with product only should set quantity to 1")
    void testConstructorWithProductOnly() {
        // Arrange & Act
        CartProduct cartProduct = new CartProduct(testProduct);

        // Assert
        assertEquals(testProduct, cartProduct.getProduct());
        assertEquals(1, cartProduct.getQuantity());
    }

    @Test
    @DisplayName("Constructor with minimum positive quantity should work")
    void testConstructorWithMinimumQuantity() {
        // Arrange & Act
        CartProduct cartProduct = new CartProduct(testProduct, 1);

        // Assert
        assertEquals(testProduct, cartProduct.getProduct());
        assertEquals(1, cartProduct.getQuantity());
    }

    @Test
    @DisplayName("Constructor with large quantity should work")
    void testConstructorWithLargeQuantity() {
        // Arrange
        int largeQuantity = Integer.MAX_VALUE;

        // Act
        CartProduct cartProduct = new CartProduct(testProduct, largeQuantity);

        // Assert
        assertEquals(testProduct, cartProduct.getProduct());
        assertEquals(largeQuantity, cartProduct.getQuantity());
    }

    @Test
    @DisplayName("getProduct should return the correct product")
    void testGetProduct() {
        // Arrange
        CartProduct cartProduct = new CartProduct(testProduct, 3);

        // Act
        ProdottoBean result = cartProduct.getProduct();

        // Assert
        assertEquals(testProduct, result);
        assertSame(testProduct, result);
    }

    @Test
    @DisplayName("getQuantity should return the correct quantity")
    void testGetQuantity() {
        // Arrange
        int expectedQuantity = 7;
        CartProduct cartProduct = new CartProduct(testProduct, expectedQuantity);

        // Act
        int result = cartProduct.getQuantity();

        // Assert
        assertEquals(expectedQuantity, result);
    }

    @Test
    @DisplayName("setQuantity should update quantity correctly")
    void testSetQuantity() {
        // Arrange
        CartProduct cartProduct = new CartProduct(testProduct, 2);
        int newQuantity = 10;

        // Act
        cartProduct.setQuantity(newQuantity);

        // Assert
        assertEquals(newQuantity, cartProduct.getQuantity());
    }

    @Test
    @DisplayName("setQuantity with minimum positive value should work")
    void testSetQuantityMinimum() {
        // Arrange
        CartProduct cartProduct = new CartProduct(testProduct, 5);

        // Act
        cartProduct.setQuantity(1);

        // Assert
        assertEquals(1, cartProduct.getQuantity());
    }

    @Test
    @DisplayName("setQuantity with maximum integer value should work")
    void testSetQuantityMaximum() {
        // Arrange
        CartProduct cartProduct = new CartProduct(testProduct, 5);
        int maxQuantity = Integer.MAX_VALUE;

        // Act
        cartProduct.setQuantity(maxQuantity);

        // Assert
        assertEquals(maxQuantity, cartProduct.getQuantity());
    }

    @Test
    @DisplayName("setQuantity should preserve product reference")
    void testSetQuantityPreservesProduct() {
        // Arrange
        CartProduct cartProduct = new CartProduct(testProduct, 2);

        // Act
        cartProduct.setQuantity(8);

        // Assert
        assertEquals(testProduct, cartProduct.getProduct());
        assertEquals(8, cartProduct.getQuantity());
    }

    @Test
    @DisplayName("Multiple setQuantity calls should work correctly")
    void testMultipleSetQuantityCalls() {
        // Arrange
        CartProduct cartProduct = new CartProduct(testProduct, 1);

        // Act & Assert
        cartProduct.setQuantity(3);
        assertEquals(3, cartProduct.getQuantity());

        cartProduct.setQuantity(7);
        assertEquals(7, cartProduct.getQuantity());

        cartProduct.setQuantity(1);
        assertEquals(1, cartProduct.getQuantity());
    }

    @Test
    @DisplayName("Behavior consistency: set then get should return same value")
    void testSetGetConsistency() {
        // Arrange
        CartProduct cartProduct = new CartProduct(testProduct);
        int[] testQuantities = {1, 5, 10, 100, 1000, Integer.MAX_VALUE};

        for (int testQuantity : testQuantities) {
            // Act
            cartProduct.setQuantity(testQuantity);

            // Assert
            assertEquals(testQuantity, cartProduct.getQuantity());
        }
    }

    @Test
    @DisplayName("Product reference should remain consistent")
    void testProductReferenceConsistency() {
        // Arrange
        CartProduct cartProduct = new CartProduct(testProduct, 5);

        // Act - Multiple operations
        cartProduct.setQuantity(10);
        ProdottoBean retrievedProduct1 = cartProduct.getProduct();
        cartProduct.setQuantity(1);
        ProdottoBean retrievedProduct2 = cartProduct.getProduct();

        // Assert
        assertSame(testProduct, retrievedProduct1);
        assertSame(testProduct, retrievedProduct2);
        assertSame(retrievedProduct1, retrievedProduct2);
    }

    @Test
    @DisplayName("Constructor with different product instances should work")
    void testConstructorWithDifferentProducts() {
        // Arrange
        ProdottoBean product1 = new ProdottoBean();
        product1.setId(1);
        product1.setNome("Product 1");

        ProdottoBean product2 = new ProdottoBean();
        product2.setId(2);
        product2.setNome("Product 2");

        // Act
        CartProduct cartProduct1 = new CartProduct(product1, 3);
        CartProduct cartProduct2 = new CartProduct(product2, 7);

        // Assert
        assertEquals(product1, cartProduct1.getProduct());
        assertEquals(3, cartProduct1.getQuantity());
        assertEquals(product2, cartProduct2.getProduct());
        assertEquals(7, cartProduct2.getQuantity());
    }

    @Test
    @DisplayName("Constructor with product having null fields should work")
    void testConstructorWithProductHavingNullFields() {
        // Arrange
        ProdottoBean productWithNulls = new ProdottoBean();
        // Leave fields as default/null values

        // Act
        CartProduct cartProduct = new CartProduct(productWithNulls, 2);

        // Assert
        assertEquals(productWithNulls, cartProduct.getProduct());
        assertEquals(2, cartProduct.getQuantity());
    }

    @Test
    @DisplayName("Constructor with product having extreme values should work")
    void testConstructorWithProductHavingExtremeValues() {
        // Arrange
        ProdottoBean extremeProduct = new ProdottoBean();
        extremeProduct.setId(Integer.MAX_VALUE);
        extremeProduct.setNome("A".repeat(1000)); // Very long name
        extremeProduct.setPrezzo(MAX_VALUE);

        // Act
        CartProduct cartProduct = new CartProduct(extremeProduct, 1);

        // Assert
        assertEquals(extremeProduct, cartProduct.getProduct());
        assertEquals(1, cartProduct.getQuantity());
    }

    @Test
    @DisplayName("getProduct should not modify internal state")
    void testGetProductDoesNotModifyState() {
        // Arrange
        CartProduct cartProduct = new CartProduct(testProduct, 5);

        // Act
        ProdottoBean retrievedProduct = cartProduct.getProduct();
        // Modify retrieved product
        retrievedProduct.setNome("Modified Name");

        // Assert - Original product should be modified since we return reference
        assertEquals("Modified Name", cartProduct.getProduct().getNome());
        assertEquals(5, cartProduct.getQuantity()); // Quantity should be unchanged
    }

    @Test
    @DisplayName("getQuantity should not modify internal state")
    void testGetQuantityDoesNotModifyState() {
        // Arrange
        CartProduct cartProduct = new CartProduct(testProduct, 5);
        int originalQuantity = cartProduct.getQuantity();

        // Act
        int retrievedQuantity = cartProduct.getQuantity();
        // Attempt to modify (won't work with primitive int)
        retrievedQuantity = 999;

        // Assert
        assertEquals(originalQuantity, cartProduct.getQuantity());
        assertEquals(5, cartProduct.getQuantity());
    }
}

