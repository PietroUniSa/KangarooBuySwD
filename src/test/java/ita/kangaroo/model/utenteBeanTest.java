package ita.kangaroo.model;

import ita.kangaroo.model.utenteBean;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class utenteBeanTest {

    @Test
    void constructorShouldHandleNullAndEmptyValues() {
        utenteBean user = new utenteBean(null, null, null, null, null, null, null, null, null, null, null);

        assertNull(user.getNome());
        assertNull(user.getCognome());
        assertNull(user.getEmail());
        assertNull(user.getPassword());
        assertNull(user.getUsername());
        assertNull(user.getTipo());
        assertNull(user.getVia());
        assertNull(user.getCitta());
        assertNull(user.getProvincia());
        assertNull(user.getTelefono());
        assertNull(user.getCap());
    }

    @Test
    void passwordHashingShouldHandleEmptyAndWhitespaceStrings() {
        utenteBean user = new utenteBean();

        user.setPassword("");
        assertEquals("da39a3ee5e6b4b0d3255bfef95601890afd80709", user.getPassword());

        user.setPassword("   ");
        assertNotEquals("   ", user.getPassword());
        assertEquals(40, user.getPassword().length());
    }

    @Test
    void passwordHashingShouldThrowExceptionForNullInput() {
        utenteBean user = new utenteBean();
        assertThrows(NullPointerException.class, () -> user.setPassword(null));
    }

    @Test
    void gettersAndSettersShouldHandleSpecialCharacters() {
        utenteBean user = new utenteBean();

        user.setNome("Mario@#");
        assertEquals("Mario@#", user.getNome());

        user.setCognome("Rossi$%");
        assertEquals("Rossi$%", user.getCognome());

        user.setEmail("mario.rossi+test@example.com");
        assertEquals("mario.rossi+test@example.com", user.getEmail());

        user.setUsername("user_123");
        assertEquals("user_123", user.getUsername());

        user.setVia("Via Roma, 1");
        assertEquals("Via Roma, 1", user.getVia());

        user.setCitta("Napoli!");
        assertEquals("Napoli!", user.getCitta());

        user.setProvincia("NA?");
        assertEquals("NA?", user.getProvincia());

        user.setTelefono("+39 123 456 7890");
        assertEquals("+39 123 456 7890", user.getTelefono());

        user.setCap("80100-123");
        assertEquals("80100-123", user.getCap());
    }

    @Test
    void passwordHashingShouldBeConsistentAcrossInstances() {
        utenteBean user1 = new utenteBean();
        utenteBean user2 = new utenteBean();

        user1.setPassword("password123");
        user2.setPassword("password123");

        assertEquals(user1.getPassword(), user2.getPassword());
    }
}
