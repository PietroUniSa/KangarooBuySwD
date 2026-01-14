package ita.kangaroo.model;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("MetodoPagamentoBean Tests")
class MetodoPagamentoBeanTest {

    @Test
    @DisplayName("Should create instance with default constructor and initialize all fields to default values")
    void testDefaultConstructor() {
        // Act
        MetodoPagamentoBean metodoPagamento = new MetodoPagamentoBean();

        // Assert
        assertEquals(0, metodoPagamento.getId());
        assertNull(metodoPagamento.getNumero_carta());
        assertNull(metodoPagamento.getCvv());
        assertNull(metodoPagamento.getData_scadenza());
        assertNull(metodoPagamento.getCircuito());
        assertNull(metodoPagamento.getUsername());
    }

    // Id getter/setter tests
    @Test
    @DisplayName("Should get and set id with positive value")
    void testSetAndGetIdWithPositiveValue() {
        // Arrange
        MetodoPagamentoBean metodoPagamento = new MetodoPagamentoBean();
        int expectedId = 42;

        // Act
        metodoPagamento.setId(expectedId);
        int actualId = metodoPagamento.getId();

        // Assert
        assertEquals(expectedId, actualId);
    }

    @Test
    @DisplayName("Should get and set id with zero value")
    void testSetAndGetIdWithZeroValue() {
        // Arrange
        MetodoPagamentoBean metodoPagamento = new MetodoPagamentoBean();
        int expectedId = 0;

        // Act
        metodoPagamento.setId(expectedId);
        int actualId = metodoPagamento.getId();

        // Assert
        assertEquals(expectedId, actualId);
    }

    @Test
    @DisplayName("Should get and set id with maximum integer value")
    void testSetAndGetIdWithMaxValue() {
        // Arrange
        MetodoPagamentoBean metodoPagamento = new MetodoPagamentoBean();
        int expectedId = Integer.MAX_VALUE;

        // Act
        metodoPagamento.setId(expectedId);
        int actualId = metodoPagamento.getId();

        // Assert
        assertEquals(expectedId, actualId);
    }

    @Test
    @DisplayName("Should handle setting negative id value")
    void testSetIdWithNegativeValue() {
        // Arrange
        MetodoPagamentoBean metodoPagamento = new MetodoPagamentoBean();
        int negativeId = -1;

        // Act
        metodoPagamento.setId(negativeId);
        int actualId = metodoPagamento.getId();

        // Assert
        assertEquals(negativeId, actualId);
    }

    // Numero_carta getter/setter tests
    @Test
    @DisplayName("Should get and set numero_carta with valid string")
    void testSetAndGetNumeroCarta() {
        // Arrange
        MetodoPagamentoBean metodoPagamento = new MetodoPagamentoBean();
        String expectedNumero = "1234567890123456";

        // Act
        metodoPagamento.setNumero_carta(expectedNumero);
        String actualNumero = metodoPagamento.getNumero_carta();

        // Assert
        assertEquals(expectedNumero, actualNumero);
    }

    @Test
    @DisplayName("Should get and set numero_carta with empty string")
    void testSetAndGetNumeroCartaWithEmptyString() {
        // Arrange
        MetodoPagamentoBean metodoPagamento = new MetodoPagamentoBean();
        String expectedNumero = "";

        // Act
        metodoPagamento.setNumero_carta(expectedNumero);
        String actualNumero = metodoPagamento.getNumero_carta();

        // Assert
        assertEquals(expectedNumero, actualNumero);
    }

    @Test
    @DisplayName("Should handle setting null numero_carta")
    void testSetNumeroCartaWithNull() {
        // Arrange
        MetodoPagamentoBean metodoPagamento = new MetodoPagamentoBean();

        // Act
        metodoPagamento.setNumero_carta(null);
        String actualNumero = metodoPagamento.getNumero_carta();

        // Assert
        assertNull(actualNumero);
    }

    @Test
    @DisplayName("Should get and set numero_carta with special characters")
    void testSetAndGetNumeroCartaWithSpecialCharacters() {
        // Arrange
        MetodoPagamentoBean metodoPagamento = new MetodoPagamentoBean();
        String expectedNumero = "1234-5678-9012-3456 @#$%";

        // Act
        metodoPagamento.setNumero_carta(expectedNumero);
        String actualNumero = metodoPagamento.getNumero_carta();

        // Assert
        assertEquals(expectedNumero, actualNumero);
    }

