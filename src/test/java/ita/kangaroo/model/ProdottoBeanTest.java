package ita.kangaroo.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;
import ita.kangaroo.model.tipo;

import static org.junit.jupiter.api.Assertions.*;

class ProdottoBeanTest {

    private ProdottoBean prodotto;

    @BeforeEach
    void setUp() {
        prodotto = new ProdottoBean();
    }

    @Test
    @DisplayName("Default constructor should initialize fields with default values")
    void defaultConstructorShouldInitializeFieldsWithDefaultValues() {
        // Arrange & Act
        ProdottoBean prodotto = new ProdottoBean();

        // Assert
        assertAll("default constructor values",
            () -> assertEquals(0, prodotto.getId()),
            () -> assertEquals("", prodotto.getDescrizione()),
            () -> assertEquals("", prodotto.getNome()),
            () -> assertEquals("", prodotto.getImmagine()),
            () -> assertEquals(0.0f, prodotto.getPrezzo()),
            () -> assertEquals(0, prodotto.getQuantita()),
            () -> assertEquals(0.0f, prodotto.getIva()),
            () -> assertNull(prodotto.getTipo())
        );
    }

    @Test
    @DisplayName("Parameterized constructor should initialize all fields correctly")
    void parameterizedConstructorShouldInitializeAllFieldsCorrectly() {
        // Arrange
        int id = 1;
        String descrizione = "Test Description";
        String nome = "Test Name";
        String immagine = "test.jpg";
        float prezzo = 25.99f;
        int quantita = 10;
        float iva = 22.0f;
        tipo t = tipo.cliente; // usa il primo valore enum come valore di test
        // Act
        ProdottoBean prodotto = new ProdottoBean(id, descrizione, nome, immagine, prezzo, quantita, iva, t);

        // Assert
        assertAll("parameterized constructor values",
            () -> assertEquals(id, prodotto.getId()),
            () -> assertEquals(descrizione, prodotto.getDescrizione()),
            () -> assertEquals(nome, prodotto.getNome()),
            () -> assertEquals(immagine, prodotto.getImmagine()),
            () -> assertEquals(prezzo, prodotto.getPrezzo()),
            () -> assertEquals(quantita, prodotto.getQuantita()),
            () -> assertEquals(iva, prodotto.getIva()),
            () -> assertEquals(t, prodotto.getTipo())
        );
    }

    @ParameterizedTest
    @DisplayName("Setting and getting valid IDs should work correctly")
    @ValueSource(ints = {0, 1, 100, Integer.MAX_VALUE})
    void settingAndGettingValidIdsShouldWorkCorrectly(int id) {
        prodotto.setId(id);
        assertEquals(id, prodotto.getId());
    }

    @ParameterizedTest
    @DisplayName("Setting and getting valid prices should work correctly")
    @ValueSource(floats = {0.0f, 1.0f, 99.99f, Float.MAX_VALUE})
    void settingAndGettingValidPricesShouldWorkCorrectly(float prezzo) {
        prodotto.setPrezzo(prezzo);
        assertEquals(prezzo, prodotto.getPrezzo());
    }

    @ParameterizedTest
    @DisplayName("Setting and getting valid quantities should work correctly")
    @ValueSource(ints = {0, 1, 50, Integer.MAX_VALUE})
    void settingAndGettingValidQuantitiesShouldWorkCorrectly(int quantita) {
        prodotto.setQuantita(quantita);
        assertEquals(quantita, prodotto.getQuantita());
    }

    @ParameterizedTest
    @DisplayName("Setting and getting valid IVA values should work correctly")
    @ValueSource(floats = {0.0f, 5.0f, 22.0f, Float.MAX_VALUE})
    void settingAndGettingValidIvaValuesShouldWorkCorrectly(float iva) {
        prodotto.setIva(iva);
        assertEquals(iva, prodotto.getIva());
    }

    @Test
    @DisplayName("Setting and getting null tipo should work correctly")
    void settingAndGettingNullTipoShouldWorkCorrectly() {
        prodotto.setTipo(null);
        assertNull(prodotto.getTipo());
    }

    @Test
    @DisplayName("ToString should include all fields and handle null values")
    void toStringShouldIncludeAllFieldsAndHandleNullValues() {
        prodotto.setId(1);
        prodotto.setDescrizione(null);
        prodotto.setNome("Test Nome");
        prodotto.setImmagine(null);
        prodotto.setPrezzo(10.5f);
        prodotto.setQuantita(3);
        prodotto.setIva(22.0f);
        prodotto.setTipo(null);

        String result = prodotto.toString();

        assertAll("toString content",
                () -> assertTrue(result.contains("1")),
                () -> assertTrue(result.contains("null")),
                () -> assertTrue(result.contains("Test Nome")),
                () -> assertTrue(result.contains("10.5")),
                () -> assertTrue(result.contains("3")),
                () -> assertTrue(result.contains("22.0"))
        );
    }

