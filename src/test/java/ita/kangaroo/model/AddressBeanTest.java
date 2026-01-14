package ita.kangaroo.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.EmptySource;

import static org.junit.jupiter.api.Assertions.*;

class AddressBeanTest {

    private AddressBean address;

    @BeforeEach
    void setUp() {
        address = new AddressBean();
    }

    @Test
    @DisplayName("Default constructor should initialize fields with default values")
    void defaultConstructorShouldInitializeFieldsWithDefaultValues() {
        // Arrange & Act
        AddressBean address = new AddressBean();

        // Assert
        assertAll("default constructor values",
            () -> assertEquals(0, address.getId()),
            () -> assertEquals("", address.getVia()),
            () -> assertEquals("", address.getCitta()),
            () -> assertEquals("", address.getCAP()),
            () -> assertEquals("", address.getUsername())
        );
    }

    @Test
    @DisplayName("Parameterized constructor should initialize all fields correctly")
    void parameterizedConstructorShouldInitializeAllFieldsCorrectly() {
        // Arrange
        int id = 1;
        String via = "Via Roma 123";
        String citta = "Milano";
        String cap = "20100";
        String username = "testuser";

        // Act
        AddressBean address = new AddressBean(id, via, citta, cap, username);

        // Assert
        assertAll("parameterized constructor values",
            () -> assertEquals(id, address.getId()),
            () -> assertEquals(via, address.getVia()),
            () -> assertEquals(citta, address.getCitta()),
            () -> assertEquals(cap, address.getCAP()),
            () -> assertEquals(username, address.getUsername())
        );
    }

    @Test
    @DisplayName("Parameterized constructor with empty strings should work correctly")
    void parameterizedConstructorWithEmptyStringsShouldWorkCorrectly() {
        // Arrange & Act
        AddressBean address = new AddressBean(0, "", "", "", "");

        // Assert
        assertAll("constructor with empty strings",
            () -> assertEquals(0, address.getId()),
            () -> assertEquals("", address.getVia()),
            () -> assertEquals("", address.getCitta()),
            () -> assertEquals("", address.getCAP()),
            () -> assertEquals("", address.getUsername())
        );
    }

    @Test
    @DisplayName("getId should return correct value")
    void getIdShouldReturnCorrectValue() {
        // Arrange
        address.setId(42);

        // Act & Assert
        assertEquals(42, address.getId());
    }

    @ParameterizedTest
    @DisplayName("setId and getId should work with positive values")
    @ValueSource(ints = {0, 1, 100, 999, Integer.MAX_VALUE})
    void setIdAndGetIdShouldWorkWithPositiveValues(int id) {
        // Act
        address.setId(id);

        // Assert
        assertEquals(id, address.getId());
    }

    @Test
    @DisplayName("getVia should return correct value")
    void getViaShouldReturnCorrectValue() {
        // Arrange
        String via = "Via Garibaldi 456";
        address.setVia(via);

        // Act & Assert
        assertEquals(via, address.getVia());
    }

    @Test
    @DisplayName("setVia and getVia should work with normal strings")
    void setViaAndGetViaShouldWorkWithNormalStrings() {
        // Arrange
        String expectedVia = "Corso Buenos Aires 10";

        // Act
        address.setVia(expectedVia);

        // Assert
        assertEquals(expectedVia, address.getVia());
    }

    @ParameterizedTest
    @DisplayName("setVia and getVia should work with empty strings")
    @EmptySource
    void setViaAndGetViaShouldWorkWithEmptyStrings(String emptyValue) {
        // Act
        address.setVia(emptyValue);

        // Assert
        assertEquals("", address.getVia());
    }

    @Test
    @DisplayName("setVia and getVia should work with special characters")
    void setViaAndGetViaShouldWorkWithSpecialCharacters() {
        // Arrange
        String specialVia = "Via Dell'Università 123/A àèìòù @#$%^&*()";

        // Act
        address.setVia(specialVia);

        // Assert
        assertEquals(specialVia, address.getVia());
    }

    @Test
    @DisplayName("getCitta should return correct value")
    void getCittaShouldReturnCorrectValue() {
        // Arrange
        String citta = "Roma";
        address.setCitta(citta);

        // Act & Assert
        assertEquals(citta, address.getCitta());
    }

    @Test
    @DisplayName("setCitta and getCitta should work with normal strings")
    void setCittaAndGetCittaShouldWorkWithNormalStrings() {
        // Arrange
        String expectedCitta = "Napoli";

        // Act
        address.setCitta(expectedCitta);

        // Assert
        assertEquals(expectedCitta, address.getCitta());
    }

    @ParameterizedTest
    @DisplayName("setCitta and getCitta should work with empty strings")
    @EmptySource
    void setCittaAndGetCittaShouldWorkWithEmptyStrings(String emptyValue) {
        // Act
        address.setCitta(emptyValue);

        // Assert
        assertEquals("", address.getCitta());
    }

