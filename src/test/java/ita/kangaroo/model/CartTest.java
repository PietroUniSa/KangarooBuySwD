package ita.kangaroo.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CartTest {

    private Cart cart;
    private ProdottoBean product1;
    private ProdottoBean product2;

    @BeforeEach
    void setUp() {
        cart = new Cart();

        product1 = new ProdottoBean();
        product1.setId(1);
        product1.setNome("Product 1");
        product1.setPrezzo(10);

        product2 = new ProdottoBean();
        product2.setId(2);
        product2.setNome("Product 2");
        product2.setPrezzo(20);
    }

    @Test
    @DisplayName("Default constructor should initialize cart with empty products list")
    void testDefaultConstructor() {
        // Arrange & Act
        Cart newCart = new Cart();

        // Assert
        assertNotNull(newCart.getProducts());
        assertEquals(0, newCart.getProducts().size());
        assertTrue(newCart.getProducts().isEmpty());
    }

    @Test
    @DisplayName("getProducts should return empty list for new cart")
    void testGetProductsEmptyCart() {
        // Arrange & Act
        ArrayList<CartProduct> products = cart.getProducts();

        // Assert
        assertNotNull(products);
        assertEquals(0, products.size());
        assertTrue(products.isEmpty());
    }

    @Test
    @DisplayName("addProduct should add new product with quantity 1")
    void testAddProductNewProduct() {
        // Arrange & Act
        cart.addProduct(product1);

        // Assert
        ArrayList<CartProduct> products = cart.getProducts();
        assertEquals(1, products.size());

        CartProduct cartProduct = products.get(0);
        assertNotNull(cartProduct);
        assertEquals(product1.getId(), cartProduct.getProduct().getId());
        assertEquals(1, cartProduct.getQuantity());
    }

    @Test
    @DisplayName("addProduct should increment quantity for existing product")
    void testAddProductExistingProduct() {
        // Arrange
        cart.addProduct(product1);

        // Act
        cart.addProduct(product1);

        // Assert
        ArrayList<CartProduct> products = cart.getProducts();
        assertEquals(1, products.size());

        CartProduct cartProduct = products.get(0);
        assertEquals(product1.getId(), cartProduct.getProduct().getId());
        assertEquals(2, cartProduct.getQuantity());
    }

    @Test
    @DisplayName("addProduct should add multiple different products")
    void testAddMultipleDifferentProducts() {
        // Arrange & Act
        cart.addProduct(product1);
        cart.addProduct(product2);

        // Assert
        ArrayList<CartProduct> products = cart.getProducts();
        assertEquals(2, products.size());

        boolean found1 = false, found2 = false;
        for (CartProduct cp : products) {
            if (cp.getProduct().getId() == product1.getId()) {
                found1 = true;
                assertEquals(1, cp.getQuantity());
            } else if (cp.getProduct().getId() == product2.getId()) {
                found2 = true;
                assertEquals(1, cp.getQuantity());
            }
        }
        assertTrue(found1 && found2);
    }

    @Test
    @DisplayName("addProduct should handle array expansion when capacity exceeded")
    void testAddProductArrayExpansion() {
        // Arrange - Add 11 different products to exceed initial capacity of 10
        for (int i = 1; i <= 11; i++) {
            ProdottoBean product = new ProdottoBean();
            product.setId(i);
            product.setNome("Product " + i);

            // Act
            cart.addProduct(product);
        }

        // Assert
        ArrayList<CartProduct> products = cart.getProducts();
        assertEquals(11, products.size());
    }

    @Test
    @DisplayName("changeQuantity should update quantity for existing product")
    void testChangeQuantityExistingProduct() {
        // Arrange
        cart.addProduct(product1);

        // Act
        cart.changeQuantity(product1, 5);

        // Assert
        ArrayList<CartProduct> products = cart.getProducts();
        assertEquals(1, products.size());
        assertEquals(5, products.get(0).getQuantity());
    }

    @Test
    @DisplayName("changeQuantity should do nothing for non-existing product")
    void testChangeQuantityNonExistingProduct() {
        // Arrange
        cart.addProduct(product1);

        // Act
        cart.changeQuantity(product2, 5);

        // Assert
        ArrayList<CartProduct> products = cart.getProducts();
        assertEquals(1, products.size());
        assertEquals(1, products.get(0).getQuantity()); // Should remain unchanged
    }

    @Test
    @DisplayName("removeProduct should remove existing product")
    void testRemoveProductExistingProduct() {
        // Arrange
        cart.addProduct(product1);
        cart.addProduct(product2);

        // Act
        cart.removeProduct(product1);

        // Assert
        ArrayList<CartProduct> products = cart.getProducts();
        assertEquals(1, products.size());
        assertEquals(product2.getId(), products.get(0).getProduct().getId());
    }

    @Test
    @DisplayName("removeProduct should do nothing for non-existing product")
    void testRemoveProductNonExistingProduct() {
        // Arrange
        cart.addProduct(product1);

        // Act
        cart.removeProduct(product2);

        // Assert
        ArrayList<CartProduct> products = cart.getProducts();
        assertEquals(1, products.size());
        assertEquals(product1.getId(), products.get(0).getProduct().getId());
    }

    @Test
    @DisplayName("removeProduct should handle removing from empty cart")
    void testRemoveProductFromEmptyCart() {
        // Arrange & Act
        cart.removeProduct(product1);

        // Assert
        ArrayList<CartProduct> products = cart.getProducts();
        assertEquals(0, products.size());
    }

    @Test
    @DisplayName("removeProduct should maintain correct order after removal")
    void testRemoveProductMaintainsOrder() {
        // Arrange
        ProdottoBean product3 = new ProdottoBean();
        product3.setId(3);
        product3.setNome("Product 3");

        cart.addProduct(product1);
        cart.addProduct(product2);
        cart.addProduct(product3);

        // Act - Remove middle product
        cart.removeProduct(product2);

        // Assert
        ArrayList<CartProduct> products = cart.getProducts();
        assertEquals(2, products.size());
        assertEquals(product1.getId(), products.get(0).getProduct().getId());
        assertEquals(product3.getId(), products.get(1).getProduct().getId());
    }

    @Test
    @DisplayName("addProduct with null product should not cause crash")
    void testAddProductWithNullProduct() {
        // Arrange, Act & Assert - Should not throw exception based on JML contract
        // The method has precondition requiring non-null product, so this would be a contract violation
        // But we test defensive behavior
        assertDoesNotThrow(() -> cart.addProduct(null));
    }

    @Test
    @DisplayName("changeQuantity with null product should not cause crash")
    void testChangeQuantityWithNullProduct() {
        // Arrange, Act & Assert
        assertDoesNotThrow(() -> cart.changeQuantity(null, 5));
    }

    @Test
    @DisplayName("removeProduct with null product should not cause crash")
    void testRemoveProductWithNullProduct() {
        // Arrange, Act & Assert
        assertDoesNotThrow(() -> cart.removeProduct(null));
    }

    @Test
    @DisplayName("changeQuantity with zero quantity should update product")
    void testChangeQuantityWithZero() {
        // Arrange
        cart.addProduct(product1);

        // Act
        cart.changeQuantity(product1, 0);

        // Assert
        ArrayList<CartProduct> products = cart.getProducts();
        assertEquals(1, products.size());
        assertEquals(0, products.get(0).getQuantity());
    }

    @Test
    @DisplayName("changeQuantity with negative quantity should update product")
    void testChangeQuantityWithNegative() {
        // Arrange
        cart.addProduct(product1);

        // Act
        cart.changeQuantity(product1, -5);

        // Assert
        ArrayList<CartProduct> products = cart.getProducts();
        assertEquals(1, products.size());
        assertEquals(-5, products.get(0).getQuantity());
    }

    @Test
    @DisplayName("Multiple operations should work correctly together")
    void testComplexScenario() {
        // Arrange & Act
        cart.addProduct(product1);        // Add product1 (qty: 1)
        cart.addProduct(product1);        // Increment product1 (qty: 2)
        cart.addProduct(product2);        // Add product2 (qty: 1)
        cart.changeQuantity(product1, 5); // Change product1 qty to 5
        cart.removeProduct(product2);     // Remove product2

        // Assert
        ArrayList<CartProduct> products = cart.getProducts();
        assertEquals(1, products.size());
        assertEquals(product1.getId(), products.get(0).getProduct().getId());
        assertEquals(5, products.get(0).getQuantity());
    }

    @Test
    @DisplayName("getProducts should return new ArrayList instance each time")
    void testGetProductsReturnsNewInstance() {
        // Arrange
        cart.addProduct(product1);

        // Act
        ArrayList<CartProduct> products1 = cart.getProducts();
        ArrayList<CartProduct> products2 = cart.getProducts();

        // Assert
        assertNotSame(products1, products2);
        assertEquals(products1.size(), products2.size());
    }

    @Test
    @DisplayName("Cart should handle products with same ID correctly")
    void testProductsWithSameId() {
        // Arrange
        ProdottoBean duplicateIdProduct = new ProdottoBean();
        duplicateIdProduct.setId(1); // Same ID as product1
        duplicateIdProduct.setNome("Duplicate ID Product");

        cart.addProduct(product1);

        // Act
        cart.addProduct(duplicateIdProduct);

        // Assert - Should increment quantity of existing product
        ArrayList<CartProduct> products = cart.getProducts();
        assertEquals(1, products.size());
        assertEquals(2, products.get(0).getQuantity());
    }
}