    @ParameterizedTest
    @DisplayName("Setting and getting negative IDs should work correctly")
    @ValueSource(ints = {-1, -100, Integer.MIN_VALUE})
    void settingAndGettingNegativeIdsShouldWorkCorrectly(int id) {
        prodotto.setId(id);
        assertEquals(id, prodotto.getId());
    }

    @ParameterizedTest
    @DisplayName("Setting and getting negative prices should work correctly")
    @ValueSource(floats = {-1.0f, -99.99f, Float.MIN_VALUE})
    void settingAndGettingNegativePricesShouldWorkCorrectly(float prezzo) {
        prodotto.setPrezzo(prezzo);
        assertEquals(prezzo, prodotto.getPrezzo());
    }

    @ParameterizedTest
    @DisplayName("Setting and getting negative quantities should work correctly")
    @ValueSource(ints = {-1, -50, Integer.MIN_VALUE})
    void settingAndGettingNegativeQuantitiesShouldWorkCorrectly(int quantita) {
        prodotto.setQuantita(quantita);
        assertEquals(quantita, prodotto.getQuantita());
    }

    @ParameterizedTest
    @DisplayName("Setting and getting negative IVA values should work correctly")
    @ValueSource(floats = {-1.0f, -22.0f, Float.MIN_VALUE})
    void settingAndGettingNegativeIvaValuesShouldWorkCorrectly(float iva) {
        prodotto.setIva(iva);
        assertEquals(iva, prodotto.getIva());
    }

    @Test
    @DisplayName("Setting and getting special float values should work correctly")
    void settingAndGettingSpecialFloatValuesShouldWorkCorrectly() {
        // Test NaN
        prodotto.setPrezzo(Float.NaN);
        assertTrue(Float.isNaN(prodotto.getPrezzo()));

        prodotto.setIva(Float.NaN);
        assertTrue(Float.isNaN(prodotto.getIva()));

        // Test positive infinity
        prodotto.setPrezzo(Float.POSITIVE_INFINITY);
        assertEquals(Float.POSITIVE_INFINITY, prodotto.getPrezzo());

        // Test negative infinity
        prodotto.setIva(Float.NEGATIVE_INFINITY);
        assertEquals(Float.NEGATIVE_INFINITY, prodotto.getIva());
    }

    @ParameterizedTest
    @DisplayName("Setting and getting null strings should work correctly")
    @NullSource
    void settingAndGettingNullStringsShouldWorkCorrectly(String nullValue) {
        prodotto.setDescrizione(nullValue);
        assertNull(prodotto.getDescrizione());

        prodotto.setNome(nullValue);
        assertNull(prodotto.getNome());

        prodotto.setImmagine(nullValue);
        assertNull(prodotto.getImmagine());
    }

    @ParameterizedTest
    @DisplayName("Setting and getting empty strings should work correctly")
    @EmptySource
    void settingAndGettingEmptyStringsShouldWorkCorrectly(String emptyValue) {
        prodotto.setDescrizione(emptyValue);
        assertEquals("", prodotto.getDescrizione());

        prodotto.setNome(emptyValue);
        assertEquals("", prodotto.getNome());

        prodotto.setImmagine(emptyValue);
        assertEquals("", prodotto.getImmagine());
    }

    @Test
    @DisplayName("Setting and getting strings with special characters should work correctly")
    void settingAndGettingStringsWithSpecialCharactersShouldWorkCorrectly() {
        String specialChars = "àèìòù@#$%^&*(){}[]|\\:;\"'<>,.?/~`";

        prodotto.setDescrizione(specialChars);
        assertEquals(specialChars, prodotto.getDescrizione());

        prodotto.setNome(specialChars);
        assertEquals(specialChars, prodotto.getNome());

        prodotto.setImmagine(specialChars);
        assertEquals(specialChars, prodotto.getImmagine());
    }

    @Test
    @DisplayName("Setting and getting very long strings should work correctly")
    void settingAndGettingVeryLongStringsShouldWorkCorrectly() {
        String longString = "a".repeat(10000);

        prodotto.setDescrizione(longString);
        assertEquals(longString, prodotto.getDescrizione());

        prodotto.setNome(longString);
        assertEquals(longString, prodotto.getNome());

        prodotto.setImmagine(longString);
        assertEquals(longString, prodotto.getImmagine());
    }