    @Test
    @DisplayName("setCitta and getCitta should work with special characters")
    void setCittaAndGetCittaShouldWorkWithSpecialCharacters() {
        // Arrange
        String specialCitta = "L'Aquila àèìòù @#$%^&*()";

        // Act
        address.setCitta(specialCitta);

        // Assert
        assertEquals(specialCitta, address.getCitta());
    }

    @Test
    @DisplayName("getCAP should return correct value")
    void getCAPShouldReturnCorrectValue() {
        // Arrange
        String cap = "12345";
        address.setCAP(cap);

        // Act & Assert
        assertEquals(cap, address.getCAP());
    }

    @Test
    @DisplayName("setCAP and getCAP should work with valid 5-digit CAP")
    void setCAPAndGetCAPShouldWorkWithValid5DigitCAP() {
        // Arrange
        String expectedCAP = "00100";

        // Act
        address.setCAP(expectedCAP);

        // Assert
        assertEquals(expectedCAP, address.getCAP());
    }

    @ParameterizedTest
    @DisplayName("setCAP and getCAP should work with valid CAP values")
    @ValueSource(strings = {"12345", "00000", "99999", "20100", "80100"})
    void setCAPAndGetCAPShouldWorkWithValidCAPValues(String cap) {
        // Act
        address.setCAP(cap);

        // Assert
        assertEquals(cap, address.getCAP());
    }

    @ParameterizedTest
    @DisplayName("setCAP and getCAP should work with empty string")
    @EmptySource
    void setCAPAndGetCAPShouldWorkWithEmptyString(String emptyValue) {
        // Act
        address.setCAP(emptyValue);

        // Assert
        assertEquals("", address.getCAP());
    }

    @Test
    @DisplayName("getUsername should return correct value")
    void getUsernameShouldReturnCorrectValue() {
        // Arrange
        String username = "user123";
        address.setUsername(username);

        // Act & Assert
        assertEquals(username, address.getUsername());
    }

    @Test
    @DisplayName("setUsername and getUsername should work with normal strings")
    void setUsernameAndGetUsernameShouldWorkWithNormalStrings() {
        // Arrange
        String expectedUsername = "testuser456";

        // Act
        address.setUsername(expectedUsername);

        // Assert
        assertEquals(expectedUsername, address.getUsername());
    }

    @ParameterizedTest
    @DisplayName("setUsername and getUsername should work with empty strings")
    @EmptySource
    void setUsernameAndGetUsernameShouldWorkWithEmptyStrings(String emptyValue) {
        // Act
        address.setUsername(emptyValue);

        // Assert
        assertEquals("", address.getUsername());
    }

    @Test
    @DisplayName("setUsername and getUsername should work with special characters")
    void setUsernameAndGetUsernameShouldWorkWithSpecialCharacters() {
        // Arrange
        String specialUsername = "user@domain.com_123 àèìòù";

        // Act
        address.setUsername(specialUsername);

        // Assert
        assertEquals(specialUsername, address.getUsername());
    }

    @Test
    @DisplayName("isValidCAP should return true for empty string")
    void isValidCAPShouldReturnTrueForEmptyString() {
        // Act & Assert
        assertTrue(AddressBean.isValidCAP(""));
    }

    @ParameterizedTest
    @DisplayName("isValidCAP should return true for valid 5-digit CAPs")
    @ValueSource(strings = {"12345", "00000", "99999", "20100", "80100"})
    void isValidCAPShouldReturnTrueForValid5DigitCAPs(String cap) {
        // Act & Assert
        assertTrue(AddressBean.isValidCAP(cap));
    }

    @ParameterizedTest
    @DisplayName("isValidCAP should return false for invalid CAPs")
    @ValueSource(strings = {"1234", "123456", "1234a", "abcde", "12 34", "12-34", "12.34"})
    void isValidCAPShouldReturnFalseForInvalidCAPs(String cap) {
        // Act & Assert
        assertFalse(AddressBean.isValidCAP(cap));
    }

    @Test
    @DisplayName("isValidCAP should return false for CAP with spaces")
    void isValidCAPShouldReturnFalseForCAPWithSpaces() {
        // Act & Assert
        assertFalse(AddressBean.isValidCAP(" 1234"));
        assertFalse(AddressBean.isValidCAP("1234 "));
        assertFalse(AddressBean.isValidCAP("12 34"));
    }

    @Test
    @DisplayName("equals should return true for same object")
    void equalsShouldReturnTrueForSameObject() {
        // Act & Assert
        assertEquals(address, address);
    }

    @Test
    @DisplayName("equals should return false for null object")
    void equalsShouldReturnFalseForNullObject() {
        // Act & Assert
        assertNotEquals(address, null);
    }

    @Test
    @DisplayName("equals should return false for different class object")
    void equalsShouldReturnFalseForDifferentClassObject() {
        // Act & Assert
        assertNotEquals(address, "not an address");
        assertNotEquals(address, Integer.valueOf(123));
    }

    @Test
    @DisplayName("equals should return true for objects with same id and username")
    void equalsShouldReturnTrueForObjectsWithSameIdAndUsername() {
        // Arrange
        AddressBean address1 = new AddressBean(1, "Via Roma", "Milano", "20100", "user123");
        AddressBean address2 = new AddressBean(1, "Via Venezia", "Roma", "00100", "user123");

        // Act & Assert
        assertEquals(address1, address2);
    }

