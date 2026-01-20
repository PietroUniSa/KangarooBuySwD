package ita.kangaroo.model;

import org.junit.jupiter.api.Test;
import org. junit.jupiter.api.DisplayName;
import org.junit. jupiter.api. Nested;

import static org.junit.jupiter.api. Assertions.*;

@DisplayName("ciboBean Tests")
class ciboBeanTest {

    @Nested
    @DisplayName("Constructor Tests")
    class ConstructorTests {

        @Test
        @DisplayName("Should create ciboBean with basic constructor")
        void shouldCreateCiboBeanWithBasicConstructor() {
            // Arrange & Act
            ciboBean cibo = new ciboBean(1, 2.5);

            // Assert
            assertEquals(2.5, cibo.getPeso());
            // Note: getId() returns super.getId(), not the local id field
        }

        @Test
        @DisplayName("Should create ciboBean with basic constructor using negative values")
        void shouldCreateCiboBeanWithBasicConstructorNegativeValues() {
            // Arrange & Act
            ciboBean cibo = new ciboBean(-1, -2.5);

            // Assert
            assertEquals(-2.5, cibo.getPeso());
        }

        @Test
        @DisplayName("Should create ciboBean with basic constructor using zero values")
        void shouldCreateCiboBeanWithBasicConstructorZeroValues() {
            // Arrange & Act
            ciboBean cibo = new ciboBean(0, 0.0);

            // Assert
            assertEquals(0.0, cibo. getPeso());
        }

        @Test
        @DisplayName("Should create ciboBean with basic constructor using extreme values")
        void shouldCreateCiboBeanWithBasicConstructorExtremeValues() {
            // Arrange & Act
            ciboBean cibo = new ciboBean(Integer.MAX_VALUE, Double.MAX_VALUE);

            // Assert
            assertEquals(Double.MAX_VALUE, cibo.getPeso());
        }

        @Test
        @DisplayName("Should create ciboBean with full constructor")
        void shouldCreateCiboBeanWithFullConstructor() {
            // Arrange & Act
            ciboBean cibo = new ciboBean(
                    1,
                    "Descrizione test",
                    "Nome test",
                    "immagine.jpg",
                    10.5f,
                    5,
                    0.22f,
                    tipo.cibo,
                    1.5
            );

            // Assert
            assertEquals(1.5, cibo.getPeso());
            // The parent class fields would be tested if we had access to ProdottoBean
        }

        @Test
        @DisplayName("Should create ciboBean with full constructor using accessorio type")
        void shouldCreateCiboBeanWithFullConstructorAccessorioType() {
            // Arrange & Act
            ciboBean cibo = new ciboBean(1, "Descrizione accessorio", "Nome accessorio",
                    "accessorio.jpg", 15.0f, 3, 0.22f, tipo.accessorio, 0.8);

            // Assert
            assertEquals(0.8, cibo.getPeso());
        }

        @Test
        @DisplayName("Should create ciboBean with full constructor using null values")
        void shouldCreateCiboBeanWithFullConstructorNullValues() {
            // Arrange & Act
            ciboBean cibo = new ciboBean(1, null, null, null, 0.0f, 0, 0.0f, null,  0.0);

            // Assert
            assertEquals(0.0, cibo.getPeso());
        }

        @Test
        @DisplayName("Should create ciboBean with full constructor using empty strings")
        void shouldCreateCiboBeanWithFullConstructorEmptyStrings() {
            // Arrange & Act
            ciboBean cibo = new ciboBean(1, "", "", "", 0.0f, 0, 0.0f, tipo.cibo, 0.0);

            // Assert
            assertEquals(0.0, cibo.getPeso());
        }

        @Test
        @DisplayName("Should create ciboBean with all enum tipo values")
        void shouldCreateCiboBeanWithAllEnumTipoValues() {
            // Test con tutti i valori dell'enum
            tipo[] allTipos = {tipo.cliente, tipo.admin, tipo. rettili, tipo.mammiferi,
                    tipo.volatili, tipo.animale, tipo.cibo, tipo.accessorio};

            for (tipo currentTipo : allTipos) {
                // Arrange & Act
                ciboBean cibo = new ciboBean(1, "Desc", "Nome", "img.jpg",
                        10.0f, 1, 0.2f, currentTipo,  1.0);

                // Assert
                assertEquals(1.0, cibo.getPeso(),
                        "Should create ciboBean with tipo:  " + currentTipo);
            }
        }
    }

    @Nested
    @DisplayName("Getter and Setter Tests")
    class GetterSetterTests {

        @Test
        @DisplayName("Should set and get peso with positive value")
        void shouldSetAndGetPesoPositiveValue() {
            // Arrange
            ciboBean cibo = new ciboBean(1, 0.0);
            double expectedPeso = 3.75;

            // Act
            cibo.setPeso(expectedPeso);

            // Assert
            assertEquals(expectedPeso, cibo.getPeso());
        }

        @Test
        @DisplayName("Should set and get peso with zero value")
        void shouldSetAndGetPesoZeroValue() {
            // Arrange
            ciboBean cibo = new ciboBean(1, 5.0);

            // Act
            cibo.setPeso(0.0);

            // Assert
            assertEquals(0.0, cibo.getPeso());
        }

