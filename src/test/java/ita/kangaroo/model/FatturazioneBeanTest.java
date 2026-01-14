package ita.kangaroo.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

class FatturazioneBeanTest {

    private FatturazioneBean fattura;

    @BeforeEach
    void setUp() {
        fattura = new FatturazioneBean();
    }

    @Test
    @DisplayName("Default constructor should initialize all fields with correct default values")
    void testDefaultConstructor() {
        // Arrange & Act
        FatturazioneBean newFattura = new FatturazioneBean();

        // Assert
        assertEquals(0, newFattura.getId());
        assertEquals(0.0f, newFattura.getImporto());
        assertEquals(0.0f, newFattura.getIva());
        assertNull(newFattura.getSdi());
        assertNull(newFattura.getData_scadenza());
        assertNull(newFattura.getData_emissione());
        assertNull(newFattura.getStato_pagamento());
    }

    // Tests for SDI field
    @Test
    @DisplayName("getSdi should return null for new instance")
    void testGetSdiDefault() {
        // Arrange & Act
        String result = fattura.getSdi();

        // Assert
        assertNull(result);
    }

    @Test
    @DisplayName("setSdi and getSdi should work with valid string")
    void testSetGetSdiValidString() {
        // Arrange
        String testSdi = "IT01234567890";

        // Act
        fattura.setSdi(testSdi);

        // Assert
        assertEquals(testSdi, fattura.getSdi());
    }

    @Test
    @DisplayName("setSdi should accept null value")
    void testSetSdiNull() {
        // Arrange
        fattura.setSdi("test");

        // Act
        fattura.setSdi(null);

        // Assert
        assertNull(fattura.getSdi());
    }

    @Test
    @DisplayName("setSdi should accept empty string")
    void testSetSdiEmptyString() {
        // Arrange & Act
        fattura.setSdi("");

        // Assert
        assertEquals("", fattura.getSdi());
    }

    @Test
    @DisplayName("setSdi should preserve special characters")
    void testSetSdiSpecialCharacters() {
        // Arrange
        String specialSdi = "IT-123.456@789#$%^&*()";

        // Act
        fattura.setSdi(specialSdi);

        // Assert
        assertEquals(specialSdi, fattura.getSdi());
    }

    // Tests for Importo field
    @Test
    @DisplayName("getImporto should return 0.0f for new instance")
    void testGetImportoDefault() {
        // Arrange & Act
        float result = fattura.getImporto();

        // Assert
        assertEquals(0.0f, result);
    }

    @Test
    @DisplayName("setImporto and getImporto should work with positive value")
    void testSetGetImportoPositive() {
        // Arrange
        float testImporto = 123.45f;

        // Act
        fattura.setImporto(testImporto);

        // Assert
        assertEquals(testImporto, fattura.getImporto());
    }

    @Test
    @DisplayName("setImporto should accept zero value")
    void testSetImportoZero() {
        // Arrange & Act
        fattura.setImporto(0.0f);

        // Assert
        assertEquals(0.0f, fattura.getImporto());
    }

    @Test
    @DisplayName("setImporto should work with maximum float value")
    void testSetImportoMaxValue() {
        // Arrange & Act
        fattura.setImporto(Float.MAX_VALUE);

        // Assert
        assertEquals(Float.MAX_VALUE, fattura.getImporto());
    }

    @Test
    @DisplayName("setImporto should work with minimum positive float value")
    void testSetImportoMinPositiveValue() {
        // Arrange & Act
        fattura.setImporto(Float.MIN_VALUE);

        // Assert
        assertEquals(Float.MIN_VALUE, fattura.getImporto());
    }

    // Tests for Data Scadenza field
    @Test
    @DisplayName("getData_scadenza should return null for new instance")
    void testGetDataScadenzaDefault() {
        // Arrange & Act
        String result = fattura.getData_scadenza();

        // Assert
        assertNull(result);
    }

    @Test
    @DisplayName("setData_scadenza and getData_scadenza should work with valid date")
    void testSetGetDataScadenzaValid() {
        // Arrange
        String testData = "2024-12-31";

        // Act
        fattura.setData_scadenza(testData);

        // Assert
        assertEquals(testData, fattura.getData_scadenza());
    }

    @Test
    @DisplayName("setData_scadenza should accept null value")
    void testSetDataScadenzaNull() {
        // Arrange
        fattura.setData_scadenza("2024-01-01");

        // Act
        fattura.setData_scadenza(null);

        // Assert
        assertNull(fattura.getData_scadenza());
    }

