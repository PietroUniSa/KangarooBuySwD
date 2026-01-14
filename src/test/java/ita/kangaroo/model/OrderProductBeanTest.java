package ita.kangaroo.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

class OrderProductBeanTest {

    private OrderProductBean orderProduct;

    @BeforeEach
    void setUp() {
        orderProduct = new OrderProductBean();
    }

    @Test
    @DisplayName("Default constructor should initialize all fields with correct default values")
    void testDefaultConstructor() {
        // Arrange & Act
        OrderProductBean newOrderProduct = new OrderProductBean();

        // Assert
        assertEquals(0, newOrderProduct.getId_ordine());
        assertEquals(0, newOrderProduct.getId_prodotto());
        assertEquals(0.0f, newOrderProduct.getPrezzo());
        assertEquals(0, newOrderProduct.getQuantita());
        assertEquals(0.0f, newOrderProduct.getIVA());
    }

    // Tests for id_ordine field
    @Test
    @DisplayName("getId_ordine should return 0 for new instance")
    void testGetIdOrdineDefault() {
        // Arrange & Act
        int result = orderProduct.getId_ordine();

        // Assert
        assertEquals(0, result);
    }

    @Test
    @DisplayName("setId_ordine and getId_ordine should work with positive value")
    void testSetGetIdOrdinePositive() {
        // Arrange
        int testId = 12345;

        // Act
        orderProduct.setId_ordine(testId);

        // Assert
        assertEquals(testId, orderProduct.getId_ordine());
    }

    @Test
    @DisplayName("setId_ordine should accept zero value")
    void testSetIdOrdineZero() {
        // Arrange & Act
        orderProduct.setId_ordine(0);

        // Assert
        assertEquals(0, orderProduct.getId_ordine());
    }

    @Test
    @DisplayName("setId_ordine should accept negative value")
    void testSetIdOrdineNegative() {
        // Arrange & Act
        orderProduct.setId_ordine(-100);

        // Assert
        assertEquals(-100, orderProduct.getId_ordine());
    }

    @Test
    @DisplayName("setId_ordine should work with maximum integer value")
    void testSetIdOrdineMaxValue() {
        // Arrange & Act
        orderProduct.setId_ordine(Integer.MAX_VALUE);

        // Assert
        assertEquals(Integer.MAX_VALUE, orderProduct.getId_ordine());
    }

    @Test
    @DisplayName("setId_ordine should work with minimum integer value")
    void testSetIdOrdineMinValue() {
        // Arrange & Act
        orderProduct.setId_ordine(Integer.MIN_VALUE);

        // Assert
        assertEquals(Integer.MIN_VALUE, orderProduct.getId_ordine());
    }

    // Tests for id_prodotto field
    @Test
    @DisplayName("getId_prodotto should return 0 for new instance")
    void testGetIdProdottoDefault() {
        // Arrange & Act
        int result = orderProduct.getId_prodotto();

        // Assert
        assertEquals(0, result);
    }

    @Test
    @DisplayName("setId_prodotto and getId_prodotto should work with positive value")
    void testSetGetIdProdottoPositive() {
        // Arrange
        int testId = 67890;

        // Act
        orderProduct.setId_prodotto(testId);

        // Assert
        assertEquals(testId, orderProduct.getId_prodotto());
    }

    @Test
    @DisplayName("setId_prodotto should accept zero value")
    void testSetIdProdottoZero() {
        // Arrange & Act
        orderProduct.setId_prodotto(0);

        // Assert
        assertEquals(0, orderProduct.getId_prodotto());
    }

    @Test
    @DisplayName("setId_prodotto should accept negative value")
    void testSetIdProdottoNegative() {
        // Arrange & Act
        orderProduct.setId_prodotto(-500);

        // Assert
        assertEquals(-500, orderProduct.getId_prodotto());
    }

    @Test
    @DisplayName("setId_prodotto should work with maximum integer value")
    void testSetIdProdottoMaxValue() {
        // Arrange & Act
        orderProduct.setId_prodotto(Integer.MAX_VALUE);

        // Assert
        assertEquals(Integer.MAX_VALUE, orderProduct.getId_prodotto());
    }

    // Tests for prezzo field
    @Test
    @DisplayName("getPrezzo should return 0.0f for new instance")
    void testGetPrezzoDefault() {
        // Arrange & Act
        float result = orderProduct.getPrezzo();

        // Assert
        assertEquals(0.0f, result);
    }

