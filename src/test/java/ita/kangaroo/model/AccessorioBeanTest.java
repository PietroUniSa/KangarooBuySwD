package ita.kangaroo.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.EmptySource;

import static org.junit.jupiter.api.Assertions.*;

class AccessorioBeanTest {

    private AccessorioBean accessorio;
    private ProdottoBean prodottoBean;

    @BeforeEach
    void setUp() {
        prodottoBean = new ProdottoBean();
        prodottoBean.setId(100);
        accessorio = new AccessorioBean(1, "Rosso", "M", prodottoBean);
    }

    @Test
    @DisplayName("Constructor should initialize all fields correctly")
    void constructorShouldInitializeAllFieldsCorrectly() {
        // Arrange
        int expectedId = 5;
        String expectedColore = "Blu";
        String expectedTaglia = "L";
        ProdottoBean expectedProdotto = new ProdottoBean();
        expectedProdotto.setId(200);

        // Act
        AccessorioBean accessorio = new AccessorioBean(expectedId, expectedColore, expectedTaglia, expectedProdotto);

        // Assert
        assertAll("constructor initialization",
            () -> assertEquals(expectedId, accessorio.getId()),
            () -> assertEquals(expectedColore, accessorio.getColore()),
            () -> assertEquals(expectedTaglia, accessorio.getTaglia()),
            () -> assertEquals(expectedProdotto.getId(), accessorio.getProdottoId())
        );
    }

    @Test
    @DisplayName("Constructor with zero id should work correctly")
    void constructorWithZeroIdShouldWorkCorrectly() {
        // Arrange & Act
        AccessorioBean accessorio = new AccessorioBean(0, "Verde", "S", prodottoBean);

        // Assert
        assertEquals(0, accessorio.getId());
    }

    @ParameterizedTest
    @DisplayName("Constructor with negative id should work correctly")
    @ValueSource(ints = {-1, -100, Integer.MIN_VALUE})
    void constructorWithNegativeIdShouldWorkCorrectly(int negativeId) {
        // Arrange & Act
        AccessorioBean accessorio = new AccessorioBean(negativeId, "Nero", "XL", prodottoBean);

        // Assert
        assertEquals(negativeId, accessorio.getId());
    }

    @Test
    @DisplayName("Constructor with null colore should work")
    void constructorWithNullColoreShouldWork() {
        // Arrange & Act & Assert
        assertDoesNotThrow(() -> {
            AccessorioBean accessorio = new AccessorioBean(1, null, "M", prodottoBean);
            assertNull(accessorio.getColore());
        });
    }

    @Test
    @DisplayName("Constructor with null taglia should work")
    void constructorWithNullTagliaShouldWork() {
        // Arrange & Act & Assert
        assertDoesNotThrow(() -> {
            AccessorioBean accessorio = new AccessorioBean(1, "Rosso", null, prodottoBean);
            assertNull(accessorio.getTaglia());
        });
    }

    @Test
    @DisplayName("Constructor with null ProdottoBean should work")
    void constructorWithNullProdottoBeanShouldWork() {
        // Arrange & Act & Assert
        assertDoesNotThrow(() -> {
            new AccessorioBean(1, "Rosso", "M", null);
        });
    }

    @Test
    @DisplayName("getId should return correct value")
    void getIdShouldReturnCorrectValue() {
        // Arrange & Act & Assert
        assertEquals(1, accessorio.getId());
    }

    @ParameterizedTest
    @DisplayName("setId and getId should work with various values")
    @ValueSource(ints = {0, 1, 100, 999, Integer.MAX_VALUE})
    void setIdAndGetIdShouldWorkWithVariousValues(int id) {
        // Act
        accessorio.setId(id);

        // Assert
        assertEquals(id, accessorio.getId());
    }

    @ParameterizedTest
    @DisplayName("setId and getId should work with negative values")
    @ValueSource(ints = {-1, -100, Integer.MIN_VALUE})
    void setIdAndGetIdShouldWorkWithNegativeValues(int negativeId) {
        // Act
        accessorio.setId(negativeId);

        // Assert
        assertEquals(negativeId, accessorio.getId());
    }