    // CVV getter/setter tests
    @Test
    @DisplayName("Should get and set cvv with valid string")
    void testSetAndGetCvv() {
        // Arrange
        MetodoPagamentoBean metodoPagamento = new MetodoPagamentoBean();
        String expectedCvv = "123";

        // Act
        metodoPagamento.setCvv(expectedCvv);
        String actualCvv = metodoPagamento.getCvv();

        // Assert
        assertEquals(expectedCvv, actualCvv);
    }

    @Test
    @DisplayName("Should get and set cvv with empty string")
    void testSetAndGetCvvWithEmptyString() {
        // Arrange
        MetodoPagamentoBean metodoPagamento = new MetodoPagamentoBean();
        String expectedCvv = "";

        // Act
        metodoPagamento.setCvv(expectedCvv);
        String actualCvv = metodoPagamento.getCvv();

        // Assert
        assertEquals(expectedCvv, actualCvv);
    }

    @Test
    @DisplayName("Should handle setting null cvv")
    void testSetCvvWithNull() {
        // Arrange
        MetodoPagamentoBean metodoPagamento = new MetodoPagamentoBean();

        // Act
        metodoPagamento.setCvv(null);
        String actualCvv = metodoPagamento.getCvv();

        // Assert
        assertNull(actualCvv);
    }

    @Test
    @DisplayName("Should get and set cvv with special characters")
    void testSetAndGetCvvWithSpecialCharacters() {
        // Arrange
        MetodoPagamentoBean metodoPagamento = new MetodoPagamentoBean();
        String expectedCvv = "12@";

        // Act
        metodoPagamento.setCvv(expectedCvv);
        String actualCvv = metodoPagamento.getCvv();

        // Assert
        assertEquals(expectedCvv, actualCvv);
    }

    // Data_scadenza getter/setter tests
    @Test
    @DisplayName("Should get and set data_scadenza with valid string")
    void testSetAndGetDataScadenza() {
        // Arrange
        MetodoPagamentoBean metodoPagamento = new MetodoPagamentoBean();
        String expectedData = "12/25";

        // Act
        metodoPagamento.setData_scadenza(expectedData);
        String actualData = metodoPagamento.getData_scadenza();

        // Assert
        assertEquals(expectedData, actualData);
    }

    @Test
    @DisplayName("Should get and set data_scadenza with empty string")
    void testSetAndGetDataScadenzaWithEmptyString() {
        // Arrange
        MetodoPagamentoBean metodoPagamento = new MetodoPagamentoBean();
        String expectedData = "";

        // Act
        metodoPagamento.setData_scadenza(expectedData);
        String actualData = metodoPagamento.getData_scadenza();

        // Assert
        assertEquals(expectedData, actualData);
    }

    @Test
    @DisplayName("Should handle setting null data_scadenza")
    void testSetDataScadenzaWithNull() {
        // Arrange
        MetodoPagamentoBean metodoPagamento = new MetodoPagamentoBean();

        // Act
        metodoPagamento.setData_scadenza(null);
        String actualData = metodoPagamento.getData_scadenza();

        // Assert
        assertNull(actualData);
    }

    @Test
    @DisplayName("Should get and set data_scadenza with special characters")
    void testSetAndGetDataScadenzaWithSpecialCharacters() {
        // Arrange
        MetodoPagamentoBean metodoPagamento = new MetodoPagamentoBean();
        String expectedData = "12/25 @#$%";

        // Act
        metodoPagamento.setData_scadenza(expectedData);
        String actualData = metodoPagamento.getData_scadenza();

        // Assert
        assertEquals(expectedData, actualData);
    }

    // Circuito getter/setter tests
    @Test
    @DisplayName("Should get and set circuito with valid string")
    void testSetAndGetCircuito() {
        // Arrange
        MetodoPagamentoBean metodoPagamento = new MetodoPagamentoBean();
        String expectedCircuito = "VISA";

        // Act
        metodoPagamento.setCircuito(expectedCircuito);
        String actualCircuito = metodoPagamento.getCircuito();

        // Assert
        assertEquals(expectedCircuito, actualCircuito);
    }

    @Test
    @DisplayName("Should get and set circuito with empty string")
    void testSetAndGetCircuitoWithEmptyString() {
        // Arrange
        MetodoPagamentoBean metodoPagamento = new MetodoPagamentoBean();
        String expectedCircuito = "";

        // Act
        metodoPagamento.setCircuito(expectedCircuito);
        String actualCircuito = metodoPagamento.getCircuito();

        // Assert
        assertEquals(expectedCircuito, actualCircuito);
    }

