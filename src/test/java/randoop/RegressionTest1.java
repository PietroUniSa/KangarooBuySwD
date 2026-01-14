package randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

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
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        ita.kangaroo.model.AddressBean addressBean0 = new ita.kangaroo.model.AddressBean();
        java.lang.String str1 = addressBean0.getVia();
        java.lang.String str2 = addressBean0.getUsername();
        addressBean0.setUsername("hi!");
        ita.kangaroo.model.tipo tipo10 = null;
        ita.kangaroo.model.utenteBean utenteBean16 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo10, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean17 = new ita.kangaroo.model.OrdineBean(utenteBean16);
        java.lang.String str18 = ordineBean17.getMetodo_di_spedizione();
        ita.kangaroo.model.tipo tipo24 = null;
        ita.kangaroo.model.utenteBean utenteBean30 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo24, "hi!", "", "", "hi!", "");
        utenteBean30.setEmail("hi!");
        ordineBean17.setClient(utenteBean30);
        ordineBean17.setNumero_carta("");
        ordineBean17.setMetodo_di_pagamento("hi!");
        java.util.ArrayList<ita.kangaroo.model.OrderProductBean> orderProductBeanList38 = null;
        ordineBean17.setProducts(orderProductBeanList38);
        boolean boolean40 = addressBean0.equals((java.lang.Object) orderProductBeanList38);
        java.lang.String str41 = addressBean0.getCitta();
        java.lang.String str42 = addressBean0.getCitta();
        ita.kangaroo.model.tipo tipo48 = null;
        ita.kangaroo.model.utenteBean utenteBean54 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo48, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean55 = new ita.kangaroo.model.OrdineBean(utenteBean54);
        java.lang.String str56 = ordineBean55.getMetodo_di_spedizione();
        ordineBean55.setNumero_carta("");
        java.sql.Date date59 = ordineBean55.getData();
        ordineBean55.setMetodo_di_pagamento("");
        ordineBean55.setNumero_di_tracking("");
        ordineBean55.setCircuito("hi!");
        int int66 = ordineBean55.getId();
        ita.kangaroo.model.tipo tipo72 = null;
        ita.kangaroo.model.utenteBean utenteBean78 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo72, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean79 = new ita.kangaroo.model.OrdineBean(utenteBean78);
        utenteBean78.setPassword("hi!");
        utenteBean78.setNome("hi!");
        ordineBean55.setClient(utenteBean78);
        boolean boolean85 = addressBean0.equals((java.lang.Object) utenteBean78);
        addressBean0.setUsername("hi!");
        int int88 = addressBean0.getId();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNull(date59);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        ita.kangaroo.model.AddressBean addressBean0 = new ita.kangaroo.model.AddressBean();
        java.lang.String str1 = addressBean0.getVia();
        addressBean0.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        addressBean0.setCitta("hi!");
        addressBean0.setId((int) (byte) 0);
        java.lang.String str8 = addressBean0.getCitta();
        addressBean0.setCitta("hi!");
        java.lang.String str11 = addressBean0.getCAP();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        java.lang.String str12 = utenteBean11.getUsername();
        java.lang.String str13 = utenteBean11.getCap();
        utenteBean11.setUsername("");
        ita.kangaroo.model.OrdineBean ordineBean16 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        ordineBean16.setCircuito("");
        java.sql.Date date19 = ordineBean16.getData();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(date19);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        ita.kangaroo.model.ProdottoBean prodottoBean0 = null;
        ita.kangaroo.model.CartProduct cartProduct2 = new ita.kangaroo.model.CartProduct(prodottoBean0, (int) (byte) 10);
        cartProduct2.setQuantity((int) (short) 100);
        int int5 = cartProduct2.getQuantity();
        ita.kangaroo.model.ProdottoBean prodottoBean6 = cartProduct2.getProduct();
        int int7 = cartProduct2.getQuantity();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNull(prodottoBean6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        ita.kangaroo.model.MetodoPagamentoBean metodoPagamentoBean0 = new ita.kangaroo.model.MetodoPagamentoBean();
        metodoPagamentoBean0.setId((int) 'a');
        ita.kangaroo.model.AddressBean addressBean3 = new ita.kangaroo.model.AddressBean();
        java.lang.String str4 = addressBean3.getVia();
        addressBean3.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        addressBean3.setCitta("hi!");
        boolean boolean9 = metodoPagamentoBean0.equals((java.lang.Object) addressBean3);
        java.lang.String str10 = metodoPagamentoBean0.getNumero_carta();
        java.lang.String str11 = metodoPagamentoBean0.getNumero_carta();
        java.lang.String str12 = metodoPagamentoBean0.getNumero_carta();
        java.lang.String str13 = metodoPagamentoBean0.getNumero_carta();
        int int14 = metodoPagamentoBean0.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "", "", "hi!", "hi!", "hi!");
        java.lang.String str12 = utenteBean11.getPassword();
        utenteBean11.setProvincia("Data non disponibile");
        utenteBean11.setCognome("hi!");
        utenteBean11.setNome("");
        java.lang.String str19 = utenteBean11.getPassword();
        utenteBean11.setEmail("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("da39a3ee5e6b4b0d3255bfef95601890afd80709", "da39a3ee5e6b4b0d3255bfef95601890afd80709", "hi!", "", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", tipo5, "3a987acf8cbc1028b7dbc86bd086831151899a2b", "da39a3ee5e6b4b0d3255bfef95601890afd80709", "Data non disponibile", "Data non disponibile", "Data non disponibile");
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "", "", "hi!", "hi!", "hi!");
        java.lang.String str12 = utenteBean11.getUsername();
        utenteBean11.setPassword("");
        java.lang.String str15 = utenteBean11.getPassword();
        ita.kangaroo.model.tipo tipo16 = utenteBean11.getTipo();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "da39a3ee5e6b4b0d3255bfef95601890afd80709" + "'", str15, "da39a3ee5e6b4b0d3255bfef95601890afd80709");
        org.junit.Assert.assertNull(tipo16);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        ita.kangaroo.model.tipo tipo6 = null;
        ita.kangaroo.model.utenteBean utenteBean12 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo6, "hi!", "", "", "hi!", "");
        utenteBean12.setEmail("hi!");
        java.lang.String str15 = utenteBean12.getCognome();
        java.sql.Date date23 = null;
        ita.kangaroo.model.OrdineBean ordineBean25 = new ita.kangaroo.model.OrdineBean((int) (byte) 10, utenteBean12, (float) (-1L), "Data non disponibile", "Data non disponibile", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "hi!", "hi!", "", date23, "Data non disponibile");
        ita.kangaroo.model.tipo tipo26 = utenteBean12.getTipo();
        utenteBean12.setCitta("");
        java.lang.String str29 = utenteBean12.getNome();
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(tipo26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        ita.kangaroo.model.MetodoPagamentoBean metodoPagamentoBean0 = new ita.kangaroo.model.MetodoPagamentoBean();
        metodoPagamentoBean0.setId((int) 'a');
        metodoPagamentoBean0.setCircuito("");
        metodoPagamentoBean0.setData_scadenza("hi!");
        metodoPagamentoBean0.setId((int) '4');
        java.lang.String str9 = metodoPagamentoBean0.getUsername();
        metodoPagamentoBean0.setData_scadenza("3d1583397bcebff274b1e7cb58087c39153af974");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getImmagine();
        prodottoBean8.setPrezzo((float) (-1L));
        int int12 = prodottoBean8.getId();
        float float13 = prodottoBean8.getIva();
        prodottoBean8.setQuantita((int) ' ');
        float float16 = prodottoBean8.getPrezzo();
        prodottoBean8.setDescrizione("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        java.lang.String str19 = prodottoBean8.getDescrizione();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + (-1.0f) + "'", float16 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}" + "'", str19, "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.utenteBean utenteBean13 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo7, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean14 = new ita.kangaroo.model.OrdineBean(utenteBean13);
        java.lang.String str15 = ordineBean14.getMetodo_di_spedizione();
        ordineBean14.setNumero_carta("");
        java.sql.Date date18 = ordineBean14.getData();
        int int19 = ordineBean14.getId();
        ita.kangaroo.model.tipo tipo25 = null;
        ita.kangaroo.model.utenteBean utenteBean31 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo25, "hi!", "", "", "hi!", "");
        java.lang.String str32 = utenteBean31.getProvincia();
        java.lang.String str33 = utenteBean31.getCognome();
        ordineBean14.setClient(utenteBean31);
        java.lang.String str35 = utenteBean31.getCap();
        utenteBean31.setUsername("Data non disponibile");
        utenteBean31.setProvincia("Data non disponibile");
        java.sql.Date date47 = null;
        ita.kangaroo.model.OrdineBean ordineBean49 = new ita.kangaroo.model.OrdineBean((int) (short) 0, utenteBean31, 0.0f, "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "Data non disponibile", "hi!", "", "hi!", "Data non disponibile", date47, "");
        java.sql.Date date57 = null;
        ita.kangaroo.model.OrdineBean ordineBean59 = new ita.kangaroo.model.OrdineBean((int) (short) 100, utenteBean31, (float) 10L, "", "ProdottoBean{id=10, descrizione='hi!', nome='', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}", "", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "3a987acf8cbc1028b7dbc86bd086831151899a2b", date57, "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        java.lang.String str60 = utenteBean31.getUsername();
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(date18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Data non disponibile" + "'", str60, "Data non disponibile");
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getDestinatario();
        java.lang.String str14 = ordineBean12.getCircuito();
        java.sql.Date date15 = ordineBean12.getData();
        ordineBean12.setNumero_carta("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        ordineBean12.setMetodo_di_spedizione("da39a3ee5e6b4b0d3255bfef95601890afd80709");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(date15);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        ordineBean12.setIndirizzo_di_spedizione("Data non disponibile");
        ordineBean12.setPrezzo_totale((float) (byte) 10);
        java.sql.Date date17 = ordineBean12.getData();
        ordineBean12.setIndirizzo_di_spedizione("hi!");
        java.lang.String str20 = ordineBean12.getCircuito();
        int int21 = ordineBean12.getId();
        org.junit.Assert.assertNull(date17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getImmagine();
        prodottoBean8.setPrezzo((float) (-1L));
        int int12 = prodottoBean8.getId();
        prodottoBean8.setPrezzo(10.0f);
        prodottoBean8.setPrezzo(0.0f);
        prodottoBean8.setNome("Data non disponibile");
        ita.kangaroo.model.tipo tipo19 = prodottoBean8.getTipo();
        ita.kangaroo.model.tipo tipo20 = prodottoBean8.getTipo();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(tipo19);
        org.junit.Assert.assertNull(tipo20);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getDescrizione();
        prodottoBean8.setImmagine("");
        prodottoBean8.setId((int) (short) -1);
        ita.kangaroo.model.CartProduct cartProduct15 = new ita.kangaroo.model.CartProduct(prodottoBean8, (int) ' ');
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        ita.kangaroo.model.Cart cart0 = new ita.kangaroo.model.Cart();
        ita.kangaroo.model.tipo tipo8 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean9 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo8);
        java.lang.String str10 = prodottoBean9.getImmagine();
        prodottoBean9.setPrezzo((float) (-1L));
        int int13 = prodottoBean9.getId();
        prodottoBean9.setPrezzo(10.0f);
        prodottoBean9.setPrezzo(0.0f);
        prodottoBean9.setNome("Data non disponibile");
        cart0.changeQuantity(prodottoBean9, (int) '4');
        ita.kangaroo.model.tipo tipo29 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean30 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo29);
        java.lang.String str31 = prodottoBean30.getImmagine();
        prodottoBean30.setPrezzo((float) (-1L));
        int int34 = prodottoBean30.getId();
        float float35 = prodottoBean30.getIva();
        prodottoBean30.setQuantita((int) ' ');
        ita.kangaroo.model.tipo tipo38 = prodottoBean30.getTipo();
        cart0.changeQuantity(prodottoBean30, (int) (short) 100);
        ita.kangaroo.model.CartProduct cartProduct42 = new ita.kangaroo.model.CartProduct(prodottoBean30, (-1));
        ita.kangaroo.model.tipo tipo43 = prodottoBean30.getTipo();
        int int44 = prodottoBean30.getId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 1.0f + "'", float35 == 1.0f);
        org.junit.Assert.assertNull(tipo38);
        org.junit.Assert.assertNull(tipo43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
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
        metodoPagamentoBean0.setNumero_carta("");
        java.lang.String str28 = metodoPagamentoBean0.getCircuito();
        metodoPagamentoBean0.setUsername("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        ita.kangaroo.model.AddressBean addressBean0 = new ita.kangaroo.model.AddressBean();
        addressBean0.setVia("hi!");
        addressBean0.setCitta("ProdottoBean{id=10, descrizione='hi!', nome='', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}");
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        ita.kangaroo.model.tipo tipo18 = null;
        ita.kangaroo.model.utenteBean utenteBean24 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo18, "hi!", "", "", "hi!", "");
        utenteBean24.setEmail("hi!");
        utenteBean24.setPassword("hi!");
        java.lang.String str29 = utenteBean24.getCognome();
        ordineBean12.setClient(utenteBean24);
        utenteBean24.setUsername("Data non disponibile");
        java.lang.String str33 = utenteBean24.getCap();
        java.lang.String str34 = utenteBean24.getPassword();
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "3a987acf8cbc1028b7dbc86bd086831151899a2b" + "'", str34, "3a987acf8cbc1028b7dbc86bd086831151899a2b");
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        ita.kangaroo.model.Cart cart0 = new ita.kangaroo.model.Cart();
        ita.kangaroo.model.tipo tipo8 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean9 = new ita.kangaroo.model.ProdottoBean((int) (byte) -1, "Data non disponibile", "Data non disponibile", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", (float) ' ', (int) ' ', (float) ' ', tipo8);
        ita.kangaroo.model.CartProduct cartProduct10 = new ita.kangaroo.model.CartProduct(prodottoBean9);
        cart0.changeQuantity(prodottoBean9, 0);
        java.lang.String str13 = prodottoBean9.getImmagine();
        java.lang.String str14 = prodottoBean9.getImmagine();
        prodottoBean9.setPrezzo((float) (byte) 0);
        int int17 = prodottoBean9.getId();
        prodottoBean9.setQuantita((int) (short) 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}" + "'", str13, "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}" + "'", str14, "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        float float2 = orderProductBean0.getIVA();
        int int3 = orderProductBean0.getId_prodotto();
        float float4 = orderProductBean0.getPrezzo();
        ita.kangaroo.model.OrderProductBean orderProductBean5 = new ita.kangaroo.model.OrderProductBean();
        float float6 = orderProductBean5.getIVA();
        float float7 = orderProductBean5.getIVA();
        ita.kangaroo.model.OrderProductBean orderProductBean8 = new ita.kangaroo.model.OrderProductBean();
        float float9 = orderProductBean8.getIVA();
        orderProductBean8.setQuantita((int) (byte) 100);
        orderProductBean8.setPrezzo((float) (-1));
        ita.kangaroo.model.OrderProductBean orderProductBean14 = new ita.kangaroo.model.OrderProductBean();
        float float15 = orderProductBean14.getIVA();
        float float16 = orderProductBean14.getIVA();
        int int17 = orderProductBean14.getId_prodotto();
        float float18 = orderProductBean14.getPrezzo();
        ita.kangaroo.model.OrderProductBean orderProductBean19 = new ita.kangaroo.model.OrderProductBean();
        float float20 = orderProductBean19.getIVA();
        orderProductBean19.setQuantita((int) (byte) 100);
        ita.kangaroo.model.OrderProductBean orderProductBean23 = new ita.kangaroo.model.OrderProductBean();
        float float24 = orderProductBean23.getIVA();
        float float25 = orderProductBean23.getIVA();
        float float26 = orderProductBean23.getPrezzo();
        ita.kangaroo.model.OrderProductBean orderProductBean27 = new ita.kangaroo.model.OrderProductBean();
        float float28 = orderProductBean27.getIVA();
        float float29 = orderProductBean27.getIVA();
        float float30 = orderProductBean27.getPrezzo();
        ita.kangaroo.model.OrderProductBean orderProductBean31 = new ita.kangaroo.model.OrderProductBean();
        float float32 = orderProductBean31.getIVA();
        float float33 = orderProductBean31.getIVA();
        int int34 = orderProductBean31.getId_prodotto();
        float float35 = orderProductBean31.getPrezzo();
        ita.kangaroo.model.OrderProductBean orderProductBean36 = new ita.kangaroo.model.OrderProductBean();
        ita.kangaroo.model.OrderProductBean orderProductBean37 = new ita.kangaroo.model.OrderProductBean();
        float float38 = orderProductBean37.getIVA();
        float float39 = orderProductBean37.getIVA();
        orderProductBean37.setPrezzo(10.0f);
        orderProductBean37.setId_ordine((int) (short) 0);
        orderProductBean37.setIVA((-1.0f));
        ita.kangaroo.model.OrderProductBean orderProductBean46 = new ita.kangaroo.model.OrderProductBean();
        float float47 = orderProductBean46.getIVA();
        int int48 = orderProductBean46.getId_ordine();
        orderProductBean46.setQuantita((int) 'a');
        int int51 = orderProductBean46.getId_ordine();
        orderProductBean46.setId_ordine(100);
        ita.kangaroo.model.OrderProductBean orderProductBean54 = new ita.kangaroo.model.OrderProductBean();
        float float55 = orderProductBean54.getIVA();
        int int56 = orderProductBean54.getId_ordine();
        int int57 = orderProductBean54.getQuantita();
        ita.kangaroo.model.OrderProductBean orderProductBean58 = new ita.kangaroo.model.OrderProductBean();
        float float59 = orderProductBean58.getIVA();
        float float60 = orderProductBean58.getIVA();
        int int61 = orderProductBean58.getId_prodotto();
        ita.kangaroo.model.OrderProductBean orderProductBean62 = new ita.kangaroo.model.OrderProductBean();
        float float63 = orderProductBean62.getIVA();
        float float64 = orderProductBean62.getIVA();
        int int65 = orderProductBean62.getId_prodotto();
        ita.kangaroo.model.OrderProductBean orderProductBean66 = new ita.kangaroo.model.OrderProductBean();
        float float67 = orderProductBean66.getIVA();
        int int68 = orderProductBean66.getId_ordine();
        ita.kangaroo.model.OrderProductBean orderProductBean69 = new ita.kangaroo.model.OrderProductBean();
        float float70 = orderProductBean69.getIVA();
        float float71 = orderProductBean69.getIVA();
        orderProductBean69.setPrezzo(10.0f);
        orderProductBean69.setId_ordine((int) (short) 0);
        orderProductBean69.setIVA((-1.0f));
        ita.kangaroo.model.OrderProductBean[] orderProductBeanArray78 = new ita.kangaroo.model.OrderProductBean[] { orderProductBean0, orderProductBean5, orderProductBean8, orderProductBean14, orderProductBean19, orderProductBean23, orderProductBean27, orderProductBean31, orderProductBean36, orderProductBean37, orderProductBean46, orderProductBean54, orderProductBean58, orderProductBean62, orderProductBean66, orderProductBean69 };
        java.util.ArrayList<ita.kangaroo.model.OrderProductBean> orderProductBeanList79 = new java.util.ArrayList<ita.kangaroo.model.OrderProductBean>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<ita.kangaroo.model.OrderProductBean>) orderProductBeanList79, orderProductBeanArray78);
        ita.kangaroo.model.OrdineBean ordineBean81 = new ita.kangaroo.model.OrdineBean(orderProductBeanList79);
        java.lang.String str82 = ordineBean81.getDestinatario();
        java.lang.String str83 = ordineBean81.getMetodo_di_spedizione();
        java.lang.String str84 = ordineBean81.getMetodo_di_pagamento();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.0f + "'", float15 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.0f + "'", float18 == 0.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 0.0f + "'", float25 == 0.0f);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 0.0f + "'", float26 == 0.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 0.0f + "'", float28 == 0.0f);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 0.0f + "'", float29 == 0.0f);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 0.0f + "'", float30 == 0.0f);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 0.0f + "'", float32 == 0.0f);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 0.0f + "'", float33 == 0.0f);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 0.0f + "'", float35 == 0.0f);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + 0.0f + "'", float38 == 0.0f);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 0.0f + "'", float39 == 0.0f);
        org.junit.Assert.assertTrue("'" + float47 + "' != '" + 0.0f + "'", float47 == 0.0f);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + float55 + "' != '" + 0.0f + "'", float55 == 0.0f);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + float59 + "' != '" + 0.0f + "'", float59 == 0.0f);
        org.junit.Assert.assertTrue("'" + float60 + "' != '" + 0.0f + "'", float60 == 0.0f);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + float63 + "' != '" + 0.0f + "'", float63 == 0.0f);
        org.junit.Assert.assertTrue("'" + float64 + "' != '" + 0.0f + "'", float64 == 0.0f);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + float67 + "' != '" + 0.0f + "'", float67 == 0.0f);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + float70 + "' != '" + 0.0f + "'", float70 == 0.0f);
        org.junit.Assert.assertTrue("'" + float71 + "' != '" + 0.0f + "'", float71 == 0.0f);
        org.junit.Assert.assertNotNull(orderProductBeanArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNull(str82);
        org.junit.Assert.assertNull(str83);
        org.junit.Assert.assertNull(str84);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        ita.kangaroo.model.AddressBean addressBean0 = new ita.kangaroo.model.AddressBean();
        java.lang.String str1 = addressBean0.getVia();
        java.lang.String str2 = addressBean0.getUsername();
        addressBean0.setUsername("hi!");
        ita.kangaroo.model.tipo tipo10 = null;
        ita.kangaroo.model.utenteBean utenteBean16 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo10, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean17 = new ita.kangaroo.model.OrdineBean(utenteBean16);
        java.lang.String str18 = ordineBean17.getMetodo_di_spedizione();
        ita.kangaroo.model.tipo tipo24 = null;
        ita.kangaroo.model.utenteBean utenteBean30 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo24, "hi!", "", "", "hi!", "");
        utenteBean30.setEmail("hi!");
        ordineBean17.setClient(utenteBean30);
        ordineBean17.setNumero_carta("");
        ordineBean17.setMetodo_di_pagamento("hi!");
        java.util.ArrayList<ita.kangaroo.model.OrderProductBean> orderProductBeanList38 = null;
        ordineBean17.setProducts(orderProductBeanList38);
        boolean boolean40 = addressBean0.equals((java.lang.Object) orderProductBeanList38);
        java.lang.String str41 = addressBean0.getCitta();
        java.lang.String str42 = addressBean0.getCitta();
        ita.kangaroo.model.tipo tipo48 = null;
        ita.kangaroo.model.utenteBean utenteBean54 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo48, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean55 = new ita.kangaroo.model.OrdineBean(utenteBean54);
        java.lang.String str56 = ordineBean55.getMetodo_di_spedizione();
        ordineBean55.setNumero_carta("");
        java.sql.Date date59 = ordineBean55.getData();
        ordineBean55.setMetodo_di_pagamento("");
        ordineBean55.setNumero_di_tracking("");
        ordineBean55.setCircuito("hi!");
        int int66 = ordineBean55.getId();
        ita.kangaroo.model.tipo tipo72 = null;
        ita.kangaroo.model.utenteBean utenteBean78 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo72, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean79 = new ita.kangaroo.model.OrdineBean(utenteBean78);
        utenteBean78.setPassword("hi!");
        utenteBean78.setNome("hi!");
        ordineBean55.setClient(utenteBean78);
        boolean boolean85 = addressBean0.equals((java.lang.Object) utenteBean78);
        java.lang.String str86 = addressBean0.getUsername();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNull(date59);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "hi!" + "'", str86, "hi!");
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        ita.kangaroo.model.tipo tipo19 = null;
        ita.kangaroo.model.utenteBean utenteBean25 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo19, "hi!", "", "", "hi!", "");
        utenteBean25.setEmail("hi!");
        ordineBean12.setClient(utenteBean25);
        ordineBean12.setNumero_carta("");
        ordineBean12.setMetodo_di_pagamento("hi!");
        ordineBean12.setId((int) (short) 0);
        java.lang.String str35 = ordineBean12.getMetodo_di_pagamento();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "", "", "hi!", "hi!", "hi!");
        java.lang.String str12 = utenteBean11.getPassword();
        utenteBean11.setProvincia("Data non disponibile");
        utenteBean11.setCognome("hi!");
        utenteBean11.setNome("");
        utenteBean11.setVia("");
        java.lang.String str21 = utenteBean11.getCognome();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "3d1583397bcebff274b1e7cb58087c39153af974", "hi!", "ProdottoBean{id=10, descrizione='hi!', nome='', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}", tipo5, "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "hi!", "", "Data non disponibile", "");
        utenteBean11.setUsername("Data non disponibile");
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getDestinatario();
        java.lang.String str14 = ordineBean12.toString();
        ordineBean12.setMetodo_di_pagamento("");
        java.lang.String str17 = ordineBean12.getMetodo_di_pagamento();
        ordineBean12.setCircuito("3d1583397bcebff274b1e7cb58087c39153af974");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Data non disponibile" + "'", str14, "Data non disponibile");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        ita.kangaroo.model.Cart cart0 = new ita.kangaroo.model.Cart();
        ita.kangaroo.model.tipo tipo8 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean9 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo8);
        java.lang.String str10 = prodottoBean9.getImmagine();
        prodottoBean9.setPrezzo((float) (-1L));
        cart0.changeQuantity(prodottoBean9, 97);
        ita.kangaroo.model.tipo tipo22 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean23 = new ita.kangaroo.model.ProdottoBean((int) (byte) -1, "Data non disponibile", "Data non disponibile", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", (float) ' ', (int) ' ', (float) ' ', tipo22);
        java.lang.String str24 = prodottoBean23.getImmagine();
        int int25 = prodottoBean23.getQuantita();
        prodottoBean23.setIva((float) '4');
        prodottoBean23.setId((int) (short) 1);
        cart0.changeQuantity(prodottoBean23, (int) (byte) 1);
        float float32 = prodottoBean23.getPrezzo();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}" + "'", str24, "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 32 + "'", int25 == 32);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 32.0f + "'", float32 == 32.0f);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        ordineBean12.setNumero_carta("");
        java.sql.Date date16 = ordineBean12.getData();
        ordineBean12.setMetodo_di_pagamento("");
        ordineBean12.setNumero_di_tracking("");
        ordineBean12.setNumero_di_tracking("hi!");
        java.lang.String str23 = ordineBean12.getIndirizzo_di_spedizione();
        ordineBean12.setMetodo_di_pagamento("");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        float float2 = orderProductBean0.getIVA();
        float float3 = orderProductBean0.getPrezzo();
        int int4 = orderProductBean0.getId_prodotto();
        orderProductBean0.setIVA((float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        ita.kangaroo.model.Cart cart0 = new ita.kangaroo.model.Cart();
        ita.kangaroo.model.tipo tipo8 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean9 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo8);
        java.lang.String str10 = prodottoBean9.getImmagine();
        prodottoBean9.setPrezzo((float) (-1L));
        int int13 = prodottoBean9.getId();
        prodottoBean9.setPrezzo(10.0f);
        prodottoBean9.setPrezzo(0.0f);
        prodottoBean9.setNome("Data non disponibile");
        cart0.changeQuantity(prodottoBean9, (int) '4');
        ita.kangaroo.model.CartProduct cartProduct22 = new ita.kangaroo.model.CartProduct(prodottoBean9);
        prodottoBean9.setImmagine("ProdottoBean{id=10, descrizione='hi!', nome='', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getDescrizione();
        java.lang.String str10 = prodottoBean8.getDescrizione();
        ita.kangaroo.model.CartProduct cartProduct11 = new ita.kangaroo.model.CartProduct(prodottoBean8);
        ita.kangaroo.model.ProdottoBean prodottoBean12 = cartProduct11.getProduct();
        int int13 = prodottoBean12.getQuantita();
        int int14 = prodottoBean12.getQuantita();
        int int15 = prodottoBean12.getId();
        java.lang.String str16 = prodottoBean12.getImmagine();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(prodottoBean12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        ita.kangaroo.model.tipo tipo6 = null;
        ita.kangaroo.model.utenteBean utenteBean12 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo6, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean13 = new ita.kangaroo.model.OrdineBean(utenteBean12);
        utenteBean12.setPassword("hi!");
        utenteBean12.setNome("hi!");
        java.sql.Date date25 = null;
        ita.kangaroo.model.OrdineBean ordineBean27 = new ita.kangaroo.model.OrdineBean((int) (byte) 100, utenteBean12, (float) (-1L), "hi!", "", "", "hi!", "Data non disponibile", "hi!", date25, "");
        ordineBean27.setIndirizzo_di_spedizione("Data non disponibile");
        java.lang.String str30 = ordineBean27.getDestinatario();
        java.lang.String str31 = ordineBean27.getDestinatario();
        ita.kangaroo.model.tipo tipo37 = null;
        ita.kangaroo.model.utenteBean utenteBean43 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo37, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean44 = new ita.kangaroo.model.OrdineBean(utenteBean43);
        java.lang.String str45 = ordineBean44.getMetodo_di_spedizione();
        java.util.ArrayList<ita.kangaroo.model.OrderProductBean> orderProductBeanList46 = ordineBean44.getProducts();
        ordineBean27.setProducts(orderProductBeanList46);
        java.lang.String str48 = ordineBean27.getMetodo_di_spedizione();
        java.sql.Date date49 = ordineBean27.getData();
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(orderProductBeanList46);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNull(date49);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        ita.kangaroo.model.Cart cart0 = new ita.kangaroo.model.Cart();
        ita.kangaroo.model.tipo tipo8 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean9 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo8);
        int int10 = prodottoBean9.getId();
        java.lang.String str11 = prodottoBean9.getImmagine();
        cart0.removeProduct(prodottoBean9);
        ita.kangaroo.model.tipo tipo20 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean21 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo20);
        java.lang.String str22 = prodottoBean21.getDescrizione();
        java.lang.String str23 = prodottoBean21.getNome();
        ita.kangaroo.model.tipo tipo24 = prodottoBean21.getTipo();
        cart0.removeProduct(prodottoBean21);
        int int26 = prodottoBean21.getQuantita();
        ita.kangaroo.model.tipo tipo27 = null;
        prodottoBean21.setTipo(tipo27);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNull(tipo24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        ita.kangaroo.model.CartProduct cartProduct10 = new ita.kangaroo.model.CartProduct(prodottoBean8, (int) (short) 100);
        int int11 = cartProduct10.getQuantity();
        ita.kangaroo.model.ProdottoBean prodottoBean12 = cartProduct10.getProduct();
        int int13 = cartProduct10.getQuantity();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(prodottoBean12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        int int2 = orderProductBean0.getId_ordine();
        orderProductBean0.setQuantita((int) 'a');
        int int5 = orderProductBean0.getId_prodotto();
        orderProductBean0.setQuantita((int) (short) 10);
        int int8 = orderProductBean0.getId_ordine();
        float float9 = orderProductBean0.getPrezzo();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getImmagine();
        prodottoBean8.setPrezzo((float) (-1L));
        int int12 = prodottoBean8.getId();
        prodottoBean8.setPrezzo(10.0f);
        ita.kangaroo.model.CartProduct cartProduct15 = new ita.kangaroo.model.CartProduct(prodottoBean8);
        int int16 = cartProduct15.getQuantity();
        cartProduct15.setQuantity(0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        ita.kangaroo.model.AddressBean addressBean0 = new ita.kangaroo.model.AddressBean();
        java.lang.String str1 = addressBean0.getVia();
        java.lang.String str2 = addressBean0.getUsername();
        java.lang.String str3 = addressBean0.getCAP();
        java.lang.String str4 = addressBean0.getUsername();
        addressBean0.setId(10);
        int int7 = addressBean0.getId();
        addressBean0.setCAP("");
        addressBean0.setId((int) 'a');
        java.lang.String str12 = addressBean0.getVia();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        ita.kangaroo.model.tipo tipo6 = null;
        ita.kangaroo.model.utenteBean utenteBean12 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo6, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean13 = new ita.kangaroo.model.OrdineBean(utenteBean12);
        utenteBean12.setPassword("hi!");
        utenteBean12.setNome("hi!");
        java.sql.Date date25 = null;
        ita.kangaroo.model.OrdineBean ordineBean27 = new ita.kangaroo.model.OrdineBean((int) (byte) 100, utenteBean12, (float) (-1L), "hi!", "", "", "hi!", "Data non disponibile", "hi!", date25, "");
        ordineBean27.setIndirizzo_di_spedizione("Data non disponibile");
        java.lang.String str30 = ordineBean27.getDestinatario();
        java.sql.Date date31 = ordineBean27.getData();
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNull(date31);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        int int2 = orderProductBean0.getId_ordine();
        orderProductBean0.setQuantita((int) 'a');
        int int5 = orderProductBean0.getId_ordine();
        int int6 = orderProductBean0.getId_ordine();
        orderProductBean0.setId_prodotto(10);
        int int9 = orderProductBean0.getId_ordine();
        orderProductBean0.setId_prodotto((int) '4');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        ordineBean12.setIndirizzo_di_spedizione("Data non disponibile");
        ordineBean12.setPrezzo_totale((float) (byte) 10);
        java.sql.Date date17 = ordineBean12.getData();
        ordineBean12.setNumero_carta("hi!");
        ordineBean12.setPrezzo_totale((float) 97);
        ordineBean12.setNumero_carta("");
        org.junit.Assert.assertNull(date17);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        ita.kangaroo.model.tipo tipo6 = null;
        ita.kangaroo.model.utenteBean utenteBean12 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo6, "hi!", "", "", "hi!", "");
        utenteBean12.setEmail("hi!");
        java.lang.String str15 = utenteBean12.getCognome();
        utenteBean12.setCitta("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        utenteBean12.setUsername("Data non disponibile");
        java.sql.Date date27 = null;
        ita.kangaroo.model.OrdineBean ordineBean29 = new ita.kangaroo.model.OrdineBean(0, utenteBean12, (float) (byte) 0, "", "", "Data non disponibile", "Data non disponibile", "hi!", "", date27, "Data non disponibile");
        ordineBean29.setMetodo_di_pagamento("Data non disponibile");
        ita.kangaroo.model.utenteBean utenteBean32 = ordineBean29.getClient();
        utenteBean32.setEmail("");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(utenteBean32);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        utenteBean11.setEmail("hi!");
        utenteBean11.setPassword("hi!");
        utenteBean11.setProvincia("hi!");
        utenteBean11.setUsername("hi!");
        java.lang.String str20 = utenteBean11.getTelefono();
        utenteBean11.setTelefono("hi!");
        utenteBean11.setEmail("");
        utenteBean11.setProvincia("Data non disponibile");
        java.lang.String str27 = utenteBean11.getCognome();
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        java.lang.String str12 = utenteBean11.getUsername();
        java.lang.String str13 = utenteBean11.getCap();
        utenteBean11.setUsername("");
        ita.kangaroo.model.OrdineBean ordineBean16 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.sql.Date date17 = ordineBean16.getData();
        ita.kangaroo.model.utenteBean utenteBean18 = ordineBean16.getClient();
        ita.kangaroo.model.OrdineBean ordineBean19 = new ita.kangaroo.model.OrdineBean(utenteBean18);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(date17);
        org.junit.Assert.assertNotNull(utenteBean18);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        ita.kangaroo.model.AddressBean addressBean5 = new ita.kangaroo.model.AddressBean((int) (short) 0, "hi!", "Data non disponibile", "", "");
        addressBean5.setId((int) (short) 100);
        int int8 = addressBean5.getId();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        ita.kangaroo.model.MetodoPagamentoBean metodoPagamentoBean0 = new ita.kangaroo.model.MetodoPagamentoBean();
        metodoPagamentoBean0.setId((int) 'a');
        ita.kangaroo.model.AddressBean addressBean3 = new ita.kangaroo.model.AddressBean();
        java.lang.String str4 = addressBean3.getVia();
        addressBean3.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        addressBean3.setCitta("hi!");
        boolean boolean9 = metodoPagamentoBean0.equals((java.lang.Object) addressBean3);
        java.lang.String str10 = metodoPagamentoBean0.getNumero_carta();
        java.lang.String str11 = metodoPagamentoBean0.getCvv();
        metodoPagamentoBean0.setCircuito("ProdottoBean{id=10, descrizione='hi!', nome='', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}");
        metodoPagamentoBean0.setId((int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getImmagine();
        prodottoBean8.setPrezzo((float) (-1L));
        int int12 = prodottoBean8.getQuantita();
        int int13 = prodottoBean8.getQuantita();
        prodottoBean8.setImmagine("Data non disponibile");
        java.lang.String str16 = prodottoBean8.getImmagine();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Data non disponibile" + "'", str16, "Data non disponibile");
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getDescrizione();
        java.lang.String str10 = prodottoBean8.getNome();
        int int11 = prodottoBean8.getQuantita();
        prodottoBean8.setDescrizione("hi!");
        int int14 = prodottoBean8.getId();
        prodottoBean8.setQuantita(32);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        ordineBean12.setNumero_carta("");
        java.sql.Date date16 = ordineBean12.getData();
        ordineBean12.setMetodo_di_pagamento("");
        ordineBean12.setNumero_di_tracking("");
        ordineBean12.setNumero_di_tracking("hi!");
        ordineBean12.setDestinatario("hi!");
        java.sql.Date date25 = ordineBean12.getData();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertNull(date25);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        ita.kangaroo.model.utenteBean utenteBean0 = new ita.kangaroo.model.utenteBean();
        java.lang.String str1 = utenteBean0.getPassword();
        utenteBean0.setCap("");
        utenteBean0.setCap("ProdottoBean{id=10, descrizione='hi!', nome='', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        utenteBean11.setEmail("");
        ita.kangaroo.model.OrdineBean ordineBean15 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str16 = ordineBean15.getIndirizzo_di_spedizione();
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getImmagine();
        int int10 = prodottoBean8.getQuantita();
        prodottoBean8.setImmagine("hi!");
        java.lang.String str13 = prodottoBean8.getImmagine();
        prodottoBean8.setDescrizione("hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) ' ', "", "Data non disponibile", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", (float) 1L, (int) 'a', (float) 32, tipo7);
        java.lang.String str9 = prodottoBean8.getImmagine();
        int int10 = prodottoBean8.getId();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}" + "'", str9, "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        utenteBean11.setPassword("hi!");
        utenteBean11.setEmail("hi!");
        utenteBean11.setPassword("Data non disponibile");
        java.lang.String str19 = utenteBean11.getCitta();
        java.lang.String str20 = utenteBean11.getCap();
        utenteBean11.setEmail("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        ita.kangaroo.model.tipo tipo18 = null;
        ita.kangaroo.model.utenteBean utenteBean24 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo18, "hi!", "", "", "hi!", "");
        utenteBean24.setEmail("hi!");
        utenteBean24.setPassword("hi!");
        java.lang.String str29 = utenteBean24.getCognome();
        ordineBean12.setClient(utenteBean24);
        utenteBean24.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        java.lang.String str33 = utenteBean24.getVia();
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}" + "'", str33, "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        ita.kangaroo.model.ProdottoBean prodottoBean0 = null;
        ita.kangaroo.model.CartProduct cartProduct2 = new ita.kangaroo.model.CartProduct(prodottoBean0, (int) (byte) 10);
        cartProduct2.setQuantity((int) '4');
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        ita.kangaroo.model.ProdottoBean prodottoBean0 = new ita.kangaroo.model.ProdottoBean();
        java.lang.String str1 = prodottoBean0.getNome();
        java.lang.String str2 = prodottoBean0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ProdottoBean{id=0, descrizione='', nome='', immagine='', prezzo=0.0, quantita=0, iva=0.0, tipo=null}" + "'", str2, "ProdottoBean{id=0, descrizione='', nome='', immagine='', prezzo=0.0, quantita=0, iva=0.0, tipo=null}");
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        java.util.ArrayList<ita.kangaroo.model.OrderProductBean> orderProductBeanList14 = ordineBean12.getProducts();
        ordineBean12.setNumero_carta("hi!");
        ita.kangaroo.model.tipo tipo22 = null;
        ita.kangaroo.model.utenteBean utenteBean28 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo22, "hi!", "", "", "hi!", "");
        utenteBean28.setEmail("hi!");
        java.lang.String str31 = utenteBean28.getCognome();
        utenteBean28.setCitta("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        ordineBean12.setClient(utenteBean28);
        java.lang.String str35 = utenteBean28.getTelefono();
        utenteBean28.setCognome("Data non disponibile");
        utenteBean28.setPassword("da39a3ee5e6b4b0d3255bfef95601890afd80709");
        utenteBean28.setCap("ProdottoBean{id=10, descrizione='hi!', nome='', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}");
        utenteBean28.setUsername("");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(orderProductBeanList14);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        ita.kangaroo.model.Cart cart0 = new ita.kangaroo.model.Cart();
        ita.kangaroo.model.tipo tipo8 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean9 = new ita.kangaroo.model.ProdottoBean((int) (byte) -1, "Data non disponibile", "Data non disponibile", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", (float) ' ', (int) ' ', (float) ' ', tipo8);
        ita.kangaroo.model.CartProduct cartProduct10 = new ita.kangaroo.model.CartProduct(prodottoBean9);
        cart0.changeQuantity(prodottoBean9, 0);
        prodottoBean9.setImmagine("Data non disponibile");
        prodottoBean9.setNome("Data non disponibile");
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        float float2 = orderProductBean0.getIVA();
        orderProductBean0.setPrezzo(10.0f);
        orderProductBean0.setQuantita((int) (short) -1);
        int int7 = orderProductBean0.getQuantita();
        orderProductBean0.setId_ordine((int) 'a');
        orderProductBean0.setPrezzo((float) '#');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        ita.kangaroo.model.MetodoPagamentoBean metodoPagamentoBean0 = new ita.kangaroo.model.MetodoPagamentoBean();
        metodoPagamentoBean0.setId((int) 'a');
        ita.kangaroo.model.AddressBean addressBean3 = new ita.kangaroo.model.AddressBean();
        java.lang.String str4 = addressBean3.getVia();
        addressBean3.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        addressBean3.setCitta("hi!");
        boolean boolean9 = metodoPagamentoBean0.equals((java.lang.Object) addressBean3);
        metodoPagamentoBean0.setUsername("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        metodoPagamentoBean0.setNumero_carta("da39a3ee5e6b4b0d3255bfef95601890afd80709");
        java.lang.String str14 = metodoPagamentoBean0.getCircuito();
        metodoPagamentoBean0.setNumero_carta("Data non disponibile");
        int int17 = metodoPagamentoBean0.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 10, "hi!", "", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", (float) (-1), (int) (byte) 100, (float) (byte) 0, tipo7);
        prodottoBean8.setId((int) (short) -1);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        int int2 = orderProductBean0.getId_ordine();
        orderProductBean0.setQuantita((int) 'a');
        int int5 = orderProductBean0.getId_ordine();
        orderProductBean0.setId_ordine(100);
        int int8 = orderProductBean0.getId_ordine();
        orderProductBean0.setId_ordine(0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        ordineBean12.setNumero_carta("");
        java.sql.Date date16 = ordineBean12.getData();
        ordineBean12.setPrezzo_totale((float) 'a');
        java.lang.String str19 = ordineBean12.getNumero_carta();
        ordineBean12.setMetodo_di_spedizione("da39a3ee5e6b4b0d3255bfef95601890afd80709");
        java.sql.Date date22 = ordineBean12.getData();
        java.lang.String str23 = ordineBean12.getNumero_carta();
        java.lang.String str24 = ordineBean12.getMetodo_di_spedizione();
        java.lang.String str25 = ordineBean12.getNumero_carta();
        java.lang.String str26 = ordineBean12.getNumero_carta();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(date22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "da39a3ee5e6b4b0d3255bfef95601890afd80709" + "'", str24, "da39a3ee5e6b4b0d3255bfef95601890afd80709");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        ita.kangaroo.model.Cart cart0 = new ita.kangaroo.model.Cart();
        ita.kangaroo.model.tipo tipo8 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean9 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo8);
        int int10 = prodottoBean9.getId();
        java.lang.String str11 = prodottoBean9.getImmagine();
        cart0.removeProduct(prodottoBean9);
        ita.kangaroo.model.tipo tipo20 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean21 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo20);
        java.lang.String str22 = prodottoBean21.getDescrizione();
        java.lang.String str23 = prodottoBean21.getNome();
        ita.kangaroo.model.tipo tipo24 = prodottoBean21.getTipo();
        cart0.removeProduct(prodottoBean21);
        ita.kangaroo.model.tipo tipo33 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean34 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo33);
        java.lang.String str35 = prodottoBean34.getImmagine();
        prodottoBean34.setPrezzo((float) (-1L));
        int int38 = prodottoBean34.getId();
        float float39 = prodottoBean34.getIva();
        prodottoBean34.setQuantita((int) ' ');
        ita.kangaroo.model.tipo tipo42 = prodottoBean34.getTipo();
        cart0.addProduct(prodottoBean34);
        ita.kangaroo.model.tipo tipo51 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean52 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo51);
        java.lang.String str53 = prodottoBean52.getImmagine();
        prodottoBean52.setPrezzo((float) (-1L));
        int int56 = prodottoBean52.getId();
        float float57 = prodottoBean52.getIva();
        int int58 = prodottoBean52.getId();
        prodottoBean52.setPrezzo((float) (byte) 10);
        float float61 = prodottoBean52.getIva();
        cart0.removeProduct(prodottoBean52);
        java.util.ArrayList<ita.kangaroo.model.CartProduct> cartProductList63 = cart0.getProducts();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNull(tipo24);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 1.0f + "'", float39 == 1.0f);
        org.junit.Assert.assertNull(tipo42);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertTrue("'" + float57 + "' != '" + 1.0f + "'", float57 == 1.0f);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertTrue("'" + float61 + "' != '" + 1.0f + "'", float61 == 1.0f);
        org.junit.Assert.assertNotNull(cartProductList63);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        ita.kangaroo.model.tipo tipo6 = null;
        ita.kangaroo.model.utenteBean utenteBean12 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo6, "hi!", "", "", "hi!", "");
        java.lang.String str13 = utenteBean12.getUsername();
        java.lang.String str14 = utenteBean12.getCap();
        java.sql.Date date22 = null;
        ita.kangaroo.model.OrdineBean ordineBean24 = new ita.kangaroo.model.OrdineBean((int) (short) 0, utenteBean12, (float) 10L, "", "Data non disponibile", "hi!", "hi!", "", "", date22, "hi!");
        ordineBean24.setDestinatario("");
        float float27 = ordineBean24.getPrezzo_totale();
        java.util.ArrayList<ita.kangaroo.model.OrderProductBean> orderProductBeanList28 = ordineBean24.getProducts();
        ita.kangaroo.model.OrdineBean ordineBean29 = new ita.kangaroo.model.OrdineBean(orderProductBeanList28);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 10.0f + "'", float27 == 10.0f);
        org.junit.Assert.assertNotNull(orderProductBeanList28);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        ordineBean12.setNumero_carta("");
        java.sql.Date date16 = ordineBean12.getData();
        ita.kangaroo.model.utenteBean utenteBean17 = ordineBean12.getClient();
        ordineBean12.setDestinatario("da39a3ee5e6b4b0d3255bfef95601890afd80709");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertNotNull(utenteBean17);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getImmagine();
        prodottoBean8.setPrezzo((float) (-1L));
        int int12 = prodottoBean8.getId();
        ita.kangaroo.model.CartProduct cartProduct13 = new ita.kangaroo.model.CartProduct(prodottoBean8);
        prodottoBean8.setQuantita((int) (short) -1);
        int int16 = prodottoBean8.getQuantita();
        ita.kangaroo.model.CartProduct cartProduct17 = new ita.kangaroo.model.CartProduct(prodottoBean8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("Data non disponibile", "3d1583397bcebff274b1e7cb58087c39153af974", "ProdottoBean{id=10, descrizione='hi!', nome='', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}", "3d1583397bcebff274b1e7cb58087c39153af974", "3d1583397bcebff274b1e7cb58087c39153af974", tipo5, "3d1583397bcebff274b1e7cb58087c39153af974", "hi!", "", "", "");
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "", "", "hi!", "hi!", "hi!");
        java.lang.String str12 = utenteBean11.getPassword();
        java.lang.String str13 = utenteBean11.getPassword();
        utenteBean11.setNome("Data non disponibile");
        java.lang.String str16 = utenteBean11.getCitta();
        utenteBean11.setVia("");
        java.lang.String str19 = utenteBean11.getPassword();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        int int9 = prodottoBean8.getId();
        java.lang.String str10 = prodottoBean8.getImmagine();
        ita.kangaroo.model.CartProduct cartProduct11 = new ita.kangaroo.model.CartProduct(prodottoBean8);
        cartProduct11.setQuantity(1);
        int int14 = cartProduct11.getQuantity();
        int int15 = cartProduct11.getQuantity();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        ita.kangaroo.model.tipo tipo6 = null;
        ita.kangaroo.model.utenteBean utenteBean12 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo6, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean13 = new ita.kangaroo.model.OrdineBean(utenteBean12);
        utenteBean12.setPassword("hi!");
        utenteBean12.setNome("hi!");
        java.sql.Date date25 = null;
        ita.kangaroo.model.OrdineBean ordineBean27 = new ita.kangaroo.model.OrdineBean((int) (byte) 100, utenteBean12, (float) (-1L), "hi!", "", "", "hi!", "Data non disponibile", "hi!", date25, "");
        ordineBean27.setIndirizzo_di_spedizione("Data non disponibile");
        java.lang.String str30 = ordineBean27.getDestinatario();
        java.lang.String str31 = ordineBean27.getMetodo_di_pagamento();
        ordineBean27.setMetodo_di_spedizione("Data non disponibile");
        java.lang.String str34 = ordineBean27.getMetodo_di_pagamento();
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        java.lang.String str12 = utenteBean11.getUsername();
        java.lang.String str13 = utenteBean11.getCap();
        utenteBean11.setUsername("");
        ita.kangaroo.model.OrdineBean ordineBean16 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str17 = ordineBean16.getMetodo_di_pagamento();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        ordineBean12.setNumero_carta("");
        java.sql.Date date16 = ordineBean12.getData();
        ordineBean12.setMetodo_di_pagamento("");
        ordineBean12.setNumero_di_tracking("");
        ordineBean12.setNumero_di_tracking("hi!");
        ordineBean12.setMetodo_di_spedizione("hi!");
        ita.kangaroo.model.tipo tipo30 = null;
        ita.kangaroo.model.utenteBean utenteBean36 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo30, "hi!", "", "", "hi!", "");
        java.lang.String str37 = utenteBean36.getUsername();
        java.lang.String str38 = utenteBean36.getCap();
        utenteBean36.setUsername("");
        ita.kangaroo.model.OrdineBean ordineBean41 = new ita.kangaroo.model.OrdineBean(utenteBean36);
        ordineBean41.setCircuito("");
        java.util.ArrayList<ita.kangaroo.model.OrderProductBean> orderProductBeanList44 = ordineBean41.getProducts();
        ordineBean12.setProducts(orderProductBeanList44);
        java.lang.String str46 = ordineBean12.getCircuito();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(orderProductBeanList44);
        org.junit.Assert.assertNull(str46);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getImmagine();
        prodottoBean8.setPrezzo((float) (-1L));
        int int12 = prodottoBean8.getId();
        float float13 = prodottoBean8.getIva();
        prodottoBean8.setIva((float) ' ');
        ita.kangaroo.model.CartProduct cartProduct17 = new ita.kangaroo.model.CartProduct(prodottoBean8, 0);
        cartProduct17.setQuantity((-1));
        ita.kangaroo.model.ProdottoBean prodottoBean20 = cartProduct17.getProduct();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertNotNull(prodottoBean20);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        ita.kangaroo.model.Cart cart0 = new ita.kangaroo.model.Cart();
        ita.kangaroo.model.tipo tipo8 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean9 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo8);
        java.lang.String str10 = prodottoBean9.getImmagine();
        prodottoBean9.setPrezzo((float) (-1L));
        int int13 = prodottoBean9.getId();
        prodottoBean9.setPrezzo(10.0f);
        prodottoBean9.setPrezzo(0.0f);
        prodottoBean9.setNome("Data non disponibile");
        cart0.changeQuantity(prodottoBean9, (int) '4');
        ita.kangaroo.model.tipo tipo29 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean30 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo29);
        java.lang.String str31 = prodottoBean30.getImmagine();
        prodottoBean30.setPrezzo((float) (-1L));
        int int34 = prodottoBean30.getId();
        float float35 = prodottoBean30.getIva();
        prodottoBean30.setQuantita((int) ' ');
        ita.kangaroo.model.tipo tipo38 = prodottoBean30.getTipo();
        cart0.changeQuantity(prodottoBean30, (int) (short) 100);
        ita.kangaroo.model.CartProduct cartProduct42 = new ita.kangaroo.model.CartProduct(prodottoBean30, (-1));
        prodottoBean30.setId(1);
        prodottoBean30.setImmagine("3a987acf8cbc1028b7dbc86bd086831151899a2b");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 1.0f + "'", float35 == 1.0f);
        org.junit.Assert.assertNull(tipo38);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        float float2 = orderProductBean0.getIVA();
        orderProductBean0.setPrezzo(10.0f);
        orderProductBean0.setId_ordine((int) (short) 0);
        orderProductBean0.setIVA((-1.0f));
        orderProductBean0.setPrezzo((float) (byte) 10);
        orderProductBean0.setIVA((float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        ita.kangaroo.model.tipo tipo6 = null;
        ita.kangaroo.model.utenteBean utenteBean12 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo6, "hi!", "", "", "hi!", "");
        utenteBean12.setEmail("hi!");
        java.lang.String str15 = utenteBean12.getCognome();
        java.sql.Date date23 = null;
        ita.kangaroo.model.OrdineBean ordineBean25 = new ita.kangaroo.model.OrdineBean((int) (byte) 10, utenteBean12, (float) (-1L), "Data non disponibile", "Data non disponibile", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "hi!", "hi!", "", date23, "Data non disponibile");
        java.lang.String str26 = ordineBean25.toString();
        float float27 = ordineBean25.getPrezzo_totale();
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Data non disponibile" + "'", str26, "Data non disponibile");
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + (-1.0f) + "'", float27 == (-1.0f));
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "", "", "hi!", "hi!", "hi!");
        java.lang.String str12 = utenteBean11.getUsername();
        utenteBean11.setPassword("");
        ita.kangaroo.model.tipo tipo15 = null;
        utenteBean11.setTipo(tipo15);
        java.lang.String str17 = utenteBean11.getProvincia();
        ita.kangaroo.model.tipo tipo18 = null;
        utenteBean11.setTipo(tipo18);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        int int2 = orderProductBean0.getId_ordine();
        orderProductBean0.setQuantita((int) 'a');
        int int5 = orderProductBean0.getId_ordine();
        orderProductBean0.setId_ordine(100);
        int int8 = orderProductBean0.getQuantita();
        orderProductBean0.setId_prodotto(1);
        orderProductBean0.setPrezzo((float) 97);
        orderProductBean0.setQuantita((int) (short) 0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getDescrizione();
        java.lang.String str10 = prodottoBean8.getNome();
        ita.kangaroo.model.tipo tipo11 = prodottoBean8.getTipo();
        ita.kangaroo.model.tipo tipo12 = prodottoBean8.getTipo();
        int int13 = prodottoBean8.getId();
        java.lang.String str14 = prodottoBean8.getNome();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(tipo11);
        org.junit.Assert.assertNull(tipo12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        float float2 = orderProductBean0.getIVA();
        orderProductBean0.setPrezzo(10.0f);
        orderProductBean0.setQuantita((int) (short) -1);
        int int7 = orderProductBean0.getQuantita();
        orderProductBean0.setId_ordine((int) 'a');
        orderProductBean0.setId_prodotto((int) (byte) -1);
        int int12 = orderProductBean0.getQuantita();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        ita.kangaroo.model.tipo tipo19 = null;
        ita.kangaroo.model.utenteBean utenteBean25 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo19, "hi!", "", "", "hi!", "");
        utenteBean25.setEmail("hi!");
        ordineBean12.setClient(utenteBean25);
        java.lang.String str29 = utenteBean25.getEmail();
        java.lang.String str30 = utenteBean25.getCognome();
        java.lang.String str31 = utenteBean25.getNome();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        ita.kangaroo.model.tipo tipo6 = null;
        ita.kangaroo.model.utenteBean utenteBean12 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo6, "hi!", "", "", "hi!", "");
        java.lang.String str13 = utenteBean12.getUsername();
        java.lang.String str14 = utenteBean12.getCap();
        java.sql.Date date22 = null;
        ita.kangaroo.model.OrdineBean ordineBean24 = new ita.kangaroo.model.OrdineBean((int) (short) 0, utenteBean12, (float) 10L, "", "Data non disponibile", "hi!", "hi!", "", "", date22, "hi!");
        java.lang.String str25 = utenteBean12.getNome();
        java.lang.String str26 = utenteBean12.getPassword();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        ita.kangaroo.model.Cart cart0 = new ita.kangaroo.model.Cart();
        ita.kangaroo.model.tipo tipo8 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean9 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo8);
        java.lang.String str10 = prodottoBean9.getImmagine();
        prodottoBean9.setPrezzo((float) (-1L));
        int int13 = prodottoBean9.getId();
        prodottoBean9.setPrezzo(10.0f);
        prodottoBean9.setPrezzo(0.0f);
        prodottoBean9.setNome("Data non disponibile");
        cart0.changeQuantity(prodottoBean9, (int) '4');
        ita.kangaroo.model.tipo tipo29 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean30 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo29);
        java.lang.String str31 = prodottoBean30.getImmagine();
        prodottoBean30.setPrezzo((float) (-1L));
        int int34 = prodottoBean30.getId();
        float float35 = prodottoBean30.getIva();
        prodottoBean30.setQuantita((int) ' ');
        ita.kangaroo.model.tipo tipo38 = prodottoBean30.getTipo();
        cart0.changeQuantity(prodottoBean30, (int) (short) 100);
        ita.kangaroo.model.tipo tipo48 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean49 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo48);
        java.lang.String str50 = prodottoBean49.getImmagine();
        prodottoBean49.setPrezzo((float) (-1L));
        int int53 = prodottoBean49.getId();
        float float54 = prodottoBean49.getIva();
        prodottoBean49.setQuantita((int) ' ');
        ita.kangaroo.model.tipo tipo57 = prodottoBean49.getTipo();
        cart0.removeProduct(prodottoBean49);
        prodottoBean49.setId(0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 1.0f + "'", float35 == 1.0f);
        org.junit.Assert.assertNull(tipo38);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + float54 + "' != '" + 1.0f + "'", float54 == 1.0f);
        org.junit.Assert.assertNull(tipo57);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        ordineBean12.setNumero_carta("");
        java.sql.Date date16 = ordineBean12.getData();
        ordineBean12.setMetodo_di_pagamento("");
        ordineBean12.setNumero_di_tracking("");
        ordineBean12.setCircuito("hi!");
        java.lang.String str23 = ordineBean12.getDestinatario();
        java.lang.String str24 = ordineBean12.getIndirizzo_di_spedizione();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        ita.kangaroo.model.AddressBean addressBean0 = new ita.kangaroo.model.AddressBean();
        java.lang.String str1 = addressBean0.getVia();
        addressBean0.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        addressBean0.setCitta("hi!");
        addressBean0.setId((int) (byte) 0);
        addressBean0.setVia("ProdottoBean{id=0, descrizione='', nome='', immagine='', prezzo=0.0, quantita=0, iva=0.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        ita.kangaroo.model.Cart cart0 = new ita.kangaroo.model.Cart();
        ita.kangaroo.model.tipo tipo8 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean9 = new ita.kangaroo.model.ProdottoBean((int) (byte) -1, "Data non disponibile", "Data non disponibile", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", (float) ' ', (int) ' ', (float) ' ', tipo8);
        ita.kangaroo.model.CartProduct cartProduct10 = new ita.kangaroo.model.CartProduct(prodottoBean9);
        cart0.changeQuantity(prodottoBean9, 0);
        java.lang.String str13 = prodottoBean9.getImmagine();
        java.lang.String str14 = prodottoBean9.getImmagine();
        prodottoBean9.setQuantita(35);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}" + "'", str13, "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}" + "'", str14, "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        ita.kangaroo.model.AddressBean addressBean0 = new ita.kangaroo.model.AddressBean();
        java.lang.String str1 = addressBean0.getVia();
        java.lang.String str2 = addressBean0.getUsername();
        addressBean0.setUsername("hi!");
        ita.kangaroo.model.tipo tipo10 = null;
        ita.kangaroo.model.utenteBean utenteBean16 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo10, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean17 = new ita.kangaroo.model.OrdineBean(utenteBean16);
        java.lang.String str18 = ordineBean17.getMetodo_di_spedizione();
        ita.kangaroo.model.tipo tipo24 = null;
        ita.kangaroo.model.utenteBean utenteBean30 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo24, "hi!", "", "", "hi!", "");
        utenteBean30.setEmail("hi!");
        ordineBean17.setClient(utenteBean30);
        ordineBean17.setNumero_carta("");
        ordineBean17.setMetodo_di_pagamento("hi!");
        java.util.ArrayList<ita.kangaroo.model.OrderProductBean> orderProductBeanList38 = null;
        ordineBean17.setProducts(orderProductBeanList38);
        boolean boolean40 = addressBean0.equals((java.lang.Object) orderProductBeanList38);
        java.lang.String str41 = addressBean0.getCitta();
        java.lang.String str42 = addressBean0.getCitta();
        ita.kangaroo.model.tipo tipo48 = null;
        ita.kangaroo.model.utenteBean utenteBean54 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo48, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean55 = new ita.kangaroo.model.OrdineBean(utenteBean54);
        java.lang.String str56 = ordineBean55.getMetodo_di_spedizione();
        ordineBean55.setNumero_carta("");
        java.sql.Date date59 = ordineBean55.getData();
        ordineBean55.setMetodo_di_pagamento("");
        ordineBean55.setNumero_di_tracking("");
        ordineBean55.setCircuito("hi!");
        int int66 = ordineBean55.getId();
        ita.kangaroo.model.tipo tipo72 = null;
        ita.kangaroo.model.utenteBean utenteBean78 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo72, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean79 = new ita.kangaroo.model.OrdineBean(utenteBean78);
        utenteBean78.setPassword("hi!");
        utenteBean78.setNome("hi!");
        ordineBean55.setClient(utenteBean78);
        boolean boolean85 = addressBean0.equals((java.lang.Object) utenteBean78);
        java.lang.String str86 = utenteBean78.getCap();
        ita.kangaroo.model.tipo tipo87 = utenteBean78.getTipo();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNull(date59);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertNull(tipo87);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        ordineBean12.setNumero_carta("");
        java.sql.Date date16 = ordineBean12.getData();
        ordineBean12.setMetodo_di_pagamento("");
        ordineBean12.setNumero_di_tracking("");
        java.lang.String str21 = ordineBean12.toString();
        ita.kangaroo.model.tipo tipo28 = null;
        ita.kangaroo.model.utenteBean utenteBean34 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo28, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean35 = new ita.kangaroo.model.OrdineBean(utenteBean34);
        utenteBean34.setPassword("hi!");
        utenteBean34.setNome("hi!");
        java.sql.Date date47 = null;
        ita.kangaroo.model.OrdineBean ordineBean49 = new ita.kangaroo.model.OrdineBean((int) (byte) 100, utenteBean34, (float) (-1L), "hi!", "", "", "hi!", "Data non disponibile", "hi!", date47, "");
        ordineBean49.setIndirizzo_di_spedizione("Data non disponibile");
        java.lang.String str52 = ordineBean49.getDestinatario();
        java.lang.String str53 = ordineBean49.getDestinatario();
        ita.kangaroo.model.tipo tipo59 = null;
        ita.kangaroo.model.utenteBean utenteBean65 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo59, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean66 = new ita.kangaroo.model.OrdineBean(utenteBean65);
        java.lang.String str67 = ordineBean66.getMetodo_di_spedizione();
        java.util.ArrayList<ita.kangaroo.model.OrderProductBean> orderProductBeanList68 = ordineBean66.getProducts();
        ordineBean49.setProducts(orderProductBeanList68);
        ordineBean12.setProducts(orderProductBeanList68);
        ordineBean12.setMetodo_di_spedizione("");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Data non disponibile" + "'", str21, "Data non disponibile");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertNotNull(orderProductBeanList68);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        utenteBean11.setEmail("hi!");
        utenteBean11.setPassword("hi!");
        utenteBean11.setCognome("Data non disponibile");
        utenteBean11.setTelefono("Data non disponibile");
        java.lang.String str20 = utenteBean11.getCap();
        utenteBean11.setCognome("");
        java.lang.String str23 = utenteBean11.getPassword();
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "3a987acf8cbc1028b7dbc86bd086831151899a2b" + "'", str23, "3a987acf8cbc1028b7dbc86bd086831151899a2b");
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getImmagine();
        int int10 = prodottoBean8.getQuantita();
        java.lang.String str11 = prodottoBean8.getImmagine();
        ita.kangaroo.model.CartProduct cartProduct12 = new ita.kangaroo.model.CartProduct(prodottoBean8);
        prodottoBean8.setId((int) (short) 0);
        prodottoBean8.setId((int) (byte) 1);
        ita.kangaroo.model.tipo tipo17 = prodottoBean8.getTipo();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(tipo17);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        ita.kangaroo.model.AddressBean addressBean0 = new ita.kangaroo.model.AddressBean();
        addressBean0.setVia("hi!");
        java.lang.String str3 = addressBean0.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        ita.kangaroo.model.MetodoPagamentoBean metodoPagamentoBean0 = new ita.kangaroo.model.MetodoPagamentoBean();
        metodoPagamentoBean0.setId((int) 'a');
        ita.kangaroo.model.AddressBean addressBean3 = new ita.kangaroo.model.AddressBean();
        java.lang.String str4 = addressBean3.getVia();
        addressBean3.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        addressBean3.setCitta("hi!");
        boolean boolean9 = metodoPagamentoBean0.equals((java.lang.Object) addressBean3);
        java.lang.String str10 = metodoPagamentoBean0.getUsername();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getImmagine();
        prodottoBean8.setPrezzo((float) (-1L));
        int int12 = prodottoBean8.getId();
        prodottoBean8.setPrezzo(10.0f);
        prodottoBean8.setPrezzo(0.0f);
        prodottoBean8.setNome("Data non disponibile");
        ita.kangaroo.model.tipo tipo19 = prodottoBean8.getTipo();
        ita.kangaroo.model.CartProduct cartProduct20 = new ita.kangaroo.model.CartProduct(prodottoBean8);
        ita.kangaroo.model.tipo tipo21 = prodottoBean8.getTipo();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(tipo19);
        org.junit.Assert.assertNull(tipo21);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
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
        metodoPagamentoBean0.setId(0);
        metodoPagamentoBean0.setCircuito("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        metodoPagamentoBean0.setCircuito("3d1583397bcebff274b1e7cb58087c39153af974");
        metodoPagamentoBean0.setId((int) 'a');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        ita.kangaroo.model.tipo tipo18 = null;
        ita.kangaroo.model.utenteBean utenteBean24 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo18, "hi!", "", "", "hi!", "");
        utenteBean24.setEmail("hi!");
        utenteBean24.setPassword("hi!");
        java.lang.String str29 = utenteBean24.getCognome();
        ordineBean12.setClient(utenteBean24);
        java.util.ArrayList<ita.kangaroo.model.OrderProductBean> orderProductBeanList31 = ordineBean12.getProducts();
        java.lang.String str32 = ordineBean12.toString();
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(orderProductBeanList31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Data non disponibile" + "'", str32, "Data non disponibile");
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("Data non disponibile", "", "", "", "", tipo5, "Data non disponibile", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "hi!", "Data non disponibile", "Data non disponibile");
        ita.kangaroo.model.tipo tipo12 = null;
        utenteBean11.setTipo(tipo12);
        java.lang.String str14 = utenteBean11.getCognome();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        ita.kangaroo.model.MetodoPagamentoBean metodoPagamentoBean0 = new ita.kangaroo.model.MetodoPagamentoBean();
        metodoPagamentoBean0.setId((int) 'a');
        ita.kangaroo.model.AddressBean addressBean3 = new ita.kangaroo.model.AddressBean();
        java.lang.String str4 = addressBean3.getVia();
        addressBean3.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        addressBean3.setCitta("hi!");
        boolean boolean9 = metodoPagamentoBean0.equals((java.lang.Object) addressBean3);
        java.lang.String str10 = metodoPagamentoBean0.getNumero_carta();
        metodoPagamentoBean0.setNumero_carta("hi!");
        int int13 = metodoPagamentoBean0.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        ita.kangaroo.model.AddressBean addressBean5 = new ita.kangaroo.model.AddressBean(32, "hi!", "Data non disponibile", "hi!", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        java.lang.String str6 = addressBean5.getCAP();
        addressBean5.setCitta("ProdottoBean{id=10, descrizione='hi!', nome='', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getImmagine();
        prodottoBean8.setPrezzo((float) (-1L));
        int int12 = prodottoBean8.getId();
        ita.kangaroo.model.CartProduct cartProduct14 = new ita.kangaroo.model.CartProduct(prodottoBean8, (int) (short) -1);
        java.lang.String str15 = prodottoBean8.getNome();
        prodottoBean8.setIva((float) (short) 1);
        java.lang.String str18 = prodottoBean8.getDescrizione();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        ita.kangaroo.model.tipo tipo6 = null;
        ita.kangaroo.model.utenteBean utenteBean12 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo6, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean13 = new ita.kangaroo.model.OrdineBean(utenteBean12);
        utenteBean12.setPassword("hi!");
        utenteBean12.setNome("hi!");
        java.sql.Date date25 = null;
        ita.kangaroo.model.OrdineBean ordineBean27 = new ita.kangaroo.model.OrdineBean((int) (byte) 100, utenteBean12, (float) (-1L), "hi!", "", "", "hi!", "Data non disponibile", "hi!", date25, "");
        ordineBean27.setIndirizzo_di_spedizione("Data non disponibile");
        java.lang.String str30 = ordineBean27.getDestinatario();
        java.lang.String str31 = ordineBean27.getMetodo_di_pagamento();
        ita.kangaroo.model.tipo tipo38 = null;
        ita.kangaroo.model.utenteBean utenteBean44 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo38, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean45 = new ita.kangaroo.model.OrdineBean(utenteBean44);
        utenteBean44.setPassword("hi!");
        utenteBean44.setNome("hi!");
        java.sql.Date date57 = null;
        ita.kangaroo.model.OrdineBean ordineBean59 = new ita.kangaroo.model.OrdineBean((int) (byte) 100, utenteBean44, (float) (-1L), "hi!", "", "", "hi!", "Data non disponibile", "hi!", date57, "");
        java.lang.String str60 = utenteBean44.getCognome();
        ordineBean27.setClient(utenteBean44);
        java.lang.String str62 = ordineBean27.getNumero_carta();
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        ita.kangaroo.model.tipo tipo6 = null;
        ita.kangaroo.model.utenteBean utenteBean12 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo6, "hi!", "", "", "hi!", "");
        utenteBean12.setEmail("hi!");
        java.lang.String str15 = utenteBean12.getCognome();
        java.sql.Date date23 = null;
        ita.kangaroo.model.OrdineBean ordineBean25 = new ita.kangaroo.model.OrdineBean((int) (byte) 10, utenteBean12, (float) (-1L), "Data non disponibile", "Data non disponibile", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "hi!", "hi!", "", date23, "Data non disponibile");
        java.lang.String str26 = ordineBean25.toString();
        java.sql.Date date27 = ordineBean25.getData();
        ordineBean25.setMetodo_di_spedizione("");
        ita.kangaroo.model.tipo tipo36 = null;
        ita.kangaroo.model.utenteBean utenteBean42 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo36, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean43 = new ita.kangaroo.model.OrdineBean(utenteBean42);
        utenteBean42.setPassword("hi!");
        utenteBean42.setNome("hi!");
        java.sql.Date date55 = null;
        ita.kangaroo.model.OrdineBean ordineBean57 = new ita.kangaroo.model.OrdineBean((int) (byte) 100, utenteBean42, (float) (-1L), "hi!", "", "", "hi!", "Data non disponibile", "hi!", date55, "");
        ordineBean57.setIndirizzo_di_spedizione("Data non disponibile");
        java.lang.String str60 = ordineBean57.getDestinatario();
        java.lang.String str61 = ordineBean57.getDestinatario();
        ita.kangaroo.model.tipo tipo67 = null;
        ita.kangaroo.model.utenteBean utenteBean73 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo67, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean74 = new ita.kangaroo.model.OrdineBean(utenteBean73);
        java.lang.String str75 = ordineBean74.getMetodo_di_spedizione();
        java.util.ArrayList<ita.kangaroo.model.OrderProductBean> orderProductBeanList76 = ordineBean74.getProducts();
        ordineBean57.setProducts(orderProductBeanList76);
        ordineBean25.setProducts(orderProductBeanList76);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Data non disponibile" + "'", str26, "Data non disponibile");
        org.junit.Assert.assertNull(date27);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertNull(str75);
        org.junit.Assert.assertNotNull(orderProductBeanList76);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
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
        metodoPagamentoBean0.setNumero_carta("");
        metodoPagamentoBean0.setData_scadenza("Data non disponibile");
        metodoPagamentoBean0.setCircuito("hi!");
        metodoPagamentoBean0.setNumero_carta("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        ita.kangaroo.model.CartProduct cartProduct10 = new ita.kangaroo.model.CartProduct(prodottoBean8, (int) (short) 100);
        prodottoBean8.setNome("Data non disponibile");
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        ordineBean12.setIndirizzo_di_spedizione("Data non disponibile");
        ordineBean12.setPrezzo_totale((float) (byte) 10);
        java.sql.Date date17 = ordineBean12.getData();
        ordineBean12.setIndirizzo_di_spedizione("hi!");
        ordineBean12.setMetodo_di_spedizione("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        ordineBean12.setDestinatario("ProdottoBean{id=10, descrizione='hi!', nome='', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}");
        org.junit.Assert.assertNull(date17);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        ita.kangaroo.model.utenteBean utenteBean0 = new ita.kangaroo.model.utenteBean();
        java.lang.Class<?> wildcardClass1 = utenteBean0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
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
        ita.kangaroo.model.tipo tipo24 = null;
        ita.kangaroo.model.utenteBean utenteBean30 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo24, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean31 = new ita.kangaroo.model.OrdineBean(utenteBean30);
        java.lang.String str32 = ordineBean31.toString();
        boolean boolean33 = metodoPagamentoBean0.equals((java.lang.Object) str32);
        metodoPagamentoBean0.setCvv("");
        metodoPagamentoBean0.setId((int) 'a');
        metodoPagamentoBean0.setData_scadenza("3d1583397bcebff274b1e7cb58087c39153af974");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Data non disponibile" + "'", str32, "Data non disponibile");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
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
        metodoPagamentoBean0.setNumero_carta("");
        metodoPagamentoBean0.setData_scadenza("Data non disponibile");
        metodoPagamentoBean0.setCircuito("hi!");
        metodoPagamentoBean0.setUsername("Data non disponibile");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        java.lang.String str12 = utenteBean11.getVia();
        utenteBean11.setProvincia("");
        utenteBean11.setVia("3a987acf8cbc1028b7dbc86bd086831151899a2b");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        ordineBean12.setNumero_carta("");
        java.lang.String str16 = ordineBean12.getIndirizzo_di_spedizione();
        java.sql.Date date17 = null;
        ordineBean12.setData(date17);
        java.sql.Date date19 = ordineBean12.getData();
        ordineBean12.setDestinatario("ProdottoBean{id=10, descrizione='hi!', nome='', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(date19);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
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
        metodoPagamentoBean0.setUsername("hi!");
        metodoPagamentoBean0.setCvv("Data non disponibile");
        java.lang.String str23 = metodoPagamentoBean0.getCircuito();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
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
        java.lang.String str23 = metodoPagamentoBean0.getUsername();
        java.lang.String str24 = metodoPagamentoBean0.getCvv();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}" + "'", str23, "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        ita.kangaroo.model.tipo tipo6 = null;
        ita.kangaroo.model.utenteBean utenteBean12 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo6, "hi!", "", "", "hi!", "");
        java.lang.String str13 = utenteBean12.getVia();
        java.lang.String str14 = utenteBean12.getProvincia();
        java.sql.Date date22 = null;
        ita.kangaroo.model.OrdineBean ordineBean24 = new ita.kangaroo.model.OrdineBean((int) (byte) 10, utenteBean12, (float) ' ', "ProdottoBean{id=10, descrizione='hi!', nome='', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}", "3a987acf8cbc1028b7dbc86bd086831151899a2b", "hi!", "da39a3ee5e6b4b0d3255bfef95601890afd80709", "ProdottoBean{id=10, descrizione='hi!', nome='', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}", "", date22, "3a987acf8cbc1028b7dbc86bd086831151899a2b");
        float float25 = ordineBean24.getPrezzo_totale();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 32.0f + "'", float25 == 32.0f);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        ordineBean12.setNumero_carta("");
        java.sql.Date date16 = ordineBean12.getData();
        ordineBean12.setMetodo_di_pagamento("");
        ordineBean12.setNumero_di_tracking("");
        ordineBean12.setNumero_di_tracking("hi!");
        ordineBean12.setMetodo_di_spedizione("hi!");
        java.lang.String str25 = ordineBean12.getNumero_di_tracking();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        float float2 = orderProductBean0.getIVA();
        orderProductBean0.setPrezzo(10.0f);
        float float5 = orderProductBean0.getPrezzo();
        int int6 = orderProductBean0.getId_ordine();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10.0f + "'", float5 == 10.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.utenteBean utenteBean13 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo7, "hi!", "", "", "hi!", "");
        java.lang.String str14 = utenteBean13.getUsername();
        java.sql.Date date22 = null;
        ita.kangaroo.model.OrdineBean ordineBean24 = new ita.kangaroo.model.OrdineBean((int) ' ', utenteBean13, 0.0f, "", "hi!", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "", "Data non disponibile", date22, "");
        java.sql.Date date32 = null;
        ita.kangaroo.model.OrdineBean ordineBean34 = new ita.kangaroo.model.OrdineBean((int) (byte) -1, utenteBean13, (float) (byte) 1, "3d1583397bcebff274b1e7cb58087c39153af974", "ProdottoBean{id=0, descrizione='', nome='', immagine='', prezzo=0.0, quantita=0, iva=0.0, tipo=null}", "3d1583397bcebff274b1e7cb58087c39153af974", "3d1583397bcebff274b1e7cb58087c39153af974", "3d1583397bcebff274b1e7cb58087c39153af974", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", date32, "ProdottoBean{id=0, descrizione='', nome='', immagine='', prezzo=0.0, quantita=0, iva=0.0, tipo=null}");
        ordineBean34.setCircuito("da39a3ee5e6b4b0d3255bfef95601890afd80709");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        ita.kangaroo.model.AddressBean addressBean0 = new ita.kangaroo.model.AddressBean();
        java.lang.String str1 = addressBean0.getVia();
        java.lang.String str2 = addressBean0.getUsername();
        addressBean0.setUsername("hi!");
        addressBean0.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        addressBean0.setCitta("hi!");
        int int9 = addressBean0.getId();
        addressBean0.setId((int) (byte) -1);
        addressBean0.setId((-1));
        java.lang.String str14 = addressBean0.getCitta();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        int int2 = orderProductBean0.getId_ordine();
        orderProductBean0.setQuantita((int) 'a');
        int int5 = orderProductBean0.getId_ordine();
        int int6 = orderProductBean0.getId_ordine();
        float float7 = orderProductBean0.getPrezzo();
        orderProductBean0.setId_prodotto((int) (byte) 1);
        float float10 = orderProductBean0.getIVA();
        float float11 = orderProductBean0.getPrezzo();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        ita.kangaroo.model.Cart cart0 = new ita.kangaroo.model.Cart();
        ita.kangaroo.model.tipo tipo8 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean9 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo8);
        java.lang.String str10 = prodottoBean9.getImmagine();
        prodottoBean9.setPrezzo((float) (-1L));
        int int13 = prodottoBean9.getId();
        prodottoBean9.setPrezzo(10.0f);
        prodottoBean9.setPrezzo(0.0f);
        prodottoBean9.setNome("Data non disponibile");
        cart0.changeQuantity(prodottoBean9, (int) '4');
        ita.kangaroo.model.tipo tipo29 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean30 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo29);
        java.lang.String str31 = prodottoBean30.getDescrizione();
        java.lang.String str32 = prodottoBean30.getNome();
        int int33 = prodottoBean30.getQuantita();
        prodottoBean30.setDescrizione("hi!");
        ita.kangaroo.model.tipo tipo36 = null;
        prodottoBean30.setTipo(tipo36);
        cart0.addProduct(prodottoBean30);
        java.util.ArrayList<ita.kangaroo.model.CartProduct> cartProductList39 = cart0.getProducts();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(cartProductList39);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getDestinatario();
        java.lang.String str14 = ordineBean12.toString();
        ordineBean12.setMetodo_di_pagamento("");
        java.lang.String str17 = ordineBean12.getMetodo_di_pagamento();
        java.lang.String str18 = ordineBean12.getNumero_carta();
        ita.kangaroo.model.tipo tipo24 = null;
        ita.kangaroo.model.utenteBean utenteBean30 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo24, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean31 = new ita.kangaroo.model.OrdineBean(utenteBean30);
        java.lang.String str32 = ordineBean31.getMetodo_di_spedizione();
        ordineBean31.setNumero_carta("");
        java.lang.String str35 = ordineBean31.getIndirizzo_di_spedizione();
        java.sql.Date date36 = null;
        ordineBean31.setData(date36);
        ita.kangaroo.model.tipo tipo45 = null;
        ita.kangaroo.model.utenteBean utenteBean51 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo45, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean52 = new ita.kangaroo.model.OrdineBean(utenteBean51);
        utenteBean51.setPassword("hi!");
        utenteBean51.setNome("hi!");
        java.sql.Date date64 = null;
        ita.kangaroo.model.OrdineBean ordineBean66 = new ita.kangaroo.model.OrdineBean((int) (byte) 100, utenteBean51, (float) (-1L), "hi!", "", "", "hi!", "Data non disponibile", "hi!", date64, "");
        java.lang.String str67 = utenteBean51.getCognome();
        java.sql.Date date75 = null;
        ita.kangaroo.model.OrdineBean ordineBean77 = new ita.kangaroo.model.OrdineBean((int) (short) 1, utenteBean51, (float) 'a', "hi!", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "Data non disponibile", "Data non disponibile", "", "Data non disponibile", date75, "Data non disponibile");
        java.lang.String str78 = utenteBean51.getVia();
        ordineBean31.setClient(utenteBean51);
        ordineBean12.setClient(utenteBean51);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Data non disponibile" + "'", str14, "Data non disponibile");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "hi!" + "'", str78, "hi!");
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) -1, "Data non disponibile", "Data non disponibile", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", (float) ' ', (int) ' ', (float) ' ', tipo7);
        ita.kangaroo.model.CartProduct cartProduct9 = new ita.kangaroo.model.CartProduct(prodottoBean8);
        int int10 = prodottoBean8.getQuantita();
        prodottoBean8.setIva((float) (short) 10);
        prodottoBean8.setId((int) ' ');
        java.lang.String str15 = prodottoBean8.toString();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ProdottoBean{id=32, descrizione='Data non disponibile', nome='Data non disponibile', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=32.0, quantita=32, iva=10.0, tipo=null}" + "'", str15, "ProdottoBean{id=32, descrizione='Data non disponibile', nome='Data non disponibile', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=32.0, quantita=32, iva=10.0, tipo=null}");
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        ita.kangaroo.model.MetodoPagamentoBean metodoPagamentoBean0 = new ita.kangaroo.model.MetodoPagamentoBean();
        metodoPagamentoBean0.setId((int) 'a');
        ita.kangaroo.model.AddressBean addressBean3 = new ita.kangaroo.model.AddressBean();
        java.lang.String str4 = addressBean3.getVia();
        addressBean3.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        addressBean3.setCitta("hi!");
        boolean boolean9 = metodoPagamentoBean0.equals((java.lang.Object) addressBean3);
        java.lang.String str10 = addressBean3.getCitta();
        addressBean3.setUsername("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        addressBean3.setCAP("3d1583397bcebff274b1e7cb58087c39153af974");
        addressBean3.setUsername("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='hi!', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        java.lang.String str12 = utenteBean11.getUsername();
        java.lang.String str13 = utenteBean11.getCap();
        utenteBean11.setUsername("");
        ita.kangaroo.model.OrdineBean ordineBean16 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        ita.kangaroo.model.tipo tipo17 = null;
        utenteBean11.setTipo(tipo17);
        java.lang.String str19 = utenteBean11.getCap();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        int int2 = orderProductBean0.getId_ordine();
        orderProductBean0.setQuantita((int) 'a');
        int int5 = orderProductBean0.getId_ordine();
        orderProductBean0.setIVA(100.0f);
        float float8 = orderProductBean0.getPrezzo();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        ita.kangaroo.model.CartProduct cartProduct10 = new ita.kangaroo.model.CartProduct(prodottoBean8, (int) (short) 100);
        ita.kangaroo.model.tipo tipo11 = null;
        prodottoBean8.setTipo(tipo11);
        java.lang.String str13 = prodottoBean8.getImmagine();
        java.lang.String str14 = prodottoBean8.getNome();
        java.lang.String str15 = prodottoBean8.toString();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='hi!', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}" + "'", str15, "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='hi!', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getImmagine();
        int int10 = prodottoBean8.getQuantita();
        java.lang.String str11 = prodottoBean8.getImmagine();
        ita.kangaroo.model.CartProduct cartProduct12 = new ita.kangaroo.model.CartProduct(prodottoBean8);
        prodottoBean8.setId((int) (short) 0);
        prodottoBean8.setId((int) (byte) 1);
        prodottoBean8.setNome("da39a3ee5e6b4b0d3255bfef95601890afd80709");
        java.lang.String str19 = prodottoBean8.getImmagine();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        ita.kangaroo.model.tipo tipo6 = null;
        ita.kangaroo.model.utenteBean utenteBean12 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo6, "hi!", "", "", "hi!", "");
        utenteBean12.setEmail("hi!");
        java.lang.String str15 = utenteBean12.getCognome();
        utenteBean12.setCitta("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        utenteBean12.setUsername("Data non disponibile");
        java.sql.Date date27 = null;
        ita.kangaroo.model.OrdineBean ordineBean29 = new ita.kangaroo.model.OrdineBean(0, utenteBean12, (float) (byte) 0, "", "", "Data non disponibile", "Data non disponibile", "hi!", "", date27, "Data non disponibile");
        ordineBean29.setMetodo_di_pagamento("Data non disponibile");
        ita.kangaroo.model.utenteBean utenteBean32 = ordineBean29.getClient();
        ordineBean29.setId((int) 'a');
        java.lang.String str35 = ordineBean29.getDestinatario();
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(utenteBean32);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getImmagine();
        int int10 = prodottoBean8.getQuantita();
        java.lang.String str11 = prodottoBean8.getImmagine();
        ita.kangaroo.model.CartProduct cartProduct12 = new ita.kangaroo.model.CartProduct(prodottoBean8);
        float float13 = prodottoBean8.getPrezzo();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        float float2 = orderProductBean0.getIVA();
        orderProductBean0.setPrezzo(10.0f);
        orderProductBean0.setQuantita((int) (short) -1);
        int int7 = orderProductBean0.getQuantita();
        orderProductBean0.setQuantita((int) (byte) 1);
        int int10 = orderProductBean0.getQuantita();
        float float11 = orderProductBean0.getPrezzo();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        utenteBean11.setEmail("hi!");
        utenteBean11.setPassword("hi!");
        utenteBean11.setProvincia("hi!");
        ita.kangaroo.model.OrdineBean ordineBean18 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        ordineBean18.setMetodo_di_spedizione("hi!");
        java.lang.String str21 = ordineBean18.getMetodo_di_spedizione();
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        int int2 = orderProductBean0.getId_ordine();
        orderProductBean0.setQuantita((int) 'a');
        float float5 = orderProductBean0.getIVA();
        orderProductBean0.setQuantita((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        ita.kangaroo.model.AddressBean addressBean0 = new ita.kangaroo.model.AddressBean();
        addressBean0.setVia("hi!");
        addressBean0.setUsername("");
        java.lang.String str5 = addressBean0.getUsername();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        ita.kangaroo.model.AddressBean addressBean5 = new ita.kangaroo.model.AddressBean((int) '4', "ProdottoBean{id=10, descrizione='hi!', nome='', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}", "", "3a987acf8cbc1028b7dbc86bd086831151899a2b", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        addressBean5.setVia("3d1583397bcebff274b1e7cb58087c39153af974");
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        float float2 = orderProductBean0.getIVA();
        orderProductBean0.setPrezzo(10.0f);
        orderProductBean0.setQuantita((int) (short) -1);
        int int7 = orderProductBean0.getQuantita();
        orderProductBean0.setId_ordine((int) 'a');
        orderProductBean0.setId_prodotto((int) '#');
        int int12 = orderProductBean0.getId_prodotto();
        orderProductBean0.setId_ordine((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        float float2 = orderProductBean0.getIVA();
        orderProductBean0.setPrezzo(10.0f);
        orderProductBean0.setQuantita((int) (short) -1);
        int int7 = orderProductBean0.getQuantita();
        orderProductBean0.setQuantita((int) (byte) 1);
        int int10 = orderProductBean0.getQuantita();
        orderProductBean0.setIVA(0.0f);
        orderProductBean0.setIVA((float) 0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        ita.kangaroo.model.AddressBean addressBean0 = new ita.kangaroo.model.AddressBean();
        java.lang.String str1 = addressBean0.getVia();
        java.lang.String str2 = addressBean0.getUsername();
        java.lang.String str3 = addressBean0.getCAP();
        java.lang.String str4 = addressBean0.getUsername();
        addressBean0.setId(10);
        int int7 = addressBean0.getId();
        java.lang.String str8 = addressBean0.getUsername();
        java.lang.String str9 = addressBean0.getUsername();
        ita.kangaroo.model.tipo tipo16 = null;
        ita.kangaroo.model.utenteBean utenteBean22 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo16, "hi!", "", "", "hi!", "");
        utenteBean22.setEmail("hi!");
        java.lang.String str25 = utenteBean22.getCognome();
        utenteBean22.setCitta("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        utenteBean22.setUsername("Data non disponibile");
        java.sql.Date date37 = null;
        ita.kangaroo.model.OrdineBean ordineBean39 = new ita.kangaroo.model.OrdineBean(0, utenteBean22, (float) (byte) 0, "", "", "Data non disponibile", "Data non disponibile", "hi!", "", date37, "Data non disponibile");
        ordineBean39.setMetodo_di_pagamento("Data non disponibile");
        boolean boolean42 = addressBean0.equals((java.lang.Object) ordineBean39);
        addressBean0.setVia("da39a3ee5e6b4b0d3255bfef95601890afd80709");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "Data non disponibile", "Data non disponibile", tipo5, "ProdottoBean{id=10, descrizione='hi!', nome='', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}", "ProdottoBean{id=0, descrizione='', nome='', immagine='', prezzo=0.0, quantita=0, iva=0.0, tipo=null}", "hi!", "Data non disponibile", "ProdottoBean{id=0, descrizione='', nome='', immagine='', prezzo=0.0, quantita=0, iva=0.0, tipo=null}");
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        float float2 = orderProductBean0.getIVA();
        float float3 = orderProductBean0.getPrezzo();
        int int4 = orderProductBean0.getId_ordine();
        orderProductBean0.setPrezzo((float) (short) 0);
        orderProductBean0.setId_ordine((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        ordineBean12.setNumero_carta("");
        java.sql.Date date16 = ordineBean12.getData();
        ordineBean12.setMetodo_di_pagamento("");
        ordineBean12.setNumero_di_tracking("");
        ordineBean12.setNumero_di_tracking("hi!");
        ordineBean12.setMetodo_di_spedizione("hi!");
        ita.kangaroo.model.tipo tipo30 = null;
        ita.kangaroo.model.utenteBean utenteBean36 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo30, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean37 = new ita.kangaroo.model.OrdineBean(utenteBean36);
        java.lang.String str38 = ordineBean37.getMetodo_di_spedizione();
        ita.kangaroo.model.tipo tipo44 = null;
        ita.kangaroo.model.utenteBean utenteBean50 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo44, "hi!", "", "", "hi!", "");
        utenteBean50.setEmail("hi!");
        ordineBean37.setClient(utenteBean50);
        ita.kangaroo.model.utenteBean utenteBean54 = ordineBean37.getClient();
        java.lang.String str55 = utenteBean54.getCitta();
        ordineBean12.setClient(utenteBean54);
        java.lang.String str57 = utenteBean54.getNome();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(utenteBean54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        ordineBean12.setNumero_carta("");
        java.sql.Date date16 = ordineBean12.getData();
        ordineBean12.setMetodo_di_pagamento("");
        ordineBean12.setNumero_di_tracking("");
        ordineBean12.setNumero_di_tracking("hi!");
        java.lang.String str23 = ordineBean12.getIndirizzo_di_spedizione();
        ordineBean12.setCircuito("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        java.util.ArrayList<ita.kangaroo.model.OrderProductBean> orderProductBeanList26 = ordineBean12.getProducts();
        java.util.ArrayList<ita.kangaroo.model.OrderProductBean> orderProductBeanList27 = ordineBean12.getProducts();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(orderProductBeanList26);
        org.junit.Assert.assertNotNull(orderProductBeanList27);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        ita.kangaroo.model.MetodoPagamentoBean metodoPagamentoBean0 = new ita.kangaroo.model.MetodoPagamentoBean();
        metodoPagamentoBean0.setId((int) 'a');
        metodoPagamentoBean0.setCircuito("");
        metodoPagamentoBean0.setData_scadenza("hi!");
        metodoPagamentoBean0.setUsername("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='hi!', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        ita.kangaroo.model.Cart cart0 = new ita.kangaroo.model.Cart();
        ita.kangaroo.model.tipo tipo8 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean9 = new ita.kangaroo.model.ProdottoBean((int) (byte) 10, "hi!", "hi!", "Data non disponibile", (float) (byte) 10, 10, (float) ' ', tipo8);
        cart0.removeProduct(prodottoBean9);
        prodottoBean9.setId((int) '4');
        prodottoBean9.setPrezzo(0.0f);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        ordineBean12.setNumero_carta("");
        java.lang.String str16 = ordineBean12.getIndirizzo_di_spedizione();
        java.lang.String str17 = ordineBean12.getIndirizzo_di_spedizione();
        ordineBean12.setId((int) '4');
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        ita.kangaroo.model.AddressBean addressBean5 = new ita.kangaroo.model.AddressBean((int) (byte) -1, "3a987acf8cbc1028b7dbc86bd086831151899a2b", "hi!", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "hi!");
        java.lang.String str6 = addressBean5.getUsername();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        ita.kangaroo.model.MetodoPagamentoBean metodoPagamentoBean0 = new ita.kangaroo.model.MetodoPagamentoBean();
        metodoPagamentoBean0.setId((int) 'a');
        ita.kangaroo.model.AddressBean addressBean3 = new ita.kangaroo.model.AddressBean();
        java.lang.String str4 = addressBean3.getVia();
        addressBean3.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        addressBean3.setCitta("hi!");
        boolean boolean9 = metodoPagamentoBean0.equals((java.lang.Object) addressBean3);
        java.lang.String str10 = metodoPagamentoBean0.getNumero_carta();
        java.lang.String str11 = metodoPagamentoBean0.getUsername();
        java.lang.String str12 = metodoPagamentoBean0.getCvv();
        metodoPagamentoBean0.setCircuito("");
        metodoPagamentoBean0.setUsername("ProdottoBean{id=32, descrizione='Data non disponibile', nome='Data non disponibile', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=32.0, quantita=32, iva=10.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        ita.kangaroo.model.Cart cart0 = new ita.kangaroo.model.Cart();
        ita.kangaroo.model.tipo tipo8 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean9 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo8);
        int int10 = prodottoBean9.getId();
        java.lang.String str11 = prodottoBean9.getImmagine();
        cart0.removeProduct(prodottoBean9);
        ita.kangaroo.model.tipo tipo13 = prodottoBean9.getTipo();
        float float14 = prodottoBean9.getPrezzo();
        ita.kangaroo.model.CartProduct cartProduct15 = new ita.kangaroo.model.CartProduct(prodottoBean9);
        prodottoBean9.setPrezzo((float) (short) 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(tipo13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        ita.kangaroo.model.Cart cart0 = new ita.kangaroo.model.Cart();
        ita.kangaroo.model.tipo tipo8 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean9 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo8);
        java.lang.String str10 = prodottoBean9.getImmagine();
        prodottoBean9.setPrezzo((float) (-1L));
        int int13 = prodottoBean9.getId();
        prodottoBean9.setPrezzo(10.0f);
        prodottoBean9.setPrezzo(0.0f);
        prodottoBean9.setNome("Data non disponibile");
        cart0.changeQuantity(prodottoBean9, (int) '4');
        ita.kangaroo.model.tipo tipo29 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean30 = new ita.kangaroo.model.ProdottoBean((int) (short) -1, "", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "Data non disponibile", (float) (byte) 10, (int) (byte) 10, (float) (short) 0, tipo29);
        cart0.addProduct(prodottoBean30);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "", "", "hi!", "hi!", "hi!");
        java.lang.String str12 = utenteBean11.getUsername();
        utenteBean11.setPassword("");
        utenteBean11.setTelefono("Data non disponibile");
        java.lang.String str17 = utenteBean11.getEmail();
        ita.kangaroo.model.tipo tipo18 = null;
        utenteBean11.setTipo(tipo18);
        ita.kangaroo.model.tipo tipo20 = utenteBean11.getTipo();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(tipo20);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        ordineBean12.setNumero_carta("");
        java.sql.Date date16 = ordineBean12.getData();
        java.lang.String str17 = ordineBean12.getIndirizzo_di_spedizione();
        ordineBean12.setMetodo_di_spedizione("");
        java.lang.String str20 = ordineBean12.getIndirizzo_di_spedizione();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        ita.kangaroo.model.tipo tipo19 = null;
        ita.kangaroo.model.utenteBean utenteBean25 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo19, "hi!", "", "", "hi!", "");
        utenteBean25.setEmail("hi!");
        ordineBean12.setClient(utenteBean25);
        utenteBean25.setCap("hi!");
        utenteBean25.setUsername("da39a3ee5e6b4b0d3255bfef95601890afd80709");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "", "", "hi!", "hi!", "hi!");
        java.lang.String str12 = utenteBean11.getPassword();
        utenteBean11.setProvincia("Data non disponibile");
        utenteBean11.setCognome("hi!");
        utenteBean11.setNome("");
        utenteBean11.setVia("");
        ita.kangaroo.model.tipo tipo21 = utenteBean11.getTipo();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(tipo21);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        ita.kangaroo.model.tipo tipo6 = null;
        ita.kangaroo.model.utenteBean utenteBean12 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo6, "hi!", "", "", "hi!", "");
        utenteBean12.setEmail("hi!");
        utenteBean12.setPassword("hi!");
        utenteBean12.setProvincia("hi!");
        utenteBean12.setUsername("hi!");
        utenteBean12.setCognome("hi!");
        java.sql.Date date30 = null;
        ita.kangaroo.model.OrdineBean ordineBean32 = new ita.kangaroo.model.OrdineBean((int) (byte) 10, utenteBean12, (float) (short) 100, "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "hi!", "", "", "hi!", "", date30, "");
        java.lang.String str33 = utenteBean12.getCitta();
        ita.kangaroo.model.OrdineBean ordineBean34 = new ita.kangaroo.model.OrdineBean(utenteBean12);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getDescrizione();
        prodottoBean8.setImmagine("");
        java.lang.String str12 = prodottoBean8.toString();
        prodottoBean8.setPrezzo(0.0f);
        ita.kangaroo.model.CartProduct cartProduct16 = new ita.kangaroo.model.CartProduct(prodottoBean8, (int) (short) -1);
        ita.kangaroo.model.ProdottoBean prodottoBean17 = cartProduct16.getProduct();
        cartProduct16.setQuantity((int) (byte) 100);
        int int20 = cartProduct16.getQuantity();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}" + "'", str12, "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        org.junit.Assert.assertNotNull(prodottoBean17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        utenteBean11.setEmail("hi!");
        utenteBean11.setPassword("hi!");
        utenteBean11.setProvincia("hi!");
        utenteBean11.setUsername("hi!");
        java.lang.String str20 = utenteBean11.getTelefono();
        java.lang.String str21 = utenteBean11.getNome();
        utenteBean11.setTelefono("");
        utenteBean11.setProvincia("");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        utenteBean11.setCognome("Data non disponibile");
        java.lang.String str14 = utenteBean11.getPassword();
        java.lang.String str15 = utenteBean11.getCap();
        utenteBean11.setPassword("ProdottoBean{id=0, descrizione='', nome='', immagine='', prezzo=0.0, quantita=0, iva=0.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        ita.kangaroo.model.AddressBean addressBean0 = new ita.kangaroo.model.AddressBean();
        java.lang.String str1 = addressBean0.getVia();
        java.lang.String str2 = addressBean0.getUsername();
        java.lang.String str3 = addressBean0.getCAP();
        java.lang.String str4 = addressBean0.getUsername();
        addressBean0.setId(10);
        addressBean0.setId((int) (short) 100);
        java.lang.String str9 = addressBean0.getVia();
        java.lang.String str10 = addressBean0.getVia();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        ita.kangaroo.model.Cart cart0 = new ita.kangaroo.model.Cart();
        ita.kangaroo.model.tipo tipo8 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean9 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo8);
        java.lang.String str10 = prodottoBean9.getImmagine();
        prodottoBean9.setPrezzo((float) (-1L));
        int int13 = prodottoBean9.getId();
        prodottoBean9.setPrezzo(10.0f);
        prodottoBean9.setPrezzo(0.0f);
        prodottoBean9.setNome("Data non disponibile");
        cart0.changeQuantity(prodottoBean9, (int) '4');
        java.lang.String str22 = prodottoBean9.getDescrizione();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getDescrizione();
        java.lang.String str10 = prodottoBean8.getNome();
        int int11 = prodottoBean8.getQuantita();
        prodottoBean8.setDescrizione("hi!");
        ita.kangaroo.model.tipo tipo14 = null;
        prodottoBean8.setTipo(tipo14);
        ita.kangaroo.model.tipo tipo16 = prodottoBean8.getTipo();
        java.lang.String str17 = prodottoBean8.getNome();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(tipo16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        ordineBean12.setNumero_carta("hi!");
        java.sql.Date date16 = null;
        ordineBean12.setData(date16);
        ordineBean12.setMetodo_di_pagamento("3a987acf8cbc1028b7dbc86bd086831151899a2b");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        ita.kangaroo.model.Cart cart0 = new ita.kangaroo.model.Cart();
        ita.kangaroo.model.tipo tipo8 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean9 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo8);
        java.lang.String str10 = prodottoBean9.getImmagine();
        prodottoBean9.setPrezzo((float) (-1L));
        int int13 = prodottoBean9.getId();
        prodottoBean9.setPrezzo(10.0f);
        prodottoBean9.setPrezzo(0.0f);
        prodottoBean9.setNome("Data non disponibile");
        cart0.changeQuantity(prodottoBean9, (int) '4');
        ita.kangaroo.model.tipo tipo29 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean30 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo29);
        java.lang.String str31 = prodottoBean30.getImmagine();
        prodottoBean30.setPrezzo((float) (-1L));
        int int34 = prodottoBean30.getId();
        float float35 = prodottoBean30.getIva();
        prodottoBean30.setQuantita((int) ' ');
        ita.kangaroo.model.tipo tipo38 = prodottoBean30.getTipo();
        cart0.changeQuantity(prodottoBean30, (int) (short) 100);
        ita.kangaroo.model.tipo tipo48 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean49 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo48);
        java.lang.String str50 = prodottoBean49.getImmagine();
        prodottoBean49.setPrezzo((float) (-1L));
        int int53 = prodottoBean49.getId();
        float float54 = prodottoBean49.getIva();
        prodottoBean49.setQuantita((int) ' ');
        ita.kangaroo.model.tipo tipo57 = prodottoBean49.getTipo();
        cart0.removeProduct(prodottoBean49);
        ita.kangaroo.model.tipo tipo66 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean67 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo66);
        int int68 = prodottoBean67.getId();
        cart0.changeQuantity(prodottoBean67, 97);
        java.util.ArrayList<ita.kangaroo.model.CartProduct> cartProductList71 = cart0.getProducts();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 1.0f + "'", float35 == 1.0f);
        org.junit.Assert.assertNull(tipo38);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + float54 + "' != '" + 1.0f + "'", float54 == 1.0f);
        org.junit.Assert.assertNull(tipo57);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1 + "'", int68 == 1);
        org.junit.Assert.assertNotNull(cartProductList71);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        ordineBean12.setNumero_carta("");
        java.sql.Date date16 = ordineBean12.getData();
        ordineBean12.setPrezzo_totale((float) 'a');
        ordineBean12.setMetodo_di_spedizione("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        ordineBean12.setMetodo_di_pagamento("");
        ordineBean12.setId(0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(date16);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        utenteBean11.setEmail("hi!");
        utenteBean11.setPassword("hi!");
        utenteBean11.setProvincia("hi!");
        utenteBean11.setUsername("hi!");
        java.lang.String str20 = utenteBean11.getTelefono();
        java.lang.String str21 = utenteBean11.getTelefono();
        java.lang.String str22 = utenteBean11.getUsername();
        java.lang.String str23 = utenteBean11.getNome();
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getDestinatario();
        java.lang.String str14 = ordineBean12.toString();
        ordineBean12.setPrezzo_totale((float) (short) 0);
        ita.kangaroo.model.tipo tipo22 = null;
        ita.kangaroo.model.utenteBean utenteBean28 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo22, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean29 = new ita.kangaroo.model.OrdineBean(utenteBean28);
        ita.kangaroo.model.tipo tipo35 = null;
        ita.kangaroo.model.utenteBean utenteBean41 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo35, "hi!", "", "", "hi!", "");
        utenteBean41.setEmail("hi!");
        utenteBean41.setPassword("hi!");
        java.lang.String str46 = utenteBean41.getCognome();
        ordineBean29.setClient(utenteBean41);
        java.util.ArrayList<ita.kangaroo.model.OrderProductBean> orderProductBeanList48 = ordineBean29.getProducts();
        ordineBean12.setProducts(orderProductBeanList48);
        java.lang.String str50 = ordineBean12.getMetodo_di_spedizione();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Data non disponibile" + "'", str14, "Data non disponibile");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(orderProductBeanList48);
        org.junit.Assert.assertNull(str50);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        ita.kangaroo.model.tipo tipo19 = null;
        ita.kangaroo.model.utenteBean utenteBean25 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo19, "hi!", "", "", "hi!", "");
        utenteBean25.setEmail("hi!");
        ordineBean12.setClient(utenteBean25);
        ordineBean12.setNumero_carta("");
        ordineBean12.setMetodo_di_pagamento("hi!");
        java.util.ArrayList<ita.kangaroo.model.OrderProductBean> orderProductBeanList33 = null;
        ordineBean12.setProducts(orderProductBeanList33);
        java.lang.String str35 = ordineBean12.getDestinatario();
        java.lang.String str36 = ordineBean12.getMetodo_di_spedizione();
        java.sql.Date date37 = null;
        ordineBean12.setData(date37);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str36);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        ita.kangaroo.model.tipo tipo6 = null;
        ita.kangaroo.model.utenteBean utenteBean12 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo6, "", "", "hi!", "hi!", "hi!");
        java.lang.String str13 = utenteBean12.getUsername();
        utenteBean12.setTelefono("");
        utenteBean12.setTelefono("3d1583397bcebff274b1e7cb58087c39153af974");
        java.sql.Date date25 = null;
        ita.kangaroo.model.OrdineBean ordineBean27 = new ita.kangaroo.model.OrdineBean((int) (short) -1, utenteBean12, (float) 1, "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='hi!', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "hi!", "", "ProdottoBean{id=0, descrizione='', nome='', immagine='', prezzo=0.0, quantita=0, iva=0.0, tipo=null}", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='hi!', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='hi!', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", date25, "ProdottoBean{id=10, descrizione='hi!', nome='', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        java.lang.String str12 = utenteBean11.getCitta();
        utenteBean11.setTelefono("Data non disponibile");
        utenteBean11.setCap("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='hi!', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        float float2 = orderProductBean0.getIVA();
        int int3 = orderProductBean0.getId_prodotto();
        float float4 = orderProductBean0.getPrezzo();
        ita.kangaroo.model.OrderProductBean orderProductBean5 = new ita.kangaroo.model.OrderProductBean();
        float float6 = orderProductBean5.getIVA();
        float float7 = orderProductBean5.getIVA();
        ita.kangaroo.model.OrderProductBean orderProductBean8 = new ita.kangaroo.model.OrderProductBean();
        float float9 = orderProductBean8.getIVA();
        orderProductBean8.setQuantita((int) (byte) 100);
        orderProductBean8.setPrezzo((float) (-1));
        ita.kangaroo.model.OrderProductBean orderProductBean14 = new ita.kangaroo.model.OrderProductBean();
        float float15 = orderProductBean14.getIVA();
        float float16 = orderProductBean14.getIVA();
        int int17 = orderProductBean14.getId_prodotto();
        float float18 = orderProductBean14.getPrezzo();
        ita.kangaroo.model.OrderProductBean orderProductBean19 = new ita.kangaroo.model.OrderProductBean();
        float float20 = orderProductBean19.getIVA();
        orderProductBean19.setQuantita((int) (byte) 100);
        ita.kangaroo.model.OrderProductBean orderProductBean23 = new ita.kangaroo.model.OrderProductBean();
        float float24 = orderProductBean23.getIVA();
        float float25 = orderProductBean23.getIVA();
        float float26 = orderProductBean23.getPrezzo();
        ita.kangaroo.model.OrderProductBean orderProductBean27 = new ita.kangaroo.model.OrderProductBean();
        float float28 = orderProductBean27.getIVA();
        float float29 = orderProductBean27.getIVA();
        float float30 = orderProductBean27.getPrezzo();
        ita.kangaroo.model.OrderProductBean orderProductBean31 = new ita.kangaroo.model.OrderProductBean();
        float float32 = orderProductBean31.getIVA();
        float float33 = orderProductBean31.getIVA();
        int int34 = orderProductBean31.getId_prodotto();
        float float35 = orderProductBean31.getPrezzo();
        ita.kangaroo.model.OrderProductBean orderProductBean36 = new ita.kangaroo.model.OrderProductBean();
        ita.kangaroo.model.OrderProductBean orderProductBean37 = new ita.kangaroo.model.OrderProductBean();
        float float38 = orderProductBean37.getIVA();
        float float39 = orderProductBean37.getIVA();
        orderProductBean37.setPrezzo(10.0f);
        orderProductBean37.setId_ordine((int) (short) 0);
        orderProductBean37.setIVA((-1.0f));
        ita.kangaroo.model.OrderProductBean orderProductBean46 = new ita.kangaroo.model.OrderProductBean();
        float float47 = orderProductBean46.getIVA();
        int int48 = orderProductBean46.getId_ordine();
        orderProductBean46.setQuantita((int) 'a');
        int int51 = orderProductBean46.getId_ordine();
        orderProductBean46.setId_ordine(100);
        ita.kangaroo.model.OrderProductBean orderProductBean54 = new ita.kangaroo.model.OrderProductBean();
        float float55 = orderProductBean54.getIVA();
        int int56 = orderProductBean54.getId_ordine();
        int int57 = orderProductBean54.getQuantita();
        ita.kangaroo.model.OrderProductBean orderProductBean58 = new ita.kangaroo.model.OrderProductBean();
        float float59 = orderProductBean58.getIVA();
        float float60 = orderProductBean58.getIVA();
        int int61 = orderProductBean58.getId_prodotto();
        ita.kangaroo.model.OrderProductBean orderProductBean62 = new ita.kangaroo.model.OrderProductBean();
        float float63 = orderProductBean62.getIVA();
        float float64 = orderProductBean62.getIVA();
        int int65 = orderProductBean62.getId_prodotto();
        ita.kangaroo.model.OrderProductBean orderProductBean66 = new ita.kangaroo.model.OrderProductBean();
        float float67 = orderProductBean66.getIVA();
        int int68 = orderProductBean66.getId_ordine();
        ita.kangaroo.model.OrderProductBean orderProductBean69 = new ita.kangaroo.model.OrderProductBean();
        float float70 = orderProductBean69.getIVA();
        float float71 = orderProductBean69.getIVA();
        orderProductBean69.setPrezzo(10.0f);
        orderProductBean69.setId_ordine((int) (short) 0);
        orderProductBean69.setIVA((-1.0f));
        ita.kangaroo.model.OrderProductBean[] orderProductBeanArray78 = new ita.kangaroo.model.OrderProductBean[] { orderProductBean0, orderProductBean5, orderProductBean8, orderProductBean14, orderProductBean19, orderProductBean23, orderProductBean27, orderProductBean31, orderProductBean36, orderProductBean37, orderProductBean46, orderProductBean54, orderProductBean58, orderProductBean62, orderProductBean66, orderProductBean69 };
        java.util.ArrayList<ita.kangaroo.model.OrderProductBean> orderProductBeanList79 = new java.util.ArrayList<ita.kangaroo.model.OrderProductBean>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<ita.kangaroo.model.OrderProductBean>) orderProductBeanList79, orderProductBeanArray78);
        ita.kangaroo.model.OrdineBean ordineBean81 = new ita.kangaroo.model.OrdineBean(orderProductBeanList79);
        java.lang.String str82 = ordineBean81.getDestinatario();
        java.lang.String str83 = ordineBean81.getMetodo_di_spedizione();
        ordineBean81.setCircuito("3a987acf8cbc1028b7dbc86bd086831151899a2b");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.0f + "'", float15 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.0f + "'", float18 == 0.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 0.0f + "'", float25 == 0.0f);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 0.0f + "'", float26 == 0.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 0.0f + "'", float28 == 0.0f);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 0.0f + "'", float29 == 0.0f);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 0.0f + "'", float30 == 0.0f);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 0.0f + "'", float32 == 0.0f);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 0.0f + "'", float33 == 0.0f);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 0.0f + "'", float35 == 0.0f);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + 0.0f + "'", float38 == 0.0f);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 0.0f + "'", float39 == 0.0f);
        org.junit.Assert.assertTrue("'" + float47 + "' != '" + 0.0f + "'", float47 == 0.0f);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + float55 + "' != '" + 0.0f + "'", float55 == 0.0f);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + float59 + "' != '" + 0.0f + "'", float59 == 0.0f);
        org.junit.Assert.assertTrue("'" + float60 + "' != '" + 0.0f + "'", float60 == 0.0f);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + float63 + "' != '" + 0.0f + "'", float63 == 0.0f);
        org.junit.Assert.assertTrue("'" + float64 + "' != '" + 0.0f + "'", float64 == 0.0f);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + float67 + "' != '" + 0.0f + "'", float67 == 0.0f);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + float70 + "' != '" + 0.0f + "'", float70 == 0.0f);
        org.junit.Assert.assertTrue("'" + float71 + "' != '" + 0.0f + "'", float71 == 0.0f);
        org.junit.Assert.assertNotNull(orderProductBeanArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNull(str82);
        org.junit.Assert.assertNull(str83);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
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
        java.lang.String str21 = metodoPagamentoBean0.getData_scadenza();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        int int2 = orderProductBean0.getId_ordine();
        orderProductBean0.setQuantita((int) 'a');
        orderProductBean0.setQuantita((int) (short) -1);
        float float7 = orderProductBean0.getIVA();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        int int2 = orderProductBean0.getId_ordine();
        orderProductBean0.setQuantita((int) 'a');
        int int5 = orderProductBean0.getId_prodotto();
        orderProductBean0.setQuantita((int) (short) 10);
        int int8 = orderProductBean0.getId_ordine();
        float float9 = orderProductBean0.getIVA();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getImmagine();
        prodottoBean8.setPrezzo((float) (-1L));
        int int12 = prodottoBean8.getQuantita();
        int int13 = prodottoBean8.getQuantita();
        float float14 = prodottoBean8.getIva();
        java.lang.String str15 = prodottoBean8.getImmagine();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        float float2 = orderProductBean0.getIVA();
        int int3 = orderProductBean0.getId_prodotto();
        float float4 = orderProductBean0.getPrezzo();
        ita.kangaroo.model.OrderProductBean orderProductBean5 = new ita.kangaroo.model.OrderProductBean();
        float float6 = orderProductBean5.getIVA();
        float float7 = orderProductBean5.getIVA();
        ita.kangaroo.model.OrderProductBean orderProductBean8 = new ita.kangaroo.model.OrderProductBean();
        float float9 = orderProductBean8.getIVA();
        orderProductBean8.setQuantita((int) (byte) 100);
        orderProductBean8.setPrezzo((float) (-1));
        ita.kangaroo.model.OrderProductBean orderProductBean14 = new ita.kangaroo.model.OrderProductBean();
        float float15 = orderProductBean14.getIVA();
        float float16 = orderProductBean14.getIVA();
        int int17 = orderProductBean14.getId_prodotto();
        float float18 = orderProductBean14.getPrezzo();
        ita.kangaroo.model.OrderProductBean orderProductBean19 = new ita.kangaroo.model.OrderProductBean();
        float float20 = orderProductBean19.getIVA();
        orderProductBean19.setQuantita((int) (byte) 100);
        ita.kangaroo.model.OrderProductBean orderProductBean23 = new ita.kangaroo.model.OrderProductBean();
        float float24 = orderProductBean23.getIVA();
        float float25 = orderProductBean23.getIVA();
        float float26 = orderProductBean23.getPrezzo();
        ita.kangaroo.model.OrderProductBean orderProductBean27 = new ita.kangaroo.model.OrderProductBean();
        float float28 = orderProductBean27.getIVA();
        float float29 = orderProductBean27.getIVA();
        float float30 = orderProductBean27.getPrezzo();
        ita.kangaroo.model.OrderProductBean orderProductBean31 = new ita.kangaroo.model.OrderProductBean();
        float float32 = orderProductBean31.getIVA();
        float float33 = orderProductBean31.getIVA();
        int int34 = orderProductBean31.getId_prodotto();
        float float35 = orderProductBean31.getPrezzo();
        ita.kangaroo.model.OrderProductBean orderProductBean36 = new ita.kangaroo.model.OrderProductBean();
        ita.kangaroo.model.OrderProductBean orderProductBean37 = new ita.kangaroo.model.OrderProductBean();
        float float38 = orderProductBean37.getIVA();
        float float39 = orderProductBean37.getIVA();
        orderProductBean37.setPrezzo(10.0f);
        orderProductBean37.setId_ordine((int) (short) 0);
        orderProductBean37.setIVA((-1.0f));
        ita.kangaroo.model.OrderProductBean orderProductBean46 = new ita.kangaroo.model.OrderProductBean();
        float float47 = orderProductBean46.getIVA();
        int int48 = orderProductBean46.getId_ordine();
        orderProductBean46.setQuantita((int) 'a');
        int int51 = orderProductBean46.getId_ordine();
        orderProductBean46.setId_ordine(100);
        ita.kangaroo.model.OrderProductBean orderProductBean54 = new ita.kangaroo.model.OrderProductBean();
        float float55 = orderProductBean54.getIVA();
        int int56 = orderProductBean54.getId_ordine();
        int int57 = orderProductBean54.getQuantita();
        ita.kangaroo.model.OrderProductBean orderProductBean58 = new ita.kangaroo.model.OrderProductBean();
        float float59 = orderProductBean58.getIVA();
        float float60 = orderProductBean58.getIVA();
        int int61 = orderProductBean58.getId_prodotto();
        ita.kangaroo.model.OrderProductBean orderProductBean62 = new ita.kangaroo.model.OrderProductBean();
        float float63 = orderProductBean62.getIVA();
        float float64 = orderProductBean62.getIVA();
        int int65 = orderProductBean62.getId_prodotto();
        ita.kangaroo.model.OrderProductBean orderProductBean66 = new ita.kangaroo.model.OrderProductBean();
        float float67 = orderProductBean66.getIVA();
        int int68 = orderProductBean66.getId_ordine();
        ita.kangaroo.model.OrderProductBean orderProductBean69 = new ita.kangaroo.model.OrderProductBean();
        float float70 = orderProductBean69.getIVA();
        float float71 = orderProductBean69.getIVA();
        orderProductBean69.setPrezzo(10.0f);
        orderProductBean69.setId_ordine((int) (short) 0);
        orderProductBean69.setIVA((-1.0f));
        ita.kangaroo.model.OrderProductBean[] orderProductBeanArray78 = new ita.kangaroo.model.OrderProductBean[] { orderProductBean0, orderProductBean5, orderProductBean8, orderProductBean14, orderProductBean19, orderProductBean23, orderProductBean27, orderProductBean31, orderProductBean36, orderProductBean37, orderProductBean46, orderProductBean54, orderProductBean58, orderProductBean62, orderProductBean66, orderProductBean69 };
        java.util.ArrayList<ita.kangaroo.model.OrderProductBean> orderProductBeanList79 = new java.util.ArrayList<ita.kangaroo.model.OrderProductBean>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<ita.kangaroo.model.OrderProductBean>) orderProductBeanList79, orderProductBeanArray78);
        ita.kangaroo.model.OrdineBean ordineBean81 = new ita.kangaroo.model.OrdineBean(orderProductBeanList79);
        java.sql.Date date82 = ordineBean81.getData();
        java.sql.Date date83 = ordineBean81.getData();
        java.lang.String str84 = ordineBean81.getMetodo_di_spedizione();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.0f + "'", float15 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.0f + "'", float18 == 0.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 0.0f + "'", float25 == 0.0f);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 0.0f + "'", float26 == 0.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 0.0f + "'", float28 == 0.0f);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 0.0f + "'", float29 == 0.0f);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 0.0f + "'", float30 == 0.0f);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 0.0f + "'", float32 == 0.0f);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 0.0f + "'", float33 == 0.0f);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 0.0f + "'", float35 == 0.0f);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + 0.0f + "'", float38 == 0.0f);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 0.0f + "'", float39 == 0.0f);
        org.junit.Assert.assertTrue("'" + float47 + "' != '" + 0.0f + "'", float47 == 0.0f);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + float55 + "' != '" + 0.0f + "'", float55 == 0.0f);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + float59 + "' != '" + 0.0f + "'", float59 == 0.0f);
        org.junit.Assert.assertTrue("'" + float60 + "' != '" + 0.0f + "'", float60 == 0.0f);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + float63 + "' != '" + 0.0f + "'", float63 == 0.0f);
        org.junit.Assert.assertTrue("'" + float64 + "' != '" + 0.0f + "'", float64 == 0.0f);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + float67 + "' != '" + 0.0f + "'", float67 == 0.0f);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + float70 + "' != '" + 0.0f + "'", float70 == 0.0f);
        org.junit.Assert.assertTrue("'" + float71 + "' != '" + 0.0f + "'", float71 == 0.0f);
        org.junit.Assert.assertNotNull(orderProductBeanArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNull(date82);
        org.junit.Assert.assertNull(date83);
        org.junit.Assert.assertNull(str84);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        ordineBean12.setId((int) (byte) -1);
        java.lang.String str16 = ordineBean12.getNumero_di_tracking();
        java.lang.String str17 = ordineBean12.getMetodo_di_spedizione();
        java.lang.String str18 = ordineBean12.getCircuito();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getDescrizione();
        java.lang.String str10 = prodottoBean8.getNome();
        ita.kangaroo.model.CartProduct cartProduct11 = new ita.kangaroo.model.CartProduct(prodottoBean8);
        prodottoBean8.setPrezzo((float) (byte) 0);
        float float14 = prodottoBean8.getIva();
        java.lang.String str15 = prodottoBean8.getNome();
        prodottoBean8.setId((int) (short) 0);
        ita.kangaroo.model.CartProduct cartProduct19 = new ita.kangaroo.model.CartProduct(prodottoBean8, 97);
        cartProduct19.setQuantity((int) (short) 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        java.lang.String str12 = utenteBean11.getUsername();
        java.lang.String str13 = utenteBean11.getCap();
        utenteBean11.setUsername("");
        ita.kangaroo.model.OrdineBean ordineBean16 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.sql.Date date17 = ordineBean16.getData();
        ita.kangaroo.model.utenteBean utenteBean18 = ordineBean16.getClient();
        ita.kangaroo.model.tipo tipo24 = null;
        ita.kangaroo.model.utenteBean utenteBean30 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo24, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean31 = new ita.kangaroo.model.OrdineBean(utenteBean30);
        java.lang.String str32 = ordineBean31.getMetodo_di_spedizione();
        ordineBean31.setNumero_carta("");
        java.sql.Date date35 = ordineBean31.getData();
        int int36 = ordineBean31.getId();
        ita.kangaroo.model.tipo tipo42 = null;
        ita.kangaroo.model.utenteBean utenteBean48 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo42, "hi!", "", "", "hi!", "");
        java.lang.String str49 = utenteBean48.getProvincia();
        java.lang.String str50 = utenteBean48.getCognome();
        ordineBean31.setClient(utenteBean48);
        java.lang.String str52 = utenteBean48.getCap();
        utenteBean48.setUsername("Data non disponibile");
        utenteBean48.setProvincia("Data non disponibile");
        ordineBean16.setClient(utenteBean48);
        java.sql.Date date58 = null;
        ordineBean16.setData(date58);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(date17);
        org.junit.Assert.assertNotNull(utenteBean18);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(date35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
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
        ita.kangaroo.model.tipo tipo24 = null;
        ita.kangaroo.model.utenteBean utenteBean30 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo24, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean31 = new ita.kangaroo.model.OrdineBean(utenteBean30);
        java.lang.String str32 = ordineBean31.toString();
        boolean boolean33 = metodoPagamentoBean0.equals((java.lang.Object) str32);
        java.lang.String str34 = metodoPagamentoBean0.getData_scadenza();
        java.lang.String str35 = metodoPagamentoBean0.getCircuito();
        metodoPagamentoBean0.setCircuito("ProdottoBean{id=10, descrizione='hi!', nome='', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}");
        java.lang.String str38 = metodoPagamentoBean0.getCircuito();
        ita.kangaroo.model.Cart cart39 = new ita.kangaroo.model.Cart();
        ita.kangaroo.model.tipo tipo47 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean48 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo47);
        int int49 = prodottoBean48.getId();
        java.lang.String str50 = prodottoBean48.getImmagine();
        cart39.removeProduct(prodottoBean48);
        ita.kangaroo.model.tipo tipo59 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean60 = new ita.kangaroo.model.ProdottoBean((int) (byte) 10, "hi!", "hi!", "Data non disponibile", (float) (byte) 10, 10, (float) ' ', tipo59);
        ita.kangaroo.model.CartProduct cartProduct61 = new ita.kangaroo.model.CartProduct(prodottoBean60);
        cart39.removeProduct(prodottoBean60);
        ita.kangaroo.model.ProdottoBean prodottoBean63 = null;
        cart39.addProduct(prodottoBean63);
        ita.kangaroo.model.tipo tipo72 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean73 = new ita.kangaroo.model.ProdottoBean((int) 'a', "", "hi!", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", (float) 1L, (int) (short) 1, (float) (short) 1, tipo72);
        cart39.removeProduct(prodottoBean73);
        boolean boolean75 = metodoPagamentoBean0.equals((java.lang.Object) cart39);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Data non disponibile" + "'", str32, "Data non disponibile");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "ProdottoBean{id=10, descrizione='hi!', nome='', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}" + "'", str38, "ProdottoBean{id=10, descrizione='hi!', nome='', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "", "", "hi!", "hi!", "hi!");
        java.lang.String str12 = utenteBean11.getUsername();
        utenteBean11.setCap("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        ita.kangaroo.model.OrdineBean ordineBean15 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        ita.kangaroo.model.OrderProductBean orderProductBean16 = new ita.kangaroo.model.OrderProductBean();
        float float17 = orderProductBean16.getIVA();
        float float18 = orderProductBean16.getIVA();
        int int19 = orderProductBean16.getId_prodotto();
        float float20 = orderProductBean16.getPrezzo();
        ita.kangaroo.model.OrderProductBean orderProductBean21 = new ita.kangaroo.model.OrderProductBean();
        float float22 = orderProductBean21.getIVA();
        float float23 = orderProductBean21.getIVA();
        ita.kangaroo.model.OrderProductBean orderProductBean24 = new ita.kangaroo.model.OrderProductBean();
        float float25 = orderProductBean24.getIVA();
        orderProductBean24.setQuantita((int) (byte) 100);
        orderProductBean24.setPrezzo((float) (-1));
        ita.kangaroo.model.OrderProductBean orderProductBean30 = new ita.kangaroo.model.OrderProductBean();
        float float31 = orderProductBean30.getIVA();
        float float32 = orderProductBean30.getIVA();
        int int33 = orderProductBean30.getId_prodotto();
        float float34 = orderProductBean30.getPrezzo();
        ita.kangaroo.model.OrderProductBean orderProductBean35 = new ita.kangaroo.model.OrderProductBean();
        float float36 = orderProductBean35.getIVA();
        orderProductBean35.setQuantita((int) (byte) 100);
        ita.kangaroo.model.OrderProductBean orderProductBean39 = new ita.kangaroo.model.OrderProductBean();
        float float40 = orderProductBean39.getIVA();
        float float41 = orderProductBean39.getIVA();
        float float42 = orderProductBean39.getPrezzo();
        ita.kangaroo.model.OrderProductBean orderProductBean43 = new ita.kangaroo.model.OrderProductBean();
        float float44 = orderProductBean43.getIVA();
        float float45 = orderProductBean43.getIVA();
        float float46 = orderProductBean43.getPrezzo();
        ita.kangaroo.model.OrderProductBean orderProductBean47 = new ita.kangaroo.model.OrderProductBean();
        float float48 = orderProductBean47.getIVA();
        float float49 = orderProductBean47.getIVA();
        int int50 = orderProductBean47.getId_prodotto();
        float float51 = orderProductBean47.getPrezzo();
        ita.kangaroo.model.OrderProductBean orderProductBean52 = new ita.kangaroo.model.OrderProductBean();
        ita.kangaroo.model.OrderProductBean orderProductBean53 = new ita.kangaroo.model.OrderProductBean();
        float float54 = orderProductBean53.getIVA();
        float float55 = orderProductBean53.getIVA();
        orderProductBean53.setPrezzo(10.0f);
        orderProductBean53.setId_ordine((int) (short) 0);
        orderProductBean53.setIVA((-1.0f));
        ita.kangaroo.model.OrderProductBean orderProductBean62 = new ita.kangaroo.model.OrderProductBean();
        float float63 = orderProductBean62.getIVA();
        int int64 = orderProductBean62.getId_ordine();
        orderProductBean62.setQuantita((int) 'a');
        int int67 = orderProductBean62.getId_ordine();
        orderProductBean62.setId_ordine(100);
        ita.kangaroo.model.OrderProductBean orderProductBean70 = new ita.kangaroo.model.OrderProductBean();
        float float71 = orderProductBean70.getIVA();
        int int72 = orderProductBean70.getId_ordine();
        int int73 = orderProductBean70.getQuantita();
        ita.kangaroo.model.OrderProductBean orderProductBean74 = new ita.kangaroo.model.OrderProductBean();
        float float75 = orderProductBean74.getIVA();
        float float76 = orderProductBean74.getIVA();
        int int77 = orderProductBean74.getId_prodotto();
        ita.kangaroo.model.OrderProductBean orderProductBean78 = new ita.kangaroo.model.OrderProductBean();
        float float79 = orderProductBean78.getIVA();
        float float80 = orderProductBean78.getIVA();
        int int81 = orderProductBean78.getId_prodotto();
        ita.kangaroo.model.OrderProductBean orderProductBean82 = new ita.kangaroo.model.OrderProductBean();
        float float83 = orderProductBean82.getIVA();
        int int84 = orderProductBean82.getId_ordine();
        ita.kangaroo.model.OrderProductBean orderProductBean85 = new ita.kangaroo.model.OrderProductBean();
        float float86 = orderProductBean85.getIVA();
        float float87 = orderProductBean85.getIVA();
        orderProductBean85.setPrezzo(10.0f);
        orderProductBean85.setId_ordine((int) (short) 0);
        orderProductBean85.setIVA((-1.0f));
        ita.kangaroo.model.OrderProductBean[] orderProductBeanArray94 = new ita.kangaroo.model.OrderProductBean[] { orderProductBean16, orderProductBean21, orderProductBean24, orderProductBean30, orderProductBean35, orderProductBean39, orderProductBean43, orderProductBean47, orderProductBean52, orderProductBean53, orderProductBean62, orderProductBean70, orderProductBean74, orderProductBean78, orderProductBean82, orderProductBean85 };
        java.util.ArrayList<ita.kangaroo.model.OrderProductBean> orderProductBeanList95 = new java.util.ArrayList<ita.kangaroo.model.OrderProductBean>();
        boolean boolean96 = java.util.Collections.addAll((java.util.Collection<ita.kangaroo.model.OrderProductBean>) orderProductBeanList95, orderProductBeanArray94);
        ita.kangaroo.model.OrdineBean ordineBean97 = new ita.kangaroo.model.OrdineBean(orderProductBeanList95);
        ordineBean15.setProducts(orderProductBeanList95);
        ita.kangaroo.model.OrdineBean ordineBean99 = new ita.kangaroo.model.OrdineBean(orderProductBeanList95);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.0f + "'", float17 == 0.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.0f + "'", float18 == 0.0f);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.0f + "'", float22 == 0.0f);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.0f + "'", float23 == 0.0f);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 0.0f + "'", float25 == 0.0f);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 0.0f + "'", float31 == 0.0f);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 0.0f + "'", float32 == 0.0f);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 0.0f + "'", float34 == 0.0f);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 0.0f + "'", float36 == 0.0f);
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + 0.0f + "'", float40 == 0.0f);
        org.junit.Assert.assertTrue("'" + float41 + "' != '" + 0.0f + "'", float41 == 0.0f);
        org.junit.Assert.assertTrue("'" + float42 + "' != '" + 0.0f + "'", float42 == 0.0f);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 0.0f + "'", float44 == 0.0f);
        org.junit.Assert.assertTrue("'" + float45 + "' != '" + 0.0f + "'", float45 == 0.0f);
        org.junit.Assert.assertTrue("'" + float46 + "' != '" + 0.0f + "'", float46 == 0.0f);
        org.junit.Assert.assertTrue("'" + float48 + "' != '" + 0.0f + "'", float48 == 0.0f);
        org.junit.Assert.assertTrue("'" + float49 + "' != '" + 0.0f + "'", float49 == 0.0f);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + float51 + "' != '" + 0.0f + "'", float51 == 0.0f);
        org.junit.Assert.assertTrue("'" + float54 + "' != '" + 0.0f + "'", float54 == 0.0f);
        org.junit.Assert.assertTrue("'" + float55 + "' != '" + 0.0f + "'", float55 == 0.0f);
        org.junit.Assert.assertTrue("'" + float63 + "' != '" + 0.0f + "'", float63 == 0.0f);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + float71 + "' != '" + 0.0f + "'", float71 == 0.0f);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + float75 + "' != '" + 0.0f + "'", float75 == 0.0f);
        org.junit.Assert.assertTrue("'" + float76 + "' != '" + 0.0f + "'", float76 == 0.0f);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertTrue("'" + float79 + "' != '" + 0.0f + "'", float79 == 0.0f);
        org.junit.Assert.assertTrue("'" + float80 + "' != '" + 0.0f + "'", float80 == 0.0f);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertTrue("'" + float83 + "' != '" + 0.0f + "'", float83 == 0.0f);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertTrue("'" + float86 + "' != '" + 0.0f + "'", float86 == 0.0f);
        org.junit.Assert.assertTrue("'" + float87 + "' != '" + 0.0f + "'", float87 == 0.0f);
        org.junit.Assert.assertNotNull(orderProductBeanArray94);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getImmagine();
        prodottoBean8.setPrezzo((float) (-1L));
        int int12 = prodottoBean8.getQuantita();
        int int13 = prodottoBean8.getQuantita();
        java.lang.String str14 = prodottoBean8.getDescrizione();
        prodottoBean8.setNome("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        utenteBean11.setPassword("hi!");
        utenteBean11.setEmail("hi!");
        utenteBean11.setTelefono("hi!");
        java.lang.String str19 = utenteBean11.getUsername();
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        float float2 = orderProductBean0.getIVA();
        int int3 = orderProductBean0.getId_prodotto();
        float float4 = orderProductBean0.getPrezzo();
        ita.kangaroo.model.OrderProductBean orderProductBean5 = new ita.kangaroo.model.OrderProductBean();
        float float6 = orderProductBean5.getIVA();
        float float7 = orderProductBean5.getIVA();
        ita.kangaroo.model.OrderProductBean orderProductBean8 = new ita.kangaroo.model.OrderProductBean();
        float float9 = orderProductBean8.getIVA();
        orderProductBean8.setQuantita((int) (byte) 100);
        orderProductBean8.setPrezzo((float) (-1));
        ita.kangaroo.model.OrderProductBean orderProductBean14 = new ita.kangaroo.model.OrderProductBean();
        float float15 = orderProductBean14.getIVA();
        float float16 = orderProductBean14.getIVA();
        int int17 = orderProductBean14.getId_prodotto();
        float float18 = orderProductBean14.getPrezzo();
        ita.kangaroo.model.OrderProductBean orderProductBean19 = new ita.kangaroo.model.OrderProductBean();
        float float20 = orderProductBean19.getIVA();
        orderProductBean19.setQuantita((int) (byte) 100);
        ita.kangaroo.model.OrderProductBean orderProductBean23 = new ita.kangaroo.model.OrderProductBean();
        float float24 = orderProductBean23.getIVA();
        float float25 = orderProductBean23.getIVA();
        float float26 = orderProductBean23.getPrezzo();
        ita.kangaroo.model.OrderProductBean orderProductBean27 = new ita.kangaroo.model.OrderProductBean();
        float float28 = orderProductBean27.getIVA();
        float float29 = orderProductBean27.getIVA();
        float float30 = orderProductBean27.getPrezzo();
        ita.kangaroo.model.OrderProductBean orderProductBean31 = new ita.kangaroo.model.OrderProductBean();
        float float32 = orderProductBean31.getIVA();
        float float33 = orderProductBean31.getIVA();
        int int34 = orderProductBean31.getId_prodotto();
        float float35 = orderProductBean31.getPrezzo();
        ita.kangaroo.model.OrderProductBean orderProductBean36 = new ita.kangaroo.model.OrderProductBean();
        ita.kangaroo.model.OrderProductBean orderProductBean37 = new ita.kangaroo.model.OrderProductBean();
        float float38 = orderProductBean37.getIVA();
        float float39 = orderProductBean37.getIVA();
        orderProductBean37.setPrezzo(10.0f);
        orderProductBean37.setId_ordine((int) (short) 0);
        orderProductBean37.setIVA((-1.0f));
        ita.kangaroo.model.OrderProductBean orderProductBean46 = new ita.kangaroo.model.OrderProductBean();
        float float47 = orderProductBean46.getIVA();
        int int48 = orderProductBean46.getId_ordine();
        orderProductBean46.setQuantita((int) 'a');
        int int51 = orderProductBean46.getId_ordine();
        orderProductBean46.setId_ordine(100);
        ita.kangaroo.model.OrderProductBean orderProductBean54 = new ita.kangaroo.model.OrderProductBean();
        float float55 = orderProductBean54.getIVA();
        int int56 = orderProductBean54.getId_ordine();
        int int57 = orderProductBean54.getQuantita();
        ita.kangaroo.model.OrderProductBean orderProductBean58 = new ita.kangaroo.model.OrderProductBean();
        float float59 = orderProductBean58.getIVA();
        float float60 = orderProductBean58.getIVA();
        int int61 = orderProductBean58.getId_prodotto();
        ita.kangaroo.model.OrderProductBean orderProductBean62 = new ita.kangaroo.model.OrderProductBean();
        float float63 = orderProductBean62.getIVA();
        float float64 = orderProductBean62.getIVA();
        int int65 = orderProductBean62.getId_prodotto();
        ita.kangaroo.model.OrderProductBean orderProductBean66 = new ita.kangaroo.model.OrderProductBean();
        float float67 = orderProductBean66.getIVA();
        int int68 = orderProductBean66.getId_ordine();
        ita.kangaroo.model.OrderProductBean orderProductBean69 = new ita.kangaroo.model.OrderProductBean();
        float float70 = orderProductBean69.getIVA();
        float float71 = orderProductBean69.getIVA();
        orderProductBean69.setPrezzo(10.0f);
        orderProductBean69.setId_ordine((int) (short) 0);
        orderProductBean69.setIVA((-1.0f));
        ita.kangaroo.model.OrderProductBean[] orderProductBeanArray78 = new ita.kangaroo.model.OrderProductBean[] { orderProductBean0, orderProductBean5, orderProductBean8, orderProductBean14, orderProductBean19, orderProductBean23, orderProductBean27, orderProductBean31, orderProductBean36, orderProductBean37, orderProductBean46, orderProductBean54, orderProductBean58, orderProductBean62, orderProductBean66, orderProductBean69 };
        java.util.ArrayList<ita.kangaroo.model.OrderProductBean> orderProductBeanList79 = new java.util.ArrayList<ita.kangaroo.model.OrderProductBean>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<ita.kangaroo.model.OrderProductBean>) orderProductBeanList79, orderProductBeanArray78);
        ita.kangaroo.model.OrdineBean ordineBean81 = new ita.kangaroo.model.OrdineBean(orderProductBeanList79);
        java.lang.String str82 = ordineBean81.getDestinatario();
        java.lang.String str83 = ordineBean81.getMetodo_di_pagamento();
        ordineBean81.setNumero_di_tracking("da39a3ee5e6b4b0d3255bfef95601890afd80709");
        ordineBean81.setPrezzo_totale((float) (short) 100);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.0f + "'", float15 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.0f + "'", float18 == 0.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 0.0f + "'", float25 == 0.0f);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 0.0f + "'", float26 == 0.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 0.0f + "'", float28 == 0.0f);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 0.0f + "'", float29 == 0.0f);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 0.0f + "'", float30 == 0.0f);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 0.0f + "'", float32 == 0.0f);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 0.0f + "'", float33 == 0.0f);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 0.0f + "'", float35 == 0.0f);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + 0.0f + "'", float38 == 0.0f);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 0.0f + "'", float39 == 0.0f);
        org.junit.Assert.assertTrue("'" + float47 + "' != '" + 0.0f + "'", float47 == 0.0f);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + float55 + "' != '" + 0.0f + "'", float55 == 0.0f);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + float59 + "' != '" + 0.0f + "'", float59 == 0.0f);
        org.junit.Assert.assertTrue("'" + float60 + "' != '" + 0.0f + "'", float60 == 0.0f);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + float63 + "' != '" + 0.0f + "'", float63 == 0.0f);
        org.junit.Assert.assertTrue("'" + float64 + "' != '" + 0.0f + "'", float64 == 0.0f);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + float67 + "' != '" + 0.0f + "'", float67 == 0.0f);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + float70 + "' != '" + 0.0f + "'", float70 == 0.0f);
        org.junit.Assert.assertTrue("'" + float71 + "' != '" + 0.0f + "'", float71 == 0.0f);
        org.junit.Assert.assertNotNull(orderProductBeanArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNull(str82);
        org.junit.Assert.assertNull(str83);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        utenteBean11.setEmail("hi!");
        ita.kangaroo.model.OrdineBean ordineBean14 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        ordineBean14.setDestinatario("hi!");
        ordineBean14.setMetodo_di_spedizione("");
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getImmagine();
        prodottoBean8.setPrezzo((float) (-1L));
        int int12 = prodottoBean8.getId();
        ita.kangaroo.model.CartProduct cartProduct13 = new ita.kangaroo.model.CartProduct(prodottoBean8);
        prodottoBean8.setQuantita((int) (short) -1);
        java.lang.String str16 = prodottoBean8.getDescrizione();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        java.lang.String str12 = utenteBean11.getUsername();
        java.lang.String str13 = utenteBean11.getCap();
        utenteBean11.setUsername("");
        ita.kangaroo.model.OrdineBean ordineBean16 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        ordineBean16.setCircuito("");
        java.util.ArrayList<ita.kangaroo.model.OrderProductBean> orderProductBeanList19 = ordineBean16.getProducts();
        java.sql.Date date20 = ordineBean16.getData();
        ordineBean16.setCircuito("3a987acf8cbc1028b7dbc86bd086831151899a2b");
        java.sql.Date date23 = ordineBean16.getData();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(orderProductBeanList19);
        org.junit.Assert.assertNull(date20);
        org.junit.Assert.assertNull(date23);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 10, "hi!", "", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", (float) (-1), (int) (byte) 100, (float) (byte) 0, tipo7);
        float float9 = prodottoBean8.getIva();
        int int10 = prodottoBean8.getQuantita();
        int int11 = prodottoBean8.getQuantita();
        ita.kangaroo.model.tipo tipo12 = null;
        prodottoBean8.setTipo(tipo12);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        ordineBean12.setNumero_carta("");
        java.lang.String str16 = ordineBean12.getIndirizzo_di_spedizione();
        java.lang.String str17 = ordineBean12.getIndirizzo_di_spedizione();
        java.lang.String str18 = ordineBean12.getNumero_carta();
        ita.kangaroo.model.tipo tipo25 = null;
        ita.kangaroo.model.utenteBean utenteBean31 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo25, "hi!", "", "", "hi!", "");
        utenteBean31.setEmail("hi!");
        java.lang.String str34 = utenteBean31.getCognome();
        java.sql.Date date42 = null;
        ita.kangaroo.model.OrdineBean ordineBean44 = new ita.kangaroo.model.OrdineBean((int) (byte) 10, utenteBean31, (float) (-1L), "Data non disponibile", "Data non disponibile", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "hi!", "hi!", "", date42, "Data non disponibile");
        ita.kangaroo.model.tipo tipo45 = utenteBean31.getTipo();
        utenteBean31.setCitta("");
        ordineBean12.setClient(utenteBean31);
        utenteBean31.setCap("hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNull(tipo45);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        ita.kangaroo.model.Cart cart0 = new ita.kangaroo.model.Cart();
        ita.kangaroo.model.tipo tipo8 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean9 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo8);
        int int10 = prodottoBean9.getId();
        java.lang.String str11 = prodottoBean9.getImmagine();
        cart0.removeProduct(prodottoBean9);
        ita.kangaroo.model.tipo tipo13 = prodottoBean9.getTipo();
        java.lang.String str14 = prodottoBean9.getImmagine();
        ita.kangaroo.model.CartProduct cartProduct16 = new ita.kangaroo.model.CartProduct(prodottoBean9, (int) '#');
        ita.kangaroo.model.ProdottoBean prodottoBean17 = cartProduct16.getProduct();
        ita.kangaroo.model.tipo tipo18 = prodottoBean17.getTipo();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(tipo13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(prodottoBean17);
        org.junit.Assert.assertNull(tipo18);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        ita.kangaroo.model.AddressBean addressBean5 = new ita.kangaroo.model.AddressBean(32, "hi!", "Data non disponibile", "hi!", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        int int6 = addressBean5.getId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getDestinatario();
        java.lang.String str14 = ordineBean12.toString();
        ordineBean12.setPrezzo_totale((float) (short) 0);
        ita.kangaroo.model.tipo tipo22 = null;
        ita.kangaroo.model.utenteBean utenteBean28 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo22, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean29 = new ita.kangaroo.model.OrdineBean(utenteBean28);
        ita.kangaroo.model.tipo tipo35 = null;
        ita.kangaroo.model.utenteBean utenteBean41 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo35, "hi!", "", "", "hi!", "");
        utenteBean41.setEmail("hi!");
        utenteBean41.setPassword("hi!");
        java.lang.String str46 = utenteBean41.getCognome();
        ordineBean29.setClient(utenteBean41);
        java.util.ArrayList<ita.kangaroo.model.OrderProductBean> orderProductBeanList48 = ordineBean29.getProducts();
        ordineBean12.setProducts(orderProductBeanList48);
        ordineBean12.setIndirizzo_di_spedizione("da39a3ee5e6b4b0d3255bfef95601890afd80709");
        int int52 = ordineBean12.getId();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Data non disponibile" + "'", str14, "Data non disponibile");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(orderProductBeanList48);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        ordineBean12.setNumero_carta("");
        java.sql.Date date16 = ordineBean12.getData();
        ordineBean12.setMetodo_di_pagamento("");
        ordineBean12.setNumero_di_tracking("");
        ordineBean12.setDestinatario("ProdottoBean{id=10, descrizione='hi!', nome='', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}");
        int int23 = ordineBean12.getId();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        ita.kangaroo.model.MetodoPagamentoBean metodoPagamentoBean0 = new ita.kangaroo.model.MetodoPagamentoBean();
        metodoPagamentoBean0.setId((int) 'a');
        ita.kangaroo.model.AddressBean addressBean3 = new ita.kangaroo.model.AddressBean();
        java.lang.String str4 = addressBean3.getVia();
        addressBean3.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        addressBean3.setCitta("hi!");
        boolean boolean9 = metodoPagamentoBean0.equals((java.lang.Object) addressBean3);
        java.lang.String str10 = metodoPagamentoBean0.getNumero_carta();
        int int11 = metodoPagamentoBean0.getId();
        int int12 = metodoPagamentoBean0.getId();
        java.lang.String str13 = metodoPagamentoBean0.getCircuito();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        ita.kangaroo.model.Cart cart0 = new ita.kangaroo.model.Cart();
        ita.kangaroo.model.tipo tipo8 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean9 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo8);
        java.lang.String str10 = prodottoBean9.getDescrizione();
        java.lang.String str11 = prodottoBean9.getNome();
        int int12 = prodottoBean9.getQuantita();
        prodottoBean9.setDescrizione("hi!");
        cart0.addProduct(prodottoBean9);
        ita.kangaroo.model.tipo tipo23 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean24 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo23);
        java.lang.String str25 = prodottoBean24.getImmagine();
        int int26 = prodottoBean24.getQuantita();
        prodottoBean24.setImmagine("hi!");
        ita.kangaroo.model.CartProduct cartProduct30 = new ita.kangaroo.model.CartProduct(prodottoBean24, (int) (short) 100);
        cart0.changeQuantity(prodottoBean24, (int) (short) 10);
        ita.kangaroo.model.Cart cart33 = new ita.kangaroo.model.Cart();
        ita.kangaroo.model.tipo tipo41 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean42 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo41);
        java.lang.String str43 = prodottoBean42.getDescrizione();
        java.lang.String str44 = prodottoBean42.getNome();
        int int45 = prodottoBean42.getQuantita();
        prodottoBean42.setDescrizione("hi!");
        cart33.addProduct(prodottoBean42);
        ita.kangaroo.model.tipo tipo56 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean57 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo56);
        java.lang.String str58 = prodottoBean57.getImmagine();
        int int59 = prodottoBean57.getQuantita();
        prodottoBean57.setImmagine("hi!");
        ita.kangaroo.model.CartProduct cartProduct63 = new ita.kangaroo.model.CartProduct(prodottoBean57, (int) (short) 100);
        cart33.changeQuantity(prodottoBean57, (int) (short) 10);
        int int66 = prodottoBean57.getQuantita();
        cart0.addProduct(prodottoBean57);
        java.lang.String str68 = prodottoBean57.getImmagine();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        utenteBean11.setEmail("hi!");
        utenteBean11.setPassword("hi!");
        java.lang.String str16 = utenteBean11.getCognome();
        java.lang.String str17 = utenteBean11.getUsername();
        java.lang.String str18 = utenteBean11.getCognome();
        java.lang.String str19 = utenteBean11.getEmail();
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean(97, "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "ProdottoBean{id=10, descrizione='hi!', nome='', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}", "ProdottoBean{id=32, descrizione='Data non disponibile', nome='Data non disponibile', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=32.0, quantita=32, iva=10.0, tipo=null}", (float) 1L, 10, (float) 35, tipo7);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        ita.kangaroo.model.tipo tipo18 = null;
        ita.kangaroo.model.utenteBean utenteBean24 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo18, "hi!", "", "", "hi!", "");
        utenteBean24.setEmail("hi!");
        utenteBean24.setPassword("hi!");
        java.lang.String str29 = utenteBean24.getCognome();
        ordineBean12.setClient(utenteBean24);
        utenteBean24.setUsername("Data non disponibile");
        utenteBean24.setCognome("Data non disponibile");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        ordineBean12.setNumero_carta("");
        java.sql.Date date16 = ordineBean12.getData();
        ordineBean12.setMetodo_di_pagamento("");
        ordineBean12.setNumero_di_tracking("");
        ordineBean12.setNumero_di_tracking("hi!");
        java.lang.String str23 = ordineBean12.getIndirizzo_di_spedizione();
        ordineBean12.setDestinatario("hi!");
        float float26 = ordineBean12.getPrezzo_totale();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 0.0f + "'", float26 == 0.0f);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getDescrizione();
        java.lang.String str10 = prodottoBean8.getNome();
        ita.kangaroo.model.CartProduct cartProduct11 = new ita.kangaroo.model.CartProduct(prodottoBean8);
        prodottoBean8.setPrezzo((float) (byte) 0);
        int int14 = prodottoBean8.getQuantita();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        ita.kangaroo.model.tipo tipo6 = null;
        ita.kangaroo.model.utenteBean utenteBean12 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo6, "hi!", "", "", "hi!", "");
        utenteBean12.setEmail("hi!");
        java.lang.String str15 = utenteBean12.getCognome();
        java.sql.Date date23 = null;
        ita.kangaroo.model.OrdineBean ordineBean25 = new ita.kangaroo.model.OrdineBean((int) (byte) 10, utenteBean12, (float) (-1L), "Data non disponibile", "Data non disponibile", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "hi!", "hi!", "", date23, "Data non disponibile");
        ita.kangaroo.model.tipo tipo26 = utenteBean12.getTipo();
        java.lang.String str27 = utenteBean12.getCitta();
        utenteBean12.setCitta("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(tipo26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        ita.kangaroo.model.tipo tipo6 = null;
        ita.kangaroo.model.utenteBean utenteBean12 = new ita.kangaroo.model.utenteBean("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "Data non disponibile", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "", tipo6, "Data non disponibile", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "Data non disponibile", "", "");
        java.sql.Date date20 = null;
        ita.kangaroo.model.OrdineBean ordineBean22 = new ita.kangaroo.model.OrdineBean((int) 'a', utenteBean12, (float) (byte) -1, "Data non disponibile", "Data non disponibile", "hi!", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "hi!", "", date20, "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        ita.kangaroo.model.tipo tipo23 = utenteBean12.getTipo();
        org.junit.Assert.assertNull(tipo23);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        ita.kangaroo.model.AddressBean addressBean5 = new ita.kangaroo.model.AddressBean(32, "hi!", "Data non disponibile", "hi!", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        java.lang.String str6 = addressBean5.getCAP();
        addressBean5.setUsername("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        ita.kangaroo.model.AddressBean addressBean5 = new ita.kangaroo.model.AddressBean(32, "hi!", "Data non disponibile", "hi!", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        java.lang.String str6 = addressBean5.getCAP();
        java.lang.String str7 = addressBean5.getUsername();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}" + "'", str7, "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        ita.kangaroo.model.AddressBean addressBean5 = new ita.kangaroo.model.AddressBean((int) '#', "", "hi!", "3d1583397bcebff274b1e7cb58087c39153af974", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        java.lang.String str6 = addressBean5.getCAP();
        ita.kangaroo.model.tipo tipo12 = null;
        ita.kangaroo.model.utenteBean utenteBean18 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo12, "hi!", "", "", "hi!", "");
        java.lang.String str19 = utenteBean18.getUsername();
        java.lang.String str20 = utenteBean18.getCap();
        utenteBean18.setUsername("");
        ita.kangaroo.model.OrdineBean ordineBean23 = new ita.kangaroo.model.OrdineBean(utenteBean18);
        ordineBean23.setCircuito("");
        java.lang.String str26 = ordineBean23.getNumero_carta();
        java.lang.String str27 = ordineBean23.getMetodo_di_pagamento();
        ordineBean23.setIndirizzo_di_spedizione("");
        ita.kangaroo.model.utenteBean utenteBean30 = ordineBean23.getClient();
        boolean boolean31 = addressBean5.equals((java.lang.Object) ordineBean23);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "3d1583397bcebff274b1e7cb58087c39153af974" + "'", str6, "3d1583397bcebff274b1e7cb58087c39153af974");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(utenteBean30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        ita.kangaroo.model.tipo tipo6 = null;
        ita.kangaroo.model.utenteBean utenteBean12 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo6, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean13 = new ita.kangaroo.model.OrdineBean(utenteBean12);
        utenteBean12.setPassword("hi!");
        utenteBean12.setNome("hi!");
        java.sql.Date date25 = null;
        ita.kangaroo.model.OrdineBean ordineBean27 = new ita.kangaroo.model.OrdineBean((int) (byte) 100, utenteBean12, (float) (-1L), "hi!", "", "", "hi!", "Data non disponibile", "hi!", date25, "");
        ordineBean27.setIndirizzo_di_spedizione("Data non disponibile");
        java.lang.String str30 = ordineBean27.getDestinatario();
        ordineBean27.setCircuito("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        ita.kangaroo.model.utenteBean utenteBean33 = ordineBean27.getClient();
        java.lang.String str34 = ordineBean27.getMetodo_di_pagamento();
        ita.kangaroo.model.utenteBean utenteBean35 = ordineBean27.getClient();
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(utenteBean33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(utenteBean35);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        ita.kangaroo.model.AddressBean addressBean5 = new ita.kangaroo.model.AddressBean(32, "hi!", "Data non disponibile", "hi!", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        java.lang.String str6 = addressBean5.getCAP();
        addressBean5.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        ita.kangaroo.model.tipo tipo6 = null;
        ita.kangaroo.model.utenteBean utenteBean12 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo6, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean13 = new ita.kangaroo.model.OrdineBean(utenteBean12);
        utenteBean12.setPassword("hi!");
        utenteBean12.setNome("hi!");
        java.sql.Date date25 = null;
        ita.kangaroo.model.OrdineBean ordineBean27 = new ita.kangaroo.model.OrdineBean((int) (byte) 100, utenteBean12, (float) (-1L), "hi!", "", "", "hi!", "Data non disponibile", "hi!", date25, "");
        ordineBean27.setIndirizzo_di_spedizione("Data non disponibile");
        java.lang.String str30 = ordineBean27.getDestinatario();
        java.lang.String str31 = ordineBean27.getMetodo_di_pagamento();
        ita.kangaroo.model.tipo tipo38 = null;
        ita.kangaroo.model.utenteBean utenteBean44 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo38, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean45 = new ita.kangaroo.model.OrdineBean(utenteBean44);
        utenteBean44.setPassword("hi!");
        utenteBean44.setNome("hi!");
        java.sql.Date date57 = null;
        ita.kangaroo.model.OrdineBean ordineBean59 = new ita.kangaroo.model.OrdineBean((int) (byte) 100, utenteBean44, (float) (-1L), "hi!", "", "", "hi!", "Data non disponibile", "hi!", date57, "");
        java.lang.String str60 = utenteBean44.getCognome();
        ordineBean27.setClient(utenteBean44);
        java.lang.String str62 = utenteBean44.getTelefono();
        java.lang.String str63 = utenteBean44.getPassword();
        utenteBean44.setUsername("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='hi!', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "3a987acf8cbc1028b7dbc86bd086831151899a2b" + "'", str63, "3a987acf8cbc1028b7dbc86bd086831151899a2b");
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
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
        metodoPagamentoBean0.setNumero_carta("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        metodoPagamentoBean0.setCircuito("Data non disponibile");
        metodoPagamentoBean0.setData_scadenza("3a987acf8cbc1028b7dbc86bd086831151899a2b");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        ordineBean12.setNumero_carta("");
        java.lang.String str16 = ordineBean12.getIndirizzo_di_spedizione();
        java.lang.String str17 = ordineBean12.getIndirizzo_di_spedizione();
        ita.kangaroo.model.utenteBean utenteBean18 = ordineBean12.getClient();
        ordineBean12.setNumero_di_tracking("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(utenteBean18);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        ita.kangaroo.model.Cart cart0 = new ita.kangaroo.model.Cart();
        ita.kangaroo.model.tipo tipo8 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean9 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo8);
        int int10 = prodottoBean9.getId();
        java.lang.String str11 = prodottoBean9.getImmagine();
        cart0.removeProduct(prodottoBean9);
        ita.kangaroo.model.tipo tipo20 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean21 = new ita.kangaroo.model.ProdottoBean((int) (byte) 10, "hi!", "hi!", "Data non disponibile", (float) (byte) 10, 10, (float) ' ', tipo20);
        ita.kangaroo.model.CartProduct cartProduct22 = new ita.kangaroo.model.CartProduct(prodottoBean21);
        cart0.removeProduct(prodottoBean21);
        ita.kangaroo.model.tipo tipo31 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean32 = new ita.kangaroo.model.ProdottoBean((int) (byte) 10, "hi!", "hi!", "Data non disponibile", (float) (byte) 10, 10, (float) ' ', tipo31);
        cart0.changeQuantity(prodottoBean32, 32);
        prodottoBean32.setDescrizione("");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        orderProductBean0.setQuantita((int) (byte) 100);
        ita.kangaroo.model.OrderProductBean orderProductBean4 = new ita.kangaroo.model.OrderProductBean();
        float float5 = orderProductBean4.getIVA();
        float float6 = orderProductBean4.getIVA();
        orderProductBean4.setPrezzo(10.0f);
        int int9 = orderProductBean4.getQuantita();
        ita.kangaroo.model.OrderProductBean orderProductBean10 = new ita.kangaroo.model.OrderProductBean();
        float float11 = orderProductBean10.getIVA();
        float float12 = orderProductBean10.getIVA();
        float float13 = orderProductBean10.getPrezzo();
        ita.kangaroo.model.OrderProductBean orderProductBean14 = new ita.kangaroo.model.OrderProductBean();
        float float15 = orderProductBean14.getIVA();
        float float16 = orderProductBean14.getIVA();
        float float17 = orderProductBean14.getPrezzo();
        ita.kangaroo.model.OrderProductBean orderProductBean18 = new ita.kangaroo.model.OrderProductBean();
        float float19 = orderProductBean18.getIVA();
        float float20 = orderProductBean18.getIVA();
        float float21 = orderProductBean18.getPrezzo();
        ita.kangaroo.model.OrderProductBean orderProductBean22 = new ita.kangaroo.model.OrderProductBean();
        float float23 = orderProductBean22.getIVA();
        int int24 = orderProductBean22.getId_ordine();
        orderProductBean22.setQuantita((int) 'a');
        float float27 = orderProductBean22.getIVA();
        ita.kangaroo.model.OrderProductBean orderProductBean28 = new ita.kangaroo.model.OrderProductBean();
        float float29 = orderProductBean28.getIVA();
        float float30 = orderProductBean28.getIVA();
        ita.kangaroo.model.OrderProductBean orderProductBean31 = new ita.kangaroo.model.OrderProductBean();
        float float32 = orderProductBean31.getIVA();
        float float33 = orderProductBean31.getIVA();
        float float34 = orderProductBean31.getPrezzo();
        int int35 = orderProductBean31.getQuantita();
        ita.kangaroo.model.OrderProductBean orderProductBean36 = new ita.kangaroo.model.OrderProductBean();
        float float37 = orderProductBean36.getIVA();
        float float38 = orderProductBean36.getIVA();
        orderProductBean36.setPrezzo(10.0f);
        int int41 = orderProductBean36.getQuantita();
        ita.kangaroo.model.OrderProductBean orderProductBean42 = new ita.kangaroo.model.OrderProductBean();
        ita.kangaroo.model.OrderProductBean orderProductBean43 = new ita.kangaroo.model.OrderProductBean();
        ita.kangaroo.model.OrderProductBean orderProductBean44 = new ita.kangaroo.model.OrderProductBean();
        float float45 = orderProductBean44.getIVA();
        int int46 = orderProductBean44.getId_ordine();
        orderProductBean44.setQuantita((int) 'a');
        int int49 = orderProductBean44.getId_ordine();
        ita.kangaroo.model.OrderProductBean[] orderProductBeanArray50 = new ita.kangaroo.model.OrderProductBean[] { orderProductBean0, orderProductBean4, orderProductBean10, orderProductBean14, orderProductBean18, orderProductBean22, orderProductBean28, orderProductBean31, orderProductBean36, orderProductBean42, orderProductBean43, orderProductBean44 };
        java.util.ArrayList<ita.kangaroo.model.OrderProductBean> orderProductBeanList51 = new java.util.ArrayList<ita.kangaroo.model.OrderProductBean>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<ita.kangaroo.model.OrderProductBean>) orderProductBeanList51, orderProductBeanArray50);
        ita.kangaroo.model.OrdineBean ordineBean53 = new ita.kangaroo.model.OrdineBean(orderProductBeanList51);
        java.lang.String str54 = ordineBean53.getNumero_carta();
        java.lang.String str55 = ordineBean53.getMetodo_di_pagamento();
        java.util.ArrayList<ita.kangaroo.model.OrderProductBean> orderProductBeanList56 = ordineBean53.getProducts();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.0f + "'", float15 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.0f + "'", float17 == 0.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.0f + "'", float19 == 0.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.0f + "'", float21 == 0.0f);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.0f + "'", float23 == 0.0f);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 0.0f + "'", float27 == 0.0f);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 0.0f + "'", float29 == 0.0f);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 0.0f + "'", float30 == 0.0f);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 0.0f + "'", float32 == 0.0f);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 0.0f + "'", float33 == 0.0f);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 0.0f + "'", float34 == 0.0f);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + 0.0f + "'", float37 == 0.0f);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + 0.0f + "'", float38 == 0.0f);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + float45 + "' != '" + 0.0f + "'", float45 == 0.0f);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(orderProductBeanArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNotNull(orderProductBeanList56);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getDescrizione();
        java.lang.String str10 = prodottoBean8.getDescrizione();
        prodottoBean8.setDescrizione("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='hi!', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        ita.kangaroo.model.Cart cart0 = new ita.kangaroo.model.Cart();
        ita.kangaroo.model.tipo tipo8 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean9 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo8);
        int int10 = prodottoBean9.getId();
        java.lang.String str11 = prodottoBean9.getImmagine();
        cart0.removeProduct(prodottoBean9);
        ita.kangaroo.model.tipo tipo20 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean21 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo20);
        java.lang.String str22 = prodottoBean21.getDescrizione();
        java.lang.String str23 = prodottoBean21.getNome();
        ita.kangaroo.model.tipo tipo24 = prodottoBean21.getTipo();
        cart0.removeProduct(prodottoBean21);
        ita.kangaroo.model.tipo tipo33 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean34 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo33);
        java.lang.String str35 = prodottoBean34.getDescrizione();
        java.lang.String str36 = prodottoBean34.getNome();
        ita.kangaroo.model.tipo tipo37 = prodottoBean34.getTipo();
        cart0.changeQuantity(prodottoBean34, (int) (byte) 0);
        ita.kangaroo.model.tipo tipo47 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean48 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo47);
        java.lang.String str49 = prodottoBean48.getDescrizione();
        java.lang.String str50 = prodottoBean48.getNome();
        ita.kangaroo.model.tipo tipo51 = prodottoBean48.getTipo();
        ita.kangaroo.model.tipo tipo52 = prodottoBean48.getTipo();
        float float53 = prodottoBean48.getPrezzo();
        cart0.addProduct(prodottoBean48);
        prodottoBean48.setId(32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNull(tipo24);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNull(tipo37);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertNull(tipo51);
        org.junit.Assert.assertNull(tipo52);
        org.junit.Assert.assertTrue("'" + float53 + "' != '" + 1.0f + "'", float53 == 1.0f);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        ita.kangaroo.model.Cart cart0 = new ita.kangaroo.model.Cart();
        ita.kangaroo.model.tipo tipo8 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean9 = new ita.kangaroo.model.ProdottoBean((int) (byte) 10, "hi!", "hi!", "Data non disponibile", (float) (byte) 10, 10, (float) ' ', tipo8);
        cart0.removeProduct(prodottoBean9);
        ita.kangaroo.model.Cart cart11 = new ita.kangaroo.model.Cart();
        ita.kangaroo.model.tipo tipo19 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean20 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo19);
        java.lang.String str21 = prodottoBean20.getImmagine();
        prodottoBean20.setPrezzo((float) (-1L));
        int int24 = prodottoBean20.getId();
        prodottoBean20.setPrezzo(10.0f);
        prodottoBean20.setPrezzo(0.0f);
        prodottoBean20.setNome("Data non disponibile");
        cart11.changeQuantity(prodottoBean20, (int) '4');
        ita.kangaroo.model.tipo tipo40 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean41 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo40);
        java.lang.String str42 = prodottoBean41.getImmagine();
        prodottoBean41.setPrezzo((float) (-1L));
        int int45 = prodottoBean41.getId();
        float float46 = prodottoBean41.getIva();
        prodottoBean41.setQuantita((int) ' ');
        ita.kangaroo.model.tipo tipo49 = prodottoBean41.getTipo();
        cart11.changeQuantity(prodottoBean41, (int) (short) 100);
        ita.kangaroo.model.tipo tipo59 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean60 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo59);
        java.lang.String str61 = prodottoBean60.getImmagine();
        prodottoBean60.setPrezzo((float) (-1L));
        int int64 = prodottoBean60.getId();
        float float65 = prodottoBean60.getIva();
        prodottoBean60.setQuantita((int) ' ');
        ita.kangaroo.model.tipo tipo68 = prodottoBean60.getTipo();
        cart11.removeProduct(prodottoBean60);
        ita.kangaroo.model.tipo tipo77 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean78 = new ita.kangaroo.model.ProdottoBean((int) (byte) 10, "hi!", "", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", (float) (-1), (int) (byte) 100, (float) (byte) 0, tipo77);
        float float79 = prodottoBean78.getIva();
        cart11.changeQuantity(prodottoBean78, (int) (short) 1);
        cart0.removeProduct(prodottoBean78);
        prodottoBean78.setDescrizione("");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + float46 + "' != '" + 1.0f + "'", float46 == 1.0f);
        org.junit.Assert.assertNull(tipo49);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
        org.junit.Assert.assertTrue("'" + float65 + "' != '" + 1.0f + "'", float65 == 1.0f);
        org.junit.Assert.assertNull(tipo68);
        org.junit.Assert.assertTrue("'" + float79 + "' != '" + 0.0f + "'", float79 == 0.0f);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        ita.kangaroo.model.tipo tipo19 = null;
        ita.kangaroo.model.utenteBean utenteBean25 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo19, "hi!", "", "", "hi!", "");
        utenteBean25.setEmail("hi!");
        ordineBean12.setClient(utenteBean25);
        ordineBean12.setNumero_carta("");
        ordineBean12.setMetodo_di_pagamento("hi!");
        java.util.ArrayList<ita.kangaroo.model.OrderProductBean> orderProductBeanList33 = null;
        ordineBean12.setProducts(orderProductBeanList33);
        java.lang.String str35 = ordineBean12.getDestinatario();
        java.lang.String str36 = ordineBean12.getNumero_di_tracking();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str36);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        ita.kangaroo.model.MetodoPagamentoBean metodoPagamentoBean0 = new ita.kangaroo.model.MetodoPagamentoBean();
        metodoPagamentoBean0.setId((int) 'a');
        ita.kangaroo.model.AddressBean addressBean3 = new ita.kangaroo.model.AddressBean();
        java.lang.String str4 = addressBean3.getVia();
        addressBean3.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        addressBean3.setCitta("hi!");
        boolean boolean9 = metodoPagamentoBean0.equals((java.lang.Object) addressBean3);
        metodoPagamentoBean0.setNumero_carta("Data non disponibile");
        java.lang.String str12 = metodoPagamentoBean0.getData_scadenza();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        ita.kangaroo.model.Cart cart0 = new ita.kangaroo.model.Cart();
        ita.kangaroo.model.tipo tipo8 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean9 = new ita.kangaroo.model.ProdottoBean((int) (byte) 10, "hi!", "hi!", "Data non disponibile", (float) (byte) 10, 10, (float) ' ', tipo8);
        cart0.removeProduct(prodottoBean9);
        java.lang.String str11 = prodottoBean9.getDescrizione();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        utenteBean11.setEmail("hi!");
        ita.kangaroo.model.OrdineBean ordineBean14 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        ordineBean14.setDestinatario("hi!");
        ordineBean14.setNumero_di_tracking("hi!");
        java.lang.String str19 = ordineBean14.getCircuito();
        java.lang.String str20 = ordineBean14.getIndirizzo_di_spedizione();
        java.sql.Date date21 = ordineBean14.getData();
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(date21);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getDestinatario();
        java.lang.String str14 = ordineBean12.toString();
        ordineBean12.setPrezzo_totale(10.0f);
        ordineBean12.setPrezzo_totale((float) ' ');
        java.sql.Date date19 = null;
        ordineBean12.setData(date19);
        java.sql.Date date21 = ordineBean12.getData();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Data non disponibile" + "'", str14, "Data non disponibile");
        org.junit.Assert.assertNull(date21);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("Data non disponibile", "", "", "", "", tipo5, "Data non disponibile", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "hi!", "Data non disponibile", "Data non disponibile");
        java.lang.String str12 = utenteBean11.getNome();
        java.lang.String str13 = utenteBean11.getCap();
        java.lang.String str14 = utenteBean11.getProvincia();
        java.lang.String str15 = utenteBean11.getCitta();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Data non disponibile" + "'", str12, "Data non disponibile");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Data non disponibile" + "'", str13, "Data non disponibile");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}" + "'", str15, "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        ita.kangaroo.model.AddressBean addressBean0 = new ita.kangaroo.model.AddressBean();
        java.lang.String str1 = addressBean0.getVia();
        java.lang.String str2 = addressBean0.getUsername();
        java.lang.String str3 = addressBean0.getCAP();
        java.lang.String str4 = addressBean0.getUsername();
        java.lang.String str5 = addressBean0.getVia();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        ita.kangaroo.model.AddressBean addressBean0 = new ita.kangaroo.model.AddressBean();
        java.lang.String str1 = addressBean0.getVia();
        java.lang.String str2 = addressBean0.getUsername();
        java.lang.String str3 = addressBean0.getCAP();
        java.lang.String str4 = addressBean0.getUsername();
        addressBean0.setId(10);
        int int7 = addressBean0.getId();
        java.lang.String str8 = addressBean0.getUsername();
        java.lang.String str9 = addressBean0.getUsername();
        ita.kangaroo.model.Cart cart10 = new ita.kangaroo.model.Cart();
        ita.kangaroo.model.tipo tipo18 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean19 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo18);
        int int20 = prodottoBean19.getId();
        java.lang.String str21 = prodottoBean19.getImmagine();
        cart10.removeProduct(prodottoBean19);
        ita.kangaroo.model.tipo tipo30 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean31 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo30);
        java.lang.String str32 = prodottoBean31.getDescrizione();
        java.lang.String str33 = prodottoBean31.getNome();
        ita.kangaroo.model.tipo tipo34 = prodottoBean31.getTipo();
        cart10.removeProduct(prodottoBean31);
        ita.kangaroo.model.tipo tipo43 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean44 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo43);
        java.lang.String str45 = prodottoBean44.getDescrizione();
        java.lang.String str46 = prodottoBean44.getNome();
        ita.kangaroo.model.tipo tipo47 = prodottoBean44.getTipo();
        cart10.changeQuantity(prodottoBean44, (int) (byte) 0);
        ita.kangaroo.model.tipo tipo57 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean58 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo57);
        java.lang.String str59 = prodottoBean58.getDescrizione();
        java.lang.String str60 = prodottoBean58.getNome();
        ita.kangaroo.model.tipo tipo61 = prodottoBean58.getTipo();
        ita.kangaroo.model.tipo tipo62 = prodottoBean58.getTipo();
        float float63 = prodottoBean58.getPrezzo();
        cart10.addProduct(prodottoBean58);
        boolean boolean65 = addressBean0.equals((java.lang.Object) prodottoBean58);
        prodottoBean58.setImmagine("3d1583397bcebff274b1e7cb58087c39153af974");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNull(tipo34);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertNull(tipo47);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertNull(tipo61);
        org.junit.Assert.assertNull(tipo62);
        org.junit.Assert.assertTrue("'" + float63 + "' != '" + 1.0f + "'", float63 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        ordineBean12.setNumero_carta("");
        java.sql.Date date16 = ordineBean12.getData();
        ordineBean12.setMetodo_di_pagamento("");
        ordineBean12.setNumero_di_tracking("");
        ordineBean12.setNumero_di_tracking("hi!");
        ordineBean12.setMetodo_di_spedizione("Data non disponibile");
        ordineBean12.setNumero_carta("");
        ordineBean12.setNumero_carta("da39a3ee5e6b4b0d3255bfef95601890afd80709");
        ordineBean12.setMetodo_di_spedizione("");
        java.lang.String str31 = ordineBean12.getMetodo_di_pagamento();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        ita.kangaroo.model.tipo tipo6 = null;
        ita.kangaroo.model.utenteBean utenteBean12 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo6, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean13 = new ita.kangaroo.model.OrdineBean(utenteBean12);
        utenteBean12.setPassword("hi!");
        utenteBean12.setNome("hi!");
        java.sql.Date date25 = null;
        ita.kangaroo.model.OrdineBean ordineBean27 = new ita.kangaroo.model.OrdineBean((int) (byte) 100, utenteBean12, (float) (-1L), "hi!", "", "", "hi!", "Data non disponibile", "hi!", date25, "");
        java.lang.String str28 = utenteBean12.getVia();
        ita.kangaroo.model.OrdineBean ordineBean29 = new ita.kangaroo.model.OrdineBean(utenteBean12);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        ita.kangaroo.model.AddressBean addressBean5 = new ita.kangaroo.model.AddressBean(10, "Data non disponibile", "Data non disponibile", "", "da39a3ee5e6b4b0d3255bfef95601890afd80709");
        addressBean5.setVia("3d1583397bcebff274b1e7cb58087c39153af974");
        addressBean5.setCitta("ProdottoBean{id=52, descrizione='hi!', nome='', immagine='da39a3ee5e6b4b0d3255bfef95601890afd80709', prezzo=32.0, quantita=-1, iva=52.0, tipo=null}");
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        java.util.ArrayList<ita.kangaroo.model.OrderProductBean> orderProductBeanList14 = ordineBean12.getProducts();
        float float15 = ordineBean12.getPrezzo_totale();
        ordineBean12.setId((int) (byte) 0);
        ordineBean12.setNumero_carta("Data non disponibile");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(orderProductBeanList14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.0f + "'", float15 == 0.0f);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        int int2 = orderProductBean0.getId_ordine();
        orderProductBean0.setQuantita((int) 'a');
        int int5 = orderProductBean0.getId_ordine();
        int int6 = orderProductBean0.getId_ordine();
        float float7 = orderProductBean0.getPrezzo();
        orderProductBean0.setId_prodotto((int) (byte) 1);
        float float10 = orderProductBean0.getPrezzo();
        orderProductBean0.setIVA((float) (short) -1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        ordineBean12.setNumero_carta("");
        java.sql.Date date16 = ordineBean12.getData();
        ordineBean12.setMetodo_di_pagamento("");
        float float19 = ordineBean12.getPrezzo_totale();
        ordineBean12.setNumero_carta("");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.0f + "'", float19 == 0.0f);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        ita.kangaroo.model.Cart cart0 = new ita.kangaroo.model.Cart();
        ita.kangaroo.model.tipo tipo8 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean9 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo8);
        java.lang.String str10 = prodottoBean9.getImmagine();
        prodottoBean9.setPrezzo((float) (-1L));
        int int13 = prodottoBean9.getId();
        prodottoBean9.setPrezzo(10.0f);
        prodottoBean9.setPrezzo(0.0f);
        prodottoBean9.setNome("Data non disponibile");
        cart0.changeQuantity(prodottoBean9, (int) '4');
        ita.kangaroo.model.tipo tipo29 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean30 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo29);
        java.lang.String str31 = prodottoBean30.getImmagine();
        prodottoBean30.setPrezzo((float) (-1L));
        int int34 = prodottoBean30.getId();
        float float35 = prodottoBean30.getIva();
        prodottoBean30.setQuantita((int) ' ');
        ita.kangaroo.model.tipo tipo38 = prodottoBean30.getTipo();
        cart0.changeQuantity(prodottoBean30, (int) (short) 100);
        java.util.ArrayList<ita.kangaroo.model.CartProduct> cartProductList41 = cart0.getProducts();
        java.util.ArrayList<ita.kangaroo.model.CartProduct> cartProductList42 = cart0.getProducts();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 1.0f + "'", float35 == 1.0f);
        org.junit.Assert.assertNull(tipo38);
        org.junit.Assert.assertNotNull(cartProductList41);
        org.junit.Assert.assertNotNull(cartProductList42);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 10, "hi!", "", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", (float) (-1), (int) (byte) 100, (float) (byte) 0, tipo7);
        int int9 = prodottoBean8.getId();
        prodottoBean8.setNome("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        ita.kangaroo.model.tipo tipo12 = prodottoBean8.getTipo();
        java.lang.String str13 = prodottoBean8.toString();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNull(tipo12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ProdottoBean{id=10, descrizione='hi!', nome='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}" + "'", str13, "ProdottoBean{id=10, descrizione='hi!', nome='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}");
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        utenteBean11.setEmail("");
        ita.kangaroo.model.OrdineBean ordineBean15 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str16 = ordineBean15.getNumero_carta();
        java.lang.String str17 = ordineBean15.toString();
        ordineBean15.setIndirizzo_di_spedizione("3a987acf8cbc1028b7dbc86bd086831151899a2b");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Data non disponibile" + "'", str17, "Data non disponibile");
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        java.lang.String str12 = utenteBean11.getUsername();
        utenteBean11.setCognome("");
        ita.kangaroo.model.OrdineBean ordineBean15 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        ita.kangaroo.model.OrdineBean ordineBean16 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        ordineBean16.setMetodo_di_spedizione("ProdottoBean{id=52, descrizione='hi!', nome='', immagine='da39a3ee5e6b4b0d3255bfef95601890afd80709', prezzo=32.0, quantita=-1, iva=52.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        ita.kangaroo.model.Cart cart0 = new ita.kangaroo.model.Cart();
        ita.kangaroo.model.tipo tipo8 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean9 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo8);
        java.lang.String str10 = prodottoBean9.getDescrizione();
        java.lang.String str11 = prodottoBean9.getNome();
        int int12 = prodottoBean9.getQuantita();
        prodottoBean9.setDescrizione("hi!");
        cart0.addProduct(prodottoBean9);
        java.util.ArrayList<ita.kangaroo.model.CartProduct> cartProductList16 = cart0.getProducts();
        ita.kangaroo.model.Cart cart17 = new ita.kangaroo.model.Cart();
        ita.kangaroo.model.tipo tipo25 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean26 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo25);
        int int27 = prodottoBean26.getId();
        java.lang.String str28 = prodottoBean26.getImmagine();
        cart17.removeProduct(prodottoBean26);
        ita.kangaroo.model.tipo tipo37 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean38 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo37);
        java.lang.String str39 = prodottoBean38.getDescrizione();
        java.lang.String str40 = prodottoBean38.getNome();
        ita.kangaroo.model.tipo tipo41 = prodottoBean38.getTipo();
        cart17.removeProduct(prodottoBean38);
        cart0.removeProduct(prodottoBean38);
        java.util.ArrayList<ita.kangaroo.model.CartProduct> cartProductList44 = cart0.getProducts();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(cartProductList16);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertNull(tipo41);
        org.junit.Assert.assertNotNull(cartProductList44);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        ita.kangaroo.model.Cart cart0 = new ita.kangaroo.model.Cart();
        ita.kangaroo.model.tipo tipo8 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean9 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo8);
        java.lang.String str10 = prodottoBean9.getDescrizione();
        java.lang.String str11 = prodottoBean9.getNome();
        int int12 = prodottoBean9.getQuantita();
        prodottoBean9.setDescrizione("hi!");
        cart0.addProduct(prodottoBean9);
        ita.kangaroo.model.tipo tipo23 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean24 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo23);
        java.lang.String str25 = prodottoBean24.getImmagine();
        int int26 = prodottoBean24.getQuantita();
        prodottoBean24.setImmagine("hi!");
        ita.kangaroo.model.CartProduct cartProduct30 = new ita.kangaroo.model.CartProduct(prodottoBean24, (int) (short) 100);
        cart0.changeQuantity(prodottoBean24, (int) (short) 10);
        ita.kangaroo.model.tipo tipo40 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean41 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo40);
        java.lang.String str42 = prodottoBean41.getImmagine();
        prodottoBean41.setPrezzo((float) (-1L));
        int int45 = prodottoBean41.getId();
        prodottoBean41.setPrezzo(10.0f);
        prodottoBean41.setPrezzo(0.0f);
        prodottoBean41.setNome("Data non disponibile");
        cart0.removeProduct(prodottoBean41);
        prodottoBean41.setDescrizione("");
        prodottoBean41.setPrezzo((float) 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        ita.kangaroo.model.CartProduct cartProduct10 = new ita.kangaroo.model.CartProduct(prodottoBean8, (int) (short) 100);
        int int11 = cartProduct10.getQuantity();
        ita.kangaroo.model.ProdottoBean prodottoBean12 = cartProduct10.getProduct();
        float float13 = prodottoBean12.getPrezzo();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(prodottoBean12);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        ita.kangaroo.model.MetodoPagamentoBean metodoPagamentoBean0 = new ita.kangaroo.model.MetodoPagamentoBean();
        metodoPagamentoBean0.setId((int) 'a');
        metodoPagamentoBean0.setCircuito("");
        metodoPagamentoBean0.setData_scadenza("hi!");
        java.lang.String str7 = metodoPagamentoBean0.getUsername();
        metodoPagamentoBean0.setId(0);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
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
        metodoPagamentoBean0.setUsername("ProdottoBean{id=10, descrizione='hi!', nome='', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}");
        metodoPagamentoBean0.setData_scadenza("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        ita.kangaroo.model.tipo tipo6 = null;
        ita.kangaroo.model.utenteBean utenteBean12 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo6, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean13 = new ita.kangaroo.model.OrdineBean(utenteBean12);
        utenteBean12.setPassword("hi!");
        utenteBean12.setNome("hi!");
        java.sql.Date date25 = null;
        ita.kangaroo.model.OrdineBean ordineBean27 = new ita.kangaroo.model.OrdineBean((int) (byte) 100, utenteBean12, (float) (-1L), "hi!", "", "", "hi!", "Data non disponibile", "hi!", date25, "");
        ordineBean27.setIndirizzo_di_spedizione("Data non disponibile");
        java.lang.String str30 = ordineBean27.getDestinatario();
        java.lang.String str31 = ordineBean27.getMetodo_di_pagamento();
        ita.kangaroo.model.tipo tipo38 = null;
        ita.kangaroo.model.utenteBean utenteBean44 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo38, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean45 = new ita.kangaroo.model.OrdineBean(utenteBean44);
        utenteBean44.setPassword("hi!");
        utenteBean44.setNome("hi!");
        java.sql.Date date57 = null;
        ita.kangaroo.model.OrdineBean ordineBean59 = new ita.kangaroo.model.OrdineBean((int) (byte) 100, utenteBean44, (float) (-1L), "hi!", "", "", "hi!", "Data non disponibile", "hi!", date57, "");
        java.lang.String str60 = utenteBean44.getCognome();
        ordineBean27.setClient(utenteBean44);
        java.lang.String str62 = utenteBean44.getTelefono();
        java.lang.String str63 = utenteBean44.getPassword();
        utenteBean44.setCognome("hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "3a987acf8cbc1028b7dbc86bd086831151899a2b" + "'", str63, "3a987acf8cbc1028b7dbc86bd086831151899a2b");
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.utenteBean utenteBean13 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo7, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean14 = new ita.kangaroo.model.OrdineBean(utenteBean13);
        java.lang.String str15 = ordineBean14.getMetodo_di_spedizione();
        ordineBean14.setNumero_carta("");
        java.sql.Date date18 = ordineBean14.getData();
        int int19 = ordineBean14.getId();
        ita.kangaroo.model.tipo tipo25 = null;
        ita.kangaroo.model.utenteBean utenteBean31 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo25, "hi!", "", "", "hi!", "");
        java.lang.String str32 = utenteBean31.getProvincia();
        java.lang.String str33 = utenteBean31.getCognome();
        ordineBean14.setClient(utenteBean31);
        java.lang.String str35 = utenteBean31.getCap();
        utenteBean31.setUsername("Data non disponibile");
        utenteBean31.setProvincia("Data non disponibile");
        java.sql.Date date47 = null;
        ita.kangaroo.model.OrdineBean ordineBean49 = new ita.kangaroo.model.OrdineBean((int) (short) 0, utenteBean31, 0.0f, "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "Data non disponibile", "hi!", "", "hi!", "Data non disponibile", date47, "");
        java.sql.Date date57 = null;
        ita.kangaroo.model.OrdineBean ordineBean59 = new ita.kangaroo.model.OrdineBean((int) (short) 100, utenteBean31, (float) 10L, "", "ProdottoBean{id=10, descrizione='hi!', nome='', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}", "", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "3a987acf8cbc1028b7dbc86bd086831151899a2b", date57, "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        java.lang.String str60 = utenteBean31.getTelefono();
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(date18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        utenteBean11.setEmail("hi!");
        utenteBean11.setPassword("hi!");
        ita.kangaroo.model.tipo tipo16 = null;
        utenteBean11.setTipo(tipo16);
        utenteBean11.setCitta("Data non disponibile");
        java.lang.String str20 = utenteBean11.getTelefono();
        utenteBean11.setCognome("ProdottoBean{id=32, descrizione='Data non disponibile', nome='Data non disponibile', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=32.0, quantita=32, iva=10.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        ordineBean12.setIndirizzo_di_spedizione("Data non disponibile");
        ordineBean12.setNumero_di_tracking("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        java.lang.String str17 = ordineBean12.getMetodo_di_spedizione();
        ordineBean12.setNumero_carta("3d1583397bcebff274b1e7cb58087c39153af974");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 10, "hi!", "hi!", "Data non disponibile", (float) (byte) 10, 10, (float) ' ', tipo7);
        java.lang.String str9 = prodottoBean8.getNome();
        java.lang.String str10 = prodottoBean8.getNome();
        java.lang.String str11 = prodottoBean8.getImmagine();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Data non disponibile" + "'", str11, "Data non disponibile");
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        ita.kangaroo.model.tipo tipo6 = null;
        ita.kangaroo.model.utenteBean utenteBean12 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo6, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean13 = new ita.kangaroo.model.OrdineBean(utenteBean12);
        utenteBean12.setPassword("hi!");
        utenteBean12.setNome("hi!");
        java.sql.Date date25 = null;
        ita.kangaroo.model.OrdineBean ordineBean27 = new ita.kangaroo.model.OrdineBean((int) (byte) 100, utenteBean12, (float) (-1L), "hi!", "", "", "hi!", "Data non disponibile", "hi!", date25, "");
        ordineBean27.setIndirizzo_di_spedizione("Data non disponibile");
        java.lang.String str30 = ordineBean27.getDestinatario();
        java.lang.String str31 = ordineBean27.getDestinatario();
        ita.kangaroo.model.tipo tipo37 = null;
        ita.kangaroo.model.utenteBean utenteBean43 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo37, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean44 = new ita.kangaroo.model.OrdineBean(utenteBean43);
        java.lang.String str45 = ordineBean44.getMetodo_di_spedizione();
        java.util.ArrayList<ita.kangaroo.model.OrderProductBean> orderProductBeanList46 = ordineBean44.getProducts();
        ordineBean27.setProducts(orderProductBeanList46);
        ita.kangaroo.model.OrdineBean ordineBean48 = new ita.kangaroo.model.OrdineBean(orderProductBeanList46);
        ordineBean48.setPrezzo_totale(100.0f);
        java.sql.Date date51 = null;
        ordineBean48.setData(date51);
        ordineBean48.setDestinatario("3d1583397bcebff274b1e7cb58087c39153af974");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(orderProductBeanList46);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getDescrizione();
        java.lang.String str10 = prodottoBean8.getNome();
        ita.kangaroo.model.tipo tipo11 = prodottoBean8.getTipo();
        ita.kangaroo.model.tipo tipo12 = prodottoBean8.getTipo();
        float float13 = prodottoBean8.getPrezzo();
        int int14 = prodottoBean8.getQuantita();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(tipo11);
        org.junit.Assert.assertNull(tipo12);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        java.util.ArrayList<ita.kangaroo.model.OrderProductBean> orderProductBeanList14 = ordineBean12.getProducts();
        ordineBean12.setNumero_carta("hi!");
        ita.kangaroo.model.tipo tipo22 = null;
        ita.kangaroo.model.utenteBean utenteBean28 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo22, "hi!", "", "", "hi!", "");
        utenteBean28.setEmail("hi!");
        java.lang.String str31 = utenteBean28.getCognome();
        utenteBean28.setCitta("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        ordineBean12.setClient(utenteBean28);
        java.lang.String str35 = utenteBean28.getTelefono();
        java.lang.String str36 = utenteBean28.getCap();
        java.lang.String str37 = utenteBean28.getVia();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(orderProductBeanList14);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        ita.kangaroo.model.Cart cart0 = new ita.kangaroo.model.Cart();
        ita.kangaroo.model.tipo tipo8 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean9 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo8);
        int int10 = prodottoBean9.getId();
        java.lang.String str11 = prodottoBean9.getImmagine();
        cart0.removeProduct(prodottoBean9);
        ita.kangaroo.model.tipo tipo20 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean21 = new ita.kangaroo.model.ProdottoBean((int) (byte) 10, "hi!", "hi!", "Data non disponibile", (float) (byte) 10, 10, (float) ' ', tipo20);
        ita.kangaroo.model.CartProduct cartProduct22 = new ita.kangaroo.model.CartProduct(prodottoBean21);
        cart0.removeProduct(prodottoBean21);
        int int24 = prodottoBean21.getId();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getImmagine();
        prodottoBean8.setPrezzo((float) (-1L));
        int int12 = prodottoBean8.getId();
        ita.kangaroo.model.CartProduct cartProduct13 = new ita.kangaroo.model.CartProduct(prodottoBean8);
        prodottoBean8.setQuantita((int) (short) -1);
        int int16 = prodottoBean8.getQuantita();
        java.lang.String str17 = prodottoBean8.getImmagine();
        prodottoBean8.setQuantita(1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) -1, "Data non disponibile", "Data non disponibile", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", (float) ' ', (int) ' ', (float) ' ', tipo7);
        ita.kangaroo.model.CartProduct cartProduct9 = new ita.kangaroo.model.CartProduct(prodottoBean8);
        ita.kangaroo.model.CartProduct cartProduct10 = new ita.kangaroo.model.CartProduct(prodottoBean8);
        ita.kangaroo.model.CartProduct cartProduct12 = new ita.kangaroo.model.CartProduct(prodottoBean8, (int) (byte) -1);
        ita.kangaroo.model.ProdottoBean prodottoBean13 = cartProduct12.getProduct();
        org.junit.Assert.assertNotNull(prodottoBean13);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        ita.kangaroo.model.OrdineBean ordineBean0 = new ita.kangaroo.model.OrdineBean();
        ordineBean0.setMetodo_di_spedizione("hi!");
        java.lang.String str3 = ordineBean0.getIndirizzo_di_spedizione();
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getImmagine();
        int int10 = prodottoBean8.getQuantita();
        prodottoBean8.setImmagine("hi!");
        ita.kangaroo.model.CartProduct cartProduct14 = new ita.kangaroo.model.CartProduct(prodottoBean8, (int) (short) 100);
        ita.kangaroo.model.CartProduct cartProduct15 = new ita.kangaroo.model.CartProduct(prodottoBean8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        ita.kangaroo.model.Cart cart0 = new ita.kangaroo.model.Cart();
        ita.kangaroo.model.tipo tipo8 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean9 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo8);
        java.lang.String str10 = prodottoBean9.getImmagine();
        prodottoBean9.setPrezzo((float) (-1L));
        int int13 = prodottoBean9.getId();
        prodottoBean9.setPrezzo(10.0f);
        prodottoBean9.setPrezzo(0.0f);
        prodottoBean9.setNome("Data non disponibile");
        cart0.changeQuantity(prodottoBean9, (int) '4');
        ita.kangaroo.model.tipo tipo29 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean30 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo29);
        java.lang.String str31 = prodottoBean30.getImmagine();
        prodottoBean30.setPrezzo((float) (-1L));
        int int34 = prodottoBean30.getId();
        float float35 = prodottoBean30.getIva();
        prodottoBean30.setQuantita((int) ' ');
        ita.kangaroo.model.tipo tipo38 = prodottoBean30.getTipo();
        cart0.changeQuantity(prodottoBean30, (int) (short) 100);
        ita.kangaroo.model.tipo tipo48 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean49 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo48);
        java.lang.String str50 = prodottoBean49.getImmagine();
        int int51 = prodottoBean49.getQuantita();
        ita.kangaroo.model.CartProduct cartProduct52 = new ita.kangaroo.model.CartProduct(prodottoBean49);
        prodottoBean49.setNome("");
        cart0.addProduct(prodottoBean49);
        ita.kangaroo.model.CartProduct cartProduct56 = new ita.kangaroo.model.CartProduct(prodottoBean49);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 1.0f + "'", float35 == 1.0f);
        org.junit.Assert.assertNull(tipo38);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        int int2 = orderProductBean0.getId_ordine();
        orderProductBean0.setQuantita((int) 'a');
        int int5 = orderProductBean0.getId_ordine();
        orderProductBean0.setId_ordine(100);
        float float8 = orderProductBean0.getPrezzo();
        int int9 = orderProductBean0.getId_ordine();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getImmagine();
        int int10 = prodottoBean8.getQuantita();
        java.lang.String str11 = prodottoBean8.getImmagine();
        java.lang.String str12 = prodottoBean8.getDescrizione();
        float float13 = prodottoBean8.getPrezzo();
        prodottoBean8.setQuantita((int) (short) -1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        ordineBean12.setIndirizzo_di_spedizione("Data non disponibile");
        java.lang.String str15 = ordineBean12.getMetodo_di_pagamento();
        java.lang.String str16 = ordineBean12.getNumero_di_tracking();
        java.sql.Date date17 = ordineBean12.getData();
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(date17);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        ita.kangaroo.model.MetodoPagamentoBean metodoPagamentoBean0 = new ita.kangaroo.model.MetodoPagamentoBean();
        metodoPagamentoBean0.setId((int) (byte) 0);
        java.lang.String str3 = metodoPagamentoBean0.getCvv();
        ita.kangaroo.model.AddressBean addressBean4 = new ita.kangaroo.model.AddressBean();
        java.lang.String str5 = addressBean4.getVia();
        java.lang.String str6 = addressBean4.getUsername();
        addressBean4.setUsername("hi!");
        addressBean4.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        boolean boolean12 = addressBean4.equals((java.lang.Object) 10L);
        addressBean4.setUsername("hi!");
        addressBean4.setCitta("");
        boolean boolean17 = metodoPagamentoBean0.equals((java.lang.Object) addressBean4);
        java.lang.String str18 = metodoPagamentoBean0.getCircuito();
        ita.kangaroo.model.Cart cart19 = new ita.kangaroo.model.Cart();
        ita.kangaroo.model.tipo tipo27 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean28 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo27);
        java.lang.String str29 = prodottoBean28.getDescrizione();
        java.lang.String str30 = prodottoBean28.getNome();
        int int31 = prodottoBean28.getQuantita();
        prodottoBean28.setDescrizione("hi!");
        cart19.addProduct(prodottoBean28);
        java.util.ArrayList<ita.kangaroo.model.CartProduct> cartProductList35 = cart19.getProducts();
        ita.kangaroo.model.Cart cart36 = new ita.kangaroo.model.Cart();
        ita.kangaroo.model.tipo tipo44 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean45 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo44);
        int int46 = prodottoBean45.getId();
        java.lang.String str47 = prodottoBean45.getImmagine();
        cart36.removeProduct(prodottoBean45);
        ita.kangaroo.model.tipo tipo56 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean57 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo56);
        java.lang.String str58 = prodottoBean57.getDescrizione();
        java.lang.String str59 = prodottoBean57.getNome();
        ita.kangaroo.model.tipo tipo60 = prodottoBean57.getTipo();
        cart36.removeProduct(prodottoBean57);
        cart19.removeProduct(prodottoBean57);
        ita.kangaroo.model.CartProduct cartProduct63 = new ita.kangaroo.model.CartProduct(prodottoBean57);
        boolean boolean64 = metodoPagamentoBean0.equals((java.lang.Object) prodottoBean57);
        java.lang.String str65 = prodottoBean57.getNome();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(cartProductList35);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertNull(tipo60);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        ita.kangaroo.model.Cart cart0 = new ita.kangaroo.model.Cart();
        ita.kangaroo.model.tipo tipo8 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean9 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo8);
        java.lang.String str10 = prodottoBean9.getDescrizione();
        java.lang.String str11 = prodottoBean9.getNome();
        int int12 = prodottoBean9.getQuantita();
        prodottoBean9.setDescrizione("hi!");
        cart0.addProduct(prodottoBean9);
        java.util.ArrayList<ita.kangaroo.model.CartProduct> cartProductList16 = cart0.getProducts();
        ita.kangaroo.model.Cart cart17 = new ita.kangaroo.model.Cart();
        ita.kangaroo.model.tipo tipo25 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean26 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo25);
        int int27 = prodottoBean26.getId();
        java.lang.String str28 = prodottoBean26.getImmagine();
        cart17.removeProduct(prodottoBean26);
        ita.kangaroo.model.tipo tipo37 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean38 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo37);
        java.lang.String str39 = prodottoBean38.getDescrizione();
        java.lang.String str40 = prodottoBean38.getNome();
        ita.kangaroo.model.tipo tipo41 = prodottoBean38.getTipo();
        cart17.removeProduct(prodottoBean38);
        cart0.removeProduct(prodottoBean38);
        prodottoBean38.setQuantita((int) (short) 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(cartProductList16);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertNull(tipo41);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        ita.kangaroo.model.Cart cart0 = new ita.kangaroo.model.Cart();
        ita.kangaroo.model.tipo tipo8 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean9 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo8);
        java.lang.String str10 = prodottoBean9.getDescrizione();
        java.lang.String str11 = prodottoBean9.getNome();
        int int12 = prodottoBean9.getQuantita();
        prodottoBean9.setDescrizione("hi!");
        cart0.addProduct(prodottoBean9);
        ita.kangaroo.model.tipo tipo23 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean24 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo23);
        java.lang.String str25 = prodottoBean24.getImmagine();
        int int26 = prodottoBean24.getQuantita();
        prodottoBean24.setImmagine("hi!");
        ita.kangaroo.model.CartProduct cartProduct30 = new ita.kangaroo.model.CartProduct(prodottoBean24, (int) (short) 100);
        cart0.changeQuantity(prodottoBean24, (int) (short) 10);
        ita.kangaroo.model.Cart cart33 = new ita.kangaroo.model.Cart();
        ita.kangaroo.model.tipo tipo41 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean42 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo41);
        java.lang.String str43 = prodottoBean42.getDescrizione();
        java.lang.String str44 = prodottoBean42.getNome();
        int int45 = prodottoBean42.getQuantita();
        prodottoBean42.setDescrizione("hi!");
        cart33.addProduct(prodottoBean42);
        ita.kangaroo.model.tipo tipo56 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean57 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo56);
        java.lang.String str58 = prodottoBean57.getImmagine();
        int int59 = prodottoBean57.getQuantita();
        prodottoBean57.setImmagine("hi!");
        ita.kangaroo.model.CartProduct cartProduct63 = new ita.kangaroo.model.CartProduct(prodottoBean57, (int) (short) 100);
        cart33.changeQuantity(prodottoBean57, (int) (short) 10);
        int int66 = prodottoBean57.getQuantita();
        cart0.addProduct(prodottoBean57);
        ita.kangaroo.model.tipo tipo75 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean76 = new ita.kangaroo.model.ProdottoBean(35, "hi!", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "Data non disponibile", 32.0f, (int) '#', (float) 35, tipo75);
        cart0.changeQuantity(prodottoBean76, 32);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) -1, "Data non disponibile", "Data non disponibile", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", (float) ' ', (int) ' ', (float) ' ', tipo7);
        ita.kangaroo.model.CartProduct cartProduct9 = new ita.kangaroo.model.CartProduct(prodottoBean8);
        int int10 = prodottoBean8.getQuantita();
        prodottoBean8.setIva((float) (short) 10);
        prodottoBean8.setId((int) ' ');
        float float15 = prodottoBean8.getPrezzo();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 32.0f + "'", float15 == 32.0f);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        float float2 = orderProductBean0.getIVA();
        orderProductBean0.setPrezzo(10.0f);
        orderProductBean0.setQuantita((int) (short) -1);
        orderProductBean0.setPrezzo((float) 'a');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        float float2 = orderProductBean0.getIVA();
        orderProductBean0.setPrezzo(10.0f);
        int int5 = orderProductBean0.getId_ordine();
        int int6 = orderProductBean0.getId_ordine();
        int int7 = orderProductBean0.getQuantita();
        int int8 = orderProductBean0.getQuantita();
        java.lang.Class<?> wildcardClass9 = orderProductBean0.getClass();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        ita.kangaroo.model.Cart cart0 = new ita.kangaroo.model.Cart();
        ita.kangaroo.model.tipo tipo8 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean9 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo8);
        java.lang.String str10 = prodottoBean9.getDescrizione();
        java.lang.String str11 = prodottoBean9.getNome();
        int int12 = prodottoBean9.getQuantita();
        prodottoBean9.setDescrizione("hi!");
        cart0.addProduct(prodottoBean9);
        java.util.ArrayList<ita.kangaroo.model.CartProduct> cartProductList16 = cart0.getProducts();
        ita.kangaroo.model.Cart cart17 = new ita.kangaroo.model.Cart();
        ita.kangaroo.model.tipo tipo25 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean26 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo25);
        int int27 = prodottoBean26.getId();
        java.lang.String str28 = prodottoBean26.getImmagine();
        cart17.removeProduct(prodottoBean26);
        ita.kangaroo.model.tipo tipo37 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean38 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo37);
        java.lang.String str39 = prodottoBean38.getDescrizione();
        java.lang.String str40 = prodottoBean38.getNome();
        ita.kangaroo.model.tipo tipo41 = prodottoBean38.getTipo();
        cart17.removeProduct(prodottoBean38);
        cart0.removeProduct(prodottoBean38);
        ita.kangaroo.model.CartProduct cartProduct44 = new ita.kangaroo.model.CartProduct(prodottoBean38);
        prodottoBean38.setImmagine("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='hi!', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(cartProductList16);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertNull(tipo41);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        ita.kangaroo.model.AddressBean addressBean0 = new ita.kangaroo.model.AddressBean();
        java.lang.String str1 = addressBean0.getVia();
        java.lang.String str2 = addressBean0.getUsername();
        addressBean0.setUsername("hi!");
        addressBean0.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        addressBean0.setCitta("hi!");
        addressBean0.setUsername("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        java.lang.String str11 = addressBean0.getCAP();
        ita.kangaroo.model.MetodoPagamentoBean metodoPagamentoBean12 = new ita.kangaroo.model.MetodoPagamentoBean();
        metodoPagamentoBean12.setId((int) 'a');
        ita.kangaroo.model.AddressBean addressBean15 = new ita.kangaroo.model.AddressBean();
        java.lang.String str16 = addressBean15.getVia();
        addressBean15.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        addressBean15.setCitta("hi!");
        boolean boolean21 = metodoPagamentoBean12.equals((java.lang.Object) addressBean15);
        java.lang.String str22 = metodoPagamentoBean12.getNumero_carta();
        java.lang.String str23 = metodoPagamentoBean12.getNumero_carta();
        java.lang.String str24 = metodoPagamentoBean12.getCvv();
        boolean boolean25 = addressBean0.equals((java.lang.Object) metodoPagamentoBean12);
        java.lang.String str26 = addressBean0.getUsername();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}" + "'", str26, "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        java.lang.String str12 = utenteBean11.getUsername();
        java.lang.String str13 = utenteBean11.getCap();
        utenteBean11.setUsername("");
        ita.kangaroo.model.OrdineBean ordineBean16 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.sql.Date date17 = ordineBean16.getData();
        java.lang.String str18 = ordineBean16.getMetodo_di_spedizione();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(date17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        float float13 = ordineBean12.getPrezzo_totale();
        java.lang.String str14 = ordineBean12.getNumero_carta();
        ordineBean12.setDestinatario("hi!");
        java.lang.String str17 = ordineBean12.getMetodo_di_spedizione();
        java.lang.String str18 = ordineBean12.toString();
        ordineBean12.setCircuito("hi!");
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Data non disponibile" + "'", str18, "Data non disponibile");
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        ordineBean12.setIndirizzo_di_spedizione("Data non disponibile");
        java.lang.String str15 = ordineBean12.getMetodo_di_pagamento();
        ordineBean12.setMetodo_di_spedizione("ProdottoBean{id=10, descrizione='hi!', nome='', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}");
        ordineBean12.setPrezzo_totale((-1.0f));
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        ita.kangaroo.model.tipo tipo6 = null;
        ita.kangaroo.model.utenteBean utenteBean12 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo6, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean13 = new ita.kangaroo.model.OrdineBean(utenteBean12);
        utenteBean12.setPassword("hi!");
        utenteBean12.setNome("hi!");
        java.sql.Date date25 = null;
        ita.kangaroo.model.OrdineBean ordineBean27 = new ita.kangaroo.model.OrdineBean((int) (byte) 100, utenteBean12, (float) (-1L), "hi!", "", "", "hi!", "Data non disponibile", "hi!", date25, "");
        ordineBean27.setIndirizzo_di_spedizione("Data non disponibile");
        java.lang.String str30 = ordineBean27.getDestinatario();
        java.lang.String str31 = ordineBean27.getMetodo_di_pagamento();
        ita.kangaroo.model.tipo tipo38 = null;
        ita.kangaroo.model.utenteBean utenteBean44 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo38, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean45 = new ita.kangaroo.model.OrdineBean(utenteBean44);
        utenteBean44.setPassword("hi!");
        utenteBean44.setNome("hi!");
        java.sql.Date date57 = null;
        ita.kangaroo.model.OrdineBean ordineBean59 = new ita.kangaroo.model.OrdineBean((int) (byte) 100, utenteBean44, (float) (-1L), "hi!", "", "", "hi!", "Data non disponibile", "hi!", date57, "");
        java.lang.String str60 = utenteBean44.getCognome();
        ordineBean27.setClient(utenteBean44);
        java.lang.String str62 = utenteBean44.getTelefono();
        utenteBean44.setTelefono("Data non disponibile");
        java.lang.String str65 = utenteBean44.getVia();
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        ita.kangaroo.model.MetodoPagamentoBean metodoPagamentoBean0 = new ita.kangaroo.model.MetodoPagamentoBean();
        metodoPagamentoBean0.setId((int) 'a');
        ita.kangaroo.model.AddressBean addressBean3 = new ita.kangaroo.model.AddressBean();
        java.lang.String str4 = addressBean3.getVia();
        addressBean3.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        addressBean3.setCitta("hi!");
        boolean boolean9 = metodoPagamentoBean0.equals((java.lang.Object) addressBean3);
        metodoPagamentoBean0.setNumero_carta("Data non disponibile");
        java.lang.String str12 = metodoPagamentoBean0.getNumero_carta();
        metodoPagamentoBean0.setNumero_carta("3a987acf8cbc1028b7dbc86bd086831151899a2b");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Data non disponibile" + "'", str12, "Data non disponibile");
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        ordineBean12.setNumero_carta("");
        java.lang.String str16 = ordineBean12.getNumero_carta();
        ordineBean12.setCircuito("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        java.lang.String str19 = ordineBean12.toString();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Data non disponibile" + "'", str19, "Data non disponibile");
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        int int2 = orderProductBean0.getId_ordine();
        orderProductBean0.setQuantita((int) 'a');
        int int5 = orderProductBean0.getId_prodotto();
        float float6 = orderProductBean0.getPrezzo();
        orderProductBean0.setQuantita((int) (byte) 100);
        float float9 = orderProductBean0.getIVA();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        ita.kangaroo.model.Cart cart0 = new ita.kangaroo.model.Cart();
        ita.kangaroo.model.tipo tipo8 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean9 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo8);
        int int10 = prodottoBean9.getId();
        java.lang.String str11 = prodottoBean9.getImmagine();
        cart0.removeProduct(prodottoBean9);
        ita.kangaroo.model.tipo tipo20 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean21 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo20);
        java.lang.String str22 = prodottoBean21.getDescrizione();
        java.lang.String str23 = prodottoBean21.getNome();
        ita.kangaroo.model.tipo tipo24 = prodottoBean21.getTipo();
        cart0.removeProduct(prodottoBean21);
        ita.kangaroo.model.tipo tipo33 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean34 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo33);
        java.lang.String str35 = prodottoBean34.getImmagine();
        prodottoBean34.setPrezzo((float) (-1L));
        int int38 = prodottoBean34.getId();
        float float39 = prodottoBean34.getIva();
        prodottoBean34.setQuantita((int) ' ');
        ita.kangaroo.model.tipo tipo42 = prodottoBean34.getTipo();
        cart0.addProduct(prodottoBean34);
        ita.kangaroo.model.tipo tipo51 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean52 = new ita.kangaroo.model.ProdottoBean((int) (byte) -1, "Data non disponibile", "Data non disponibile", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", (float) ' ', (int) ' ', (float) ' ', tipo51);
        ita.kangaroo.model.CartProduct cartProduct53 = new ita.kangaroo.model.CartProduct(prodottoBean52);
        int int54 = prodottoBean52.getQuantita();
        prodottoBean52.setDescrizione("hi!");
        prodottoBean52.setIva(0.0f);
        cart0.changeQuantity(prodottoBean52, (-1));
        ita.kangaroo.model.Cart cart61 = new ita.kangaroo.model.Cart();
        ita.kangaroo.model.tipo tipo69 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean70 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo69);
        int int71 = prodottoBean70.getId();
        java.lang.String str72 = prodottoBean70.getImmagine();
        cart61.removeProduct(prodottoBean70);
        ita.kangaroo.model.tipo tipo74 = prodottoBean70.getTipo();
        float float75 = prodottoBean70.getPrezzo();
        ita.kangaroo.model.CartProduct cartProduct76 = new ita.kangaroo.model.CartProduct(prodottoBean70);
        cart0.addProduct(prodottoBean70);
        ita.kangaroo.model.CartProduct cartProduct79 = new ita.kangaroo.model.CartProduct(prodottoBean70, 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNull(tipo24);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 1.0f + "'", float39 == 1.0f);
        org.junit.Assert.assertNull(tipo42);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 32 + "'", int54 == 32);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 1 + "'", int71 == 1);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "hi!" + "'", str72, "hi!");
        org.junit.Assert.assertNull(tipo74);
        org.junit.Assert.assertTrue("'" + float75 + "' != '" + 1.0f + "'", float75 == 1.0f);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        ita.kangaroo.model.MetodoPagamentoBean metodoPagamentoBean0 = new ita.kangaroo.model.MetodoPagamentoBean();
        metodoPagamentoBean0.setId((int) (byte) 0);
        java.lang.String str3 = metodoPagamentoBean0.getCvv();
        java.lang.String str4 = metodoPagamentoBean0.getCvv();
        java.lang.String str5 = metodoPagamentoBean0.getData_scadenza();
        metodoPagamentoBean0.setNumero_carta("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='hi!', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
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
        metodoPagamentoBean0.setNumero_carta("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        metodoPagamentoBean0.setCircuito("Data non disponibile");
        java.lang.String str35 = metodoPagamentoBean0.getCvv();
        metodoPagamentoBean0.setData_scadenza("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Data non disponibile" + "'", str35, "Data non disponibile");
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        ita.kangaroo.model.MetodoPagamentoBean metodoPagamentoBean0 = new ita.kangaroo.model.MetodoPagamentoBean();
        metodoPagamentoBean0.setId((int) 'a');
        metodoPagamentoBean0.setCircuito("");
        metodoPagamentoBean0.setData_scadenza("hi!");
        metodoPagamentoBean0.setId((int) '4');
        ita.kangaroo.model.Cart cart9 = new ita.kangaroo.model.Cart();
        ita.kangaroo.model.tipo tipo17 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean18 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo17);
        java.lang.String str19 = prodottoBean18.getDescrizione();
        java.lang.String str20 = prodottoBean18.getNome();
        int int21 = prodottoBean18.getQuantita();
        prodottoBean18.setDescrizione("hi!");
        cart9.addProduct(prodottoBean18);
        ita.kangaroo.model.tipo tipo32 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean33 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo32);
        java.lang.String str34 = prodottoBean33.getImmagine();
        int int35 = prodottoBean33.getQuantita();
        prodottoBean33.setImmagine("hi!");
        ita.kangaroo.model.CartProduct cartProduct39 = new ita.kangaroo.model.CartProduct(prodottoBean33, (int) (short) 100);
        cart9.changeQuantity(prodottoBean33, (int) (short) 10);
        boolean boolean42 = metodoPagamentoBean0.equals((java.lang.Object) prodottoBean33);
        metodoPagamentoBean0.setCvv("hi!");
        metodoPagamentoBean0.setId((int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        ita.kangaroo.model.tipo tipo6 = null;
        ita.kangaroo.model.utenteBean utenteBean12 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo6, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean13 = new ita.kangaroo.model.OrdineBean(utenteBean12);
        utenteBean12.setPassword("hi!");
        utenteBean12.setNome("hi!");
        java.sql.Date date25 = null;
        ita.kangaroo.model.OrdineBean ordineBean27 = new ita.kangaroo.model.OrdineBean((int) (byte) 100, utenteBean12, (float) (-1L), "hi!", "", "", "hi!", "Data non disponibile", "hi!", date25, "");
        ordineBean27.setIndirizzo_di_spedizione("Data non disponibile");
        java.lang.String str30 = ordineBean27.getDestinatario();
        ordineBean27.setCircuito("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        ita.kangaroo.model.utenteBean utenteBean33 = ordineBean27.getClient();
        utenteBean33.setTelefono("hi!");
        utenteBean33.setUsername("da39a3ee5e6b4b0d3255bfef95601890afd80709");
        ita.kangaroo.model.OrdineBean ordineBean38 = new ita.kangaroo.model.OrdineBean(utenteBean33);
        ita.kangaroo.model.tipo tipo39 = utenteBean33.getTipo();
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(utenteBean33);
        org.junit.Assert.assertNull(tipo39);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("Data non disponibile", "", "", "", "", tipo5, "Data non disponibile", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "hi!", "Data non disponibile", "Data non disponibile");
        ita.kangaroo.model.tipo tipo12 = null;
        utenteBean11.setTipo(tipo12);
        java.lang.String str14 = utenteBean11.getVia();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Data non disponibile" + "'", str14, "Data non disponibile");
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("Data non disponibile", "Data non disponibile", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "Data non disponibile", "", tipo5, "hi!", "", "hi!", "hi!", "");
        java.lang.String str12 = utenteBean11.getCognome();
        utenteBean11.setUsername("hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Data non disponibile" + "'", str12, "Data non disponibile");
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        ita.kangaroo.model.MetodoPagamentoBean metodoPagamentoBean0 = new ita.kangaroo.model.MetodoPagamentoBean();
        metodoPagamentoBean0.setId((int) 'a');
        ita.kangaroo.model.AddressBean addressBean3 = new ita.kangaroo.model.AddressBean();
        java.lang.String str4 = addressBean3.getVia();
        addressBean3.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        addressBean3.setCitta("hi!");
        boolean boolean9 = metodoPagamentoBean0.equals((java.lang.Object) addressBean3);
        addressBean3.setUsername("Data non disponibile");
        addressBean3.setUsername("ProdottoBean{id=10, descrizione='hi!', nome='', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getDescrizione();
        ita.kangaroo.model.tipo tipo10 = null;
        prodottoBean8.setTipo(tipo10);
        prodottoBean8.setNome("da39a3ee5e6b4b0d3255bfef95601890afd80709");
        prodottoBean8.setId(0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        ita.kangaroo.model.MetodoPagamentoBean metodoPagamentoBean0 = new ita.kangaroo.model.MetodoPagamentoBean();
        metodoPagamentoBean0.setId((int) 'a');
        ita.kangaroo.model.AddressBean addressBean3 = new ita.kangaroo.model.AddressBean();
        java.lang.String str4 = addressBean3.getVia();
        addressBean3.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        addressBean3.setCitta("hi!");
        boolean boolean9 = metodoPagamentoBean0.equals((java.lang.Object) addressBean3);
        java.lang.String str10 = metodoPagamentoBean0.getCvv();
        metodoPagamentoBean0.setCvv("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        metodoPagamentoBean0.setCvv("ProdottoBean{id=10, descrizione='hi!', nome='', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}");
        java.lang.Class<?> wildcardClass15 = metodoPagamentoBean0.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        ordineBean12.setNumero_carta("hi!");
        float float16 = ordineBean12.getPrezzo_totale();
        java.lang.String str17 = ordineBean12.getDestinatario();
        int int18 = ordineBean12.getId();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        ita.kangaroo.model.tipo tipo6 = null;
        ita.kangaroo.model.utenteBean utenteBean12 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo6, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean13 = new ita.kangaroo.model.OrdineBean(utenteBean12);
        utenteBean12.setPassword("hi!");
        utenteBean12.setNome("hi!");
        java.sql.Date date25 = null;
        ita.kangaroo.model.OrdineBean ordineBean27 = new ita.kangaroo.model.OrdineBean((int) (byte) 100, utenteBean12, (float) (-1L), "hi!", "", "", "hi!", "Data non disponibile", "hi!", date25, "");
        ordineBean27.setIndirizzo_di_spedizione("Data non disponibile");
        java.lang.String str30 = ordineBean27.getDestinatario();
        java.lang.String str31 = ordineBean27.getMetodo_di_pagamento();
        ita.kangaroo.model.tipo tipo38 = null;
        ita.kangaroo.model.utenteBean utenteBean44 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo38, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean45 = new ita.kangaroo.model.OrdineBean(utenteBean44);
        utenteBean44.setPassword("hi!");
        utenteBean44.setNome("hi!");
        java.sql.Date date57 = null;
        ita.kangaroo.model.OrdineBean ordineBean59 = new ita.kangaroo.model.OrdineBean((int) (byte) 100, utenteBean44, (float) (-1L), "hi!", "", "", "hi!", "Data non disponibile", "hi!", date57, "");
        java.lang.String str60 = utenteBean44.getCognome();
        ordineBean27.setClient(utenteBean44);
        utenteBean44.setUsername("Data non disponibile");
        utenteBean44.setPassword("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        int int2 = orderProductBean0.getId_ordine();
        int int3 = orderProductBean0.getQuantita();
        int int4 = orderProductBean0.getId_prodotto();
        orderProductBean0.setPrezzo(97.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) '4', "hi!", "Data non disponibile", "hi!", (float) 'a', 1, 0.0f, tipo7);
        prodottoBean8.setId(35);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        ita.kangaroo.model.MetodoPagamentoBean metodoPagamentoBean0 = new ita.kangaroo.model.MetodoPagamentoBean();
        metodoPagamentoBean0.setId((int) (byte) 0);
        java.lang.String str3 = metodoPagamentoBean0.getCvv();
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
        ita.kangaroo.model.tipo tipo28 = null;
        ita.kangaroo.model.utenteBean utenteBean34 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo28, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean35 = new ita.kangaroo.model.OrdineBean(utenteBean34);
        java.lang.String str36 = ordineBean35.toString();
        boolean boolean37 = metodoPagamentoBean4.equals((java.lang.Object) str36);
        metodoPagamentoBean4.setCvv("");
        metodoPagamentoBean4.setId((int) 'a');
        boolean boolean42 = metodoPagamentoBean0.equals((java.lang.Object) 'a');
        metodoPagamentoBean0.setCvv("");
        metodoPagamentoBean0.setCvv("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.0f + "'", float17 == 0.0f);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Data non disponibile" + "'", str36, "Data non disponibile");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "", "", "hi!", "hi!", "hi!");
        java.lang.String str12 = utenteBean11.getPassword();
        utenteBean11.setProvincia("Data non disponibile");
        ita.kangaroo.model.tipo tipo15 = utenteBean11.getTipo();
        java.lang.String str16 = utenteBean11.getCitta();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(tipo15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getImmagine();
        prodottoBean8.setPrezzo((float) (-1L));
        int int12 = prodottoBean8.getId();
        prodottoBean8.setPrezzo((float) (-1));
        ita.kangaroo.model.tipo tipo15 = null;
        prodottoBean8.setTipo(tipo15);
        int int17 = prodottoBean8.getQuantita();
        ita.kangaroo.model.CartProduct cartProduct19 = new ita.kangaroo.model.CartProduct(prodottoBean8, 32);
        java.lang.String str20 = prodottoBean8.getImmagine();
        prodottoBean8.setIva((float) 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        java.lang.String str12 = utenteBean11.getProvincia();
        java.lang.String str13 = utenteBean11.getCognome();
        java.lang.String str14 = utenteBean11.getCognome();
        utenteBean11.setCitta("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='hi!', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean(0, "", "hi!", "hi!", (float) (short) 10, (int) (short) 1, (float) '4', tipo7);
        prodottoBean8.setNome("3d1583397bcebff274b1e7cb58087c39153af974");
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        float float13 = ordineBean12.getPrezzo_totale();
        java.lang.String str14 = ordineBean12.getMetodo_di_pagamento();
        ordineBean12.setNumero_di_tracking("hi!");
        ordineBean12.setCircuito("Data non disponibile");
        float float19 = ordineBean12.getPrezzo_totale();
        ordineBean12.setId((int) (short) -1);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.0f + "'", float19 == 0.0f);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        ita.kangaroo.model.AddressBean addressBean0 = new ita.kangaroo.model.AddressBean();
        java.lang.String str1 = addressBean0.getVia();
        java.lang.String str2 = addressBean0.getUsername();
        java.lang.String str3 = addressBean0.getCAP();
        java.lang.String str4 = addressBean0.getUsername();
        addressBean0.setId(10);
        int int7 = addressBean0.getId();
        java.lang.String str8 = addressBean0.getVia();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        ita.kangaroo.model.tipo tipo19 = null;
        ita.kangaroo.model.utenteBean utenteBean25 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo19, "hi!", "", "", "hi!", "");
        utenteBean25.setEmail("hi!");
        ordineBean12.setClient(utenteBean25);
        java.lang.String str29 = utenteBean25.getEmail();
        java.lang.String str30 = utenteBean25.getCognome();
        utenteBean25.setEmail("3d1583397bcebff274b1e7cb58087c39153af974");
        java.lang.String str33 = utenteBean25.getCognome();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        ita.kangaroo.model.tipo tipo6 = null;
        ita.kangaroo.model.utenteBean utenteBean12 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo6, "", "", "hi!", "hi!", "hi!");
        java.lang.String str13 = utenteBean12.getUsername();
        utenteBean12.setPassword("");
        java.sql.Date date23 = null;
        ita.kangaroo.model.OrdineBean ordineBean25 = new ita.kangaroo.model.OrdineBean((int) (byte) 100, utenteBean12, 100.0f, "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "hi!", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "", "Data non disponibile", date23, "hi!");
        int int26 = ordineBean25.getId();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        java.lang.String str12 = utenteBean11.getUsername();
        java.lang.String str13 = utenteBean11.getCap();
        utenteBean11.setUsername("");
        ita.kangaroo.model.OrdineBean ordineBean16 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str17 = utenteBean11.getPassword();
        java.lang.String str18 = utenteBean11.getCap();
        utenteBean11.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getImmagine();
        prodottoBean8.setPrezzo((float) (-1L));
        int int12 = prodottoBean8.getId();
        prodottoBean8.setPrezzo((float) (-1));
        ita.kangaroo.model.tipo tipo15 = null;
        prodottoBean8.setTipo(tipo15);
        float float17 = prodottoBean8.getIva();
        prodottoBean8.setIva((float) 10);
        ita.kangaroo.model.tipo tipo20 = prodottoBean8.getTipo();
        ita.kangaroo.model.tipo tipo21 = null;
        prodottoBean8.setTipo(tipo21);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 1.0f + "'", float17 == 1.0f);
        org.junit.Assert.assertNull(tipo20);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "", "", "hi!", "hi!", "hi!");
        java.lang.String str12 = utenteBean11.getPassword();
        utenteBean11.setProvincia("Data non disponibile");
        utenteBean11.setCognome("hi!");
        java.lang.String str17 = utenteBean11.getPassword();
        java.lang.String str18 = utenteBean11.getProvincia();
        utenteBean11.setCognome("");
        utenteBean11.setCap("");
        ita.kangaroo.model.tipo tipo23 = null;
        utenteBean11.setTipo(tipo23);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Data non disponibile" + "'", str18, "Data non disponibile");
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        ita.kangaroo.model.MetodoPagamentoBean metodoPagamentoBean0 = new ita.kangaroo.model.MetodoPagamentoBean();
        metodoPagamentoBean0.setId((int) (byte) 0);
        java.lang.String str3 = metodoPagamentoBean0.getCvv();
        java.lang.String str4 = metodoPagamentoBean0.getData_scadenza();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        ita.kangaroo.model.Cart cart0 = new ita.kangaroo.model.Cart();
        ita.kangaroo.model.tipo tipo8 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean9 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo8);
        int int10 = prodottoBean9.getId();
        java.lang.String str11 = prodottoBean9.getImmagine();
        cart0.removeProduct(prodottoBean9);
        ita.kangaroo.model.tipo tipo13 = prodottoBean9.getTipo();
        java.lang.String str14 = prodottoBean9.getImmagine();
        ita.kangaroo.model.CartProduct cartProduct16 = new ita.kangaroo.model.CartProduct(prodottoBean9, (int) '#');
        ita.kangaroo.model.ProdottoBean prodottoBean17 = cartProduct16.getProduct();
        cartProduct16.setQuantity(1);
        int int20 = cartProduct16.getQuantity();
        cartProduct16.setQuantity(97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(tipo13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(prodottoBean17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        ordineBean12.setNumero_carta("");
        java.sql.Date date16 = ordineBean12.getData();
        int int17 = ordineBean12.getId();
        ita.kangaroo.model.tipo tipo23 = null;
        ita.kangaroo.model.utenteBean utenteBean29 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo23, "hi!", "", "", "hi!", "");
        java.lang.String str30 = utenteBean29.getProvincia();
        java.lang.String str31 = utenteBean29.getCognome();
        ordineBean12.setClient(utenteBean29);
        java.lang.String str33 = utenteBean29.getCap();
        utenteBean29.setUsername("Data non disponibile");
        utenteBean29.setProvincia("Data non disponibile");
        java.lang.String str38 = utenteBean29.getVia();
        java.lang.String str39 = utenteBean29.getEmail();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        ita.kangaroo.model.MetodoPagamentoBean metodoPagamentoBean0 = new ita.kangaroo.model.MetodoPagamentoBean();
        metodoPagamentoBean0.setId((int) 'a');
        ita.kangaroo.model.AddressBean addressBean3 = new ita.kangaroo.model.AddressBean();
        java.lang.String str4 = addressBean3.getVia();
        addressBean3.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        addressBean3.setCitta("hi!");
        boolean boolean9 = metodoPagamentoBean0.equals((java.lang.Object) addressBean3);
        java.lang.String str10 = metodoPagamentoBean0.getCvv();
        java.lang.String str11 = metodoPagamentoBean0.getCvv();
        metodoPagamentoBean0.setUsername("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        java.lang.String str14 = metodoPagamentoBean0.getCvv();
        ita.kangaroo.model.AddressBean addressBean15 = new ita.kangaroo.model.AddressBean();
        java.lang.String str16 = addressBean15.getVia();
        java.lang.String str17 = addressBean15.getUsername();
        java.lang.String str18 = addressBean15.getCAP();
        java.lang.String str19 = addressBean15.getUsername();
        addressBean15.setId(10);
        java.lang.String str22 = addressBean15.getUsername();
        java.lang.String str23 = addressBean15.getVia();
        boolean boolean24 = metodoPagamentoBean0.equals((java.lang.Object) addressBean15);
        addressBean15.setUsername("ProdottoBean{id=32, descrizione='Data non disponibile', nome='Data non disponibile', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=32.0, quantita=32, iva=10.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        float float2 = orderProductBean0.getIVA();
        orderProductBean0.setPrezzo(10.0f);
        orderProductBean0.setId_ordine((int) 'a');
        int int7 = orderProductBean0.getQuantita();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getImmagine();
        prodottoBean8.setPrezzo((float) (-1L));
        int int12 = prodottoBean8.getId();
        float float13 = prodottoBean8.getIva();
        prodottoBean8.setQuantita((int) ' ');
        ita.kangaroo.model.tipo tipo16 = prodottoBean8.getTipo();
        prodottoBean8.setIva((float) (short) 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertNull(tipo16);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "", "", "hi!", "hi!", "hi!");
        java.lang.Class<?> wildcardClass12 = utenteBean11.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        ordineBean12.setNumero_carta("");
        java.sql.Date date16 = ordineBean12.getData();
        ordineBean12.setMetodo_di_pagamento("");
        ordineBean12.setNumero_di_tracking("");
        ordineBean12.setNumero_di_tracking("hi!");
        java.lang.String str23 = ordineBean12.getIndirizzo_di_spedizione();
        java.lang.String str24 = ordineBean12.getMetodo_di_pagamento();
        java.lang.String str25 = ordineBean12.getIndirizzo_di_spedizione();
        java.util.ArrayList<ita.kangaroo.model.OrderProductBean> orderProductBeanList26 = ordineBean12.getProducts();
        ita.kangaroo.model.utenteBean utenteBean27 = ordineBean12.getClient();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(orderProductBeanList26);
        org.junit.Assert.assertNotNull(utenteBean27);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getDestinatario();
        java.lang.String str14 = ordineBean12.toString();
        ordineBean12.setPrezzo_totale((float) (short) 0);
        int int17 = ordineBean12.getId();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Data non disponibile" + "'", str14, "Data non disponibile");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        ita.kangaroo.model.utenteBean utenteBean1 = new ita.kangaroo.model.utenteBean();
        java.lang.String str2 = utenteBean1.getPassword();
        java.sql.Date date10 = null;
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(0, utenteBean1, (float) (short) -1, "Data non disponibile", "", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "Data non disponibile", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", date10, "");
        ordineBean12.setMetodo_di_spedizione("");
        ita.kangaroo.model.tipo tipo20 = null;
        ita.kangaroo.model.utenteBean utenteBean26 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo20, "hi!", "", "", "hi!", "");
        java.lang.String str27 = utenteBean26.getVia();
        ordineBean12.setClient(utenteBean26);
        ordineBean12.setMetodo_di_spedizione("3d1583397bcebff274b1e7cb58087c39153af974");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.utenteBean utenteBean13 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo7, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean14 = new ita.kangaroo.model.OrdineBean(utenteBean13);
        utenteBean13.setPassword("hi!");
        utenteBean13.setNome("hi!");
        java.sql.Date date26 = null;
        ita.kangaroo.model.OrdineBean ordineBean28 = new ita.kangaroo.model.OrdineBean((int) (byte) 100, utenteBean13, (float) (-1L), "hi!", "", "", "hi!", "Data non disponibile", "hi!", date26, "");
        ordineBean28.setIndirizzo_di_spedizione("Data non disponibile");
        ita.kangaroo.model.tipo tipo36 = null;
        ita.kangaroo.model.utenteBean utenteBean42 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo36, "", "", "hi!", "hi!", "hi!");
        java.lang.String str43 = utenteBean42.getUsername();
        java.lang.String str44 = utenteBean42.getEmail();
        ordineBean28.setClient(utenteBean42);
        java.sql.Date date53 = null;
        ita.kangaroo.model.OrdineBean ordineBean55 = new ita.kangaroo.model.OrdineBean((int) (short) -1, utenteBean42, (float) (short) 1, "ProdottoBean{id=52, descrizione='hi!', nome='', immagine='da39a3ee5e6b4b0d3255bfef95601890afd80709', prezzo=32.0, quantita=-1, iva=52.0, tipo=null}", "Data non disponibile", "", "", "ProdottoBean{id=0, descrizione='', nome='', immagine='', prezzo=0.0, quantita=0, iva=0.0, tipo=null}", "3a987acf8cbc1028b7dbc86bd086831151899a2b", date53, "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getDescrizione();
        prodottoBean8.setImmagine("");
        int int12 = prodottoBean8.getQuantita();
        ita.kangaroo.model.CartProduct cartProduct14 = new ita.kangaroo.model.CartProduct(prodottoBean8, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        ita.kangaroo.model.AddressBean addressBean0 = new ita.kangaroo.model.AddressBean();
        java.lang.String str1 = addressBean0.getVia();
        java.lang.String str2 = addressBean0.getUsername();
        addressBean0.setUsername("hi!");
        addressBean0.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        boolean boolean8 = addressBean0.equals((java.lang.Object) 10L);
        int int9 = addressBean0.getId();
        addressBean0.setCitta("hi!");
        java.lang.String str12 = addressBean0.getVia();
        java.lang.String str13 = addressBean0.getVia();
        java.lang.String str14 = addressBean0.getCAP();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}" + "'", str12, "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}" + "'", str13, "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getImmagine();
        int int10 = prodottoBean8.getQuantita();
        java.lang.String str11 = prodottoBean8.getImmagine();
        ita.kangaroo.model.CartProduct cartProduct12 = new ita.kangaroo.model.CartProduct(prodottoBean8);
        prodottoBean8.setId((int) (short) 0);
        prodottoBean8.setId((int) (byte) 1);
        prodottoBean8.setNome("da39a3ee5e6b4b0d3255bfef95601890afd80709");
        float float19 = prodottoBean8.getPrezzo();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 1.0f + "'", float19 == 1.0f);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        ordineBean12.setNumero_carta("");
        java.sql.Date date16 = ordineBean12.getData();
        ordineBean12.setMetodo_di_pagamento("");
        ordineBean12.setNumero_di_tracking("");
        ordineBean12.setCircuito("hi!");
        int int23 = ordineBean12.getId();
        ordineBean12.setId((int) ' ');
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        ordineBean12.setIndirizzo_di_spedizione("Data non disponibile");
        ordineBean12.setPrezzo_totale((float) (byte) 10);
        java.sql.Date date17 = ordineBean12.getData();
        ordineBean12.setIndirizzo_di_spedizione("hi!");
        java.lang.String str20 = ordineBean12.getCircuito();
        java.lang.String str21 = ordineBean12.getIndirizzo_di_spedizione();
        java.sql.Date date22 = null;
        ordineBean12.setData(date22);
        org.junit.Assert.assertNull(date17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        ita.kangaroo.model.AddressBean addressBean5 = new ita.kangaroo.model.AddressBean((int) '4', "3a987acf8cbc1028b7dbc86bd086831151899a2b", "ProdottoBean{id=10, descrizione='hi!', nome='', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}", "3a987acf8cbc1028b7dbc86bd086831151899a2b", "da39a3ee5e6b4b0d3255bfef95601890afd80709");
        java.lang.String str6 = addressBean5.getCAP();
        java.lang.String str7 = addressBean5.getUsername();
        java.lang.String str8 = addressBean5.getCAP();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "3a987acf8cbc1028b7dbc86bd086831151899a2b" + "'", str6, "3a987acf8cbc1028b7dbc86bd086831151899a2b");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "da39a3ee5e6b4b0d3255bfef95601890afd80709" + "'", str7, "da39a3ee5e6b4b0d3255bfef95601890afd80709");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "3a987acf8cbc1028b7dbc86bd086831151899a2b" + "'", str8, "3a987acf8cbc1028b7dbc86bd086831151899a2b");
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        ita.kangaroo.model.tipo tipo19 = null;
        ita.kangaroo.model.utenteBean utenteBean25 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo19, "hi!", "", "", "hi!", "");
        utenteBean25.setEmail("hi!");
        ordineBean12.setClient(utenteBean25);
        ordineBean12.setNumero_carta("");
        ordineBean12.setMetodo_di_pagamento("hi!");
        ordineBean12.setId((int) (short) 0);
        ordineBean12.setNumero_carta("Data non disponibile");
        ordineBean12.setNumero_di_tracking("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        java.lang.String str39 = ordineBean12.toString();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Data non disponibile" + "'", str39, "Data non disponibile");
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getDestinatario();
        java.lang.String str14 = ordineBean12.toString();
        java.lang.String str15 = ordineBean12.getMetodo_di_spedizione();
        ita.kangaroo.model.utenteBean utenteBean16 = ordineBean12.getClient();
        java.lang.String str17 = utenteBean16.getPassword();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Data non disponibile" + "'", str14, "Data non disponibile");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(utenteBean16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        orderProductBean0.setQuantita((int) (byte) 100);
        ita.kangaroo.model.OrderProductBean orderProductBean4 = new ita.kangaroo.model.OrderProductBean();
        float float5 = orderProductBean4.getIVA();
        float float6 = orderProductBean4.getIVA();
        orderProductBean4.setPrezzo(10.0f);
        int int9 = orderProductBean4.getQuantita();
        ita.kangaroo.model.OrderProductBean orderProductBean10 = new ita.kangaroo.model.OrderProductBean();
        float float11 = orderProductBean10.getIVA();
        float float12 = orderProductBean10.getIVA();
        float float13 = orderProductBean10.getPrezzo();
        ita.kangaroo.model.OrderProductBean orderProductBean14 = new ita.kangaroo.model.OrderProductBean();
        float float15 = orderProductBean14.getIVA();
        float float16 = orderProductBean14.getIVA();
        float float17 = orderProductBean14.getPrezzo();
        ita.kangaroo.model.OrderProductBean orderProductBean18 = new ita.kangaroo.model.OrderProductBean();
        float float19 = orderProductBean18.getIVA();
        float float20 = orderProductBean18.getIVA();
        float float21 = orderProductBean18.getPrezzo();
        ita.kangaroo.model.OrderProductBean orderProductBean22 = new ita.kangaroo.model.OrderProductBean();
        float float23 = orderProductBean22.getIVA();
        int int24 = orderProductBean22.getId_ordine();
        orderProductBean22.setQuantita((int) 'a');
        float float27 = orderProductBean22.getIVA();
        ita.kangaroo.model.OrderProductBean orderProductBean28 = new ita.kangaroo.model.OrderProductBean();
        float float29 = orderProductBean28.getIVA();
        float float30 = orderProductBean28.getIVA();
        ita.kangaroo.model.OrderProductBean orderProductBean31 = new ita.kangaroo.model.OrderProductBean();
        float float32 = orderProductBean31.getIVA();
        float float33 = orderProductBean31.getIVA();
        float float34 = orderProductBean31.getPrezzo();
        int int35 = orderProductBean31.getQuantita();
        ita.kangaroo.model.OrderProductBean orderProductBean36 = new ita.kangaroo.model.OrderProductBean();
        float float37 = orderProductBean36.getIVA();
        float float38 = orderProductBean36.getIVA();
        orderProductBean36.setPrezzo(10.0f);
        int int41 = orderProductBean36.getQuantita();
        ita.kangaroo.model.OrderProductBean orderProductBean42 = new ita.kangaroo.model.OrderProductBean();
        ita.kangaroo.model.OrderProductBean orderProductBean43 = new ita.kangaroo.model.OrderProductBean();
        ita.kangaroo.model.OrderProductBean orderProductBean44 = new ita.kangaroo.model.OrderProductBean();
        float float45 = orderProductBean44.getIVA();
        int int46 = orderProductBean44.getId_ordine();
        orderProductBean44.setQuantita((int) 'a');
        int int49 = orderProductBean44.getId_ordine();
        ita.kangaroo.model.OrderProductBean[] orderProductBeanArray50 = new ita.kangaroo.model.OrderProductBean[] { orderProductBean0, orderProductBean4, orderProductBean10, orderProductBean14, orderProductBean18, orderProductBean22, orderProductBean28, orderProductBean31, orderProductBean36, orderProductBean42, orderProductBean43, orderProductBean44 };
        java.util.ArrayList<ita.kangaroo.model.OrderProductBean> orderProductBeanList51 = new java.util.ArrayList<ita.kangaroo.model.OrderProductBean>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<ita.kangaroo.model.OrderProductBean>) orderProductBeanList51, orderProductBeanArray50);
        ita.kangaroo.model.OrdineBean ordineBean53 = new ita.kangaroo.model.OrdineBean(orderProductBeanList51);
        ita.kangaroo.model.OrdineBean ordineBean54 = new ita.kangaroo.model.OrdineBean(orderProductBeanList51);
        ita.kangaroo.model.OrdineBean ordineBean55 = new ita.kangaroo.model.OrdineBean(orderProductBeanList51);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.0f + "'", float15 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.0f + "'", float17 == 0.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.0f + "'", float19 == 0.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.0f + "'", float21 == 0.0f);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.0f + "'", float23 == 0.0f);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 0.0f + "'", float27 == 0.0f);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 0.0f + "'", float29 == 0.0f);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 0.0f + "'", float30 == 0.0f);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 0.0f + "'", float32 == 0.0f);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 0.0f + "'", float33 == 0.0f);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 0.0f + "'", float34 == 0.0f);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + 0.0f + "'", float37 == 0.0f);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + 0.0f + "'", float38 == 0.0f);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + float45 + "' != '" + 0.0f + "'", float45 == 0.0f);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(orderProductBeanArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        ita.kangaroo.model.MetodoPagamentoBean metodoPagamentoBean0 = new ita.kangaroo.model.MetodoPagamentoBean();
        metodoPagamentoBean0.setId((int) 'a');
        ita.kangaroo.model.AddressBean addressBean3 = new ita.kangaroo.model.AddressBean();
        java.lang.String str4 = addressBean3.getVia();
        addressBean3.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        addressBean3.setCitta("hi!");
        boolean boolean9 = metodoPagamentoBean0.equals((java.lang.Object) addressBean3);
        java.lang.Object obj10 = null;
        boolean boolean11 = metodoPagamentoBean0.equals(obj10);
        java.lang.String str12 = metodoPagamentoBean0.getCvv();
        ita.kangaroo.model.tipo tipo18 = null;
        ita.kangaroo.model.utenteBean utenteBean24 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo18, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean25 = new ita.kangaroo.model.OrdineBean(utenteBean24);
        ita.kangaroo.model.tipo tipo31 = null;
        ita.kangaroo.model.utenteBean utenteBean37 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo31, "hi!", "", "", "hi!", "");
        utenteBean37.setEmail("hi!");
        utenteBean37.setPassword("hi!");
        java.lang.String str42 = utenteBean37.getCognome();
        ordineBean25.setClient(utenteBean37);
        java.util.ArrayList<ita.kangaroo.model.OrderProductBean> orderProductBeanList44 = ordineBean25.getProducts();
        java.lang.String str45 = ordineBean25.getDestinatario();
        boolean boolean46 = metodoPagamentoBean0.equals((java.lang.Object) str45);
        metodoPagamentoBean0.setNumero_carta("Data non disponibile");
        metodoPagamentoBean0.setId((int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(orderProductBeanList44);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        ita.kangaroo.model.MetodoPagamentoBean metodoPagamentoBean0 = new ita.kangaroo.model.MetodoPagamentoBean();
        metodoPagamentoBean0.setId((int) 'a');
        ita.kangaroo.model.AddressBean addressBean3 = new ita.kangaroo.model.AddressBean();
        java.lang.String str4 = addressBean3.getVia();
        addressBean3.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        addressBean3.setCitta("hi!");
        boolean boolean9 = metodoPagamentoBean0.equals((java.lang.Object) addressBean3);
        java.lang.String str10 = metodoPagamentoBean0.getNumero_carta();
        java.lang.String str11 = metodoPagamentoBean0.getUsername();
        java.lang.String str12 = metodoPagamentoBean0.getCvv();
        metodoPagamentoBean0.setCircuito("");
        metodoPagamentoBean0.setCvv("da39a3ee5e6b4b0d3255bfef95601890afd80709");
        java.lang.String str17 = metodoPagamentoBean0.getCircuito();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        ita.kangaroo.model.MetodoPagamentoBean metodoPagamentoBean0 = new ita.kangaroo.model.MetodoPagamentoBean();
        metodoPagamentoBean0.setId((int) 'a');
        ita.kangaroo.model.AddressBean addressBean3 = new ita.kangaroo.model.AddressBean();
        java.lang.String str4 = addressBean3.getVia();
        addressBean3.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        addressBean3.setCitta("hi!");
        boolean boolean9 = metodoPagamentoBean0.equals((java.lang.Object) addressBean3);
        java.lang.String str10 = metodoPagamentoBean0.getNumero_carta();
        metodoPagamentoBean0.setNumero_carta("hi!");
        metodoPagamentoBean0.setNumero_carta("hi!");
        java.lang.String str15 = metodoPagamentoBean0.getUsername();
        metodoPagamentoBean0.setCvv("");
        metodoPagamentoBean0.setUsername("ProdottoBean{id=10, descrizione='hi!', nome='', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        ita.kangaroo.model.ProdottoBean prodottoBean0 = new ita.kangaroo.model.ProdottoBean();
        ita.kangaroo.model.CartProduct cartProduct1 = new ita.kangaroo.model.CartProduct(prodottoBean0);
        int int2 = cartProduct1.getQuantity();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        ita.kangaroo.model.MetodoPagamentoBean metodoPagamentoBean0 = new ita.kangaroo.model.MetodoPagamentoBean();
        metodoPagamentoBean0.setId((int) (byte) 0);
        java.lang.String str3 = metodoPagamentoBean0.getCvv();
        ita.kangaroo.model.AddressBean addressBean4 = new ita.kangaroo.model.AddressBean();
        java.lang.String str5 = addressBean4.getVia();
        java.lang.String str6 = addressBean4.getUsername();
        addressBean4.setUsername("hi!");
        addressBean4.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        boolean boolean12 = addressBean4.equals((java.lang.Object) 10L);
        addressBean4.setUsername("hi!");
        addressBean4.setCitta("");
        boolean boolean17 = metodoPagamentoBean0.equals((java.lang.Object) addressBean4);
        java.lang.String str18 = metodoPagamentoBean0.getNumero_carta();
        int int19 = metodoPagamentoBean0.getId();
        java.lang.String str20 = metodoPagamentoBean0.getNumero_carta();
        metodoPagamentoBean0.setData_scadenza("");
        metodoPagamentoBean0.setNumero_carta("Data non disponibile");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        utenteBean11.setEmail("hi!");
        utenteBean11.setPassword("hi!");
        utenteBean11.setProvincia("hi!");
        utenteBean11.setUsername("hi!");
        java.lang.String str20 = utenteBean11.getTelefono();
        java.lang.String str21 = utenteBean11.getNome();
        java.lang.String str22 = utenteBean11.getTelefono();
        ita.kangaroo.model.tipo tipo23 = utenteBean11.getTipo();
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNull(tipo23);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        float float2 = orderProductBean0.getIVA();
        orderProductBean0.setPrezzo(10.0f);
        orderProductBean0.setId_ordine((int) (short) 0);
        orderProductBean0.setIVA((-1.0f));
        int int9 = orderProductBean0.getId_ordine();
        orderProductBean0.setIVA((float) ' ');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        float float2 = orderProductBean0.getIVA();
        int int3 = orderProductBean0.getId_prodotto();
        float float4 = orderProductBean0.getPrezzo();
        int int5 = orderProductBean0.getQuantita();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = utenteBean11.getNome();
        java.lang.String str14 = utenteBean11.getEmail();
        utenteBean11.setCap("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        ordineBean12.setNumero_carta("");
        java.lang.String str16 = ordineBean12.getIndirizzo_di_spedizione();
        java.lang.String str17 = ordineBean12.getIndirizzo_di_spedizione();
        java.lang.String str18 = ordineBean12.getNumero_carta();
        ita.kangaroo.model.tipo tipo25 = null;
        ita.kangaroo.model.utenteBean utenteBean31 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo25, "hi!", "", "", "hi!", "");
        utenteBean31.setEmail("hi!");
        java.lang.String str34 = utenteBean31.getCognome();
        java.sql.Date date42 = null;
        ita.kangaroo.model.OrdineBean ordineBean44 = new ita.kangaroo.model.OrdineBean((int) (byte) 10, utenteBean31, (float) (-1L), "Data non disponibile", "Data non disponibile", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "hi!", "hi!", "", date42, "Data non disponibile");
        ita.kangaroo.model.tipo tipo45 = utenteBean31.getTipo();
        utenteBean31.setCitta("");
        ordineBean12.setClient(utenteBean31);
        utenteBean31.setTelefono("ProdottoBean{id=10, descrizione='hi!', nome='', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}");
        utenteBean31.setCitta("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='hi!', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNull(tipo45);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        prodottoBean8.setNome("da39a3ee5e6b4b0d3255bfef95601890afd80709");
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        ita.kangaroo.model.AddressBean addressBean0 = new ita.kangaroo.model.AddressBean();
        java.lang.String str1 = addressBean0.getVia();
        java.lang.String str2 = addressBean0.getUsername();
        addressBean0.setUsername("hi!");
        addressBean0.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        addressBean0.setCitta("hi!");
        addressBean0.setUsername("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        java.lang.String str11 = addressBean0.getCAP();
        ita.kangaroo.model.MetodoPagamentoBean metodoPagamentoBean12 = new ita.kangaroo.model.MetodoPagamentoBean();
        metodoPagamentoBean12.setId((int) 'a');
        ita.kangaroo.model.AddressBean addressBean15 = new ita.kangaroo.model.AddressBean();
        java.lang.String str16 = addressBean15.getVia();
        addressBean15.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        addressBean15.setCitta("hi!");
        boolean boolean21 = metodoPagamentoBean12.equals((java.lang.Object) addressBean15);
        java.lang.String str22 = metodoPagamentoBean12.getNumero_carta();
        java.lang.String str23 = metodoPagamentoBean12.getNumero_carta();
        java.lang.String str24 = metodoPagamentoBean12.getCvv();
        boolean boolean25 = addressBean0.equals((java.lang.Object) metodoPagamentoBean12);
        ita.kangaroo.model.tipo tipo32 = null;
        ita.kangaroo.model.utenteBean utenteBean38 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo32, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean39 = new ita.kangaroo.model.OrdineBean(utenteBean38);
        utenteBean38.setPassword("hi!");
        utenteBean38.setNome("hi!");
        java.sql.Date date51 = null;
        ita.kangaroo.model.OrdineBean ordineBean53 = new ita.kangaroo.model.OrdineBean((int) (byte) 100, utenteBean38, (float) (-1L), "hi!", "", "", "hi!", "Data non disponibile", "hi!", date51, "");
        java.lang.String str54 = ordineBean53.getNumero_di_tracking();
        java.lang.String str55 = ordineBean53.getCircuito();
        boolean boolean56 = metodoPagamentoBean12.equals((java.lang.Object) ordineBean53);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        ordineBean12.setNumero_carta("");
        java.sql.Date date16 = ordineBean12.getData();
        ordineBean12.setMetodo_di_pagamento("");
        ordineBean12.setNumero_di_tracking("");
        ordineBean12.setCircuito("hi!");
        java.lang.String str23 = ordineBean12.getDestinatario();
        java.lang.String str24 = ordineBean12.getMetodo_di_pagamento();
        java.lang.String str25 = ordineBean12.getCircuito();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        utenteBean11.setEmail("hi!");
        ita.kangaroo.model.OrdineBean ordineBean14 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.Class<?> wildcardClass15 = ordineBean14.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        ita.kangaroo.model.MetodoPagamentoBean metodoPagamentoBean0 = new ita.kangaroo.model.MetodoPagamentoBean();
        metodoPagamentoBean0.setId((int) 'a');
        ita.kangaroo.model.AddressBean addressBean3 = new ita.kangaroo.model.AddressBean();
        java.lang.String str4 = addressBean3.getVia();
        addressBean3.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        addressBean3.setCitta("hi!");
        boolean boolean9 = metodoPagamentoBean0.equals((java.lang.Object) addressBean3);
        java.lang.String str10 = metodoPagamentoBean0.getNumero_carta();
        int int11 = metodoPagamentoBean0.getId();
        int int12 = metodoPagamentoBean0.getId();
        metodoPagamentoBean0.setId((int) (short) 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        ita.kangaroo.model.AddressBean addressBean0 = new ita.kangaroo.model.AddressBean();
        java.lang.String str1 = addressBean0.getVia();
        java.lang.String str2 = addressBean0.getUsername();
        addressBean0.setUsername("hi!");
        addressBean0.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        addressBean0.setCitta("hi!");
        int int9 = addressBean0.getId();
        java.lang.String str10 = addressBean0.getUsername();
        ita.kangaroo.model.tipo tipo16 = null;
        ita.kangaroo.model.utenteBean utenteBean22 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo16, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean23 = new ita.kangaroo.model.OrdineBean(utenteBean22);
        java.lang.String str24 = ordineBean23.getMetodo_di_spedizione();
        java.util.ArrayList<ita.kangaroo.model.OrderProductBean> orderProductBeanList25 = ordineBean23.getProducts();
        ordineBean23.setNumero_carta("hi!");
        ita.kangaroo.model.tipo tipo33 = null;
        ita.kangaroo.model.utenteBean utenteBean39 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo33, "hi!", "", "", "hi!", "");
        utenteBean39.setEmail("hi!");
        java.lang.String str42 = utenteBean39.getCognome();
        utenteBean39.setCitta("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        ordineBean23.setClient(utenteBean39);
        utenteBean39.setNome("ProdottoBean{id=10, descrizione='hi!', nome='', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}");
        boolean boolean48 = addressBean0.equals((java.lang.Object) "ProdottoBean{id=10, descrizione='hi!', nome='', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(orderProductBeanList25);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        ordineBean12.setNumero_carta("");
        java.sql.Date date16 = ordineBean12.getData();
        ordineBean12.setMetodo_di_pagamento("");
        ordineBean12.setNumero_di_tracking("");
        ordineBean12.setCircuito("hi!");
        int int23 = ordineBean12.getId();
        ita.kangaroo.model.utenteBean utenteBean24 = ordineBean12.getClient();
        java.lang.String str25 = utenteBean24.getVia();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(utenteBean24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        ita.kangaroo.model.tipo tipo6 = null;
        ita.kangaroo.model.utenteBean utenteBean12 = new ita.kangaroo.model.utenteBean("", "", "", "", "Data non disponibile", tipo6, "hi!", "", "Data non disponibile", "Data non disponibile", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        java.sql.Date date20 = null;
        ita.kangaroo.model.OrdineBean ordineBean22 = new ita.kangaroo.model.OrdineBean((int) (byte) 10, utenteBean12, (float) 10, "", "", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "", "hi!", "hi!", date20, "Data non disponibile");
        ordineBean22.setIndirizzo_di_spedizione("Data non disponibile");
        java.lang.String str25 = ordineBean22.getIndirizzo_di_spedizione();
        java.lang.String str26 = ordineBean22.toString();
        java.lang.String str27 = ordineBean22.toString();
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Data non disponibile" + "'", str25, "Data non disponibile");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Data non disponibile" + "'", str26, "Data non disponibile");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Data non disponibile" + "'", str27, "Data non disponibile");
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        ita.kangaroo.model.utenteBean utenteBean1 = new ita.kangaroo.model.utenteBean();
        java.lang.String str2 = utenteBean1.getPassword();
        java.sql.Date date10 = null;
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(0, utenteBean1, (float) (short) -1, "Data non disponibile", "", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "Data non disponibile", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", date10, "");
        ordineBean12.setMetodo_di_pagamento("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        ordineBean12.setNumero_carta("");
        java.lang.String str16 = ordineBean12.getIndirizzo_di_spedizione();
        java.sql.Date date17 = null;
        ordineBean12.setData(date17);
        java.sql.Date date19 = ordineBean12.getData();
        java.util.ArrayList<ita.kangaroo.model.OrderProductBean> orderProductBeanList20 = ordineBean12.getProducts();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(date19);
        org.junit.Assert.assertNotNull(orderProductBeanList20);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("ProdottoBean{id=52, descrizione='hi!', nome='', immagine='da39a3ee5e6b4b0d3255bfef95601890afd80709', prezzo=32.0, quantita=-1, iva=52.0, tipo=null}", "", "ProdottoBean{id=32, descrizione='Data non disponibile', nome='Data non disponibile', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=32.0, quantita=32, iva=10.0, tipo=null}", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "da39a3ee5e6b4b0d3255bfef95601890afd80709", tipo5, "da39a3ee5e6b4b0d3255bfef95601890afd80709", "hi!", "3a987acf8cbc1028b7dbc86bd086831151899a2b", "ProdottoBean{id=0, descrizione='', nome='', immagine='', prezzo=0.0, quantita=0, iva=0.0, tipo=null}", "");
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) '4', "da39a3ee5e6b4b0d3255bfef95601890afd80709", "", "da39a3ee5e6b4b0d3255bfef95601890afd80709", 32.0f, (-1), (float) '4', tipo7);
        prodottoBean8.setDescrizione("hi!");
        float float11 = prodottoBean8.getPrezzo();
        java.lang.String str12 = prodottoBean8.toString();
        ita.kangaroo.model.CartProduct cartProduct13 = new ita.kangaroo.model.CartProduct(prodottoBean8);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 32.0f + "'", float11 == 32.0f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ProdottoBean{id=52, descrizione='hi!', nome='', immagine='da39a3ee5e6b4b0d3255bfef95601890afd80709', prezzo=32.0, quantita=-1, iva=52.0, tipo=null}" + "'", str12, "ProdottoBean{id=52, descrizione='hi!', nome='', immagine='da39a3ee5e6b4b0d3255bfef95601890afd80709', prezzo=32.0, quantita=-1, iva=52.0, tipo=null}");
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        ita.kangaroo.model.Cart cart0 = new ita.kangaroo.model.Cart();
        ita.kangaroo.model.tipo tipo8 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean9 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo8);
        java.lang.String str10 = prodottoBean9.getDescrizione();
        java.lang.String str11 = prodottoBean9.getNome();
        int int12 = prodottoBean9.getQuantita();
        prodottoBean9.setDescrizione("hi!");
        cart0.addProduct(prodottoBean9);
        ita.kangaroo.model.tipo tipo23 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean24 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo23);
        java.lang.String str25 = prodottoBean24.getImmagine();
        int int26 = prodottoBean24.getQuantita();
        prodottoBean24.setImmagine("hi!");
        ita.kangaroo.model.CartProduct cartProduct30 = new ita.kangaroo.model.CartProduct(prodottoBean24, (int) (short) 100);
        cart0.changeQuantity(prodottoBean24, (int) (short) 10);
        ita.kangaroo.model.Cart cart33 = new ita.kangaroo.model.Cart();
        ita.kangaroo.model.tipo tipo41 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean42 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo41);
        java.lang.String str43 = prodottoBean42.getDescrizione();
        java.lang.String str44 = prodottoBean42.getNome();
        int int45 = prodottoBean42.getQuantita();
        prodottoBean42.setDescrizione("hi!");
        cart33.addProduct(prodottoBean42);
        ita.kangaroo.model.tipo tipo56 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean57 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo56);
        java.lang.String str58 = prodottoBean57.getImmagine();
        int int59 = prodottoBean57.getQuantita();
        prodottoBean57.setImmagine("hi!");
        ita.kangaroo.model.CartProduct cartProduct63 = new ita.kangaroo.model.CartProduct(prodottoBean57, (int) (short) 100);
        cart33.changeQuantity(prodottoBean57, (int) (short) 10);
        int int66 = prodottoBean57.getQuantita();
        cart0.addProduct(prodottoBean57);
        java.lang.String str68 = prodottoBean57.getNome();
        java.lang.String str69 = prodottoBean57.getDescrizione();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        ita.kangaroo.model.AddressBean addressBean0 = new ita.kangaroo.model.AddressBean();
        java.lang.String str1 = addressBean0.getVia();
        java.lang.String str2 = addressBean0.getUsername();
        addressBean0.setUsername("hi!");
        addressBean0.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        boolean boolean8 = addressBean0.equals((java.lang.Object) 10L);
        addressBean0.setUsername("hi!");
        java.lang.String str11 = addressBean0.getCAP();
        java.lang.String str12 = addressBean0.getUsername();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        int int2 = orderProductBean0.getId_ordine();
        orderProductBean0.setQuantita((int) 'a');
        orderProductBean0.setIVA((float) 32);
        orderProductBean0.setPrezzo((float) 10);
        int int9 = orderProductBean0.getId_ordine();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        ita.kangaroo.model.AddressBean addressBean0 = new ita.kangaroo.model.AddressBean();
        java.lang.String str1 = addressBean0.getVia();
        java.lang.String str2 = addressBean0.getUsername();
        java.lang.String str3 = addressBean0.getCAP();
        java.lang.String str4 = addressBean0.getUsername();
        addressBean0.setId(10);
        java.lang.String str7 = addressBean0.getUsername();
        java.lang.String str8 = addressBean0.getVia();
        ita.kangaroo.model.tipo tipo15 = null;
        ita.kangaroo.model.utenteBean utenteBean21 = new ita.kangaroo.model.utenteBean("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "Data non disponibile", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "", tipo15, "Data non disponibile", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "Data non disponibile", "", "");
        java.sql.Date date29 = null;
        ita.kangaroo.model.OrdineBean ordineBean31 = new ita.kangaroo.model.OrdineBean((int) 'a', utenteBean21, (float) (byte) -1, "Data non disponibile", "Data non disponibile", "hi!", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "hi!", "", date29, "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        boolean boolean32 = addressBean0.equals((java.lang.Object) "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        ita.kangaroo.model.Cart cart0 = new ita.kangaroo.model.Cart();
        ita.kangaroo.model.tipo tipo8 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean9 = new ita.kangaroo.model.ProdottoBean((int) (byte) 10, "hi!", "hi!", "Data non disponibile", (float) (byte) 10, 10, (float) ' ', tipo8);
        cart0.removeProduct(prodottoBean9);
        ita.kangaroo.model.tipo tipo18 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean19 = new ita.kangaroo.model.ProdottoBean((int) (byte) -1, "", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "Data non disponibile", 100.0f, 0, (float) (byte) 100, tipo18);
        cart0.removeProduct(prodottoBean19);
        float float21 = prodottoBean19.getIva();
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 100.0f + "'", float21 == 100.0f);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        ita.kangaroo.model.AddressBean addressBean0 = new ita.kangaroo.model.AddressBean();
        java.lang.String str1 = addressBean0.getVia();
        java.lang.String str2 = addressBean0.getUsername();
        java.lang.String str3 = addressBean0.getCAP();
        java.lang.String str4 = addressBean0.getUsername();
        addressBean0.setId(10);
        addressBean0.setVia("");
        java.lang.String str9 = addressBean0.getUsername();
        java.lang.String str10 = addressBean0.getUsername();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        utenteBean11.setEmail("hi!");
        utenteBean11.setPassword("hi!");
        utenteBean11.setProvincia("hi!");
        utenteBean11.setUsername("hi!");
        java.lang.String str20 = utenteBean11.getTelefono();
        java.lang.String str21 = utenteBean11.getNome();
        java.lang.String str22 = utenteBean11.getTelefono();
        java.lang.String str23 = utenteBean11.getVia();
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getImmagine();
        prodottoBean8.setPrezzo((float) (-1L));
        int int12 = prodottoBean8.getId();
        float float13 = prodottoBean8.getIva();
        int int14 = prodottoBean8.getId();
        prodottoBean8.setPrezzo((float) (byte) 10);
        prodottoBean8.setDescrizione("hi!");
        prodottoBean8.setPrezzo(0.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getCircuito();
        java.lang.String str14 = ordineBean12.toString();
        java.lang.String str15 = ordineBean12.toString();
        java.util.ArrayList<ita.kangaroo.model.OrderProductBean> orderProductBeanList16 = ordineBean12.getProducts();
        float float17 = ordineBean12.getPrezzo_totale();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Data non disponibile" + "'", str14, "Data non disponibile");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Data non disponibile" + "'", str15, "Data non disponibile");
        org.junit.Assert.assertNotNull(orderProductBeanList16);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.0f + "'", float17 == 0.0f);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
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
        java.lang.String str19 = metodoPagamentoBean0.getCvv();
        metodoPagamentoBean0.setId((int) (byte) -1);
        int int22 = metodoPagamentoBean0.getId();
        int int23 = metodoPagamentoBean0.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getImmagine();
        prodottoBean8.setPrezzo((float) (-1L));
        int int12 = prodottoBean8.getId();
        prodottoBean8.setPrezzo(10.0f);
        prodottoBean8.setPrezzo(0.0f);
        java.lang.String str17 = prodottoBean8.getImmagine();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getImmagine();
        prodottoBean8.setPrezzo((float) (-1L));
        int int12 = prodottoBean8.getQuantita();
        int int13 = prodottoBean8.getQuantita();
        float float14 = prodottoBean8.getIva();
        ita.kangaroo.model.CartProduct cartProduct15 = new ita.kangaroo.model.CartProduct(prodottoBean8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) -1, "", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "Data non disponibile", 100.0f, 0, (float) (byte) 100, tipo7);
        prodottoBean8.setNome("ProdottoBean{id=10, descrizione='hi!', nome='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}");
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        ita.kangaroo.model.utenteBean utenteBean1 = new ita.kangaroo.model.utenteBean();
        java.lang.String str2 = utenteBean1.getPassword();
        java.sql.Date date10 = null;
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(0, utenteBean1, (float) (short) -1, "Data non disponibile", "", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "Data non disponibile", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", date10, "");
        utenteBean1.setTelefono("");
        java.lang.String str15 = utenteBean1.getCap();
        utenteBean1.setProvincia("3a987acf8cbc1028b7dbc86bd086831151899a2b");
        java.lang.String str18 = utenteBean1.getProvincia();
        java.lang.String str19 = utenteBean1.getEmail();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "3a987acf8cbc1028b7dbc86bd086831151899a2b" + "'", str18, "3a987acf8cbc1028b7dbc86bd086831151899a2b");
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.utenteBean utenteBean13 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo7, "hi!", "", "", "hi!", "");
        utenteBean13.setEmail("hi!");
        java.lang.String str16 = utenteBean13.getCognome();
        java.sql.Date date24 = null;
        ita.kangaroo.model.OrdineBean ordineBean26 = new ita.kangaroo.model.OrdineBean((int) (byte) 10, utenteBean13, (float) (-1L), "Data non disponibile", "Data non disponibile", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "hi!", "hi!", "", date24, "Data non disponibile");
        ita.kangaroo.model.tipo tipo27 = utenteBean13.getTipo();
        java.sql.Date date35 = null;
        ita.kangaroo.model.OrdineBean ordineBean37 = new ita.kangaroo.model.OrdineBean(1, utenteBean13, (float) 0L, "", "Data non disponibile", "hi!", "hi!", "", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", date35, "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        ordineBean37.setNumero_di_tracking("Data non disponibile");
        int int40 = ordineBean37.getId();
        ordineBean37.setMetodo_di_pagamento("");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(tipo27);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        ita.kangaroo.model.AddressBean addressBean5 = new ita.kangaroo.model.AddressBean(1, "", "Data non disponibile", "", "");
        addressBean5.setUsername("hi!");
        addressBean5.setCitta("ProdottoBean{id=32, descrizione='Data non disponibile', nome='Data non disponibile', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=32.0, quantita=32, iva=10.0, tipo=null}");
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        ordineBean12.setNumero_carta("");
        java.sql.Date date16 = ordineBean12.getData();
        ordineBean12.setPrezzo_totale((float) 'a');
        java.lang.String str19 = ordineBean12.getNumero_carta();
        ordineBean12.setMetodo_di_pagamento("");
        ordineBean12.setCircuito("da39a3ee5e6b4b0d3255bfef95601890afd80709");
        java.lang.Class<?> wildcardClass24 = ordineBean12.getClass();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        float float2 = orderProductBean0.getIVA();
        orderProductBean0.setPrezzo(10.0f);
        orderProductBean0.setId_prodotto((int) '#');
        orderProductBean0.setId_ordine((int) (byte) 0);
        orderProductBean0.setQuantita(0);
        int int11 = orderProductBean0.getId_ordine();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getDestinatario();
        java.lang.String str14 = ordineBean12.getCircuito();
        java.sql.Date date15 = ordineBean12.getData();
        ordineBean12.setPrezzo_totale((float) 10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(date15);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        ita.kangaroo.model.tipo tipo6 = null;
        ita.kangaroo.model.utenteBean utenteBean12 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo6, "hi!", "", "", "hi!", "");
        java.lang.String str13 = utenteBean12.getUsername();
        java.lang.String str14 = utenteBean12.getCap();
        java.sql.Date date22 = null;
        ita.kangaroo.model.OrdineBean ordineBean24 = new ita.kangaroo.model.OrdineBean((int) (short) 0, utenteBean12, (float) 10L, "", "Data non disponibile", "hi!", "hi!", "", "", date22, "hi!");
        int int25 = ordineBean24.getId();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        float float2 = orderProductBean0.getIVA();
        orderProductBean0.setPrezzo(10.0f);
        int int5 = orderProductBean0.getQuantita();
        orderProductBean0.setPrezzo((float) 10L);
        orderProductBean0.setIVA((float) 35);
        orderProductBean0.setQuantita((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("Data non disponibile", "Data non disponibile", "", "hi!", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", tipo5, "hi!", "Data non disponibile", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "Data non disponibile", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        utenteBean11.setTelefono("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        utenteBean11.setEmail("hi!");
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "hi!", "", "", "hi!", tipo5, "", "", "Data non disponibile", "", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        java.lang.String str12 = utenteBean11.getEmail();
        java.lang.String str13 = utenteBean11.getVia();
        java.lang.String str14 = utenteBean11.getTelefono();
        utenteBean11.setEmail("hi!");
        java.lang.String str17 = utenteBean11.getNome();
        utenteBean11.setTelefono("");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}" + "'", str17, "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        ita.kangaroo.model.MetodoPagamentoBean metodoPagamentoBean0 = new ita.kangaroo.model.MetodoPagamentoBean();
        metodoPagamentoBean0.setId((int) 'a');
        metodoPagamentoBean0.setCircuito("");
        java.lang.String str5 = metodoPagamentoBean0.getCircuito();
        metodoPagamentoBean0.setId((int) (byte) 0);
        metodoPagamentoBean0.setUsername("ProdottoBean{id=52, descrizione='hi!', nome='', immagine='da39a3ee5e6b4b0d3255bfef95601890afd80709', prezzo=32.0, quantita=-1, iva=52.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        ita.kangaroo.model.Cart cart0 = new ita.kangaroo.model.Cart();
        ita.kangaroo.model.tipo tipo8 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean9 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo8);
        java.lang.String str10 = prodottoBean9.getImmagine();
        prodottoBean9.setPrezzo((float) (-1L));
        int int13 = prodottoBean9.getId();
        prodottoBean9.setPrezzo(10.0f);
        prodottoBean9.setPrezzo(0.0f);
        prodottoBean9.setNome("Data non disponibile");
        cart0.changeQuantity(prodottoBean9, (int) '4');
        ita.kangaroo.model.tipo tipo29 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean30 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo29);
        java.lang.String str31 = prodottoBean30.getImmagine();
        prodottoBean30.setPrezzo((float) (-1L));
        int int34 = prodottoBean30.getId();
        float float35 = prodottoBean30.getIva();
        prodottoBean30.setQuantita((int) ' ');
        ita.kangaroo.model.tipo tipo38 = prodottoBean30.getTipo();
        cart0.changeQuantity(prodottoBean30, (int) (short) 100);
        ita.kangaroo.model.tipo tipo48 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean49 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo48);
        java.lang.String str50 = prodottoBean49.getImmagine();
        int int51 = prodottoBean49.getQuantita();
        ita.kangaroo.model.CartProduct cartProduct52 = new ita.kangaroo.model.CartProduct(prodottoBean49);
        prodottoBean49.setNome("");
        cart0.addProduct(prodottoBean49);
        java.lang.String str56 = prodottoBean49.getImmagine();
        prodottoBean49.setPrezzo((float) 1);
        prodottoBean49.setNome("ProdottoBean{id=0, descrizione='', nome='', immagine='', prezzo=0.0, quantita=0, iva=0.0, tipo=null}");
        java.lang.String str61 = prodottoBean49.getDescrizione();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 1.0f + "'", float35 == 1.0f);
        org.junit.Assert.assertNull(tipo38);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        ita.kangaroo.model.tipo tipo6 = null;
        ita.kangaroo.model.utenteBean utenteBean12 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo6, "hi!", "", "", "hi!", "");
        utenteBean12.setEmail("hi!");
        utenteBean12.setPassword("hi!");
        utenteBean12.setProvincia("hi!");
        utenteBean12.setUsername("hi!");
        utenteBean12.setCognome("hi!");
        java.sql.Date date30 = null;
        ita.kangaroo.model.OrdineBean ordineBean32 = new ita.kangaroo.model.OrdineBean((int) (byte) 10, utenteBean12, (float) (short) 100, "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "hi!", "", "", "hi!", "", date30, "");
        java.lang.String str33 = utenteBean12.getCap();
        utenteBean12.setCognome("ProdottoBean{id=32, descrizione='Data non disponibile', nome='Data non disponibile', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=32.0, quantita=32, iva=10.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getCircuito();
        ordineBean12.setIndirizzo_di_spedizione("");
        java.lang.String str16 = ordineBean12.getMetodo_di_pagamento();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        ita.kangaroo.model.MetodoPagamentoBean metodoPagamentoBean0 = new ita.kangaroo.model.MetodoPagamentoBean();
        metodoPagamentoBean0.setId((int) 'a');
        ita.kangaroo.model.AddressBean addressBean3 = new ita.kangaroo.model.AddressBean();
        java.lang.String str4 = addressBean3.getVia();
        addressBean3.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        addressBean3.setCitta("hi!");
        boolean boolean9 = metodoPagamentoBean0.equals((java.lang.Object) addressBean3);
        metodoPagamentoBean0.setUsername("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        metodoPagamentoBean0.setNumero_carta("da39a3ee5e6b4b0d3255bfef95601890afd80709");
        java.lang.String str14 = metodoPagamentoBean0.getCircuito();
        metodoPagamentoBean0.setUsername("3d1583397bcebff274b1e7cb58087c39153af974");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getDescrizione();
        java.lang.String str10 = prodottoBean8.getNome();
        ita.kangaroo.model.tipo tipo11 = prodottoBean8.getTipo();
        ita.kangaroo.model.tipo tipo12 = prodottoBean8.getTipo();
        java.lang.String str13 = prodottoBean8.getNome();
        java.lang.String str14 = prodottoBean8.getDescrizione();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(tipo11);
        org.junit.Assert.assertNull(tipo12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean(0, "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='hi!', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "ProdottoBean{id=10, descrizione='hi!', nome='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", (float) 0, 1, (float) (short) 10, tipo7);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        float float2 = orderProductBean0.getIVA();
        orderProductBean0.setPrezzo(10.0f);
        orderProductBean0.setId_ordine((int) (short) 0);
        orderProductBean0.setIVA((-1.0f));
        orderProductBean0.setPrezzo((float) (byte) 10);
        float float11 = orderProductBean0.getPrezzo();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        orderProductBean0.setQuantita((int) (byte) 100);
        orderProductBean0.setId_ordine((int) (byte) 0);
        orderProductBean0.setPrezzo((float) 1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        ita.kangaroo.model.MetodoPagamentoBean metodoPagamentoBean0 = new ita.kangaroo.model.MetodoPagamentoBean();
        metodoPagamentoBean0.setId((int) 'a');
        ita.kangaroo.model.AddressBean addressBean3 = new ita.kangaroo.model.AddressBean();
        java.lang.String str4 = addressBean3.getVia();
        addressBean3.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        addressBean3.setCitta("hi!");
        boolean boolean9 = metodoPagamentoBean0.equals((java.lang.Object) addressBean3);
        java.lang.String str10 = metodoPagamentoBean0.getCvv();
        java.lang.String str11 = metodoPagamentoBean0.getCvv();
        metodoPagamentoBean0.setUsername("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        metodoPagamentoBean0.setUsername("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        metodoPagamentoBean0.setData_scadenza("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='hi!', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        ita.kangaroo.model.AddressBean addressBean5 = new ita.kangaroo.model.AddressBean(32, "ProdottoBean{id=10, descrizione='hi!', nome='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}", "3d1583397bcebff274b1e7cb58087c39153af974", "ProdottoBean{id=32, descrizione='Data non disponibile', nome='Data non disponibile', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=32.0, quantita=32, iva=10.0, tipo=null}", "da39a3ee5e6b4b0d3255bfef95601890afd80709");
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        ita.kangaroo.model.MetodoPagamentoBean metodoPagamentoBean0 = new ita.kangaroo.model.MetodoPagamentoBean();
        metodoPagamentoBean0.setId((int) (byte) 0);
        java.lang.String str3 = metodoPagamentoBean0.getCvv();
        ita.kangaroo.model.AddressBean addressBean4 = new ita.kangaroo.model.AddressBean();
        java.lang.String str5 = addressBean4.getVia();
        java.lang.String str6 = addressBean4.getUsername();
        addressBean4.setUsername("hi!");
        addressBean4.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        boolean boolean12 = addressBean4.equals((java.lang.Object) 10L);
        addressBean4.setUsername("hi!");
        addressBean4.setCitta("");
        boolean boolean17 = metodoPagamentoBean0.equals((java.lang.Object) addressBean4);
        int int18 = metodoPagamentoBean0.getId();
        ita.kangaroo.model.OrderProductBean orderProductBean19 = new ita.kangaroo.model.OrderProductBean();
        float float20 = orderProductBean19.getIVA();
        float float21 = orderProductBean19.getIVA();
        orderProductBean19.setPrezzo(10.0f);
        float float24 = orderProductBean19.getPrezzo();
        float float25 = orderProductBean19.getPrezzo();
        int int26 = orderProductBean19.getId_ordine();
        orderProductBean19.setIVA((-1.0f));
        boolean boolean29 = metodoPagamentoBean0.equals((java.lang.Object) (-1.0f));
        java.lang.String str30 = metodoPagamentoBean0.getNumero_carta();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.0f + "'", float21 == 0.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 10.0f + "'", float24 == 10.0f);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 10.0f + "'", float25 == 10.0f);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        float float2 = orderProductBean0.getIVA();
        orderProductBean0.setPrezzo(10.0f);
        orderProductBean0.setQuantita((int) (short) -1);
        int int7 = orderProductBean0.getQuantita();
        orderProductBean0.setQuantita((int) (byte) 1);
        int int10 = orderProductBean0.getQuantita();
        orderProductBean0.setIVA(0.0f);
        orderProductBean0.setQuantita((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        ita.kangaroo.model.Cart cart0 = new ita.kangaroo.model.Cart();
        ita.kangaroo.model.tipo tipo8 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean9 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo8);
        int int10 = prodottoBean9.getId();
        java.lang.String str11 = prodottoBean9.getImmagine();
        cart0.removeProduct(prodottoBean9);
        ita.kangaroo.model.tipo tipo20 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean21 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo20);
        java.lang.String str22 = prodottoBean21.getDescrizione();
        java.lang.String str23 = prodottoBean21.getNome();
        ita.kangaroo.model.tipo tipo24 = prodottoBean21.getTipo();
        cart0.removeProduct(prodottoBean21);
        ita.kangaroo.model.Cart cart26 = new ita.kangaroo.model.Cart();
        ita.kangaroo.model.tipo tipo34 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean35 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo34);
        java.lang.String str36 = prodottoBean35.getDescrizione();
        java.lang.String str37 = prodottoBean35.getNome();
        int int38 = prodottoBean35.getQuantita();
        prodottoBean35.setDescrizione("hi!");
        cart26.addProduct(prodottoBean35);
        java.util.ArrayList<ita.kangaroo.model.CartProduct> cartProductList42 = cart26.getProducts();
        ita.kangaroo.model.Cart cart43 = new ita.kangaroo.model.Cart();
        ita.kangaroo.model.tipo tipo51 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean52 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo51);
        int int53 = prodottoBean52.getId();
        java.lang.String str54 = prodottoBean52.getImmagine();
        cart43.removeProduct(prodottoBean52);
        ita.kangaroo.model.tipo tipo63 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean64 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo63);
        java.lang.String str65 = prodottoBean64.getDescrizione();
        java.lang.String str66 = prodottoBean64.getNome();
        ita.kangaroo.model.tipo tipo67 = prodottoBean64.getTipo();
        cart43.removeProduct(prodottoBean64);
        cart26.removeProduct(prodottoBean64);
        ita.kangaroo.model.CartProduct cartProduct70 = new ita.kangaroo.model.CartProduct(prodottoBean64);
        cart0.addProduct(prodottoBean64);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNull(tipo24);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(cartProductList42);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi!" + "'", str66, "hi!");
        org.junit.Assert.assertNull(tipo67);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        ordineBean12.setIndirizzo_di_spedizione("Data non disponibile");
        ordineBean12.setPrezzo_totale((float) (byte) 10);
        java.lang.String str17 = ordineBean12.getCircuito();
        ita.kangaroo.model.utenteBean utenteBean18 = ordineBean12.getClient();
        java.lang.String str19 = utenteBean18.getCognome();
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(utenteBean18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        ita.kangaroo.model.MetodoPagamentoBean metodoPagamentoBean0 = new ita.kangaroo.model.MetodoPagamentoBean();
        metodoPagamentoBean0.setId((int) 'a');
        ita.kangaroo.model.AddressBean addressBean3 = new ita.kangaroo.model.AddressBean();
        java.lang.String str4 = addressBean3.getVia();
        addressBean3.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        addressBean3.setCitta("hi!");
        boolean boolean9 = metodoPagamentoBean0.equals((java.lang.Object) addressBean3);
        java.lang.String str10 = metodoPagamentoBean0.getNumero_carta();
        java.lang.String str11 = metodoPagamentoBean0.getUsername();
        java.lang.String str12 = metodoPagamentoBean0.getCvv();
        metodoPagamentoBean0.setUsername("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        int int15 = metodoPagamentoBean0.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        ita.kangaroo.model.AddressBean addressBean0 = new ita.kangaroo.model.AddressBean();
        java.lang.String str1 = addressBean0.getVia();
        java.lang.String str2 = addressBean0.getUsername();
        java.lang.String str3 = addressBean0.getCAP();
        java.lang.String str4 = addressBean0.getUsername();
        addressBean0.setId(10);
        int int7 = addressBean0.getId();
        java.lang.String str8 = addressBean0.getUsername();
        java.lang.String str9 = addressBean0.getUsername();
        ita.kangaroo.model.tipo tipo16 = null;
        ita.kangaroo.model.utenteBean utenteBean22 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo16, "hi!", "", "", "hi!", "");
        utenteBean22.setEmail("hi!");
        java.lang.String str25 = utenteBean22.getCognome();
        utenteBean22.setCitta("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        utenteBean22.setUsername("Data non disponibile");
        java.sql.Date date37 = null;
        ita.kangaroo.model.OrdineBean ordineBean39 = new ita.kangaroo.model.OrdineBean(0, utenteBean22, (float) (byte) 0, "", "", "Data non disponibile", "Data non disponibile", "hi!", "", date37, "Data non disponibile");
        ordineBean39.setMetodo_di_pagamento("Data non disponibile");
        boolean boolean42 = addressBean0.equals((java.lang.Object) ordineBean39);
        ita.kangaroo.model.OrderProductBean orderProductBean43 = new ita.kangaroo.model.OrderProductBean();
        float float44 = orderProductBean43.getIVA();
        orderProductBean43.setQuantita((int) (byte) 100);
        ita.kangaroo.model.OrderProductBean orderProductBean47 = new ita.kangaroo.model.OrderProductBean();
        float float48 = orderProductBean47.getIVA();
        float float49 = orderProductBean47.getIVA();
        orderProductBean47.setPrezzo(10.0f);
        int int52 = orderProductBean47.getQuantita();
        ita.kangaroo.model.OrderProductBean orderProductBean53 = new ita.kangaroo.model.OrderProductBean();
        float float54 = orderProductBean53.getIVA();
        float float55 = orderProductBean53.getIVA();
        float float56 = orderProductBean53.getPrezzo();
        ita.kangaroo.model.OrderProductBean orderProductBean57 = new ita.kangaroo.model.OrderProductBean();
        float float58 = orderProductBean57.getIVA();
        float float59 = orderProductBean57.getIVA();
        float float60 = orderProductBean57.getPrezzo();
        ita.kangaroo.model.OrderProductBean orderProductBean61 = new ita.kangaroo.model.OrderProductBean();
        float float62 = orderProductBean61.getIVA();
        float float63 = orderProductBean61.getIVA();
        float float64 = orderProductBean61.getPrezzo();
        ita.kangaroo.model.OrderProductBean orderProductBean65 = new ita.kangaroo.model.OrderProductBean();
        float float66 = orderProductBean65.getIVA();
        int int67 = orderProductBean65.getId_ordine();
        orderProductBean65.setQuantita((int) 'a');
        float float70 = orderProductBean65.getIVA();
        ita.kangaroo.model.OrderProductBean orderProductBean71 = new ita.kangaroo.model.OrderProductBean();
        float float72 = orderProductBean71.getIVA();
        float float73 = orderProductBean71.getIVA();
        ita.kangaroo.model.OrderProductBean orderProductBean74 = new ita.kangaroo.model.OrderProductBean();
        float float75 = orderProductBean74.getIVA();
        float float76 = orderProductBean74.getIVA();
        float float77 = orderProductBean74.getPrezzo();
        int int78 = orderProductBean74.getQuantita();
        ita.kangaroo.model.OrderProductBean orderProductBean79 = new ita.kangaroo.model.OrderProductBean();
        float float80 = orderProductBean79.getIVA();
        float float81 = orderProductBean79.getIVA();
        orderProductBean79.setPrezzo(10.0f);
        int int84 = orderProductBean79.getQuantita();
        ita.kangaroo.model.OrderProductBean orderProductBean85 = new ita.kangaroo.model.OrderProductBean();
        ita.kangaroo.model.OrderProductBean orderProductBean86 = new ita.kangaroo.model.OrderProductBean();
        ita.kangaroo.model.OrderProductBean orderProductBean87 = new ita.kangaroo.model.OrderProductBean();
        float float88 = orderProductBean87.getIVA();
        int int89 = orderProductBean87.getId_ordine();
        orderProductBean87.setQuantita((int) 'a');
        int int92 = orderProductBean87.getId_ordine();
        ita.kangaroo.model.OrderProductBean[] orderProductBeanArray93 = new ita.kangaroo.model.OrderProductBean[] { orderProductBean43, orderProductBean47, orderProductBean53, orderProductBean57, orderProductBean61, orderProductBean65, orderProductBean71, orderProductBean74, orderProductBean79, orderProductBean85, orderProductBean86, orderProductBean87 };
        java.util.ArrayList<ita.kangaroo.model.OrderProductBean> orderProductBeanList94 = new java.util.ArrayList<ita.kangaroo.model.OrderProductBean>();
        boolean boolean95 = java.util.Collections.addAll((java.util.Collection<ita.kangaroo.model.OrderProductBean>) orderProductBeanList94, orderProductBeanArray93);
        ita.kangaroo.model.OrdineBean ordineBean96 = new ita.kangaroo.model.OrdineBean(orderProductBeanList94);
        ita.kangaroo.model.OrdineBean ordineBean97 = new ita.kangaroo.model.OrdineBean(orderProductBeanList94);
        ordineBean39.setProducts(orderProductBeanList94);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 0.0f + "'", float44 == 0.0f);
        org.junit.Assert.assertTrue("'" + float48 + "' != '" + 0.0f + "'", float48 == 0.0f);
        org.junit.Assert.assertTrue("'" + float49 + "' != '" + 0.0f + "'", float49 == 0.0f);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + float54 + "' != '" + 0.0f + "'", float54 == 0.0f);
        org.junit.Assert.assertTrue("'" + float55 + "' != '" + 0.0f + "'", float55 == 0.0f);
        org.junit.Assert.assertTrue("'" + float56 + "' != '" + 0.0f + "'", float56 == 0.0f);
        org.junit.Assert.assertTrue("'" + float58 + "' != '" + 0.0f + "'", float58 == 0.0f);
        org.junit.Assert.assertTrue("'" + float59 + "' != '" + 0.0f + "'", float59 == 0.0f);
        org.junit.Assert.assertTrue("'" + float60 + "' != '" + 0.0f + "'", float60 == 0.0f);
        org.junit.Assert.assertTrue("'" + float62 + "' != '" + 0.0f + "'", float62 == 0.0f);
        org.junit.Assert.assertTrue("'" + float63 + "' != '" + 0.0f + "'", float63 == 0.0f);
        org.junit.Assert.assertTrue("'" + float64 + "' != '" + 0.0f + "'", float64 == 0.0f);
        org.junit.Assert.assertTrue("'" + float66 + "' != '" + 0.0f + "'", float66 == 0.0f);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + float70 + "' != '" + 0.0f + "'", float70 == 0.0f);
        org.junit.Assert.assertTrue("'" + float72 + "' != '" + 0.0f + "'", float72 == 0.0f);
        org.junit.Assert.assertTrue("'" + float73 + "' != '" + 0.0f + "'", float73 == 0.0f);
        org.junit.Assert.assertTrue("'" + float75 + "' != '" + 0.0f + "'", float75 == 0.0f);
        org.junit.Assert.assertTrue("'" + float76 + "' != '" + 0.0f + "'", float76 == 0.0f);
        org.junit.Assert.assertTrue("'" + float77 + "' != '" + 0.0f + "'", float77 == 0.0f);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertTrue("'" + float80 + "' != '" + 0.0f + "'", float80 == 0.0f);
        org.junit.Assert.assertTrue("'" + float81 + "' != '" + 0.0f + "'", float81 == 0.0f);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertTrue("'" + float88 + "' != '" + 0.0f + "'", float88 == 0.0f);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 0 + "'", int92 == 0);
        org.junit.Assert.assertNotNull(orderProductBeanArray93);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        ita.kangaroo.model.OrdineBean ordineBean0 = new ita.kangaroo.model.OrdineBean();
        ita.kangaroo.model.tipo tipo6 = null;
        ita.kangaroo.model.utenteBean utenteBean12 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo6, "", "", "hi!", "hi!", "hi!");
        java.lang.String str13 = utenteBean12.getUsername();
        utenteBean12.setPassword("");
        ita.kangaroo.model.tipo tipo16 = null;
        utenteBean12.setTipo(tipo16);
        utenteBean12.setProvincia("da39a3ee5e6b4b0d3255bfef95601890afd80709");
        ordineBean0.setClient(utenteBean12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getDestinatario();
        java.lang.String str14 = ordineBean12.getCircuito();
        java.sql.Date date15 = ordineBean12.getData();
        ordineBean12.setNumero_carta("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        int int18 = ordineBean12.getId();
        ordineBean12.setNumero_di_tracking("hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(date15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        ita.kangaroo.model.ProdottoBean prodottoBean0 = null;
        ita.kangaroo.model.CartProduct cartProduct2 = new ita.kangaroo.model.CartProduct(prodottoBean0, (int) (byte) 10);
        int int3 = cartProduct2.getQuantity();
        int int4 = cartProduct2.getQuantity();
        cartProduct2.setQuantity((int) 'a');
        cartProduct2.setQuantity((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        ordineBean12.setNumero_carta("");
        java.lang.String str16 = ordineBean12.getIndirizzo_di_spedizione();
        java.sql.Date date17 = null;
        ordineBean12.setData(date17);
        ita.kangaroo.model.tipo tipo26 = null;
        ita.kangaroo.model.utenteBean utenteBean32 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo26, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean33 = new ita.kangaroo.model.OrdineBean(utenteBean32);
        utenteBean32.setPassword("hi!");
        utenteBean32.setNome("hi!");
        java.sql.Date date45 = null;
        ita.kangaroo.model.OrdineBean ordineBean47 = new ita.kangaroo.model.OrdineBean((int) (byte) 100, utenteBean32, (float) (-1L), "hi!", "", "", "hi!", "Data non disponibile", "hi!", date45, "");
        java.lang.String str48 = utenteBean32.getCognome();
        java.sql.Date date56 = null;
        ita.kangaroo.model.OrdineBean ordineBean58 = new ita.kangaroo.model.OrdineBean((int) (short) 1, utenteBean32, (float) 'a', "hi!", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "Data non disponibile", "Data non disponibile", "", "Data non disponibile", date56, "Data non disponibile");
        java.lang.String str59 = utenteBean32.getVia();
        ordineBean12.setClient(utenteBean32);
        ordineBean12.setId((int) (short) -1);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        ita.kangaroo.model.tipo tipo6 = null;
        ita.kangaroo.model.utenteBean utenteBean12 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo6, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean13 = new ita.kangaroo.model.OrdineBean(utenteBean12);
        utenteBean12.setPassword("hi!");
        utenteBean12.setNome("hi!");
        java.sql.Date date25 = null;
        ita.kangaroo.model.OrdineBean ordineBean27 = new ita.kangaroo.model.OrdineBean((int) (byte) 100, utenteBean12, (float) (-1L), "hi!", "", "", "hi!", "Data non disponibile", "hi!", date25, "");
        ordineBean27.setIndirizzo_di_spedizione("Data non disponibile");
        java.lang.String str30 = ordineBean27.getDestinatario();
        java.lang.String str31 = ordineBean27.getDestinatario();
        ita.kangaroo.model.tipo tipo37 = null;
        ita.kangaroo.model.utenteBean utenteBean43 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo37, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean44 = new ita.kangaroo.model.OrdineBean(utenteBean43);
        java.lang.String str45 = ordineBean44.getMetodo_di_spedizione();
        java.util.ArrayList<ita.kangaroo.model.OrderProductBean> orderProductBeanList46 = ordineBean44.getProducts();
        ordineBean27.setProducts(orderProductBeanList46);
        ita.kangaroo.model.OrdineBean ordineBean48 = new ita.kangaroo.model.OrdineBean(orderProductBeanList46);
        int int49 = ordineBean48.getId();
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(orderProductBeanList46);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        ita.kangaroo.model.AddressBean addressBean0 = new ita.kangaroo.model.AddressBean();
        java.lang.String str1 = addressBean0.getVia();
        java.lang.String str2 = addressBean0.getUsername();
        addressBean0.setUsername("hi!");
        addressBean0.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        boolean boolean8 = addressBean0.equals((java.lang.Object) 10L);
        int int9 = addressBean0.getId();
        java.lang.String str10 = addressBean0.getUsername();
        int int11 = addressBean0.getId();
        ita.kangaroo.model.tipo tipo17 = null;
        ita.kangaroo.model.utenteBean utenteBean23 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo17, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean24 = new ita.kangaroo.model.OrdineBean(utenteBean23);
        java.lang.String str25 = ordineBean24.getMetodo_di_spedizione();
        ordineBean24.setNumero_carta("");
        java.sql.Date date28 = ordineBean24.getData();
        ordineBean24.setPrezzo_totale((float) 'a');
        java.lang.String str31 = ordineBean24.getNumero_carta();
        ita.kangaroo.model.tipo tipo37 = null;
        ita.kangaroo.model.utenteBean utenteBean43 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo37, "hi!", "", "", "hi!", "");
        java.lang.String str44 = utenteBean43.getUsername();
        java.lang.String str45 = utenteBean43.getCap();
        utenteBean43.setUsername("");
        ita.kangaroo.model.OrdineBean ordineBean48 = new ita.kangaroo.model.OrdineBean(utenteBean43);
        ordineBean48.setCircuito("");
        java.util.ArrayList<ita.kangaroo.model.OrderProductBean> orderProductBeanList51 = ordineBean48.getProducts();
        ordineBean24.setProducts(orderProductBeanList51);
        boolean boolean53 = addressBean0.equals((java.lang.Object) orderProductBeanList51);
        addressBean0.setId(35);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(date28);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(orderProductBeanList51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 10, "hi!", "hi!", "Data non disponibile", (float) (byte) 10, 10, (float) ' ', tipo7);
        prodottoBean8.setNome("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        prodottoBean8.setNome("ProdottoBean{id=10, descrizione='hi!', nome='', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}");
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        java.lang.String str12 = utenteBean11.getUsername();
        java.lang.String str13 = utenteBean11.getCap();
        utenteBean11.setUsername("");
        ita.kangaroo.model.OrdineBean ordineBean16 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        ordineBean16.setCircuito("");
        java.lang.String str19 = ordineBean16.getNumero_carta();
        java.lang.String str20 = ordineBean16.getMetodo_di_pagamento();
        ordineBean16.setIndirizzo_di_spedizione("");
        ita.kangaroo.model.utenteBean utenteBean23 = ordineBean16.getClient();
        java.lang.String str24 = ordineBean16.getNumero_di_tracking();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(utenteBean23);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        ita.kangaroo.model.Cart cart0 = new ita.kangaroo.model.Cart();
        ita.kangaroo.model.tipo tipo8 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean9 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo8);
        int int10 = prodottoBean9.getId();
        java.lang.String str11 = prodottoBean9.getImmagine();
        cart0.removeProduct(prodottoBean9);
        ita.kangaroo.model.tipo tipo20 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean21 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo20);
        java.lang.String str22 = prodottoBean21.getDescrizione();
        java.lang.String str23 = prodottoBean21.getNome();
        ita.kangaroo.model.tipo tipo24 = prodottoBean21.getTipo();
        cart0.removeProduct(prodottoBean21);
        ita.kangaroo.model.tipo tipo33 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean34 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo33);
        java.lang.String str35 = prodottoBean34.getImmagine();
        prodottoBean34.setPrezzo((float) (-1L));
        int int38 = prodottoBean34.getId();
        float float39 = prodottoBean34.getIva();
        prodottoBean34.setQuantita((int) ' ');
        ita.kangaroo.model.tipo tipo42 = prodottoBean34.getTipo();
        cart0.addProduct(prodottoBean34);
        ita.kangaroo.model.tipo tipo51 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean52 = new ita.kangaroo.model.ProdottoBean((int) (byte) -1, "Data non disponibile", "Data non disponibile", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", (float) ' ', (int) ' ', (float) ' ', tipo51);
        ita.kangaroo.model.CartProduct cartProduct53 = new ita.kangaroo.model.CartProduct(prodottoBean52);
        int int54 = prodottoBean52.getQuantita();
        prodottoBean52.setDescrizione("hi!");
        prodottoBean52.setIva(0.0f);
        cart0.changeQuantity(prodottoBean52, (-1));
        ita.kangaroo.model.Cart cart61 = new ita.kangaroo.model.Cart();
        ita.kangaroo.model.tipo tipo69 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean70 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo69);
        int int71 = prodottoBean70.getId();
        java.lang.String str72 = prodottoBean70.getImmagine();
        cart61.removeProduct(prodottoBean70);
        ita.kangaroo.model.tipo tipo74 = prodottoBean70.getTipo();
        float float75 = prodottoBean70.getPrezzo();
        ita.kangaroo.model.CartProduct cartProduct76 = new ita.kangaroo.model.CartProduct(prodottoBean70);
        cart0.addProduct(prodottoBean70);
        prodottoBean70.setNome("ProdottoBean{id=10, descrizione='hi!', nome='', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNull(tipo24);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 1.0f + "'", float39 == 1.0f);
        org.junit.Assert.assertNull(tipo42);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 32 + "'", int54 == 32);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 1 + "'", int71 == 1);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "hi!" + "'", str72, "hi!");
        org.junit.Assert.assertNull(tipo74);
        org.junit.Assert.assertTrue("'" + float75 + "' != '" + 1.0f + "'", float75 == 1.0f);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        int int2 = orderProductBean0.getId_ordine();
        orderProductBean0.setQuantita((int) 'a');
        int int5 = orderProductBean0.getId_ordine();
        orderProductBean0.setId_ordine(100);
        float float8 = orderProductBean0.getPrezzo();
        int int9 = orderProductBean0.getId_prodotto();
        orderProductBean0.setId_ordine(100);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getDestinatario();
        java.lang.String str14 = ordineBean12.toString();
        java.lang.String str15 = ordineBean12.getMetodo_di_spedizione();
        ita.kangaroo.model.utenteBean utenteBean16 = ordineBean12.getClient();
        int int17 = ordineBean12.getId();
        java.lang.String str18 = ordineBean12.getNumero_carta();
        java.lang.String str19 = ordineBean12.getCircuito();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Data non disponibile" + "'", str14, "Data non disponibile");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(utenteBean16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        ita.kangaroo.model.AddressBean addressBean5 = new ita.kangaroo.model.AddressBean((int) (short) 0, "hi!", "Data non disponibile", "", "");
        addressBean5.setId((int) (short) 100);
        java.lang.String str8 = addressBean5.getUsername();
        addressBean5.setId((int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        int int2 = orderProductBean0.getId_ordine();
        orderProductBean0.setQuantita((int) 'a');
        int int5 = orderProductBean0.getId_ordine();
        orderProductBean0.setId_ordine(100);
        float float8 = orderProductBean0.getPrezzo();
        float float9 = orderProductBean0.getPrezzo();
        orderProductBean0.setQuantita((int) (short) 0);
        orderProductBean0.setId_ordine((int) (byte) 0);
        float float14 = orderProductBean0.getPrezzo();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("ProdottoBean{id=0, descrizione='', nome='', immagine='', prezzo=0.0, quantita=0, iva=0.0, tipo=null}", "3d1583397bcebff274b1e7cb58087c39153af974", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='hi!', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "", "ProdottoBean{id=0, descrizione='', nome='', immagine='', prezzo=0.0, quantita=0, iva=0.0, tipo=null}", tipo5, "da39a3ee5e6b4b0d3255bfef95601890afd80709", "hi!", "", "Data non disponibile", "3d1583397bcebff274b1e7cb58087c39153af974");
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getImmagine();
        prodottoBean8.setPrezzo((float) (-1L));
        int int12 = prodottoBean8.getId();
        prodottoBean8.setPrezzo((float) (-1));
        ita.kangaroo.model.tipo tipo15 = null;
        prodottoBean8.setTipo(tipo15);
        float float17 = prodottoBean8.getIva();
        prodottoBean8.setIva((float) 10);
        prodottoBean8.setQuantita(0);
        ita.kangaroo.model.tipo tipo22 = prodottoBean8.getTipo();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 1.0f + "'", float17 == 1.0f);
        org.junit.Assert.assertNull(tipo22);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        ita.kangaroo.model.tipo tipo18 = null;
        ita.kangaroo.model.utenteBean utenteBean24 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo18, "hi!", "", "", "hi!", "");
        utenteBean24.setEmail("hi!");
        utenteBean24.setPassword("hi!");
        java.lang.String str29 = utenteBean24.getCognome();
        ordineBean12.setClient(utenteBean24);
        utenteBean24.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        java.lang.String str33 = utenteBean24.getCitta();
        java.lang.String str34 = utenteBean24.getPassword();
        utenteBean24.setCognome("hi!");
        java.lang.String str37 = utenteBean24.getNome();
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "3a987acf8cbc1028b7dbc86bd086831151899a2b" + "'", str34, "3a987acf8cbc1028b7dbc86bd086831151899a2b");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        float float2 = orderProductBean0.getIVA();
        float float3 = orderProductBean0.getPrezzo();
        int int4 = orderProductBean0.getQuantita();
        orderProductBean0.setId_prodotto((int) '4');
        orderProductBean0.setPrezzo((float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        ita.kangaroo.model.AddressBean addressBean0 = new ita.kangaroo.model.AddressBean();
        java.lang.String str1 = addressBean0.getVia();
        java.lang.String str2 = addressBean0.getUsername();
        addressBean0.setUsername("hi!");
        addressBean0.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        addressBean0.setId((int) '4');
        java.lang.String str9 = addressBean0.getVia();
        java.lang.String str10 = addressBean0.getCitta();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}" + "'", str9, "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        ita.kangaroo.model.Cart cart0 = new ita.kangaroo.model.Cart();
        ita.kangaroo.model.tipo tipo8 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean9 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo8);
        java.lang.String str10 = prodottoBean9.getDescrizione();
        java.lang.String str11 = prodottoBean9.getNome();
        int int12 = prodottoBean9.getQuantita();
        prodottoBean9.setDescrizione("hi!");
        cart0.addProduct(prodottoBean9);
        ita.kangaroo.model.tipo tipo23 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean24 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo23);
        java.lang.String str25 = prodottoBean24.getImmagine();
        int int26 = prodottoBean24.getQuantita();
        prodottoBean24.setImmagine("hi!");
        ita.kangaroo.model.CartProduct cartProduct30 = new ita.kangaroo.model.CartProduct(prodottoBean24, (int) (short) 100);
        cart0.changeQuantity(prodottoBean24, (int) (short) 10);
        int int33 = prodottoBean24.getQuantita();
        ita.kangaroo.model.CartProduct cartProduct35 = new ita.kangaroo.model.CartProduct(prodottoBean24, 32);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
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
        float float19 = orderProductBean12.getIVA();
        int int20 = orderProductBean12.getQuantita();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.0f + "'", float19 == 0.0f);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) -1, "", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "Data non disponibile", 100.0f, 0, (float) (byte) 100, tipo7);
        prodottoBean8.setImmagine("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='hi!', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        ita.kangaroo.model.tipo tipo19 = null;
        ita.kangaroo.model.utenteBean utenteBean25 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo19, "hi!", "", "", "hi!", "");
        utenteBean25.setEmail("hi!");
        ordineBean12.setClient(utenteBean25);
        ordineBean12.setNumero_carta("");
        ordineBean12.setMetodo_di_pagamento("hi!");
        java.util.ArrayList<ita.kangaroo.model.OrderProductBean> orderProductBeanList33 = null;
        ordineBean12.setProducts(orderProductBeanList33);
        java.lang.String str35 = ordineBean12.getDestinatario();
        java.lang.String str36 = ordineBean12.getCircuito();
        java.util.ArrayList<ita.kangaroo.model.OrderProductBean> orderProductBeanList37 = ordineBean12.getProducts();
        ordineBean12.setMetodo_di_spedizione("");
        ita.kangaroo.model.tipo tipo45 = null;
        ita.kangaroo.model.utenteBean utenteBean51 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo45, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean52 = new ita.kangaroo.model.OrdineBean(utenteBean51);
        java.lang.String str53 = ordineBean52.getMetodo_di_spedizione();
        ordineBean52.setNumero_carta("");
        java.lang.String str56 = ordineBean52.getIndirizzo_di_spedizione();
        java.lang.String str57 = ordineBean52.getIndirizzo_di_spedizione();
        java.util.ArrayList<ita.kangaroo.model.OrderProductBean> orderProductBeanList58 = ordineBean52.getProducts();
        ordineBean12.setProducts(orderProductBeanList58);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(orderProductBeanList37);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertNotNull(orderProductBeanList58);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        ita.kangaroo.model.tipo tipo19 = null;
        ita.kangaroo.model.utenteBean utenteBean25 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo19, "hi!", "", "", "hi!", "");
        utenteBean25.setEmail("hi!");
        ordineBean12.setClient(utenteBean25);
        ordineBean12.setNumero_carta("");
        ordineBean12.setMetodo_di_pagamento("hi!");
        ordineBean12.setId((int) (short) 0);
        ordineBean12.setNumero_carta("Data non disponibile");
        ordineBean12.setMetodo_di_spedizione("3a987acf8cbc1028b7dbc86bd086831151899a2b");
        java.lang.String str39 = ordineBean12.getNumero_carta();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Data non disponibile" + "'", str39, "Data non disponibile");
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        ordineBean12.setId((int) (byte) -1);
        java.lang.String str16 = ordineBean12.getCircuito();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        ita.kangaroo.model.tipo tipo6 = null;
        ita.kangaroo.model.utenteBean utenteBean12 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo6, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean13 = new ita.kangaroo.model.OrdineBean(utenteBean12);
        utenteBean12.setPassword("hi!");
        utenteBean12.setNome("hi!");
        java.sql.Date date25 = null;
        ita.kangaroo.model.OrdineBean ordineBean27 = new ita.kangaroo.model.OrdineBean((int) (byte) 100, utenteBean12, (float) (-1L), "hi!", "", "", "hi!", "Data non disponibile", "hi!", date25, "");
        ordineBean27.setIndirizzo_di_spedizione("Data non disponibile");
        java.lang.String str30 = ordineBean27.getDestinatario();
        ordineBean27.setCircuito("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        ita.kangaroo.model.utenteBean utenteBean33 = ordineBean27.getClient();
        utenteBean33.setTelefono("hi!");
        utenteBean33.setProvincia("");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(utenteBean33);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        ita.kangaroo.model.Cart cart0 = new ita.kangaroo.model.Cart();
        ita.kangaroo.model.tipo tipo8 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean9 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo8);
        java.lang.String str10 = prodottoBean9.getImmagine();
        prodottoBean9.setPrezzo((float) (-1L));
        cart0.changeQuantity(prodottoBean9, 97);
        prodottoBean9.setNome("Data non disponibile");
        int int17 = prodottoBean9.getQuantita();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        float float2 = orderProductBean0.getIVA();
        int int3 = orderProductBean0.getId_prodotto();
        float float4 = orderProductBean0.getPrezzo();
        ita.kangaroo.model.OrderProductBean orderProductBean5 = new ita.kangaroo.model.OrderProductBean();
        float float6 = orderProductBean5.getIVA();
        float float7 = orderProductBean5.getIVA();
        ita.kangaroo.model.OrderProductBean orderProductBean8 = new ita.kangaroo.model.OrderProductBean();
        float float9 = orderProductBean8.getIVA();
        orderProductBean8.setQuantita((int) (byte) 100);
        orderProductBean8.setPrezzo((float) (-1));
        ita.kangaroo.model.OrderProductBean orderProductBean14 = new ita.kangaroo.model.OrderProductBean();
        float float15 = orderProductBean14.getIVA();
        float float16 = orderProductBean14.getIVA();
        int int17 = orderProductBean14.getId_prodotto();
        float float18 = orderProductBean14.getPrezzo();
        ita.kangaroo.model.OrderProductBean orderProductBean19 = new ita.kangaroo.model.OrderProductBean();
        float float20 = orderProductBean19.getIVA();
        orderProductBean19.setQuantita((int) (byte) 100);
        ita.kangaroo.model.OrderProductBean orderProductBean23 = new ita.kangaroo.model.OrderProductBean();
        float float24 = orderProductBean23.getIVA();
        float float25 = orderProductBean23.getIVA();
        float float26 = orderProductBean23.getPrezzo();
        ita.kangaroo.model.OrderProductBean orderProductBean27 = new ita.kangaroo.model.OrderProductBean();
        float float28 = orderProductBean27.getIVA();
        float float29 = orderProductBean27.getIVA();
        float float30 = orderProductBean27.getPrezzo();
        ita.kangaroo.model.OrderProductBean orderProductBean31 = new ita.kangaroo.model.OrderProductBean();
        float float32 = orderProductBean31.getIVA();
        float float33 = orderProductBean31.getIVA();
        int int34 = orderProductBean31.getId_prodotto();
        float float35 = orderProductBean31.getPrezzo();
        ita.kangaroo.model.OrderProductBean orderProductBean36 = new ita.kangaroo.model.OrderProductBean();
        ita.kangaroo.model.OrderProductBean orderProductBean37 = new ita.kangaroo.model.OrderProductBean();
        float float38 = orderProductBean37.getIVA();
        float float39 = orderProductBean37.getIVA();
        orderProductBean37.setPrezzo(10.0f);
        orderProductBean37.setId_ordine((int) (short) 0);
        orderProductBean37.setIVA((-1.0f));
        ita.kangaroo.model.OrderProductBean orderProductBean46 = new ita.kangaroo.model.OrderProductBean();
        float float47 = orderProductBean46.getIVA();
        int int48 = orderProductBean46.getId_ordine();
        orderProductBean46.setQuantita((int) 'a');
        int int51 = orderProductBean46.getId_ordine();
        orderProductBean46.setId_ordine(100);
        ita.kangaroo.model.OrderProductBean orderProductBean54 = new ita.kangaroo.model.OrderProductBean();
        float float55 = orderProductBean54.getIVA();
        int int56 = orderProductBean54.getId_ordine();
        int int57 = orderProductBean54.getQuantita();
        ita.kangaroo.model.OrderProductBean orderProductBean58 = new ita.kangaroo.model.OrderProductBean();
        float float59 = orderProductBean58.getIVA();
        float float60 = orderProductBean58.getIVA();
        int int61 = orderProductBean58.getId_prodotto();
        ita.kangaroo.model.OrderProductBean orderProductBean62 = new ita.kangaroo.model.OrderProductBean();
        float float63 = orderProductBean62.getIVA();
        float float64 = orderProductBean62.getIVA();
        int int65 = orderProductBean62.getId_prodotto();
        ita.kangaroo.model.OrderProductBean orderProductBean66 = new ita.kangaroo.model.OrderProductBean();
        float float67 = orderProductBean66.getIVA();
        int int68 = orderProductBean66.getId_ordine();
        ita.kangaroo.model.OrderProductBean orderProductBean69 = new ita.kangaroo.model.OrderProductBean();
        float float70 = orderProductBean69.getIVA();
        float float71 = orderProductBean69.getIVA();
        orderProductBean69.setPrezzo(10.0f);
        orderProductBean69.setId_ordine((int) (short) 0);
        orderProductBean69.setIVA((-1.0f));
        ita.kangaroo.model.OrderProductBean[] orderProductBeanArray78 = new ita.kangaroo.model.OrderProductBean[] { orderProductBean0, orderProductBean5, orderProductBean8, orderProductBean14, orderProductBean19, orderProductBean23, orderProductBean27, orderProductBean31, orderProductBean36, orderProductBean37, orderProductBean46, orderProductBean54, orderProductBean58, orderProductBean62, orderProductBean66, orderProductBean69 };
        java.util.ArrayList<ita.kangaroo.model.OrderProductBean> orderProductBeanList79 = new java.util.ArrayList<ita.kangaroo.model.OrderProductBean>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<ita.kangaroo.model.OrderProductBean>) orderProductBeanList79, orderProductBeanArray78);
        ita.kangaroo.model.OrdineBean ordineBean81 = new ita.kangaroo.model.OrdineBean(orderProductBeanList79);
        ita.kangaroo.model.OrdineBean ordineBean82 = new ita.kangaroo.model.OrdineBean(orderProductBeanList79);
        java.lang.String str83 = ordineBean82.getNumero_di_tracking();
        ordineBean82.setDestinatario("ProdottoBean{id=32, descrizione='Data non disponibile', nome='Data non disponibile', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=32.0, quantita=32, iva=10.0, tipo=null}");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.0f + "'", float15 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.0f + "'", float18 == 0.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 0.0f + "'", float25 == 0.0f);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 0.0f + "'", float26 == 0.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 0.0f + "'", float28 == 0.0f);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 0.0f + "'", float29 == 0.0f);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 0.0f + "'", float30 == 0.0f);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 0.0f + "'", float32 == 0.0f);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 0.0f + "'", float33 == 0.0f);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 0.0f + "'", float35 == 0.0f);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + 0.0f + "'", float38 == 0.0f);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 0.0f + "'", float39 == 0.0f);
        org.junit.Assert.assertTrue("'" + float47 + "' != '" + 0.0f + "'", float47 == 0.0f);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + float55 + "' != '" + 0.0f + "'", float55 == 0.0f);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + float59 + "' != '" + 0.0f + "'", float59 == 0.0f);
        org.junit.Assert.assertTrue("'" + float60 + "' != '" + 0.0f + "'", float60 == 0.0f);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + float63 + "' != '" + 0.0f + "'", float63 == 0.0f);
        org.junit.Assert.assertTrue("'" + float64 + "' != '" + 0.0f + "'", float64 == 0.0f);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + float67 + "' != '" + 0.0f + "'", float67 == 0.0f);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + float70 + "' != '" + 0.0f + "'", float70 == 0.0f);
        org.junit.Assert.assertTrue("'" + float71 + "' != '" + 0.0f + "'", float71 == 0.0f);
        org.junit.Assert.assertNotNull(orderProductBeanArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNull(str83);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        ita.kangaroo.model.tipo tipo6 = null;
        ita.kangaroo.model.utenteBean utenteBean12 = new ita.kangaroo.model.utenteBean("", "", "", "", "Data non disponibile", tipo6, "hi!", "", "Data non disponibile", "Data non disponibile", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        java.sql.Date date20 = null;
        ita.kangaroo.model.OrdineBean ordineBean22 = new ita.kangaroo.model.OrdineBean((int) (byte) 10, utenteBean12, (float) 10, "", "", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "", "hi!", "hi!", date20, "Data non disponibile");
        ordineBean22.setIndirizzo_di_spedizione("Data non disponibile");
        java.lang.String str25 = ordineBean22.getIndirizzo_di_spedizione();
        float float26 = ordineBean22.getPrezzo_totale();
        float float27 = ordineBean22.getPrezzo_totale();
        ordineBean22.setDestinatario("ProdottoBean{id=10, descrizione='hi!', nome='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}");
        java.lang.String str30 = ordineBean22.getCircuito();
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Data non disponibile" + "'", str25, "Data non disponibile");
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 10.0f + "'", float26 == 10.0f);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 10.0f + "'", float27 == 10.0f);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}" + "'", str30, "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        ita.kangaroo.model.Cart cart0 = new ita.kangaroo.model.Cart();
        ita.kangaroo.model.tipo tipo8 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean9 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo8);
        int int10 = prodottoBean9.getId();
        java.lang.String str11 = prodottoBean9.getImmagine();
        cart0.removeProduct(prodottoBean9);
        ita.kangaroo.model.tipo tipo20 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean21 = new ita.kangaroo.model.ProdottoBean((int) (byte) 10, "hi!", "hi!", "Data non disponibile", (float) (byte) 10, 10, (float) ' ', tipo20);
        ita.kangaroo.model.CartProduct cartProduct22 = new ita.kangaroo.model.CartProduct(prodottoBean21);
        cart0.removeProduct(prodottoBean21);
        prodottoBean21.setImmagine("");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getDestinatario();
        java.lang.String str14 = ordineBean12.toString();
        ordineBean12.setPrezzo_totale(10.0f);
        java.sql.Date date17 = null;
        ordineBean12.setData(date17);
        java.lang.String str19 = ordineBean12.getIndirizzo_di_spedizione();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Data non disponibile" + "'", str14, "Data non disponibile");
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getDescrizione();
        java.lang.String str10 = prodottoBean8.getNome();
        prodottoBean8.setDescrizione("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        prodottoBean8.setImmagine("ProdottoBean{id=0, descrizione='', nome='', immagine='', prezzo=0.0, quantita=0, iva=0.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        ita.kangaroo.model.MetodoPagamentoBean metodoPagamentoBean0 = new ita.kangaroo.model.MetodoPagamentoBean();
        metodoPagamentoBean0.setId((int) 'a');
        ita.kangaroo.model.AddressBean addressBean3 = new ita.kangaroo.model.AddressBean();
        java.lang.String str4 = addressBean3.getVia();
        addressBean3.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        addressBean3.setCitta("hi!");
        boolean boolean9 = metodoPagamentoBean0.equals((java.lang.Object) addressBean3);
        java.lang.String str10 = metodoPagamentoBean0.getCvv();
        java.lang.String str11 = metodoPagamentoBean0.getCvv();
        metodoPagamentoBean0.setUsername("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        metodoPagamentoBean0.setUsername("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        metodoPagamentoBean0.setCircuito("");
        metodoPagamentoBean0.setNumero_carta("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='hi!', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        java.lang.String str20 = metodoPagamentoBean0.getNumero_carta();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='hi!', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}" + "'", str20, "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='hi!', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        ordineBean12.setNumero_carta("");
        java.sql.Date date16 = ordineBean12.getData();
        int int17 = ordineBean12.getId();
        ita.kangaroo.model.tipo tipo23 = null;
        ita.kangaroo.model.utenteBean utenteBean29 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo23, "hi!", "", "", "hi!", "");
        java.lang.String str30 = utenteBean29.getProvincia();
        java.lang.String str31 = utenteBean29.getCognome();
        ordineBean12.setClient(utenteBean29);
        java.lang.String str33 = utenteBean29.getCap();
        utenteBean29.setUsername("Data non disponibile");
        utenteBean29.setProvincia("Data non disponibile");
        java.lang.String str38 = utenteBean29.getVia();
        ita.kangaroo.model.OrdineBean ordineBean39 = new ita.kangaroo.model.OrdineBean(utenteBean29);
        java.lang.String str40 = ordineBean39.getCircuito();
        ita.kangaroo.model.utenteBean utenteBean41 = ordineBean39.getClient();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(utenteBean41);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        ita.kangaroo.model.AddressBean addressBean0 = new ita.kangaroo.model.AddressBean();
        java.lang.String str1 = addressBean0.getVia();
        java.lang.String str2 = addressBean0.getUsername();
        addressBean0.setUsername("hi!");
        addressBean0.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        addressBean0.setCitta("hi!");
        addressBean0.setId(32);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getDescrizione();
        prodottoBean8.setImmagine("");
        java.lang.String str12 = prodottoBean8.toString();
        prodottoBean8.setPrezzo(0.0f);
        ita.kangaroo.model.CartProduct cartProduct16 = new ita.kangaroo.model.CartProduct(prodottoBean8, (int) (short) -1);
        ita.kangaroo.model.ProdottoBean prodottoBean17 = cartProduct16.getProduct();
        cartProduct16.setQuantity((int) (byte) 100);
        ita.kangaroo.model.ProdottoBean prodottoBean20 = cartProduct16.getProduct();
        cartProduct16.setQuantity((int) (short) 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}" + "'", str12, "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        org.junit.Assert.assertNotNull(prodottoBean17);
        org.junit.Assert.assertNotNull(prodottoBean20);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        ita.kangaroo.model.MetodoPagamentoBean metodoPagamentoBean0 = new ita.kangaroo.model.MetodoPagamentoBean();
        metodoPagamentoBean0.setId((int) 'a');
        ita.kangaroo.model.AddressBean addressBean3 = new ita.kangaroo.model.AddressBean();
        java.lang.String str4 = addressBean3.getVia();
        addressBean3.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        addressBean3.setCitta("hi!");
        boolean boolean9 = metodoPagamentoBean0.equals((java.lang.Object) addressBean3);
        java.lang.String str10 = metodoPagamentoBean0.getNumero_carta();
        java.lang.String str11 = metodoPagamentoBean0.getNumero_carta();
        java.lang.String str12 = metodoPagamentoBean0.getNumero_carta();
        java.lang.String str13 = metodoPagamentoBean0.getNumero_carta();
        ita.kangaroo.model.OrderProductBean orderProductBean14 = new ita.kangaroo.model.OrderProductBean();
        float float15 = orderProductBean14.getIVA();
        orderProductBean14.setId_ordine(10);
        int int18 = orderProductBean14.getId_ordine();
        boolean boolean19 = metodoPagamentoBean0.equals((java.lang.Object) orderProductBean14);
        metodoPagamentoBean0.setId((int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.0f + "'", float15 == 0.0f);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        int int2 = orderProductBean0.getId_ordine();
        orderProductBean0.setQuantita((int) 'a');
        int int5 = orderProductBean0.getId_ordine();
        int int6 = orderProductBean0.getId_ordine();
        orderProductBean0.setId_prodotto(10);
        float float9 = orderProductBean0.getPrezzo();
        int int10 = orderProductBean0.getId_prodotto();
        orderProductBean0.setId_ordine((int) '4');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        ita.kangaroo.model.MetodoPagamentoBean metodoPagamentoBean0 = new ita.kangaroo.model.MetodoPagamentoBean();
        metodoPagamentoBean0.setId((int) (byte) 0);
        java.lang.String str3 = metodoPagamentoBean0.getCvv();
        java.lang.String str4 = metodoPagamentoBean0.getCvv();
        java.lang.String str5 = metodoPagamentoBean0.getData_scadenza();
        metodoPagamentoBean0.setCircuito("da39a3ee5e6b4b0d3255bfef95601890afd80709");
        java.lang.String str8 = metodoPagamentoBean0.getUsername();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 10, "hi!", "", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", (float) (-1), (int) (byte) 100, (float) (byte) 0, tipo7);
        prodottoBean8.setImmagine("ProdottoBean{id=0, descrizione='', nome='', immagine='', prezzo=0.0, quantita=0, iva=0.0, tipo=null}");
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        ita.kangaroo.model.tipo tipo6 = null;
        ita.kangaroo.model.utenteBean utenteBean12 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo6, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean13 = new ita.kangaroo.model.OrdineBean(utenteBean12);
        utenteBean12.setPassword("hi!");
        utenteBean12.setNome("hi!");
        java.sql.Date date25 = null;
        ita.kangaroo.model.OrdineBean ordineBean27 = new ita.kangaroo.model.OrdineBean((int) (byte) 100, utenteBean12, (float) (-1L), "hi!", "", "", "hi!", "Data non disponibile", "hi!", date25, "");
        ordineBean27.setIndirizzo_di_spedizione("Data non disponibile");
        java.lang.String str30 = ordineBean27.getDestinatario();
        ordineBean27.setCircuito("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        ita.kangaroo.model.utenteBean utenteBean33 = ordineBean27.getClient();
        utenteBean33.setTelefono("hi!");
        java.lang.String str36 = utenteBean33.getTelefono();
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(utenteBean33);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        utenteBean11.setEmail("hi!");
        utenteBean11.setPassword("hi!");
        utenteBean11.setProvincia("hi!");
        utenteBean11.setUsername("hi!");
        utenteBean11.setCognome("hi!");
        utenteBean11.setTelefono("");
        java.lang.String str24 = utenteBean11.getCap();
        java.lang.Class<?> wildcardClass25 = utenteBean11.getClass();
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        ita.kangaroo.model.AddressBean addressBean5 = new ita.kangaroo.model.AddressBean((int) ' ', "hi!", "", "", "ProdottoBean{id=10, descrizione='hi!', nome='', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}");
        addressBean5.setId((int) (byte) 0);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getImmagine();
        prodottoBean8.setPrezzo((float) (-1L));
        int int12 = prodottoBean8.getId();
        float float13 = prodottoBean8.getIva();
        java.lang.String str14 = prodottoBean8.getDescrizione();
        java.lang.String str15 = prodottoBean8.getDescrizione();
        java.lang.Class<?> wildcardClass16 = prodottoBean8.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        ita.kangaroo.model.AddressBean addressBean5 = new ita.kangaroo.model.AddressBean((int) '4', "ProdottoBean{id=10, descrizione='hi!', nome='', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}", "", "3a987acf8cbc1028b7dbc86bd086831151899a2b", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        java.lang.String str6 = addressBean5.getVia();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ProdottoBean{id=10, descrizione='hi!', nome='', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}" + "'", str6, "ProdottoBean{id=10, descrizione='hi!', nome='', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}");
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        ita.kangaroo.model.Cart cart0 = new ita.kangaroo.model.Cart();
        ita.kangaroo.model.tipo tipo8 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean9 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo8);
        java.lang.String str10 = prodottoBean9.getImmagine();
        prodottoBean9.setPrezzo((float) (-1L));
        int int13 = prodottoBean9.getId();
        prodottoBean9.setPrezzo(10.0f);
        prodottoBean9.setPrezzo(0.0f);
        prodottoBean9.setNome("Data non disponibile");
        cart0.changeQuantity(prodottoBean9, (int) '4');
        ita.kangaroo.model.tipo tipo29 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean30 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo29);
        java.lang.String str31 = prodottoBean30.getImmagine();
        prodottoBean30.setPrezzo((float) (-1L));
        int int34 = prodottoBean30.getId();
        float float35 = prodottoBean30.getIva();
        prodottoBean30.setQuantita((int) ' ');
        ita.kangaroo.model.tipo tipo38 = prodottoBean30.getTipo();
        cart0.changeQuantity(prodottoBean30, (int) (short) 100);
        ita.kangaroo.model.CartProduct cartProduct42 = new ita.kangaroo.model.CartProduct(prodottoBean30, (-1));
        ita.kangaroo.model.ProdottoBean prodottoBean43 = cartProduct42.getProduct();
        prodottoBean43.setId(1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 1.0f + "'", float35 == 1.0f);
        org.junit.Assert.assertNull(tipo38);
        org.junit.Assert.assertNotNull(prodottoBean43);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        utenteBean11.setEmail("hi!");
        utenteBean11.setPassword("hi!");
        java.lang.String str16 = utenteBean11.getCognome();
        utenteBean11.setProvincia("Data non disponibile");
        java.lang.String str19 = utenteBean11.getEmail();
        utenteBean11.setNome("ProdottoBean{id=10, descrizione='hi!', nome='', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) -1, "", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "Data non disponibile", 100.0f, 0, (float) (byte) 100, tipo7);
        prodottoBean8.setQuantita((int) (short) -1);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        utenteBean11.setEmail("hi!");
        utenteBean11.setPassword("hi!");
        ita.kangaroo.model.tipo tipo16 = null;
        utenteBean11.setTipo(tipo16);
        java.lang.String str18 = utenteBean11.getCitta();
        java.lang.String str19 = utenteBean11.getCognome();
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        ordineBean12.setNumero_carta("");
        java.sql.Date date16 = ordineBean12.getData();
        ordineBean12.setMetodo_di_pagamento("");
        ordineBean12.setNumero_di_tracking("");
        ordineBean12.setNumero_di_tracking("hi!");
        ita.kangaroo.model.tipo tipo29 = null;
        ita.kangaroo.model.utenteBean utenteBean35 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo29, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean36 = new ita.kangaroo.model.OrdineBean(utenteBean35);
        java.lang.String str37 = ordineBean36.getMetodo_di_spedizione();
        ita.kangaroo.model.tipo tipo43 = null;
        ita.kangaroo.model.utenteBean utenteBean49 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo43, "hi!", "", "", "hi!", "");
        utenteBean49.setEmail("hi!");
        ordineBean36.setClient(utenteBean49);
        utenteBean49.setCitta("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        java.sql.Date date62 = null;
        ita.kangaroo.model.OrdineBean ordineBean64 = new ita.kangaroo.model.OrdineBean((-1), utenteBean49, 1.0f, "hi!", "", "hi!", "hi!", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "hi!", date62, "");
        ordineBean64.setDestinatario("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        java.util.ArrayList<ita.kangaroo.model.OrderProductBean> orderProductBeanList67 = ordineBean64.getProducts();
        ordineBean12.setProducts(orderProductBeanList67);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(orderProductBeanList67);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        float float2 = orderProductBean0.getIVA();
        orderProductBean0.setPrezzo(10.0f);
        orderProductBean0.setQuantita((int) (short) -1);
        int int7 = orderProductBean0.getQuantita();
        orderProductBean0.setId_ordine((int) 'a');
        orderProductBean0.setId_prodotto((int) '#');
        int int12 = orderProductBean0.getQuantita();
        int int13 = orderProductBean0.getId_ordine();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        ita.kangaroo.model.MetodoPagamentoBean metodoPagamentoBean0 = new ita.kangaroo.model.MetodoPagamentoBean();
        metodoPagamentoBean0.setId((int) 'a');
        ita.kangaroo.model.AddressBean addressBean3 = new ita.kangaroo.model.AddressBean();
        java.lang.String str4 = addressBean3.getVia();
        addressBean3.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        addressBean3.setCitta("hi!");
        boolean boolean9 = metodoPagamentoBean0.equals((java.lang.Object) addressBean3);
        java.lang.Object obj10 = null;
        boolean boolean11 = metodoPagamentoBean0.equals(obj10);
        java.lang.String str12 = metodoPagamentoBean0.getCvv();
        ita.kangaroo.model.tipo tipo18 = null;
        ita.kangaroo.model.utenteBean utenteBean24 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo18, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean25 = new ita.kangaroo.model.OrdineBean(utenteBean24);
        ita.kangaroo.model.tipo tipo31 = null;
        ita.kangaroo.model.utenteBean utenteBean37 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo31, "hi!", "", "", "hi!", "");
        utenteBean37.setEmail("hi!");
        utenteBean37.setPassword("hi!");
        java.lang.String str42 = utenteBean37.getCognome();
        ordineBean25.setClient(utenteBean37);
        java.util.ArrayList<ita.kangaroo.model.OrderProductBean> orderProductBeanList44 = ordineBean25.getProducts();
        java.lang.String str45 = ordineBean25.getDestinatario();
        boolean boolean46 = metodoPagamentoBean0.equals((java.lang.Object) str45);
        metodoPagamentoBean0.setNumero_carta("Data non disponibile");
        metodoPagamentoBean0.setData_scadenza("ProdottoBean{id=10, descrizione='hi!', nome='', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(orderProductBeanList44);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        ita.kangaroo.model.MetodoPagamentoBean metodoPagamentoBean0 = new ita.kangaroo.model.MetodoPagamentoBean();
        metodoPagamentoBean0.setId((int) 'a');
        ita.kangaroo.model.AddressBean addressBean3 = new ita.kangaroo.model.AddressBean();
        java.lang.String str4 = addressBean3.getVia();
        addressBean3.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        addressBean3.setCitta("hi!");
        boolean boolean9 = metodoPagamentoBean0.equals((java.lang.Object) addressBean3);
        java.lang.String str10 = metodoPagamentoBean0.getNumero_carta();
        java.lang.String str11 = metodoPagamentoBean0.getUsername();
        metodoPagamentoBean0.setData_scadenza("hi!");
        metodoPagamentoBean0.setCircuito("ProdottoBean{id=10, descrizione='hi!', nome='', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}");
        metodoPagamentoBean0.setData_scadenza("da39a3ee5e6b4b0d3255bfef95601890afd80709");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        utenteBean11.setEmail("hi!");
        utenteBean11.setPassword("hi!");
        java.lang.String str16 = utenteBean11.getCognome();
        java.lang.String str17 = utenteBean11.getUsername();
        java.lang.String str18 = utenteBean11.getUsername();
        utenteBean11.setPassword("ProdottoBean{id=32, descrizione='Data non disponibile', nome='Data non disponibile', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=32.0, quantita=32, iva=10.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        ita.kangaroo.model.tipo tipo6 = null;
        ita.kangaroo.model.utenteBean utenteBean12 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo6, "hi!", "", "", "hi!", "");
        java.lang.String str13 = utenteBean12.getUsername();
        java.lang.String str14 = utenteBean12.getCap();
        utenteBean12.setUsername("");
        ita.kangaroo.model.OrdineBean ordineBean17 = new ita.kangaroo.model.OrdineBean(utenteBean12);
        java.lang.String str18 = utenteBean12.getPassword();
        java.lang.String str19 = utenteBean12.getCap();
        java.sql.Date date27 = null;
        ita.kangaroo.model.OrdineBean ordineBean29 = new ita.kangaroo.model.OrdineBean((int) (byte) 10, utenteBean12, (float) (-1), "3d1583397bcebff274b1e7cb58087c39153af974", "", "3a987acf8cbc1028b7dbc86bd086831151899a2b", "3d1583397bcebff274b1e7cb58087c39153af974", "ProdottoBean{id=10, descrizione='hi!', nome='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}", "3d1583397bcebff274b1e7cb58087c39153af974", date27, "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        int int2 = orderProductBean0.getId_ordine();
        orderProductBean0.setQuantita((int) 'a');
        float float5 = orderProductBean0.getIVA();
        float float6 = orderProductBean0.getIVA();
        float float7 = orderProductBean0.getIVA();
        orderProductBean0.setPrezzo(97.0f);
        orderProductBean0.setIVA((float) 32);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        ita.kangaroo.model.AddressBean addressBean0 = new ita.kangaroo.model.AddressBean();
        java.lang.String str1 = addressBean0.getVia();
        java.lang.String str2 = addressBean0.getUsername();
        addressBean0.setUsername("hi!");
        addressBean0.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        addressBean0.setCitta("hi!");
        addressBean0.setUsername("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        java.lang.String str11 = addressBean0.getCAP();
        int int12 = addressBean0.getId();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        ita.kangaroo.model.AddressBean addressBean0 = new ita.kangaroo.model.AddressBean();
        java.lang.String str1 = addressBean0.getVia();
        java.lang.String str2 = addressBean0.getUsername();
        addressBean0.setUsername("hi!");
        ita.kangaroo.model.tipo tipo10 = null;
        ita.kangaroo.model.utenteBean utenteBean16 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo10, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean17 = new ita.kangaroo.model.OrdineBean(utenteBean16);
        java.lang.String str18 = ordineBean17.getMetodo_di_spedizione();
        ita.kangaroo.model.tipo tipo24 = null;
        ita.kangaroo.model.utenteBean utenteBean30 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo24, "hi!", "", "", "hi!", "");
        utenteBean30.setEmail("hi!");
        ordineBean17.setClient(utenteBean30);
        ordineBean17.setNumero_carta("");
        ordineBean17.setMetodo_di_pagamento("hi!");
        java.util.ArrayList<ita.kangaroo.model.OrderProductBean> orderProductBeanList38 = null;
        ordineBean17.setProducts(orderProductBeanList38);
        boolean boolean40 = addressBean0.equals((java.lang.Object) orderProductBeanList38);
        java.lang.String str41 = addressBean0.getCitta();
        java.lang.String str42 = addressBean0.getCitta();
        ita.kangaroo.model.tipo tipo48 = null;
        ita.kangaroo.model.utenteBean utenteBean54 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo48, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean55 = new ita.kangaroo.model.OrdineBean(utenteBean54);
        java.lang.String str56 = ordineBean55.getMetodo_di_spedizione();
        ordineBean55.setNumero_carta("");
        java.sql.Date date59 = ordineBean55.getData();
        ordineBean55.setMetodo_di_pagamento("");
        ordineBean55.setNumero_di_tracking("");
        ordineBean55.setCircuito("hi!");
        int int66 = ordineBean55.getId();
        ita.kangaroo.model.tipo tipo72 = null;
        ita.kangaroo.model.utenteBean utenteBean78 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo72, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean79 = new ita.kangaroo.model.OrdineBean(utenteBean78);
        utenteBean78.setPassword("hi!");
        utenteBean78.setNome("hi!");
        ordineBean55.setClient(utenteBean78);
        boolean boolean85 = addressBean0.equals((java.lang.Object) utenteBean78);
        utenteBean78.setUsername("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='hi!', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        java.lang.String str88 = utenteBean78.getCognome();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNull(date59);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "", "", "hi!", "hi!", "hi!");
        java.lang.String str12 = utenteBean11.getUsername();
        utenteBean11.setCap("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        ita.kangaroo.model.OrdineBean ordineBean15 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str16 = ordineBean15.toString();
        java.lang.String str17 = ordineBean15.toString();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Data non disponibile" + "'", str16, "Data non disponibile");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Data non disponibile" + "'", str17, "Data non disponibile");
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        ita.kangaroo.model.MetodoPagamentoBean metodoPagamentoBean0 = new ita.kangaroo.model.MetodoPagamentoBean();
        metodoPagamentoBean0.setId((int) 'a');
        metodoPagamentoBean0.setCircuito("");
        java.lang.String str5 = metodoPagamentoBean0.getCircuito();
        metodoPagamentoBean0.setId((int) (byte) 0);
        java.lang.String str8 = metodoPagamentoBean0.getCircuito();
        java.lang.String str9 = metodoPagamentoBean0.getUsername();
        metodoPagamentoBean0.setCvv("ProdottoBean{id=0, descrizione='', nome='', immagine='', prezzo=0.0, quantita=0, iva=0.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        utenteBean11.setEmail("hi!");
        utenteBean11.setPassword("hi!");
        utenteBean11.setProvincia("hi!");
        utenteBean11.setUsername("hi!");
        java.lang.String str20 = utenteBean11.getTelefono();
        java.lang.String str21 = utenteBean11.getNome();
        java.lang.String str22 = utenteBean11.getEmail();
        ita.kangaroo.model.OrdineBean ordineBean23 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        ita.kangaroo.model.AddressBean addressBean5 = new ita.kangaroo.model.AddressBean(100, "Data non disponibile", "Data non disponibile", "Data non disponibile", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        int int6 = addressBean5.getId();
        int int7 = addressBean5.getId();
        java.lang.String str8 = addressBean5.getCAP();
        addressBean5.setCAP("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        addressBean5.setId(35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Data non disponibile" + "'", str8, "Data non disponibile");
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        ita.kangaroo.model.MetodoPagamentoBean metodoPagamentoBean0 = new ita.kangaroo.model.MetodoPagamentoBean();
        metodoPagamentoBean0.setId((int) (byte) 0);
        java.lang.String str3 = metodoPagamentoBean0.getCvv();
        ita.kangaroo.model.AddressBean addressBean4 = new ita.kangaroo.model.AddressBean();
        java.lang.String str5 = addressBean4.getVia();
        java.lang.String str6 = addressBean4.getUsername();
        addressBean4.setUsername("hi!");
        addressBean4.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        boolean boolean12 = addressBean4.equals((java.lang.Object) 10L);
        addressBean4.setUsername("hi!");
        addressBean4.setCitta("");
        boolean boolean17 = metodoPagamentoBean0.equals((java.lang.Object) addressBean4);
        java.lang.String str18 = metodoPagamentoBean0.getNumero_carta();
        metodoPagamentoBean0.setCvv("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getDestinatario();
        java.lang.String str14 = ordineBean12.toString();
        ordineBean12.setPrezzo_totale(10.0f);
        java.sql.Date date17 = null;
        ordineBean12.setData(date17);
        java.lang.String str19 = ordineBean12.getMetodo_di_pagamento();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Data non disponibile" + "'", str14, "Data non disponibile");
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getImmagine();
        prodottoBean8.setPrezzo((float) (-1L));
        int int12 = prodottoBean8.getId();
        prodottoBean8.setPrezzo((float) (-1));
        ita.kangaroo.model.tipo tipo15 = null;
        prodottoBean8.setTipo(tipo15);
        int int17 = prodottoBean8.getQuantita();
        ita.kangaroo.model.CartProduct cartProduct19 = new ita.kangaroo.model.CartProduct(prodottoBean8, 32);
        prodottoBean8.setIva((float) '4');
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        ordineBean12.setNumero_carta("");
        java.lang.String str16 = ordineBean12.getIndirizzo_di_spedizione();
        java.sql.Date date17 = null;
        ordineBean12.setData(date17);
        java.lang.String str19 = ordineBean12.getIndirizzo_di_spedizione();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        int int2 = orderProductBean0.getId_ordine();
        orderProductBean0.setQuantita((int) 'a');
        int int5 = orderProductBean0.getId_prodotto();
        orderProductBean0.setQuantita((int) (short) 10);
        int int8 = orderProductBean0.getId_ordine();
        int int9 = orderProductBean0.getId_prodotto();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        ita.kangaroo.model.tipo tipo6 = null;
        ita.kangaroo.model.utenteBean utenteBean12 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo6, "hi!", "", "", "hi!", "");
        utenteBean12.setEmail("hi!");
        java.lang.String str15 = utenteBean12.getCognome();
        java.sql.Date date23 = null;
        ita.kangaroo.model.OrdineBean ordineBean25 = new ita.kangaroo.model.OrdineBean((int) (byte) 10, utenteBean12, (float) (-1L), "Data non disponibile", "Data non disponibile", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "hi!", "hi!", "", date23, "Data non disponibile");
        java.lang.String str26 = ordineBean25.toString();
        java.sql.Date date27 = ordineBean25.getData();
        java.lang.String str28 = ordineBean25.getIndirizzo_di_spedizione();
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Data non disponibile" + "'", str26, "Data non disponibile");
        org.junit.Assert.assertNull(date27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        ita.kangaroo.model.MetodoPagamentoBean metodoPagamentoBean0 = new ita.kangaroo.model.MetodoPagamentoBean();
        metodoPagamentoBean0.setId((int) 'a');
        ita.kangaroo.model.AddressBean addressBean3 = new ita.kangaroo.model.AddressBean();
        java.lang.String str4 = addressBean3.getVia();
        addressBean3.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        addressBean3.setCitta("hi!");
        boolean boolean9 = metodoPagamentoBean0.equals((java.lang.Object) addressBean3);
        java.lang.String str10 = metodoPagamentoBean0.getNumero_carta();
        java.lang.String str11 = metodoPagamentoBean0.getNumero_carta();
        metodoPagamentoBean0.setCvv("");
        metodoPagamentoBean0.setId(0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        ita.kangaroo.model.tipo tipo19 = null;
        ita.kangaroo.model.utenteBean utenteBean25 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo19, "hi!", "", "", "hi!", "");
        utenteBean25.setEmail("hi!");
        ordineBean12.setClient(utenteBean25);
        ordineBean12.setNumero_carta("");
        ordineBean12.setMetodo_di_pagamento("hi!");
        java.util.ArrayList<ita.kangaroo.model.OrderProductBean> orderProductBeanList33 = null;
        ordineBean12.setProducts(orderProductBeanList33);
        java.sql.Date date35 = null;
        ordineBean12.setData(date35);
        java.sql.Date date37 = ordineBean12.getData();
        ordineBean12.setMetodo_di_spedizione("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        ordineBean12.setMetodo_di_spedizione("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        float float42 = ordineBean12.getPrezzo_totale();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(date37);
        org.junit.Assert.assertTrue("'" + float42 + "' != '" + 0.0f + "'", float42 == 0.0f);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        ita.kangaroo.model.Cart cart0 = new ita.kangaroo.model.Cart();
        ita.kangaroo.model.tipo tipo8 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean9 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo8);
        int int10 = prodottoBean9.getId();
        java.lang.String str11 = prodottoBean9.getImmagine();
        cart0.removeProduct(prodottoBean9);
        ita.kangaroo.model.tipo tipo20 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean21 = new ita.kangaroo.model.ProdottoBean((int) (byte) 10, "hi!", "hi!", "Data non disponibile", (float) (byte) 10, 10, (float) ' ', tipo20);
        ita.kangaroo.model.CartProduct cartProduct22 = new ita.kangaroo.model.CartProduct(prodottoBean21);
        cart0.removeProduct(prodottoBean21);
        ita.kangaroo.model.ProdottoBean prodottoBean24 = null;
        cart0.addProduct(prodottoBean24);
        ita.kangaroo.model.tipo tipo33 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean34 = new ita.kangaroo.model.ProdottoBean((int) 'a', "", "hi!", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", (float) 1L, (int) (short) 1, (float) (short) 1, tipo33);
        cart0.removeProduct(prodottoBean34);
        ita.kangaroo.model.tipo tipo43 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean44 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo43);
        java.lang.String str45 = prodottoBean44.getImmagine();
        int int46 = prodottoBean44.getQuantita();
        java.lang.String str47 = prodottoBean44.getImmagine();
        ita.kangaroo.model.CartProduct cartProduct48 = new ita.kangaroo.model.CartProduct(prodottoBean44);
        prodottoBean44.setId((int) (short) 0);
        cart0.addProduct(prodottoBean44);
        ita.kangaroo.model.CartProduct cartProduct52 = new ita.kangaroo.model.CartProduct(prodottoBean44);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        float float2 = orderProductBean0.getIVA();
        int int3 = orderProductBean0.getId_prodotto();
        float float4 = orderProductBean0.getPrezzo();
        ita.kangaroo.model.OrderProductBean orderProductBean5 = new ita.kangaroo.model.OrderProductBean();
        float float6 = orderProductBean5.getIVA();
        float float7 = orderProductBean5.getIVA();
        ita.kangaroo.model.OrderProductBean orderProductBean8 = new ita.kangaroo.model.OrderProductBean();
        float float9 = orderProductBean8.getIVA();
        orderProductBean8.setQuantita((int) (byte) 100);
        orderProductBean8.setPrezzo((float) (-1));
        ita.kangaroo.model.OrderProductBean orderProductBean14 = new ita.kangaroo.model.OrderProductBean();
        float float15 = orderProductBean14.getIVA();
        float float16 = orderProductBean14.getIVA();
        int int17 = orderProductBean14.getId_prodotto();
        float float18 = orderProductBean14.getPrezzo();
        ita.kangaroo.model.OrderProductBean orderProductBean19 = new ita.kangaroo.model.OrderProductBean();
        float float20 = orderProductBean19.getIVA();
        orderProductBean19.setQuantita((int) (byte) 100);
        ita.kangaroo.model.OrderProductBean orderProductBean23 = new ita.kangaroo.model.OrderProductBean();
        float float24 = orderProductBean23.getIVA();
        float float25 = orderProductBean23.getIVA();
        float float26 = orderProductBean23.getPrezzo();
        ita.kangaroo.model.OrderProductBean orderProductBean27 = new ita.kangaroo.model.OrderProductBean();
        float float28 = orderProductBean27.getIVA();
        float float29 = orderProductBean27.getIVA();
        float float30 = orderProductBean27.getPrezzo();
        ita.kangaroo.model.OrderProductBean orderProductBean31 = new ita.kangaroo.model.OrderProductBean();
        float float32 = orderProductBean31.getIVA();
        float float33 = orderProductBean31.getIVA();
        int int34 = orderProductBean31.getId_prodotto();
        float float35 = orderProductBean31.getPrezzo();
        ita.kangaroo.model.OrderProductBean orderProductBean36 = new ita.kangaroo.model.OrderProductBean();
        ita.kangaroo.model.OrderProductBean orderProductBean37 = new ita.kangaroo.model.OrderProductBean();
        float float38 = orderProductBean37.getIVA();
        float float39 = orderProductBean37.getIVA();
        orderProductBean37.setPrezzo(10.0f);
        orderProductBean37.setId_ordine((int) (short) 0);
        orderProductBean37.setIVA((-1.0f));
        ita.kangaroo.model.OrderProductBean orderProductBean46 = new ita.kangaroo.model.OrderProductBean();
        float float47 = orderProductBean46.getIVA();
        int int48 = orderProductBean46.getId_ordine();
        orderProductBean46.setQuantita((int) 'a');
        int int51 = orderProductBean46.getId_ordine();
        orderProductBean46.setId_ordine(100);
        ita.kangaroo.model.OrderProductBean orderProductBean54 = new ita.kangaroo.model.OrderProductBean();
        float float55 = orderProductBean54.getIVA();
        int int56 = orderProductBean54.getId_ordine();
        int int57 = orderProductBean54.getQuantita();
        ita.kangaroo.model.OrderProductBean orderProductBean58 = new ita.kangaroo.model.OrderProductBean();
        float float59 = orderProductBean58.getIVA();
        float float60 = orderProductBean58.getIVA();
        int int61 = orderProductBean58.getId_prodotto();
        ita.kangaroo.model.OrderProductBean orderProductBean62 = new ita.kangaroo.model.OrderProductBean();
        float float63 = orderProductBean62.getIVA();
        float float64 = orderProductBean62.getIVA();
        int int65 = orderProductBean62.getId_prodotto();
        ita.kangaroo.model.OrderProductBean orderProductBean66 = new ita.kangaroo.model.OrderProductBean();
        float float67 = orderProductBean66.getIVA();
        int int68 = orderProductBean66.getId_ordine();
        ita.kangaroo.model.OrderProductBean orderProductBean69 = new ita.kangaroo.model.OrderProductBean();
        float float70 = orderProductBean69.getIVA();
        float float71 = orderProductBean69.getIVA();
        orderProductBean69.setPrezzo(10.0f);
        orderProductBean69.setId_ordine((int) (short) 0);
        orderProductBean69.setIVA((-1.0f));
        ita.kangaroo.model.OrderProductBean[] orderProductBeanArray78 = new ita.kangaroo.model.OrderProductBean[] { orderProductBean0, orderProductBean5, orderProductBean8, orderProductBean14, orderProductBean19, orderProductBean23, orderProductBean27, orderProductBean31, orderProductBean36, orderProductBean37, orderProductBean46, orderProductBean54, orderProductBean58, orderProductBean62, orderProductBean66, orderProductBean69 };
        java.util.ArrayList<ita.kangaroo.model.OrderProductBean> orderProductBeanList79 = new java.util.ArrayList<ita.kangaroo.model.OrderProductBean>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<ita.kangaroo.model.OrderProductBean>) orderProductBeanList79, orderProductBeanArray78);
        ita.kangaroo.model.OrdineBean ordineBean81 = new ita.kangaroo.model.OrdineBean(orderProductBeanList79);
        java.sql.Date date82 = ordineBean81.getData();
        ordineBean81.setMetodo_di_spedizione("ProdottoBean{id=10, descrizione='hi!', nome='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.0f + "'", float15 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.0f + "'", float18 == 0.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 0.0f + "'", float25 == 0.0f);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 0.0f + "'", float26 == 0.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 0.0f + "'", float28 == 0.0f);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 0.0f + "'", float29 == 0.0f);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 0.0f + "'", float30 == 0.0f);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 0.0f + "'", float32 == 0.0f);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 0.0f + "'", float33 == 0.0f);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 0.0f + "'", float35 == 0.0f);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + 0.0f + "'", float38 == 0.0f);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 0.0f + "'", float39 == 0.0f);
        org.junit.Assert.assertTrue("'" + float47 + "' != '" + 0.0f + "'", float47 == 0.0f);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + float55 + "' != '" + 0.0f + "'", float55 == 0.0f);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + float59 + "' != '" + 0.0f + "'", float59 == 0.0f);
        org.junit.Assert.assertTrue("'" + float60 + "' != '" + 0.0f + "'", float60 == 0.0f);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + float63 + "' != '" + 0.0f + "'", float63 == 0.0f);
        org.junit.Assert.assertTrue("'" + float64 + "' != '" + 0.0f + "'", float64 == 0.0f);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + float67 + "' != '" + 0.0f + "'", float67 == 0.0f);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + float70 + "' != '" + 0.0f + "'", float70 == 0.0f);
        org.junit.Assert.assertTrue("'" + float71 + "' != '" + 0.0f + "'", float71 == 0.0f);
        org.junit.Assert.assertNotNull(orderProductBeanArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNull(date82);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        ita.kangaroo.model.Cart cart0 = new ita.kangaroo.model.Cart();
        ita.kangaroo.model.tipo tipo8 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean9 = new ita.kangaroo.model.ProdottoBean((int) (byte) -1, "Data non disponibile", "Data non disponibile", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", (float) ' ', (int) ' ', (float) ' ', tipo8);
        ita.kangaroo.model.CartProduct cartProduct10 = new ita.kangaroo.model.CartProduct(prodottoBean9);
        cart0.changeQuantity(prodottoBean9, 0);
        java.lang.String str13 = prodottoBean9.getImmagine();
        java.lang.String str14 = prodottoBean9.getImmagine();
        prodottoBean9.setPrezzo((float) (byte) 0);
        int int17 = prodottoBean9.getId();
        prodottoBean9.setId((int) 'a');
        java.lang.String str20 = prodottoBean9.getImmagine();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}" + "'", str13, "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}" + "'", str14, "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}" + "'", str20, "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        ita.kangaroo.model.AddressBean addressBean0 = new ita.kangaroo.model.AddressBean();
        java.lang.String str1 = addressBean0.getVia();
        java.lang.String str2 = addressBean0.getUsername();
        addressBean0.setUsername("hi!");
        addressBean0.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        boolean boolean8 = addressBean0.equals((java.lang.Object) 10L);
        int int9 = addressBean0.getId();
        java.lang.String str10 = addressBean0.getUsername();
        java.lang.String str11 = addressBean0.getUsername();
        addressBean0.setCitta("3a987acf8cbc1028b7dbc86bd086831151899a2b");
        java.lang.String str14 = addressBean0.getVia();
        addressBean0.setUsername("ProdottoBean{id=10, descrizione='hi!', nome='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}" + "'", str14, "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) -1, "Data non disponibile", "Data non disponibile", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", (float) ' ', (int) ' ', (float) ' ', tipo7);
        ita.kangaroo.model.CartProduct cartProduct9 = new ita.kangaroo.model.CartProduct(prodottoBean8);
        int int10 = prodottoBean8.getQuantita();
        prodottoBean8.setIva((float) (short) 10);
        prodottoBean8.setId((int) ' ');
        prodottoBean8.setDescrizione("");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        ita.kangaroo.model.tipo tipo19 = null;
        ita.kangaroo.model.utenteBean utenteBean25 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo19, "hi!", "", "", "hi!", "");
        utenteBean25.setEmail("hi!");
        ordineBean12.setClient(utenteBean25);
        ordineBean12.setNumero_carta("");
        ordineBean12.setMetodo_di_pagamento("hi!");
        java.util.ArrayList<ita.kangaroo.model.OrderProductBean> orderProductBeanList33 = null;
        ordineBean12.setProducts(orderProductBeanList33);
        java.lang.String str35 = ordineBean12.getDestinatario();
        java.lang.String str36 = ordineBean12.getCircuito();
        java.util.ArrayList<ita.kangaroo.model.OrderProductBean> orderProductBeanList37 = ordineBean12.getProducts();
        java.lang.String str38 = ordineBean12.getIndirizzo_di_spedizione();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(orderProductBeanList37);
        org.junit.Assert.assertNull(str38);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        ita.kangaroo.model.utenteBean utenteBean1 = new ita.kangaroo.model.utenteBean();
        java.lang.String str2 = utenteBean1.getPassword();
        java.sql.Date date10 = null;
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(0, utenteBean1, (float) (short) -1, "Data non disponibile", "", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "Data non disponibile", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", date10, "");
        utenteBean1.setTelefono("");
        java.lang.String str15 = utenteBean1.getCap();
        utenteBean1.setProvincia("3a987acf8cbc1028b7dbc86bd086831151899a2b");
        utenteBean1.setNome("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        utenteBean11.setEmail("hi!");
        utenteBean11.setPassword("hi!");
        ita.kangaroo.model.tipo tipo16 = null;
        utenteBean11.setTipo(tipo16);
        utenteBean11.setCitta("Data non disponibile");
        java.lang.String str20 = utenteBean11.getTelefono();
        utenteBean11.setCognome("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='hi!', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        ita.kangaroo.model.AddressBean addressBean0 = new ita.kangaroo.model.AddressBean();
        java.lang.String str1 = addressBean0.getVia();
        java.lang.String str2 = addressBean0.getUsername();
        addressBean0.setUsername("hi!");
        ita.kangaroo.model.tipo tipo10 = null;
        ita.kangaroo.model.utenteBean utenteBean16 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo10, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean17 = new ita.kangaroo.model.OrdineBean(utenteBean16);
        java.lang.String str18 = ordineBean17.getMetodo_di_spedizione();
        ita.kangaroo.model.tipo tipo24 = null;
        ita.kangaroo.model.utenteBean utenteBean30 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo24, "hi!", "", "", "hi!", "");
        utenteBean30.setEmail("hi!");
        ordineBean17.setClient(utenteBean30);
        ordineBean17.setNumero_carta("");
        ordineBean17.setMetodo_di_pagamento("hi!");
        java.util.ArrayList<ita.kangaroo.model.OrderProductBean> orderProductBeanList38 = null;
        ordineBean17.setProducts(orderProductBeanList38);
        boolean boolean40 = addressBean0.equals((java.lang.Object) orderProductBeanList38);
        addressBean0.setCAP("");
        addressBean0.setId((int) (short) 100);
        addressBean0.setVia("ProdottoBean{id=10, descrizione='hi!', nome='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}");
        java.lang.String str47 = addressBean0.getUsername();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 10, "hi!", "", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", (float) (-1), (int) (byte) 100, (float) (byte) 0, tipo7);
        float float9 = prodottoBean8.getIva();
        prodottoBean8.setQuantita(100);
        float float12 = prodottoBean8.getIva();
        float float13 = prodottoBean8.getPrezzo();
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-1.0f) + "'", float13 == (-1.0f));
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        ita.kangaroo.model.Cart cart0 = new ita.kangaroo.model.Cart();
        ita.kangaroo.model.tipo tipo8 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean9 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo8);
        int int10 = prodottoBean9.getId();
        java.lang.String str11 = prodottoBean9.getImmagine();
        cart0.removeProduct(prodottoBean9);
        ita.kangaroo.model.tipo tipo20 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean21 = new ita.kangaroo.model.ProdottoBean((int) (byte) 10, "hi!", "hi!", "Data non disponibile", (float) (byte) 10, 10, (float) ' ', tipo20);
        ita.kangaroo.model.CartProduct cartProduct22 = new ita.kangaroo.model.CartProduct(prodottoBean21);
        cart0.removeProduct(prodottoBean21);
        ita.kangaroo.model.ProdottoBean prodottoBean24 = null;
        cart0.addProduct(prodottoBean24);
        ita.kangaroo.model.tipo tipo33 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean34 = new ita.kangaroo.model.ProdottoBean((int) 'a', "", "hi!", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", (float) 1L, (int) (short) 1, (float) (short) 1, tipo33);
        cart0.removeProduct(prodottoBean34);
        ita.kangaroo.model.tipo tipo43 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean44 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo43);
        java.lang.String str45 = prodottoBean44.getImmagine();
        int int46 = prodottoBean44.getQuantita();
        java.lang.String str47 = prodottoBean44.getImmagine();
        ita.kangaroo.model.CartProduct cartProduct48 = new ita.kangaroo.model.CartProduct(prodottoBean44);
        prodottoBean44.setId((int) (short) 0);
        cart0.addProduct(prodottoBean44);
        ita.kangaroo.model.Cart cart52 = new ita.kangaroo.model.Cart();
        ita.kangaroo.model.tipo tipo60 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean61 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo60);
        int int62 = prodottoBean61.getId();
        java.lang.String str63 = prodottoBean61.getImmagine();
        cart52.removeProduct(prodottoBean61);
        cart0.removeProduct(prodottoBean61);
        prodottoBean61.setImmagine("Data non disponibile");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getDescrizione();
        java.lang.String str10 = prodottoBean8.getNome();
        ita.kangaroo.model.CartProduct cartProduct11 = new ita.kangaroo.model.CartProduct(prodottoBean8);
        prodottoBean8.setPrezzo((float) (byte) 0);
        ita.kangaroo.model.CartProduct cartProduct15 = new ita.kangaroo.model.CartProduct(prodottoBean8, 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        ita.kangaroo.model.Cart cart0 = new ita.kangaroo.model.Cart();
        ita.kangaroo.model.tipo tipo8 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean9 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo8);
        int int10 = prodottoBean9.getId();
        java.lang.String str11 = prodottoBean9.getImmagine();
        cart0.removeProduct(prodottoBean9);
        ita.kangaroo.model.tipo tipo13 = prodottoBean9.getTipo();
        java.lang.String str14 = prodottoBean9.getImmagine();
        java.lang.Class<?> wildcardClass15 = prodottoBean9.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(tipo13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getDescrizione();
        java.lang.String str10 = prodottoBean8.getNome();
        int int11 = prodottoBean8.getQuantita();
        prodottoBean8.setDescrizione("hi!");
        float float14 = prodottoBean8.getIva();
        int int15 = prodottoBean8.getQuantita();
        java.lang.String str16 = prodottoBean8.getDescrizione();
        prodottoBean8.setNome("ProdottoBean{id=10, descrizione='hi!', nome='', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        ita.kangaroo.model.tipo tipo19 = null;
        ita.kangaroo.model.utenteBean utenteBean25 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo19, "hi!", "", "", "hi!", "");
        utenteBean25.setEmail("hi!");
        ordineBean12.setClient(utenteBean25);
        ita.kangaroo.model.utenteBean utenteBean29 = ordineBean12.getClient();
        ita.kangaroo.model.tipo tipo36 = null;
        ita.kangaroo.model.utenteBean utenteBean42 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo36, "hi!", "", "", "hi!", "");
        java.lang.String str43 = utenteBean42.getUsername();
        java.lang.String str44 = utenteBean42.getCap();
        java.sql.Date date52 = null;
        ita.kangaroo.model.OrdineBean ordineBean54 = new ita.kangaroo.model.OrdineBean((int) (short) 0, utenteBean42, (float) 10L, "", "Data non disponibile", "hi!", "hi!", "", "", date52, "hi!");
        ordineBean12.setClient(utenteBean42);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(utenteBean29);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        float float2 = orderProductBean0.getIVA();
        orderProductBean0.setPrezzo(10.0f);
        orderProductBean0.setQuantita((int) (short) -1);
        int int7 = orderProductBean0.getQuantita();
        orderProductBean0.setId_ordine((int) 'a');
        int int10 = orderProductBean0.getId_ordine();
        int int11 = orderProductBean0.getId_ordine();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getImmagine();
        prodottoBean8.setPrezzo((float) (-1L));
        prodottoBean8.setIva((float) (byte) 10);
        ita.kangaroo.model.tipo tipo14 = prodottoBean8.getTipo();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(tipo14);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getImmagine();
        prodottoBean8.setPrezzo((float) (-1L));
        int int12 = prodottoBean8.getId();
        float float13 = prodottoBean8.getIva();
        prodottoBean8.setQuantita((int) ' ');
        ita.kangaroo.model.tipo tipo16 = prodottoBean8.getTipo();
        float float17 = prodottoBean8.getPrezzo();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertNull(tipo16);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + (-1.0f) + "'", float17 == (-1.0f));
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "3a987acf8cbc1028b7dbc86bd086831151899a2b", "ProdottoBean{id=10, descrizione='hi!', nome='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}", "ProdottoBean{id=10, descrizione='hi!', nome='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}", tipo5, "", "3a987acf8cbc1028b7dbc86bd086831151899a2b", "ProdottoBean{id=52, descrizione='hi!', nome='', immagine='da39a3ee5e6b4b0d3255bfef95601890afd80709', prezzo=32.0, quantita=-1, iva=52.0, tipo=null}", "da39a3ee5e6b4b0d3255bfef95601890afd80709", "hi!");
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getDescrizione();
        prodottoBean8.setImmagine("");
        java.lang.String str12 = prodottoBean8.toString();
        prodottoBean8.setPrezzo(0.0f);
        ita.kangaroo.model.CartProduct cartProduct16 = new ita.kangaroo.model.CartProduct(prodottoBean8, (int) (short) -1);
        ita.kangaroo.model.ProdottoBean prodottoBean17 = cartProduct16.getProduct();
        cartProduct16.setQuantity((int) (byte) 100);
        ita.kangaroo.model.ProdottoBean prodottoBean20 = cartProduct16.getProduct();
        cartProduct16.setQuantity((int) (short) -1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}" + "'", str12, "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        org.junit.Assert.assertNotNull(prodottoBean17);
        org.junit.Assert.assertNotNull(prodottoBean20);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        ita.kangaroo.model.MetodoPagamentoBean metodoPagamentoBean0 = new ita.kangaroo.model.MetodoPagamentoBean();
        metodoPagamentoBean0.setId((int) 'a');
        ita.kangaroo.model.AddressBean addressBean3 = new ita.kangaroo.model.AddressBean();
        java.lang.String str4 = addressBean3.getVia();
        addressBean3.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        addressBean3.setCitta("hi!");
        boolean boolean9 = metodoPagamentoBean0.equals((java.lang.Object) addressBean3);
        java.lang.String str10 = metodoPagamentoBean0.getNumero_carta();
        java.lang.String str11 = metodoPagamentoBean0.getNumero_carta();
        java.lang.String str12 = metodoPagamentoBean0.getNumero_carta();
        metodoPagamentoBean0.setCvv("ProdottoBean{id=10, descrizione='hi!', nome='', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        ordineBean12.setNumero_carta("");
        java.sql.Date date16 = ordineBean12.getData();
        ordineBean12.setMetodo_di_pagamento("");
        ordineBean12.setNumero_di_tracking("");
        ordineBean12.setNumero_di_tracking("hi!");
        ordineBean12.setDestinatario("hi!");
        ita.kangaroo.model.tipo tipo32 = null;
        ita.kangaroo.model.utenteBean utenteBean38 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo32, "hi!", "", "", "hi!", "");
        utenteBean38.setEmail("hi!");
        java.lang.String str41 = utenteBean38.getCognome();
        java.sql.Date date49 = null;
        ita.kangaroo.model.OrdineBean ordineBean51 = new ita.kangaroo.model.OrdineBean((int) (byte) 10, utenteBean38, (float) (-1L), "Data non disponibile", "Data non disponibile", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "hi!", "hi!", "", date49, "Data non disponibile");
        ita.kangaroo.model.tipo tipo52 = utenteBean38.getTipo();
        java.sql.Date date60 = null;
        ita.kangaroo.model.OrdineBean ordineBean62 = new ita.kangaroo.model.OrdineBean(1, utenteBean38, (float) 0L, "", "Data non disponibile", "hi!", "hi!", "", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", date60, "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        ordineBean12.setClient(utenteBean38);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNull(tipo52);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("3a987acf8cbc1028b7dbc86bd086831151899a2b", "hi!", "ProdottoBean{id=10, descrizione='hi!', nome='', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}", "hi!", "Data non disponibile", tipo5, "da39a3ee5e6b4b0d3255bfef95601890afd80709", "hi!", "da39a3ee5e6b4b0d3255bfef95601890afd80709", "3a987acf8cbc1028b7dbc86bd086831151899a2b", "Data non disponibile");
        java.lang.String str12 = utenteBean11.getCognome();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        ita.kangaroo.model.MetodoPagamentoBean metodoPagamentoBean0 = new ita.kangaroo.model.MetodoPagamentoBean();
        metodoPagamentoBean0.setId((int) 'a');
        ita.kangaroo.model.AddressBean addressBean3 = new ita.kangaroo.model.AddressBean();
        java.lang.String str4 = addressBean3.getVia();
        addressBean3.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        addressBean3.setCitta("hi!");
        boolean boolean9 = metodoPagamentoBean0.equals((java.lang.Object) addressBean3);
        java.lang.String str10 = metodoPagamentoBean0.getNumero_carta();
        java.lang.String str11 = metodoPagamentoBean0.getNumero_carta();
        java.lang.String str12 = metodoPagamentoBean0.getNumero_carta();
        metodoPagamentoBean0.setCvv("hi!");
        metodoPagamentoBean0.setCvv("da39a3ee5e6b4b0d3255bfef95601890afd80709");
        int int17 = metodoPagamentoBean0.getId();
        metodoPagamentoBean0.setData_scadenza("Data non disponibile");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        ita.kangaroo.model.AddressBean addressBean0 = new ita.kangaroo.model.AddressBean();
        int int1 = addressBean0.getId();
        addressBean0.setUsername("da39a3ee5e6b4b0d3255bfef95601890afd80709");
        addressBean0.setVia("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        float float2 = orderProductBean0.getIVA();
        int int3 = orderProductBean0.getId_prodotto();
        float float4 = orderProductBean0.getPrezzo();
        ita.kangaroo.model.OrderProductBean orderProductBean5 = new ita.kangaroo.model.OrderProductBean();
        float float6 = orderProductBean5.getIVA();
        float float7 = orderProductBean5.getIVA();
        ita.kangaroo.model.OrderProductBean orderProductBean8 = new ita.kangaroo.model.OrderProductBean();
        float float9 = orderProductBean8.getIVA();
        orderProductBean8.setQuantita((int) (byte) 100);
        orderProductBean8.setPrezzo((float) (-1));
        ita.kangaroo.model.OrderProductBean orderProductBean14 = new ita.kangaroo.model.OrderProductBean();
        float float15 = orderProductBean14.getIVA();
        float float16 = orderProductBean14.getIVA();
        int int17 = orderProductBean14.getId_prodotto();
        float float18 = orderProductBean14.getPrezzo();
        ita.kangaroo.model.OrderProductBean orderProductBean19 = new ita.kangaroo.model.OrderProductBean();
        float float20 = orderProductBean19.getIVA();
        orderProductBean19.setQuantita((int) (byte) 100);
        ita.kangaroo.model.OrderProductBean orderProductBean23 = new ita.kangaroo.model.OrderProductBean();
        float float24 = orderProductBean23.getIVA();
        float float25 = orderProductBean23.getIVA();
        float float26 = orderProductBean23.getPrezzo();
        ita.kangaroo.model.OrderProductBean orderProductBean27 = new ita.kangaroo.model.OrderProductBean();
        float float28 = orderProductBean27.getIVA();
        float float29 = orderProductBean27.getIVA();
        float float30 = orderProductBean27.getPrezzo();
        ita.kangaroo.model.OrderProductBean orderProductBean31 = new ita.kangaroo.model.OrderProductBean();
        float float32 = orderProductBean31.getIVA();
        float float33 = orderProductBean31.getIVA();
        int int34 = orderProductBean31.getId_prodotto();
        float float35 = orderProductBean31.getPrezzo();
        ita.kangaroo.model.OrderProductBean orderProductBean36 = new ita.kangaroo.model.OrderProductBean();
        ita.kangaroo.model.OrderProductBean orderProductBean37 = new ita.kangaroo.model.OrderProductBean();
        float float38 = orderProductBean37.getIVA();
        float float39 = orderProductBean37.getIVA();
        orderProductBean37.setPrezzo(10.0f);
        orderProductBean37.setId_ordine((int) (short) 0);
        orderProductBean37.setIVA((-1.0f));
        ita.kangaroo.model.OrderProductBean orderProductBean46 = new ita.kangaroo.model.OrderProductBean();
        float float47 = orderProductBean46.getIVA();
        int int48 = orderProductBean46.getId_ordine();
        orderProductBean46.setQuantita((int) 'a');
        int int51 = orderProductBean46.getId_ordine();
        orderProductBean46.setId_ordine(100);
        ita.kangaroo.model.OrderProductBean orderProductBean54 = new ita.kangaroo.model.OrderProductBean();
        float float55 = orderProductBean54.getIVA();
        int int56 = orderProductBean54.getId_ordine();
        int int57 = orderProductBean54.getQuantita();
        ita.kangaroo.model.OrderProductBean orderProductBean58 = new ita.kangaroo.model.OrderProductBean();
        float float59 = orderProductBean58.getIVA();
        float float60 = orderProductBean58.getIVA();
        int int61 = orderProductBean58.getId_prodotto();
        ita.kangaroo.model.OrderProductBean orderProductBean62 = new ita.kangaroo.model.OrderProductBean();
        float float63 = orderProductBean62.getIVA();
        float float64 = orderProductBean62.getIVA();
        int int65 = orderProductBean62.getId_prodotto();
        ita.kangaroo.model.OrderProductBean orderProductBean66 = new ita.kangaroo.model.OrderProductBean();
        float float67 = orderProductBean66.getIVA();
        int int68 = orderProductBean66.getId_ordine();
        ita.kangaroo.model.OrderProductBean orderProductBean69 = new ita.kangaroo.model.OrderProductBean();
        float float70 = orderProductBean69.getIVA();
        float float71 = orderProductBean69.getIVA();
        orderProductBean69.setPrezzo(10.0f);
        orderProductBean69.setId_ordine((int) (short) 0);
        orderProductBean69.setIVA((-1.0f));
        ita.kangaroo.model.OrderProductBean[] orderProductBeanArray78 = new ita.kangaroo.model.OrderProductBean[] { orderProductBean0, orderProductBean5, orderProductBean8, orderProductBean14, orderProductBean19, orderProductBean23, orderProductBean27, orderProductBean31, orderProductBean36, orderProductBean37, orderProductBean46, orderProductBean54, orderProductBean58, orderProductBean62, orderProductBean66, orderProductBean69 };
        java.util.ArrayList<ita.kangaroo.model.OrderProductBean> orderProductBeanList79 = new java.util.ArrayList<ita.kangaroo.model.OrderProductBean>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<ita.kangaroo.model.OrderProductBean>) orderProductBeanList79, orderProductBeanArray78);
        ita.kangaroo.model.OrdineBean ordineBean81 = new ita.kangaroo.model.OrdineBean(orderProductBeanList79);
        java.lang.String str82 = ordineBean81.getDestinatario();
        java.lang.String str83 = ordineBean81.getMetodo_di_spedizione();
        ordineBean81.setDestinatario("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.0f + "'", float15 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.0f + "'", float18 == 0.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 0.0f + "'", float25 == 0.0f);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 0.0f + "'", float26 == 0.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 0.0f + "'", float28 == 0.0f);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 0.0f + "'", float29 == 0.0f);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 0.0f + "'", float30 == 0.0f);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 0.0f + "'", float32 == 0.0f);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 0.0f + "'", float33 == 0.0f);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 0.0f + "'", float35 == 0.0f);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + 0.0f + "'", float38 == 0.0f);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 0.0f + "'", float39 == 0.0f);
        org.junit.Assert.assertTrue("'" + float47 + "' != '" + 0.0f + "'", float47 == 0.0f);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + float55 + "' != '" + 0.0f + "'", float55 == 0.0f);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + float59 + "' != '" + 0.0f + "'", float59 == 0.0f);
        org.junit.Assert.assertTrue("'" + float60 + "' != '" + 0.0f + "'", float60 == 0.0f);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + float63 + "' != '" + 0.0f + "'", float63 == 0.0f);
        org.junit.Assert.assertTrue("'" + float64 + "' != '" + 0.0f + "'", float64 == 0.0f);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + float67 + "' != '" + 0.0f + "'", float67 == 0.0f);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + float70 + "' != '" + 0.0f + "'", float70 == 0.0f);
        org.junit.Assert.assertTrue("'" + float71 + "' != '" + 0.0f + "'", float71 == 0.0f);
        org.junit.Assert.assertNotNull(orderProductBeanArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNull(str82);
        org.junit.Assert.assertNull(str83);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        utenteBean11.setEmail("hi!");
        utenteBean11.setPassword("hi!");
        java.lang.String str16 = utenteBean11.getCognome();
        java.lang.String str17 = utenteBean11.getUsername();
        utenteBean11.setUsername("hi!");
        java.lang.String str20 = utenteBean11.getPassword();
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "3a987acf8cbc1028b7dbc86bd086831151899a2b" + "'", str20, "3a987acf8cbc1028b7dbc86bd086831151899a2b");
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        ita.kangaroo.model.tipo tipo19 = null;
        ita.kangaroo.model.utenteBean utenteBean25 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo19, "hi!", "", "", "hi!", "");
        utenteBean25.setEmail("hi!");
        ordineBean12.setClient(utenteBean25);
        ordineBean12.setNumero_carta("");
        ordineBean12.setMetodo_di_pagamento("hi!");
        java.lang.String str33 = ordineBean12.getMetodo_di_spedizione();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        ita.kangaroo.model.AddressBean addressBean0 = new ita.kangaroo.model.AddressBean();
        java.lang.String str1 = addressBean0.getVia();
        java.lang.String str2 = addressBean0.getUsername();
        java.lang.String str3 = addressBean0.getCAP();
        java.lang.String str4 = addressBean0.getUsername();
        addressBean0.setId(10);
        addressBean0.setId((int) (short) 100);
        java.lang.String str9 = addressBean0.getVia();
        int int10 = addressBean0.getId();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        ordineBean12.setNumero_carta("hi!");
        java.lang.String str16 = ordineBean12.getIndirizzo_di_spedizione();
        java.util.ArrayList<ita.kangaroo.model.OrderProductBean> orderProductBeanList17 = null;
        ordineBean12.setProducts(orderProductBeanList17);
        java.lang.Class<?> wildcardClass19 = ordineBean12.getClass();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
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
        java.lang.String str19 = metodoPagamentoBean0.getCvv();
        metodoPagamentoBean0.setId((int) (byte) -1);
        int int22 = metodoPagamentoBean0.getId();
        java.lang.String str23 = metodoPagamentoBean0.getCircuito();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        ita.kangaroo.model.tipo tipo6 = null;
        ita.kangaroo.model.utenteBean utenteBean12 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo6, "hi!", "", "", "hi!", "");
        utenteBean12.setEmail("hi!");
        utenteBean12.setPassword("hi!");
        utenteBean12.setProvincia("hi!");
        utenteBean12.setUsername("hi!");
        utenteBean12.setCognome("hi!");
        java.sql.Date date30 = null;
        ita.kangaroo.model.OrdineBean ordineBean32 = new ita.kangaroo.model.OrdineBean((int) (byte) 10, utenteBean12, (float) (short) 100, "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "hi!", "", "", "hi!", "", date30, "");
        ita.kangaroo.model.tipo tipo33 = utenteBean12.getTipo();
        utenteBean12.setUsername("hi!");
        utenteBean12.setUsername("Data non disponibile");
        utenteBean12.setCognome("hi!");
        java.lang.String str40 = utenteBean12.getCitta();
        utenteBean12.setPassword("3d1583397bcebff274b1e7cb58087c39153af974");
        org.junit.Assert.assertNull(tipo33);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        float float2 = orderProductBean0.getIVA();
        orderProductBean0.setPrezzo(10.0f);
        float float5 = orderProductBean0.getPrezzo();
        float float6 = orderProductBean0.getPrezzo();
        int int7 = orderProductBean0.getQuantita();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10.0f + "'", float5 == 10.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        ita.kangaroo.model.tipo tipo19 = null;
        ita.kangaroo.model.utenteBean utenteBean25 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo19, "hi!", "", "", "hi!", "");
        utenteBean25.setEmail("hi!");
        ordineBean12.setClient(utenteBean25);
        ordineBean12.setDestinatario("");
        ordineBean12.setId((int) '4');
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "", "", "hi!", "hi!", "hi!");
        java.lang.String str12 = utenteBean11.getUsername();
        utenteBean11.setPassword("");
        utenteBean11.setUsername("hi!");
        utenteBean11.setCitta("ProdottoBean{id=10, descrizione='hi!', nome='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        ita.kangaroo.model.Cart cart0 = new ita.kangaroo.model.Cart();
        ita.kangaroo.model.tipo tipo8 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean9 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo8);
        java.lang.String str10 = prodottoBean9.getImmagine();
        prodottoBean9.setPrezzo((float) (-1L));
        int int13 = prodottoBean9.getId();
        prodottoBean9.setPrezzo(10.0f);
        prodottoBean9.setPrezzo(0.0f);
        prodottoBean9.setNome("Data non disponibile");
        cart0.changeQuantity(prodottoBean9, (int) '4');
        java.util.ArrayList<ita.kangaroo.model.CartProduct> cartProductList22 = cart0.getProducts();
        ita.kangaroo.model.tipo tipo30 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean31 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo30);
        java.lang.String str32 = prodottoBean31.getImmagine();
        prodottoBean31.setPrezzo((float) (-1L));
        int int35 = prodottoBean31.getId();
        float float36 = prodottoBean31.getIva();
        int int37 = prodottoBean31.getId();
        prodottoBean31.setImmagine("hi!");
        cart0.removeProduct(prodottoBean31);
        java.util.ArrayList<ita.kangaroo.model.CartProduct> cartProductList41 = cart0.getProducts();
        ita.kangaroo.model.tipo tipo49 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean50 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo49);
        java.lang.String str51 = prodottoBean50.getImmagine();
        int int52 = prodottoBean50.getQuantita();
        ita.kangaroo.model.CartProduct cartProduct53 = new ita.kangaroo.model.CartProduct(prodottoBean50);
        prodottoBean50.setNome("");
        java.lang.String str56 = prodottoBean50.getNome();
        cart0.changeQuantity(prodottoBean50, 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(cartProductList22);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 1.0f + "'", float36 == 1.0f);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(cartProductList41);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        ita.kangaroo.model.tipo tipo6 = null;
        ita.kangaroo.model.utenteBean utenteBean12 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo6, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean13 = new ita.kangaroo.model.OrdineBean(utenteBean12);
        utenteBean12.setPassword("hi!");
        utenteBean12.setNome("hi!");
        java.sql.Date date25 = null;
        ita.kangaroo.model.OrdineBean ordineBean27 = new ita.kangaroo.model.OrdineBean((int) (byte) 100, utenteBean12, (float) (-1L), "hi!", "", "", "hi!", "Data non disponibile", "hi!", date25, "");
        ordineBean27.setIndirizzo_di_spedizione("Data non disponibile");
        java.lang.String str30 = ordineBean27.getDestinatario();
        java.lang.String str31 = ordineBean27.getDestinatario();
        ita.kangaroo.model.tipo tipo37 = null;
        ita.kangaroo.model.utenteBean utenteBean43 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo37, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean44 = new ita.kangaroo.model.OrdineBean(utenteBean43);
        java.lang.String str45 = ordineBean44.getMetodo_di_spedizione();
        java.util.ArrayList<ita.kangaroo.model.OrderProductBean> orderProductBeanList46 = ordineBean44.getProducts();
        ordineBean27.setProducts(orderProductBeanList46);
        ita.kangaroo.model.OrdineBean ordineBean48 = new ita.kangaroo.model.OrdineBean(orderProductBeanList46);
        ordineBean48.setPrezzo_totale(100.0f);
        java.lang.Class<?> wildcardClass51 = ordineBean48.getClass();
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(orderProductBeanList46);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        float float2 = orderProductBean0.getIVA();
        int int3 = orderProductBean0.getId_prodotto();
        float float4 = orderProductBean0.getPrezzo();
        ita.kangaroo.model.OrderProductBean orderProductBean5 = new ita.kangaroo.model.OrderProductBean();
        float float6 = orderProductBean5.getIVA();
        float float7 = orderProductBean5.getIVA();
        ita.kangaroo.model.OrderProductBean orderProductBean8 = new ita.kangaroo.model.OrderProductBean();
        float float9 = orderProductBean8.getIVA();
        orderProductBean8.setQuantita((int) (byte) 100);
        orderProductBean8.setPrezzo((float) (-1));
        ita.kangaroo.model.OrderProductBean orderProductBean14 = new ita.kangaroo.model.OrderProductBean();
        float float15 = orderProductBean14.getIVA();
        float float16 = orderProductBean14.getIVA();
        int int17 = orderProductBean14.getId_prodotto();
        float float18 = orderProductBean14.getPrezzo();
        ita.kangaroo.model.OrderProductBean orderProductBean19 = new ita.kangaroo.model.OrderProductBean();
        float float20 = orderProductBean19.getIVA();
        orderProductBean19.setQuantita((int) (byte) 100);
        ita.kangaroo.model.OrderProductBean orderProductBean23 = new ita.kangaroo.model.OrderProductBean();
        float float24 = orderProductBean23.getIVA();
        float float25 = orderProductBean23.getIVA();
        float float26 = orderProductBean23.getPrezzo();
        ita.kangaroo.model.OrderProductBean orderProductBean27 = new ita.kangaroo.model.OrderProductBean();
        float float28 = orderProductBean27.getIVA();
        float float29 = orderProductBean27.getIVA();
        float float30 = orderProductBean27.getPrezzo();
        ita.kangaroo.model.OrderProductBean orderProductBean31 = new ita.kangaroo.model.OrderProductBean();
        float float32 = orderProductBean31.getIVA();
        float float33 = orderProductBean31.getIVA();
        int int34 = orderProductBean31.getId_prodotto();
        float float35 = orderProductBean31.getPrezzo();
        ita.kangaroo.model.OrderProductBean orderProductBean36 = new ita.kangaroo.model.OrderProductBean();
        ita.kangaroo.model.OrderProductBean orderProductBean37 = new ita.kangaroo.model.OrderProductBean();
        float float38 = orderProductBean37.getIVA();
        float float39 = orderProductBean37.getIVA();
        orderProductBean37.setPrezzo(10.0f);
        orderProductBean37.setId_ordine((int) (short) 0);
        orderProductBean37.setIVA((-1.0f));
        ita.kangaroo.model.OrderProductBean orderProductBean46 = new ita.kangaroo.model.OrderProductBean();
        float float47 = orderProductBean46.getIVA();
        int int48 = orderProductBean46.getId_ordine();
        orderProductBean46.setQuantita((int) 'a');
        int int51 = orderProductBean46.getId_ordine();
        orderProductBean46.setId_ordine(100);
        ita.kangaroo.model.OrderProductBean orderProductBean54 = new ita.kangaroo.model.OrderProductBean();
        float float55 = orderProductBean54.getIVA();
        int int56 = orderProductBean54.getId_ordine();
        int int57 = orderProductBean54.getQuantita();
        ita.kangaroo.model.OrderProductBean orderProductBean58 = new ita.kangaroo.model.OrderProductBean();
        float float59 = orderProductBean58.getIVA();
        float float60 = orderProductBean58.getIVA();
        int int61 = orderProductBean58.getId_prodotto();
        ita.kangaroo.model.OrderProductBean orderProductBean62 = new ita.kangaroo.model.OrderProductBean();
        float float63 = orderProductBean62.getIVA();
        float float64 = orderProductBean62.getIVA();
        int int65 = orderProductBean62.getId_prodotto();
        ita.kangaroo.model.OrderProductBean orderProductBean66 = new ita.kangaroo.model.OrderProductBean();
        float float67 = orderProductBean66.getIVA();
        int int68 = orderProductBean66.getId_ordine();
        ita.kangaroo.model.OrderProductBean orderProductBean69 = new ita.kangaroo.model.OrderProductBean();
        float float70 = orderProductBean69.getIVA();
        float float71 = orderProductBean69.getIVA();
        orderProductBean69.setPrezzo(10.0f);
        orderProductBean69.setId_ordine((int) (short) 0);
        orderProductBean69.setIVA((-1.0f));
        ita.kangaroo.model.OrderProductBean[] orderProductBeanArray78 = new ita.kangaroo.model.OrderProductBean[] { orderProductBean0, orderProductBean5, orderProductBean8, orderProductBean14, orderProductBean19, orderProductBean23, orderProductBean27, orderProductBean31, orderProductBean36, orderProductBean37, orderProductBean46, orderProductBean54, orderProductBean58, orderProductBean62, orderProductBean66, orderProductBean69 };
        java.util.ArrayList<ita.kangaroo.model.OrderProductBean> orderProductBeanList79 = new java.util.ArrayList<ita.kangaroo.model.OrderProductBean>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<ita.kangaroo.model.OrderProductBean>) orderProductBeanList79, orderProductBeanArray78);
        ita.kangaroo.model.OrdineBean ordineBean81 = new ita.kangaroo.model.OrdineBean(orderProductBeanList79);
        java.lang.String str82 = ordineBean81.getDestinatario();
        java.lang.String str83 = ordineBean81.getMetodo_di_spedizione();
        ordineBean81.setDestinatario("ProdottoBean{id=32, descrizione='Data non disponibile', nome='Data non disponibile', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=32.0, quantita=32, iva=10.0, tipo=null}");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.0f + "'", float15 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.0f + "'", float18 == 0.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 0.0f + "'", float25 == 0.0f);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 0.0f + "'", float26 == 0.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 0.0f + "'", float28 == 0.0f);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 0.0f + "'", float29 == 0.0f);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 0.0f + "'", float30 == 0.0f);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 0.0f + "'", float32 == 0.0f);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 0.0f + "'", float33 == 0.0f);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 0.0f + "'", float35 == 0.0f);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + 0.0f + "'", float38 == 0.0f);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 0.0f + "'", float39 == 0.0f);
        org.junit.Assert.assertTrue("'" + float47 + "' != '" + 0.0f + "'", float47 == 0.0f);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + float55 + "' != '" + 0.0f + "'", float55 == 0.0f);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + float59 + "' != '" + 0.0f + "'", float59 == 0.0f);
        org.junit.Assert.assertTrue("'" + float60 + "' != '" + 0.0f + "'", float60 == 0.0f);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + float63 + "' != '" + 0.0f + "'", float63 == 0.0f);
        org.junit.Assert.assertTrue("'" + float64 + "' != '" + 0.0f + "'", float64 == 0.0f);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + float67 + "' != '" + 0.0f + "'", float67 == 0.0f);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + float70 + "' != '" + 0.0f + "'", float70 == 0.0f);
        org.junit.Assert.assertTrue("'" + float71 + "' != '" + 0.0f + "'", float71 == 0.0f);
        org.junit.Assert.assertNotNull(orderProductBeanArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNull(str82);
        org.junit.Assert.assertNull(str83);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        ita.kangaroo.model.AddressBean addressBean0 = new ita.kangaroo.model.AddressBean();
        java.lang.String str1 = addressBean0.getVia();
        java.lang.String str2 = addressBean0.getUsername();
        java.lang.String str3 = addressBean0.getCAP();
        java.lang.String str4 = addressBean0.getUsername();
        addressBean0.setId(10);
        int int7 = addressBean0.getId();
        java.lang.String str8 = addressBean0.getUsername();
        java.lang.String str9 = addressBean0.getUsername();
        addressBean0.setCitta("ProdottoBean{id=0, descrizione='', nome='', immagine='', prezzo=0.0, quantita=0, iva=0.0, tipo=null}");
        addressBean0.setVia("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        utenteBean11.setEmail("hi!");
        java.lang.String str14 = utenteBean11.getCognome();
        ita.kangaroo.model.tipo tipo15 = utenteBean11.getTipo();
        utenteBean11.setVia("");
        java.lang.String str18 = utenteBean11.getCognome();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(tipo15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getImmagine();
        prodottoBean8.setPrezzo((float) (-1L));
        int int12 = prodottoBean8.getId();
        float float13 = prodottoBean8.getIva();
        int int14 = prodottoBean8.getId();
        prodottoBean8.setPrezzo((float) (byte) 10);
        float float17 = prodottoBean8.getIva();
        prodottoBean8.setPrezzo((float) 0L);
        prodottoBean8.setDescrizione("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        prodottoBean8.setDescrizione("");
        prodottoBean8.setIva((float) (-1L));
        prodottoBean8.setImmagine("hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 1.0f + "'", float17 == 1.0f);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        ita.kangaroo.model.AddressBean addressBean0 = new ita.kangaroo.model.AddressBean();
        addressBean0.setId((int) (byte) -1);
        addressBean0.setVia("hi!");
        int int5 = addressBean0.getId();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getImmagine();
        int int10 = prodottoBean8.getQuantita();
        prodottoBean8.setImmagine("hi!");
        java.lang.String str13 = prodottoBean8.getImmagine();
        ita.kangaroo.model.tipo tipo14 = null;
        prodottoBean8.setTipo(tipo14);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        float float2 = orderProductBean0.getIVA();
        float float3 = orderProductBean0.getPrezzo();
        orderProductBean0.setQuantita(0);
        orderProductBean0.setId_prodotto((int) (byte) 100);
        orderProductBean0.setId_prodotto((int) '#');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "", "", "hi!", "hi!", "hi!");
        java.lang.String str12 = utenteBean11.getPassword();
        java.lang.String str13 = utenteBean11.getPassword();
        utenteBean11.setNome("Data non disponibile");
        utenteBean11.setPassword("");
        java.lang.String str18 = utenteBean11.getUsername();
        java.lang.String str19 = utenteBean11.getProvincia();
        java.lang.String str20 = utenteBean11.getEmail();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) -1, "Data non disponibile", "Data non disponibile", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", (float) ' ', (int) ' ', (float) ' ', tipo7);
        ita.kangaroo.model.CartProduct cartProduct9 = new ita.kangaroo.model.CartProduct(prodottoBean8);
        int int10 = prodottoBean8.getQuantita();
        java.lang.String str11 = prodottoBean8.getDescrizione();
        java.lang.String str12 = prodottoBean8.toString();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Data non disponibile" + "'", str11, "Data non disponibile");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ProdottoBean{id=-1, descrizione='Data non disponibile', nome='Data non disponibile', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=32.0, quantita=32, iva=32.0, tipo=null}" + "'", str12, "ProdottoBean{id=-1, descrizione='Data non disponibile', nome='Data non disponibile', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=32.0, quantita=32, iva=32.0, tipo=null}");
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        float float2 = orderProductBean0.getIVA();
        int int3 = orderProductBean0.getId_prodotto();
        float float4 = orderProductBean0.getPrezzo();
        ita.kangaroo.model.OrderProductBean orderProductBean5 = new ita.kangaroo.model.OrderProductBean();
        float float6 = orderProductBean5.getIVA();
        float float7 = orderProductBean5.getIVA();
        ita.kangaroo.model.OrderProductBean orderProductBean8 = new ita.kangaroo.model.OrderProductBean();
        float float9 = orderProductBean8.getIVA();
        orderProductBean8.setQuantita((int) (byte) 100);
        orderProductBean8.setPrezzo((float) (-1));
        ita.kangaroo.model.OrderProductBean orderProductBean14 = new ita.kangaroo.model.OrderProductBean();
        float float15 = orderProductBean14.getIVA();
        float float16 = orderProductBean14.getIVA();
        int int17 = orderProductBean14.getId_prodotto();
        float float18 = orderProductBean14.getPrezzo();
        ita.kangaroo.model.OrderProductBean orderProductBean19 = new ita.kangaroo.model.OrderProductBean();
        float float20 = orderProductBean19.getIVA();
        orderProductBean19.setQuantita((int) (byte) 100);
        ita.kangaroo.model.OrderProductBean orderProductBean23 = new ita.kangaroo.model.OrderProductBean();
        float float24 = orderProductBean23.getIVA();
        float float25 = orderProductBean23.getIVA();
        float float26 = orderProductBean23.getPrezzo();
        ita.kangaroo.model.OrderProductBean orderProductBean27 = new ita.kangaroo.model.OrderProductBean();
        float float28 = orderProductBean27.getIVA();
        float float29 = orderProductBean27.getIVA();
        float float30 = orderProductBean27.getPrezzo();
        ita.kangaroo.model.OrderProductBean orderProductBean31 = new ita.kangaroo.model.OrderProductBean();
        float float32 = orderProductBean31.getIVA();
        float float33 = orderProductBean31.getIVA();
        int int34 = orderProductBean31.getId_prodotto();
        float float35 = orderProductBean31.getPrezzo();
        ita.kangaroo.model.OrderProductBean orderProductBean36 = new ita.kangaroo.model.OrderProductBean();
        ita.kangaroo.model.OrderProductBean orderProductBean37 = new ita.kangaroo.model.OrderProductBean();
        float float38 = orderProductBean37.getIVA();
        float float39 = orderProductBean37.getIVA();
        orderProductBean37.setPrezzo(10.0f);
        orderProductBean37.setId_ordine((int) (short) 0);
        orderProductBean37.setIVA((-1.0f));
        ita.kangaroo.model.OrderProductBean orderProductBean46 = new ita.kangaroo.model.OrderProductBean();
        float float47 = orderProductBean46.getIVA();
        int int48 = orderProductBean46.getId_ordine();
        orderProductBean46.setQuantita((int) 'a');
        int int51 = orderProductBean46.getId_ordine();
        orderProductBean46.setId_ordine(100);
        ita.kangaroo.model.OrderProductBean orderProductBean54 = new ita.kangaroo.model.OrderProductBean();
        float float55 = orderProductBean54.getIVA();
        int int56 = orderProductBean54.getId_ordine();
        int int57 = orderProductBean54.getQuantita();
        ita.kangaroo.model.OrderProductBean orderProductBean58 = new ita.kangaroo.model.OrderProductBean();
        float float59 = orderProductBean58.getIVA();
        float float60 = orderProductBean58.getIVA();
        int int61 = orderProductBean58.getId_prodotto();
        ita.kangaroo.model.OrderProductBean orderProductBean62 = new ita.kangaroo.model.OrderProductBean();
        float float63 = orderProductBean62.getIVA();
        float float64 = orderProductBean62.getIVA();
        int int65 = orderProductBean62.getId_prodotto();
        ita.kangaroo.model.OrderProductBean orderProductBean66 = new ita.kangaroo.model.OrderProductBean();
        float float67 = orderProductBean66.getIVA();
        int int68 = orderProductBean66.getId_ordine();
        ita.kangaroo.model.OrderProductBean orderProductBean69 = new ita.kangaroo.model.OrderProductBean();
        float float70 = orderProductBean69.getIVA();
        float float71 = orderProductBean69.getIVA();
        orderProductBean69.setPrezzo(10.0f);
        orderProductBean69.setId_ordine((int) (short) 0);
        orderProductBean69.setIVA((-1.0f));
        ita.kangaroo.model.OrderProductBean[] orderProductBeanArray78 = new ita.kangaroo.model.OrderProductBean[] { orderProductBean0, orderProductBean5, orderProductBean8, orderProductBean14, orderProductBean19, orderProductBean23, orderProductBean27, orderProductBean31, orderProductBean36, orderProductBean37, orderProductBean46, orderProductBean54, orderProductBean58, orderProductBean62, orderProductBean66, orderProductBean69 };
        java.util.ArrayList<ita.kangaroo.model.OrderProductBean> orderProductBeanList79 = new java.util.ArrayList<ita.kangaroo.model.OrderProductBean>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<ita.kangaroo.model.OrderProductBean>) orderProductBeanList79, orderProductBeanArray78);
        ita.kangaroo.model.OrdineBean ordineBean81 = new ita.kangaroo.model.OrdineBean(orderProductBeanList79);
        java.lang.String str82 = ordineBean81.getDestinatario();
        ita.kangaroo.model.utenteBean utenteBean83 = ordineBean81.getClient();
        ordineBean81.setCircuito("Data non disponibile");
        java.lang.String str86 = ordineBean81.getIndirizzo_di_spedizione();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.0f + "'", float15 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.0f + "'", float18 == 0.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 0.0f + "'", float25 == 0.0f);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 0.0f + "'", float26 == 0.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 0.0f + "'", float28 == 0.0f);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 0.0f + "'", float29 == 0.0f);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 0.0f + "'", float30 == 0.0f);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 0.0f + "'", float32 == 0.0f);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 0.0f + "'", float33 == 0.0f);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 0.0f + "'", float35 == 0.0f);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + 0.0f + "'", float38 == 0.0f);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 0.0f + "'", float39 == 0.0f);
        org.junit.Assert.assertTrue("'" + float47 + "' != '" + 0.0f + "'", float47 == 0.0f);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + float55 + "' != '" + 0.0f + "'", float55 == 0.0f);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + float59 + "' != '" + 0.0f + "'", float59 == 0.0f);
        org.junit.Assert.assertTrue("'" + float60 + "' != '" + 0.0f + "'", float60 == 0.0f);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + float63 + "' != '" + 0.0f + "'", float63 == 0.0f);
        org.junit.Assert.assertTrue("'" + float64 + "' != '" + 0.0f + "'", float64 == 0.0f);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + float67 + "' != '" + 0.0f + "'", float67 == 0.0f);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + float70 + "' != '" + 0.0f + "'", float70 == 0.0f);
        org.junit.Assert.assertTrue("'" + float71 + "' != '" + 0.0f + "'", float71 == 0.0f);
        org.junit.Assert.assertNotNull(orderProductBeanArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNull(str82);
        org.junit.Assert.assertNull(utenteBean83);
        org.junit.Assert.assertNull(str86);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getImmagine();
        prodottoBean8.setPrezzo((float) (-1L));
        int int12 = prodottoBean8.getId();
        float float13 = prodottoBean8.getIva();
        prodottoBean8.setIva((float) ' ');
        ita.kangaroo.model.CartProduct cartProduct17 = new ita.kangaroo.model.CartProduct(prodottoBean8, 0);
        int int18 = prodottoBean8.getId();
        java.lang.String str19 = prodottoBean8.getDescrizione();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getDestinatario();
        java.lang.String str14 = ordineBean12.toString();
        ordineBean12.setPrezzo_totale(10.0f);
        java.sql.Date date17 = null;
        ordineBean12.setData(date17);
        ordineBean12.setMetodo_di_spedizione("ProdottoBean{id=-1, descrizione='Data non disponibile', nome='Data non disponibile', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=32.0, quantita=32, iva=32.0, tipo=null}");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Data non disponibile" + "'", str14, "Data non disponibile");
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        ita.kangaroo.model.MetodoPagamentoBean metodoPagamentoBean0 = new ita.kangaroo.model.MetodoPagamentoBean();
        metodoPagamentoBean0.setId((int) 'a');
        ita.kangaroo.model.AddressBean addressBean3 = new ita.kangaroo.model.AddressBean();
        java.lang.String str4 = addressBean3.getVia();
        addressBean3.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        addressBean3.setCitta("hi!");
        boolean boolean9 = metodoPagamentoBean0.equals((java.lang.Object) addressBean3);
        metodoPagamentoBean0.setCircuito("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        java.lang.String str12 = metodoPagamentoBean0.getCvv();
        metodoPagamentoBean0.setUsername("ProdottoBean{id=-1, descrizione='Data non disponibile', nome='Data non disponibile', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=32.0, quantita=32, iva=32.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        ita.kangaroo.model.Cart cart0 = new ita.kangaroo.model.Cart();
        ita.kangaroo.model.tipo tipo8 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean9 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo8);
        int int10 = prodottoBean9.getId();
        java.lang.String str11 = prodottoBean9.getImmagine();
        cart0.removeProduct(prodottoBean9);
        java.util.ArrayList<ita.kangaroo.model.CartProduct> cartProductList13 = cart0.getProducts();
        java.util.ArrayList<ita.kangaroo.model.CartProduct> cartProductList14 = cart0.getProducts();
        ita.kangaroo.model.tipo tipo22 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean23 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo22);
        java.lang.String str24 = prodottoBean23.getImmagine();
        prodottoBean23.setPrezzo((float) (-1L));
        int int27 = prodottoBean23.getId();
        ita.kangaroo.model.CartProduct cartProduct29 = new ita.kangaroo.model.CartProduct(prodottoBean23, (int) (short) -1);
        java.lang.String str30 = prodottoBean23.getNome();
        prodottoBean23.setIva((float) (short) 1);
        ita.kangaroo.model.CartProduct cartProduct34 = new ita.kangaroo.model.CartProduct(prodottoBean23, 32);
        cart0.removeProduct(prodottoBean23);
        java.lang.String str36 = prodottoBean23.toString();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(cartProductList13);
        org.junit.Assert.assertNotNull(cartProductList14);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='hi!', prezzo=-1.0, quantita=-1, iva=1.0, tipo=null}" + "'", str36, "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='hi!', prezzo=-1.0, quantita=-1, iva=1.0, tipo=null}");
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getCircuito();
        java.lang.String str14 = ordineBean12.toString();
        java.lang.String str15 = ordineBean12.toString();
        java.lang.String str16 = ordineBean12.getIndirizzo_di_spedizione();
        java.lang.String str17 = ordineBean12.getDestinatario();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Data non disponibile" + "'", str14, "Data non disponibile");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Data non disponibile" + "'", str15, "Data non disponibile");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        float float2 = orderProductBean0.getIVA();
        int int3 = orderProductBean0.getId_prodotto();
        float float4 = orderProductBean0.getPrezzo();
        ita.kangaroo.model.OrderProductBean orderProductBean5 = new ita.kangaroo.model.OrderProductBean();
        float float6 = orderProductBean5.getIVA();
        float float7 = orderProductBean5.getIVA();
        ita.kangaroo.model.OrderProductBean orderProductBean8 = new ita.kangaroo.model.OrderProductBean();
        float float9 = orderProductBean8.getIVA();
        orderProductBean8.setQuantita((int) (byte) 100);
        orderProductBean8.setPrezzo((float) (-1));
        ita.kangaroo.model.OrderProductBean orderProductBean14 = new ita.kangaroo.model.OrderProductBean();
        float float15 = orderProductBean14.getIVA();
        float float16 = orderProductBean14.getIVA();
        int int17 = orderProductBean14.getId_prodotto();
        float float18 = orderProductBean14.getPrezzo();
        ita.kangaroo.model.OrderProductBean orderProductBean19 = new ita.kangaroo.model.OrderProductBean();
        float float20 = orderProductBean19.getIVA();
        orderProductBean19.setQuantita((int) (byte) 100);
        ita.kangaroo.model.OrderProductBean orderProductBean23 = new ita.kangaroo.model.OrderProductBean();
        float float24 = orderProductBean23.getIVA();
        float float25 = orderProductBean23.getIVA();
        float float26 = orderProductBean23.getPrezzo();
        ita.kangaroo.model.OrderProductBean orderProductBean27 = new ita.kangaroo.model.OrderProductBean();
        float float28 = orderProductBean27.getIVA();
        float float29 = orderProductBean27.getIVA();
        float float30 = orderProductBean27.getPrezzo();
        ita.kangaroo.model.OrderProductBean orderProductBean31 = new ita.kangaroo.model.OrderProductBean();
        float float32 = orderProductBean31.getIVA();
        float float33 = orderProductBean31.getIVA();
        int int34 = orderProductBean31.getId_prodotto();
        float float35 = orderProductBean31.getPrezzo();
        ita.kangaroo.model.OrderProductBean orderProductBean36 = new ita.kangaroo.model.OrderProductBean();
        ita.kangaroo.model.OrderProductBean orderProductBean37 = new ita.kangaroo.model.OrderProductBean();
        float float38 = orderProductBean37.getIVA();
        float float39 = orderProductBean37.getIVA();
        orderProductBean37.setPrezzo(10.0f);
        orderProductBean37.setId_ordine((int) (short) 0);
        orderProductBean37.setIVA((-1.0f));
        ita.kangaroo.model.OrderProductBean orderProductBean46 = new ita.kangaroo.model.OrderProductBean();
        float float47 = orderProductBean46.getIVA();
        int int48 = orderProductBean46.getId_ordine();
        orderProductBean46.setQuantita((int) 'a');
        int int51 = orderProductBean46.getId_ordine();
        orderProductBean46.setId_ordine(100);
        ita.kangaroo.model.OrderProductBean orderProductBean54 = new ita.kangaroo.model.OrderProductBean();
        float float55 = orderProductBean54.getIVA();
        int int56 = orderProductBean54.getId_ordine();
        int int57 = orderProductBean54.getQuantita();
        ita.kangaroo.model.OrderProductBean orderProductBean58 = new ita.kangaroo.model.OrderProductBean();
        float float59 = orderProductBean58.getIVA();
        float float60 = orderProductBean58.getIVA();
        int int61 = orderProductBean58.getId_prodotto();
        ita.kangaroo.model.OrderProductBean orderProductBean62 = new ita.kangaroo.model.OrderProductBean();
        float float63 = orderProductBean62.getIVA();
        float float64 = orderProductBean62.getIVA();
        int int65 = orderProductBean62.getId_prodotto();
        ita.kangaroo.model.OrderProductBean orderProductBean66 = new ita.kangaroo.model.OrderProductBean();
        float float67 = orderProductBean66.getIVA();
        int int68 = orderProductBean66.getId_ordine();
        ita.kangaroo.model.OrderProductBean orderProductBean69 = new ita.kangaroo.model.OrderProductBean();
        float float70 = orderProductBean69.getIVA();
        float float71 = orderProductBean69.getIVA();
        orderProductBean69.setPrezzo(10.0f);
        orderProductBean69.setId_ordine((int) (short) 0);
        orderProductBean69.setIVA((-1.0f));
        ita.kangaroo.model.OrderProductBean[] orderProductBeanArray78 = new ita.kangaroo.model.OrderProductBean[] { orderProductBean0, orderProductBean5, orderProductBean8, orderProductBean14, orderProductBean19, orderProductBean23, orderProductBean27, orderProductBean31, orderProductBean36, orderProductBean37, orderProductBean46, orderProductBean54, orderProductBean58, orderProductBean62, orderProductBean66, orderProductBean69 };
        java.util.ArrayList<ita.kangaroo.model.OrderProductBean> orderProductBeanList79 = new java.util.ArrayList<ita.kangaroo.model.OrderProductBean>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<ita.kangaroo.model.OrderProductBean>) orderProductBeanList79, orderProductBeanArray78);
        ita.kangaroo.model.OrdineBean ordineBean81 = new ita.kangaroo.model.OrdineBean(orderProductBeanList79);
        java.lang.String str82 = ordineBean81.getDestinatario();
        java.lang.String str83 = ordineBean81.getMetodo_di_pagamento();
        ordineBean81.setNumero_di_tracking("da39a3ee5e6b4b0d3255bfef95601890afd80709");
        java.lang.String str86 = ordineBean81.getDestinatario();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.0f + "'", float15 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.0f + "'", float18 == 0.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 0.0f + "'", float25 == 0.0f);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 0.0f + "'", float26 == 0.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 0.0f + "'", float28 == 0.0f);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 0.0f + "'", float29 == 0.0f);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 0.0f + "'", float30 == 0.0f);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 0.0f + "'", float32 == 0.0f);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 0.0f + "'", float33 == 0.0f);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 0.0f + "'", float35 == 0.0f);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + 0.0f + "'", float38 == 0.0f);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 0.0f + "'", float39 == 0.0f);
        org.junit.Assert.assertTrue("'" + float47 + "' != '" + 0.0f + "'", float47 == 0.0f);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + float55 + "' != '" + 0.0f + "'", float55 == 0.0f);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + float59 + "' != '" + 0.0f + "'", float59 == 0.0f);
        org.junit.Assert.assertTrue("'" + float60 + "' != '" + 0.0f + "'", float60 == 0.0f);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + float63 + "' != '" + 0.0f + "'", float63 == 0.0f);
        org.junit.Assert.assertTrue("'" + float64 + "' != '" + 0.0f + "'", float64 == 0.0f);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + float67 + "' != '" + 0.0f + "'", float67 == 0.0f);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + float70 + "' != '" + 0.0f + "'", float70 == 0.0f);
        org.junit.Assert.assertTrue("'" + float71 + "' != '" + 0.0f + "'", float71 == 0.0f);
        org.junit.Assert.assertNotNull(orderProductBeanArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNull(str82);
        org.junit.Assert.assertNull(str83);
        org.junit.Assert.assertNull(str86);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        utenteBean11.setEmail("hi!");
        utenteBean11.setPassword("hi!");
        utenteBean11.setProvincia("hi!");
        ita.kangaroo.model.OrdineBean ordineBean18 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        ita.kangaroo.model.utenteBean utenteBean19 = ordineBean18.getClient();
        org.junit.Assert.assertNotNull(utenteBean19);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        ita.kangaroo.model.MetodoPagamentoBean metodoPagamentoBean0 = new ita.kangaroo.model.MetodoPagamentoBean();
        metodoPagamentoBean0.setId((int) 'a');
        ita.kangaroo.model.AddressBean addressBean3 = new ita.kangaroo.model.AddressBean();
        java.lang.String str4 = addressBean3.getVia();
        addressBean3.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        addressBean3.setCitta("hi!");
        boolean boolean9 = metodoPagamentoBean0.equals((java.lang.Object) addressBean3);
        addressBean3.setCAP("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        ordineBean12.setNumero_carta("");
        java.sql.Date date16 = ordineBean12.getData();
        ordineBean12.setMetodo_di_pagamento("");
        ordineBean12.setNumero_di_tracking("");
        ordineBean12.setPrezzo_totale((float) 100L);
        ordineBean12.setId((int) (short) -1);
        ita.kangaroo.model.utenteBean utenteBean25 = ordineBean12.getClient();
        ordineBean12.setNumero_di_tracking("hi!");
        java.sql.Date date28 = ordineBean12.getData();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertNotNull(utenteBean25);
        org.junit.Assert.assertNull(date28);
    }
}