    @Test
    @DisplayName("getColore should return correct value")
    void getColoreShouldReturnCorrectValue() {
        // Arrange & Act & Assert
        assertEquals("Rosso", accessorio.getColore());
    }

    @Test
    @DisplayName("setColore and getColore should work with normal values")
    void setColoreAndGetColoreShouldWorkWithNormalValues() {
        // Arrange
        String expectedColore = "Giallo";

        // Act
        accessorio.setColore(expectedColore);

        // Assert
        assertEquals(expectedColore, accessorio.getColore());
    }

    @Test
    @DisplayName("setColore and getColore should work with null")
    void setColoreAndGetColoreShouldWorkWithNull() {
        // Act
        accessorio.setColore(null);

        // Assert
        assertNull(accessorio.getColore());
    }

    @ParameterizedTest
    @DisplayName("setColore and getColore should work with empty strings")
    @EmptySource
    void setColoreAndGetColoreShouldWorkWithEmptyStrings(String emptyValue) {
        // Act
        accessorio.setColore(emptyValue);

        // Assert
        assertEquals("", accessorio.getColore());
    }

    @Test
    @DisplayName("setColore and getColore should work with special characters")
    void setColoreAndGetColoreShouldWorkWithSpecialCharacters() {
        // Arrange
        String specialColore = "Rosso@#$%^&*()àèìòù";

        // Act
        accessorio.setColore(specialColore);

        // Assert
        assertEquals(specialColore, accessorio.getColore());
    }

    @Test
    @DisplayName("setColore and getColore should work with very long strings")
    void setColoreAndGetColoreShouldWorkWithVeryLongStrings() {
        // Arrange
        String longColore = "a".repeat(10000);

        // Act
        accessorio.setColore(longColore);

        // Assert
        assertEquals(longColore, accessorio.getColore());
    }

    @Test
    @DisplayName("getTaglia should return correct value")
    void getTagliaShouldReturnCorrectValue() {
        // Arrange & Act & Assert
        assertEquals("M", accessorio.getTaglia());
    }

    @Test
    @DisplayName("setTaglia and getTaglia should work with normal values")
    void setTagliaAndGetTagliaShouldWorkWithNormalValues() {
        // Arrange
        String expectedTaglia = "XXL";

        // Act
        accessorio.setTaglia(expectedTaglia);

        // Assert
        assertEquals(expectedTaglia, accessorio.getTaglia());
    }

    @Test
    @DisplayName("setTaglia and getTaglia should work with null")
    void setTagliaAndGetTagliaShouldWorkWithNull() {
        // Act
        accessorio.setTaglia(null);

        // Assert
        assertNull(accessorio.getTaglia());
    }

    @ParameterizedTest
    @DisplayName("setTaglia and getTaglia should work with empty strings")
    @EmptySource
    void setTagliaAndGetTagliaShouldWorkWithEmptyStrings(String emptyValue) {
        // Act
        accessorio.setTaglia(emptyValue);

        // Assert
        assertEquals("", accessorio.getTaglia());
    }

    @Test
    @DisplayName("setTaglia and getTaglia should work with special characters")
    void setTagliaAndGetTagliaShouldWorkWithSpecialCharacters() {
        // Arrange
        String specialTaglia = "XL@#$%^&*()àèìòù";

        // Act
        accessorio.setTaglia(specialTaglia);

        // Assert
        assertEquals(specialTaglia, accessorio.getTaglia());
    }

    @Test
    @DisplayName("getProdottoId should return correct value from ProdottoBean")
    void getProdottoIdShouldReturnCorrectValueFromProdottoBean() {
        // Arrange & Act & Assert
        assertEquals(100, accessorio.getProdottoId());
    }

    @Test
    @DisplayName("setProdottoId and getProdottoId should work correctly")
    void setProdottoIdAndGetProdottoIdShouldWorkCorrectly() {
        // Arrange
        ProdottoBean newProdotto = new ProdottoBean();
        newProdotto.setId(500);

        // Act
        accessorio.setProdottoId(newProdotto);

        // Assert
        assertEquals(500, accessorio.getProdottoId());
    }

    @Test
    @DisplayName("setProdottoId with null should work")
    void setProdottoIdWithNullShouldWork() {
        // Act & Assert
        assertDoesNotThrow(() -> accessorio.setProdottoId(null));
    }

