package ita.kangaroo.model;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;
import ita.kangaroo.model.tipo;

@DisplayName("AnimaleBean Tests")
class AnimaleBeanTest {

    @Test
    @DisplayName("Should create instance with default constructor and initialize all fields to default values")
    void testDefaultConstructor() {
        // Act
        animaleBean animale = new animaleBean();

        // Assert - animaleBean specific fields
        assertEquals(0, animale.getId1());
        assertEquals("", animale.getContinente());
        assertEquals(0, animale.getEta());
        assertEquals(0.0, animale.getPeso());
        assertEquals("", animale.getSesso());

        // Assert - inherited ProdottoBean fields (assuming default constructor sets them to defaults)
        assertEquals(0, animale.getId());
        assertNotNull(animale.getDescrizione());
        assertNotNull(animale.getNome());
        assertNotNull(animale.getImmagine());
        assertEquals(0.0f, animale.getPrezzo());
        assertEquals(0, animale.getQuantita());
        assertEquals(0.0f, animale.getIva());
    }

    @Test
    @DisplayName("Should create instance with parameterized constructor and set all fields correctly")
    void testParameterizedConstructor() {
        // Arrange
        int id = 1;
        String descrizione = "Test description";
        String nome = "Test name";
        String immagine = "test.jpg";
        float prezzo = 99.99f;
        int quantita = 5;
        float iva = 22.0f;
        tipo tipo = ita.kangaroo.model.tipo.animale;
        int id1 = 100;
        String continente = "Africa";
        int eta = 5;
        double peso = 75.5;
        String sesso = "Maschio";

        // Act
        animaleBean animale = new animaleBean(id, descrizione, nome, immagine, prezzo, quantita, iva, tipo, id1, continente, eta, peso, sesso);

        // Assert - animaleBean specific fields
        assertEquals(id1, animale.getId1());
        assertEquals(continente, animale.getContinente());
        assertEquals(eta, animale.getEta());
        assertEquals(peso, animale.getPeso());
        assertEquals(sesso, animale.getSesso());

        // Assert - inherited ProdottoBean fields
        assertEquals(id, animale.getId());
        assertEquals(descrizione, animale.getDescrizione());
        assertEquals(nome, animale.getNome());
        assertEquals(immagine, animale.getImmagine());
        assertEquals(prezzo, animale.getPrezzo());
        assertEquals(quantita, animale.getQuantita());
        assertEquals(iva, animale.getIva());
        assertEquals(tipo, animale.getTipo());
    }

    // Id1 getter/setter tests
    @Test
    @DisplayName("Should get and set id1 with positive value")
    void testSetAndGetId1WithPositiveValue() {
        // Arrange
        animaleBean animale = new animaleBean();
        int expectedId1 = 42;

        // Act
        animale.setId1(expectedId1);
        int actualId1 = animale.getId1();

        // Assert
        assertEquals(expectedId1, actualId1);
    }

    @Test
    @DisplayName("Should get and set id1 with zero value")
    void testSetAndGetId1WithZeroValue() {
        // Arrange
        animaleBean animale = new animaleBean();
        int expectedId1 = 0;

        // Act
        animale.setId1(expectedId1);
        int actualId1 = animale.getId1();

        // Assert
        assertEquals(expectedId1, actualId1);
    }

    @Test
    @DisplayName("Should get and set id1 with maximum integer value")
    void testSetAndGetId1WithMaxValue() {
        // Arrange
        animaleBean animale = new animaleBean();
        int expectedId1 = Integer.MAX_VALUE;

        // Act
        animale.setId1(expectedId1);
        int actualId1 = animale.getId1();

        // Assert
        assertEquals(expectedId1, actualId1);
    }

    @Test
    @DisplayName("Should handle setting negative id1 value")
    void testSetId1WithNegativeValue() {
        // Arrange
        animaleBean animale = new animaleBean();
        int negativeId1 = -1;

        // Act
        animale.setId1(negativeId1);
        int actualId1 = animale.getId1();

        // Assert
        assertEquals(negativeId1, actualId1);
    }

    // Continente getter/setter tests
    @Test
    @DisplayName("Should get and set continente with valid string")
    void testSetAndGetContinenteWithValidString() {
        // Arrange
        animaleBean animale = new animaleBean();
        String expectedContinente = "Europa";

        // Act
        animale.setContinente(expectedContinente);
        String actualContinente = animale.getContinente();

        // Assert
        assertEquals(expectedContinente, actualContinente);
    }

    @Test
    @DisplayName("Should get and set continente with empty string")
    void testSetAndGetContinenteWithEmptyString() {
        // Arrange
        animaleBean animale = new animaleBean();
        String expectedContinente = "";

        // Act
        animale.setContinente(expectedContinente);
        String actualContinente = animale.getContinente();

        // Assert
        assertEquals(expectedContinente, actualContinente);
    }