    @Test
    @DisplayName("Should handle setting null circuito")
    void testSetCircuitoWithNull() {
        // Arrange
        MetodoPagamentoBean metodoPagamento = new MetodoPagamentoBean();

        // Act
        metodoPagamento.setCircuito(null);
        String actualCircuito = metodoPagamento.getCircuito();

        // Assert
        assertNull(actualCircuito);
    }

    @Test
    @DisplayName("Should get and set circuito with special characters")
    void testSetAndGetCircuitoWithSpecialCharacters() {
        // Arrange
        MetodoPagamentoBean metodoPagamento = new MetodoPagamentoBean();
        String expectedCircuito = "VISA-™®";

        // Act
        metodoPagamento.setCircuito(expectedCircuito);
        String actualCircuito = metodoPagamento.getCircuito();

        // Assert
        assertEquals(expectedCircuito, actualCircuito);
    }

    // Username getter/setter tests
    @Test
    @DisplayName("Should get and set username with valid string")
    void testSetAndGetUsername() {
        // Arrange
        MetodoPagamentoBean metodoPagamento = new MetodoPagamentoBean();
        String expectedUsername = "testuser";

        // Act
        metodoPagamento.setUsername(expectedUsername);
        String actualUsername = metodoPagamento.getUsername();

        // Assert
        assertEquals(expectedUsername, actualUsername);
    }

    @Test
    @DisplayName("Should get and set username with empty string")
    void testSetAndGetUsernameWithEmptyString() {
        // Arrange
        MetodoPagamentoBean metodoPagamento = new MetodoPagamentoBean();
        String expectedUsername = "";

        // Act
        metodoPagamento.setUsername(expectedUsername);
        String actualUsername = metodoPagamento.getUsername();

        // Assert
        assertEquals(expectedUsername, actualUsername);
    }

    @Test
    @DisplayName("Should handle setting null username")
    void testSetUsernameWithNull() {
        // Arrange
        MetodoPagamentoBean metodoPagamento = new MetodoPagamentoBean();

        // Act
        metodoPagamento.setUsername(null);
        String actualUsername = metodoPagamento.getUsername();

        // Assert
        assertNull(actualUsername);
    }

    @Test
    @DisplayName("Should get and set username with special characters")
    void testSetAndGetUsernameWithSpecialCharacters() {
        // Arrange
        MetodoPagamentoBean metodoPagamento = new MetodoPagamentoBean();
        String expectedUsername = "test_user@domain.com #1";

        // Act
        metodoPagamento.setUsername(expectedUsername);
        String actualUsername = metodoPagamento.getUsername();

        // Assert
        assertEquals(expectedUsername, actualUsername);
    }

    // Behavior consistency tests
    @Test
    @DisplayName("Should maintain consistency when setting multiple fields")
    void testMultipleFieldsConsistency() {
        // Arrange
        MetodoPagamentoBean metodoPagamento = new MetodoPagamentoBean();
        int expectedId = 999;
        String expectedNumero = "1234567890123456";
        String expectedCvv = "789";
        String expectedData = "01/30";
        String expectedCircuito = "MASTERCARD";
        String expectedUsername = "testuser";

        // Act
        metodoPagamento.setId(expectedId);
        metodoPagamento.setNumero_carta(expectedNumero);
        metodoPagamento.setCvv(expectedCvv);
        metodoPagamento.setData_scadenza(expectedData);
        metodoPagamento.setCircuito(expectedCircuito);
        metodoPagamento.setUsername(expectedUsername);

        // Assert
        assertEquals(expectedId, metodoPagamento.getId());
        assertEquals(expectedNumero, metodoPagamento.getNumero_carta());
        assertEquals(expectedCvv, metodoPagamento.getCvv());
        assertEquals(expectedData, metodoPagamento.getData_scadenza());
        assertEquals(expectedCircuito, metodoPagamento.getCircuito());
        assertEquals(expectedUsername, metodoPagamento.getUsername());
    }

    // Equals method tests
    @Test
    @DisplayName("Should return true when comparing object with itself")
    void testEqualsWithSameInstance() {
        // Arrange
        MetodoPagamentoBean metodoPagamento = new MetodoPagamentoBean();

        // Act & Assert
        assertTrue(metodoPagamento.equals(metodoPagamento));
    }

    @Test
    @DisplayName("Should return true when comparing objects with same id")
    void testEqualsWithSameId() {
        // Arrange
        MetodoPagamentoBean metodoPagamento1 = new MetodoPagamentoBean();
        MetodoPagamentoBean metodoPagamento2 = new MetodoPagamentoBean();
        metodoPagamento1.setId(100);
        metodoPagamento2.setId(100);

        // Act & Assert
        assertTrue(metodoPagamento1.equals(metodoPagamento2));
        assertTrue(metodoPagamento2.equals(metodoPagamento1));
    }