    @Test
    @DisplayName("getProdottoId with null ProdottoBean should throw NullPointerException")
    void getProdottoIdWithNullProdottoBeanShouldThrowNullPointerException() {
        // Arrange
        accessorio.setProdottoId(null);

        // Act & Assert
        assertThrows(NullPointerException.class, () -> accessorio.getProdottoId());
    }

    @ParameterizedTest
    @DisplayName("setProdottoId and getProdottoId should work with various id values")
    @ValueSource(ints = {0, -1, 1, 999, Integer.MAX_VALUE, Integer.MIN_VALUE})
    void setProdottoIdAndGetProdottoIdShouldWorkWithVariousIdValues(int id) {
        // Arrange
        ProdottoBean prodotto = new ProdottoBean();
        prodotto.setId(id);

        // Act
        accessorio.setProdottoId(prodotto);

        // Assert
        assertEquals(id, accessorio.getProdottoId());
    }

    @Test
    @DisplayName("Behavior consistency - multiple set and get operations should work correctly")
    void behaviorConsistencyMultipleSetAndGetOperationsShouldWorkCorrectly() {
        // First set of values
        accessorio.setId(10);
        accessorio.setColore("Verde");
        accessorio.setTaglia("S");

        assertEquals(10, accessorio.getId());
        assertEquals("Verde", accessorio.getColore());
        assertEquals("S", accessorio.getTaglia());

        // Second set of values
        accessorio.setId(20);
        accessorio.setColore("Blu");
        accessorio.setTaglia("L");

        assertEquals(20, accessorio.getId());
        assertEquals("Blu", accessorio.getColore());
        assertEquals("L", accessorio.getTaglia());
    }

    @Test
    @DisplayName("All getters should return expected values after setting")
    void allGettersShouldReturnExpectedValuesAfterSetting() {
        // Arrange
        int expectedId = 42;
        String expectedColore = "Viola";
        String expectedTaglia = "XS";
        ProdottoBean expectedProdotto = new ProdottoBean();
        expectedProdotto.setId(777);

        // Act
        accessorio.setId(expectedId);
        accessorio.setColore(expectedColore);
        accessorio.setTaglia(expectedTaglia);
        accessorio.setProdottoId(expectedProdotto);

        // Assert
        assertAll("all getters consistency",
            () -> assertEquals(expectedId, accessorio.getId()),
            () -> assertEquals(expectedColore, accessorio.getColore()),
            () -> assertEquals(expectedTaglia, accessorio.getTaglia()),
            () -> assertEquals(expectedProdotto.getId(), accessorio.getProdottoId())
        );
    }

    @Test
    @DisplayName("Changing ProdottoBean id should reflect in getProdottoId")
    void changingProdottoBeanIdShouldReflectInGetProdottoId() {
        // Arrange
        ProdottoBean prodotto = new ProdottoBean();
        prodotto.setId(300);
        accessorio.setProdottoId(prodotto);

        assertEquals(300, accessorio.getProdottoId());

        // Act - change the id of the existing ProdottoBean
        prodotto.setId(400);

        // Assert - getProdottoId should reflect the change
        assertEquals(400, accessorio.getProdottoId());
    }

    @Test
    @DisplayName("Edge case - empty strings should be preserved")
    void edgeCaseEmptyStringsShouldBePreserved() {
        // Act
        accessorio.setColore("");
        accessorio.setTaglia("");

        // Assert
        assertAll("empty strings preservation",
            () -> assertEquals("", accessorio.getColore()),
            () -> assertEquals("", accessorio.getTaglia())
        );
    }

    @Test
    @DisplayName("Edge case - whitespace strings should be preserved")
    void edgeCaseWhitespaceStringsShouldBePreserved() {
        // Arrange
        String whitespaceColore = "   ";
        String whitespaceTaglia = "\t\n\r ";

        // Act
        accessorio.setColore(whitespaceColore);
        accessorio.setTaglia(whitespaceTaglia);

        // Assert
        assertAll("whitespace strings preservation",
            () -> assertEquals(whitespaceColore, accessorio.getColore()),
            () -> assertEquals(whitespaceTaglia, accessorio.getTaglia())
        );
    }
}