    @Test
    @DisplayName("setPrezzo and getPrezzo should work with positive value")
    void testSetGetPrezzoPositive() {
        // Arrange
        float testPrezzo = 123.45f;

        // Act
        orderProduct.setPrezzo(testPrezzo);

        // Assert
        assertEquals(testPrezzo, orderProduct.getPrezzo());
    }

    @Test
    @DisplayName("setPrezzo should accept zero value")
    void testSetPrezzoZero() {
        // Arrange & Act
        orderProduct.setPrezzo(0.0f);

        // Assert
        assertEquals(0.0f, orderProduct.getPrezzo());
    }

    @Test
    @DisplayName("setPrezzo should accept negative value")
    void testSetPrezzoNegative() {
        // Arrange & Act
        orderProduct.setPrezzo(-50.25f);

        // Assert
        assertEquals(-50.25f, orderProduct.getPrezzo());
    }

    @Test
    @DisplayName("setPrezzo should work with maximum float value")
    void testSetPrezzoMaxValue() {
        // Arrange & Act
        orderProduct.setPrezzo(Float.MAX_VALUE);

        // Assert
        assertEquals(Float.MAX_VALUE, orderProduct.getPrezzo());
    }

    @Test
    @DisplayName("setPrezzo should work with minimum positive float value")
    void testSetPrezzoMinPositiveValue() {
        // Arrange & Act
        orderProduct.setPrezzo(Float.MIN_VALUE);

        // Assert
        assertEquals(Float.MIN_VALUE, orderProduct.getPrezzo());
    }

    @Test
    @DisplayName("setPrezzo should handle special float values")
    void testSetPrezzoSpecialValues() {
        // Arrange & Act & Assert
        // Positive infinity
        orderProduct.setPrezzo(Float.POSITIVE_INFINITY);
        assertEquals(Float.POSITIVE_INFINITY, orderProduct.getPrezzo());

        // Negative infinity
        orderProduct.setPrezzo(Float.NEGATIVE_INFINITY);
        assertEquals(Float.NEGATIVE_INFINITY, orderProduct.getPrezzo());

        // NaN
        orderProduct.setPrezzo(Float.NaN);
        assertTrue(Float.isNaN(orderProduct.getPrezzo()));
    }

    // Tests for quantita field
    @Test
    @DisplayName("getQuantita should return 0 for new instance")
    void testGetQuantitaDefault() {
        // Arrange & Act
        int result = orderProduct.getQuantita();

        // Assert
        assertEquals(0, result);
    }

    @Test
    @DisplayName("setQuantita and getQuantita should work with positive value")
    void testSetGetQuantitaPositive() {
        // Arrange
        int testQuantita = 10;

        // Act
        orderProduct.setQuantita(testQuantita);

        // Assert
        assertEquals(testQuantita, orderProduct.getQuantita());
    }

    @Test
    @DisplayName("setQuantita should accept zero value")
    void testSetQuantitaZero() {
        // Arrange & Act
        orderProduct.setQuantita(0);

        // Assert
        assertEquals(0, orderProduct.getQuantita());
    }

    @Test
    @DisplayName("setQuantita should accept negative value")
    void testSetQuantitaNegative() {
        // Arrange & Act
        orderProduct.setQuantita(-5);

        // Assert
        assertEquals(-5, orderProduct.getQuantita());
    }

    @Test
    @DisplayName("setQuantita should work with maximum integer value")
    void testSetQuantitaMaxValue() {
        // Arrange & Act
        orderProduct.setQuantita(Integer.MAX_VALUE);

        // Assert
        assertEquals(Integer.MAX_VALUE, orderProduct.getQuantita());
    }

    // Tests for IVA field
    @Test
    @DisplayName("getIVA should return 0.0f for new instance")
    void testGetIVADefault() {
        // Arrange & Act
        float result = orderProduct.getIVA();

        // Assert
        assertEquals(0.0f, result);
    }

    @Test
    @DisplayName("setIVA and getIVA should work with positive value")
    void testSetGetIVAPositive() {
        // Arrange
        float testIVA = 22.0f;

        // Act
        orderProduct.setIVA(testIVA);

        // Assert
        assertEquals(testIVA, orderProduct.getIVA());
    }

    @Test
    @DisplayName("setIVA should accept zero value")
    void testSetIVAZero() {
        // Arrange & Act
        orderProduct.setIVA(0.0f);

        // Assert
        assertEquals(0.0f, orderProduct.getIVA());
    }

    @Test
    @DisplayName("setIVA should accept negative value")
    void testSetIVANegative() {
        // Arrange & Act
        orderProduct.setIVA(-10.0f);

        // Assert
        assertEquals(-10.0f, orderProduct.getIVA());
    }