    @Test
    @DisplayName("setData_scadenza should accept empty string")
    void testSetDataScadenzaEmpty() {
        // Arrange & Act
        fattura.setData_scadenza("");

        // Assert
        assertEquals("", fattura.getData_scadenza());
    }

    // Tests for Data Emissione field
    @Test
    @DisplayName("getData_emissione should return null for new instance")
    void testGetDataEmissioneDefault() {
        // Arrange & Act
        String result = fattura.getData_emissione();

        // Assert
        assertNull(result);
    }

    @Test
    @DisplayName("setData_emissione and getData_emissione should work with valid date")
    void testSetGetDataEmissioneValid() {
        // Arrange
        String testData = "2024-01-15";

        // Act
        fattura.setData_emissione(testData);

        // Assert
        assertEquals(testData, fattura.getData_emissione());
    }

    @Test
    @DisplayName("setData_emissione should accept null value")
    void testSetDataEmissioneNull() {
        // Arrange
        fattura.setData_emissione("2024-01-01");

        // Act
        fattura.setData_emissione(null);

        // Assert
        assertNull(fattura.getData_emissione());
    }

    // Tests for Stato Pagamento field
    @Test
    @DisplayName("getStato_pagamento should return null for new instance")
    void testGetStatoPagamentoDefault() {
        // Arrange & Act
        String result = fattura.getStato_pagamento();

        // Assert
        assertNull(result);
    }

    @Test
    @DisplayName("setStato_pagamento and getStato_pagamento should work with valid status")
    void testSetGetStatoPagamentoValid() {
        // Arrange
        String testStato = "PAGATA";

        // Act
        fattura.setStato_pagamento(testStato);

        // Assert
        assertEquals(testStato, fattura.getStato_pagamento());
    }

    @Test
    @DisplayName("setStato_pagamento should accept null value")
    void testSetStatoPagamentoNull() {
        // Arrange
        fattura.setStato_pagamento("PENDING");

        // Act
        fattura.setStato_pagamento(null);

        // Assert
        assertNull(fattura.getStato_pagamento());
    }

    @Test
    @DisplayName("setStato_pagamento should preserve special characters")
    void testSetStatoPagamentoSpecialCharacters() {
        // Arrange
        String specialStato = "PAGATA-PARZIALMENTE_50%";

        // Act
        fattura.setStato_pagamento(specialStato);

        // Assert
        assertEquals(specialStato, fattura.getStato_pagamento());
    }

    // Tests for IVA field
    @Test
    @DisplayName("getIva should return 0.0f for new instance")
    void testGetIvaDefault() {
        // Arrange & Act
        float result = fattura.getIva();

        // Assert
        assertEquals(0.0f, result);
    }

    @Test
    @DisplayName("setIva and getIva should work with positive percentage")
    void testSetGetIvaPositive() {
        // Arrange
        float testIva = 22.0f;

        // Act
        fattura.setIva(testIva);

        // Assert
        assertEquals(testIva, fattura.getIva());
    }

    @Test
    @DisplayName("setIva should accept zero value")
    void testSetIvaZero() {
        // Arrange & Act
        fattura.setIva(0.0f);

        // Assert
        assertEquals(0.0f, fattura.getIva());
    }

    @Test
    @DisplayName("setIva should work with maximum float value")
    void testSetIvaMaxValue() {
        // Arrange & Act
        fattura.setIva(Float.MAX_VALUE);

        // Assert
        assertEquals(Float.MAX_VALUE, fattura.getIva());
    }

    // Tests for ID field
    @Test
    @DisplayName("getId should return 0 for new instance")
    void testGetIdDefault() {
        // Arrange & Act
        int result = fattura.getId();

        // Assert
        assertEquals(0, result);
    }

    @Test
    @DisplayName("setId and getId should work with positive value")
    void testSetGetIdPositive() {
        // Arrange
        int testId = 12345;

        // Act
        fattura.setId(testId);

        // Assert
        assertEquals(testId, fattura.getId());
    }

    @Test
    @DisplayName("setId should accept zero value")
    void testSetIdZero() {
        // Arrange & Act
        fattura.setId(0);

        // Assert
        assertEquals(0, fattura.getId());
    }

    @Test
    @DisplayName("setId should work with maximum integer value")
    void testSetIdMaxValue() {
        // Arrange & Act
        fattura.setId(Integer.MAX_VALUE);

        // Assert
        assertEquals(Integer.MAX_VALUE, fattura.getId());
    }