    @Test
    @DisplayName("Should get and set continente with string containing special characters")
    void testSetAndGetContinenteWithSpecialCharacters() {
        // Arrange
        animaleBean animale = new animaleBean();
        String expectedContinente = "América del Sür @#$%";

        // Act
        animale.setContinente(expectedContinente);
        String actualContinente = animale.getContinente();

        // Assert
        assertEquals(expectedContinente, actualContinente);
    }

    @Test
    @DisplayName("Should handle setting null continente")
    void testSetContinenteWithNullValue() {
        // Arrange
        animaleBean animale = new animaleBean();

        // Act
        animale.setContinente(null);
        String actualContinente = animale.getContinente();

        // Assert
        assertNull(actualContinente);
    }

    @Test
    @DisplayName("Should get and set continente with very long string")
    void testSetAndGetContinenteWithLongString() {
        // Arrange
        animaleBean animale = new animaleBean();
        String expectedContinente = "A".repeat(1000);

        // Act
        animale.setContinente(expectedContinente);
        String actualContinente = animale.getContinente();

        // Assert
        assertEquals(expectedContinente, actualContinente);
    }

    // Eta getter/setter tests
    @Test
    @DisplayName("Should get and set eta with positive value")
    void testSetAndGetEtaWithPositiveValue() {
        // Arrange
        animaleBean animale = new animaleBean();
        int expectedEta = 10;

        // Act
        animale.setEta(expectedEta);
        int actualEta = animale.getEta();

        // Assert
        assertEquals(expectedEta, actualEta);
    }

    @Test
    @DisplayName("Should get and set eta with zero value")
    void testSetAndGetEtaWithZeroValue() {
        // Arrange
        animaleBean animale = new animaleBean();
        int expectedEta = 0;

        // Act
        animale.setEta(expectedEta);
        int actualEta = animale.getEta();

        // Assert
        assertEquals(expectedEta, actualEta);
    }

    @Test
    @DisplayName("Should get and set eta with maximum integer value")
    void testSetAndGetEtaWithMaxValue() {
        // Arrange
        animaleBean animale = new animaleBean();
        int expectedEta = Integer.MAX_VALUE;

        // Act
        animale.setEta(expectedEta);
        int actualEta = animale.getEta();

        // Assert
        assertEquals(expectedEta, actualEta);
    }

    @Test
    @DisplayName("Should handle setting negative eta value")
    void testSetEtaWithNegativeValue() {
        // Arrange
        animaleBean animale = new animaleBean();
        int negativeEta = -5;

        // Act
        animale.setEta(negativeEta);
        int actualEta = animale.getEta();

        // Assert
        assertEquals(negativeEta, actualEta);
    }

    // Peso getter/setter tests
    @Test
    @DisplayName("Should get and set peso with positive value")
    void testSetAndGetPesoWithPositiveValue() {
        // Arrange
        animaleBean animale = new animaleBean();
        double expectedPeso = 123.45;

        // Act
        animale.setPeso(expectedPeso);
        double actualPeso = animale.getPeso();

        // Assert
        assertEquals(expectedPeso, actualPeso, 0.001);
    }

    @Test
    @DisplayName("Should get and set peso with zero value")
    void testSetAndGetPesoWithZeroValue() {
        // Arrange
        animaleBean animale = new animaleBean();
        double expectedPeso = 0.0;

        // Act
        animale.setPeso(expectedPeso);
        double actualPeso = animale.getPeso();

        // Assert
        assertEquals(expectedPeso, actualPeso, 0.001);
    }

    @Test
    @DisplayName("Should get and set peso with maximum double value")
    void testSetAndGetPesoWithMaxValue() {
        // Arrange
        animaleBean animale = new animaleBean();
        double expectedPeso = Double.MAX_VALUE;

        // Act
        animale.setPeso(expectedPeso);
        double actualPeso = animale.getPeso();

        // Assert
        assertEquals(expectedPeso, actualPeso, 0.001);
    }

    @Test
    @DisplayName("Should handle setting negative peso value")
    void testSetPesoWithNegativeValue() {
        // Arrange
        animaleBean animale = new animaleBean();
        double negativePeso = -50.5;

        // Act
        animale.setPeso(negativePeso);
        double actualPeso = animale.getPeso();

        // Assert
        assertEquals(negativePeso, actualPeso, 0.001);
    }

    @Test
    @DisplayName("Should get and set peso with very small positive value")
    void testSetAndGetPesoWithSmallValue() {
        // Arrange
        animaleBean animale = new animaleBean();
        double expectedPeso = Double.MIN_VALUE;

        // Act
        animale.setPeso(expectedPeso);
        double actualPeso = animale.getPeso();

        // Assert
        assertEquals(expectedPeso, actualPeso, 0.0);
    }