    @Test
    @DisplayName("setIVA should work with maximum float value")
    void testSetIVAMaxValue() {
        // Arrange & Act
        orderProduct.setIVA(Float.MAX_VALUE);

        // Assert
        assertEquals(Float.MAX_VALUE, orderProduct.getIVA());
    }

    @Test
    @DisplayName("setIVA should handle special float values")
    void testSetIVASpecialValues() {
        // Arrange & Act & Assert
        // Positive infinity
        orderProduct.setIVA(Float.POSITIVE_INFINITY);
        assertEquals(Float.POSITIVE_INFINITY, orderProduct.getIVA());

        // NaN
        orderProduct.setIVA(Float.NaN);
        assertTrue(Float.isNaN(orderProduct.getIVA()));
    }

    // Behavior consistency tests
    @Test
    @DisplayName("Behavior consistency: setId_ordine then getId_ordine should return same value")
    void testIdOrdineSetGetConsistency() {
        // Arrange
        int[] testIds = {-1000, -1, 0, 1, 100, 50000, Integer.MAX_VALUE, Integer.MIN_VALUE};

        for (int testId : testIds) {
            // Act
            orderProduct.setId_ordine(testId);

            // Assert
            assertEquals(testId, orderProduct.getId_ordine());
        }
    }

    @Test
    @DisplayName("Behavior consistency: setId_prodotto then getId_prodotto should return same value")
    void testIdProdottoSetGetConsistency() {
        // Arrange
        int[] testIds = {-500, 0, 1, 999, Integer.MAX_VALUE, Integer.MIN_VALUE};

        for (int testId : testIds) {
            // Act
            orderProduct.setId_prodotto(testId);

            // Assert
            assertEquals(testId, orderProduct.getId_prodotto());
        }
    }

    @Test
    @DisplayName("Behavior consistency: setPrezzo then getPrezzo should return same value")
    void testPrezzoSetGetConsistency() {
        // Arrange
        float[] testPrezzi = {-100.5f, 0.0f, 0.01f, 99.99f, 1000.0f, Float.MAX_VALUE, Float.MIN_VALUE};

        for (float testPrezzo : testPrezzi) {
            // Act
            orderProduct.setPrezzo(testPrezzo);

            // Assert
            assertEquals(testPrezzo, orderProduct.getPrezzo());
        }
    }

    @Test
    @DisplayName("Behavior consistency: setQuantita then getQuantita should return same value")
    void testQuantitaSetGetConsistency() {
        // Arrange
        int[] testQuantita = {-10, 0, 1, 50, 1000, Integer.MAX_VALUE, Integer.MIN_VALUE};

        for (int quantita : testQuantita) {
            // Act
            orderProduct.setQuantita(quantita);

            // Assert
            assertEquals(quantita, orderProduct.getQuantita());
        }
    }

    @Test
    @DisplayName("Behavior consistency: setIVA then getIVA should return same value")
    void testIVASetGetConsistency() {
        // Arrange
        float[] testIVA = {-5.0f, 0.0f, 4.0f, 10.0f, 22.0f, 100.0f, Float.MAX_VALUE};

        for (float iva : testIVA) {
            // Act
            orderProduct.setIVA(iva);

            // Assert
            assertEquals(iva, orderProduct.getIVA());
        }
    }

    @Test
    @DisplayName("Multiple set/get operations should maintain consistency")
    void testMultipleSetGetConsistency() {
        // Arrange
        int testIdOrdine = 123;
        int testIdProdotto = 456;
        float testPrezzo = 89.99f;
        int testQuantita = 5;
        float testIVA = 22.0f;

        // Act
        orderProduct.setId_ordine(testIdOrdine);
        orderProduct.setId_prodotto(testIdProdotto);
        orderProduct.setPrezzo(testPrezzo);
        orderProduct.setQuantita(testQuantita);
        orderProduct.setIVA(testIVA);

        // Assert
        assertEquals(testIdOrdine, orderProduct.getId_ordine());
        assertEquals(testIdProdotto, orderProduct.getId_prodotto());
        assertEquals(testPrezzo, orderProduct.getPrezzo());
        assertEquals(testQuantita, orderProduct.getQuantita());
        assertEquals(testIVA, orderProduct.getIVA());
    }