    @Test
    @DisplayName("ToString should handle empty strings correctly")
    void toStringShouldHandleEmptyStringsCorrectly() {
        prodotto.setId(123);
        prodotto.setDescrizione("");
        prodotto.setNome("");
        prodotto.setImmagine("");
        prodotto.setPrezzo(45.67f);
        prodotto.setQuantita(8);
        prodotto.setIva(10.0f);
        prodotto.setTipo(null);

        String result = prodotto.toString();

        assertAll("toString with empty strings",
            () -> assertTrue(result.contains("123")),
            () -> assertTrue(result.contains("descrizione=''")),
            () -> assertTrue(result.contains("nome=''")),
            () -> assertTrue(result.contains("immagine=''")),
            () -> assertTrue(result.contains("45.67")),
            () -> assertTrue(result.contains("8")),
            () -> assertTrue(result.contains("10.0")),
            () -> assertTrue(result.contains("tipo=null"))
        );
    }

    @Test
    @DisplayName("ToString should handle special characters correctly")
    void toStringShouldHandleSpecialCharactersCorrectly() {
        String specialString = "Test'with\"quotes&symbols<>";

        prodotto.setId(999);
        prodotto.setDescrizione(specialString);
        prodotto.setNome(specialString);
        prodotto.setImmagine(specialString);
        prodotto.setPrezzo(99.99f);
        prodotto.setQuantita(5);
        prodotto.setIva(21.0f);

        String result = prodotto.toString();

        assertAll("toString with special characters",
            () -> assertTrue(result.contains("999")),
            () -> assertTrue(result.contains(specialString)),
            () -> assertTrue(result.contains("99.99")),
            () -> assertTrue(result.contains("5")),
            () -> assertTrue(result.contains("21.0"))
        );
    }

    @Test
    @DisplayName("ToString should handle special float values correctly")
    void toStringShouldHandleSpecialFloatValuesCorrectly() {
        prodotto.setPrezzo(Float.NaN);
        prodotto.setIva(Float.POSITIVE_INFINITY);

        String result = prodotto.toString();

        assertAll("toString with special float values",
            () -> assertTrue(result.contains("NaN")),
            () -> assertTrue(result.contains("Infinity"))
        );
    }

    @Test
    @DisplayName("Behavior consistency - multiple set and get operations should work correctly")
    void behaviorConsistencyMultipleSetAndGetOperationsShouldWorkCorrectly() {
        // First set of values
        prodotto.setId(10);
        prodotto.setDescrizione("First");
        prodotto.setPrezzo(100.0f);

        assertEquals(10, prodotto.getId());
        assertEquals("First", prodotto.getDescrizione());
        assertEquals(100.0f, prodotto.getPrezzo());

        // Second set of values
        prodotto.setId(20);
        prodotto.setDescrizione("Second");
        prodotto.setPrezzo(200.0f);

        assertEquals(20, prodotto.getId());
        assertEquals("Second", prodotto.getDescrizione());
        assertEquals(200.0f, prodotto.getPrezzo());
    }

    @Test
    @DisplayName("All getters should return expected values after setting")
    void allGettersShouldReturnExpectedValuesAfterSetting() {
        // Arrange
        int expectedId = 42;
        String expectedDescrizione = "Test Descrizione";
        String expectedNome = "Test Nome";
        String expectedImmagine = "test-image.png";
        float expectedPrezzo = 123.45f;
        int expectedQuantita = 15;
        float expectedIva = 22.5f;
        tipo expectedTipo = tipo.values()[0]; // usa il primo valore enum come valore di test

        // Act
        prodotto.setId(expectedId);
        prodotto.setDescrizione(expectedDescrizione);
        prodotto.setNome(expectedNome);
        prodotto.setImmagine(expectedImmagine);
        prodotto.setPrezzo(expectedPrezzo);
        prodotto.setQuantita(expectedQuantita);
        prodotto.setIva(expectedIva);
        prodotto.setTipo(expectedTipo);

        // Assert
        assertAll("all getters consistency",
            () -> assertEquals(expectedId, prodotto.getId()),
            () -> assertEquals(expectedDescrizione, prodotto.getDescrizione()),
            () -> assertEquals(expectedNome, prodotto.getNome()),
            () -> assertEquals(expectedImmagine, prodotto.getImmagine()),
            () -> assertEquals(expectedPrezzo, prodotto.getPrezzo()),
            () -> assertEquals(expectedQuantita, prodotto.getQuantita()),
            () -> assertEquals(expectedIva, prodotto.getIva()),
            () -> assertEquals(expectedTipo, prodotto.getTipo())
        );
    }
}