    // Sesso getter/setter tests
    @Test
    @DisplayName("Should get and set sesso with valid string")
    void testSetAndGetSessoWithValidString() {
        // Arrange
        animaleBean animale = new animaleBean();
        String expectedSesso = "Femmina";

        // Act
        animale.setSesso(expectedSesso);
        String actualSesso = animale.getSesso();

        // Assert
        assertEquals(expectedSesso, actualSesso);
    }

    @Test
    @DisplayName("Should get and set sesso with empty string")
    void testSetAndGetSessoWithEmptyString() {
        // Arrange
        animaleBean animale = new animaleBean();
        String expectedSesso = "";

        // Act
        animale.setSesso(expectedSesso);
        String actualSesso = animale.getSesso();

        // Assert
        assertEquals(expectedSesso, actualSesso);
    }

    @Test
    @DisplayName("Should get and set sesso with string containing special characters")
    void testSetAndGetSessoWithSpecialCharacters() {
        // Arrange
        animaleBean animale = new animaleBean();
        String expectedSesso = "M@schio #1";

        // Act
        animale.setSesso(expectedSesso);
        String actualSesso = animale.getSesso();

        // Assert
        assertEquals(expectedSesso, actualSesso);
    }

    @Test
    @DisplayName("Should handle setting null sesso")
    void testSetSessoWithNullValue() {
        // Arrange
        animaleBean animale = new animaleBean();

        // Act
        animale.setSesso(null);
        String actualSesso = animale.getSesso();

        // Assert
        assertNull(actualSesso);
    }

    @Test
    @DisplayName("Should get and set sesso with very long string")
    void testSetAndGetSessoWithLongString() {
        // Arrange
        animaleBean animale = new animaleBean();
        String expectedSesso = "Maschio".repeat(100);

        // Act
        animale.setSesso(expectedSesso);
        String actualSesso = animale.getSesso();

        // Assert
        assertEquals(expectedSesso, actualSesso);
    }

    // Behavior consistency tests
    @Test
    @DisplayName("Should maintain consistency when setting multiple fields")
    void testMultipleFieldsConsistency() {
        // Arrange
        animaleBean animale = new animaleBean();
        int expectedId1 = 999;
        String expectedContinente = "Oceania";
        int expectedEta = 15;
        double expectedPeso = 200.75;
        String expectedSesso = "Maschio";

        // Act
        animale.setId1(expectedId1);
        animale.setContinente(expectedContinente);
        animale.setEta(expectedEta);
        animale.setPeso(expectedPeso);
        animale.setSesso(expectedSesso);

        // Assert
        assertEquals(expectedId1, animale.getId1());
        assertEquals(expectedContinente, animale.getContinente());
        assertEquals(expectedEta, animale.getEta());
        assertEquals(expectedPeso, animale.getPeso(), 0.001);
        assertEquals(expectedSesso, animale.getSesso());
    }

    @Test
    @DisplayName("Should override getId method and return parent class getId")
    void testGetIdOverride() {
        // Arrange
        animaleBean animale = new animaleBean();

        // Act & Assert
        assertEquals(animale.getId(), ((ProdottoBean) animale).getId());
    }

    @Test
    @DisplayName("Should handle extreme values without throwing exceptions")
    void testExtremeValues() {
        // Arrange
        animaleBean animale = new animaleBean();

        // Act & Assert - should not throw exceptions
        assertDoesNotThrow(() -> {
            animale.setId1(Integer.MIN_VALUE);
            animale.setContinente("€¥£¢∞§¶");
            animale.setEta(Integer.MIN_VALUE);
            animale.setPeso(Double.NEGATIVE_INFINITY);
            animale.setSesso("\n\t\r");
        });

        // Verify values are set
        assertEquals(Integer.MIN_VALUE, animale.getId1());
        assertEquals("€¥£¢∞§¶", animale.getContinente());
        assertEquals(Integer.MIN_VALUE, animale.getEta());
        assertEquals(Double.NEGATIVE_INFINITY, animale.getPeso());
        assertEquals("\n\t\r", animale.getSesso());
    }

    @Test
    @DisplayName("Should handle Unicode characters in string fields")
    void testUnicodeCharacters() {
        // Arrange
        animaleBean animale = new animaleBean();
        String unicodeContinente = "アジア"; // Asia in Japanese
        String unicodeSesso = "♂️"; // Male symbol

        // Act
        animale.setContinente(unicodeContinente);
        animale.setSesso(unicodeSesso);

        // Assert
        assertEquals(unicodeContinente, animale.getContinente());
        assertEquals(unicodeSesso, animale.getSesso());
    }
}

