package ita.kangaroo.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class OrdineBeanTest {

    private OrdineBean ordine;
    private utenteBean testClient;
    private ArrayList<OrderProductBean> testProducts;

    @BeforeEach
    void setUp() {
        ordine = new OrdineBean();

        testClient = new utenteBean();
        testClient.setNome("Test User");

        testProducts = new ArrayList<>();
        OrderProductBean product1 = new OrderProductBean();
        product1.setId_prodotto(1);
        product1.setPrezzo(10.0f);
        testProducts.add(product1);
    }

    // Default Constructor Tests
    @Test
    @DisplayName("Default constructor should initialize all fields with correct default values")
    void testDefaultConstructor() {
        // Arrange & Act
        OrdineBean newOrdine = new OrdineBean();

        // Assert
        assertNotNull(newOrdine.getProducts());
        assertEquals(0, newOrdine.getProducts().size());
        assertEquals(0, newOrdine.getId());
        assertNull(newOrdine.getClient());
        assertEquals(0.0f, newOrdine.getPrezzo_totale());
        assertNull(newOrdine.getDestinatario());
        assertNull(newOrdine.getMetodo_di_pagamento());
        assertNull(newOrdine.getCircuito());
        assertNull(newOrdine.getNumero_carta());
        assertNull(newOrdine.getIndirizzo_di_spedizione());
        assertNull(newOrdine.getNumero_di_tracking());
        assertNull(newOrdine.getData());
        assertNull(newOrdine.getMetodo_di_spedizione());
    }

    // Constructor with ArrayList Tests
    @Test
    @DisplayName("Constructor with products should set products and initialize other fields")
    void testConstructorWithProducts() {
        // Arrange & Act
        OrdineBean ordineWithProducts = new OrdineBean(testProducts);

        // Assert
        assertEquals(testProducts, ordineWithProducts.getProducts());
        assertSame(testProducts, ordineWithProducts.getProducts());
        assertEquals(0, ordineWithProducts.getId());
        assertNull(ordineWithProducts.getClient());
        assertEquals(0.0f, ordineWithProducts.getPrezzo_totale());
        assertNull(ordineWithProducts.getDestinatario());
        assertNull(ordineWithProducts.getMetodo_di_pagamento());
    }

    @Test
    @DisplayName("Constructor with empty products list should work")
    void testConstructorWithEmptyProducts() {
        // Arrange
        ArrayList<OrderProductBean> emptyProducts = new ArrayList<>();

        // Act
        OrdineBean ordineWithEmpty = new OrdineBean(emptyProducts);

        // Assert
        assertEquals(emptyProducts, ordineWithEmpty.getProducts());
        assertEquals(0, ordineWithEmpty.getProducts().size());
        assertEquals(0, ordineWithEmpty.getId());
    }

    // Constructor with Client Tests
    @Test
    @DisplayName("Constructor with client should set client and initialize other fields")
    void testConstructorWithClient() {
        // Arrange & Act
        OrdineBean ordineWithClient = new OrdineBean(testClient);

        // Assert
        assertEquals(testClient, ordineWithClient.getClient());
        assertSame(testClient, ordineWithClient.getClient());
        assertNotNull(ordineWithClient.getProducts());
        assertEquals(0, ordineWithClient.getProducts().size());
        assertEquals(0, ordineWithClient.getId());
        assertEquals(0.0f, ordineWithClient.getPrezzo_totale());
    }

    @Test
    @DisplayName("Constructor with null client should work")
    void testConstructorWithNullClient() {
        // Arrange & Act
        OrdineBean ordineWithNullClient = new OrdineBean((utenteBean) null);

        // Assert
        assertNull(ordineWithNullClient.getClient());
        assertNotNull(ordineWithNullClient.getProducts());
        assertEquals(0, ordineWithNullClient.getId());
    }

    // Full Constructor Tests
    @Test
    @DisplayName("Full constructor should set all fields correctly")
    void testFullConstructor() {
        // Arrange
        int testId = 123;
        float testPrezzo = 99.99f;
        String testDestinatario = "John Doe";
        String testMetodoPagamento = "Credit Card";
        String testCircuito = "VISA";
        String testNumeroCarta = "1234567890123456";
        String testIndirizzo = "Via Roma 1, Milano";
        String testTracking = "TR123456789";
        Date testData = Date.valueOf("2024-01-15");
        String testMetodoSpedizione = "Express";

        // Act
        OrdineBean fullOrdine = new OrdineBean(testId, testClient, testPrezzo, testDestinatario,
                testMetodoPagamento, testCircuito, testNumeroCarta, testIndirizzo,
                testTracking, testData, testMetodoSpedizione);

        // Assert
        assertEquals(testId, fullOrdine.getId());
        assertEquals(testClient, fullOrdine.getClient());
        assertEquals(testPrezzo, fullOrdine.getPrezzo_totale());
        assertEquals(testDestinatario, fullOrdine.getDestinatario());
        assertEquals(testMetodoPagamento, fullOrdine.getMetodo_di_pagamento());
        assertEquals(testCircuito, fullOrdine.getCircuito());
        assertEquals(testNumeroCarta, fullOrdine.getNumero_carta());
        assertEquals(testIndirizzo, fullOrdine.getIndirizzo_di_spedizione());
        assertEquals(testTracking, fullOrdine.getNumero_di_tracking());
        assertEquals(testData, fullOrdine.getData());
        assertEquals(testMetodoSpedizione, fullOrdine.getMetodo_di_spedizione());
        assertNotNull(fullOrdine.getProducts());
        assertEquals(0, fullOrdine.getProducts().size());
    }

    @Test
    @DisplayName("Full constructor with null values should work")
    void testFullConstructorWithNulls() {
        // Arrange & Act
        OrdineBean ordineWithNulls = new OrdineBean(1, null, 10.0f, null, null,
                null, null, null, null, null, null);

        // Assert
        assertEquals(1, ordineWithNulls.getId());
        assertNull(ordineWithNulls.getClient());
        assertEquals(10.0f, ordineWithNulls.getPrezzo_totale());
        assertNull(ordineWithNulls.getDestinatario());
        assertNull(ordineWithNulls.getMetodo_di_pagamento());
        assertNull(ordineWithNulls.getCircuito());
        assertNull(ordineWithNulls.getNumero_carta());
        assertNull(ordineWithNulls.getIndirizzo_di_spedizione());
        assertNull(ordineWithNulls.getNumero_di_tracking());
        assertNull(ordineWithNulls.getData());
        assertNull(ordineWithNulls.getMetodo_di_spedizione());
    }

    // Products Tests
    @Test
    @DisplayName("getProducts should return products list")
    void testGetProducts() {
        // Arrange
        ordine.setProducts(testProducts);

        // Act
        ArrayList<OrderProductBean> result = ordine.getProducts();

        // Assert
        assertEquals(testProducts, result);
        assertSame(testProducts, result);
    }

    @Test
    @DisplayName("setProducts should update products list")
    void testSetProducts() {
        // Arrange
        ArrayList<OrderProductBean> newProducts = new ArrayList<>();
        OrderProductBean newProduct = new OrderProductBean();
        newProduct.setId_prodotto(2);
        newProducts.add(newProduct);

        // Act
        ordine.setProducts(newProducts);

        // Assert
        assertEquals(newProducts, ordine.getProducts());
        assertEquals(1, ordine.getProducts().size());
    }

    // ID Tests
    @Test
    @DisplayName("getId should return correct id")
    void testGetId() {
        // Arrange
        ordine.setId(42);

        // Act
        int result = ordine.getId();

        // Assert
        assertEquals(42, result);
    }

    @Test
    @DisplayName("setId should update id correctly")
    void testSetId() {
        // Arrange & Act
        ordine.setId(100);

        // Assert
        assertEquals(100, ordine.getId());
    }

    @Test
    @DisplayName("setId with zero should work")
    void testSetIdZero() {
        // Arrange & Act
        ordine.setId(0);

        // Assert
        assertEquals(0, ordine.getId());
    }

    @Test
    @DisplayName("setId with maximum value should work")
    void testSetIdMaxValue() {
        // Arrange & Act
        ordine.setId(Integer.MAX_VALUE);

        // Assert
        assertEquals(Integer.MAX_VALUE, ordine.getId());
    }

    // Client Tests
    @Test
    @DisplayName("getClient should return correct client")
    void testGetClient() {
        // Arrange
        ordine.setClient(testClient);

        // Act
        utenteBean result = ordine.getClient();

        // Assert
        assertEquals(testClient, result);
        assertSame(testClient, result);
    }

    @Test
    @DisplayName("setClient should update client correctly")
    void testSetClient() {
        // Arrange & Act
        ordine.setClient(testClient);

        // Assert
        assertEquals(testClient, ordine.getClient());
    }

    @Test
    @DisplayName("setClient with null should work")
    void testSetClientNull() {
        // Arrange
        ordine.setClient(testClient);

        // Act
        ordine.setClient(null);

        // Assert
        assertNull(ordine.getClient());
    }

    // Prezzo Totale Tests
    @Test
    @DisplayName("getPrezzo_totale should return correct price")
    void testGetPrezzoTotale() {
        // Arrange
        ordine.setPrezzo_totale(123.45f);

        // Act
        float result = ordine.getPrezzo_totale();

        // Assert
        assertEquals(123.45f, result);
    }

    @Test
    @DisplayName("setPrezzo_totale should update price correctly")
    void testSetPrezzoTotale() {
        // Arrange & Act
        ordine.setPrezzo_totale(199.99f);

        // Assert
        assertEquals(199.99f, ordine.getPrezzo_totale());
    }

    @Test
    @DisplayName("setPrezzo_totale with zero should work")
    void testSetPrezzoTotaleZero() {
        // Arrange & Act
        ordine.setPrezzo_totale(0.0f);

        // Assert
        assertEquals(0.0f, ordine.getPrezzo_totale());
    }

    @Test
    @DisplayName("setPrezzo_totale with maximum value should work")
    void testSetPrezzoTotaleMaxValue() {
        // Arrange & Act
        ordine.setPrezzo_totale(Float.MAX_VALUE);

        // Assert
        assertEquals(Float.MAX_VALUE, ordine.getPrezzo_totale());
    }

    // String Fields Tests
    @Test
    @DisplayName("getDestinatario should return correct destinatario")
    void testGetDestinatario() {
        // Arrange
        String testDestinatario = "Mario Rossi";
        ordine.setDestinatario(testDestinatario);

        // Act
        String result = ordine.getDestinatario();

        // Assert
        assertEquals(testDestinatario, result);
    }

    @Test
    @DisplayName("setDestinatario should update destinatario correctly")
    void testSetDestinatario() {
        // Arrange
        String testDestinatario = "Luigi Bianchi";

        // Act
        ordine.setDestinatario(testDestinatario);

        // Assert
        assertEquals(testDestinatario, ordine.getDestinatario());
    }

    @Test
    @DisplayName("setDestinatario with null should work")
    void testSetDestinatarioNull() {
        // Arrange
        ordine.setDestinatario("Test");

        // Act
        ordine.setDestinatario(null);

        // Assert
        assertNull(ordine.getDestinatario());
    }

    @Test
    @DisplayName("setDestinatario with empty string should work")
    void testSetDestinatarioEmpty() {
        // Arrange & Act
        ordine.setDestinatario("");

        // Assert
        assertEquals("", ordine.getDestinatario());
    }

    @Test
    @DisplayName("setDestinatario should preserve special characters")
    void testSetDestinatarioSpecialCharacters() {
        // Arrange
        String specialDestinatario = "José María González-Pérez @#$%";

        // Act
        ordine.setDestinatario(specialDestinatario);

        // Assert
        assertEquals(specialDestinatario, ordine.getDestinatario());
    }

    @Test
    @DisplayName("Metodo di pagamento getter and setter should work correctly")
    void testMetodoDiPagamento() {
        // Arrange
        String testMetodo = "PayPal";

        // Act
        ordine.setMetodo_di_pagamento(testMetodo);

        // Assert
        assertEquals(testMetodo, ordine.getMetodo_di_pagamento());
    }

    @Test
    @DisplayName("Circuito getter and setter should work correctly")
    void testCircuito() {
        // Arrange
        String testCircuito = "MasterCard";

        // Act
        ordine.setCircuito(testCircuito);

        // Assert
        assertEquals(testCircuito, ordine.getCircuito());
    }

    @Test
    @DisplayName("Numero carta getter and setter should work correctly")
    void testNumeroCarta() {
        // Arrange
        String testNumero = "4532123456789012";

        // Act
        ordine.setNumero_carta(testNumero);

        // Assert
        assertEquals(testNumero, ordine.getNumero_carta());
    }

    @Test
    @DisplayName("Indirizzo di spedizione getter and setter should work correctly")
    void testIndirizzoDiSpedizione() {
        // Arrange
        String testIndirizzo = "Via Roma 123, 00100 Roma RM";

        // Act
        ordine.setIndirizzo_di_spedizione(testIndirizzo);

        // Assert
        assertEquals(testIndirizzo, ordine.getIndirizzo_di_spedizione());
    }

    @Test
    @DisplayName("Numero di tracking getter and setter should work correctly")
    void testNumeroDiTracking() {
        // Arrange
        String testTracking = "1Z999AA1234567890";

        // Act
        ordine.setNumero_di_tracking(testTracking);

        // Assert
        assertEquals(testTracking, ordine.getNumero_di_tracking());
    }

    @Test
    @DisplayName("Metodo di spedizione getter and setter should work correctly")
    void testMetodoDiSpedizione() {
        // Arrange
        String testMetodo = "Corriere Espresso";

        // Act
        ordine.setMetodo_di_spedizione(testMetodo);

        // Assert
        assertEquals(testMetodo, ordine.getMetodo_di_spedizione());
    }

    // Date Tests
    @Test
    @DisplayName("getData should return correct date")
    void testGetData() {
        // Arrange
        Date testDate = Date.valueOf("2024-03-15");
        ordine.setData(testDate);

        // Act
        Date result = ordine.getData();

        // Assert
        assertEquals(testDate, result);
        assertSame(testDate, result);
    }

    @Test
    @DisplayName("setData should update date correctly")
    void testSetData() {
        // Arrange
        Date testDate = Date.valueOf("2024-12-25");

        // Act
        ordine.setData(testDate);

        // Assert
        assertEquals(testDate, ordine.getData());
    }

    @Test
    @DisplayName("setData with null should work")
    void testSetDataNull() {
        // Arrange
        ordine.setData(Date.valueOf("2024-01-01"));

        // Act
        ordine.setData(null);

        // Assert
        assertNull(ordine.getData());
    }

    // Behavior Consistency Tests
    @Test
    @DisplayName("Multiple set/get operations should maintain consistency")
    void testSetGetConsistency() {
        // Arrange
        String testDestinatario = "Test User";
        String testMetodoPagamento = "Card";
        String testCircuito = "VISA";
        String testNumeroCarta = "1234567890";
        String testIndirizzo = "Test Address";
        String testTracking = "TR001";
        String testMetodoSpedizione = "Standard";
        Date testData = Date.valueOf("2024-01-01");
        int testId = 999;
        float testPrezzo = 150.75f;

        // Act
        ordine.setDestinatario(testDestinatario);
        ordine.setMetodo_di_pagamento(testMetodoPagamento);
        ordine.setCircuito(testCircuito);
        ordine.setNumero_carta(testNumeroCarta);
        ordine.setIndirizzo_di_spedizione(testIndirizzo);
        ordine.setNumero_di_tracking(testTracking);
        ordine.setMetodo_di_spedizione(testMetodoSpedizione);
        ordine.setData(testData);
        ordine.setId(testId);
        ordine.setPrezzo_totale(testPrezzo);
        ordine.setClient(testClient);
        ordine.setProducts(testProducts);

        // Assert
        assertEquals(testDestinatario, ordine.getDestinatario());
        assertEquals(testMetodoPagamento, ordine.getMetodo_di_pagamento());
        assertEquals(testCircuito, ordine.getCircuito());
        assertEquals(testNumeroCarta, ordine.getNumero_carta());
        assertEquals(testIndirizzo, ordine.getIndirizzo_di_spedizione());
        assertEquals(testTracking, ordine.getNumero_di_tracking());
        assertEquals(testMetodoSpedizione, ordine.getMetodo_di_spedizione());
        assertEquals(testData, ordine.getData());
        assertEquals(testId, ordine.getId());
        assertEquals(testPrezzo, ordine.getPrezzo_totale());
        assertEquals(testClient, ordine.getClient());
        assertEquals(testProducts, ordine.getProducts());
    }

    @Test
    @DisplayName("Setting one field should not affect other fields")
    void testFieldIndependence() {
        // Arrange - Set initial values
        ordine.setId(100);
        ordine.setDestinatario("Initial");
        ordine.setPrezzo_totale(50.0f);

        // Act - Change only destinatario
        ordine.setDestinatario("Changed");

        // Assert - Other fields should remain unchanged
        assertEquals("Changed", ordine.getDestinatario());
        assertEquals(100, ordine.getId());
        assertEquals(50.0f, ordine.getPrezzo_totale());
    }

    // toString() Tests
    @Test
    @DisplayName("toString should return formatted date when data is not null")
    void testToStringWithDate() {
        // Arrange
        Date testDate = Date.valueOf("2024-03-15");
        ordine.setData(testDate);

        // Act
        String result = ordine.toString();

        // Assert
        assertEquals("15-3-2024", result);
    }

    @Test
    @DisplayName("toString should return default message when data is null")
    void testToStringWithNullDate() {
        // Arrange
        ordine.setData(null);

        // Act
        String result = ordine.toString();

        // Assert
        assertEquals("Data non disponibile", result);
    }

    @Test
    @DisplayName("toString should handle different date formats correctly")
    void testToStringWithDifferentDates() {
        // Arrange & Act & Assert
        // Test with single digit day and month
        ordine.setData(Date.valueOf("2024-01-05"));
        assertEquals("5-1-2024", ordine.toString());

        // Test with double digit day and month
        ordine.setData(Date.valueOf("2024-12-25"));
        assertEquals("25-12-2024", ordine.toString());

        // Test with leap year date
        ordine.setData(Date.valueOf("2024-02-29"));
        assertEquals("29-2-2024", ordine.toString());
    }

    // Edge Cases and Extreme Values
    @Test
    @DisplayName("String fields should handle very long strings")
    void testLongStringValues() {
        // Arrange
        String longString = "A".repeat(10000);

        // Act & Assert
        ordine.setDestinatario(longString);
        assertEquals(longString, ordine.getDestinatario());

        ordine.setMetodo_di_pagamento(longString);
        assertEquals(longString, ordine.getMetodo_di_pagamento());
    }

    @Test
    @DisplayName("String fields should preserve unicode characters")
    void testUnicodeStrings() {
        // Arrange
        String unicodeString = "测试用户 José María González àáâãäåæç";

        // Act & Assert
        ordine.setDestinatario(unicodeString);
        assertEquals(unicodeString, ordine.getDestinatario());

        ordine.setIndirizzo_di_spedizione(unicodeString);
        assertEquals(unicodeString, ordine.getIndirizzo_di_spedizione());
    }

    @Test
    @DisplayName("Float values should handle special cases")
    void testFloatSpecialValues() {
        // Arrange & Act & Assert
        // Test with very small positive value
        ordine.setPrezzo_totale(Float.MIN_VALUE);
        assertEquals(Float.MIN_VALUE, ordine.getPrezzo_totale());

        // Test with positive infinity (though not realistic for prices)
        ordine.setPrezzo_totale(Float.POSITIVE_INFINITY);
        assertEquals(Float.POSITIVE_INFINITY, ordine.getPrezzo_totale());

        // Test with NaN
        ordine.setPrezzo_totale(Float.NaN);
        assertTrue(Float.isNaN(ordine.getPrezzo_totale()));
    }

    @Test
    @DisplayName("Null to non-null transitions should work for all nullable fields")
    void testNullTransitions() {
        // Arrange & Act & Assert
        // Test client transitions
        assertNull(ordine.getClient());
        ordine.setClient(testClient);
        assertEquals(testClient, ordine.getClient());
        ordine.setClient(null);
        assertNull(ordine.getClient());

        // Test string field transitions
        assertNull(ordine.getDestinatario());
        ordine.setDestinatario("Test");
        assertEquals("Test", ordine.getDestinatario());
        ordine.setDestinatario(null);
        assertNull(ordine.getDestinatario());

        // Test date transitions
        assertNull(ordine.getData());
        Date testDate = Date.valueOf("2024-01-01");
        ordine.setData(testDate);
        assertEquals(testDate, ordine.getData());
        ordine.setData(null);
        assertNull(ordine.getData());
    }
}

