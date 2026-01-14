package randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

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
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        float float2 = orderProductBean0.getIVA();
        float float3 = orderProductBean0.getPrezzo();
        orderProductBean0.setQuantita(0);
        int int6 = orderProductBean0.getId_ordine();
        int int7 = orderProductBean0.getQuantita();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        java.lang.String str12 = utenteBean11.getCitta();
        java.lang.String str13 = utenteBean11.getCitta();
        java.lang.String str14 = utenteBean11.getPassword();
        java.lang.String str15 = utenteBean11.getCap();
        java.lang.String str16 = utenteBean11.getNome();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        java.util.ArrayList<ita.kangaroo.model.OrderProductBean> orderProductBeanList14 = ordineBean12.getProducts();
        ordineBean12.setNumero_carta("hi!");
        ita.kangaroo.model.utenteBean utenteBean17 = ordineBean12.getClient();
        java.lang.String str18 = ordineBean12.getNumero_di_tracking();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(orderProductBeanList14);
        org.junit.Assert.assertNotNull(utenteBean17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        ita.kangaroo.model.tipo tipo18 = null;
        ita.kangaroo.model.utenteBean utenteBean24 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo18, "hi!", "", "", "hi!", "");
        utenteBean24.setEmail("hi!");
        utenteBean24.setPassword("hi!");
        java.lang.String str29 = utenteBean24.getCognome();
        ordineBean12.setClient(utenteBean24);
        java.lang.String str31 = ordineBean12.getNumero_carta();
        java.lang.String str32 = ordineBean12.getNumero_carta();
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) -1, "Data non disponibile", "Data non disponibile", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", (float) ' ', (int) ' ', (float) ' ', tipo7);
        ita.kangaroo.model.CartProduct cartProduct9 = new ita.kangaroo.model.CartProduct(prodottoBean8);
        int int10 = prodottoBean8.getQuantita();
        prodottoBean8.setDescrizione("hi!");
        float float13 = prodottoBean8.getIva();
        java.lang.String str14 = prodottoBean8.getImmagine();
        java.lang.String str15 = prodottoBean8.getNome();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 32.0f + "'", float13 == 32.0f);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}" + "'", str14, "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Data non disponibile" + "'", str15, "Data non disponibile");
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        ita.kangaroo.model.MetodoPagamentoBean metodoPagamentoBean0 = new ita.kangaroo.model.MetodoPagamentoBean();
        metodoPagamentoBean0.setId((int) 'a');
        metodoPagamentoBean0.setCircuito("");
        metodoPagamentoBean0.setData_scadenza("hi!");
        java.lang.String str7 = metodoPagamentoBean0.getUsername();
        java.lang.String str8 = metodoPagamentoBean0.getCvv();
        java.lang.String str9 = metodoPagamentoBean0.getCvv();
        metodoPagamentoBean0.setUsername("3d1583397bcebff274b1e7cb58087c39153af974");
        java.lang.String str12 = metodoPagamentoBean0.getData_scadenza();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        ita.kangaroo.model.Cart cart0 = new ita.kangaroo.model.Cart();
        java.util.ArrayList<ita.kangaroo.model.CartProduct> cartProductList1 = cart0.getProducts();
        java.util.ArrayList<ita.kangaroo.model.CartProduct> cartProductList2 = cart0.getProducts();
        java.util.ArrayList<ita.kangaroo.model.CartProduct> cartProductList3 = cart0.getProducts();
        java.util.ArrayList<ita.kangaroo.model.CartProduct> cartProductList4 = cart0.getProducts();
        ita.kangaroo.model.tipo tipo12 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean13 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo12);
        java.lang.String str14 = prodottoBean13.getImmagine();
        prodottoBean13.setPrezzo((float) (-1L));
        int int17 = prodottoBean13.getId();
        float float18 = prodottoBean13.getIva();
        prodottoBean13.setQuantita((int) ' ');
        ita.kangaroo.model.tipo tipo21 = prodottoBean13.getTipo();
        cart0.changeQuantity(prodottoBean13, 0);
        prodottoBean13.setNome("");
        org.junit.Assert.assertNotNull(cartProductList1);
        org.junit.Assert.assertNotNull(cartProductList2);
        org.junit.Assert.assertNotNull(cartProductList3);
        org.junit.Assert.assertNotNull(cartProductList4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 1.0f + "'", float18 == 1.0f);
        org.junit.Assert.assertNull(tipo21);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
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
        java.lang.String str30 = metodoPagamentoBean0.getData_scadenza();
        metodoPagamentoBean0.setData_scadenza("ProdottoBean{id=10, descrizione='hi!', nome='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Data non disponibile" + "'", str30, "Data non disponibile");
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getImmagine();
        prodottoBean8.setPrezzo((float) (-1L));
        int int12 = prodottoBean8.getId();
        prodottoBean8.setPrezzo((float) (-1));
        ita.kangaroo.model.tipo tipo15 = null;
        prodottoBean8.setTipo(tipo15);
        float float17 = prodottoBean8.getIva();
        prodottoBean8.setQuantita((int) (byte) 1);
        ita.kangaroo.model.CartProduct cartProduct21 = new ita.kangaroo.model.CartProduct(prodottoBean8, 1);
        ita.kangaroo.model.CartProduct cartProduct22 = new ita.kangaroo.model.CartProduct(prodottoBean8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 1.0f + "'", float17 == 1.0f);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        ita.kangaroo.model.AddressBean addressBean0 = new ita.kangaroo.model.AddressBean();
        java.lang.String str1 = addressBean0.getVia();
        java.lang.String str2 = addressBean0.getUsername();
        addressBean0.setUsername("hi!");
        addressBean0.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        boolean boolean8 = addressBean0.equals((java.lang.Object) 10L);
        int int9 = addressBean0.getId();
        java.lang.String str10 = addressBean0.getCAP();
        java.lang.String str11 = addressBean0.getCitta();
        java.lang.String str12 = addressBean0.getCitta();
        java.lang.String str13 = addressBean0.getCitta();
        java.lang.String str14 = addressBean0.getCAP();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        ita.kangaroo.model.Cart cart0 = new ita.kangaroo.model.Cart();
        ita.kangaroo.model.tipo tipo8 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean9 = new ita.kangaroo.model.ProdottoBean((int) (byte) 10, "hi!", "hi!", "Data non disponibile", (float) (byte) 10, 10, (float) ' ', tipo8);
        cart0.removeProduct(prodottoBean9);
        ita.kangaroo.model.tipo tipo18 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean19 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo18);
        java.lang.String str20 = prodottoBean19.getDescrizione();
        java.lang.String str21 = prodottoBean19.getDescrizione();
        ita.kangaroo.model.CartProduct cartProduct22 = new ita.kangaroo.model.CartProduct(prodottoBean19);
        ita.kangaroo.model.ProdottoBean prodottoBean23 = cartProduct22.getProduct();
        int int24 = prodottoBean23.getQuantita();
        int int25 = prodottoBean23.getQuantita();
        cart0.removeProduct(prodottoBean23);
        prodottoBean23.setImmagine("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='hi!', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(prodottoBean23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
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
        metodoPagamentoBean0.setId((int) ' ');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
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
        java.lang.String str33 = utenteBean32.getCitta();
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(utenteBean32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}" + "'", str33, "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        ita.kangaroo.model.tipo tipo6 = null;
        ita.kangaroo.model.utenteBean utenteBean12 = new ita.kangaroo.model.utenteBean("", "", "", "", "Data non disponibile", tipo6, "hi!", "", "Data non disponibile", "Data non disponibile", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        java.sql.Date date20 = null;
        ita.kangaroo.model.OrdineBean ordineBean22 = new ita.kangaroo.model.OrdineBean((int) (byte) 10, utenteBean12, (float) 10, "", "", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "", "hi!", "hi!", date20, "Data non disponibile");
        ordineBean22.setIndirizzo_di_spedizione("Data non disponibile");
        java.lang.String str25 = ordineBean22.getIndirizzo_di_spedizione();
        java.lang.String str26 = ordineBean22.toString();
        java.lang.String str27 = ordineBean22.getDestinatario();
        ordineBean22.setId(10);
        ordineBean22.setId((int) (short) -1);
        java.lang.String str32 = ordineBean22.getMetodo_di_pagamento();
        ordineBean22.setMetodo_di_pagamento("Data non disponibile");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Data non disponibile" + "'", str25, "Data non disponibile");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Data non disponibile" + "'", str26, "Data non disponibile");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        utenteBean11.setPassword("hi!");
        utenteBean11.setEmail("hi!");
        utenteBean11.setVia("da39a3ee5e6b4b0d3255bfef95601890afd80709");
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        ita.kangaroo.model.MetodoPagamentoBean metodoPagamentoBean0 = new ita.kangaroo.model.MetodoPagamentoBean();
        metodoPagamentoBean0.setId((int) 'a');
        ita.kangaroo.model.AddressBean addressBean3 = new ita.kangaroo.model.AddressBean();
        java.lang.String str4 = addressBean3.getVia();
        addressBean3.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        addressBean3.setCitta("hi!");
        boolean boolean9 = metodoPagamentoBean0.equals((java.lang.Object) addressBean3);
        java.lang.String str10 = metodoPagamentoBean0.getNumero_carta();
        java.lang.String str11 = metodoPagamentoBean0.getCircuito();
        metodoPagamentoBean0.setCvv("ProdottoBean{id=52, descrizione='hi!', nome='', immagine='da39a3ee5e6b4b0d3255bfef95601890afd80709', prezzo=32.0, quantita=-1, iva=52.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
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
        metodoPagamentoBean0.setCvv("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        int int30 = metodoPagamentoBean0.getId();
        metodoPagamentoBean0.setUsername("3d1583397bcebff274b1e7cb58087c39153af974");
        java.lang.String str33 = metodoPagamentoBean0.getUsername();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 97 + "'", int30 == 97);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "3d1583397bcebff274b1e7cb58087c39153af974" + "'", str33, "3d1583397bcebff274b1e7cb58087c39153af974");
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        ordineBean12.setNumero_carta("");
        java.sql.Date date16 = ordineBean12.getData();
        ita.kangaroo.model.utenteBean utenteBean17 = ordineBean12.getClient();
        utenteBean17.setEmail("hi!");
        utenteBean17.setPassword("3d1583397bcebff274b1e7cb58087c39153af974");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertNotNull(utenteBean17);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        ita.kangaroo.model.MetodoPagamentoBean metodoPagamentoBean0 = new ita.kangaroo.model.MetodoPagamentoBean();
        metodoPagamentoBean0.setId((int) 'a');
        ita.kangaroo.model.AddressBean addressBean3 = new ita.kangaroo.model.AddressBean();
        java.lang.String str4 = addressBean3.getVia();
        addressBean3.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        addressBean3.setCitta("hi!");
        boolean boolean9 = metodoPagamentoBean0.equals((java.lang.Object) addressBean3);
        java.lang.String str10 = addressBean3.getCitta();
        java.lang.String str11 = addressBean3.getUsername();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
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
        java.lang.String str32 = ordineBean27.getMetodo_di_pagamento();
        ordineBean27.setMetodo_di_pagamento("3a987acf8cbc1028b7dbc86bd086831151899a2b");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
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
        ordineBean12.setNumero_di_tracking("Data non disponibile");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        ita.kangaroo.model.CartProduct cartProduct10 = new ita.kangaroo.model.CartProduct(prodottoBean8, (int) (short) 100);
        cartProduct10.setQuantity(100);
        ita.kangaroo.model.ProdottoBean prodottoBean13 = cartProduct10.getProduct();
        org.junit.Assert.assertNotNull(prodottoBean13);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) -1, "Data non disponibile", "Data non disponibile", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", (float) ' ', (int) ' ', (float) ' ', tipo7);
        ita.kangaroo.model.CartProduct cartProduct9 = new ita.kangaroo.model.CartProduct(prodottoBean8);
        ita.kangaroo.model.CartProduct cartProduct10 = new ita.kangaroo.model.CartProduct(prodottoBean8);
        int int11 = prodottoBean8.getId();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
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
        metodoPagamentoBean0.setCvv("da39a3ee5e6b4b0d3255bfef95601890afd80709");
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
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
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
        metodoPagamentoBean0.setCvv("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        metodoPagamentoBean0.setCircuito("ProdottoBean{id=-1, descrizione='Data non disponibile', nome='Data non disponibile', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=32.0, quantita=32, iva=32.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
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
        int int46 = ordineBean12.getId();
        ordineBean12.setMetodo_di_spedizione("hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(orderProductBeanList44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
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
        ordineBean12.setNumero_di_tracking("");
        ita.kangaroo.model.AddressBean addressBean26 = new ita.kangaroo.model.AddressBean();
        java.lang.String str27 = addressBean26.getVia();
        java.lang.String str28 = addressBean26.getUsername();
        addressBean26.setUsername("hi!");
        addressBean26.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        boolean boolean34 = addressBean26.equals((java.lang.Object) 10L);
        int int35 = addressBean26.getId();
        java.lang.String str36 = addressBean26.getUsername();
        int int37 = addressBean26.getId();
        ita.kangaroo.model.tipo tipo43 = null;
        ita.kangaroo.model.utenteBean utenteBean49 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo43, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean50 = new ita.kangaroo.model.OrdineBean(utenteBean49);
        java.lang.String str51 = ordineBean50.getMetodo_di_spedizione();
        ordineBean50.setNumero_carta("");
        java.sql.Date date54 = ordineBean50.getData();
        ordineBean50.setPrezzo_totale((float) 'a');
        java.lang.String str57 = ordineBean50.getNumero_carta();
        ita.kangaroo.model.tipo tipo63 = null;
        ita.kangaroo.model.utenteBean utenteBean69 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo63, "hi!", "", "", "hi!", "");
        java.lang.String str70 = utenteBean69.getUsername();
        java.lang.String str71 = utenteBean69.getCap();
        utenteBean69.setUsername("");
        ita.kangaroo.model.OrdineBean ordineBean74 = new ita.kangaroo.model.OrdineBean(utenteBean69);
        ordineBean74.setCircuito("");
        java.util.ArrayList<ita.kangaroo.model.OrderProductBean> orderProductBeanList77 = ordineBean74.getProducts();
        ordineBean50.setProducts(orderProductBeanList77);
        boolean boolean79 = addressBean26.equals((java.lang.Object) orderProductBeanList77);
        ordineBean12.setProducts(orderProductBeanList77);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNull(date54);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!" + "'", str70, "hi!");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertNotNull(orderProductBeanList77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        ordineBean12.setIndirizzo_di_spedizione("Data non disponibile");
        java.lang.String str15 = ordineBean12.getMetodo_di_pagamento();
        java.lang.String str16 = ordineBean12.getNumero_di_tracking();
        java.lang.String str17 = ordineBean12.toString();
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Data non disponibile" + "'", str17, "Data non disponibile");
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("Data non disponibile", "Data non disponibile", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "Data non disponibile", "", tipo5, "hi!", "", "hi!", "hi!", "");
        java.lang.String str12 = utenteBean11.getNome();
        utenteBean11.setCap("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Data non disponibile" + "'", str12, "Data non disponibile");
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
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
        ordineBean16.setPrezzo_totale((float) (byte) 0);
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
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        int int2 = orderProductBean0.getId_prodotto();
        orderProductBean0.setIVA((float) 1L);
        int int5 = orderProductBean0.getQuantita();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
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
        ita.kangaroo.model.utenteBean utenteBean25 = ordineBean12.getClient();
        ordineBean12.setMetodo_di_pagamento("");
        ita.kangaroo.model.OrderProductBean orderProductBean28 = new ita.kangaroo.model.OrderProductBean();
        float float29 = orderProductBean28.getIVA();
        orderProductBean28.setQuantita((int) (byte) 100);
        ita.kangaroo.model.OrderProductBean orderProductBean32 = new ita.kangaroo.model.OrderProductBean();
        float float33 = orderProductBean32.getIVA();
        float float34 = orderProductBean32.getIVA();
        orderProductBean32.setPrezzo(10.0f);
        int int37 = orderProductBean32.getQuantita();
        ita.kangaroo.model.OrderProductBean orderProductBean38 = new ita.kangaroo.model.OrderProductBean();
        float float39 = orderProductBean38.getIVA();
        float float40 = orderProductBean38.getIVA();
        float float41 = orderProductBean38.getPrezzo();
        ita.kangaroo.model.OrderProductBean orderProductBean42 = new ita.kangaroo.model.OrderProductBean();
        float float43 = orderProductBean42.getIVA();
        float float44 = orderProductBean42.getIVA();
        float float45 = orderProductBean42.getPrezzo();
        ita.kangaroo.model.OrderProductBean orderProductBean46 = new ita.kangaroo.model.OrderProductBean();
        float float47 = orderProductBean46.getIVA();
        float float48 = orderProductBean46.getIVA();
        float float49 = orderProductBean46.getPrezzo();
        ita.kangaroo.model.OrderProductBean orderProductBean50 = new ita.kangaroo.model.OrderProductBean();
        float float51 = orderProductBean50.getIVA();
        int int52 = orderProductBean50.getId_ordine();
        orderProductBean50.setQuantita((int) 'a');
        float float55 = orderProductBean50.getIVA();
        ita.kangaroo.model.OrderProductBean orderProductBean56 = new ita.kangaroo.model.OrderProductBean();
        float float57 = orderProductBean56.getIVA();
        float float58 = orderProductBean56.getIVA();
        ita.kangaroo.model.OrderProductBean orderProductBean59 = new ita.kangaroo.model.OrderProductBean();
        float float60 = orderProductBean59.getIVA();
        float float61 = orderProductBean59.getIVA();
        float float62 = orderProductBean59.getPrezzo();
        int int63 = orderProductBean59.getQuantita();
        ita.kangaroo.model.OrderProductBean orderProductBean64 = new ita.kangaroo.model.OrderProductBean();
        float float65 = orderProductBean64.getIVA();
        float float66 = orderProductBean64.getIVA();
        orderProductBean64.setPrezzo(10.0f);
        int int69 = orderProductBean64.getQuantita();
        ita.kangaroo.model.OrderProductBean orderProductBean70 = new ita.kangaroo.model.OrderProductBean();
        ita.kangaroo.model.OrderProductBean orderProductBean71 = new ita.kangaroo.model.OrderProductBean();
        ita.kangaroo.model.OrderProductBean orderProductBean72 = new ita.kangaroo.model.OrderProductBean();
        float float73 = orderProductBean72.getIVA();
        int int74 = orderProductBean72.getId_ordine();
        orderProductBean72.setQuantita((int) 'a');
        int int77 = orderProductBean72.getId_ordine();
        ita.kangaroo.model.OrderProductBean[] orderProductBeanArray78 = new ita.kangaroo.model.OrderProductBean[] { orderProductBean28, orderProductBean32, orderProductBean38, orderProductBean42, orderProductBean46, orderProductBean50, orderProductBean56, orderProductBean59, orderProductBean64, orderProductBean70, orderProductBean71, orderProductBean72 };
        java.util.ArrayList<ita.kangaroo.model.OrderProductBean> orderProductBeanList79 = new java.util.ArrayList<ita.kangaroo.model.OrderProductBean>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<ita.kangaroo.model.OrderProductBean>) orderProductBeanList79, orderProductBeanArray78);
        ita.kangaroo.model.OrdineBean ordineBean81 = new ita.kangaroo.model.OrdineBean(orderProductBeanList79);
        ordineBean12.setProducts(orderProductBeanList79);
        java.lang.String str83 = ordineBean12.getNumero_di_tracking();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertNotNull(utenteBean25);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 0.0f + "'", float29 == 0.0f);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 0.0f + "'", float33 == 0.0f);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 0.0f + "'", float34 == 0.0f);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 0.0f + "'", float39 == 0.0f);
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + 0.0f + "'", float40 == 0.0f);
        org.junit.Assert.assertTrue("'" + float41 + "' != '" + 0.0f + "'", float41 == 0.0f);
        org.junit.Assert.assertTrue("'" + float43 + "' != '" + 0.0f + "'", float43 == 0.0f);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 0.0f + "'", float44 == 0.0f);
        org.junit.Assert.assertTrue("'" + float45 + "' != '" + 0.0f + "'", float45 == 0.0f);
        org.junit.Assert.assertTrue("'" + float47 + "' != '" + 0.0f + "'", float47 == 0.0f);
        org.junit.Assert.assertTrue("'" + float48 + "' != '" + 0.0f + "'", float48 == 0.0f);
        org.junit.Assert.assertTrue("'" + float49 + "' != '" + 0.0f + "'", float49 == 0.0f);
        org.junit.Assert.assertTrue("'" + float51 + "' != '" + 0.0f + "'", float51 == 0.0f);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + float55 + "' != '" + 0.0f + "'", float55 == 0.0f);
        org.junit.Assert.assertTrue("'" + float57 + "' != '" + 0.0f + "'", float57 == 0.0f);
        org.junit.Assert.assertTrue("'" + float58 + "' != '" + 0.0f + "'", float58 == 0.0f);
        org.junit.Assert.assertTrue("'" + float60 + "' != '" + 0.0f + "'", float60 == 0.0f);
        org.junit.Assert.assertTrue("'" + float61 + "' != '" + 0.0f + "'", float61 == 0.0f);
        org.junit.Assert.assertTrue("'" + float62 + "' != '" + 0.0f + "'", float62 == 0.0f);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + float65 + "' != '" + 0.0f + "'", float65 == 0.0f);
        org.junit.Assert.assertTrue("'" + float66 + "' != '" + 0.0f + "'", float66 == 0.0f);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + float73 + "' != '" + 0.0f + "'", float73 == 0.0f);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertNotNull(orderProductBeanArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "hi!" + "'", str83, "hi!");
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
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
        float float22 = prodottoBean8.getIva();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 1.0f + "'", float17 == 1.0f);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 10.0f + "'", float22 == 10.0f);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        ita.kangaroo.model.AddressBean addressBean0 = new ita.kangaroo.model.AddressBean();
        java.lang.String str1 = addressBean0.getVia();
        addressBean0.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        addressBean0.setCitta("hi!");
        addressBean0.setVia("da39a3ee5e6b4b0d3255bfef95601890afd80709");
        addressBean0.setCitta("Data non disponibile");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getImmagine();
        prodottoBean8.setPrezzo((float) (-1L));
        int int12 = prodottoBean8.getId();
        float float13 = prodottoBean8.getIva();
        prodottoBean8.setIva((float) ' ');
        prodottoBean8.setIva((float) '#');
        int int18 = prodottoBean8.getQuantita();
        ita.kangaroo.model.tipo tipo19 = prodottoBean8.getTipo();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(tipo19);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        ita.kangaroo.model.MetodoPagamentoBean metodoPagamentoBean0 = new ita.kangaroo.model.MetodoPagamentoBean();
        metodoPagamentoBean0.setId((int) 'a');
        metodoPagamentoBean0.setCircuito("");
        metodoPagamentoBean0.setData_scadenza("hi!");
        metodoPagamentoBean0.setId((int) '4');
        java.lang.String str9 = metodoPagamentoBean0.getUsername();
        java.lang.String str10 = metodoPagamentoBean0.getData_scadenza();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
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
        addressBean0.setUsername("ProdottoBean{id=52, descrizione='hi!', nome='', immagine='da39a3ee5e6b4b0d3255bfef95601890afd80709', prezzo=32.0, quantita=-1, iva=52.0, tipo=null}");
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
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) -1, "Data non disponibile", "Data non disponibile", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", (float) ' ', (int) ' ', (float) ' ', tipo7);
        ita.kangaroo.model.CartProduct cartProduct9 = new ita.kangaroo.model.CartProduct(prodottoBean8);
        java.lang.Class<?> wildcardClass10 = prodottoBean8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.utenteBean utenteBean13 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo7, "hi!", "", "", "hi!", "");
        utenteBean13.setEmail("hi!");
        java.lang.String str16 = utenteBean13.getCognome();
        java.sql.Date date24 = null;
        ita.kangaroo.model.OrdineBean ordineBean26 = new ita.kangaroo.model.OrdineBean((int) (byte) 10, utenteBean13, (float) (-1L), "Data non disponibile", "Data non disponibile", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "hi!", "hi!", "", date24, "Data non disponibile");
        ita.kangaroo.model.tipo tipo27 = utenteBean13.getTipo();
        java.sql.Date date35 = null;
        ita.kangaroo.model.OrdineBean ordineBean37 = new ita.kangaroo.model.OrdineBean(1, utenteBean13, (float) 0L, "", "Data non disponibile", "hi!", "hi!", "", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", date35, "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        ordineBean37.setMetodo_di_spedizione("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(tipo27);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
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
        ita.kangaroo.model.ProdottoBean prodottoBean32 = new ita.kangaroo.model.ProdottoBean((int) '4', "da39a3ee5e6b4b0d3255bfef95601890afd80709", "", "da39a3ee5e6b4b0d3255bfef95601890afd80709", 32.0f, (-1), (float) '4', tipo31);
        prodottoBean32.setDescrizione("hi!");
        float float35 = prodottoBean32.getPrezzo();
        cart0.changeQuantity(prodottoBean32, (int) (short) 10);
        java.util.ArrayList<ita.kangaroo.model.CartProduct> cartProductList38 = cart0.getProducts();
        java.util.ArrayList<ita.kangaroo.model.CartProduct> cartProductList39 = cart0.getProducts();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 32.0f + "'", float35 == 32.0f);
        org.junit.Assert.assertNotNull(cartProductList38);
        org.junit.Assert.assertNotNull(cartProductList39);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
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
        ita.kangaroo.model.tipo tipo90 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean91 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo90);
        int int92 = prodottoBean91.getId();
        java.lang.String str93 = prodottoBean91.getImmagine();
        cart0.addProduct(prodottoBean91);
        ita.kangaroo.model.CartProduct cartProduct96 = new ita.kangaroo.model.CartProduct(prodottoBean91, (int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 1 + "'", int92 == 1);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "hi!" + "'", str93, "hi!");
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        float float2 = orderProductBean0.getIVA();
        float float3 = orderProductBean0.getPrezzo();
        int int4 = orderProductBean0.getId_ordine();
        float float5 = orderProductBean0.getIVA();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
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
        ita.kangaroo.model.utenteBean utenteBean35 = ordineBean29.getClient();
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(utenteBean32);
        org.junit.Assert.assertNotNull(utenteBean35);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        ita.kangaroo.model.tipo tipo6 = null;
        ita.kangaroo.model.utenteBean utenteBean12 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo6, "hi!", "", "", "hi!", "");
        utenteBean12.setEmail("hi!");
        java.lang.String str15 = utenteBean12.getCognome();
        utenteBean12.setCitta("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        utenteBean12.setUsername("Data non disponibile");
        java.sql.Date date27 = null;
        ita.kangaroo.model.OrdineBean ordineBean29 = new ita.kangaroo.model.OrdineBean(0, utenteBean12, (float) (byte) 0, "", "", "Data non disponibile", "Data non disponibile", "hi!", "", date27, "Data non disponibile");
        ordineBean29.setMetodo_di_pagamento("Data non disponibile");
        ordineBean29.setPrezzo_totale((float) (byte) 100);
        ita.kangaroo.model.tipo tipo39 = null;
        ita.kangaroo.model.utenteBean utenteBean45 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo39, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean46 = new ita.kangaroo.model.OrdineBean(utenteBean45);
        java.lang.String str47 = ordineBean46.getMetodo_di_spedizione();
        ordineBean46.setNumero_carta("");
        java.sql.Date date50 = ordineBean46.getData();
        ordineBean46.setMetodo_di_pagamento("");
        ordineBean46.setNumero_di_tracking("");
        ordineBean46.setNumero_di_tracking("hi!");
        ordineBean46.setMetodo_di_spedizione("hi!");
        ita.kangaroo.model.tipo tipo64 = null;
        ita.kangaroo.model.utenteBean utenteBean70 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo64, "hi!", "", "", "hi!", "");
        java.lang.String str71 = utenteBean70.getUsername();
        java.lang.String str72 = utenteBean70.getCap();
        utenteBean70.setUsername("");
        ita.kangaroo.model.OrdineBean ordineBean75 = new ita.kangaroo.model.OrdineBean(utenteBean70);
        ordineBean75.setCircuito("");
        java.util.ArrayList<ita.kangaroo.model.OrderProductBean> orderProductBeanList78 = ordineBean75.getProducts();
        ordineBean46.setProducts(orderProductBeanList78);
        ita.kangaroo.model.OrdineBean ordineBean80 = new ita.kangaroo.model.OrdineBean(orderProductBeanList78);
        ordineBean29.setProducts(orderProductBeanList78);
        java.lang.String str82 = ordineBean29.getCircuito();
        ordineBean29.setNumero_di_tracking("");
        java.lang.String str85 = ordineBean29.getNumero_carta();
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNull(date50);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!" + "'", str71, "hi!");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertNotNull(orderProductBeanList78);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "Data non disponibile" + "'", str82, "Data non disponibile");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "Data non disponibile" + "'", str85, "Data non disponibile");
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = utenteBean11.getNome();
        utenteBean11.setEmail("hi!");
        utenteBean11.setTelefono("3a987acf8cbc1028b7dbc86bd086831151899a2b");
        utenteBean11.setUsername("ProdottoBean{id=-1, descrizione='Data non disponibile', nome='Data non disponibile', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=32.0, quantita=32, iva=32.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        ita.kangaroo.model.AddressBean addressBean0 = new ita.kangaroo.model.AddressBean();
        java.lang.String str1 = addressBean0.getVia();
        java.lang.String str2 = addressBean0.getUsername();
        addressBean0.setUsername("hi!");
        addressBean0.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        addressBean0.setUsername("hi!");
        java.lang.String str9 = addressBean0.getCAP();
        java.lang.String str10 = addressBean0.getCitta();
        int int11 = addressBean0.getId();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        ita.kangaroo.model.MetodoPagamentoBean metodoPagamentoBean0 = new ita.kangaroo.model.MetodoPagamentoBean();
        metodoPagamentoBean0.setData_scadenza("3d1583397bcebff274b1e7cb58087c39153af974");
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 10, "hi!", "hi!", "Data non disponibile", (float) (byte) 10, 10, (float) ' ', tipo7);
        prodottoBean8.setNome("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        int int11 = prodottoBean8.getQuantita();
        ita.kangaroo.model.tipo tipo12 = null;
        prodottoBean8.setTipo(tipo12);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getImmagine();
        prodottoBean8.setPrezzo((float) (-1L));
        int int12 = prodottoBean8.getId();
        float float13 = prodottoBean8.getIva();
        int int14 = prodottoBean8.getId();
        prodottoBean8.setPrezzo((float) (byte) 10);
        prodottoBean8.setDescrizione("hi!");
        prodottoBean8.setId((int) '4');
        java.lang.String str21 = prodottoBean8.getImmagine();
        prodottoBean8.setImmagine("hi!");
        int int24 = prodottoBean8.getId();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        ita.kangaroo.model.tipo tipo6 = null;
        ita.kangaroo.model.utenteBean utenteBean12 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo6, "hi!", "", "", "hi!", "");
        java.lang.String str13 = utenteBean12.getVia();
        java.lang.String str14 = utenteBean12.getProvincia();
        java.sql.Date date22 = null;
        ita.kangaroo.model.OrdineBean ordineBean24 = new ita.kangaroo.model.OrdineBean((int) (byte) 10, utenteBean12, (float) ' ', "ProdottoBean{id=10, descrizione='hi!', nome='', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}", "3a987acf8cbc1028b7dbc86bd086831151899a2b", "hi!", "da39a3ee5e6b4b0d3255bfef95601890afd80709", "ProdottoBean{id=10, descrizione='hi!', nome='', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}", "", date22, "3a987acf8cbc1028b7dbc86bd086831151899a2b");
        java.lang.String str25 = utenteBean12.getPassword();
        java.lang.String str26 = utenteBean12.getCap();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        java.lang.String str12 = utenteBean11.getUsername();
        java.lang.String str13 = utenteBean11.getCap();
        utenteBean11.setCap("da39a3ee5e6b4b0d3255bfef95601890afd80709");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "", "", "hi!", "hi!", "hi!");
        java.lang.String str12 = utenteBean11.getPassword();
        utenteBean11.setProvincia("Data non disponibile");
        utenteBean11.setProvincia("ProdottoBean{id=0, descrizione='', nome='', immagine='', prezzo=0.0, quantita=0, iva=0.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getDestinatario();
        java.lang.String str14 = ordineBean12.toString();
        ita.kangaroo.model.utenteBean utenteBean15 = ordineBean12.getClient();
        java.lang.String str16 = utenteBean15.getCognome();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Data non disponibile" + "'", str14, "Data non disponibile");
        org.junit.Assert.assertNotNull(utenteBean15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        int int2 = orderProductBean0.getId_ordine();
        orderProductBean0.setQuantita((int) 'a');
        int int5 = orderProductBean0.getId_ordine();
        int int6 = orderProductBean0.getId_ordine();
        float float7 = orderProductBean0.getPrezzo();
        orderProductBean0.setId_prodotto((int) (byte) 1);
        float float10 = orderProductBean0.getPrezzo();
        int int11 = orderProductBean0.getId_ordine();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getImmagine();
        prodottoBean8.setPrezzo((float) (-1L));
        int int12 = prodottoBean8.getId();
        prodottoBean8.setPrezzo(10.0f);
        prodottoBean8.setPrezzo(0.0f);
        int int17 = prodottoBean8.getQuantita();
        float float18 = prodottoBean8.getIva();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 1.0f + "'", float18 == 1.0f);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("", "hi!", "", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", tipo5, "", "hi!", "", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "");
        java.lang.String str12 = utenteBean11.getCognome();
        ita.kangaroo.model.OrdineBean ordineBean13 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        utenteBean11.setTelefono("ProdottoBean{id=10, descrizione='hi!', nome='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
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
        metodoPagamentoBean0.setNumero_carta("ProdottoBean{id=52, descrizione='hi!', nome='', immagine='da39a3ee5e6b4b0d3255bfef95601890afd80709', prezzo=32.0, quantita=-1, iva=52.0, tipo=null}");
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
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
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
        ita.kangaroo.model.ProdottoBean prodottoBean78 = null;
        // The following exception was thrown during execution in test generation
        try {
            cart0.removeProduct(prodottoBean78);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ita.kangaroo.model.ProdottoBean.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        boolean boolean1 = ita.kangaroo.model.AddressBean.isValidCAP("ProdottoBean{id=10, descrizione='hi!', nome='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        java.lang.String str12 = utenteBean11.getProvincia();
        java.lang.String str13 = utenteBean11.getCognome();
        java.lang.String str14 = utenteBean11.getVia();
        utenteBean11.setCognome("Data non disponibile");
        java.lang.String str17 = utenteBean11.getTelefono();
        ita.kangaroo.model.tipo tipo18 = utenteBean11.getTipo();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(tipo18);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        java.lang.String str12 = utenteBean11.getUsername();
        java.lang.String str13 = utenteBean11.getCap();
        utenteBean11.setUsername("");
        ita.kangaroo.model.OrdineBean ordineBean16 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        utenteBean11.setUsername("");
        ita.kangaroo.model.OrdineBean ordineBean19 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        utenteBean11.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "", "", "hi!", "hi!", "hi!");
        java.lang.String str12 = utenteBean11.getPassword();
        utenteBean11.setProvincia("Data non disponibile");
        utenteBean11.setCognome("hi!");
        utenteBean11.setNome("");
        java.lang.String str19 = utenteBean11.getPassword();
        utenteBean11.setNome("ProdottoBean{id=32, descrizione='Data non disponibile', nome='Data non disponibile', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=32.0, quantita=32, iva=10.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        float float2 = orderProductBean0.getIVA();
        orderProductBean0.setPrezzo(10.0f);
        orderProductBean0.setPrezzo(97.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        ordineBean12.setNumero_carta("");
        ita.kangaroo.model.tipo tipo21 = null;
        ita.kangaroo.model.utenteBean utenteBean27 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo21, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean28 = new ita.kangaroo.model.OrdineBean(utenteBean27);
        java.lang.String str29 = ordineBean28.getMetodo_di_spedizione();
        ordineBean28.setNumero_carta("");
        java.sql.Date date32 = ordineBean28.getData();
        int int33 = ordineBean28.getId();
        ita.kangaroo.model.tipo tipo39 = null;
        ita.kangaroo.model.utenteBean utenteBean45 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo39, "hi!", "", "", "hi!", "");
        java.lang.String str46 = utenteBean45.getProvincia();
        java.lang.String str47 = utenteBean45.getCognome();
        ordineBean28.setClient(utenteBean45);
        java.lang.String str49 = utenteBean45.getCap();
        ordineBean12.setClient(utenteBean45);
        ordineBean12.setPrezzo_totale((float) ' ');
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(date32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        orderProductBean0.setQuantita((int) (byte) 100);
        orderProductBean0.setId_ordine((int) (byte) 0);
        orderProductBean0.setPrezzo((float) 100L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        utenteBean11.setEmail("hi!");
        utenteBean11.setPassword("hi!");
        utenteBean11.setProvincia("hi!");
        utenteBean11.setUsername("hi!");
        java.lang.String str20 = utenteBean11.getTelefono();
        java.lang.String str21 = utenteBean11.getTelefono();
        ita.kangaroo.model.OrdineBean ordineBean22 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str23 = utenteBean11.getCognome();
        utenteBean11.setCognome("Data non disponibile");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
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
        utenteBean44.setProvincia("Data non disponibile");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        java.lang.String str12 = utenteBean11.getUsername();
        java.lang.String str13 = utenteBean11.getCap();
        utenteBean11.setUsername("");
        ita.kangaroo.model.OrdineBean ordineBean16 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        ordineBean16.setCircuito("");
        java.lang.String str19 = ordineBean16.getNumero_carta();
        java.lang.String str20 = ordineBean16.getMetodo_di_pagamento();
        java.lang.String str21 = ordineBean16.getCircuito();
        ordineBean16.setIndirizzo_di_spedizione("ProdottoBean{id=52, descrizione='hi!', nome='', immagine='da39a3ee5e6b4b0d3255bfef95601890afd80709', prezzo=32.0, quantita=-1, iva=52.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        ita.kangaroo.model.tipo tipo6 = null;
        ita.kangaroo.model.utenteBean utenteBean12 = new ita.kangaroo.model.utenteBean("ProdottoBean{id=10, descrizione='hi!', nome='', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}", "3a987acf8cbc1028b7dbc86bd086831151899a2b", "Data non disponibile", "3a987acf8cbc1028b7dbc86bd086831151899a2b", "da39a3ee5e6b4b0d3255bfef95601890afd80709", tipo6, "Data non disponibile", "3a987acf8cbc1028b7dbc86bd086831151899a2b", "", "ProdottoBean{id=10, descrizione='hi!', nome='', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}", "");
        java.sql.Date date20 = null;
        ita.kangaroo.model.OrdineBean ordineBean22 = new ita.kangaroo.model.OrdineBean((int) (byte) 1, utenteBean12, 32.0f, "ProdottoBean{id=-1, descrizione='Data non disponibile', nome='Data non disponibile', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=32.0, quantita=32, iva=32.0, tipo=null}", "ProdottoBean{id=10, descrizione='hi!', nome='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}", "ProdottoBean{id=-1, descrizione='Data non disponibile', nome='Data non disponibile', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=32.0, quantita=32, iva=32.0, tipo=null}", "da39a3ee5e6b4b0d3255bfef95601890afd80709", "ProdottoBean{id=10, descrizione='hi!', nome='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}", "", date20, "");
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        ita.kangaroo.model.tipo tipo6 = null;
        ita.kangaroo.model.utenteBean utenteBean12 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo6, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean13 = new ita.kangaroo.model.OrdineBean(utenteBean12);
        utenteBean12.setPassword("hi!");
        utenteBean12.setNome("hi!");
        java.sql.Date date25 = null;
        ita.kangaroo.model.OrdineBean ordineBean27 = new ita.kangaroo.model.OrdineBean((int) (byte) 100, utenteBean12, (float) (-1L), "hi!", "", "", "hi!", "Data non disponibile", "hi!", date25, "");
        ordineBean27.setIndirizzo_di_spedizione("Data non disponibile");
        java.lang.String str30 = ordineBean27.getDestinatario();
        ordineBean27.setId((int) (byte) 1);
        java.sql.Date date33 = ordineBean27.getData();
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNull(date33);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        java.lang.String str12 = utenteBean11.getUsername();
        java.lang.String str13 = utenteBean11.getCap();
        utenteBean11.setUsername("");
        ita.kangaroo.model.OrdineBean ordineBean16 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        ordineBean16.setCircuito("");
        java.util.ArrayList<ita.kangaroo.model.OrderProductBean> orderProductBeanList19 = ordineBean16.getProducts();
        ita.kangaroo.model.OrdineBean ordineBean20 = new ita.kangaroo.model.OrdineBean(orderProductBeanList19);
        ordineBean20.setDestinatario("ProdottoBean{id=10, descrizione='hi!', nome='', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(orderProductBeanList19);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        float float2 = orderProductBean0.getIVA();
        orderProductBean0.setPrezzo(10.0f);
        orderProductBean0.setQuantita((int) (short) -1);
        int int7 = orderProductBean0.getQuantita();
        orderProductBean0.setQuantita((int) (byte) 1);
        int int10 = orderProductBean0.getQuantita();
        float float11 = orderProductBean0.getIVA();
        orderProductBean0.setPrezzo((float) (short) -1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "", "", "hi!", "hi!", "hi!");
        java.lang.String str12 = utenteBean11.getPassword();
        utenteBean11.setProvincia("Data non disponibile");
        utenteBean11.setCognome("hi!");
        java.lang.String str17 = utenteBean11.getPassword();
        utenteBean11.setCap("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='hi!', prezzo=-1.0, quantita=-1, iva=1.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getImmagine();
        prodottoBean8.setPrezzo((float) (-1L));
        int int12 = prodottoBean8.getId();
        float float13 = prodottoBean8.getIva();
        prodottoBean8.setQuantita((int) ' ');
        java.lang.String str16 = prodottoBean8.toString();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='hi!', prezzo=-1.0, quantita=32, iva=1.0, tipo=null}" + "'", str16, "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='hi!', prezzo=-1.0, quantita=32, iva=1.0, tipo=null}");
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        ita.kangaroo.model.AddressBean addressBean0 = new ita.kangaroo.model.AddressBean();
        addressBean0.setId((int) (byte) -1);
        int int3 = addressBean0.getId();
        addressBean0.setCAP("3d1583397bcebff274b1e7cb58087c39153af974");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getDescrizione();
        java.lang.String str10 = prodottoBean8.getNome();
        int int11 = prodottoBean8.getQuantita();
        prodottoBean8.setDescrizione("hi!");
        ita.kangaroo.model.tipo tipo14 = null;
        prodottoBean8.setTipo(tipo14);
        ita.kangaroo.model.CartProduct cartProduct16 = new ita.kangaroo.model.CartProduct(prodottoBean8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        ordineBean12.setIndirizzo_di_spedizione("Data non disponibile");
        ordineBean12.setPrezzo_totale((float) (byte) 10);
        java.sql.Date date17 = ordineBean12.getData();
        ordineBean12.setIndirizzo_di_spedizione("hi!");
        ordineBean12.setMetodo_di_spedizione("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        ordineBean12.setNumero_di_tracking("ProdottoBean{id=-1, descrizione='Data non disponibile', nome='Data non disponibile', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=32.0, quantita=32, iva=32.0, tipo=null}");
        org.junit.Assert.assertNull(date17);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
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
        java.lang.String str17 = metodoPagamentoBean0.getCircuito();
        metodoPagamentoBean0.setCvv("Data non disponibile");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        ita.kangaroo.model.tipo tipo6 = null;
        ita.kangaroo.model.utenteBean utenteBean12 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo6, "hi!", "", "", "hi!", "");
        utenteBean12.setEmail("hi!");
        java.lang.String str15 = utenteBean12.getCognome();
        java.sql.Date date23 = null;
        ita.kangaroo.model.OrdineBean ordineBean25 = new ita.kangaroo.model.OrdineBean((int) (byte) 10, utenteBean12, (float) (-1L), "Data non disponibile", "Data non disponibile", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "hi!", "hi!", "", date23, "Data non disponibile");
        java.lang.String str26 = ordineBean25.toString();
        java.sql.Date date27 = ordineBean25.getData();
        ordineBean25.setMetodo_di_spedizione("");
        ordineBean25.setMetodo_di_pagamento("ProdottoBean{id=0, descrizione='', nome='', immagine='', prezzo=0.0, quantita=0, iva=0.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Data non disponibile" + "'", str26, "Data non disponibile");
        org.junit.Assert.assertNull(date27);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        float float13 = ordineBean12.getPrezzo_totale();
        java.lang.String str14 = ordineBean12.getMetodo_di_pagamento();
        java.lang.String str15 = ordineBean12.getCircuito();
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        ita.kangaroo.model.AddressBean addressBean0 = new ita.kangaroo.model.AddressBean();
        java.lang.String str1 = addressBean0.getVia();
        java.lang.String str2 = addressBean0.getUsername();
        java.lang.String str3 = addressBean0.getCAP();
        java.lang.String str4 = addressBean0.getUsername();
        addressBean0.setId(10);
        int int7 = addressBean0.getId();
        java.lang.String str8 = addressBean0.getUsername();
        java.lang.String str9 = addressBean0.getUsername();
        addressBean0.setUsername("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
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
        ordineBean81.setMetodo_di_spedizione("ProdottoBean{id=10, descrizione='hi!', nome='', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}");
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
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        ita.kangaroo.model.MetodoPagamentoBean metodoPagamentoBean0 = new ita.kangaroo.model.MetodoPagamentoBean();
        metodoPagamentoBean0.setId((int) 'a');
        ita.kangaroo.model.AddressBean addressBean3 = new ita.kangaroo.model.AddressBean();
        java.lang.String str4 = addressBean3.getVia();
        addressBean3.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        addressBean3.setCitta("hi!");
        boolean boolean9 = metodoPagamentoBean0.equals((java.lang.Object) addressBean3);
        java.lang.String str10 = metodoPagamentoBean0.getNumero_carta();
        java.lang.String str11 = metodoPagamentoBean0.getNumero_carta();
        java.lang.String str12 = metodoPagamentoBean0.getCvv();
        metodoPagamentoBean0.setUsername("hi!");
        java.lang.String str15 = metodoPagamentoBean0.getCvv();
        java.lang.String str16 = metodoPagamentoBean0.getUsername();
        java.lang.String str17 = metodoPagamentoBean0.getCircuito();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        utenteBean11.setEmail("hi!");
        utenteBean11.setPassword("hi!");
        ita.kangaroo.model.tipo tipo16 = null;
        utenteBean11.setTipo(tipo16);
        utenteBean11.setCitta("Data non disponibile");
        utenteBean11.setProvincia("Data non disponibile");
        utenteBean11.setNome("");
        utenteBean11.setCognome("Data non disponibile");
        utenteBean11.setEmail("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='hi!', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        ita.kangaroo.model.tipo tipo6 = null;
        ita.kangaroo.model.utenteBean utenteBean12 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo6, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean13 = new ita.kangaroo.model.OrdineBean(utenteBean12);
        utenteBean12.setPassword("hi!");
        utenteBean12.setNome("hi!");
        java.sql.Date date25 = null;
        ita.kangaroo.model.OrdineBean ordineBean27 = new ita.kangaroo.model.OrdineBean((int) (byte) 100, utenteBean12, (float) (-1L), "hi!", "", "", "hi!", "Data non disponibile", "hi!", date25, "");
        ita.kangaroo.model.tipo tipo28 = utenteBean12.getTipo();
        ita.kangaroo.model.tipo tipo29 = null;
        utenteBean12.setTipo(tipo29);
        org.junit.Assert.assertNull(tipo28);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        float float2 = orderProductBean0.getIVA();
        orderProductBean0.setPrezzo(10.0f);
        orderProductBean0.setQuantita((int) (short) -1);
        int int7 = orderProductBean0.getQuantita();
        orderProductBean0.setId_ordine((int) 'a');
        orderProductBean0.setId_prodotto((int) (byte) -1);
        float float12 = orderProductBean0.getIVA();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
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
        java.lang.String str22 = prodottoBean8.toString();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 1.0f + "'", float17 == 1.0f);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ProdottoBean{id=1, descrizione='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', nome='hi!', immagine='hi!', prezzo=0.0, quantita=-1, iva=1.0, tipo=null}" + "'", str22, "ProdottoBean{id=1, descrizione='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', nome='hi!', immagine='hi!', prezzo=0.0, quantita=-1, iva=1.0, tipo=null}");
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
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
        metodoPagamentoBean0.setNumero_carta("ProdottoBean{id=10, descrizione='hi!', nome='', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}");
        ita.kangaroo.model.tipo tipo25 = null;
        ita.kangaroo.model.utenteBean utenteBean31 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo25, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean32 = new ita.kangaroo.model.OrdineBean(utenteBean31);
        java.lang.String str33 = ordineBean32.getDestinatario();
        java.lang.String str34 = ordineBean32.toString();
        ordineBean32.setPrezzo_totale((float) (short) 0);
        ita.kangaroo.model.tipo tipo42 = null;
        ita.kangaroo.model.utenteBean utenteBean48 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo42, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean49 = new ita.kangaroo.model.OrdineBean(utenteBean48);
        ita.kangaroo.model.tipo tipo55 = null;
        ita.kangaroo.model.utenteBean utenteBean61 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo55, "hi!", "", "", "hi!", "");
        utenteBean61.setEmail("hi!");
        utenteBean61.setPassword("hi!");
        java.lang.String str66 = utenteBean61.getCognome();
        ordineBean49.setClient(utenteBean61);
        java.util.ArrayList<ita.kangaroo.model.OrderProductBean> orderProductBeanList68 = ordineBean49.getProducts();
        ordineBean32.setProducts(orderProductBeanList68);
        boolean boolean70 = metodoPagamentoBean0.equals((java.lang.Object) orderProductBeanList68);
        metodoPagamentoBean0.setNumero_carta("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Data non disponibile" + "'", str34, "Data non disponibile");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertNotNull(orderProductBeanList68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        ita.kangaroo.model.AddressBean addressBean0 = new ita.kangaroo.model.AddressBean();
        java.lang.String str1 = addressBean0.getVia();
        java.lang.String str2 = addressBean0.getUsername();
        java.lang.String str3 = addressBean0.getCAP();
        java.lang.String str4 = addressBean0.getUsername();
        addressBean0.setId(10);
        addressBean0.setId((int) (short) 100);
        addressBean0.setCAP("da39a3ee5e6b4b0d3255bfef95601890afd80709");
        int int11 = addressBean0.getId();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
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
        ita.kangaroo.model.Cart cart41 = new ita.kangaroo.model.Cart();
        ita.kangaroo.model.tipo tipo49 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean50 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo49);
        java.lang.String str51 = prodottoBean50.getDescrizione();
        java.lang.String str52 = prodottoBean50.getNome();
        int int53 = prodottoBean50.getQuantita();
        prodottoBean50.setDescrizione("hi!");
        cart41.addProduct(prodottoBean50);
        java.util.ArrayList<ita.kangaroo.model.CartProduct> cartProductList57 = cart41.getProducts();
        ita.kangaroo.model.Cart cart58 = new ita.kangaroo.model.Cart();
        ita.kangaroo.model.tipo tipo66 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean67 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo66);
        int int68 = prodottoBean67.getId();
        java.lang.String str69 = prodottoBean67.getImmagine();
        cart58.removeProduct(prodottoBean67);
        ita.kangaroo.model.tipo tipo78 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean79 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo78);
        java.lang.String str80 = prodottoBean79.getDescrizione();
        java.lang.String str81 = prodottoBean79.getNome();
        ita.kangaroo.model.tipo tipo82 = prodottoBean79.getTipo();
        cart58.removeProduct(prodottoBean79);
        cart41.removeProduct(prodottoBean79);
        int int85 = prodottoBean79.getQuantita();
        prodottoBean79.setId((int) ' ');
        int int88 = prodottoBean79.getQuantita();
        cart0.removeProduct(prodottoBean79);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(cartProductList22);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 1.0f + "'", float36 == 1.0f);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(cartProductList57);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1 + "'", int68 == 1);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "hi!" + "'", str80, "hi!");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "hi!" + "'", str81, "hi!");
        org.junit.Assert.assertNull(tipo82);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
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
        ita.kangaroo.model.tipo tipo26 = null;
        prodottoBean21.setTipo(tipo26);
        ita.kangaroo.model.CartProduct cartProduct29 = new ita.kangaroo.model.CartProduct(prodottoBean21, (int) 'a');
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNull(tipo24);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        ita.kangaroo.model.tipo tipo6 = null;
        ita.kangaroo.model.utenteBean utenteBean12 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo6, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean13 = new ita.kangaroo.model.OrdineBean(utenteBean12);
        java.lang.String str14 = ordineBean13.getMetodo_di_spedizione();
        ordineBean13.setNumero_carta("");
        java.lang.String str17 = ordineBean13.getIndirizzo_di_spedizione();
        ordineBean13.setNumero_di_tracking("da39a3ee5e6b4b0d3255bfef95601890afd80709");
        ita.kangaroo.model.tipo tipo25 = null;
        ita.kangaroo.model.utenteBean utenteBean31 = new ita.kangaroo.model.utenteBean("Data non disponibile", "Data non disponibile", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "Data non disponibile", "", tipo25, "hi!", "", "hi!", "hi!", "");
        ordineBean13.setClient(utenteBean31);
        java.sql.Date date40 = null;
        ita.kangaroo.model.OrdineBean ordineBean42 = new ita.kangaroo.model.OrdineBean(10, utenteBean31, 1.0f, "ProdottoBean{id=32, descrizione='Data non disponibile', nome='Data non disponibile', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=32.0, quantita=32, iva=10.0, tipo=null}", "3a987acf8cbc1028b7dbc86bd086831151899a2b", "ProdottoBean{id=52, descrizione='hi!', nome='', immagine='da39a3ee5e6b4b0d3255bfef95601890afd80709', prezzo=32.0, quantita=-1, iva=52.0, tipo=null}", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "ProdottoBean{id=10, descrizione='hi!', nome='', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}", "3a987acf8cbc1028b7dbc86bd086831151899a2b", date40, "3a987acf8cbc1028b7dbc86bd086831151899a2b");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getImmagine();
        prodottoBean8.setPrezzo((float) (-1L));
        int int12 = prodottoBean8.getId();
        float float13 = prodottoBean8.getIva();
        prodottoBean8.setIva((float) ' ');
        prodottoBean8.setIva((float) '#');
        prodottoBean8.setId((int) 'a');
        prodottoBean8.setDescrizione("");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
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
        float float22 = prodottoBean9.getPrezzo();
        float float23 = prodottoBean9.getIva();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.0f + "'", float22 == 0.0f);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 1.0f + "'", float23 == 1.0f);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "", "", "hi!", "hi!", "hi!");
        java.lang.String str12 = utenteBean11.getPassword();
        utenteBean11.setProvincia("Data non disponibile");
        utenteBean11.setCognome("hi!");
        java.lang.String str17 = utenteBean11.getProvincia();
        utenteBean11.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        java.lang.String str20 = utenteBean11.getCognome();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Data non disponibile" + "'", str17, "Data non disponibile");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        ita.kangaroo.model.MetodoPagamentoBean metodoPagamentoBean0 = new ita.kangaroo.model.MetodoPagamentoBean();
        metodoPagamentoBean0.setId((int) 'a');
        ita.kangaroo.model.AddressBean addressBean3 = new ita.kangaroo.model.AddressBean();
        java.lang.String str4 = addressBean3.getVia();
        addressBean3.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        addressBean3.setCitta("hi!");
        boolean boolean9 = metodoPagamentoBean0.equals((java.lang.Object) addressBean3);
        java.lang.String str10 = metodoPagamentoBean0.getNumero_carta();
        java.lang.String str11 = metodoPagamentoBean0.getCircuito();
        metodoPagamentoBean0.setData_scadenza("da39a3ee5e6b4b0d3255bfef95601890afd80709");
        java.lang.String str14 = metodoPagamentoBean0.getCvv();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        int int2 = orderProductBean0.getId_ordine();
        orderProductBean0.setQuantita((int) 'a');
        int int5 = orderProductBean0.getId_ordine();
        orderProductBean0.setId_ordine(100);
        int int8 = orderProductBean0.getId_ordine();
        orderProductBean0.setPrezzo((float) 52);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        ita.kangaroo.model.AddressBean addressBean5 = new ita.kangaroo.model.AddressBean((int) ' ', "Data non disponibile", "da39a3ee5e6b4b0d3255bfef95601890afd80709", "ProdottoBean{id=1, descrizione='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', nome='hi!', immagine='hi!', prezzo=0.0, quantita=-1, iva=1.0, tipo=null}", "Data non disponibile");
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
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
        addressBean0.setCitta("ProdottoBean{id=-1, descrizione='Data non disponibile', nome='Data non disponibile', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=32.0, quantita=32, iva=32.0, tipo=null}");
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
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
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
        ordineBean12.setNumero_carta("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        ordineBean12.setPrezzo_totale((float) 'a');
        java.lang.String str29 = ordineBean12.getNumero_di_tracking();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("", "", "", "", "Data non disponibile", tipo5, "hi!", "", "Data non disponibile", "Data non disponibile", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        utenteBean11.setPassword("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        java.lang.String str14 = utenteBean11.getNome();
        utenteBean11.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='hi!', prezzo=-1.0, quantita=-1, iva=1.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
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
        java.util.ArrayList<ita.kangaroo.model.OrderProductBean> orderProductBeanList25 = ordineBean12.getProducts();
        java.lang.String str26 = ordineBean12.getNumero_di_tracking();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(date22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "da39a3ee5e6b4b0d3255bfef95601890afd80709" + "'", str24, "da39a3ee5e6b4b0d3255bfef95601890afd80709");
        org.junit.Assert.assertNotNull(orderProductBeanList25);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getImmagine();
        int int10 = prodottoBean8.getQuantita();
        ita.kangaroo.model.CartProduct cartProduct11 = new ita.kangaroo.model.CartProduct(prodottoBean8);
        int int12 = prodottoBean8.getQuantita();
        float float13 = prodottoBean8.getPrezzo();
        float float14 = prodottoBean8.getIva();
        float float15 = prodottoBean8.getPrezzo();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 1.0f + "'", float15 == 1.0f);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        ita.kangaroo.model.tipo tipo6 = null;
        ita.kangaroo.model.utenteBean utenteBean12 = new ita.kangaroo.model.utenteBean("", "", "", "", "Data non disponibile", tipo6, "hi!", "", "Data non disponibile", "Data non disponibile", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        java.sql.Date date20 = null;
        ita.kangaroo.model.OrdineBean ordineBean22 = new ita.kangaroo.model.OrdineBean((int) (byte) 10, utenteBean12, (float) 10, "", "", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "", "hi!", "hi!", date20, "Data non disponibile");
        ordineBean22.setIndirizzo_di_spedizione("Data non disponibile");
        java.lang.String str25 = ordineBean22.getIndirizzo_di_spedizione();
        java.lang.String str26 = ordineBean22.getCircuito();
        float float27 = ordineBean22.getPrezzo_totale();
        ordineBean22.setId((int) 'a');
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Data non disponibile" + "'", str25, "Data non disponibile");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}" + "'", str26, "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 10.0f + "'", float27 == 10.0f);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getDescrizione();
        java.lang.String str10 = prodottoBean8.getDescrizione();
        ita.kangaroo.model.CartProduct cartProduct11 = new ita.kangaroo.model.CartProduct(prodottoBean8);
        ita.kangaroo.model.ProdottoBean prodottoBean12 = cartProduct11.getProduct();
        int int13 = prodottoBean12.getId();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(prodottoBean12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        int int9 = prodottoBean8.getId();
        java.lang.String str10 = prodottoBean8.getImmagine();
        java.lang.String str11 = prodottoBean8.toString();
        ita.kangaroo.model.tipo tipo12 = null;
        prodottoBean8.setTipo(tipo12);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='hi!', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}" + "'", str11, "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='hi!', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "3a987acf8cbc1028b7dbc86bd086831151899a2b", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='hi!', prezzo=-1.0, quantita=-1, iva=1.0, tipo=null}", "Data non disponibile", "3d1583397bcebff274b1e7cb58087c39153af974", tipo5, "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "da39a3ee5e6b4b0d3255bfef95601890afd80709", "3d1583397bcebff274b1e7cb58087c39153af974", "ProdottoBean{id=32, descrizione='Data non disponibile', nome='Data non disponibile', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=32.0, quantita=32, iva=10.0, tipo=null}", "ProdottoBean{id=52, descrizione='hi!', nome='', immagine='da39a3ee5e6b4b0d3255bfef95601890afd80709', prezzo=32.0, quantita=-1, iva=52.0, tipo=null}");
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (short) -1, "da39a3ee5e6b4b0d3255bfef95601890afd80709", "ProdottoBean{id=52, descrizione='hi!', nome='', immagine='da39a3ee5e6b4b0d3255bfef95601890afd80709', prezzo=32.0, quantita=-1, iva=52.0, tipo=null}", "ProdottoBean{id=52, descrizione='hi!', nome='', immagine='da39a3ee5e6b4b0d3255bfef95601890afd80709', prezzo=32.0, quantita=-1, iva=52.0, tipo=null}", (float) 97, 100, 100.0f, tipo7);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        float float13 = ordineBean12.getPrezzo_totale();
        java.lang.String str14 = ordineBean12.getNumero_carta();
        ita.kangaroo.model.tipo tipo20 = null;
        ita.kangaroo.model.utenteBean utenteBean26 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo20, "hi!", "", "", "hi!", "");
        utenteBean26.setEmail("hi!");
        utenteBean26.setPassword("hi!");
        utenteBean26.setCognome("Data non disponibile");
        utenteBean26.setTelefono("Data non disponibile");
        java.lang.String str35 = utenteBean26.getCap();
        utenteBean26.setCap("Data non disponibile");
        utenteBean26.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        ordineBean12.setClient(utenteBean26);
        ordineBean12.setPrezzo_totale((float) '#');
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        java.lang.String str12 = utenteBean11.getUsername();
        java.lang.String str13 = utenteBean11.getCap();
        utenteBean11.setUsername("");
        ita.kangaroo.model.OrdineBean ordineBean16 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str17 = utenteBean11.getPassword();
        utenteBean11.setCap("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='hi!', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
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
        utenteBean12.setCognome("ProdottoBean{id=52, descrizione='hi!', nome='', immagine='da39a3ee5e6b4b0d3255bfef95601890afd80709', prezzo=32.0, quantita=-1, iva=52.0, tipo=null}");
        org.junit.Assert.assertNull(tipo33);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
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
        java.lang.String str28 = ordineBean12.getCircuito();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertNotNull(utenteBean25);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
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
        ita.kangaroo.model.tipo tipo39 = null;
        prodottoBean30.setTipo(tipo39);
        prodottoBean30.setImmagine("ProdottoBean{id=32, descrizione='Data non disponibile', nome='Data non disponibile', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=32.0, quantita=32, iva=10.0, tipo=null}");
        prodottoBean30.setNome("ProdottoBean{id=32, descrizione='Data non disponibile', nome='Data non disponibile', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=32.0, quantita=32, iva=10.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
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
        ita.kangaroo.model.Cart cart19 = new ita.kangaroo.model.Cart();
        ita.kangaroo.model.tipo tipo27 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean28 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo27);
        int int29 = prodottoBean28.getId();
        java.lang.String str30 = prodottoBean28.getImmagine();
        cart19.removeProduct(prodottoBean28);
        ita.kangaroo.model.tipo tipo39 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean40 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo39);
        java.lang.String str41 = prodottoBean40.getDescrizione();
        java.lang.String str42 = prodottoBean40.getNome();
        ita.kangaroo.model.tipo tipo43 = prodottoBean40.getTipo();
        cart19.removeProduct(prodottoBean40);
        ita.kangaroo.model.tipo tipo52 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean53 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo52);
        java.lang.String str54 = prodottoBean53.getDescrizione();
        java.lang.String str55 = prodottoBean53.getNome();
        ita.kangaroo.model.tipo tipo56 = prodottoBean53.getTipo();
        cart19.changeQuantity(prodottoBean53, (int) (byte) 0);
        ita.kangaroo.model.ProdottoBean prodottoBean59 = null;
        cart19.changeQuantity(prodottoBean59, 32);
        boolean boolean62 = metodoPagamentoBean0.equals((java.lang.Object) cart19);
        java.lang.Class<?> wildcardClass63 = metodoPagamentoBean0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertNull(tipo43);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertNull(tipo56);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        ita.kangaroo.model.tipo tipo6 = null;
        ita.kangaroo.model.utenteBean utenteBean12 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo6, "hi!", "", "", "hi!", "");
        java.lang.String str13 = utenteBean12.getUsername();
        java.lang.String str14 = utenteBean12.getCap();
        java.sql.Date date22 = null;
        ita.kangaroo.model.OrdineBean ordineBean24 = new ita.kangaroo.model.OrdineBean((int) (short) 0, utenteBean12, (float) 10L, "", "Data non disponibile", "hi!", "hi!", "", "", date22, "hi!");
        ordineBean24.setDestinatario("");
        java.lang.String str27 = ordineBean24.getDestinatario();
        java.lang.String str28 = ordineBean24.toString();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Data non disponibile" + "'", str28, "Data non disponibile");
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        int int2 = orderProductBean0.getId_ordine();
        orderProductBean0.setPrezzo((float) '4');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
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
        int int15 = metodoPagamentoBean0.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        utenteBean11.setPassword("hi!");
        utenteBean11.setEmail("hi!");
        utenteBean11.setTelefono("hi!");
        java.lang.String str19 = utenteBean11.getCognome();
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        ita.kangaroo.model.utenteBean utenteBean0 = new ita.kangaroo.model.utenteBean();
        java.lang.String str1 = utenteBean0.getPassword();
        utenteBean0.setCognome("ProdottoBean{id=10, descrizione='hi!', nome='', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}");
        java.lang.String str4 = utenteBean0.getCitta();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
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
        ordineBean81.setMetodo_di_spedizione("3d1583397bcebff274b1e7cb58087c39153af974");
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
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        boolean boolean1 = ita.kangaroo.model.AddressBean.isValidCAP("ProdottoBean{id=32, descrizione='Data non disponibile', nome='Data non disponibile', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=32.0, quantita=32, iva=10.0, tipo=null}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        int int2 = orderProductBean0.getId_ordine();
        orderProductBean0.setId_prodotto(0);
        orderProductBean0.setId_ordine((int) (short) -1);
        orderProductBean0.setPrezzo((float) ' ');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        ita.kangaroo.model.Cart cart0 = new ita.kangaroo.model.Cart();
        ita.kangaroo.model.tipo tipo8 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean9 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo8);
        java.lang.String str10 = prodottoBean9.getImmagine();
        prodottoBean9.setPrezzo((float) (-1L));
        cart0.changeQuantity(prodottoBean9, 97);
        prodottoBean9.setNome("Data non disponibile");
        ita.kangaroo.model.CartProduct cartProduct18 = new ita.kangaroo.model.CartProduct(prodottoBean9, 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        ordineBean12.setIndirizzo_di_spedizione("Data non disponibile");
        ordineBean12.setPrezzo_totale((float) (byte) 10);
        java.lang.String str17 = ordineBean12.getCircuito();
        java.sql.Date date18 = null;
        ordineBean12.setData(date18);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
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
        java.lang.String str36 = metodoPagamentoBean0.getCircuito();
        java.lang.String str37 = metodoPagamentoBean0.getCvv();
        java.lang.String str38 = metodoPagamentoBean0.getCvv();
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
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        ita.kangaroo.model.AddressBean addressBean5 = new ita.kangaroo.model.AddressBean((int) (byte) 0, "da39a3ee5e6b4b0d3255bfef95601890afd80709", "da39a3ee5e6b4b0d3255bfef95601890afd80709", "Data non disponibile", "");
        java.lang.String str6 = addressBean5.getCitta();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "da39a3ee5e6b4b0d3255bfef95601890afd80709" + "'", str6, "da39a3ee5e6b4b0d3255bfef95601890afd80709");
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        float float2 = orderProductBean0.getIVA();
        float float3 = orderProductBean0.getPrezzo();
        int int4 = orderProductBean0.getId_ordine();
        orderProductBean0.setPrezzo((float) (short) 0);
        int int7 = orderProductBean0.getQuantita();
        float float8 = orderProductBean0.getPrezzo();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        utenteBean11.setEmail("hi!");
        utenteBean11.setPassword("hi!");
        utenteBean11.setProvincia("hi!");
        java.lang.String str18 = utenteBean11.getCognome();
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        java.lang.String str12 = utenteBean11.getUsername();
        java.lang.String str13 = utenteBean11.getCap();
        utenteBean11.setUsername("");
        ita.kangaroo.model.OrdineBean ordineBean16 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        ordineBean16.setCircuito("");
        java.util.ArrayList<ita.kangaroo.model.OrderProductBean> orderProductBeanList19 = ordineBean16.getProducts();
        ordineBean16.setNumero_di_tracking("3a987acf8cbc1028b7dbc86bd086831151899a2b");
        java.lang.String str22 = ordineBean16.toString();
        java.lang.String str23 = ordineBean16.toString();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(orderProductBeanList19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Data non disponibile" + "'", str22, "Data non disponibile");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Data non disponibile" + "'", str23, "Data non disponibile");
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        ordineBean12.setNumero_carta("");
        java.sql.Date date16 = ordineBean12.getData();
        ordineBean12.setPrezzo_totale((float) 'a');
        java.lang.String str19 = ordineBean12.getNumero_carta();
        ita.kangaroo.model.tipo tipo25 = null;
        ita.kangaroo.model.utenteBean utenteBean31 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo25, "hi!", "", "", "hi!", "");
        java.lang.String str32 = utenteBean31.getUsername();
        java.lang.String str33 = utenteBean31.getCap();
        utenteBean31.setUsername("");
        ita.kangaroo.model.OrdineBean ordineBean36 = new ita.kangaroo.model.OrdineBean(utenteBean31);
        ordineBean36.setCircuito("");
        java.util.ArrayList<ita.kangaroo.model.OrderProductBean> orderProductBeanList39 = ordineBean36.getProducts();
        ordineBean12.setProducts(orderProductBeanList39);
        ordineBean12.setId((int) (byte) 0);
        java.util.ArrayList<ita.kangaroo.model.OrderProductBean> orderProductBeanList43 = ordineBean12.getProducts();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(orderProductBeanList39);
        org.junit.Assert.assertNotNull(orderProductBeanList43);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        ita.kangaroo.model.ProdottoBean prodottoBean0 = null;
        ita.kangaroo.model.CartProduct cartProduct2 = new ita.kangaroo.model.CartProduct(prodottoBean0, (int) (byte) 10);
        int int3 = cartProduct2.getQuantity();
        ita.kangaroo.model.ProdottoBean prodottoBean4 = cartProduct2.getProduct();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNull(prodottoBean4);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        ita.kangaroo.model.AddressBean addressBean0 = new ita.kangaroo.model.AddressBean();
        java.lang.String str1 = addressBean0.getVia();
        java.lang.String str2 = addressBean0.getUsername();
        addressBean0.setUsername("hi!");
        addressBean0.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        addressBean0.setCitta("hi!");
        java.lang.String str9 = addressBean0.getCAP();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        ita.kangaroo.model.tipo tipo6 = null;
        ita.kangaroo.model.utenteBean utenteBean12 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo6, "hi!", "", "", "hi!", "");
        java.lang.String str13 = utenteBean12.getProvincia();
        java.lang.String str14 = utenteBean12.getCognome();
        java.lang.String str15 = utenteBean12.getVia();
        java.sql.Date date23 = null;
        ita.kangaroo.model.OrdineBean ordineBean25 = new ita.kangaroo.model.OrdineBean((int) (byte) -1, utenteBean12, (-1.0f), "ProdottoBean{id=10, descrizione='hi!', nome='', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}", "3a987acf8cbc1028b7dbc86bd086831151899a2b", "da39a3ee5e6b4b0d3255bfef95601890afd80709", "Data non disponibile", "3a987acf8cbc1028b7dbc86bd086831151899a2b", "ProdottoBean{id=10, descrizione='hi!', nome='', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}", date23, "");
        ordineBean25.setId(52);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        utenteBean11.setEmail("hi!");
        utenteBean11.setPassword("hi!");
        utenteBean11.setProvincia("hi!");
        utenteBean11.setUsername("hi!");
        java.lang.String str20 = utenteBean11.getTelefono();
        java.lang.String str21 = utenteBean11.getTelefono();
        ita.kangaroo.model.OrdineBean ordineBean22 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        ordineBean22.setNumero_carta("");
        java.lang.String str25 = ordineBean22.toString();
        java.lang.String str26 = ordineBean22.getCircuito();
        java.sql.Date date27 = ordineBean22.getData();
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Data non disponibile" + "'", str25, "Data non disponibile");
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(date27);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        ita.kangaroo.model.tipo tipo6 = null;
        ita.kangaroo.model.utenteBean utenteBean12 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo6, "hi!", "", "", "hi!", "");
        java.lang.String str13 = utenteBean12.getUsername();
        java.lang.String str14 = utenteBean12.getCap();
        utenteBean12.setUsername("");
        ita.kangaroo.model.OrdineBean ordineBean17 = new ita.kangaroo.model.OrdineBean(utenteBean12);
        java.sql.Date date25 = null;
        ita.kangaroo.model.OrdineBean ordineBean27 = new ita.kangaroo.model.OrdineBean((int) (short) 1, utenteBean12, (float) (byte) -1, "hi!", "hi!", "Data non disponibile", "", "Data non disponibile", "Data non disponibile", date25, "");
        ita.kangaroo.model.tipo tipo28 = null;
        utenteBean12.setTipo(tipo28);
        utenteBean12.setCap("da39a3ee5e6b4b0d3255bfef95601890afd80709");
        java.lang.String str32 = utenteBean12.getCap();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "da39a3ee5e6b4b0d3255bfef95601890afd80709" + "'", str32, "da39a3ee5e6b4b0d3255bfef95601890afd80709");
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        ita.kangaroo.model.AddressBean addressBean0 = new ita.kangaroo.model.AddressBean();
        addressBean0.setId((int) ' ');
        addressBean0.setVia("");
        ita.kangaroo.model.tipo tipo11 = null;
        ita.kangaroo.model.utenteBean utenteBean17 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo11, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean18 = new ita.kangaroo.model.OrdineBean(utenteBean17);
        utenteBean17.setPassword("hi!");
        utenteBean17.setNome("hi!");
        java.sql.Date date30 = null;
        ita.kangaroo.model.OrdineBean ordineBean32 = new ita.kangaroo.model.OrdineBean((int) (byte) 100, utenteBean17, (float) (-1L), "hi!", "", "", "hi!", "Data non disponibile", "hi!", date30, "");
        ordineBean32.setIndirizzo_di_spedizione("Data non disponibile");
        java.lang.String str35 = ordineBean32.getDestinatario();
        java.lang.String str36 = ordineBean32.getDestinatario();
        ita.kangaroo.model.tipo tipo42 = null;
        ita.kangaroo.model.utenteBean utenteBean48 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo42, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean49 = new ita.kangaroo.model.OrdineBean(utenteBean48);
        java.lang.String str50 = ordineBean49.getMetodo_di_spedizione();
        java.util.ArrayList<ita.kangaroo.model.OrderProductBean> orderProductBeanList51 = ordineBean49.getProducts();
        ordineBean32.setProducts(orderProductBeanList51);
        boolean boolean53 = addressBean0.equals((java.lang.Object) ordineBean32);
        int int54 = addressBean0.getId();
        addressBean0.setCitta("3d1583397bcebff274b1e7cb58087c39153af974");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNotNull(orderProductBeanList51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 32 + "'", int54 == 32);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        int int2 = orderProductBean0.getId_ordine();
        orderProductBean0.setQuantita((int) 'a');
        orderProductBean0.setQuantita((int) (short) -1);
        int int7 = orderProductBean0.getId_ordine();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        ita.kangaroo.model.AddressBean addressBean0 = new ita.kangaroo.model.AddressBean();
        java.lang.String str1 = addressBean0.getVia();
        java.lang.String str2 = addressBean0.getUsername();
        addressBean0.setUsername("hi!");
        addressBean0.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        boolean boolean8 = addressBean0.equals((java.lang.Object) 10L);
        addressBean0.setUsername("hi!");
        java.lang.String str11 = addressBean0.getCAP();
        addressBean0.setUsername("3a987acf8cbc1028b7dbc86bd086831151899a2b");
        addressBean0.setCitta("Data non disponibile");
        addressBean0.setCitta("ProdottoBean{id=10, descrizione='hi!', nome='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}");
        ita.kangaroo.model.tipo tipo23 = null;
        ita.kangaroo.model.utenteBean utenteBean29 = new ita.kangaroo.model.utenteBean("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "hi!", "", "", "hi!", tipo23, "", "", "Data non disponibile", "", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        java.lang.String str30 = utenteBean29.getEmail();
        java.lang.String str31 = utenteBean29.getVia();
        java.lang.String str32 = utenteBean29.getTelefono();
        boolean boolean33 = addressBean0.equals((java.lang.Object) utenteBean29);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        int int2 = orderProductBean0.getId_ordine();
        orderProductBean0.setQuantita((int) 'a');
        int int5 = orderProductBean0.getId_ordine();
        int int6 = orderProductBean0.getId_ordine();
        float float7 = orderProductBean0.getPrezzo();
        orderProductBean0.setId_prodotto((int) (byte) 1);
        float float10 = orderProductBean0.getPrezzo();
        int int11 = orderProductBean0.getId_prodotto();
        int int12 = orderProductBean0.getQuantita();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getImmagine();
        int int10 = prodottoBean8.getQuantita();
        ita.kangaroo.model.CartProduct cartProduct11 = new ita.kangaroo.model.CartProduct(prodottoBean8);
        prodottoBean8.setNome("");
        java.lang.String str14 = prodottoBean8.getImmagine();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
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
        utenteBean29.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        ita.kangaroo.model.tipo tipo38 = null;
        utenteBean29.setTipo(tipo38);
        utenteBean29.setNome("ProdottoBean{id=52, descrizione='hi!', nome='', immagine='da39a3ee5e6b4b0d3255bfef95601890afd80709', prezzo=32.0, quantita=-1, iva=52.0, tipo=null}");
        utenteBean29.setTelefono("ProdottoBean{id=10, descrizione='hi!', nome='', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getImmagine();
        int int10 = prodottoBean8.getQuantita();
        ita.kangaroo.model.CartProduct cartProduct11 = new ita.kangaroo.model.CartProduct(prodottoBean8);
        prodottoBean8.setNome("");
        java.lang.String str14 = prodottoBean8.getNome();
        ita.kangaroo.model.tipo tipo15 = null;
        prodottoBean8.setTipo(tipo15);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        java.lang.String str12 = utenteBean11.getUsername();
        java.lang.String str13 = utenteBean11.getCap();
        utenteBean11.setUsername("");
        ita.kangaroo.model.OrdineBean ordineBean16 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        ordineBean16.setCircuito("");
        java.util.ArrayList<ita.kangaroo.model.OrderProductBean> orderProductBeanList19 = ordineBean16.getProducts();
        ordineBean16.setNumero_di_tracking("3a987acf8cbc1028b7dbc86bd086831151899a2b");
        java.lang.String str22 = ordineBean16.toString();
        java.lang.String str23 = ordineBean16.getDestinatario();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(orderProductBeanList19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Data non disponibile" + "'", str22, "Data non disponibile");
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        ita.kangaroo.model.AddressBean addressBean0 = new ita.kangaroo.model.AddressBean();
        java.lang.String str1 = addressBean0.getVia();
        java.lang.String str2 = addressBean0.getUsername();
        addressBean0.setUsername("hi!");
        addressBean0.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        boolean boolean8 = addressBean0.equals((java.lang.Object) 10L);
        addressBean0.setUsername("hi!");
        addressBean0.setCitta("");
        addressBean0.setVia("Data non disponibile");
        java.lang.String str15 = addressBean0.getVia();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Data non disponibile" + "'", str15, "Data non disponibile");
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
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
        prodottoBean24.setImmagine("Data non disponibile");
        ita.kangaroo.model.CartProduct cartProduct35 = new ita.kangaroo.model.CartProduct(prodottoBean24);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        ita.kangaroo.model.AddressBean addressBean0 = new ita.kangaroo.model.AddressBean();
        java.lang.String str1 = addressBean0.getVia();
        addressBean0.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        addressBean0.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        java.lang.String str6 = addressBean0.getCitta();
        int int7 = addressBean0.getId();
        addressBean0.setCAP("ProdottoBean{id=32, descrizione='Data non disponibile', nome='Data non disponibile', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=32.0, quantita=32, iva=10.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        ita.kangaroo.model.Cart cart0 = new ita.kangaroo.model.Cart();
        ita.kangaroo.model.tipo tipo8 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean9 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo8);
        java.lang.String str10 = prodottoBean9.getImmagine();
        prodottoBean9.setPrezzo((float) (-1L));
        cart0.changeQuantity(prodottoBean9, 97);
        java.util.ArrayList<ita.kangaroo.model.CartProduct> cartProductList15 = cart0.getProducts();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(cartProductList15);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) '#', "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "hi!", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", (float) (short) 0, 97, (float) (byte) 0, tipo7);
        ita.kangaroo.model.tipo tipo9 = prodottoBean8.getTipo();
        org.junit.Assert.assertNull(tipo9);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.utenteBean utenteBean13 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo7, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean14 = new ita.kangaroo.model.OrdineBean(utenteBean13);
        utenteBean13.setPassword("hi!");
        utenteBean13.setNome("hi!");
        java.sql.Date date26 = null;
        ita.kangaroo.model.OrdineBean ordineBean28 = new ita.kangaroo.model.OrdineBean((int) (byte) 100, utenteBean13, (float) (-1L), "hi!", "", "", "hi!", "Data non disponibile", "hi!", date26, "");
        java.lang.String str29 = utenteBean13.getCognome();
        java.sql.Date date37 = null;
        ita.kangaroo.model.OrdineBean ordineBean39 = new ita.kangaroo.model.OrdineBean((int) (short) 1, utenteBean13, (float) 'a', "hi!", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "Data non disponibile", "Data non disponibile", "", "Data non disponibile", date37, "Data non disponibile");
        java.lang.String str40 = utenteBean13.getVia();
        ita.kangaroo.model.tipo tipo41 = null;
        utenteBean13.setTipo(tipo41);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        ita.kangaroo.model.Cart cart0 = new ita.kangaroo.model.Cart();
        ita.kangaroo.model.tipo tipo8 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean9 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo8);
        java.lang.String str10 = prodottoBean9.getDescrizione();
        java.lang.String str11 = prodottoBean9.getNome();
        int int12 = prodottoBean9.getQuantita();
        prodottoBean9.setDescrizione("hi!");
        cart0.addProduct(prodottoBean9);
        java.util.ArrayList<ita.kangaroo.model.CartProduct> cartProductList16 = cart0.getProducts();
        ita.kangaroo.model.tipo tipo24 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean25 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo24);
        java.lang.String str26 = prodottoBean25.getDescrizione();
        java.lang.String str27 = prodottoBean25.getNome();
        ita.kangaroo.model.tipo tipo28 = prodottoBean25.getTipo();
        ita.kangaroo.model.tipo tipo29 = prodottoBean25.getTipo();
        cart0.addProduct(prodottoBean25);
        prodottoBean25.setIva((float) 35);
        prodottoBean25.setNome("Data non disponibile");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(cartProductList16);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNull(tipo28);
        org.junit.Assert.assertNull(tipo29);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
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
        java.lang.Class<?> wildcardClass39 = utenteBean33.getClass();
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(utenteBean33);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        int int2 = orderProductBean0.getId_ordine();
        orderProductBean0.setQuantita((int) 'a');
        int int5 = orderProductBean0.getId_ordine();
        int int6 = orderProductBean0.getId_ordine();
        int int7 = orderProductBean0.getId_prodotto();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        ita.kangaroo.model.AddressBean addressBean0 = new ita.kangaroo.model.AddressBean();
        addressBean0.setId((int) ' ');
        java.lang.String str3 = addressBean0.getVia();
        java.lang.String str4 = addressBean0.getVia();
        addressBean0.setId((int) (short) -1);
        java.lang.String str7 = addressBean0.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "", "", "hi!", "hi!", "hi!");
        java.lang.String str12 = utenteBean11.getPassword();
        utenteBean11.setProvincia("Data non disponibile");
        utenteBean11.setCognome("hi!");
        java.lang.String str17 = utenteBean11.getPassword();
        java.lang.String str18 = utenteBean11.getProvincia();
        java.lang.String str19 = utenteBean11.getVia();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Data non disponibile" + "'", str18, "Data non disponibile");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getDestinatario();
        java.lang.String str14 = ordineBean12.toString();
        ordineBean12.setPrezzo_totale((float) (short) 0);
        float float17 = ordineBean12.getPrezzo_totale();
        java.lang.String str18 = ordineBean12.getNumero_di_tracking();
        ita.kangaroo.model.tipo tipo24 = null;
        ita.kangaroo.model.utenteBean utenteBean30 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo24, "", "", "hi!", "hi!", "hi!");
        java.lang.String str31 = utenteBean30.getPassword();
        utenteBean30.setProvincia("Data non disponibile");
        utenteBean30.setCognome("hi!");
        utenteBean30.setNome("");
        java.lang.String str38 = utenteBean30.getUsername();
        utenteBean30.setUsername("ProdottoBean{id=52, descrizione='hi!', nome='', immagine='da39a3ee5e6b4b0d3255bfef95601890afd80709', prezzo=32.0, quantita=-1, iva=52.0, tipo=null}");
        ordineBean12.setClient(utenteBean30);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Data non disponibile" + "'", str14, "Data non disponibile");
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.0f + "'", float17 == 0.0f);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
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
        java.lang.String str26 = ordineBean12.getNumero_di_tracking();
        int int27 = ordineBean12.getId();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(date22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "da39a3ee5e6b4b0d3255bfef95601890afd80709" + "'", str24, "da39a3ee5e6b4b0d3255bfef95601890afd80709");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
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
        ordineBean12.setPrezzo_totale((float) 100L);
        java.sql.Date date37 = ordineBean12.getData();
        ordineBean12.setIndirizzo_di_spedizione("ProdottoBean{id=10, descrizione='hi!', nome='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}");
        java.lang.String str40 = ordineBean12.getDestinatario();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(date37);
        org.junit.Assert.assertNull(str40);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        ita.kangaroo.model.tipo tipo6 = null;
        ita.kangaroo.model.utenteBean utenteBean12 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo6, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean13 = new ita.kangaroo.model.OrdineBean(utenteBean12);
        utenteBean12.setPassword("hi!");
        utenteBean12.setNome("hi!");
        java.sql.Date date25 = null;
        ita.kangaroo.model.OrdineBean ordineBean27 = new ita.kangaroo.model.OrdineBean((int) (byte) 100, utenteBean12, (float) (-1L), "hi!", "", "", "hi!", "Data non disponibile", "hi!", date25, "");
        ordineBean27.setIndirizzo_di_spedizione("Data non disponibile");
        java.lang.String str30 = ordineBean27.getDestinatario();
        ordineBean27.setDestinatario("ProdottoBean{id=10, descrizione='hi!', nome='', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}");
        java.lang.String str33 = ordineBean27.getDestinatario();
        ordineBean27.setMetodo_di_pagamento("ProdottoBean{id=-1, descrizione='Data non disponibile', nome='Data non disponibile', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=32.0, quantita=32, iva=32.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "ProdottoBean{id=10, descrizione='hi!', nome='', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}" + "'", str33, "ProdottoBean{id=10, descrizione='hi!', nome='', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}");
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        ita.kangaroo.model.Cart cart0 = new ita.kangaroo.model.Cart();
        ita.kangaroo.model.tipo tipo8 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean9 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo8);
        int int10 = prodottoBean9.getId();
        java.lang.String str11 = prodottoBean9.getImmagine();
        cart0.removeProduct(prodottoBean9);
        ita.kangaroo.model.tipo tipo13 = prodottoBean9.getTipo();
        float float14 = prodottoBean9.getPrezzo();
        ita.kangaroo.model.CartProduct cartProduct15 = new ita.kangaroo.model.CartProduct(prodottoBean9);
        int int16 = prodottoBean9.getId();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(tipo13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
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
        metodoPagamentoBean0.setUsername("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='hi!', prezzo=-1.0, quantita=32, iva=1.0, tipo=null}");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        ita.kangaroo.model.ProdottoBean prodottoBean0 = new ita.kangaroo.model.ProdottoBean();
        prodottoBean0.setDescrizione("hi!");
        prodottoBean0.setId((int) (short) 100);
        float float5 = prodottoBean0.getIva();
        ita.kangaroo.model.tipo tipo6 = null;
        prodottoBean0.setTipo(tipo6);
        prodottoBean0.setImmagine("Data non disponibile");
        java.lang.String str10 = prodottoBean0.getNome();
        prodottoBean0.setId((int) (short) -1);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
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
        metodoPagamentoBean0.setNumero_carta("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='hi!', prezzo=-1.0, quantita=32, iva=1.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
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
        ordineBean12.setPrezzo_totale(0.0f);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(utenteBean24);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (short) 0, "Data non disponibile", "Data non disponibile", "hi!", (float) 'a', 1, (float) (short) 10, tipo7);
        prodottoBean8.setDescrizione("hi!");
        ita.kangaroo.model.tipo tipo11 = null;
        prodottoBean8.setTipo(tipo11);
        java.lang.String str13 = prodottoBean8.getImmagine();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        java.lang.String str12 = utenteBean11.getCitta();
        utenteBean11.setTelefono("Data non disponibile");
        java.lang.String str15 = utenteBean11.getCap();
        utenteBean11.setCap("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='hi!', prezzo=-1.0, quantita=32, iva=1.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        ita.kangaroo.model.ProdottoBean prodottoBean0 = null;
        ita.kangaroo.model.CartProduct cartProduct2 = new ita.kangaroo.model.CartProduct(prodottoBean0, (int) (byte) 10);
        cartProduct2.setQuantity((int) (short) 100);
        int int5 = cartProduct2.getQuantity();
        cartProduct2.setQuantity(32);
        ita.kangaroo.model.ProdottoBean prodottoBean8 = cartProduct2.getProduct();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNull(prodottoBean8);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        ordineBean12.setNumero_carta("");
        java.sql.Date date16 = ordineBean12.getData();
        ita.kangaroo.model.utenteBean utenteBean17 = ordineBean12.getClient();
        ita.kangaroo.model.tipo tipo23 = null;
        ita.kangaroo.model.utenteBean utenteBean29 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo23, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean30 = new ita.kangaroo.model.OrdineBean(utenteBean29);
        java.lang.String str31 = ordineBean30.getMetodo_di_spedizione();
        java.util.ArrayList<ita.kangaroo.model.OrderProductBean> orderProductBeanList32 = ordineBean30.getProducts();
        ordineBean12.setProducts(orderProductBeanList32);
        java.lang.String str34 = ordineBean12.getMetodo_di_pagamento();
        ordineBean12.setMetodo_di_spedizione("3d1583397bcebff274b1e7cb58087c39153af974");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertNotNull(utenteBean17);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(orderProductBeanList32);
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        ita.kangaroo.model.AddressBean addressBean0 = new ita.kangaroo.model.AddressBean();
        java.lang.String str1 = addressBean0.getVia();
        java.lang.String str2 = addressBean0.getUsername();
        java.lang.String str3 = addressBean0.getCAP();
        java.lang.String str4 = addressBean0.getUsername();
        addressBean0.setId(10);
        int int7 = addressBean0.getId();
        java.lang.String str8 = addressBean0.getCitta();
        addressBean0.setCitta("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        addressBean0.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        java.lang.String str13 = addressBean0.getUsername();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        ita.kangaroo.model.ProdottoBean prodottoBean0 = new ita.kangaroo.model.ProdottoBean();
        prodottoBean0.setDescrizione("hi!");
        int int3 = prodottoBean0.getQuantita();
        float float4 = prodottoBean0.getIva();
        float float5 = prodottoBean0.getPrezzo();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "3a987acf8cbc1028b7dbc86bd086831151899a2b", "ProdottoBean{id=32, descrizione='Data non disponibile', nome='Data non disponibile', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=32.0, quantita=32, iva=10.0, tipo=null}", "hi!", tipo5, "", "ProdottoBean{id=-1, descrizione='Data non disponibile', nome='Data non disponibile', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=32.0, quantita=32, iva=32.0, tipo=null}", "", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='hi!', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='hi!', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
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
        ordineBean39.setNumero_carta("");
        ordineBean39.setNumero_carta("ProdottoBean{id=10, descrizione='hi!', nome='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNull(str40);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
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
        java.util.ArrayList<ita.kangaroo.model.OrderProductBean> orderProductBeanList83 = ordineBean81.getProducts();
        ita.kangaroo.model.OrdineBean ordineBean84 = new ita.kangaroo.model.OrdineBean(orderProductBeanList83);
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
        org.junit.Assert.assertNotNull(orderProductBeanList83);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean(0, "Data non disponibile", "hi!", "", 0.0f, (int) (byte) 0, 100.0f, tipo7);
        float float9 = prodottoBean8.getPrezzo();
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
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
        addressBean0.setCAP("ProdottoBean{id=-1, descrizione='Data non disponibile', nome='Data non disponibile', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=32.0, quantita=32, iva=32.0, tipo=null}");
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
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        java.lang.String str12 = utenteBean11.getUsername();
        java.lang.String str13 = utenteBean11.getCap();
        utenteBean11.setUsername("");
        ita.kangaroo.model.OrdineBean ordineBean16 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str17 = utenteBean11.getPassword();
        java.lang.String str18 = utenteBean11.getProvincia();
        utenteBean11.setProvincia("");
        java.lang.Class<?> wildcardClass21 = utenteBean11.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getDestinatario();
        java.lang.String str14 = ordineBean12.toString();
        ordineBean12.setPrezzo_totale((float) (short) 0);
        java.util.ArrayList<ita.kangaroo.model.OrderProductBean> orderProductBeanList17 = ordineBean12.getProducts();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Data non disponibile" + "'", str14, "Data non disponibile");
        org.junit.Assert.assertNotNull(orderProductBeanList17);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
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
        ordineBean12.setId((int) ' ');
        ordineBean12.setCircuito("ProdottoBean{id=52, descrizione='hi!', nome='', immagine='da39a3ee5e6b4b0d3255bfef95601890afd80709', prezzo=32.0, quantita=-1, iva=52.0, tipo=null}");
        ordineBean12.setDestinatario("ProdottoBean{id=-1, descrizione='Data non disponibile', nome='Data non disponibile', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=32.0, quantita=32, iva=32.0, tipo=null}");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(date16);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        ita.kangaroo.model.Cart cart0 = new ita.kangaroo.model.Cart();
        ita.kangaroo.model.tipo tipo8 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean9 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo8);
        java.lang.String str10 = prodottoBean9.getDescrizione();
        java.lang.String str11 = prodottoBean9.getNome();
        int int12 = prodottoBean9.getQuantita();
        prodottoBean9.setDescrizione("hi!");
        cart0.addProduct(prodottoBean9);
        java.util.ArrayList<ita.kangaroo.model.CartProduct> cartProductList16 = cart0.getProducts();
        java.util.ArrayList<ita.kangaroo.model.CartProduct> cartProductList17 = cart0.getProducts();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(cartProductList16);
        org.junit.Assert.assertNotNull(cartProductList17);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        ita.kangaroo.model.AddressBean addressBean0 = new ita.kangaroo.model.AddressBean();
        java.lang.String str1 = addressBean0.getVia();
        java.lang.String str2 = addressBean0.getUsername();
        addressBean0.setUsername("hi!");
        addressBean0.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        addressBean0.setCitta("hi!");
        addressBean0.setCitta("hi!");
        int int11 = addressBean0.getId();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
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
        prodottoBean30.setQuantita(100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 1.0f + "'", float35 == 1.0f);
        org.junit.Assert.assertNull(tipo38);
        org.junit.Assert.assertNull(tipo43);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "", "", "hi!", "hi!", "hi!");
        java.lang.String str12 = utenteBean11.getUsername();
        utenteBean11.setPassword("");
        utenteBean11.setTelefono("Data non disponibile");
        java.lang.String str17 = utenteBean11.getEmail();
        utenteBean11.setPassword("");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
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
        ordineBean16.setCircuito("ProdottoBean{id=0, descrizione='', nome='', immagine='', prezzo=0.0, quantita=0, iva=0.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(utenteBean23);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
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
        java.lang.String str59 = prodottoBean49.getDescrizione();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 1.0f + "'", float35 == 1.0f);
        org.junit.Assert.assertNull(tipo38);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
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
        java.util.ArrayList<ita.kangaroo.model.OrderProductBean> orderProductBeanList25 = ordineBean12.getProducts();
        ita.kangaroo.model.OrdineBean ordineBean26 = new ita.kangaroo.model.OrdineBean(orderProductBeanList25);
        java.lang.String str27 = ordineBean26.getNumero_di_tracking();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(date22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "da39a3ee5e6b4b0d3255bfef95601890afd80709" + "'", str24, "da39a3ee5e6b4b0d3255bfef95601890afd80709");
        org.junit.Assert.assertNotNull(orderProductBeanList25);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        java.lang.String str12 = utenteBean11.getVia();
        java.lang.String str13 = utenteBean11.getProvincia();
        java.lang.String str14 = utenteBean11.getNome();
        utenteBean11.setUsername("ProdottoBean{id=10, descrizione='hi!', nome='', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        float float13 = ordineBean12.getPrezzo_totale();
        java.lang.String str14 = ordineBean12.getNumero_carta();
        ordineBean12.setDestinatario("hi!");
        ordineBean12.setPrezzo_totale((float) (short) 1);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
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
        ita.kangaroo.model.tipo tipo27 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean28 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo27);
        java.lang.String str29 = prodottoBean28.getImmagine();
        int int30 = prodottoBean28.getQuantita();
        java.lang.String str31 = prodottoBean28.getImmagine();
        java.lang.String str32 = prodottoBean28.getDescrizione();
        float float33 = prodottoBean28.getPrezzo();
        boolean boolean34 = metodoPagamentoBean0.equals((java.lang.Object) float33);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.0f + "'", float15 == 0.0f);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 1.0f + "'", float33 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        ita.kangaroo.model.MetodoPagamentoBean metodoPagamentoBean0 = new ita.kangaroo.model.MetodoPagamentoBean();
        metodoPagamentoBean0.setId((int) 'a');
        metodoPagamentoBean0.setCircuito("Data non disponibile");
        java.lang.String str5 = metodoPagamentoBean0.getCvv();
        java.lang.String str6 = metodoPagamentoBean0.getCircuito();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Data non disponibile" + "'", str6, "Data non disponibile");
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        utenteBean11.setEmail("hi!");
        ita.kangaroo.model.OrdineBean ordineBean14 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        ordineBean14.setDestinatario("hi!");
        ordineBean14.setNumero_di_tracking("hi!");
        ordineBean14.setMetodo_di_spedizione("");
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
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
        utenteBean24.setCap("ProdottoBean{id=0, descrizione='', nome='', immagine='', prezzo=0.0, quantita=0, iva=0.0, tipo=null}");
        java.lang.String str37 = utenteBean24.getCap();
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "3a987acf8cbc1028b7dbc86bd086831151899a2b" + "'", str34, "3a987acf8cbc1028b7dbc86bd086831151899a2b");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "ProdottoBean{id=0, descrizione='', nome='', immagine='', prezzo=0.0, quantita=0, iva=0.0, tipo=null}" + "'", str37, "ProdottoBean{id=0, descrizione='', nome='', immagine='', prezzo=0.0, quantita=0, iva=0.0, tipo=null}");
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean(10, "", "da39a3ee5e6b4b0d3255bfef95601890afd80709", "Data non disponibile", (float) (-1), (int) (byte) 100, (float) 0L, tipo7);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
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
        java.lang.String str35 = ordineBean12.getNumero_carta();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
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
        prodottoBean9.setIva((float) 'a');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        utenteBean11.setEmail("hi!");
        utenteBean11.setPassword("hi!");
        utenteBean11.setCognome("Data non disponibile");
        utenteBean11.setTelefono("Data non disponibile");
        java.lang.String str20 = utenteBean11.getCap();
        java.lang.String str21 = utenteBean11.getCap();
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (short) 0, "Data non disponibile", "Data non disponibile", "hi!", (float) 'a', 1, (float) (short) 10, tipo7);
        prodottoBean8.setDescrizione("hi!");
        ita.kangaroo.model.tipo tipo11 = null;
        prodottoBean8.setTipo(tipo11);
        prodottoBean8.setPrezzo((float) (byte) -1);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) -1, "Data non disponibile", "Data non disponibile", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", (float) ' ', (int) ' ', (float) ' ', tipo7);
        ita.kangaroo.model.CartProduct cartProduct9 = new ita.kangaroo.model.CartProduct(prodottoBean8);
        ita.kangaroo.model.ProdottoBean prodottoBean10 = cartProduct9.getProduct();
        java.lang.String str11 = prodottoBean10.getNome();
        org.junit.Assert.assertNotNull(prodottoBean10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Data non disponibile" + "'", str11, "Data non disponibile");
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        ita.kangaroo.model.utenteBean utenteBean1 = new ita.kangaroo.model.utenteBean();
        java.lang.String str2 = utenteBean1.getPassword();
        java.sql.Date date10 = null;
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(0, utenteBean1, (float) (short) -1, "Data non disponibile", "", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "Data non disponibile", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", date10, "");
        ordineBean12.setMetodo_di_spedizione("");
        ita.kangaroo.model.tipo tipo20 = null;
        ita.kangaroo.model.utenteBean utenteBean26 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo20, "hi!", "", "", "hi!", "");
        java.lang.String str27 = utenteBean26.getVia();
        ordineBean12.setClient(utenteBean26);
        ordineBean12.setMetodo_di_spedizione("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        ordineBean12.setNumero_carta("3a987acf8cbc1028b7dbc86bd086831151899a2b");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        ita.kangaroo.model.tipo tipo6 = null;
        ita.kangaroo.model.utenteBean utenteBean12 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo6, "hi!", "", "", "hi!", "");
        utenteBean12.setEmail("hi!");
        java.lang.String str15 = utenteBean12.getCognome();
        java.sql.Date date23 = null;
        ita.kangaroo.model.OrdineBean ordineBean25 = new ita.kangaroo.model.OrdineBean((int) (byte) 10, utenteBean12, (float) (-1L), "Data non disponibile", "Data non disponibile", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "hi!", "hi!", "", date23, "Data non disponibile");
        java.lang.String str26 = ordineBean25.toString();
        java.sql.Date date27 = ordineBean25.getData();
        ordineBean25.setId(0);
        ita.kangaroo.model.utenteBean utenteBean30 = ordineBean25.getClient();
        utenteBean30.setNome("ProdottoBean{id=-1, descrizione='Data non disponibile', nome='Data non disponibile', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=32.0, quantita=32, iva=32.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Data non disponibile" + "'", str26, "Data non disponibile");
        org.junit.Assert.assertNull(date27);
        org.junit.Assert.assertNotNull(utenteBean30);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
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
        metodoPagamentoBean0.setUsername("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='hi!', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        int int23 = metodoPagamentoBean0.getId();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("", "", "", "", "Data non disponibile", tipo5, "hi!", "", "Data non disponibile", "Data non disponibile", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        utenteBean11.setPassword("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        java.lang.String str14 = utenteBean11.getUsername();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Data non disponibile" + "'", str14, "Data non disponibile");
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
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
        java.lang.String str18 = metodoPagamentoBean0.getUsername();
        ita.kangaroo.model.tipo tipo25 = null;
        ita.kangaroo.model.utenteBean utenteBean31 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo25, "hi!", "", "", "hi!", "");
        utenteBean31.setEmail("hi!");
        java.lang.String str34 = utenteBean31.getCognome();
        utenteBean31.setCitta("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        utenteBean31.setUsername("Data non disponibile");
        java.sql.Date date46 = null;
        ita.kangaroo.model.OrdineBean ordineBean48 = new ita.kangaroo.model.OrdineBean(0, utenteBean31, (float) (byte) 0, "", "", "Data non disponibile", "Data non disponibile", "hi!", "", date46, "Data non disponibile");
        java.util.ArrayList<ita.kangaroo.model.OrderProductBean> orderProductBeanList49 = ordineBean48.getProducts();
        boolean boolean50 = metodoPagamentoBean0.equals((java.lang.Object) ordineBean48);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(orderProductBeanList49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        utenteBean11.setCognome("Data non disponibile");
        java.lang.String str14 = utenteBean11.getPassword();
        java.lang.String str15 = utenteBean11.getCap();
        utenteBean11.setCap("Data non disponibile");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        ita.kangaroo.model.ProdottoBean prodottoBean0 = null;
        ita.kangaroo.model.CartProduct cartProduct2 = new ita.kangaroo.model.CartProduct(prodottoBean0, (int) (byte) 10);
        cartProduct2.setQuantity((int) (short) 100);
        int int5 = cartProduct2.getQuantity();
        ita.kangaroo.model.ProdottoBean prodottoBean6 = cartProduct2.getProduct();
        cartProduct2.setQuantity((int) 'a');
        cartProduct2.setQuantity((int) (byte) 10);
        cartProduct2.setQuantity((int) ' ');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNull(prodottoBean6);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
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
        utenteBean12.setUsername("ProdottoBean{id=1, descrizione='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', nome='hi!', immagine='hi!', prezzo=0.0, quantita=-1, iva=1.0, tipo=null}");
        org.junit.Assert.assertNull(tipo33);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
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
        java.lang.String str20 = metodoPagamentoBean0.getUsername();
        metodoPagamentoBean0.setCvv("hi!");
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
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        int int9 = prodottoBean8.getId();
        java.lang.String str10 = prodottoBean8.getImmagine();
        ita.kangaroo.model.CartProduct cartProduct11 = new ita.kangaroo.model.CartProduct(prodottoBean8);
        cartProduct11.setQuantity((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        java.lang.String str12 = utenteBean11.getUsername();
        java.lang.String str13 = utenteBean11.getCap();
        utenteBean11.setCognome("hi!");
        java.lang.String str16 = utenteBean11.getCognome();
        java.lang.String str17 = utenteBean11.getTelefono();
        java.lang.String str18 = utenteBean11.getPassword();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        ita.kangaroo.model.MetodoPagamentoBean metodoPagamentoBean0 = new ita.kangaroo.model.MetodoPagamentoBean();
        metodoPagamentoBean0.setId((int) 'a');
        ita.kangaroo.model.AddressBean addressBean3 = new ita.kangaroo.model.AddressBean();
        java.lang.String str4 = addressBean3.getVia();
        addressBean3.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        addressBean3.setCitta("hi!");
        boolean boolean9 = metodoPagamentoBean0.equals((java.lang.Object) addressBean3);
        java.lang.Object obj10 = null;
        boolean boolean11 = metodoPagamentoBean0.equals(obj10);
        metodoPagamentoBean0.setId((int) ' ');
        metodoPagamentoBean0.setCircuito("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        float float2 = orderProductBean0.getIVA();
        orderProductBean0.setPrezzo(10.0f);
        orderProductBean0.setQuantita((int) (short) -1);
        float float7 = orderProductBean0.getIVA();
        orderProductBean0.setId_prodotto((int) (byte) 1);
        int int10 = orderProductBean0.getId_ordine();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        int int2 = orderProductBean0.getId_ordine();
        orderProductBean0.setQuantita((int) 'a');
        float float5 = orderProductBean0.getIVA();
        float float6 = orderProductBean0.getPrezzo();
        float float7 = orderProductBean0.getIVA();
        float float8 = orderProductBean0.getPrezzo();
        orderProductBean0.setQuantita((int) '4');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        ita.kangaroo.model.tipo tipo6 = null;
        ita.kangaroo.model.utenteBean utenteBean12 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo6, "hi!", "", "", "hi!", "");
        utenteBean12.setEmail("hi!");
        java.lang.String str15 = utenteBean12.getCognome();
        utenteBean12.setCitta("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        utenteBean12.setUsername("Data non disponibile");
        java.sql.Date date27 = null;
        ita.kangaroo.model.OrdineBean ordineBean29 = new ita.kangaroo.model.OrdineBean(0, utenteBean12, (float) (byte) 0, "", "", "Data non disponibile", "Data non disponibile", "hi!", "", date27, "Data non disponibile");
        ordineBean29.setDestinatario("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        java.lang.String str32 = ordineBean29.getIndirizzo_di_spedizione();
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        java.lang.String str12 = utenteBean11.getProvincia();
        java.lang.String str13 = utenteBean11.getCognome();
        java.lang.String str14 = utenteBean11.getVia();
        utenteBean11.setCognome("Data non disponibile");
        java.lang.String str17 = utenteBean11.getTelefono();
        java.lang.String str18 = utenteBean11.getCitta();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
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
        utenteBean28.setNome("hi!");
        ita.kangaroo.model.tipo tipo40 = utenteBean28.getTipo();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(orderProductBeanList14);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNull(tipo40);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
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
        utenteBean33.setTelefono("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='hi!', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(utenteBean33);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "", "", "hi!", "hi!", "hi!");
        java.lang.String str12 = utenteBean11.getUsername();
        utenteBean11.setPassword("");
        java.lang.String str15 = utenteBean11.getPassword();
        java.lang.String str16 = utenteBean11.getNome();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "da39a3ee5e6b4b0d3255bfef95601890afd80709" + "'", str15, "da39a3ee5e6b4b0d3255bfef95601890afd80709");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        java.lang.String str12 = utenteBean11.getCitta();
        utenteBean11.setTelefono("Data non disponibile");
        java.lang.String str15 = utenteBean11.getCap();
        utenteBean11.setTelefono("3a987acf8cbc1028b7dbc86bd086831151899a2b");
        java.lang.String str18 = utenteBean11.getCognome();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
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
        ita.kangaroo.model.tipo tipo63 = null;
        utenteBean44.setTipo(tipo63);
        java.lang.String str65 = utenteBean44.getTelefono();
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        int int2 = orderProductBean0.getId_ordine();
        orderProductBean0.setQuantita((int) 'a');
        int int5 = orderProductBean0.getId_ordine();
        int int6 = orderProductBean0.getId_ordine();
        float float7 = orderProductBean0.getPrezzo();
        orderProductBean0.setId_prodotto((int) (byte) 1);
        float float10 = orderProductBean0.getPrezzo();
        int int11 = orderProductBean0.getId_prodotto();
        orderProductBean0.setQuantita((int) 'a');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
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
        java.lang.Class<?> wildcardClass33 = utenteBean29.getClass();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
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
        float float25 = ordineBean12.getPrezzo_totale();
        int int26 = ordineBean12.getId();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(date22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "da39a3ee5e6b4b0d3255bfef95601890afd80709" + "'", str24, "da39a3ee5e6b4b0d3255bfef95601890afd80709");
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 97.0f + "'", float25 == 97.0f);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        ita.kangaroo.model.MetodoPagamentoBean metodoPagamentoBean0 = new ita.kangaroo.model.MetodoPagamentoBean();
        metodoPagamentoBean0.setId((int) 'a');
        ita.kangaroo.model.AddressBean addressBean3 = new ita.kangaroo.model.AddressBean();
        java.lang.String str4 = addressBean3.getVia();
        addressBean3.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        addressBean3.setCitta("hi!");
        boolean boolean9 = metodoPagamentoBean0.equals((java.lang.Object) addressBean3);
        java.lang.String str10 = metodoPagamentoBean0.getNumero_carta();
        int int11 = metodoPagamentoBean0.getId();
        java.lang.String str12 = metodoPagamentoBean0.getData_scadenza();
        ita.kangaroo.model.tipo tipo18 = null;
        ita.kangaroo.model.utenteBean utenteBean24 = new ita.kangaroo.model.utenteBean("ProdottoBean{id=10, descrizione='hi!', nome='', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}", "3a987acf8cbc1028b7dbc86bd086831151899a2b", "Data non disponibile", "3a987acf8cbc1028b7dbc86bd086831151899a2b", "da39a3ee5e6b4b0d3255bfef95601890afd80709", tipo18, "Data non disponibile", "3a987acf8cbc1028b7dbc86bd086831151899a2b", "", "ProdottoBean{id=10, descrizione='hi!', nome='', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}", "");
        ita.kangaroo.model.OrdineBean ordineBean25 = new ita.kangaroo.model.OrdineBean(utenteBean24);
        boolean boolean26 = metodoPagamentoBean0.equals((java.lang.Object) utenteBean24);
        java.lang.String str27 = metodoPagamentoBean0.getNumero_carta();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        ita.kangaroo.model.OrdineBean ordineBean0 = new ita.kangaroo.model.OrdineBean();
        ordineBean0.setNumero_carta("ProdottoBean{id=52, descrizione='hi!', nome='', immagine='da39a3ee5e6b4b0d3255bfef95601890afd80709', prezzo=32.0, quantita=-1, iva=52.0, tipo=null}");
        java.lang.String str3 = ordineBean0.getMetodo_di_spedizione();
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) -1, "Data non disponibile", "Data non disponibile", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", (float) ' ', (int) ' ', (float) ' ', tipo7);
        ita.kangaroo.model.CartProduct cartProduct9 = new ita.kangaroo.model.CartProduct(prodottoBean8);
        prodottoBean8.setDescrizione("ProdottoBean{id=1, descrizione='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', nome='hi!', immagine='hi!', prezzo=0.0, quantita=-1, iva=1.0, tipo=null}");
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        ita.kangaroo.model.AddressBean addressBean0 = new ita.kangaroo.model.AddressBean();
        java.lang.String str1 = addressBean0.getVia();
        java.lang.String str2 = addressBean0.getCitta();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        int int2 = orderProductBean0.getId_ordine();
        orderProductBean0.setQuantita((int) 'a');
        int int5 = orderProductBean0.getId_ordine();
        int int6 = orderProductBean0.getId_ordine();
        orderProductBean0.setId_prodotto(10);
        float float9 = orderProductBean0.getPrezzo();
        int int10 = orderProductBean0.getId_prodotto();
        int int11 = orderProductBean0.getId_prodotto();
        int int12 = orderProductBean0.getId_prodotto();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        utenteBean11.setEmail("hi!");
        utenteBean11.setPassword("hi!");
        utenteBean11.setProvincia("hi!");
        utenteBean11.setUsername("hi!");
        java.lang.String str20 = utenteBean11.getTelefono();
        java.lang.String str21 = utenteBean11.getNome();
        utenteBean11.setTelefono("");
        java.lang.String str24 = utenteBean11.getUsername();
        ita.kangaroo.model.OrdineBean ordineBean25 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
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
        java.lang.String str40 = ordineBean12.getMetodo_di_pagamento();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(date37);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "hi!", "", "", "hi!", tipo5, "", "", "Data non disponibile", "", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        java.lang.String str12 = utenteBean11.getEmail();
        utenteBean11.setCap("Data non disponibile");
        java.lang.String str15 = utenteBean11.getEmail();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        ordineBean12.setNumero_carta("");
        java.sql.Date date16 = ordineBean12.getData();
        ita.kangaroo.model.utenteBean utenteBean17 = ordineBean12.getClient();
        ita.kangaroo.model.tipo tipo18 = utenteBean17.getTipo();
        utenteBean17.setCap("ProdottoBean{id=10, descrizione='hi!', nome='', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}");
        utenteBean17.setEmail("ProdottoBean{id=10, descrizione='hi!', nome='', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}");
        utenteBean17.setVia("hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertNotNull(utenteBean17);
        org.junit.Assert.assertNull(tipo18);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
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
        ordineBean12.setNumero_carta("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        java.lang.Class<?> wildcardClass27 = ordineBean12.getClass();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        java.lang.String str12 = utenteBean11.getCitta();
        utenteBean11.setTelefono("Data non disponibile");
        java.lang.String str15 = utenteBean11.getCap();
        utenteBean11.setTelefono("3a987acf8cbc1028b7dbc86bd086831151899a2b");
        java.lang.String str18 = utenteBean11.getPassword();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        int int2 = orderProductBean0.getQuantita();
        float float3 = orderProductBean0.getIVA();
        float float4 = orderProductBean0.getPrezzo();
        float float5 = orderProductBean0.getIVA();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
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
        int int28 = metodoPagamentoBean0.getId();
        metodoPagamentoBean0.setId(10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 97 + "'", int28 == 97);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        ita.kangaroo.model.tipo tipo6 = null;
        ita.kangaroo.model.utenteBean utenteBean12 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo6, "hi!", "", "", "hi!", "");
        java.lang.String str13 = utenteBean12.getUsername();
        java.lang.String str14 = utenteBean12.getCap();
        java.sql.Date date22 = null;
        ita.kangaroo.model.OrdineBean ordineBean24 = new ita.kangaroo.model.OrdineBean((int) (short) 0, utenteBean12, (float) 10L, "", "Data non disponibile", "hi!", "hi!", "", "", date22, "hi!");
        utenteBean12.setEmail("Data non disponibile");
        ita.kangaroo.model.OrdineBean ordineBean27 = new ita.kangaroo.model.OrdineBean(utenteBean12);
        java.lang.String str28 = utenteBean12.getVia();
        ita.kangaroo.model.tipo tipo29 = null;
        utenteBean12.setTipo(tipo29);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        ordineBean12.setNumero_carta("");
        ita.kangaroo.model.tipo tipo21 = null;
        ita.kangaroo.model.utenteBean utenteBean27 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo21, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean28 = new ita.kangaroo.model.OrdineBean(utenteBean27);
        java.lang.String str29 = ordineBean28.getMetodo_di_spedizione();
        ordineBean28.setNumero_carta("");
        java.sql.Date date32 = ordineBean28.getData();
        int int33 = ordineBean28.getId();
        ita.kangaroo.model.tipo tipo39 = null;
        ita.kangaroo.model.utenteBean utenteBean45 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo39, "hi!", "", "", "hi!", "");
        java.lang.String str46 = utenteBean45.getProvincia();
        java.lang.String str47 = utenteBean45.getCognome();
        ordineBean28.setClient(utenteBean45);
        java.lang.String str49 = utenteBean45.getCap();
        ordineBean12.setClient(utenteBean45);
        utenteBean45.setCitta("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='hi!', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(date32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        ita.kangaroo.model.Cart cart0 = new ita.kangaroo.model.Cart();
        ita.kangaroo.model.tipo tipo8 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean9 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo8);
        int int10 = prodottoBean9.getId();
        java.lang.String str11 = prodottoBean9.getImmagine();
        cart0.removeProduct(prodottoBean9);
        ita.kangaroo.model.tipo tipo13 = prodottoBean9.getTipo();
        java.lang.String str14 = prodottoBean9.getImmagine();
        ita.kangaroo.model.CartProduct cartProduct16 = new ita.kangaroo.model.CartProduct(prodottoBean9, (int) '#');
        float float17 = prodottoBean9.getPrezzo();
        java.lang.String str18 = prodottoBean9.getNome();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(tipo13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 1.0f + "'", float17 == 1.0f);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        float float2 = orderProductBean0.getIVA();
        int int3 = orderProductBean0.getId_prodotto();
        float float4 = orderProductBean0.getPrezzo();
        orderProductBean0.setId_prodotto(35);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        ita.kangaroo.model.tipo tipo6 = null;
        ita.kangaroo.model.utenteBean utenteBean12 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo6, "hi!", "", "", "hi!", "");
        utenteBean12.setEmail("hi!");
        utenteBean12.setPassword("hi!");
        utenteBean12.setProvincia("hi!");
        utenteBean12.setUsername("hi!");
        java.lang.String str21 = utenteBean12.getTelefono();
        java.lang.String str22 = utenteBean12.getNome();
        java.lang.String str23 = utenteBean12.getEmail();
        java.sql.Date date31 = null;
        ita.kangaroo.model.OrdineBean ordineBean33 = new ita.kangaroo.model.OrdineBean((int) '4', utenteBean12, (float) 0L, "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='hi!', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "3d1583397bcebff274b1e7cb58087c39153af974", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='hi!', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "ProdottoBean{id=32, descrizione='Data non disponibile', nome='Data non disponibile', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=32.0, quantita=32, iva=10.0, tipo=null}", "", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", date31, "ProdottoBean{id=32, descrizione='Data non disponibile', nome='Data non disponibile', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=32.0, quantita=32, iva=10.0, tipo=null}");
        ita.kangaroo.model.tipo tipo34 = null;
        utenteBean12.setTipo(tipo34);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) -1, "", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "Data non disponibile", 100.0f, 0, (float) (byte) 100, tipo7);
        int int9 = prodottoBean8.getId();
        prodottoBean8.setImmagine("");
        int int12 = prodottoBean8.getId();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        ita.kangaroo.model.Cart cart0 = new ita.kangaroo.model.Cart();
        java.util.ArrayList<ita.kangaroo.model.CartProduct> cartProductList1 = cart0.getProducts();
        java.util.ArrayList<ita.kangaroo.model.CartProduct> cartProductList2 = cart0.getProducts();
        ita.kangaroo.model.Cart cart3 = new ita.kangaroo.model.Cart();
        java.util.ArrayList<ita.kangaroo.model.CartProduct> cartProductList4 = cart3.getProducts();
        java.util.ArrayList<ita.kangaroo.model.CartProduct> cartProductList5 = cart3.getProducts();
        ita.kangaroo.model.Cart cart6 = new ita.kangaroo.model.Cart();
        ita.kangaroo.model.tipo tipo14 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean15 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo14);
        int int16 = prodottoBean15.getId();
        java.lang.String str17 = prodottoBean15.getImmagine();
        cart6.removeProduct(prodottoBean15);
        ita.kangaroo.model.tipo tipo26 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean27 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo26);
        java.lang.String str28 = prodottoBean27.getDescrizione();
        java.lang.String str29 = prodottoBean27.getNome();
        ita.kangaroo.model.tipo tipo30 = prodottoBean27.getTipo();
        cart6.removeProduct(prodottoBean27);
        ita.kangaroo.model.tipo tipo39 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean40 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo39);
        java.lang.String str41 = prodottoBean40.getImmagine();
        prodottoBean40.setPrezzo((float) (-1L));
        int int44 = prodottoBean40.getId();
        float float45 = prodottoBean40.getIva();
        prodottoBean40.setQuantita((int) ' ');
        ita.kangaroo.model.tipo tipo48 = prodottoBean40.getTipo();
        cart6.addProduct(prodottoBean40);
        ita.kangaroo.model.tipo tipo57 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean58 = new ita.kangaroo.model.ProdottoBean((int) (byte) -1, "Data non disponibile", "Data non disponibile", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", (float) ' ', (int) ' ', (float) ' ', tipo57);
        ita.kangaroo.model.CartProduct cartProduct59 = new ita.kangaroo.model.CartProduct(prodottoBean58);
        int int60 = prodottoBean58.getQuantita();
        prodottoBean58.setDescrizione("hi!");
        prodottoBean58.setIva(0.0f);
        cart6.changeQuantity(prodottoBean58, (-1));
        ita.kangaroo.model.Cart cart67 = new ita.kangaroo.model.Cart();
        ita.kangaroo.model.tipo tipo75 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean76 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo75);
        int int77 = prodottoBean76.getId();
        java.lang.String str78 = prodottoBean76.getImmagine();
        cart67.removeProduct(prodottoBean76);
        ita.kangaroo.model.tipo tipo80 = prodottoBean76.getTipo();
        float float81 = prodottoBean76.getPrezzo();
        ita.kangaroo.model.CartProduct cartProduct82 = new ita.kangaroo.model.CartProduct(prodottoBean76);
        cart6.addProduct(prodottoBean76);
        cart3.addProduct(prodottoBean76);
        cart0.addProduct(prodottoBean76);
        org.junit.Assert.assertNotNull(cartProductList1);
        org.junit.Assert.assertNotNull(cartProductList2);
        org.junit.Assert.assertNotNull(cartProductList4);
        org.junit.Assert.assertNotNull(cartProductList5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNull(tipo30);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertTrue("'" + float45 + "' != '" + 1.0f + "'", float45 == 1.0f);
        org.junit.Assert.assertNull(tipo48);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 32 + "'", int60 == 32);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 1 + "'", int77 == 1);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "hi!" + "'", str78, "hi!");
        org.junit.Assert.assertNull(tipo80);
        org.junit.Assert.assertTrue("'" + float81 + "' != '" + 1.0f + "'", float81 == 1.0f);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
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
        ordineBean12.setNumero_carta("ProdottoBean{id=10, descrizione='hi!', nome='', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}");
        ordineBean12.setPrezzo_totale((float) (-1));
        ordineBean12.setDestinatario("ProdottoBean{id=1, descrizione='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', nome='hi!', immagine='hi!', prezzo=0.0, quantita=-1, iva=1.0, tipo=null}");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Data non disponibile" + "'", str21, "Data non disponibile");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertNotNull(orderProductBeanList68);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        ita.kangaroo.model.tipo tipo18 = null;
        ita.kangaroo.model.utenteBean utenteBean24 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo18, "hi!", "", "", "hi!", "");
        utenteBean24.setEmail("hi!");
        utenteBean24.setPassword("hi!");
        java.lang.String str29 = utenteBean24.getCognome();
        ordineBean12.setClient(utenteBean24);
        java.lang.String str31 = utenteBean24.getPassword();
        java.lang.String str32 = utenteBean24.getVia();
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "3a987acf8cbc1028b7dbc86bd086831151899a2b" + "'", str31, "3a987acf8cbc1028b7dbc86bd086831151899a2b");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        ita.kangaroo.model.MetodoPagamentoBean metodoPagamentoBean0 = new ita.kangaroo.model.MetodoPagamentoBean();
        metodoPagamentoBean0.setId((int) 'a');
        ita.kangaroo.model.AddressBean addressBean3 = new ita.kangaroo.model.AddressBean();
        java.lang.String str4 = addressBean3.getVia();
        addressBean3.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        addressBean3.setCitta("hi!");
        boolean boolean9 = metodoPagamentoBean0.equals((java.lang.Object) addressBean3);
        java.lang.String str10 = addressBean3.getCitta();
        addressBean3.setUsername("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        java.lang.String str13 = addressBean3.getVia();
        addressBean3.setUsername("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        addressBean3.setVia("ProdottoBean{id=0, descrizione='', nome='', immagine='', prezzo=0.0, quantita=0, iva=0.0, tipo=null}");
        ita.kangaroo.model.tipo tipo25 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean26 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo25);
        java.lang.String str27 = prodottoBean26.getImmagine();
        prodottoBean26.setPrezzo((float) (-1L));
        int int30 = prodottoBean26.getId();
        prodottoBean26.setPrezzo((float) (-1));
        ita.kangaroo.model.tipo tipo33 = null;
        prodottoBean26.setTipo(tipo33);
        int int35 = prodottoBean26.getQuantita();
        ita.kangaroo.model.CartProduct cartProduct37 = new ita.kangaroo.model.CartProduct(prodottoBean26, 32);
        boolean boolean38 = addressBean3.equals((java.lang.Object) cartProduct37);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}" + "'", str13, "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getDescrizione();
        prodottoBean8.setImmagine("");
        java.lang.String str12 = prodottoBean8.toString();
        float float13 = prodottoBean8.getIva();
        java.lang.String str14 = prodottoBean8.toString();
        float float15 = prodottoBean8.getPrezzo();
        ita.kangaroo.model.tipo tipo16 = prodottoBean8.getTipo();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}" + "'", str12, "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}" + "'", str14, "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 1.0f + "'", float15 == 1.0f);
        org.junit.Assert.assertNull(tipo16);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getImmagine();
        int int10 = prodottoBean8.getQuantita();
        java.lang.String str11 = prodottoBean8.getImmagine();
        ita.kangaroo.model.CartProduct cartProduct12 = new ita.kangaroo.model.CartProduct(prodottoBean8);
        prodottoBean8.setId((int) (short) 0);
        prodottoBean8.setIva(0.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
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
        ita.kangaroo.model.tipo tipo38 = prodottoBean30.getTipo();
        prodottoBean30.setNome("ProdottoBean{id=10, descrizione='hi!', nome='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}");
        cart0.changeQuantity(prodottoBean30, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNull(tipo38);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        int int2 = orderProductBean0.getId_ordine();
        orderProductBean0.setQuantita((int) 'a');
        orderProductBean0.setIVA((float) 32);
        int int7 = orderProductBean0.getId_prodotto();
        orderProductBean0.setId_prodotto((int) (short) 100);
        int int10 = orderProductBean0.getId_prodotto();
        int int11 = orderProductBean0.getId_prodotto();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        java.lang.String str12 = utenteBean11.getUsername();
        java.lang.String str13 = utenteBean11.getCap();
        utenteBean11.setUsername("");
        ita.kangaroo.model.OrdineBean ordineBean16 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str17 = utenteBean11.getPassword();
        java.lang.String str18 = utenteBean11.getProvincia();
        java.lang.String str19 = utenteBean11.getVia();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        ita.kangaroo.model.tipo tipo6 = null;
        ita.kangaroo.model.utenteBean utenteBean12 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo6, "hi!", "", "", "hi!", "");
        java.lang.String str13 = utenteBean12.getVia();
        java.lang.String str14 = utenteBean12.getProvincia();
        java.lang.String str15 = utenteBean12.getNome();
        java.sql.Date date23 = null;
        ita.kangaroo.model.OrdineBean ordineBean25 = new ita.kangaroo.model.OrdineBean((int) (byte) 10, utenteBean12, (float) 1L, "", "ProdottoBean{id=10, descrizione='hi!', nome='', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}", "Data non disponibile", "Data non disponibile", "ProdottoBean{id=10, descrizione='hi!', nome='', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}", "3a987acf8cbc1028b7dbc86bd086831151899a2b", date23, "3a987acf8cbc1028b7dbc86bd086831151899a2b");
        ordineBean25.setMetodo_di_pagamento("Data non disponibile");
        ordineBean25.setNumero_di_tracking("ProdottoBean{id=32, descrizione='Data non disponibile', nome='Data non disponibile', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=32.0, quantita=32, iva=10.0, tipo=null}");
        ordineBean25.setNumero_carta("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='hi!', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
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
        java.lang.String str32 = ordineBean27.getIndirizzo_di_spedizione();
        ordineBean27.setMetodo_di_pagamento("ProdottoBean{id=10, descrizione='hi!', nome='', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Data non disponibile" + "'", str32, "Data non disponibile");
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        ita.kangaroo.model.utenteBean utenteBean1 = new ita.kangaroo.model.utenteBean();
        java.lang.String str2 = utenteBean1.getPassword();
        java.sql.Date date10 = null;
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(0, utenteBean1, (float) (short) -1, "Data non disponibile", "", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "Data non disponibile", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", date10, "");
        utenteBean1.setTelefono("");
        java.lang.String str15 = utenteBean1.getCap();
        java.lang.String str16 = utenteBean1.getUsername();
        utenteBean1.setEmail("");
        utenteBean1.setNome("3d1583397bcebff274b1e7cb58087c39153af974");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        ita.kangaroo.model.Cart cart0 = new ita.kangaroo.model.Cart();
        java.util.ArrayList<ita.kangaroo.model.CartProduct> cartProductList1 = cart0.getProducts();
        java.util.ArrayList<ita.kangaroo.model.CartProduct> cartProductList2 = cart0.getProducts();
        ita.kangaroo.model.tipo tipo10 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean11 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo10);
        int int12 = prodottoBean11.getId();
        int int13 = prodottoBean11.getQuantita();
        prodottoBean11.setPrezzo((float) 1L);
        prodottoBean11.setId((int) (byte) -1);
        cart0.changeQuantity(prodottoBean11, (-1));
        org.junit.Assert.assertNotNull(cartProductList1);
        org.junit.Assert.assertNotNull(cartProductList2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getCircuito();
        java.lang.String str14 = ordineBean12.toString();
        ordineBean12.setNumero_di_tracking("Data non disponibile");
        java.util.ArrayList<ita.kangaroo.model.OrderProductBean> orderProductBeanList17 = ordineBean12.getProducts();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Data non disponibile" + "'", str14, "Data non disponibile");
        org.junit.Assert.assertNotNull(orderProductBeanList17);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        ita.kangaroo.model.AddressBean addressBean0 = new ita.kangaroo.model.AddressBean();
        java.lang.String str1 = addressBean0.getVia();
        java.lang.String str2 = addressBean0.getUsername();
        java.lang.String str3 = addressBean0.getCAP();
        java.lang.String str4 = addressBean0.getUsername();
        addressBean0.setId(10);
        addressBean0.setVia("");
        addressBean0.setCitta("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        java.lang.String str11 = addressBean0.getUsername();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        ita.kangaroo.model.AddressBean addressBean5 = new ita.kangaroo.model.AddressBean((int) (short) 0, "hi!", "Data non disponibile", "", "");
        addressBean5.setVia("3a987acf8cbc1028b7dbc86bd086831151899a2b");
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        ita.kangaroo.model.CartProduct cartProduct10 = new ita.kangaroo.model.CartProduct(prodottoBean8, (int) (short) 100);
        ita.kangaroo.model.tipo tipo11 = null;
        prodottoBean8.setTipo(tipo11);
        java.lang.String str13 = prodottoBean8.getImmagine();
        java.lang.String str14 = prodottoBean8.getNome();
        prodottoBean8.setImmagine("");
        java.lang.String str17 = prodottoBean8.toString();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}" + "'", str17, "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        ita.kangaroo.model.AddressBean addressBean0 = new ita.kangaroo.model.AddressBean();
        java.lang.String str1 = addressBean0.getVia();
        java.lang.String str2 = addressBean0.getUsername();
        addressBean0.setUsername("hi!");
        addressBean0.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        boolean boolean8 = addressBean0.equals((java.lang.Object) 10L);
        int int9 = addressBean0.getId();
        addressBean0.setCitta("hi!");
        java.lang.String str12 = addressBean0.getCAP();
        java.lang.String str13 = addressBean0.getCAP();
        java.lang.String str14 = addressBean0.getUsername();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        ita.kangaroo.model.tipo tipo19 = null;
        ita.kangaroo.model.utenteBean utenteBean25 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo19, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean26 = new ita.kangaroo.model.OrdineBean(utenteBean25);
        java.lang.String str27 = ordineBean26.getMetodo_di_spedizione();
        java.util.ArrayList<ita.kangaroo.model.OrderProductBean> orderProductBeanList28 = ordineBean26.getProducts();
        ordineBean26.setNumero_carta("hi!");
        ita.kangaroo.model.tipo tipo36 = null;
        ita.kangaroo.model.utenteBean utenteBean42 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo36, "hi!", "", "", "hi!", "");
        utenteBean42.setEmail("hi!");
        java.lang.String str45 = utenteBean42.getCognome();
        utenteBean42.setCitta("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        ordineBean26.setClient(utenteBean42);
        java.lang.String str49 = utenteBean42.getTelefono();
        ordineBean12.setClient(utenteBean42);
        utenteBean42.setNome("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        utenteBean42.setProvincia("hi!");
        java.lang.String str55 = utenteBean42.getCognome();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(orderProductBeanList28);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        ordineBean12.setNumero_carta("");
        java.lang.String str16 = ordineBean12.getIndirizzo_di_spedizione();
        java.sql.Date date17 = null;
        ordineBean12.setData(date17);
        java.sql.Date date19 = ordineBean12.getData();
        java.lang.String str20 = ordineBean12.getMetodo_di_pagamento();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(date19);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
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
        utenteBean29.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        ita.kangaroo.model.tipo tipo38 = utenteBean29.getTipo();
        java.lang.String str39 = utenteBean29.getPassword();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNull(tipo38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) -1, "", "", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", (float) ' ', (int) (short) 1, (float) (short) 0, tipo7);
        prodottoBean8.setImmagine("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        int int11 = prodottoBean8.getId();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        ita.kangaroo.model.Cart cart0 = new ita.kangaroo.model.Cart();
        java.util.ArrayList<ita.kangaroo.model.CartProduct> cartProductList1 = cart0.getProducts();
        java.util.ArrayList<ita.kangaroo.model.CartProduct> cartProductList2 = cart0.getProducts();
        ita.kangaroo.model.ProdottoBean prodottoBean3 = new ita.kangaroo.model.ProdottoBean();
        prodottoBean3.setDescrizione("hi!");
        int int6 = prodottoBean3.getQuantita();
        cart0.changeQuantity(prodottoBean3, (int) (byte) 10);
        ita.kangaroo.model.tipo tipo16 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean17 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo16);
        java.lang.String str18 = prodottoBean17.getImmagine();
        int int19 = prodottoBean17.getQuantita();
        java.lang.String str20 = prodottoBean17.getImmagine();
        int int21 = prodottoBean17.getQuantita();
        cart0.changeQuantity(prodottoBean17, (int) (byte) 100);
        org.junit.Assert.assertNotNull(cartProductList1);
        org.junit.Assert.assertNotNull(cartProductList2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        utenteBean11.setEmail("hi!");
        utenteBean11.setPassword("hi!");
        java.lang.String str16 = utenteBean11.getCognome();
        java.lang.String str17 = utenteBean11.getUsername();
        utenteBean11.setUsername("hi!");
        utenteBean11.setCognome("ProdottoBean{id=52, descrizione='hi!', nome='', immagine='da39a3ee5e6b4b0d3255bfef95601890afd80709', prezzo=32.0, quantita=-1, iva=52.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        ita.kangaroo.model.Cart cart0 = new ita.kangaroo.model.Cart();
        ita.kangaroo.model.tipo tipo8 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean9 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo8);
        int int10 = prodottoBean9.getId();
        java.lang.String str11 = prodottoBean9.getImmagine();
        cart0.removeProduct(prodottoBean9);
        ita.kangaroo.model.Cart cart13 = new ita.kangaroo.model.Cart();
        ita.kangaroo.model.tipo tipo21 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean22 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo21);
        java.lang.String str23 = prodottoBean22.getDescrizione();
        java.lang.String str24 = prodottoBean22.getNome();
        int int25 = prodottoBean22.getQuantita();
        prodottoBean22.setDescrizione("hi!");
        cart13.addProduct(prodottoBean22);
        ita.kangaroo.model.tipo tipo36 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean37 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo36);
        java.lang.String str38 = prodottoBean37.getImmagine();
        int int39 = prodottoBean37.getQuantita();
        prodottoBean37.setImmagine("hi!");
        ita.kangaroo.model.CartProduct cartProduct43 = new ita.kangaroo.model.CartProduct(prodottoBean37, (int) (short) 100);
        cart13.changeQuantity(prodottoBean37, (int) (short) 10);
        ita.kangaroo.model.Cart cart46 = new ita.kangaroo.model.Cart();
        ita.kangaroo.model.tipo tipo54 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean55 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo54);
        java.lang.String str56 = prodottoBean55.getDescrizione();
        java.lang.String str57 = prodottoBean55.getNome();
        int int58 = prodottoBean55.getQuantita();
        prodottoBean55.setDescrizione("hi!");
        cart46.addProduct(prodottoBean55);
        ita.kangaroo.model.tipo tipo69 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean70 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo69);
        java.lang.String str71 = prodottoBean70.getImmagine();
        int int72 = prodottoBean70.getQuantita();
        prodottoBean70.setImmagine("hi!");
        ita.kangaroo.model.CartProduct cartProduct76 = new ita.kangaroo.model.CartProduct(prodottoBean70, (int) (short) 100);
        cart46.changeQuantity(prodottoBean70, (int) (short) 10);
        int int79 = prodottoBean70.getQuantita();
        cart13.addProduct(prodottoBean70);
        cart0.removeProduct(prodottoBean70);
        prodottoBean70.setId(0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!" + "'", str71, "hi!");
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getDescrizione();
        java.lang.String str10 = prodottoBean8.getNome();
        int int11 = prodottoBean8.getQuantita();
        prodottoBean8.setDescrizione("hi!");
        java.lang.String str14 = prodottoBean8.toString();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='hi!', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}" + "'", str14, "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='hi!', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        float float2 = orderProductBean0.getIVA();
        orderProductBean0.setPrezzo(10.0f);
        orderProductBean0.setId_prodotto((int) '#');
        orderProductBean0.setId_ordine((int) (byte) 0);
        orderProductBean0.setId_ordine((int) (short) 0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        ordineBean12.setNumero_carta("");
        java.sql.Date date16 = ordineBean12.getData();
        ordineBean12.setPrezzo_totale((float) 'a');
        java.lang.String str19 = ordineBean12.getNumero_carta();
        java.sql.Date date20 = ordineBean12.getData();
        ordineBean12.setMetodo_di_spedizione("hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(date20);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getDescrizione();
        java.lang.String str10 = prodottoBean8.getDescrizione();
        ita.kangaroo.model.CartProduct cartProduct11 = new ita.kangaroo.model.CartProduct(prodottoBean8);
        ita.kangaroo.model.ProdottoBean prodottoBean12 = cartProduct11.getProduct();
        int int13 = prodottoBean12.getQuantita();
        int int14 = prodottoBean12.getQuantita();
        java.lang.Class<?> wildcardClass15 = prodottoBean12.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(prodottoBean12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
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
        java.lang.String str24 = metodoPagamentoBean0.getNumero_carta();
        java.lang.String str25 = metodoPagamentoBean0.getUsername();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}" + "'", str23, "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}" + "'", str25, "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getImmagine();
        prodottoBean8.setPrezzo((float) (-1L));
        int int12 = prodottoBean8.getId();
        prodottoBean8.setPrezzo((float) (-1));
        ita.kangaroo.model.tipo tipo15 = null;
        prodottoBean8.setTipo(tipo15);
        float float17 = prodottoBean8.getIva();
        prodottoBean8.setQuantita((int) (byte) 1);
        java.lang.String str20 = prodottoBean8.toString();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 1.0f + "'", float17 == 1.0f);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='hi!', prezzo=-1.0, quantita=1, iva=1.0, tipo=null}" + "'", str20, "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='hi!', prezzo=-1.0, quantita=1, iva=1.0, tipo=null}");
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        orderProductBean0.setQuantita((int) (byte) 100);
        orderProductBean0.setPrezzo((float) (-1));
        orderProductBean0.setId_prodotto((int) ' ');
        orderProductBean0.setId_prodotto((int) (byte) 100);
        int int10 = orderProductBean0.getQuantita();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        java.util.ArrayList<ita.kangaroo.model.OrderProductBean> orderProductBeanList14 = ordineBean12.getProducts();
        ordineBean12.setNumero_carta("hi!");
        ita.kangaroo.model.utenteBean utenteBean17 = ordineBean12.getClient();
        ita.kangaroo.model.tipo tipo18 = null;
        utenteBean17.setTipo(tipo18);
        java.lang.String str20 = utenteBean17.getNome();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(orderProductBeanList14);
        org.junit.Assert.assertNotNull(utenteBean17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getImmagine();
        prodottoBean8.setPrezzo((float) (-1L));
        java.lang.String str12 = prodottoBean8.getNome();
        ita.kangaroo.model.CartProduct cartProduct14 = new ita.kangaroo.model.CartProduct(prodottoBean8, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        ordineBean12.setNumero_carta("");
        java.sql.Date date16 = ordineBean12.getData();
        ordineBean12.setMetodo_di_pagamento("");
        ordineBean12.setNumero_di_tracking("");
        ordineBean12.setPrezzo_totale((float) 100L);
        ordineBean12.setId(52);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(date16);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getImmagine();
        prodottoBean8.setPrezzo((float) (-1L));
        int int12 = prodottoBean8.getId();
        prodottoBean8.setPrezzo(10.0f);
        prodottoBean8.setPrezzo(0.0f);
        prodottoBean8.setQuantita(97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
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
        java.lang.String str39 = ordineBean12.getCircuito();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str39);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        ordineBean12.setIndirizzo_di_spedizione("Data non disponibile");
        ordineBean12.setNumero_di_tracking("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        java.sql.Date date17 = null;
        ordineBean12.setData(date17);
        ita.kangaroo.model.tipo tipo25 = null;
        ita.kangaroo.model.utenteBean utenteBean31 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo25, "hi!", "", "", "hi!", "");
        utenteBean31.setEmail("hi!");
        utenteBean31.setPassword("hi!");
        utenteBean31.setProvincia("hi!");
        utenteBean31.setUsername("hi!");
        utenteBean31.setCognome("hi!");
        java.sql.Date date49 = null;
        ita.kangaroo.model.OrdineBean ordineBean51 = new ita.kangaroo.model.OrdineBean((int) (byte) 10, utenteBean31, (float) (short) 100, "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "hi!", "", "", "hi!", "", date49, "");
        ita.kangaroo.model.tipo tipo52 = utenteBean31.getTipo();
        utenteBean31.setUsername("hi!");
        utenteBean31.setUsername("Data non disponibile");
        java.lang.String str57 = utenteBean31.getCognome();
        ordineBean12.setClient(utenteBean31);
        org.junit.Assert.assertNull(tipo52);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) '#', "3a987acf8cbc1028b7dbc86bd086831151899a2b", "3a987acf8cbc1028b7dbc86bd086831151899a2b", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", (float) (byte) 0, (int) (byte) 1, (float) (-1L), tipo7);
        ita.kangaroo.model.CartProduct cartProduct10 = new ita.kangaroo.model.CartProduct(prodottoBean8, 32);
        cartProduct10.setQuantity(100);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        ita.kangaroo.model.tipo tipo6 = null;
        ita.kangaroo.model.utenteBean utenteBean12 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo6, "hi!", "", "", "hi!", "");
        utenteBean12.setEmail("hi!");
        utenteBean12.setPassword("hi!");
        utenteBean12.setProvincia("hi!");
        utenteBean12.setUsername("hi!");
        java.lang.String str21 = utenteBean12.getTelefono();
        java.lang.String str22 = utenteBean12.getNome();
        java.lang.String str23 = utenteBean12.getEmail();
        java.sql.Date date31 = null;
        ita.kangaroo.model.OrdineBean ordineBean33 = new ita.kangaroo.model.OrdineBean((int) '4', utenteBean12, (float) 0L, "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='hi!', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "3d1583397bcebff274b1e7cb58087c39153af974", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='hi!', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "ProdottoBean{id=32, descrizione='Data non disponibile', nome='Data non disponibile', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=32.0, quantita=32, iva=10.0, tipo=null}", "", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", date31, "ProdottoBean{id=32, descrizione='Data non disponibile', nome='Data non disponibile', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=32.0, quantita=32, iva=10.0, tipo=null}");
        java.lang.String str34 = utenteBean12.getVia();
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 10, "hi!", "hi!", "Data non disponibile", (float) (byte) 10, 10, (float) ' ', tipo7);
        java.lang.String str9 = prodottoBean8.getNome();
        prodottoBean8.setNome("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='hi!', prezzo=-1.0, quantita=-1, iva=1.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        float float2 = orderProductBean0.getIVA();
        orderProductBean0.setPrezzo(10.0f);
        orderProductBean0.setId_ordine((int) (short) 0);
        orderProductBean0.setIVA((-1.0f));
        int int9 = orderProductBean0.getId_ordine();
        orderProductBean0.setIVA((float) 100L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        float float13 = ordineBean12.getPrezzo_totale();
        java.lang.String str14 = ordineBean12.getMetodo_di_pagamento();
        ordineBean12.setNumero_di_tracking("hi!");
        ordineBean12.setNumero_di_tracking("Data non disponibile");
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
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
        ita.kangaroo.model.tipo tipo55 = null;
        ita.kangaroo.model.utenteBean utenteBean61 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo55, "hi!", "", "", "hi!", "");
        java.lang.String str62 = utenteBean61.getUsername();
        java.lang.String str63 = utenteBean61.getCap();
        java.sql.Date date71 = null;
        ita.kangaroo.model.OrdineBean ordineBean73 = new ita.kangaroo.model.OrdineBean((int) (short) 0, utenteBean61, (float) 10L, "", "Data non disponibile", "hi!", "hi!", "", "", date71, "hi!");
        utenteBean61.setEmail("Data non disponibile");
        java.lang.String str76 = utenteBean61.getUsername();
        ordineBean48.setClient(utenteBean61);
        utenteBean61.setUsername("ProdottoBean{id=10, descrizione='hi!', nome='', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(orderProductBeanList46);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "hi!" + "'", str76, "hi!");
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) -1, "", "", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", (float) ' ', (int) (short) 1, (float) (short) 0, tipo7);
        java.lang.String str9 = prodottoBean8.getImmagine();
        int int10 = prodottoBean8.getId();
        ita.kangaroo.model.CartProduct cartProduct11 = new ita.kangaroo.model.CartProduct(prodottoBean8);
        java.lang.String str12 = prodottoBean8.toString();
        float float13 = prodottoBean8.getIva();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}" + "'", str9, "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ProdottoBean{id=-1, descrizione='', nome='', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=32.0, quantita=1, iva=0.0, tipo=null}" + "'", str12, "ProdottoBean{id=-1, descrizione='', nome='', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=32.0, quantita=1, iva=0.0, tipo=null}");
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
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
        metodoPagamentoBean0.setCvv("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        int int30 = metodoPagamentoBean0.getId();
        int int31 = metodoPagamentoBean0.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 97 + "'", int30 == 97);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 97 + "'", int31 == 97);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        float float2 = orderProductBean0.getIVA();
        orderProductBean0.setPrezzo(10.0f);
        float float5 = orderProductBean0.getPrezzo();
        float float6 = orderProductBean0.getPrezzo();
        int int7 = orderProductBean0.getId_ordine();
        int int8 = orderProductBean0.getId_prodotto();
        orderProductBean0.setId_prodotto(0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10.0f + "'", float5 == 10.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
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
        java.lang.String str15 = metodoPagamentoBean0.getUsername();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getImmagine();
        prodottoBean8.setPrezzo((float) (-1L));
        int int12 = prodottoBean8.getId();
        ita.kangaroo.model.CartProduct cartProduct13 = new ita.kangaroo.model.CartProduct(prodottoBean8);
        prodottoBean8.setQuantita((int) (short) -1);
        prodottoBean8.setPrezzo((float) 100L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
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
        int int40 = ordineBean39.getId();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        int int2 = orderProductBean0.getId_ordine();
        orderProductBean0.setQuantita((int) 'a');
        int int5 = orderProductBean0.getId_prodotto();
        orderProductBean0.setQuantita((int) (short) 10);
        float float8 = orderProductBean0.getIVA();
        orderProductBean0.setIVA((float) (short) 0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        ordineBean12.setNumero_carta("");
        java.sql.Date date16 = ordineBean12.getData();
        ordineBean12.setPrezzo_totale((float) 'a');
        java.sql.Date date19 = null;
        ordineBean12.setData(date19);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(date16);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
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
        metodoPagamentoBean0.setData_scadenza("3d1583397bcebff274b1e7cb58087c39153af974");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
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
        addressBean0.setId((int) '#');
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
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getDescrizione();
        prodottoBean8.setImmagine("");
        prodottoBean8.setDescrizione("da39a3ee5e6b4b0d3255bfef95601890afd80709");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
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
        ita.kangaroo.model.ProdottoBean prodottoBean32 = new ita.kangaroo.model.ProdottoBean((int) '4', "da39a3ee5e6b4b0d3255bfef95601890afd80709", "", "da39a3ee5e6b4b0d3255bfef95601890afd80709", 32.0f, (-1), (float) '4', tipo31);
        prodottoBean32.setDescrizione("hi!");
        float float35 = prodottoBean32.getPrezzo();
        cart0.changeQuantity(prodottoBean32, (int) (short) 10);
        ita.kangaroo.model.tipo tipo45 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean46 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo45);
        java.lang.String str47 = prodottoBean46.getImmagine();
        prodottoBean46.setPrezzo((float) (-1L));
        int int50 = prodottoBean46.getId();
        float float51 = prodottoBean46.getIva();
        int int52 = prodottoBean46.getId();
        prodottoBean46.setPrezzo((float) (byte) 10);
        float float55 = prodottoBean46.getIva();
        prodottoBean46.setPrezzo((float) 0L);
        cart0.addProduct(prodottoBean46);
        ita.kangaroo.model.tipo tipo66 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean67 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo66);
        java.lang.String str68 = prodottoBean67.getDescrizione();
        java.lang.String str69 = prodottoBean67.getNome();
        int int70 = prodottoBean67.getQuantita();
        prodottoBean67.setDescrizione("hi!");
        ita.kangaroo.model.tipo tipo73 = null;
        prodottoBean67.setTipo(tipo73);
        ita.kangaroo.model.tipo tipo75 = prodottoBean67.getTipo();
        prodottoBean67.setNome("ProdottoBean{id=10, descrizione='hi!', nome='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}");
        cart0.changeQuantity(prodottoBean67, 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 32.0f + "'", float35 == 32.0f);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + float51 + "' != '" + 1.0f + "'", float51 == 1.0f);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertTrue("'" + float55 + "' != '" + 1.0f + "'", float55 == 1.0f);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertNull(tipo75);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getImmagine();
        prodottoBean8.setPrezzo((float) (-1L));
        int int12 = prodottoBean8.getId();
        prodottoBean8.setPrezzo(10.0f);
        prodottoBean8.setPrezzo(0.0f);
        int int17 = prodottoBean8.getQuantita();
        prodottoBean8.setPrezzo((float) (short) 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        ita.kangaroo.model.AddressBean addressBean0 = new ita.kangaroo.model.AddressBean();
        java.lang.String str1 = addressBean0.getVia();
        addressBean0.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        addressBean0.setCitta("hi!");
        addressBean0.setId((int) (byte) 0);
        java.lang.String str8 = addressBean0.getCitta();
        addressBean0.setCitta("hi!");
        addressBean0.setVia("ProdottoBean{id=10, descrizione='hi!', nome='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        float float13 = ordineBean12.getPrezzo_totale();
        java.lang.String str14 = ordineBean12.getNumero_carta();
        ordineBean12.setDestinatario("hi!");
        java.lang.String str17 = ordineBean12.getMetodo_di_spedizione();
        java.lang.String str18 = ordineBean12.toString();
        java.lang.String str19 = ordineBean12.getNumero_di_tracking();
        int int20 = ordineBean12.getId();
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Data non disponibile" + "'", str18, "Data non disponibile");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        ita.kangaroo.model.MetodoPagamentoBean metodoPagamentoBean0 = new ita.kangaroo.model.MetodoPagamentoBean();
        metodoPagamentoBean0.setId((int) 'a');
        ita.kangaroo.model.AddressBean addressBean3 = new ita.kangaroo.model.AddressBean();
        java.lang.String str4 = addressBean3.getVia();
        addressBean3.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        addressBean3.setCitta("hi!");
        boolean boolean9 = metodoPagamentoBean0.equals((java.lang.Object) addressBean3);
        metodoPagamentoBean0.setNumero_carta("Data non disponibile");
        java.lang.String str12 = metodoPagamentoBean0.getNumero_carta();
        java.lang.String str13 = metodoPagamentoBean0.getUsername();
        metodoPagamentoBean0.setId(1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Data non disponibile" + "'", str12, "Data non disponibile");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        ita.kangaroo.model.MetodoPagamentoBean metodoPagamentoBean0 = new ita.kangaroo.model.MetodoPagamentoBean();
        metodoPagamentoBean0.setId((int) 'a');
        ita.kangaroo.model.AddressBean addressBean3 = new ita.kangaroo.model.AddressBean();
        java.lang.String str4 = addressBean3.getVia();
        addressBean3.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        addressBean3.setCitta("hi!");
        boolean boolean9 = metodoPagamentoBean0.equals((java.lang.Object) addressBean3);
        java.lang.Object obj10 = null;
        boolean boolean11 = metodoPagamentoBean0.equals(obj10);
        metodoPagamentoBean0.setId((int) ' ');
        java.lang.String str14 = metodoPagamentoBean0.getData_scadenza();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.toString();
        ita.kangaroo.model.utenteBean utenteBean14 = ordineBean12.getClient();
        java.lang.String str15 = ordineBean12.getNumero_di_tracking();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Data non disponibile" + "'", str13, "Data non disponibile");
        org.junit.Assert.assertNotNull(utenteBean14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        utenteBean11.setEmail("hi!");
        utenteBean11.setPassword("hi!");
        utenteBean11.setProvincia("hi!");
        utenteBean11.setUsername("hi!");
        java.lang.String str20 = utenteBean11.getTelefono();
        java.lang.String str21 = utenteBean11.getUsername();
        java.lang.String str22 = utenteBean11.getCognome();
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        ita.kangaroo.model.AddressBean addressBean0 = new ita.kangaroo.model.AddressBean();
        java.lang.String str1 = addressBean0.getVia();
        java.lang.String str2 = addressBean0.getUsername();
        addressBean0.setUsername("hi!");
        addressBean0.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        boolean boolean8 = addressBean0.equals((java.lang.Object) 10L);
        int int9 = addressBean0.getId();
        java.lang.String str10 = addressBean0.getCAP();
        java.lang.String str11 = addressBean0.getCitta();
        java.lang.String str12 = addressBean0.getCitta();
        java.lang.String str13 = addressBean0.getCitta();
        java.lang.String str14 = addressBean0.getUsername();
        java.lang.String str15 = addressBean0.getCAP();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
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
        metodoPagamentoBean0.setData_scadenza("da39a3ee5e6b4b0d3255bfef95601890afd80709");
        metodoPagamentoBean0.setId((-1));
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
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        ita.kangaroo.model.tipo tipo6 = null;
        ita.kangaroo.model.utenteBean utenteBean12 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo6, "hi!", "", "", "hi!", "");
        utenteBean12.setEmail("hi!");
        java.lang.String str15 = utenteBean12.getCognome();
        utenteBean12.setCitta("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        utenteBean12.setUsername("Data non disponibile");
        java.sql.Date date27 = null;
        ita.kangaroo.model.OrdineBean ordineBean29 = new ita.kangaroo.model.OrdineBean(0, utenteBean12, (float) (byte) 0, "", "", "Data non disponibile", "Data non disponibile", "hi!", "", date27, "Data non disponibile");
        java.util.ArrayList<ita.kangaroo.model.OrderProductBean> orderProductBeanList30 = ordineBean29.getProducts();
        ita.kangaroo.model.OrdineBean ordineBean31 = new ita.kangaroo.model.OrdineBean(orderProductBeanList30);
        ita.kangaroo.model.OrdineBean ordineBean32 = new ita.kangaroo.model.OrdineBean(orderProductBeanList30);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(orderProductBeanList30);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
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
        ita.kangaroo.model.CartProduct cartProduct79 = new ita.kangaroo.model.CartProduct(prodottoBean70, 35);
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
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        ita.kangaroo.model.AddressBean addressBean0 = new ita.kangaroo.model.AddressBean();
        java.lang.String str1 = addressBean0.getVia();
        addressBean0.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        addressBean0.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        java.lang.String str6 = addressBean0.getCitta();
        int int7 = addressBean0.getId();
        addressBean0.setCitta("3d1583397bcebff274b1e7cb58087c39153af974");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
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
        java.lang.String str14 = metodoPagamentoBean0.getNumero_carta();
        int int15 = metodoPagamentoBean0.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
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
        java.lang.String str84 = ordineBean81.getNumero_di_tracking();
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
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) -1, "Data non disponibile", "Data non disponibile", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", (float) ' ', (int) ' ', (float) ' ', tipo7);
        ita.kangaroo.model.CartProduct cartProduct9 = new ita.kangaroo.model.CartProduct(prodottoBean8);
        ita.kangaroo.model.CartProduct cartProduct10 = new ita.kangaroo.model.CartProduct(prodottoBean8);
        ita.kangaroo.model.CartProduct cartProduct12 = new ita.kangaroo.model.CartProduct(prodottoBean8, (int) (byte) -1);
        ita.kangaroo.model.tipo tipo13 = prodottoBean8.getTipo();
        org.junit.Assert.assertNull(tipo13);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
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
        ordineBean12.setMetodo_di_spedizione("ProdottoBean{id=10, descrizione='hi!', nome='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}");
        ordineBean12.setMetodo_di_spedizione("ProdottoBean{id=-1, descrizione='Data non disponibile', nome='Data non disponibile', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=32.0, quantita=32, iva=32.0, tipo=null}");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(date22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "da39a3ee5e6b4b0d3255bfef95601890afd80709" + "'", str24, "da39a3ee5e6b4b0d3255bfef95601890afd80709");
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        ita.kangaroo.model.MetodoPagamentoBean metodoPagamentoBean0 = new ita.kangaroo.model.MetodoPagamentoBean();
        metodoPagamentoBean0.setId((int) 'a');
        ita.kangaroo.model.AddressBean addressBean3 = new ita.kangaroo.model.AddressBean();
        java.lang.String str4 = addressBean3.getVia();
        addressBean3.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        addressBean3.setCitta("hi!");
        boolean boolean9 = metodoPagamentoBean0.equals((java.lang.Object) addressBean3);
        java.lang.String str10 = metodoPagamentoBean0.getNumero_carta();
        java.lang.String str11 = metodoPagamentoBean0.getNumero_carta();
        java.lang.String str12 = metodoPagamentoBean0.getCvv();
        metodoPagamentoBean0.setUsername("hi!");
        java.lang.String str15 = metodoPagamentoBean0.getCvv();
        java.lang.String str16 = metodoPagamentoBean0.getUsername();
        java.lang.String str17 = metodoPagamentoBean0.getUsername();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
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
        java.lang.String str49 = metodoPagamentoBean0.getCvv();
        java.lang.String str50 = metodoPagamentoBean0.getCircuito();
        metodoPagamentoBean0.setCvv("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='hi!', prezzo=-1.0, quantita=1, iva=1.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(orderProductBeanList44);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNull(str50);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
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
        ita.kangaroo.model.Cart cart19 = new ita.kangaroo.model.Cart();
        ita.kangaroo.model.tipo tipo27 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean28 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo27);
        int int29 = prodottoBean28.getId();
        java.lang.String str30 = prodottoBean28.getImmagine();
        cart19.removeProduct(prodottoBean28);
        ita.kangaroo.model.tipo tipo39 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean40 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo39);
        java.lang.String str41 = prodottoBean40.getDescrizione();
        java.lang.String str42 = prodottoBean40.getNome();
        ita.kangaroo.model.tipo tipo43 = prodottoBean40.getTipo();
        cart19.removeProduct(prodottoBean40);
        ita.kangaroo.model.tipo tipo52 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean53 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo52);
        java.lang.String str54 = prodottoBean53.getDescrizione();
        java.lang.String str55 = prodottoBean53.getNome();
        ita.kangaroo.model.tipo tipo56 = prodottoBean53.getTipo();
        cart19.changeQuantity(prodottoBean53, (int) (byte) 0);
        ita.kangaroo.model.ProdottoBean prodottoBean59 = null;
        cart19.changeQuantity(prodottoBean59, 32);
        boolean boolean62 = metodoPagamentoBean0.equals((java.lang.Object) cart19);
        ita.kangaroo.model.tipo tipo70 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean71 = new ita.kangaroo.model.ProdottoBean((int) (short) 0, "da39a3ee5e6b4b0d3255bfef95601890afd80709", "da39a3ee5e6b4b0d3255bfef95601890afd80709", "", (float) '4', 100, (float) 'a', tipo70);
        cart19.changeQuantity(prodottoBean71, 100);
        ita.kangaroo.model.tipo tipo81 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean82 = new ita.kangaroo.model.ProdottoBean((int) (byte) -1, "Data non disponibile", "Data non disponibile", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", (float) ' ', (int) ' ', (float) ' ', tipo81);
        java.lang.String str83 = prodottoBean82.getImmagine();
        int int84 = prodottoBean82.getQuantita();
        ita.kangaroo.model.CartProduct cartProduct85 = new ita.kangaroo.model.CartProduct(prodottoBean82);
        cart19.removeProduct(prodottoBean82);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertNull(tipo43);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertNull(tipo56);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}" + "'", str83, "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 32 + "'", int84 == 32);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) 'a', "ProdottoBean{id=1, descrizione='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', nome='hi!', immagine='hi!', prezzo=0.0, quantita=-1, iva=1.0, tipo=null}", "da39a3ee5e6b4b0d3255bfef95601890afd80709", "", (float) 100, 0, (float) (short) 0, tipo7);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getDescrizione();
        prodottoBean8.setImmagine("");
        int int12 = prodottoBean8.getQuantita();
        prodottoBean8.setPrezzo((float) (short) 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
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
        metodoPagamentoBean0.setData_scadenza("ProdottoBean{id=1, descrizione='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', nome='hi!', immagine='hi!', prezzo=0.0, quantita=-1, iva=1.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        ita.kangaroo.model.tipo tipo6 = null;
        ita.kangaroo.model.utenteBean utenteBean12 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo6, "", "", "hi!", "hi!", "hi!");
        java.lang.String str13 = utenteBean12.getUsername();
        utenteBean12.setPassword("");
        java.sql.Date date23 = null;
        ita.kangaroo.model.OrdineBean ordineBean25 = new ita.kangaroo.model.OrdineBean((int) (byte) 100, utenteBean12, 100.0f, "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "hi!", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "", "Data non disponibile", date23, "hi!");
        java.lang.String str26 = utenteBean12.getProvincia();
        java.lang.String str27 = utenteBean12.getNome();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        java.lang.String str12 = utenteBean11.getProvincia();
        java.lang.String str13 = utenteBean11.getCognome();
        java.lang.String str14 = utenteBean11.getVia();
        java.lang.String str15 = utenteBean11.getUsername();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        ita.kangaroo.model.MetodoPagamentoBean metodoPagamentoBean0 = new ita.kangaroo.model.MetodoPagamentoBean();
        metodoPagamentoBean0.setId((int) 'a');
        metodoPagamentoBean0.setCircuito("");
        metodoPagamentoBean0.setData_scadenza("hi!");
        java.lang.String str7 = metodoPagamentoBean0.getUsername();
        java.lang.String str8 = metodoPagamentoBean0.getCvv();
        java.lang.String str9 = metodoPagamentoBean0.getCvv();
        metodoPagamentoBean0.setUsername("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='hi!', prezzo=-1.0, quantita=32, iva=1.0, tipo=null}");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        java.lang.String str12 = utenteBean11.getUsername();
        java.lang.String str13 = utenteBean11.getCap();
        utenteBean11.setUsername("");
        ita.kangaroo.model.OrdineBean ordineBean16 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str17 = utenteBean11.getPassword();
        utenteBean11.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        ita.kangaroo.model.tipo tipo20 = null;
        utenteBean11.setTipo(tipo20);
        utenteBean11.setUsername("3a987acf8cbc1028b7dbc86bd086831151899a2b");
        java.lang.String str24 = utenteBean11.getNome();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        java.lang.String str12 = utenteBean11.getUsername();
        java.lang.String str13 = utenteBean11.getCap();
        utenteBean11.setUsername("");
        ita.kangaroo.model.OrdineBean ordineBean16 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str17 = utenteBean11.getPassword();
        ita.kangaroo.model.OrdineBean ordineBean18 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str19 = utenteBean11.getVia();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        ita.kangaroo.model.MetodoPagamentoBean metodoPagamentoBean0 = new ita.kangaroo.model.MetodoPagamentoBean();
        metodoPagamentoBean0.setId((int) 'a');
        metodoPagamentoBean0.setCircuito("");
        metodoPagamentoBean0.setData_scadenza("hi!");
        metodoPagamentoBean0.setId((int) '4');
        metodoPagamentoBean0.setId((-1));
        metodoPagamentoBean0.setUsername("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='hi!', prezzo=-1.0, quantita=32, iva=1.0, tipo=null}");
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        ita.kangaroo.model.AddressBean addressBean5 = new ita.kangaroo.model.AddressBean(32, "hi!", "Data non disponibile", "hi!", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        java.lang.String str6 = addressBean5.getCitta();
        addressBean5.setCitta("ProdottoBean{id=32, descrizione='Data non disponibile', nome='Data non disponibile', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=32.0, quantita=32, iva=10.0, tipo=null}");
        int int9 = addressBean5.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Data non disponibile" + "'", str6, "Data non disponibile");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
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
        ita.kangaroo.model.utenteBean utenteBean33 = ordineBean12.getClient();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(utenteBean33);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        ita.kangaroo.model.AddressBean addressBean0 = new ita.kangaroo.model.AddressBean();
        java.lang.String str1 = addressBean0.getVia();
        java.lang.String str2 = addressBean0.getUsername();
        addressBean0.setUsername("hi!");
        addressBean0.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        boolean boolean8 = addressBean0.equals((java.lang.Object) 10L);
        int int9 = addressBean0.getId();
        addressBean0.setCitta("hi!");
        java.lang.String str12 = addressBean0.getCAP();
        int int13 = addressBean0.getId();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        ordineBean12.setNumero_carta("");
        java.lang.String str16 = ordineBean12.getIndirizzo_di_spedizione();
        ordineBean12.setPrezzo_totale(1.0f);
        java.lang.String str19 = ordineBean12.getMetodo_di_spedizione();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        int int2 = orderProductBean0.getId_ordine();
        orderProductBean0.setQuantita((int) 'a');
        orderProductBean0.setIVA((float) 32);
        orderProductBean0.setId_prodotto(10);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        ordineBean12.setId((int) (byte) -1);
        java.lang.String str16 = ordineBean12.getNumero_di_tracking();
        ita.kangaroo.model.utenteBean utenteBean17 = ordineBean12.getClient();
        utenteBean17.setTelefono("ProdottoBean{id=10, descrizione='hi!', nome='', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(utenteBean17);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        ita.kangaroo.model.AddressBean addressBean0 = new ita.kangaroo.model.AddressBean();
        java.lang.String str1 = addressBean0.getVia();
        java.lang.String str2 = addressBean0.getUsername();
        java.lang.String str3 = addressBean0.getCAP();
        java.lang.String str4 = addressBean0.getUsername();
        addressBean0.setId(10);
        addressBean0.setId((int) (byte) 0);
        addressBean0.setCitta("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) ' ', "", "Data non disponibile", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", (float) 1L, (int) 'a', (float) 32, tipo7);
        ita.kangaroo.model.CartProduct cartProduct10 = new ita.kangaroo.model.CartProduct(prodottoBean8, (int) (short) -1);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        ordineBean12.setNumero_carta("");
        java.sql.Date date16 = ordineBean12.getData();
        ordineBean12.setMetodo_di_pagamento("");
        ordineBean12.setNumero_di_tracking("");
        ordineBean12.setPrezzo_totale((float) 100L);
        java.lang.String str23 = ordineBean12.getMetodo_di_pagamento();
        ordineBean12.setNumero_di_tracking("ProdottoBean{id=0, descrizione='', nome='', immagine='', prezzo=0.0, quantita=0, iva=0.0, tipo=null}");
        java.lang.String str26 = ordineBean12.getDestinatario();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
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
        java.lang.String str15 = metodoPagamentoBean0.getCircuito();
        int int16 = metodoPagamentoBean0.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        ita.kangaroo.model.AddressBean addressBean0 = new ita.kangaroo.model.AddressBean();
        addressBean0.setId((int) ' ');
        addressBean0.setVia("");
        ita.kangaroo.model.tipo tipo11 = null;
        ita.kangaroo.model.utenteBean utenteBean17 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo11, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean18 = new ita.kangaroo.model.OrdineBean(utenteBean17);
        utenteBean17.setPassword("hi!");
        utenteBean17.setNome("hi!");
        java.sql.Date date30 = null;
        ita.kangaroo.model.OrdineBean ordineBean32 = new ita.kangaroo.model.OrdineBean((int) (byte) 100, utenteBean17, (float) (-1L), "hi!", "", "", "hi!", "Data non disponibile", "hi!", date30, "");
        ordineBean32.setIndirizzo_di_spedizione("Data non disponibile");
        java.lang.String str35 = ordineBean32.getDestinatario();
        java.lang.String str36 = ordineBean32.getDestinatario();
        ita.kangaroo.model.tipo tipo42 = null;
        ita.kangaroo.model.utenteBean utenteBean48 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo42, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean49 = new ita.kangaroo.model.OrdineBean(utenteBean48);
        java.lang.String str50 = ordineBean49.getMetodo_di_spedizione();
        java.util.ArrayList<ita.kangaroo.model.OrderProductBean> orderProductBeanList51 = ordineBean49.getProducts();
        ordineBean32.setProducts(orderProductBeanList51);
        boolean boolean53 = addressBean0.equals((java.lang.Object) ordineBean32);
        java.lang.String str54 = ordineBean32.getIndirizzo_di_spedizione();
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNotNull(orderProductBeanList51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Data non disponibile" + "'", str54, "Data non disponibile");
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
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
        int int25 = ordineBean12.getId();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        int int2 = orderProductBean0.getId_ordine();
        orderProductBean0.setQuantita((int) 'a');
        int int5 = orderProductBean0.getId_ordine();
        int int6 = orderProductBean0.getId_ordine();
        orderProductBean0.setId_prodotto(10);
        int int9 = orderProductBean0.getId_ordine();
        int int10 = orderProductBean0.getId_prodotto();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        ita.kangaroo.model.tipo tipo6 = null;
        ita.kangaroo.model.utenteBean utenteBean12 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo6, "hi!", "", "", "hi!", "");
        utenteBean12.setEmail("hi!");
        utenteBean12.setPassword("hi!");
        utenteBean12.setProvincia("hi!");
        utenteBean12.setUsername("hi!");
        utenteBean12.setCognome("hi!");
        java.sql.Date date30 = null;
        ita.kangaroo.model.OrdineBean ordineBean32 = new ita.kangaroo.model.OrdineBean((int) (byte) 10, utenteBean12, (float) (short) 100, "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "hi!", "", "", "hi!", "", date30, "");
        java.lang.String str33 = utenteBean12.getEmail();
        utenteBean12.setCap("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        ita.kangaroo.model.AddressBean addressBean0 = new ita.kangaroo.model.AddressBean();
        addressBean0.setVia("hi!");
        addressBean0.setUsername("");
        addressBean0.setId((int) '4');
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        boolean boolean1 = ita.kangaroo.model.AddressBean.isValidCAP("ProdottoBean{id=52, descrizione='hi!', nome='', immagine='da39a3ee5e6b4b0d3255bfef95601890afd80709', prezzo=32.0, quantita=-1, iva=52.0, tipo=null}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        ita.kangaroo.model.tipo tipo6 = null;
        ita.kangaroo.model.utenteBean utenteBean12 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo6, "hi!", "", "", "hi!", "");
        java.lang.String str13 = utenteBean12.getUsername();
        java.lang.String str14 = utenteBean12.getCap();
        utenteBean12.setUsername("");
        ita.kangaroo.model.OrdineBean ordineBean17 = new ita.kangaroo.model.OrdineBean(utenteBean12);
        java.sql.Date date25 = null;
        ita.kangaroo.model.OrdineBean ordineBean27 = new ita.kangaroo.model.OrdineBean((int) (short) 1, utenteBean12, (float) (byte) -1, "hi!", "hi!", "Data non disponibile", "", "Data non disponibile", "Data non disponibile", date25, "");
        java.lang.String str28 = ordineBean27.getDestinatario();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getDescrizione();
        prodottoBean8.setImmagine("");
        prodottoBean8.setIva(1.0f);
        prodottoBean8.setImmagine("");
        java.lang.String str16 = prodottoBean8.getNome();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        ita.kangaroo.model.AddressBean addressBean0 = new ita.kangaroo.model.AddressBean();
        java.lang.String str1 = addressBean0.getVia();
        java.lang.String str2 = addressBean0.getUsername();
        addressBean0.setUsername("hi!");
        addressBean0.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        boolean boolean8 = addressBean0.equals((java.lang.Object) 10L);
        int int9 = addressBean0.getId();
        addressBean0.setCitta("hi!");
        java.lang.String str12 = addressBean0.getCAP();
        java.lang.String str13 = addressBean0.getCAP();
        addressBean0.setCAP("3d1583397bcebff274b1e7cb58087c39153af974");
        addressBean0.setUsername("3a987acf8cbc1028b7dbc86bd086831151899a2b");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        float float2 = orderProductBean0.getIVA();
        orderProductBean0.setPrezzo(10.0f);
        orderProductBean0.setId_ordine((int) (short) 0);
        orderProductBean0.setIVA((-1.0f));
        int int9 = orderProductBean0.getId_prodotto();
        orderProductBean0.setQuantita((int) (short) 0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        ita.kangaroo.model.AddressBean addressBean0 = new ita.kangaroo.model.AddressBean();
        java.lang.String str1 = addressBean0.getVia();
        addressBean0.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        java.lang.String str4 = addressBean0.getCAP();
        addressBean0.setId((int) (short) -1);
        addressBean0.setCitta("ProdottoBean{id=-1, descrizione='Data non disponibile', nome='Data non disponibile', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=32.0, quantita=32, iva=32.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        utenteBean11.setEmail("hi!");
        utenteBean11.setPassword("hi!");
        utenteBean11.setProvincia("hi!");
        utenteBean11.setUsername("hi!");
        java.lang.String str20 = utenteBean11.getTelefono();
        utenteBean11.setCitta("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        utenteBean11.setCognome("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        utenteBean11.setNome("3a987acf8cbc1028b7dbc86bd086831151899a2b");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        ita.kangaroo.model.MetodoPagamentoBean metodoPagamentoBean0 = new ita.kangaroo.model.MetodoPagamentoBean();
        metodoPagamentoBean0.setId((int) 'a');
        ita.kangaroo.model.AddressBean addressBean3 = new ita.kangaroo.model.AddressBean();
        java.lang.String str4 = addressBean3.getVia();
        addressBean3.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        addressBean3.setCitta("hi!");
        boolean boolean9 = metodoPagamentoBean0.equals((java.lang.Object) addressBean3);
        java.lang.Object obj10 = null;
        boolean boolean11 = metodoPagamentoBean0.equals(obj10);
        metodoPagamentoBean0.setData_scadenza("hi!");
        metodoPagamentoBean0.setCvv("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        metodoPagamentoBean0.setNumero_carta("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='hi!', prezzo=-1.0, quantita=1, iva=1.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
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
        ordineBean12.setNumero_carta("ProdottoBean{id=10, descrizione='hi!', nome='', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}");
        ordineBean12.setPrezzo_totale((float) (-1));
        ordineBean12.setCircuito("ProdottoBean{id=10, descrizione='hi!', nome='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Data non disponibile" + "'", str21, "Data non disponibile");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertNotNull(orderProductBeanList68);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        utenteBean11.setEmail("hi!");
        ita.kangaroo.model.OrdineBean ordineBean14 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str15 = utenteBean11.getUsername();
        utenteBean11.setCognome("ProdottoBean{id=10, descrizione='hi!', nome='', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        ita.kangaroo.model.MetodoPagamentoBean metodoPagamentoBean0 = new ita.kangaroo.model.MetodoPagamentoBean();
        metodoPagamentoBean0.setId((int) 'a');
        ita.kangaroo.model.AddressBean addressBean3 = new ita.kangaroo.model.AddressBean();
        java.lang.String str4 = addressBean3.getVia();
        addressBean3.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        addressBean3.setCitta("hi!");
        boolean boolean9 = metodoPagamentoBean0.equals((java.lang.Object) addressBean3);
        java.lang.String str10 = metodoPagamentoBean0.getNumero_carta();
        metodoPagamentoBean0.setId((int) (byte) 0);
        java.lang.String str13 = metodoPagamentoBean0.getCircuito();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getDescrizione();
        ita.kangaroo.model.tipo tipo10 = null;
        prodottoBean8.setTipo(tipo10);
        prodottoBean8.setNome("da39a3ee5e6b4b0d3255bfef95601890afd80709");
        int int14 = prodottoBean8.getQuantita();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
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
        metodoPagamentoBean0.setUsername("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='hi!', prezzo=-1.0, quantita=-1, iva=1.0, tipo=null}");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
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
        metodoPagamentoBean0.setId((int) '#');
        metodoPagamentoBean0.setCvv("3a987acf8cbc1028b7dbc86bd086831151899a2b");
        java.lang.String str39 = metodoPagamentoBean0.getCircuito();
        java.lang.String str40 = metodoPagamentoBean0.getUsername();
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
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(str40);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        int int2 = orderProductBean0.getId_ordine();
        int int3 = orderProductBean0.getQuantita();
        int int4 = orderProductBean0.getId_ordine();
        orderProductBean0.setPrezzo(0.0f);
        orderProductBean0.setIVA((-1.0f));
        orderProductBean0.setQuantita((int) (byte) 0);
        orderProductBean0.setIVA((float) (-1L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
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
        java.lang.String str87 = utenteBean78.getVia();
        utenteBean78.setVia("ProdottoBean{id=10, descrizione='hi!', nome='', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}");
        utenteBean78.setCognome("ProdottoBean{id=10, descrizione='hi!', nome='', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}");
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
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "hi!" + "'", str87, "hi!");
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        ita.kangaroo.model.ProdottoBean prodottoBean0 = null;
        ita.kangaroo.model.CartProduct cartProduct2 = new ita.kangaroo.model.CartProduct(prodottoBean0, (int) (byte) 10);
        int int3 = cartProduct2.getQuantity();
        int int4 = cartProduct2.getQuantity();
        int int5 = cartProduct2.getQuantity();
        cartProduct2.setQuantity((int) (byte) -1);
        cartProduct2.setQuantity((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
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
        java.lang.String str27 = ordineBean12.toString();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Data non disponibile" + "'", str27, "Data non disponibile");
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "", "", "hi!", "hi!", "hi!");
        java.lang.String str12 = utenteBean11.getUsername();
        utenteBean11.setCap("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        utenteBean11.setCitta("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        java.lang.String str17 = utenteBean11.getCap();
        java.lang.String str18 = utenteBean11.getCap();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}" + "'", str17, "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}" + "'", str18, "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        float float2 = orderProductBean0.getIVA();
        int int3 = orderProductBean0.getId_prodotto();
        float float4 = orderProductBean0.getPrezzo();
        float float5 = orderProductBean0.getPrezzo();
        int int6 = orderProductBean0.getId_ordine();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
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
        java.lang.String str38 = utenteBean12.getCognome();
        java.lang.String str39 = utenteBean12.getVia();
        org.junit.Assert.assertNull(tipo33);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
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
        metodoPagamentoBean0.setCircuito("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        java.lang.String str49 = metodoPagamentoBean0.getUsername();
        java.lang.String str50 = metodoPagamentoBean0.getData_scadenza();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(orderProductBeanList44);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNull(str50);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        ita.kangaroo.model.MetodoPagamentoBean metodoPagamentoBean0 = new ita.kangaroo.model.MetodoPagamentoBean();
        metodoPagamentoBean0.setId((int) 'a');
        ita.kangaroo.model.AddressBean addressBean3 = new ita.kangaroo.model.AddressBean();
        java.lang.String str4 = addressBean3.getVia();
        addressBean3.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        addressBean3.setCitta("hi!");
        boolean boolean9 = metodoPagamentoBean0.equals((java.lang.Object) addressBean3);
        java.lang.String str10 = metodoPagamentoBean0.getNumero_carta();
        java.lang.String str11 = metodoPagamentoBean0.getNumero_carta();
        java.lang.String str12 = metodoPagamentoBean0.getCvv();
        metodoPagamentoBean0.setUsername("hi!");
        java.lang.String str15 = metodoPagamentoBean0.getCvv();
        java.lang.String str16 = metodoPagamentoBean0.getUsername();
        metodoPagamentoBean0.setCircuito("ProdottoBean{id=1, descrizione='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', nome='hi!', immagine='hi!', prezzo=0.0, quantita=-1, iva=1.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
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
        metodoPagamentoBean0.setId((int) 'a');
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
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
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
        ita.kangaroo.model.utenteBean utenteBean57 = ordineBean12.getClient();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(utenteBean54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(utenteBean57);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        utenteBean11.setEmail("hi!");
        utenteBean11.setPassword("hi!");
        utenteBean11.setProvincia("hi!");
        java.lang.String str18 = utenteBean11.getUsername();
        java.lang.String str19 = utenteBean11.getVia();
        java.lang.String str20 = utenteBean11.getPassword();
        java.lang.String str21 = utenteBean11.getVia();
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "3a987acf8cbc1028b7dbc86bd086831151899a2b" + "'", str20, "3a987acf8cbc1028b7dbc86bd086831151899a2b");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        ita.kangaroo.model.AddressBean addressBean0 = new ita.kangaroo.model.AddressBean();
        java.lang.String str1 = addressBean0.getVia();
        java.lang.String str2 = addressBean0.getUsername();
        addressBean0.setUsername("hi!");
        addressBean0.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        addressBean0.setCitta("hi!");
        int int9 = addressBean0.getId();
        addressBean0.setId((int) (byte) -1);
        java.lang.String str12 = addressBean0.getUsername();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
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
        java.util.ArrayList<ita.kangaroo.model.OrderProductBean> orderProductBeanList57 = null;
        ordineBean12.setProducts(orderProductBeanList57);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(utenteBean54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        float float2 = orderProductBean0.getIVA();
        orderProductBean0.setPrezzo(10.0f);
        orderProductBean0.setQuantita((int) (short) -1);
        int int7 = orderProductBean0.getQuantita();
        orderProductBean0.setId_ordine((int) 'a');
        int int10 = orderProductBean0.getId_ordine();
        int int11 = orderProductBean0.getId_prodotto();
        orderProductBean0.setId_prodotto(32);
        int int14 = orderProductBean0.getQuantita();
        int int15 = orderProductBean0.getQuantita();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        ita.kangaroo.model.tipo tipo6 = null;
        ita.kangaroo.model.utenteBean utenteBean12 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo6, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean13 = new ita.kangaroo.model.OrdineBean(utenteBean12);
        utenteBean12.setPassword("hi!");
        utenteBean12.setNome("hi!");
        java.sql.Date date25 = null;
        ita.kangaroo.model.OrdineBean ordineBean27 = new ita.kangaroo.model.OrdineBean((int) (byte) 100, utenteBean12, (float) (-1L), "hi!", "", "", "hi!", "Data non disponibile", "hi!", date25, "");
        ita.kangaroo.model.tipo tipo28 = utenteBean12.getTipo();
        java.lang.String str29 = utenteBean12.getPassword();
        java.lang.String str30 = utenteBean12.getNome();
        org.junit.Assert.assertNull(tipo28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "3a987acf8cbc1028b7dbc86bd086831151899a2b" + "'", str29, "3a987acf8cbc1028b7dbc86bd086831151899a2b");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getImmagine();
        int int10 = prodottoBean8.getQuantita();
        java.lang.String str11 = prodottoBean8.getImmagine();
        java.lang.String str12 = prodottoBean8.getDescrizione();
        prodottoBean8.setQuantita(1);
        prodottoBean8.setQuantita((int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
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
        ordineBean81.setPrezzo_totale((float) 0L);
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
        org.junit.Assert.assertNull(date82);
        org.junit.Assert.assertNull(date83);
        org.junit.Assert.assertNull(str86);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        ita.kangaroo.model.tipo tipo6 = null;
        ita.kangaroo.model.utenteBean utenteBean12 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo6, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean13 = new ita.kangaroo.model.OrdineBean(utenteBean12);
        utenteBean12.setPassword("hi!");
        utenteBean12.setNome("hi!");
        java.sql.Date date25 = null;
        ita.kangaroo.model.OrdineBean ordineBean27 = new ita.kangaroo.model.OrdineBean((int) (byte) 100, utenteBean12, (float) (-1L), "hi!", "", "", "hi!", "Data non disponibile", "hi!", date25, "");
        java.lang.String str28 = ordineBean27.getNumero_di_tracking();
        java.sql.Date date29 = null;
        ordineBean27.setData(date29);
        ordineBean27.setMetodo_di_pagamento("da39a3ee5e6b4b0d3255bfef95601890afd80709");
        float float33 = ordineBean27.getPrezzo_totale();
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + (-1.0f) + "'", float33 == (-1.0f));
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        ita.kangaroo.model.AddressBean addressBean5 = new ita.kangaroo.model.AddressBean(1, "", "Data non disponibile", "", "");
        ita.kangaroo.model.tipo tipo12 = null;
        ita.kangaroo.model.utenteBean utenteBean18 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo12, "hi!", "", "", "hi!", "");
        utenteBean18.setEmail("hi!");
        utenteBean18.setPassword("hi!");
        utenteBean18.setProvincia("hi!");
        utenteBean18.setUsername("hi!");
        java.lang.String str27 = utenteBean18.getTelefono();
        java.lang.String str28 = utenteBean18.getNome();
        java.lang.String str29 = utenteBean18.getEmail();
        java.sql.Date date37 = null;
        ita.kangaroo.model.OrdineBean ordineBean39 = new ita.kangaroo.model.OrdineBean((int) '4', utenteBean18, (float) 0L, "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='hi!', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "3d1583397bcebff274b1e7cb58087c39153af974", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='hi!', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "ProdottoBean{id=32, descrizione='Data non disponibile', nome='Data non disponibile', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=32.0, quantita=32, iva=10.0, tipo=null}", "", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", date37, "ProdottoBean{id=32, descrizione='Data non disponibile', nome='Data non disponibile', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=32.0, quantita=32, iva=10.0, tipo=null}");
        boolean boolean40 = addressBean5.equals((java.lang.Object) "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        ita.kangaroo.model.AddressBean addressBean0 = new ita.kangaroo.model.AddressBean();
        addressBean0.setId((int) ' ');
        addressBean0.setVia("");
        ita.kangaroo.model.tipo tipo11 = null;
        ita.kangaroo.model.utenteBean utenteBean17 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo11, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean18 = new ita.kangaroo.model.OrdineBean(utenteBean17);
        utenteBean17.setPassword("hi!");
        utenteBean17.setNome("hi!");
        java.sql.Date date30 = null;
        ita.kangaroo.model.OrdineBean ordineBean32 = new ita.kangaroo.model.OrdineBean((int) (byte) 100, utenteBean17, (float) (-1L), "hi!", "", "", "hi!", "Data non disponibile", "hi!", date30, "");
        ordineBean32.setIndirizzo_di_spedizione("Data non disponibile");
        java.lang.String str35 = ordineBean32.getDestinatario();
        java.lang.String str36 = ordineBean32.getDestinatario();
        ita.kangaroo.model.tipo tipo42 = null;
        ita.kangaroo.model.utenteBean utenteBean48 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo42, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean49 = new ita.kangaroo.model.OrdineBean(utenteBean48);
        java.lang.String str50 = ordineBean49.getMetodo_di_spedizione();
        java.util.ArrayList<ita.kangaroo.model.OrderProductBean> orderProductBeanList51 = ordineBean49.getProducts();
        ordineBean32.setProducts(orderProductBeanList51);
        boolean boolean53 = addressBean0.equals((java.lang.Object) ordineBean32);
        int int54 = addressBean0.getId();
        addressBean0.setCitta("Data non disponibile");
        java.lang.String str57 = addressBean0.getCAP();
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNotNull(orderProductBeanList51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 32 + "'", int54 == 32);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        ita.kangaroo.model.AddressBean addressBean0 = new ita.kangaroo.model.AddressBean();
        java.lang.String str1 = addressBean0.getVia();
        java.lang.String str2 = addressBean0.getUsername();
        addressBean0.setUsername("hi!");
        addressBean0.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        boolean boolean8 = addressBean0.equals((java.lang.Object) 10L);
        addressBean0.setUsername("hi!");
        addressBean0.setId((int) ' ');
        addressBean0.setCAP("");
        java.lang.String str15 = addressBean0.getCAP();
        addressBean0.setCitta("ProdottoBean{id=32, descrizione='Data non disponibile', nome='Data non disponibile', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=32.0, quantita=32, iva=10.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "", "", "hi!", "hi!", "hi!");
        java.lang.String str12 = utenteBean11.getUsername();
        utenteBean11.setCap("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        ita.kangaroo.model.OrdineBean ordineBean15 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        utenteBean11.setPassword("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        utenteBean11.setCitta("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='hi!', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        utenteBean11.setNome("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        ita.kangaroo.model.ProdottoBean prodottoBean0 = new ita.kangaroo.model.ProdottoBean();
        prodottoBean0.setDescrizione("hi!");
        prodottoBean0.setId((int) (short) 100);
        float float5 = prodottoBean0.getIva();
        ita.kangaroo.model.tipo tipo6 = null;
        prodottoBean0.setTipo(tipo6);
        prodottoBean0.setImmagine("Data non disponibile");
        java.lang.String str10 = prodottoBean0.getNome();
        int int11 = prodottoBean0.getId();
        ita.kangaroo.model.tipo tipo12 = prodottoBean0.getTipo();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNull(tipo12);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) -1, "Data non disponibile", "Data non disponibile", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", (float) ' ', (int) ' ', (float) ' ', tipo7);
        java.lang.String str9 = prodottoBean8.getImmagine();
        int int10 = prodottoBean8.getQuantita();
        float float11 = prodottoBean8.getPrezzo();
        float float12 = prodottoBean8.getIva();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}" + "'", str9, "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 32.0f + "'", float11 == 32.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 32.0f + "'", float12 == 32.0f);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
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
        utenteBean28.setVia("hi!");
        utenteBean28.setUsername("hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(orderProductBeanList14);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        utenteBean11.setEmail("hi!");
        utenteBean11.setPassword("hi!");
        utenteBean11.setProvincia("hi!");
        utenteBean11.setUsername("hi!");
        utenteBean11.setCognome("hi!");
        ita.kangaroo.model.tipo tipo22 = utenteBean11.getTipo();
        utenteBean11.setEmail("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        java.lang.String str25 = utenteBean11.getTelefono();
        utenteBean11.setUsername("");
        org.junit.Assert.assertNull(tipo22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        float float13 = ordineBean12.getPrezzo_totale();
        java.lang.String str14 = ordineBean12.getMetodo_di_pagamento();
        ita.kangaroo.model.utenteBean utenteBean15 = ordineBean12.getClient();
        utenteBean15.setVia("3a987acf8cbc1028b7dbc86bd086831151899a2b");
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(utenteBean15);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        ita.kangaroo.model.tipo tipo6 = null;
        ita.kangaroo.model.utenteBean utenteBean12 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo6, "hi!", "", "", "hi!", "");
        java.lang.String str13 = utenteBean12.getVia();
        java.lang.String str14 = utenteBean12.getProvincia();
        java.sql.Date date22 = null;
        ita.kangaroo.model.OrdineBean ordineBean24 = new ita.kangaroo.model.OrdineBean((int) (byte) 10, utenteBean12, (float) ' ', "ProdottoBean{id=10, descrizione='hi!', nome='', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}", "3a987acf8cbc1028b7dbc86bd086831151899a2b", "hi!", "da39a3ee5e6b4b0d3255bfef95601890afd80709", "ProdottoBean{id=10, descrizione='hi!', nome='', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}", "", date22, "3a987acf8cbc1028b7dbc86bd086831151899a2b");
        java.lang.String str25 = utenteBean12.getPassword();
        utenteBean12.setUsername("ProdottoBean{id=52, descrizione='hi!', nome='', immagine='da39a3ee5e6b4b0d3255bfef95601890afd80709', prezzo=32.0, quantita=-1, iva=52.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.utenteBean utenteBean13 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo7, "hi!", "", "", "hi!", "");
        java.lang.String str14 = utenteBean13.getUsername();
        java.lang.String str15 = utenteBean13.getCap();
        utenteBean13.setUsername("");
        ita.kangaroo.model.OrdineBean ordineBean18 = new ita.kangaroo.model.OrdineBean(utenteBean13);
        java.sql.Date date26 = null;
        ita.kangaroo.model.OrdineBean ordineBean28 = new ita.kangaroo.model.OrdineBean((int) (short) 1, utenteBean13, (float) (byte) -1, "hi!", "hi!", "Data non disponibile", "", "Data non disponibile", "Data non disponibile", date26, "");
        ita.kangaroo.model.tipo tipo29 = null;
        utenteBean13.setTipo(tipo29);
        java.lang.String str31 = utenteBean13.getTelefono();
        java.sql.Date date39 = null;
        ita.kangaroo.model.OrdineBean ordineBean41 = new ita.kangaroo.model.OrdineBean((-1), utenteBean13, (float) (short) 0, "ProdottoBean{id=-1, descrizione='Data non disponibile', nome='Data non disponibile', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=32.0, quantita=32, iva=32.0, tipo=null}", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "ProdottoBean{id=10, descrizione='hi!', nome='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}", "ProdottoBean{id=32, descrizione='Data non disponibile', nome='Data non disponibile', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=32.0, quantita=32, iva=10.0, tipo=null}", "ProdottoBean{id=10, descrizione='hi!', nome='', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='hi!', prezzo=-1.0, quantita=32, iva=1.0, tipo=null}", date39, "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='hi!', prezzo=-1.0, quantita=32, iva=1.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean(52, "", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='hi!', prezzo=-1.0, quantita=32, iva=1.0, tipo=null}", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='hi!', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", (float) (-1), (-1), (float) '4', tipo7);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        ita.kangaroo.model.tipo tipo6 = null;
        ita.kangaroo.model.utenteBean utenteBean12 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo6, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean13 = new ita.kangaroo.model.OrdineBean(utenteBean12);
        ita.kangaroo.model.tipo tipo19 = null;
        ita.kangaroo.model.utenteBean utenteBean25 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo19, "hi!", "", "", "hi!", "");
        utenteBean25.setEmail("hi!");
        utenteBean25.setPassword("hi!");
        java.lang.String str30 = utenteBean25.getCognome();
        ordineBean13.setClient(utenteBean25);
        utenteBean25.setUsername("Data non disponibile");
        java.sql.Date date41 = null;
        ita.kangaroo.model.OrdineBean ordineBean43 = new ita.kangaroo.model.OrdineBean(10, utenteBean25, (float) 100L, "Data non disponibile", "da39a3ee5e6b4b0d3255bfef95601890afd80709", "hi!", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "da39a3ee5e6b4b0d3255bfef95601890afd80709", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", date41, "Data non disponibile");
        utenteBean25.setVia("ProdottoBean{id=10, descrizione='hi!', nome='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
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
        java.lang.String str24 = ordineBean12.getDestinatario();
        ita.kangaroo.model.tipo tipo30 = null;
        ita.kangaroo.model.utenteBean utenteBean36 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo30, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean37 = new ita.kangaroo.model.OrdineBean(utenteBean36);
        java.lang.String str38 = ordineBean37.getDestinatario();
        java.lang.String str39 = ordineBean37.getCircuito();
        ita.kangaroo.model.tipo tipo45 = null;
        ita.kangaroo.model.utenteBean utenteBean51 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo45, "hi!", "", "", "hi!", "");
        java.lang.String str52 = utenteBean51.getUsername();
        java.lang.String str53 = utenteBean51.getCap();
        utenteBean51.setUsername("");
        ita.kangaroo.model.OrdineBean ordineBean56 = new ita.kangaroo.model.OrdineBean(utenteBean51);
        ordineBean56.setCircuito("");
        java.util.ArrayList<ita.kangaroo.model.OrderProductBean> orderProductBeanList59 = ordineBean56.getProducts();
        ita.kangaroo.model.OrdineBean ordineBean60 = new ita.kangaroo.model.OrdineBean(orderProductBeanList59);
        ordineBean37.setProducts(orderProductBeanList59);
        ordineBean12.setProducts(orderProductBeanList59);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(orderProductBeanList59);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        ita.kangaroo.model.tipo tipo6 = null;
        ita.kangaroo.model.utenteBean utenteBean12 = new ita.kangaroo.model.utenteBean("3a987acf8cbc1028b7dbc86bd086831151899a2b", "hi!", "ProdottoBean{id=10, descrizione='hi!', nome='', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}", "hi!", "Data non disponibile", tipo6, "da39a3ee5e6b4b0d3255bfef95601890afd80709", "hi!", "da39a3ee5e6b4b0d3255bfef95601890afd80709", "3a987acf8cbc1028b7dbc86bd086831151899a2b", "Data non disponibile");
        java.sql.Date date20 = null;
        ita.kangaroo.model.OrdineBean ordineBean22 = new ita.kangaroo.model.OrdineBean((int) (byte) 100, utenteBean12, (float) (-1), "ProdottoBean{id=0, descrizione='', nome='', immagine='', prezzo=0.0, quantita=0, iva=0.0, tipo=null}", "ProdottoBean{id=-1, descrizione='Data non disponibile', nome='Data non disponibile', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=32.0, quantita=32, iva=32.0, tipo=null}", "", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='hi!', prezzo=-1.0, quantita=32, iva=1.0, tipo=null}", "", "ProdottoBean{id=52, descrizione='hi!', nome='', immagine='da39a3ee5e6b4b0d3255bfef95601890afd80709', prezzo=32.0, quantita=-1, iva=52.0, tipo=null}", date20, "Data non disponibile");
        ordineBean22.setDestinatario("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='hi!', prezzo=-1.0, quantita=-1, iva=1.0, tipo=null}");
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
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
        addressBean0.setCAP("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='hi!', prezzo=-1.0, quantita=1, iva=1.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        ordineBean12.setNumero_carta("");
        java.sql.Date date16 = ordineBean12.getData();
        ita.kangaroo.model.utenteBean utenteBean17 = ordineBean12.getClient();
        ita.kangaroo.model.tipo tipo18 = utenteBean17.getTipo();
        utenteBean17.setCap("ProdottoBean{id=10, descrizione='hi!', nome='', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}");
        ita.kangaroo.model.tipo tipo21 = utenteBean17.getTipo();
        java.lang.String str22 = utenteBean17.getPassword();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertNotNull(utenteBean17);
        org.junit.Assert.assertNull(tipo18);
        org.junit.Assert.assertNull(tipo21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        ita.kangaroo.model.tipo tipo6 = null;
        ita.kangaroo.model.utenteBean utenteBean12 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo6, "hi!", "", "", "hi!", "");
        java.lang.String str13 = utenteBean12.getUsername();
        java.sql.Date date21 = null;
        ita.kangaroo.model.OrdineBean ordineBean23 = new ita.kangaroo.model.OrdineBean((int) ' ', utenteBean12, 0.0f, "", "hi!", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "", "Data non disponibile", date21, "");
        utenteBean12.setCitta("ProdottoBean{id=10, descrizione='hi!', nome='', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        ita.kangaroo.model.MetodoPagamentoBean metodoPagamentoBean0 = new ita.kangaroo.model.MetodoPagamentoBean();
        metodoPagamentoBean0.setId((int) 'a');
        metodoPagamentoBean0.setCircuito("");
        metodoPagamentoBean0.setData_scadenza("hi!");
        java.lang.String str7 = metodoPagamentoBean0.getUsername();
        java.lang.String str8 = metodoPagamentoBean0.getCvv();
        java.lang.String str9 = metodoPagamentoBean0.getCvv();
        metodoPagamentoBean0.setUsername("3d1583397bcebff274b1e7cb58087c39153af974");
        metodoPagamentoBean0.setData_scadenza("ProdottoBean{id=32, descrizione='Data non disponibile', nome='Data non disponibile', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=32.0, quantita=32, iva=10.0, tipo=null}");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getImmagine();
        prodottoBean8.setPrezzo((float) (-1L));
        int int12 = prodottoBean8.getId();
        prodottoBean8.setPrezzo((float) (-1));
        ita.kangaroo.model.tipo tipo15 = null;
        prodottoBean8.setTipo(tipo15);
        int int17 = prodottoBean8.getQuantita();
        java.lang.String str18 = prodottoBean8.getImmagine();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        boolean boolean1 = ita.kangaroo.model.AddressBean.isValidCAP("da39a3ee5e6b4b0d3255bfef95601890afd80709");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        ita.kangaroo.model.MetodoPagamentoBean metodoPagamentoBean0 = new ita.kangaroo.model.MetodoPagamentoBean();
        metodoPagamentoBean0.setId((int) 'a');
        ita.kangaroo.model.AddressBean addressBean3 = new ita.kangaroo.model.AddressBean();
        java.lang.String str4 = addressBean3.getVia();
        addressBean3.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        addressBean3.setCitta("hi!");
        boolean boolean9 = metodoPagamentoBean0.equals((java.lang.Object) addressBean3);
        java.lang.String str10 = addressBean3.getCitta();
        addressBean3.setUsername("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        float float13 = ordineBean12.getPrezzo_totale();
        java.lang.String str14 = ordineBean12.getNumero_carta();
        ordineBean12.setDestinatario("hi!");
        java.sql.Date date17 = ordineBean12.getData();
        ordineBean12.setCircuito("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='hi!', prezzo=-1.0, quantita=32, iva=1.0, tipo=null}");
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(date17);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        ita.kangaroo.model.MetodoPagamentoBean metodoPagamentoBean0 = new ita.kangaroo.model.MetodoPagamentoBean();
        metodoPagamentoBean0.setId((int) 'a');
        ita.kangaroo.model.AddressBean addressBean3 = new ita.kangaroo.model.AddressBean();
        java.lang.String str4 = addressBean3.getVia();
        addressBean3.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        addressBean3.setCitta("hi!");
        boolean boolean9 = metodoPagamentoBean0.equals((java.lang.Object) addressBean3);
        java.lang.String str10 = metodoPagamentoBean0.getNumero_carta();
        int int11 = metodoPagamentoBean0.getId();
        java.lang.String str12 = metodoPagamentoBean0.getData_scadenza();
        java.lang.String str13 = metodoPagamentoBean0.getCvv();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        ordineBean12.setNumero_carta("");
        java.sql.Date date16 = ordineBean12.getData();
        ita.kangaroo.model.utenteBean utenteBean17 = ordineBean12.getClient();
        ordineBean12.setMetodo_di_pagamento("3d1583397bcebff274b1e7cb58087c39153af974");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertNotNull(utenteBean17);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        int int2 = orderProductBean0.getId_ordine();
        orderProductBean0.setQuantita((int) 'a');
        int int5 = orderProductBean0.getId_ordine();
        orderProductBean0.setId_ordine(100);
        float float8 = orderProductBean0.getPrezzo();
        float float9 = orderProductBean0.getPrezzo();
        int int10 = orderProductBean0.getId_prodotto();
        java.lang.Class<?> wildcardClass11 = orderProductBean0.getClass();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        ita.kangaroo.model.tipo tipo19 = null;
        ita.kangaroo.model.utenteBean utenteBean25 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo19, "hi!", "", "", "hi!", "");
        utenteBean25.setEmail("hi!");
        ordineBean12.setClient(utenteBean25);
        java.lang.Class<?> wildcardClass29 = ordineBean12.getClass();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        ita.kangaroo.model.AddressBean addressBean5 = new ita.kangaroo.model.AddressBean((int) '4', "3a987acf8cbc1028b7dbc86bd086831151899a2b", "ProdottoBean{id=10, descrizione='hi!', nome='', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}", "3a987acf8cbc1028b7dbc86bd086831151899a2b", "da39a3ee5e6b4b0d3255bfef95601890afd80709");
        java.lang.String str6 = addressBean5.getCAP();
        java.lang.String str7 = addressBean5.getUsername();
        java.lang.String str8 = addressBean5.getVia();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "3a987acf8cbc1028b7dbc86bd086831151899a2b" + "'", str6, "3a987acf8cbc1028b7dbc86bd086831151899a2b");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "da39a3ee5e6b4b0d3255bfef95601890afd80709" + "'", str7, "da39a3ee5e6b4b0d3255bfef95601890afd80709");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "3a987acf8cbc1028b7dbc86bd086831151899a2b" + "'", str8, "3a987acf8cbc1028b7dbc86bd086831151899a2b");
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getDestinatario();
        java.lang.String str14 = ordineBean12.toString();
        ita.kangaroo.model.tipo tipo20 = null;
        ita.kangaroo.model.utenteBean utenteBean26 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo20, "", "", "hi!", "hi!", "hi!");
        java.lang.String str27 = utenteBean26.getUsername();
        utenteBean26.setPassword("");
        ita.kangaroo.model.tipo tipo30 = null;
        utenteBean26.setTipo(tipo30);
        utenteBean26.setProvincia("hi!");
        ordineBean12.setClient(utenteBean26);
        java.lang.String str35 = ordineBean12.getNumero_di_tracking();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Data non disponibile" + "'", str14, "Data non disponibile");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNull(str35);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        float float2 = orderProductBean0.getIVA();
        orderProductBean0.setPrezzo(10.0f);
        orderProductBean0.setQuantita((int) (short) -1);
        int int7 = orderProductBean0.getQuantita();
        orderProductBean0.setQuantita((int) (byte) 1);
        int int10 = orderProductBean0.getQuantita();
        orderProductBean0.setId_ordine((int) (short) 10);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        utenteBean11.setEmail("");
        ita.kangaroo.model.OrdineBean ordineBean15 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str16 = ordineBean15.getNumero_carta();
        java.sql.Date date17 = ordineBean15.getData();
        ita.kangaroo.model.tipo tipo24 = null;
        ita.kangaroo.model.utenteBean utenteBean30 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo24, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean31 = new ita.kangaroo.model.OrdineBean(utenteBean30);
        utenteBean30.setPassword("hi!");
        utenteBean30.setNome("hi!");
        java.sql.Date date43 = null;
        ita.kangaroo.model.OrdineBean ordineBean45 = new ita.kangaroo.model.OrdineBean((int) (byte) 100, utenteBean30, (float) (-1L), "hi!", "", "", "hi!", "Data non disponibile", "hi!", date43, "");
        ordineBean45.setIndirizzo_di_spedizione("Data non disponibile");
        java.lang.String str48 = ordineBean45.getDestinatario();
        java.lang.String str49 = ordineBean45.getDestinatario();
        ita.kangaroo.model.tipo tipo55 = null;
        ita.kangaroo.model.utenteBean utenteBean61 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo55, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean62 = new ita.kangaroo.model.OrdineBean(utenteBean61);
        java.lang.String str63 = ordineBean62.getMetodo_di_spedizione();
        java.util.ArrayList<ita.kangaroo.model.OrderProductBean> orderProductBeanList64 = ordineBean62.getProducts();
        ordineBean45.setProducts(orderProductBeanList64);
        ordineBean15.setProducts(orderProductBeanList64);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(date17);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertNotNull(orderProductBeanList64);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
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
        java.lang.String str45 = metodoPagamentoBean0.getNumero_carta();
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
        org.junit.Assert.assertNull(str45);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        ordineBean12.setNumero_carta("");
        ita.kangaroo.model.tipo tipo21 = null;
        ita.kangaroo.model.utenteBean utenteBean27 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo21, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean28 = new ita.kangaroo.model.OrdineBean(utenteBean27);
        java.lang.String str29 = ordineBean28.getMetodo_di_spedizione();
        ordineBean28.setNumero_carta("");
        java.sql.Date date32 = ordineBean28.getData();
        int int33 = ordineBean28.getId();
        ita.kangaroo.model.tipo tipo39 = null;
        ita.kangaroo.model.utenteBean utenteBean45 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo39, "hi!", "", "", "hi!", "");
        java.lang.String str46 = utenteBean45.getProvincia();
        java.lang.String str47 = utenteBean45.getCognome();
        ordineBean28.setClient(utenteBean45);
        java.lang.String str49 = utenteBean45.getCap();
        ordineBean12.setClient(utenteBean45);
        java.lang.String str51 = utenteBean45.getProvincia();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(date32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
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
        metodoPagamentoBean0.setData_scadenza("Data non disponibile");
        ita.kangaroo.model.tipo tipo22 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean23 = new ita.kangaroo.model.ProdottoBean((int) '4', "", "", "3a987acf8cbc1028b7dbc86bd086831151899a2b", (float) ' ', (int) (byte) 1, (float) 10, tipo22);
        float float24 = prodottoBean23.getPrezzo();
        boolean boolean25 = metodoPagamentoBean0.equals((java.lang.Object) prodottoBean23);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 32.0f + "'", float24 == 32.0f);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
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
        java.lang.String str49 = ordineBean48.getCircuito();
        java.lang.String str50 = ordineBean48.getMetodo_di_pagamento();
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(orderProductBeanList46);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNull(str50);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        ita.kangaroo.model.Cart cart0 = new ita.kangaroo.model.Cart();
        java.util.ArrayList<ita.kangaroo.model.CartProduct> cartProductList1 = cart0.getProducts();
        java.util.ArrayList<ita.kangaroo.model.CartProduct> cartProductList2 = cart0.getProducts();
        ita.kangaroo.model.ProdottoBean prodottoBean3 = null;
        cart0.removeProduct(prodottoBean3);
        ita.kangaroo.model.Cart cart5 = new ita.kangaroo.model.Cart();
        ita.kangaroo.model.tipo tipo13 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean14 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo13);
        int int15 = prodottoBean14.getId();
        java.lang.String str16 = prodottoBean14.getImmagine();
        cart5.removeProduct(prodottoBean14);
        ita.kangaroo.model.tipo tipo25 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean26 = new ita.kangaroo.model.ProdottoBean((int) (byte) 10, "hi!", "hi!", "Data non disponibile", (float) (byte) 10, 10, (float) ' ', tipo25);
        ita.kangaroo.model.CartProduct cartProduct27 = new ita.kangaroo.model.CartProduct(prodottoBean26);
        cart5.removeProduct(prodottoBean26);
        ita.kangaroo.model.tipo tipo36 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean37 = new ita.kangaroo.model.ProdottoBean((int) '4', "da39a3ee5e6b4b0d3255bfef95601890afd80709", "", "da39a3ee5e6b4b0d3255bfef95601890afd80709", 32.0f, (-1), (float) '4', tipo36);
        prodottoBean37.setDescrizione("hi!");
        float float40 = prodottoBean37.getPrezzo();
        cart5.changeQuantity(prodottoBean37, (int) (short) 10);
        cart0.removeProduct(prodottoBean37);
        ita.kangaroo.model.CartProduct cartProduct44 = new ita.kangaroo.model.CartProduct(prodottoBean37);
        org.junit.Assert.assertNotNull(cartProductList1);
        org.junit.Assert.assertNotNull(cartProductList2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + 32.0f + "'", float40 == 32.0f);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        ita.kangaroo.model.utenteBean utenteBean0 = new ita.kangaroo.model.utenteBean();
        java.lang.String str1 = utenteBean0.getPassword();
        utenteBean0.setCitta("");
        java.lang.String str4 = utenteBean0.getVia();
        utenteBean0.setPassword("3a987acf8cbc1028b7dbc86bd086831151899a2b");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        ita.kangaroo.model.tipo tipo6 = null;
        ita.kangaroo.model.utenteBean utenteBean12 = new ita.kangaroo.model.utenteBean("", "", "", "", "Data non disponibile", tipo6, "hi!", "", "Data non disponibile", "Data non disponibile", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        java.sql.Date date20 = null;
        ita.kangaroo.model.OrdineBean ordineBean22 = new ita.kangaroo.model.OrdineBean((int) (byte) 10, utenteBean12, (float) 10, "", "", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "", "hi!", "hi!", date20, "Data non disponibile");
        ordineBean22.setIndirizzo_di_spedizione("Data non disponibile");
        java.lang.String str25 = ordineBean22.getIndirizzo_di_spedizione();
        java.lang.String str26 = ordineBean22.toString();
        java.lang.String str27 = ordineBean22.getDestinatario();
        ordineBean22.setId(10);
        ordineBean22.setId((int) (short) -1);
        java.lang.String str32 = ordineBean22.getMetodo_di_pagamento();
        ordineBean22.setMetodo_di_spedizione("ProdottoBean{id=52, descrizione='hi!', nome='', immagine='da39a3ee5e6b4b0d3255bfef95601890afd80709', prezzo=32.0, quantita=-1, iva=52.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Data non disponibile" + "'", str25, "Data non disponibile");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Data non disponibile" + "'", str26, "Data non disponibile");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        java.lang.String str12 = utenteBean11.getVia();
        java.lang.String str13 = utenteBean11.getProvincia();
        ita.kangaroo.model.tipo tipo14 = utenteBean11.getTipo();
        utenteBean11.setEmail("");
        java.lang.String str17 = utenteBean11.getNome();
        utenteBean11.setNome("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='hi!', prezzo=-1.0, quantita=-1, iva=1.0, tipo=null}");
        java.lang.String str20 = utenteBean11.getCitta();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(tipo14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        ita.kangaroo.model.MetodoPagamentoBean metodoPagamentoBean0 = new ita.kangaroo.model.MetodoPagamentoBean();
        metodoPagamentoBean0.setId((int) 'a');
        ita.kangaroo.model.AddressBean addressBean3 = new ita.kangaroo.model.AddressBean();
        java.lang.String str4 = addressBean3.getVia();
        addressBean3.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        addressBean3.setCitta("hi!");
        boolean boolean9 = metodoPagamentoBean0.equals((java.lang.Object) addressBean3);
        java.lang.String str10 = metodoPagamentoBean0.getNumero_carta();
        java.lang.String str11 = metodoPagamentoBean0.getNumero_carta();
        java.lang.String str12 = metodoPagamentoBean0.getCvv();
        metodoPagamentoBean0.setData_scadenza("3a987acf8cbc1028b7dbc86bd086831151899a2b");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        ita.kangaroo.model.tipo tipo6 = null;
        ita.kangaroo.model.utenteBean utenteBean12 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo6, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean13 = new ita.kangaroo.model.OrdineBean(utenteBean12);
        java.lang.String str14 = ordineBean13.getMetodo_di_spedizione();
        ita.kangaroo.model.tipo tipo20 = null;
        ita.kangaroo.model.utenteBean utenteBean26 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo20, "hi!", "", "", "hi!", "");
        utenteBean26.setEmail("hi!");
        ordineBean13.setClient(utenteBean26);
        utenteBean26.setCitta("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        java.sql.Date date39 = null;
        ita.kangaroo.model.OrdineBean ordineBean41 = new ita.kangaroo.model.OrdineBean((-1), utenteBean26, 1.0f, "hi!", "", "hi!", "hi!", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "hi!", date39, "");
        java.sql.Date date42 = ordineBean41.getData();
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(date42);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.utenteBean utenteBean13 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo7, "hi!", "", "", "hi!", "");
        java.lang.String str14 = utenteBean13.getUsername();
        java.sql.Date date22 = null;
        ita.kangaroo.model.OrdineBean ordineBean24 = new ita.kangaroo.model.OrdineBean((int) ' ', utenteBean13, 0.0f, "", "hi!", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "", "Data non disponibile", date22, "");
        java.sql.Date date32 = null;
        ita.kangaroo.model.OrdineBean ordineBean34 = new ita.kangaroo.model.OrdineBean((int) (byte) -1, utenteBean13, (float) (byte) 1, "3d1583397bcebff274b1e7cb58087c39153af974", "ProdottoBean{id=0, descrizione='', nome='', immagine='', prezzo=0.0, quantita=0, iva=0.0, tipo=null}", "3d1583397bcebff274b1e7cb58087c39153af974", "3d1583397bcebff274b1e7cb58087c39153af974", "3d1583397bcebff274b1e7cb58087c39153af974", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", date32, "ProdottoBean{id=0, descrizione='', nome='', immagine='', prezzo=0.0, quantita=0, iva=0.0, tipo=null}");
        utenteBean13.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='hi!', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        ita.kangaroo.model.AddressBean addressBean5 = new ita.kangaroo.model.AddressBean((int) (short) 0, "", "", "", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        java.lang.String str6 = addressBean5.getVia();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
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
        ita.kangaroo.model.utenteBean utenteBean25 = ordineBean12.getClient();
        utenteBean25.setEmail("da39a3ee5e6b4b0d3255bfef95601890afd80709");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(utenteBean25);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        int int9 = prodottoBean8.getId();
        java.lang.String str10 = prodottoBean8.getImmagine();
        ita.kangaroo.model.CartProduct cartProduct11 = new ita.kangaroo.model.CartProduct(prodottoBean8);
        float float12 = prodottoBean8.getIva();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
    }
}