    // Behavior consistency tests
    @Test
    @DisplayName("Multiple set/get operations should maintain consistency")
    void testSetGetConsistencyMultipleOperations() {
        // Arrange
        String testSdi = "IT12345678901";
        float testImporto = 100.50f;
        String testDataScadenza = "2024-12-31";
        String testDataEmissione = "2024-01-01";
        String testStatoPagamento = "PENDING";
        float testIva = 22.0f;
        int testId = 999;

        // Act
        fattura.setSdi(testSdi);
        fattura.setImporto(testImporto);
        fattura.setData_scadenza(testDataScadenza);
        fattura.setData_emissione(testDataEmissione);
        fattura.setStato_pagamento(testStatoPagamento);
        fattura.setIva(testIva);
        fattura.setId(testId);

        // Assert
        assertEquals(testSdi, fattura.getSdi());
        assertEquals(testImporto, fattura.getImporto());
        assertEquals(testDataScadenza, fattura.getData_scadenza());
        assertEquals(testDataEmissione, fattura.getData_emissione());
        assertEquals(testStatoPagamento, fattura.getStato_pagamento());
        assertEquals(testIva, fattura.getIva());
        assertEquals(testId, fattura.getId());
    }

    @Test
    @DisplayName("Setting one field should not affect other fields")
    void testFieldIndependence() {
        // Arrange - Set initial values
        fattura.setSdi("INITIAL");
        fattura.setImporto(50.0f);
        fattura.setId(100);

        // Act - Change only SDI
        fattura.setSdi("CHANGED");

        // Assert - Other fields should remain unchanged
        assertEquals("CHANGED", fattura.getSdi());
        assertEquals(50.0f, fattura.getImporto());
        assertEquals(100, fattura.getId());
        assertNull(fattura.getData_scadenza()); // Should remain null
    }

    @Test
    @DisplayName("Extreme values should be handled correctly")
    void testExtremeValues() {
        // Arrange & Act & Assert
        // Test with very long strings
        String longString = "A".repeat(10000);
        fattura.setSdi(longString);
        assertEquals(longString, fattura.getSdi());

        // Test with unicode characters
        String unicodeString = "测试数据àáâãäåæçèéêëìíîï";
        fattura.setStato_pagamento(unicodeString);
        assertEquals(unicodeString, fattura.getStato_pagamento());

        // Test with float precision limits
        float precisionFloat = 123.456789f;
        fattura.setImporto(precisionFloat);
        assertEquals(precisionFloat, fattura.getImporto());
    }

    @Test
    @DisplayName("Null to non-null and back to null transitions should work")
    void testNullTransitions() {
        // Arrange & Act & Assert
        // Start with null (default)
        assertNull(fattura.getSdi());

        // Set to non-null
        fattura.setSdi("NON_NULL");
        assertEquals("NON_NULL", fattura.getSdi());

        // Back to null
        fattura.setSdi(null);
        assertNull(fattura.getSdi());

        // Repeat with another field
        assertNull(fattura.getStato_pagamento());
        fattura.setStato_pagamento("STATUS");
        assertEquals("STATUS", fattura.getStato_pagamento());
        fattura.setStato_pagamento(null);
        assertNull(fattura.getStato_pagamento());
    }

    @Test
    @DisplayName("Float operations should handle special values correctly")
    void testFloatSpecialValues() {
        // Arrange & Act & Assert
        // Positive infinity
        fattura.setImporto(Float.POSITIVE_INFINITY);
        assertEquals(Float.POSITIVE_INFINITY, fattura.getImporto());

        // NaN
        fattura.setIva(Float.NaN);
        assertTrue(Float.isNaN(fattura.getIva()));

        // Very small positive value
        fattura.setImporto(Float.MIN_NORMAL);
        assertEquals(Float.MIN_NORMAL, fattura.getImporto());
    }

    @Test
    @DisplayName("Repeated setter calls should work correctly")
    void testRepeatedSetterCalls() {
        // Arrange & Act & Assert
        for (int i = 0; i < 100; i++) {
            fattura.setId(i);
            assertEquals(i, fattura.getId());

            fattura.setImporto(i * 1.5f);
            assertEquals(i * 1.5f, fattura.getImporto());
        }
    }

    @Test
    @DisplayName("All string fields should handle whitespace correctly")
    void testWhitespaceHandling() {
        // Arrange
        String whitespaceString = "  \t\n\r  ";

        // Act & Assert
        fattura.setSdi(whitespaceString);
        assertEquals(whitespaceString, fattura.getSdi());

        fattura.setData_scadenza(whitespaceString);
        assertEquals(whitespaceString, fattura.getData_scadenza());

        fattura.setData_emissione(whitespaceString);
        assertEquals(whitespaceString, fattura.getData_emissione());

        fattura.setStato_pagamento(whitespaceString);
        assertEquals(whitespaceString, fattura.getStato_pagamento());
    }
}