    @Test
    @DisplayName("Should return false when comparing objects with different id")
    void testEqualsWithDifferentId() {
        // Arrange
        MetodoPagamentoBean metodoPagamento1 = new MetodoPagamentoBean();
        MetodoPagamentoBean metodoPagamento2 = new MetodoPagamentoBean();
        metodoPagamento1.setId(100);
        metodoPagamento2.setId(200);

        // Act & Assert
        assertFalse(metodoPagamento1.equals(metodoPagamento2));
        assertFalse(metodoPagamento2.equals(metodoPagamento1));
    }

    @Test
    @DisplayName("Should return false when comparing with null")
    void testEqualsWithNull() {
        // Arrange
        MetodoPagamentoBean metodoPagamento = new MetodoPagamentoBean();

        // Act & Assert
        assertFalse(metodoPagamento.equals(null));
    }

    @Test
    @DisplayName("Should return false when comparing with different class")
    void testEqualsWithDifferentClass() {
        // Arrange
        MetodoPagamentoBean metodoPagamento = new MetodoPagamentoBean();
        String otherObject = "test";

        // Act & Assert
        assertFalse(metodoPagamento.equals(otherObject));
    }

    @Test
    @DisplayName("Should handle extreme values without throwing exceptions")
    void testExtremeValues() {
        // Arrange
        MetodoPagamentoBean metodoPagamento = new MetodoPagamentoBean();

        // Act & Assert - should not throw exceptions
        assertDoesNotThrow(() -> {
            metodoPagamento.setId(Integer.MIN_VALUE);
            metodoPagamento.setNumero_carta("€¥£¢∞§¶");
            metodoPagamento.setCvv("\n\t\r");
            metodoPagamento.setData_scadenza("©®™");
            metodoPagamento.setCircuito("A".repeat(10000));
            metodoPagamento.setUsername("");
        });

        // Verify values are set
        assertEquals(Integer.MIN_VALUE, metodoPagamento.getId());
        assertEquals("€¥£¢∞§¶", metodoPagamento.getNumero_carta());
        assertEquals("\n\t\r", metodoPagamento.getCvv());
        assertEquals("©®™", metodoPagamento.getData_scadenza());
        assertEquals("A".repeat(10000), metodoPagamento.getCircuito());
        assertEquals("", metodoPagamento.getUsername());
    }

    @Test
    @DisplayName("Should handle Unicode characters in string fields")
    void testUnicodeCharacters() {
        // Arrange
        MetodoPagamentoBean metodoPagamento = new MetodoPagamentoBean();
        String unicodeNumero = "١٢٣٤٥٦٧٨٩٠"; // Arabic digits
        String unicodeCvv = "①②③"; // Circled numbers
        String unicodeData = "❶❷/❸❹"; // Special symbols
        String unicodeCircuito = "Ñiños™"; // Spanish characters
        String unicodeUsername = "用户名"; // Chinese characters

        // Act
        metodoPagamento.setNumero_carta(unicodeNumero);
        metodoPagamento.setCvv(unicodeCvv);
        metodoPagamento.setData_scadenza(unicodeData);
        metodoPagamento.setCircuito(unicodeCircuito);
        metodoPagamento.setUsername(unicodeUsername);

        // Assert
        assertEquals(unicodeNumero, metodoPagamento.getNumero_carta());
        assertEquals(unicodeCvv, metodoPagamento.getCvv());
        assertEquals(unicodeData, metodoPagamento.getData_scadenza());
        assertEquals(unicodeCircuito, metodoPagamento.getCircuito());
        assertEquals(unicodeUsername, metodoPagamento.getUsername());
    }

    @Test
    @DisplayName("Should handle whitespace and control characters")
    void testWhitespaceAndControlCharacters() {
        // Arrange
        MetodoPagamentoBean metodoPagamento = new MetodoPagamentoBean();
        String whitespaceString = "   \t\n\r   ";
        String tabString = "\t\t\t";
        String newlineString = "\n\n\n";

        // Act
        metodoPagamento.setNumero_carta(whitespaceString);
        metodoPagamento.setCvv(tabString);
        metodoPagamento.setData_scadenza(newlineString);

        // Assert
        assertEquals(whitespaceString, metodoPagamento.getNumero_carta());
        assertEquals(tabString, metodoPagamento.getCvv());
        assertEquals(newlineString, metodoPagamento.getData_scadenza());
    }
}