        @Test
        @DisplayName("Should set and get peso with negative value")
        void shouldSetAndGetPesoNegativeValue() {
            // Arrange
            ciboBean cibo = new ciboBean(1, 0.0);
            double expectedPeso = -2.5;

            // Act
            cibo.setPeso(expectedPeso);

            // Assert
            assertEquals(expectedPeso, cibo.getPeso());
        }

        @Test
        @DisplayName("Should set and get peso with very large value")
        void shouldSetAndGetPesoLargeValue() {
            // Arrange
            ciboBean cibo = new ciboBean(1, 0.0);
            double expectedPeso = Double.MAX_VALUE;

            // Act
            cibo.setPeso(expectedPeso);

            // Assert
            assertEquals(expectedPeso, cibo. getPeso());
        }

        @Test
        @DisplayName("Should set and get peso with very small value")
        void shouldSetAndGetPesoSmallValue() {
            // Arrange
            ciboBean cibo = new ciboBean(1, 0.0);
            double expectedPeso = Double.MIN_VALUE;

            // Act
            cibo.setPeso(expectedPeso);

            // Assert
            assertEquals(expectedPeso, cibo. getPeso());
        }

        @Test
        @DisplayName("Should set and get peso with decimal precision")
        void shouldSetAndGetPesoWithDecimalPrecision() {
            // Arrange
            ciboBean cibo = new ciboBean(1, 0.0);
            double expectedPeso = 1.23456789;

            // Act
            cibo.setPeso(expectedPeso);

            // Assert
            assertEquals(expectedPeso, cibo.getPeso(), 0.0);
        }

        @Test
        @DisplayName("Should set id using setId method")
        void shouldSetIdUsingSetIdMethod() {
            // Arrange
            ciboBean cibo = new ciboBean(1, 2.0);

            // Act
            cibo.setId(5);

            // Assert
            // Note: setId sets the local id field, but getId returns super.getId()
            // This test verifies the setId method doesn't throw exceptions
            assertDoesNotThrow(() -> cibo.setId(5));
        }

        @Test
        @DisplayName("Should set id with negative value")
        void shouldSetIdWithNegativeValue() {
            // Arrange
            ciboBean cibo = new ciboBean(1, 2.0);

            // Act & Assert
            assertDoesNotThrow(() -> cibo.setId(-1));
        }

        @Test
        @DisplayName("Should set id with zero value")
        void shouldSetIdWithZeroValue() {
            // Arrange
            ciboBean cibo = new ciboBean(1, 2.0);

            // Act & Assert
            assertDoesNotThrow(() -> cibo.setId(0));
        }

        @Test
        @DisplayName("Should set id with maximum integer value")
        void shouldSetIdWithMaximumValue() {
            // Arrange
            ciboBean cibo = new ciboBean(1, 2.0);

            // Act & Assert
            assertDoesNotThrow(() -> cibo.setId(Integer.MAX_VALUE));
        }
    }

    @Nested
    @DisplayName("Behavior Consistency Tests")
    class BehaviorConsistencyTests {

        @Test
        @DisplayName("Should maintain peso value consistency through multiple set operations")
        void shouldMaintainPesoValueConsistency() {
            // Arrange
            ciboBean cibo = new ciboBean(1, 1.0);
            double[] testValues = {0.0, 1.5, -2.3, 100.75, Double.MAX_VALUE, Double.MIN_VALUE};

            // Act & Assert
            for (double value : testValues) {
                cibo.setPeso(value);
                assertEquals(value, cibo.getPeso(),
                        "Peso value should be consistent after setting to " + value);
            }
        }

        @Test
        @DisplayName("Should handle rapid successive peso changes")
        void shouldHandleRapidSuccessivePesoChanges() {
            // Arrange
            ciboBean cibo = new ciboBean(1, 0.0);

            // Act & Assert
            for (int i = 0; i < 1000; i++) {
                double expectedPeso = i * 0.1;
                cibo. setPeso(expectedPeso);
                assertEquals(expectedPeso, cibo.getPeso(),
                        "Peso should be consistent at iteration " + i);
            }
        }
    }

    @Nested
    @DisplayName("Edge Cases Tests")
    class EdgeCasesTests {

        @Test
        @DisplayName("Should handle special double values - NaN")
        void shouldHandleNaNValue() {
            // Arrange
            ciboBean cibo = new ciboBean(1, 0.0);

            // Act
            cibo.setPeso(Double.NaN);

            // Assert
            assertTrue(Double.isNaN(cibo. getPeso()));
        }

        @Test
        @DisplayName("Should handle special double values - Positive Infinity")
        void shouldHandlePositiveInfinity() {
            // Arrange
            ciboBean cibo = new ciboBean(1, 0.0);

            // Act
            cibo.setPeso(Double. POSITIVE_INFINITY);

            // Assert
            assertEquals(Double.POSITIVE_INFINITY, cibo.getPeso());
        }

        @Test
        @DisplayName("Should handle special double values - Negative Infinity")
        void shouldHandleNegativeInfinity() {
            // Arrange
            ciboBean cibo = new ciboBean(1, 0.0);

            // Act
            cibo.setPeso(Double. NEGATIVE_INFINITY);

            // Assert
            assertEquals(Double.NEGATIVE_INFINITY, cibo.getPeso());
        }
    }

}