    @Test
    @DisplayName("Setting one field should not affect other fields")
    void testFieldIndependence() {
        // Arrange - Set initial values
        orderProduct.setId_ordine(100);
        orderProduct.setId_prodotto(200);
        orderProduct.setPrezzo(50.0f);
        orderProduct.setQuantita(3);
        orderProduct.setIVA(22.0f);

        // Act - Change only one field
        orderProduct.setId_ordine(999);

        // Assert - Other fields should remain unchanged
        assertEquals(999, orderProduct.getId_ordine());
        assertEquals(200, orderProduct.getId_prodotto());
        assertEquals(50.0f, orderProduct.getPrezzo());
        assertEquals(3, orderProduct.getQuantita());
        assertEquals(22.0f, orderProduct.getIVA());
    }

    @Test
    @DisplayName("Repeated setter calls should work correctly")
    void testRepeatedSetterCalls() {
        // Arrange & Act & Assert
        for (int i = 0; i < 100; i++) {
            orderProduct.setId_ordine(i);
            assertEquals(i, orderProduct.getId_ordine());

            orderProduct.setId_prodotto(i * 2);
            assertEquals(i * 2, orderProduct.getId_prodotto());

            orderProduct.setPrezzo(i * 1.5f);
            assertEquals(i * 1.5f, orderProduct.getPrezzo());

            orderProduct.setQuantita(i + 1);
            assertEquals(i + 1, orderProduct.getQuantita());

            orderProduct.setIVA(i * 0.1f);
            assertEquals(i * 0.1f, orderProduct.getIVA());
        }
    }

    @Test
    @DisplayName("All integer fields should handle boundary values correctly")
    void testIntegerBoundaryValues() {
        // Arrange & Act & Assert
        // Test with Integer.MAX_VALUE
        orderProduct.setId_ordine(Integer.MAX_VALUE);
        orderProduct.setId_prodotto(Integer.MAX_VALUE);
        orderProduct.setQuantita(Integer.MAX_VALUE);

        assertEquals(Integer.MAX_VALUE, orderProduct.getId_ordine());
        assertEquals(Integer.MAX_VALUE, orderProduct.getId_prodotto());
        assertEquals(Integer.MAX_VALUE, orderProduct.getQuantita());

        // Test with Integer.MIN_VALUE
        orderProduct.setId_ordine(Integer.MIN_VALUE);
        orderProduct.setId_prodotto(Integer.MIN_VALUE);
        orderProduct.setQuantita(Integer.MIN_VALUE);

        assertEquals(Integer.MIN_VALUE, orderProduct.getId_ordine());
        assertEquals(Integer.MIN_VALUE, orderProduct.getId_prodotto());
        assertEquals(Integer.MIN_VALUE, orderProduct.getQuantita());
    }

    @Test
    @DisplayName("All float fields should handle precision correctly")
    void testFloatPrecision() {
        // Arrange
        float precisionTest1 = 123.456789f;
        float precisionTest2 = 0.000001f;

        // Act
        orderProduct.setPrezzo(precisionTest1);
        orderProduct.setIVA(precisionTest2);

        // Assert
        assertEquals(precisionTest1, orderProduct.getPrezzo());
        assertEquals(precisionTest2, orderProduct.getIVA());
    }

    @Test
    @DisplayName("Getters should be marked as pure and not modify state")
    void testGettersPurity() {
        // Arrange - Set some values
        orderProduct.setId_ordine(123);
        orderProduct.setId_prodotto(456);
        orderProduct.setPrezzo(78.9f);
        orderProduct.setQuantita(10);
        orderProduct.setIVA(22.0f);

        // Act - Call getters multiple times
        int ordineId1 = orderProduct.getId_ordine();
        int ordineId2 = orderProduct.getId_ordine();
        int prodottoId1 = orderProduct.getId_prodotto();
        int prodottoId2 = orderProduct.getId_prodotto();
        float prezzo1 = orderProduct.getPrezzo();
        float prezzo2 = orderProduct.getPrezzo();
        int quantita1 = orderProduct.getQuantita();
        int quantita2 = orderProduct.getQuantita();
        float iva1 = orderProduct.getIVA();
        float iva2 = orderProduct.getIVA();

        // Assert - Values should be consistent and unchanged
        assertEquals(ordineId1, ordineId2);
        assertEquals(prodottoId1, prodottoId2);
        assertEquals(prezzo1, prezzo2);
        assertEquals(quantita1, quantita2);
        assertEquals(iva1, iva2);

        // All values should still be the original ones
        assertEquals(123, orderProduct.getId_ordine());
        assertEquals(456, orderProduct.getId_prodotto());
        assertEquals(78.9f, orderProduct.getPrezzo());
        assertEquals(10, orderProduct.getQuantita());
        assertEquals(22.0f, orderProduct.getIVA());
    }
}

