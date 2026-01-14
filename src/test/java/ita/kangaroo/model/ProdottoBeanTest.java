package ita.kangaroo.model;

import ita.kangaroo.model.ProdottoBean;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProdottoBeanTest {

    @Test
    void defaultConstructorShouldInitializeWithDefaultValues() {
        ProdottoBean prodotto = new ProdottoBean();

        assertEquals(0, prodotto.getId());
        assertNull(prodotto.getDescrizione());
        assertNull(prodotto.getNome());
        assertNull(prodotto.getImmagine());
        assertEquals(0.0f, prodotto.getPrezzo());
        assertEquals(0, prodotto.getQuantita());
        assertEquals(0.0f, prodotto.getIva());
        assertNull(prodotto.getTipo());
    }

    @Test
    void idShouldHandleNegativeValues() {
        ProdottoBean prodotto = new ProdottoBean();

        prodotto.setId(-1);
        assertEquals(-1, prodotto.getId());

        prodotto.setId(Integer.MIN_VALUE);
        assertEquals(Integer.MIN_VALUE, prodotto.getId());

        prodotto.setId(Integer.MAX_VALUE);
        assertEquals(Integer.MAX_VALUE, prodotto.getId());
    }

    @Test
    void prezzoShouldHandleNegativeAndSpecialFloatValues() {
        ProdottoBean prodotto = new ProdottoBean();

        prodotto.setPrezzo(-10.5f);
        assertEquals(-10.5f, prodotto.getPrezzo());

        prodotto.setPrezzo(Float.MIN_VALUE);
        assertEquals(Float.MIN_VALUE, prodotto.getPrezzo());

        prodotto.setPrezzo(Float.MAX_VALUE);
        assertEquals(Float.MAX_VALUE, prodotto.getPrezzo());
    }

    @Test
    void quantitaShouldHandleNegativeAndExtremeValues() {
        ProdottoBean prodotto = new ProdottoBean();

        prodotto.setQuantita(-5);
        assertEquals(-5, prodotto.getQuantita());

        prodotto.setQuantita(Integer.MIN_VALUE);
        assertEquals(Integer.MIN_VALUE, prodotto.getQuantita());

        prodotto.setQuantita(Integer.MAX_VALUE);
        assertEquals(Integer.MAX_VALUE, prodotto.getQuantita());
    }

    @Test
    void ivaShouldHandleNegativeAndSpecialFloatValues() {
        ProdottoBean prodotto = new ProdottoBean();

        prodotto.setIva(-10.0f);
        assertEquals(-10.0f, prodotto.getIva());

        prodotto.setIva(100.5f);
        assertEquals(100.5f, prodotto.getIva());

        prodotto.setIva(Float.MIN_VALUE);
        assertEquals(Float.MIN_VALUE, prodotto.getIva());

        prodotto.setIva(Float.MAX_VALUE);
        assertEquals(Float.MAX_VALUE, prodotto.getIva());
    }

    @Test
    void stringFieldsShouldHandleEmptyStrings() {
        ProdottoBean prodotto = new ProdottoBean();

        prodotto.setDescrizione("");
        assertEquals("", prodotto.getDescrizione());

        prodotto.setNome("");
        assertEquals("", prodotto.getNome());

        prodotto.setImmagine("");
        assertEquals("", prodotto.getImmagine());
    }

    @Test
    void toStringShouldHandleNullFields() {
        ProdottoBean prodotto = new ProdottoBean();

        String result = prodotto.toString();
        assertTrue(result.contains("id=0"));
        assertTrue(result.contains("descrizione='null'"));
        assertTrue(result.contains("nome='null'"));
        assertTrue(result.contains("prezzo=0.0"));
        assertTrue(result.contains("quantita=0"));
        assertTrue(result.contains("iva=0.0"));
        assertTrue(result.contains("tipo=null"));
    }

    @Test
    void toStringShouldEscapeSpecialCharacters() {
        ProdottoBean prodotto = new ProdottoBean();
        prodotto.setDescrizione("Descrizione con 'apostrofi'");
        prodotto.setNome("Nome con \"virgolette\"");

        String result = prodotto.toString();
        assertTrue(result.contains("Descrizione con 'apostrofi'"));
        assertTrue(result.contains("Nome con \"virgolette\""));
    }

    @Test
    void constructorShouldHandleExtremeValues() {
        ita.kangaroo.model.tipo firstTipo = ita.kangaroo.model.tipo.values()[0];
        ProdottoBean prodotto = new ProdottoBean(
                Integer.MAX_VALUE,
                "",
                null,
                "very_long_filename_with_special_chars_!@#$%.jpg",
                Float.MAX_VALUE,
                Integer.MIN_VALUE,
                -999.99f,
                firstTipo
        );

        assertEquals(Integer.MAX_VALUE, prodotto.getId());
        assertEquals("", prodotto.getDescrizione());
        assertNull(prodotto.getNome());
        assertEquals("very_long_filename_with_special_chars_!@#$%.jpg", prodotto.getImmagine());
        assertEquals(Float.MAX_VALUE, prodotto.getPrezzo());
        assertEquals(Integer.MIN_VALUE, prodotto.getQuantita());
        assertEquals(-999.99f, prodotto.getIva());
        assertEquals(firstTipo, prodotto.getTipo());
    }
}