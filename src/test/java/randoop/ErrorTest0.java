package randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test1");
        ita.kangaroo.model.MetodoPagamentoBean metodoPagamentoBean0 = new ita.kangaroo.model.MetodoPagamentoBean();
        metodoPagamentoBean0.setId((int) 'a');
        ita.kangaroo.model.AddressBean addressBean3 = new ita.kangaroo.model.AddressBean();
        java.lang.String str4 = addressBean3.getVia();
        addressBean3.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        addressBean3.setCitta("hi!");
        boolean boolean9 = metodoPagamentoBean0.equals((java.lang.Object) addressBean3);
        java.lang.String str10 = metodoPagamentoBean0.getNumero_carta();
        int int11 = metodoPagamentoBean0.getId();
        ita.kangaroo.model.AddressBean addressBean12 = new ita.kangaroo.model.AddressBean();
        java.lang.String str13 = addressBean12.getVia();
        java.lang.String str14 = addressBean12.getUsername();
        java.lang.String str15 = addressBean12.getCAP();
        boolean boolean16 = metodoPagamentoBean0.equals((java.lang.Object) str15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on addressBean3 and addressBean12", addressBean3.equals(addressBean12) ? addressBean3.hashCode() == addressBean12.hashCode() : true);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        ita.kangaroo.model.MetodoPagamentoBean metodoPagamentoBean0 = new ita.kangaroo.model.MetodoPagamentoBean();
        metodoPagamentoBean0.setId((int) 'a');
        ita.kangaroo.model.AddressBean addressBean3 = new ita.kangaroo.model.AddressBean();
        java.lang.String str4 = addressBean3.getVia();
        addressBean3.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        addressBean3.setCitta("hi!");
        boolean boolean9 = metodoPagamentoBean0.equals((java.lang.Object) addressBean3);
        java.lang.String str10 = metodoPagamentoBean0.getNumero_carta();
        int int11 = metodoPagamentoBean0.getId();
        ita.kangaroo.model.OrderProductBean orderProductBean12 = new ita.kangaroo.model.OrderProductBean();
        float float13 = orderProductBean12.getIVA();
        int int14 = orderProductBean12.getId_ordine();
        orderProductBean12.setQuantita((int) 'a');
        int int17 = orderProductBean12.getId_ordine();
        boolean boolean18 = metodoPagamentoBean0.equals((java.lang.Object) orderProductBean12);
        metodoPagamentoBean0.setNumero_carta("hi!");
        metodoPagamentoBean0.setUsername("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        metodoPagamentoBean0.setUsername("Data non disponibile");
        java.lang.String str25 = metodoPagamentoBean0.getCircuito();
        metodoPagamentoBean0.setCvv("Data non disponibile");
        metodoPagamentoBean0.setId((int) (short) 0);
        int int30 = metodoPagamentoBean0.getId();
        ita.kangaroo.model.AddressBean addressBean36 = new ita.kangaroo.model.AddressBean((int) (byte) 0, "Data non disponibile", "", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "");
        boolean boolean37 = metodoPagamentoBean0.equals((java.lang.Object) "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on addressBean3 and addressBean36", addressBean3.equals(addressBean36) ? addressBean3.hashCode() == addressBean36.hashCode() : true);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        ita.kangaroo.model.AddressBean addressBean0 = new ita.kangaroo.model.AddressBean();
        java.lang.String str1 = addressBean0.getVia();
        java.lang.String str2 = addressBean0.getUsername();
        java.lang.String str3 = addressBean0.getCAP();
        ita.kangaroo.model.MetodoPagamentoBean metodoPagamentoBean4 = new ita.kangaroo.model.MetodoPagamentoBean();
        metodoPagamentoBean4.setId((int) 'a');
        ita.kangaroo.model.AddressBean addressBean7 = new ita.kangaroo.model.AddressBean();
        java.lang.String str8 = addressBean7.getVia();
        addressBean7.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        addressBean7.setCitta("hi!");
        boolean boolean13 = metodoPagamentoBean4.equals((java.lang.Object) addressBean7);
        java.lang.String str14 = metodoPagamentoBean4.getNumero_carta();
        int int15 = metodoPagamentoBean4.getId();
        ita.kangaroo.model.OrderProductBean orderProductBean16 = new ita.kangaroo.model.OrderProductBean();
        float float17 = orderProductBean16.getIVA();
        int int18 = orderProductBean16.getId_ordine();
        orderProductBean16.setQuantita((int) 'a');
        int int21 = orderProductBean16.getId_ordine();
        boolean boolean22 = metodoPagamentoBean4.equals((java.lang.Object) orderProductBean16);
        metodoPagamentoBean4.setNumero_carta("hi!");
        metodoPagamentoBean4.setUsername("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        metodoPagamentoBean4.setUsername("Data non disponibile");
        java.lang.String str29 = metodoPagamentoBean4.getCircuito();
        metodoPagamentoBean4.setCvv("hi!");
        boolean boolean32 = addressBean0.equals((java.lang.Object) "hi!");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on addressBean0 and addressBean7", addressBean0.equals(addressBean7) ? addressBean0.hashCode() == addressBean7.hashCode() : true);
    }
}