    @Test
    @DisplayName("equals should return false for objects with different id")
    void equalsShouldReturnFalseForObjectsWithDifferentId() {
        // Arrange
        AddressBean address1 = new AddressBean(1, "Via Roma", "Milano", "20100", "user123");
        AddressBean address2 = new AddressBean(2, "Via Roma", "Milano", "20100", "user123");

        // Act & Assert
        assertNotEquals(address1, address2);
    }

    @Test
    @DisplayName("equals should return false for objects with different username")
    void equalsShouldReturnFalseForObjectsWithDifferentUsername() {
        // Arrange
        AddressBean address1 = new AddressBean(1, "Via Roma", "Milano", "20100", "user123");
        AddressBean address2 = new AddressBean(1, "Via Roma", "Milano", "20100", "user456");

        // Act & Assert
        assertNotEquals(address1, address2);
    }

    @Test
    @DisplayName("equals should return false for objects with different id and username")
    void equalsShouldReturnFalseForObjectsWithDifferentIdAndUsername() {
        // Arrange
        AddressBean address1 = new AddressBean(1, "Via Roma", "Milano", "20100", "user123");
        AddressBean address2 = new AddressBean(2, "Via Venezia", "Roma", "00100", "user456");

        // Act & Assert
        assertNotEquals(address1, address2);
    }

    @Test
    @DisplayName("Behavior consistency - multiple set and get operations should work correctly")
    void behaviorConsistencyMultipleSetAndGetOperationsShouldWorkCorrectly() {
        // First set of values
        address.setId(10);
        address.setVia("Via Prima");
        address.setCitta("Milano");
        address.setCAP("20100");
        address.setUsername("user1");

        assertEquals(10, address.getId());
        assertEquals("Via Prima", address.getVia());
        assertEquals("Milano", address.getCitta());
        assertEquals("20100", address.getCAP());
        assertEquals("user1", address.getUsername());

        // Second set of values
        address.setId(20);
        address.setVia("Via Seconda");
        address.setCitta("Roma");
        address.setCAP("00100");
        address.setUsername("user2");

        assertEquals(20, address.getId());
        assertEquals("Via Seconda", address.getVia());
        assertEquals("Roma", address.getCitta());
        assertEquals("00100", address.getCAP());
        assertEquals("user2", address.getUsername());
    }

    @Test
    @DisplayName("All getters should return expected values after setting")
    void allGettersShouldReturnExpectedValuesAfterSetting() {
        // Arrange
        int expectedId = 42;
        String expectedVia = "Corso Europa 100";
        String expectedCitta = "Torino";
        String expectedCAP = "10100";
        String expectedUsername = "testuser";

        // Act
        address.setId(expectedId);
        address.setVia(expectedVia);
        address.setCitta(expectedCitta);
        address.setCAP(expectedCAP);
        address.setUsername(expectedUsername);

        // Assert
        assertAll("all getters consistency",
            () -> assertEquals(expectedId, address.getId()),
            () -> assertEquals(expectedVia, address.getVia()),
            () -> assertEquals(expectedCitta, address.getCitta()),
            () -> assertEquals(expectedCAP, address.getCAP()),
            () -> assertEquals(expectedUsername, address.getUsername())
        );
    }

    @Test
    @DisplayName("Edge case - whitespace strings should be preserved")
    void edgeCaseWhitespaceStringsShouldBePreserved() {
        // Arrange
        String whitespaceVia = "   ";
        String whitespaceCitta = "\t\n\r ";
        String whitespaceUsername = "  user  ";

        // Act
        address.setVia(whitespaceVia);
        address.setCitta(whitespaceCitta);
        address.setUsername(whitespaceUsername);

        // Assert
        assertAll("whitespace strings preservation",
            () -> assertEquals(whitespaceVia, address.getVia()),
            () -> assertEquals(whitespaceCitta, address.getCitta()),
            () -> assertEquals(whitespaceUsername, address.getUsername())
        );
    }

    @Test
    @DisplayName("Edge case - very long strings should be handled")
    void edgeCaseVeryLongStringsShouldBeHandled() {
        // Arrange
        String longString = "a".repeat(10000);

        // Act
        address.setVia(longString);
        address.setCitta(longString);
        address.setUsername(longString);

        // Assert
        assertAll("very long strings handling",
            () -> assertEquals(longString, address.getVia()),
            () -> assertEquals(longString, address.getCitta()),
            () -> assertEquals(longString, address.getUsername())
        );
    }

    @Test
    @DisplayName("isValidCAP edge cases - boundary values")
    void isValidCAPEdgeCasesBoundaryValues() {
        // Act & Assert
        assertAll("CAP boundary cases",
            () -> assertTrue(AddressBean.isValidCAP("00000")),
            () -> assertTrue(AddressBean.isValidCAP("99999")),
            () -> assertFalse(AddressBean.isValidCAP("0000")),
            () -> assertFalse(AddressBean.isValidCAP("000000"))
        );
    }
}

