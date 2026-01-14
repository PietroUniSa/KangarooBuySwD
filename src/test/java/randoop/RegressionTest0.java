package randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

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
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        boolean boolean1 = ita.kangaroo.model.AddressBean.isValidCAP("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        boolean boolean1 = ita.kangaroo.model.AddressBean.isValidCAP("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        ita.kangaroo.model.AddressBean addressBean0 = new ita.kangaroo.model.AddressBean();
        addressBean0.setVia("hi!");
        addressBean0.setCitta("");
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        utenteBean11.setEmail("hi!");
        utenteBean11.setPassword("hi!");
        java.lang.String str16 = utenteBean11.getEmail();
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getImmagine();
        prodottoBean8.setPrezzo((float) (-1L));
        int int12 = prodottoBean8.getId();
        java.lang.Class<?> wildcardClass13 = prodottoBean8.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        utenteBean11.setEmail("hi!");
        utenteBean11.setPassword("hi!");
        utenteBean11.setProvincia("hi!");
        utenteBean11.setUsername("hi!");
        utenteBean11.setUsername("");
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        ordineBean12.setIndirizzo_di_spedizione("Data non disponibile");
        ordineBean12.setPrezzo_totale((float) (byte) 10);
        java.lang.String str17 = ordineBean12.toString();
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Data non disponibile" + "'", str17, "Data non disponibile");
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        ita.kangaroo.model.AddressBean addressBean0 = new ita.kangaroo.model.AddressBean();
        java.lang.String str1 = addressBean0.getVia();
        java.lang.String str2 = addressBean0.getUsername();
        addressBean0.setUsername("hi!");
        addressBean0.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        java.lang.String str7 = addressBean0.getVia();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}" + "'", str7, "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        java.lang.Class<?> wildcardClass2 = orderProductBean0.getClass();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getImmagine();
        prodottoBean8.setPrezzo((float) (-1L));
        int int12 = prodottoBean8.getId();
        java.lang.String str13 = prodottoBean8.getImmagine();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getDescrizione();
        ita.kangaroo.model.tipo tipo10 = null;
        prodottoBean8.setTipo(tipo10);
        ita.kangaroo.model.tipo tipo12 = null;
        prodottoBean8.setTipo(tipo12);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        utenteBean11.setEmail("hi!");
        utenteBean11.setPassword("hi!");
        utenteBean11.setProvincia("hi!");
        utenteBean11.setUsername("hi!");
        utenteBean11.setCognome("hi!");
        utenteBean11.setProvincia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        java.lang.String str12 = utenteBean11.getUsername();
        java.lang.String str13 = utenteBean11.getCap();
        utenteBean11.setEmail("hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        utenteBean11.setEmail("hi!");
        java.lang.String str14 = utenteBean11.getTelefono();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) ' ', "hi!", "Data non disponibile", "", (float) (short) 100, 0, (float) (byte) 100, tipo7);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        utenteBean11.setPassword("hi!");
        java.lang.String str15 = utenteBean11.getEmail();
        java.lang.String str16 = utenteBean11.getVia();
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        float float2 = orderProductBean0.getIVA();
        orderProductBean0.setPrezzo(10.0f);
        float float5 = orderProductBean0.getIVA();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        ita.kangaroo.model.AddressBean addressBean0 = new ita.kangaroo.model.AddressBean();
        java.lang.String str1 = addressBean0.getVia();
        java.lang.String str2 = addressBean0.getUsername();
        addressBean0.setUsername("hi!");
        addressBean0.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        addressBean0.setCitta("hi!");
        addressBean0.setId((int) (short) 10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getImmagine();
        prodottoBean8.setPrezzo((float) (-1L));
        int int12 = prodottoBean8.getQuantita();
        int int13 = prodottoBean8.getQuantita();
        float float14 = prodottoBean8.getPrezzo();
        int int15 = prodottoBean8.getQuantita();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + (-1.0f) + "'", float14 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        float float2 = orderProductBean0.getIVA();
        orderProductBean0.setPrezzo(10.0f);
        int int5 = orderProductBean0.getQuantita();
        orderProductBean0.setQuantita((int) '#');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getDescrizione();
        java.lang.String str10 = prodottoBean8.getNome();
        ita.kangaroo.model.CartProduct cartProduct11 = new ita.kangaroo.model.CartProduct(prodottoBean8);
        prodottoBean8.setId(100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        ita.kangaroo.model.tipo tipo6 = null;
        ita.kangaroo.model.utenteBean utenteBean12 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo6, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean13 = new ita.kangaroo.model.OrdineBean(utenteBean12);
        utenteBean12.setPassword("hi!");
        utenteBean12.setNome("hi!");
        java.sql.Date date25 = null;
        ita.kangaroo.model.OrdineBean ordineBean27 = new ita.kangaroo.model.OrdineBean((int) (byte) 100, utenteBean12, (float) (-1L), "hi!", "", "", "hi!", "Data non disponibile", "hi!", date25, "");
        ordineBean27.setIndirizzo_di_spedizione("Data non disponibile");
        java.lang.String str30 = ordineBean27.getNumero_di_tracking();
        java.util.ArrayList<ita.kangaroo.model.OrderProductBean> orderProductBeanList31 = ordineBean27.getProducts();
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(orderProductBeanList31);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "", "", "hi!", "hi!", "hi!");
        java.lang.String str12 = utenteBean11.getPassword();
        java.lang.String str13 = utenteBean11.getPassword();
        utenteBean11.setNome("");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        ita.kangaroo.model.MetodoPagamentoBean metodoPagamentoBean0 = new ita.kangaroo.model.MetodoPagamentoBean();
        metodoPagamentoBean0.setId((int) 'a');
        ita.kangaroo.model.AddressBean addressBean3 = new ita.kangaroo.model.AddressBean();
        java.lang.String str4 = addressBean3.getVia();
        addressBean3.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        addressBean3.setCitta("hi!");
        boolean boolean9 = metodoPagamentoBean0.equals((java.lang.Object) addressBean3);
        java.lang.String str10 = metodoPagamentoBean0.getCvv();
        metodoPagamentoBean0.setData_scadenza("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        ita.kangaroo.model.tipo tipo18 = null;
        ita.kangaroo.model.utenteBean utenteBean24 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo18, "hi!", "", "", "hi!", "");
        utenteBean24.setEmail("hi!");
        utenteBean24.setPassword("hi!");
        java.lang.String str29 = utenteBean24.getCognome();
        ordineBean12.setClient(utenteBean24);
        java.lang.String str31 = utenteBean24.getEmail();
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("Data non disponibile", "Data non disponibile", "", "hi!", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", tipo5, "hi!", "Data non disponibile", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "Data non disponibile", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        utenteBean11.setCap("Data non disponibile");
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        boolean boolean1 = ita.kangaroo.model.AddressBean.isValidCAP("Data non disponibile");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "", "", "hi!", "hi!", "hi!");
        java.lang.String str12 = utenteBean11.getUsername();
        utenteBean11.setCap("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        utenteBean11.setCitta("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        java.lang.String str17 = utenteBean11.getCap();
        utenteBean11.setCitta("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}" + "'", str17, "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        utenteBean11.setEmail("hi!");
        utenteBean11.setPassword("hi!");
        utenteBean11.setProvincia("hi!");
        utenteBean11.setUsername("hi!");
        java.lang.String str20 = utenteBean11.getTelefono();
        java.lang.String str21 = utenteBean11.getTelefono();
        ita.kangaroo.model.OrdineBean ordineBean22 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        int int23 = ordineBean22.getId();
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
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
        ordineBean12.setPrezzo_totale((float) (byte) 10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        ita.kangaroo.model.AddressBean addressBean5 = new ita.kangaroo.model.AddressBean((int) (byte) 0, "Data non disponibile", "", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "");
        addressBean5.setCitta("Data non disponibile");
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
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
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        ita.kangaroo.model.AddressBean addressBean0 = new ita.kangaroo.model.AddressBean();
        java.lang.String str1 = addressBean0.getVia();
        java.lang.String str2 = addressBean0.getVia();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getImmagine();
        prodottoBean8.setPrezzo((float) (-1L));
        int int12 = prodottoBean8.getId();
        prodottoBean8.setPrezzo(10.0f);
        prodottoBean8.setPrezzo(0.0f);
        int int17 = prodottoBean8.getId();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        ordineBean12.setNumero_carta("hi!");
        float float16 = ordineBean12.getPrezzo_totale();
        int int17 = ordineBean12.getId();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "", "", "hi!", "hi!", "hi!");
        java.lang.String str12 = utenteBean11.getUsername();
        utenteBean11.setCap("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        utenteBean11.setCitta("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        java.lang.String str17 = utenteBean11.getCap();
        java.lang.String str18 = utenteBean11.getEmail();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}" + "'", str17, "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        ita.kangaroo.model.MetodoPagamentoBean metodoPagamentoBean0 = new ita.kangaroo.model.MetodoPagamentoBean();
        metodoPagamentoBean0.setId((int) (byte) 0);
        java.lang.String str3 = metodoPagamentoBean0.getNumero_carta();
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getImmagine();
        int int10 = prodottoBean8.getQuantita();
        java.lang.String str11 = prodottoBean8.getImmagine();
        java.lang.String str12 = prodottoBean8.getImmagine();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getImmagine();
        prodottoBean8.setPrezzo((float) (-1L));
        int int12 = prodottoBean8.getId();
        prodottoBean8.setId(1);
        prodottoBean8.setId(32);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) -1, "Data non disponibile", "Data non disponibile", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", (float) ' ', (int) ' ', (float) ' ', tipo7);
        java.lang.String str9 = prodottoBean8.getImmagine();
        int int10 = prodottoBean8.getQuantita();
        java.lang.String str11 = prodottoBean8.getDescrizione();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}" + "'", str9, "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Data non disponibile" + "'", str11, "Data non disponibile");
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "", "", "hi!", "hi!", "hi!");
        java.lang.String str12 = utenteBean11.getPassword();
        java.lang.String str13 = utenteBean11.getPassword();
        utenteBean11.setNome("Data non disponibile");
        java.lang.String str16 = utenteBean11.getNome();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Data non disponibile" + "'", str16, "Data non disponibile");
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        boolean boolean1 = ita.kangaroo.model.AddressBean.isValidCAP("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        ita.kangaroo.model.Cart cart0 = new ita.kangaroo.model.Cart();
        ita.kangaroo.model.tipo tipo8 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean9 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo8);
        java.lang.String str10 = prodottoBean9.getDescrizione();
        java.lang.String str11 = prodottoBean9.getNome();
        int int12 = prodottoBean9.getQuantita();
        prodottoBean9.setDescrizione("hi!");
        cart0.addProduct(prodottoBean9);
        java.util.ArrayList<ita.kangaroo.model.CartProduct> cartProductList16 = cart0.getProducts();
        ita.kangaroo.model.ProdottoBean prodottoBean17 = null;
        // The following exception was thrown during execution in test generation
        try {
            cart0.removeProduct(prodottoBean17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ita.kangaroo.model.ProdottoBean.getId()\" because \"product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(cartProductList16);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        ita.kangaroo.model.AddressBean addressBean0 = new ita.kangaroo.model.AddressBean();
        addressBean0.setVia("hi!");
        java.lang.Class<?> wildcardClass3 = addressBean0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        ita.kangaroo.model.AddressBean addressBean0 = new ita.kangaroo.model.AddressBean();
        java.lang.String str1 = addressBean0.getVia();
        addressBean0.setVia("Data non disponibile");
        addressBean0.setVia("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
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
        java.lang.Class<?> wildcardClass35 = ordineBean12.getClass();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getImmagine();
        prodottoBean8.setPrezzo((float) (-1L));
        int int12 = prodottoBean8.getId();
        prodottoBean8.setPrezzo(10.0f);
        float float15 = prodottoBean8.getPrezzo();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        ita.kangaroo.model.utenteBean utenteBean0 = new ita.kangaroo.model.utenteBean();
        java.lang.String str1 = utenteBean0.getPassword();
        java.lang.String str2 = utenteBean0.getUsername();
        java.lang.String str3 = utenteBean0.getCitta();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        int int9 = prodottoBean8.getId();
        java.lang.String str10 = prodottoBean8.getImmagine();
        int int11 = prodottoBean8.getId();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getImmagine();
        prodottoBean8.setPrezzo((float) (-1L));
        int int12 = prodottoBean8.getId();
        prodottoBean8.setId(1);
        prodottoBean8.setNome("Data non disponibile");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
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
        ordineBean81.setDestinatario("");
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
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        ita.kangaroo.model.OrdineBean ordineBean0 = new ita.kangaroo.model.OrdineBean();
        java.lang.String str1 = ordineBean0.getDestinatario();
        ordineBean0.setId((int) ' ');
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getImmagine();
        prodottoBean8.setPrezzo((float) (-1L));
        int int12 = prodottoBean8.getId();
        float float13 = prodottoBean8.getIva();
        prodottoBean8.setQuantita((int) ' ');
        ita.kangaroo.model.tipo tipo16 = prodottoBean8.getTipo();
        prodottoBean8.setNome("Data non disponibile");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertNull(tipo16);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getImmagine();
        prodottoBean8.setPrezzo((float) (-1L));
        int int12 = prodottoBean8.getId();
        prodottoBean8.setPrezzo(10.0f);
        prodottoBean8.setPrezzo(0.0f);
        prodottoBean8.setNome("Data non disponibile");
        ita.kangaroo.model.tipo tipo19 = prodottoBean8.getTipo();
        java.lang.String str20 = prodottoBean8.getNome();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(tipo19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Data non disponibile" + "'", str20, "Data non disponibile");
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        ita.kangaroo.model.tipo tipo6 = null;
        ita.kangaroo.model.utenteBean utenteBean12 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo6, "hi!", "", "", "hi!", "");
        java.lang.String str13 = utenteBean12.getUsername();
        java.lang.String str14 = utenteBean12.getCap();
        java.sql.Date date22 = null;
        ita.kangaroo.model.OrdineBean ordineBean24 = new ita.kangaroo.model.OrdineBean((int) (short) 0, utenteBean12, (float) 10L, "", "Data non disponibile", "hi!", "hi!", "", "", date22, "hi!");
        utenteBean12.setNome("");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "", "", "hi!", "hi!", "hi!");
        java.lang.String str12 = utenteBean11.getPassword();
        utenteBean11.setProvincia("Data non disponibile");
        utenteBean11.setCognome("hi!");
        utenteBean11.setNome("");
        ita.kangaroo.model.tipo tipo19 = null;
        utenteBean11.setTipo(tipo19);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getDescrizione();
        prodottoBean8.setImmagine("");
        prodottoBean8.setId((int) (short) -1);
        ita.kangaroo.model.tipo tipo14 = prodottoBean8.getTipo();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(tipo14);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        ita.kangaroo.model.AddressBean addressBean0 = new ita.kangaroo.model.AddressBean();
        java.lang.String str1 = addressBean0.getVia();
        java.lang.String str2 = addressBean0.getUsername();
        addressBean0.setUsername("hi!");
        addressBean0.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        addressBean0.setId((int) '4');
        java.lang.String str9 = addressBean0.getUsername();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        orderProductBean0.setQuantita((int) (byte) 100);
        orderProductBean0.setPrezzo((float) (-1));
        orderProductBean0.setIVA((float) (byte) 1);
        int int8 = orderProductBean0.getQuantita();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        float float2 = orderProductBean0.getIVA();
        int int3 = orderProductBean0.getId_prodotto();
        int int4 = orderProductBean0.getId_ordine();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        ita.kangaroo.model.AddressBean addressBean0 = new ita.kangaroo.model.AddressBean();
        java.lang.String str1 = addressBean0.getVia();
        java.lang.String str2 = addressBean0.getUsername();
        addressBean0.setUsername("hi!");
        addressBean0.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        addressBean0.setCitta("hi!");
        addressBean0.setCitta("hi!");
        java.lang.Class<?> wildcardClass11 = addressBean0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        ita.kangaroo.model.AddressBean addressBean0 = new ita.kangaroo.model.AddressBean();
        java.lang.String str1 = addressBean0.getVia();
        java.lang.String str2 = addressBean0.getUsername();
        addressBean0.setUsername("hi!");
        addressBean0.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        boolean boolean8 = addressBean0.equals((java.lang.Object) 10L);
        int int9 = addressBean0.getId();
        addressBean0.setCitta("hi!");
        addressBean0.setId((int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        ita.kangaroo.model.tipo tipo6 = null;
        ita.kangaroo.model.utenteBean utenteBean12 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo6, "hi!", "", "", "hi!", "");
        utenteBean12.setEmail("hi!");
        java.lang.String str15 = utenteBean12.getCognome();
        java.sql.Date date23 = null;
        ita.kangaroo.model.OrdineBean ordineBean25 = new ita.kangaroo.model.OrdineBean((int) (byte) 10, utenteBean12, (float) (-1L), "Data non disponibile", "Data non disponibile", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "hi!", "hi!", "", date23, "Data non disponibile");
        java.lang.String str26 = ordineBean25.toString();
        ita.kangaroo.model.utenteBean utenteBean27 = ordineBean25.getClient();
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Data non disponibile" + "'", str26, "Data non disponibile");
        org.junit.Assert.assertNotNull(utenteBean27);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        ita.kangaroo.model.MetodoPagamentoBean metodoPagamentoBean0 = new ita.kangaroo.model.MetodoPagamentoBean();
        metodoPagamentoBean0.setId((int) 'a');
        metodoPagamentoBean0.setCircuito("");
        java.lang.String str5 = metodoPagamentoBean0.getNumero_carta();
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        ita.kangaroo.model.AddressBean addressBean0 = new ita.kangaroo.model.AddressBean();
        java.lang.String str1 = addressBean0.getVia();
        java.lang.String str2 = addressBean0.getUsername();
        addressBean0.setUsername("hi!");
        addressBean0.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        boolean boolean8 = addressBean0.equals((java.lang.Object) 10L);
        addressBean0.setUsername("hi!");
        addressBean0.setCitta("");
        addressBean0.setId((int) (short) -1);
        addressBean0.setCAP("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) -1, "Data non disponibile", "Data non disponibile", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", (float) ' ', (int) ' ', (float) ' ', tipo7);
        ita.kangaroo.model.CartProduct cartProduct9 = new ita.kangaroo.model.CartProduct(prodottoBean8);
        int int10 = prodottoBean8.getQuantita();
        ita.kangaroo.model.tipo tipo11 = null;
        prodottoBean8.setTipo(tipo11);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        ita.kangaroo.model.AddressBean addressBean0 = new ita.kangaroo.model.AddressBean();
        java.lang.String str1 = addressBean0.getVia();
        java.lang.String str2 = addressBean0.getUsername();
        addressBean0.setUsername("hi!");
        addressBean0.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        addressBean0.setUsername("hi!");
        addressBean0.setCAP("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        ita.kangaroo.model.AddressBean addressBean5 = new ita.kangaroo.model.AddressBean((int) (byte) 0, "Data non disponibile", "", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "");
        addressBean5.setCAP("");
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
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
        metodoPagamentoBean0.setCvv("hi!");
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
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        ordineBean12.setNumero_carta("hi!");
        ordineBean12.setPrezzo_totale((float) (byte) 10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        ita.kangaroo.model.tipo tipo6 = null;
        ita.kangaroo.model.utenteBean utenteBean12 = new ita.kangaroo.model.utenteBean("", "", "", "", "Data non disponibile", tipo6, "hi!", "", "Data non disponibile", "Data non disponibile", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        java.sql.Date date20 = null;
        ita.kangaroo.model.OrdineBean ordineBean22 = new ita.kangaroo.model.OrdineBean((int) (byte) 10, utenteBean12, (float) 10, "", "", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "", "hi!", "hi!", date20, "Data non disponibile");
        java.lang.String str23 = ordineBean22.getDestinatario();
        float float24 = ordineBean22.getPrezzo_totale();
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 10.0f + "'", float24 == 10.0f);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getDestinatario();
        java.lang.String str14 = ordineBean12.getCircuito();
        java.sql.Date date15 = ordineBean12.getData();
        ordineBean12.setId((int) (short) -1);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(date15);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
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
        java.lang.String str55 = prodottoBean41.getNome();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Data non disponibile" + "'", str55, "Data non disponibile");
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        float float2 = orderProductBean0.getIVA();
        orderProductBean0.setPrezzo(10.0f);
        orderProductBean0.setId_ordine((int) (short) 0);
        orderProductBean0.setIVA((-1.0f));
        float float9 = orderProductBean0.getIVA();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        int int2 = orderProductBean0.getId_ordine();
        orderProductBean0.setQuantita((int) 'a');
        int int5 = orderProductBean0.getId_prodotto();
        orderProductBean0.setIVA((float) (short) 10);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        ita.kangaroo.model.tipo tipo19 = null;
        ita.kangaroo.model.utenteBean utenteBean25 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo19, "hi!", "", "", "hi!", "");
        utenteBean25.setEmail("hi!");
        ordineBean12.setClient(utenteBean25);
        utenteBean25.setCap("hi!");
        java.lang.String str31 = utenteBean25.getProvincia();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "", "", "hi!", "hi!", "hi!");
        java.lang.String str12 = utenteBean11.getPassword();
        utenteBean11.setProvincia("Data non disponibile");
        utenteBean11.setCognome("hi!");
        java.lang.String str17 = utenteBean11.getPassword();
        utenteBean11.setCognome("Data non disponibile");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) -1, "Data non disponibile", "Data non disponibile", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", (float) ' ', (int) ' ', (float) ' ', tipo7);
        ita.kangaroo.model.CartProduct cartProduct9 = new ita.kangaroo.model.CartProduct(prodottoBean8);
        ita.kangaroo.model.CartProduct cartProduct10 = new ita.kangaroo.model.CartProduct(prodottoBean8);
        ita.kangaroo.model.tipo tipo11 = prodottoBean8.getTipo();
        org.junit.Assert.assertNull(tipo11);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
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
        prodottoBean30.setPrezzo((float) (short) 10);
        ita.kangaroo.model.tipo tipo43 = prodottoBean30.getTipo();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 1.0f + "'", float35 == 1.0f);
        org.junit.Assert.assertNull(tipo38);
        org.junit.Assert.assertNull(tipo43);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "", "", "Data non disponibile", tipo5, "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "", "Data non disponibile");
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        java.util.ArrayList<ita.kangaroo.model.OrderProductBean> orderProductBeanList14 = ordineBean12.getProducts();
        java.lang.String str15 = ordineBean12.getCircuito();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(orderProductBeanList14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        ita.kangaroo.model.tipo tipo6 = null;
        ita.kangaroo.model.utenteBean utenteBean12 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo6, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean13 = new ita.kangaroo.model.OrdineBean(utenteBean12);
        utenteBean12.setPassword("hi!");
        utenteBean12.setNome("hi!");
        java.sql.Date date25 = null;
        ita.kangaroo.model.OrdineBean ordineBean27 = new ita.kangaroo.model.OrdineBean((int) (byte) 100, utenteBean12, (float) (-1L), "hi!", "", "", "hi!", "Data non disponibile", "hi!", date25, "");
        java.lang.String str28 = utenteBean12.getCap();
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getDestinatario();
        java.sql.Date date14 = ordineBean12.getData();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(date14);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        ita.kangaroo.model.Cart cart0 = new ita.kangaroo.model.Cart();
        ita.kangaroo.model.tipo tipo8 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean9 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo8);
        java.lang.String str10 = prodottoBean9.getImmagine();
        prodottoBean9.setPrezzo((float) (-1L));
        cart0.changeQuantity(prodottoBean9, 97);
        prodottoBean9.setQuantita((int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
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
        java.lang.String str38 = utenteBean29.getPassword();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        ita.kangaroo.model.tipo tipo19 = null;
        ita.kangaroo.model.utenteBean utenteBean25 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo19, "hi!", "", "", "hi!", "");
        utenteBean25.setEmail("hi!");
        ordineBean12.setClient(utenteBean25);
        java.lang.String str29 = utenteBean25.getEmail();
        java.lang.String str30 = utenteBean25.getCap();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        ita.kangaroo.model.AddressBean addressBean0 = new ita.kangaroo.model.AddressBean();
        addressBean0.setId((int) ' ');
        java.lang.String str3 = addressBean0.getVia();
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
        boolean boolean30 = addressBean0.equals((java.lang.Object) str29);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.0f + "'", float17 == 0.0f);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        ordineBean12.setNumero_carta("");
        java.sql.Date date16 = ordineBean12.getData();
        ita.kangaroo.model.utenteBean utenteBean17 = ordineBean12.getClient();
        ita.kangaroo.model.tipo tipo18 = utenteBean17.getTipo();
        java.lang.String str19 = utenteBean17.getCap();
        java.lang.String str20 = utenteBean17.getEmail();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertNotNull(utenteBean17);
        org.junit.Assert.assertNull(tipo18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "", "", "hi!", "hi!", "hi!");
        java.lang.String str12 = utenteBean11.getUsername();
        java.lang.String str13 = utenteBean11.getEmail();
        java.lang.String str14 = utenteBean11.getCognome();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        ordineBean12.setNumero_carta("");
        java.sql.Date date16 = ordineBean12.getData();
        int int17 = ordineBean12.getId();
        ordineBean12.setCircuito("Data non disponibile");
        java.lang.String str20 = ordineBean12.getCircuito();
        java.lang.String str21 = ordineBean12.getNumero_carta();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Data non disponibile" + "'", str20, "Data non disponibile");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        ordineBean12.setNumero_carta("");
        java.sql.Date date16 = ordineBean12.getData();
        ita.kangaroo.model.utenteBean utenteBean17 = ordineBean12.getClient();
        java.sql.Date date18 = null;
        ordineBean12.setData(date18);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertNotNull(utenteBean17);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
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
        java.lang.Class<?> wildcardClass42 = utenteBean26.getClass();
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        ita.kangaroo.model.ProdottoBean prodottoBean0 = null;
        ita.kangaroo.model.CartProduct cartProduct2 = new ita.kangaroo.model.CartProduct(prodottoBean0, (int) (byte) 10);
        cartProduct2.setQuantity((int) (short) 100);
        int int5 = cartProduct2.getQuantity();
        cartProduct2.setQuantity((int) '#');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
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
        int int37 = metodoPagamentoBean0.getId();
        java.lang.String str38 = metodoPagamentoBean0.getCircuito();
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
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 97 + "'", int37 == 97);
        org.junit.Assert.assertNull(str38);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "", "", "hi!", "hi!", "hi!");
        java.lang.String str12 = utenteBean11.getUsername();
        utenteBean11.setPassword("");
        ita.kangaroo.model.tipo tipo15 = null;
        utenteBean11.setTipo(tipo15);
        utenteBean11.setProvincia("hi!");
        utenteBean11.setCap("Data non disponibile");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
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
        ordineBean27.setId(10);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getImmagine();
        prodottoBean8.setPrezzo((float) (-1L));
        int int12 = prodottoBean8.getId();
        prodottoBean8.setPrezzo(10.0f);
        java.lang.String str15 = prodottoBean8.getImmagine();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) -1, "Data non disponibile", "Data non disponibile", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", (float) ' ', (int) ' ', (float) ' ', tipo7);
        ita.kangaroo.model.CartProduct cartProduct9 = new ita.kangaroo.model.CartProduct(prodottoBean8);
        int int10 = prodottoBean8.getQuantita();
        prodottoBean8.setDescrizione("hi!");
        prodottoBean8.setIva(0.0f);
        ita.kangaroo.model.tipo tipo15 = prodottoBean8.getTipo();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertNull(tipo15);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        java.lang.String str12 = utenteBean11.getVia();
        java.lang.String str13 = utenteBean11.getCitta();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        ita.kangaroo.model.tipo tipo19 = null;
        ita.kangaroo.model.utenteBean utenteBean25 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo19, "hi!", "", "", "hi!", "");
        utenteBean25.setEmail("hi!");
        ordineBean12.setClient(utenteBean25);
        utenteBean25.setPassword("Data non disponibile");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        ita.kangaroo.model.AddressBean addressBean5 = new ita.kangaroo.model.AddressBean((int) (byte) 0, "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "hi!", "Data non disponibile", "");
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getImmagine();
        int int10 = prodottoBean8.getQuantita();
        ita.kangaroo.model.CartProduct cartProduct11 = new ita.kangaroo.model.CartProduct(prodottoBean8);
        cartProduct11.setQuantity(1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "hi!", "", "", "hi!", tipo5, "", "", "Data non disponibile", "", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        utenteBean11.setCognome("");
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getDescrizione();
        java.lang.String str10 = prodottoBean8.getDescrizione();
        ita.kangaroo.model.CartProduct cartProduct11 = new ita.kangaroo.model.CartProduct(prodottoBean8);
        int int12 = prodottoBean8.getQuantita();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        float float2 = orderProductBean0.getIVA();
        orderProductBean0.setPrezzo(10.0f);
        float float5 = orderProductBean0.getPrezzo();
        float float6 = orderProductBean0.getPrezzo();
        orderProductBean0.setId_ordine((int) 'a');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10.0f + "'", float5 == 10.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getImmagine();
        prodottoBean8.setPrezzo((float) (-1L));
        int int12 = prodottoBean8.getId();
        ita.kangaroo.model.CartProduct cartProduct13 = new ita.kangaroo.model.CartProduct(prodottoBean8);
        cartProduct13.setQuantity(32);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "", "", "hi!", "hi!", "hi!");
        java.lang.String str12 = utenteBean11.getPassword();
        utenteBean11.setTelefono("");
        java.lang.String str15 = utenteBean11.getProvincia();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        ita.kangaroo.model.tipo tipo19 = null;
        ita.kangaroo.model.utenteBean utenteBean25 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo19, "hi!", "", "", "hi!", "");
        utenteBean25.setEmail("hi!");
        ordineBean12.setClient(utenteBean25);
        utenteBean25.setCitta("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        ita.kangaroo.model.OrdineBean ordineBean31 = new ita.kangaroo.model.OrdineBean(utenteBean25);
        java.lang.String str32 = utenteBean25.getUsername();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        ordineBean12.setNumero_carta("");
        java.sql.Date date16 = ordineBean12.getData();
        java.lang.String str17 = ordineBean12.getIndirizzo_di_spedizione();
        ordineBean12.setMetodo_di_spedizione("");
        ordineBean12.setMetodo_di_pagamento("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
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
        float float27 = ordineBean12.getPrezzo_totale();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(orderProductBeanList26);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 0.0f + "'", float27 == 0.0f);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        ita.kangaroo.model.ProdottoBean prodottoBean0 = null;
        ita.kangaroo.model.CartProduct cartProduct1 = new ita.kangaroo.model.CartProduct(prodottoBean0);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        float float13 = ordineBean12.getPrezzo_totale();
        java.lang.String str14 = ordineBean12.getNumero_carta();
        ita.kangaroo.model.tipo tipo20 = null;
        ita.kangaroo.model.utenteBean utenteBean26 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo20, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean27 = new ita.kangaroo.model.OrdineBean(utenteBean26);
        ita.kangaroo.model.tipo tipo33 = null;
        ita.kangaroo.model.utenteBean utenteBean39 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo33, "hi!", "", "", "hi!", "");
        utenteBean39.setEmail("hi!");
        utenteBean39.setPassword("hi!");
        java.lang.String str44 = utenteBean39.getCognome();
        ordineBean27.setClient(utenteBean39);
        java.util.ArrayList<ita.kangaroo.model.OrderProductBean> orderProductBeanList46 = ordineBean27.getProducts();
        ordineBean12.setProducts(orderProductBeanList46);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(orderProductBeanList46);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        java.lang.String str12 = utenteBean11.getProvincia();
        utenteBean11.setVia("Data non disponibile");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
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
        int int13 = metodoPagamentoBean0.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) -1, "Data non disponibile", "Data non disponibile", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", (float) ' ', (int) ' ', (float) ' ', tipo7);
        ita.kangaroo.model.CartProduct cartProduct9 = new ita.kangaroo.model.CartProduct(prodottoBean8);
        int int10 = prodottoBean8.getQuantita();
        prodottoBean8.setDescrizione("hi!");
        java.lang.Class<?> wildcardClass13 = prodottoBean8.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        ita.kangaroo.model.AddressBean addressBean5 = new ita.kangaroo.model.AddressBean(100, "hi!", "hi!", "hi!", "Data non disponibile");
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getImmagine();
        prodottoBean8.setPrezzo((float) (-1L));
        int int12 = prodottoBean8.getId();
        ita.kangaroo.model.CartProduct cartProduct13 = new ita.kangaroo.model.CartProduct(prodottoBean8);
        prodottoBean8.setPrezzo((float) (byte) 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
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
        float float84 = ordineBean81.getPrezzo_totale();
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
        org.junit.Assert.assertTrue("'" + float84 + "' != '" + 0.0f + "'", float84 == 0.0f);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
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
        java.lang.String str47 = metodoPagamentoBean0.getCvv();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(orderProductBeanList44);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(str47);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        ita.kangaroo.model.tipo tipo6 = null;
        ita.kangaroo.model.utenteBean utenteBean12 = new ita.kangaroo.model.utenteBean("", "", "", "", "Data non disponibile", tipo6, "hi!", "", "Data non disponibile", "Data non disponibile", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        java.sql.Date date20 = null;
        ita.kangaroo.model.OrdineBean ordineBean22 = new ita.kangaroo.model.OrdineBean((int) (byte) 10, utenteBean12, (float) 10, "", "", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "", "hi!", "hi!", date20, "Data non disponibile");
        java.lang.String str23 = utenteBean12.getVia();
        utenteBean12.setTelefono("");
        utenteBean12.setVia("da39a3ee5e6b4b0d3255bfef95601890afd80709");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
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
        ordineBean12.setMetodo_di_spedizione("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) -1, "Data non disponibile", "Data non disponibile", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", (float) ' ', (int) ' ', (float) ' ', tipo7);
        java.lang.String str9 = prodottoBean8.getImmagine();
        int int10 = prodottoBean8.getQuantita();
        float float11 = prodottoBean8.getPrezzo();
        ita.kangaroo.model.tipo tipo12 = prodottoBean8.getTipo();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}" + "'", str9, "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 32.0f + "'", float11 == 32.0f);
        org.junit.Assert.assertNull(tipo12);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        int int2 = orderProductBean0.getId_ordine();
        orderProductBean0.setQuantita((int) 'a');
        orderProductBean0.setIVA((float) 32);
        int int7 = orderProductBean0.getQuantita();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        ita.kangaroo.model.AddressBean addressBean0 = new ita.kangaroo.model.AddressBean();
        addressBean0.setId((int) ' ');
        addressBean0.setVia("");
        addressBean0.setCAP("Data non disponibile");
        java.lang.String str7 = addressBean0.getCitta();
        addressBean0.setCAP("hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getDescrizione();
        java.lang.String str10 = prodottoBean8.getNome();
        ita.kangaroo.model.CartProduct cartProduct11 = new ita.kangaroo.model.CartProduct(prodottoBean8);
        prodottoBean8.setPrezzo((float) (byte) 0);
        ita.kangaroo.model.tipo tipo14 = prodottoBean8.getTipo();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(tipo14);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        ita.kangaroo.model.utenteBean utenteBean0 = new ita.kangaroo.model.utenteBean();
        java.lang.String str1 = utenteBean0.getPassword();
        utenteBean0.setProvincia("Data non disponibile");
        utenteBean0.setUsername("");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        utenteBean11.setEmail("hi!");
        utenteBean11.setPassword("hi!");
        java.lang.String str16 = utenteBean11.getCognome();
        java.lang.String str17 = utenteBean11.getUsername();
        utenteBean11.setUsername("hi!");
        java.lang.String str20 = utenteBean11.getNome();
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) -1, "Data non disponibile", "Data non disponibile", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", (float) ' ', (int) ' ', (float) ' ', tipo7);
        ita.kangaroo.model.CartProduct cartProduct9 = new ita.kangaroo.model.CartProduct(prodottoBean8);
        int int10 = prodottoBean8.getQuantita();
        prodottoBean8.setIva((float) (short) 10);
        prodottoBean8.setDescrizione("da39a3ee5e6b4b0d3255bfef95601890afd80709");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        utenteBean11.setEmail("hi!");
        utenteBean11.setPassword("hi!");
        java.lang.String str16 = utenteBean11.getCognome();
        java.lang.String str17 = utenteBean11.getUsername();
        ita.kangaroo.model.tipo tipo18 = utenteBean11.getTipo();
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(tipo18);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        ita.kangaroo.model.AddressBean addressBean0 = new ita.kangaroo.model.AddressBean();
        java.lang.String str1 = addressBean0.getVia();
        java.lang.String str2 = addressBean0.getUsername();
        addressBean0.setUsername("hi!");
        addressBean0.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        boolean boolean8 = addressBean0.equals((java.lang.Object) 10L);
        int int9 = addressBean0.getId();
        java.lang.String str10 = addressBean0.getCAP();
        addressBean0.setId((int) '#');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
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
        java.lang.String str37 = ordineBean12.getMetodo_di_spedizione();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str37);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getDescrizione();
        prodottoBean8.setImmagine("");
        java.lang.String str12 = prodottoBean8.toString();
        float float13 = prodottoBean8.getIva();
        java.lang.String str14 = prodottoBean8.toString();
        prodottoBean8.setNome("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}" + "'", str12, "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}" + "'", str14, "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
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
        addressBean0.setUsername("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) -1, "Data non disponibile", "Data non disponibile", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", (float) ' ', (int) ' ', (float) ' ', tipo7);
        java.lang.String str9 = prodottoBean8.getImmagine();
        int int10 = prodottoBean8.getQuantita();
        prodottoBean8.setIva((float) '4');
        java.lang.Class<?> wildcardClass13 = prodottoBean8.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}" + "'", str9, "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        ita.kangaroo.model.AddressBean addressBean0 = new ita.kangaroo.model.AddressBean();
        java.lang.String str1 = addressBean0.getVia();
        java.lang.String str2 = addressBean0.getUsername();
        addressBean0.setUsername("hi!");
        addressBean0.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        addressBean0.setCitta("hi!");
        java.lang.String str9 = addressBean0.getVia();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}" + "'", str9, "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        ita.kangaroo.model.utenteBean utenteBean1 = new ita.kangaroo.model.utenteBean();
        java.lang.String str2 = utenteBean1.getPassword();
        java.sql.Date date10 = null;
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(0, utenteBean1, (float) (short) -1, "Data non disponibile", "", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "Data non disponibile", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", date10, "");
        java.lang.String str13 = ordineBean12.getIndirizzo_di_spedizione();
        ordineBean12.setDestinatario("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}" + "'", str13, "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        ita.kangaroo.model.AddressBean addressBean0 = new ita.kangaroo.model.AddressBean();
        java.lang.String str1 = addressBean0.getVia();
        java.lang.String str2 = addressBean0.getUsername();
        addressBean0.setUsername("hi!");
        addressBean0.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        addressBean0.setCitta("hi!");
        addressBean0.setCitta("hi!");
        java.lang.String str11 = addressBean0.getVia();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}" + "'", str11, "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        float float2 = orderProductBean0.getIVA();
        java.lang.Class<?> wildcardClass3 = orderProductBean0.getClass();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getImmagine();
        prodottoBean8.setPrezzo((float) (-1L));
        int int12 = prodottoBean8.getId();
        ita.kangaroo.model.CartProduct cartProduct14 = new ita.kangaroo.model.CartProduct(prodottoBean8, (int) (short) -1);
        java.lang.Class<?> wildcardClass15 = cartProduct14.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
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
        prodottoBean34.setId((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNull(tipo24);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 1.0f + "'", float39 == 1.0f);
        org.junit.Assert.assertNull(tipo42);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        ita.kangaroo.model.AddressBean addressBean1 = new ita.kangaroo.model.AddressBean();
        java.lang.String str2 = addressBean1.getVia();
        java.lang.String str3 = addressBean1.getUsername();
        addressBean1.setUsername("hi!");
        ita.kangaroo.model.tipo tipo11 = null;
        ita.kangaroo.model.utenteBean utenteBean17 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo11, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean18 = new ita.kangaroo.model.OrdineBean(utenteBean17);
        java.lang.String str19 = ordineBean18.getMetodo_di_spedizione();
        ita.kangaroo.model.tipo tipo25 = null;
        ita.kangaroo.model.utenteBean utenteBean31 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo25, "hi!", "", "", "hi!", "");
        utenteBean31.setEmail("hi!");
        ordineBean18.setClient(utenteBean31);
        ordineBean18.setNumero_carta("");
        ordineBean18.setMetodo_di_pagamento("hi!");
        java.util.ArrayList<ita.kangaroo.model.OrderProductBean> orderProductBeanList39 = null;
        ordineBean18.setProducts(orderProductBeanList39);
        boolean boolean41 = addressBean1.equals((java.lang.Object) orderProductBeanList39);
        java.lang.String str42 = addressBean1.getCitta();
        java.lang.String str43 = addressBean1.getCitta();
        ita.kangaroo.model.tipo tipo49 = null;
        ita.kangaroo.model.utenteBean utenteBean55 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo49, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean56 = new ita.kangaroo.model.OrdineBean(utenteBean55);
        java.lang.String str57 = ordineBean56.getMetodo_di_spedizione();
        ordineBean56.setNumero_carta("");
        java.sql.Date date60 = ordineBean56.getData();
        ordineBean56.setMetodo_di_pagamento("");
        ordineBean56.setNumero_di_tracking("");
        ordineBean56.setCircuito("hi!");
        int int67 = ordineBean56.getId();
        ita.kangaroo.model.tipo tipo73 = null;
        ita.kangaroo.model.utenteBean utenteBean79 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo73, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean80 = new ita.kangaroo.model.OrdineBean(utenteBean79);
        utenteBean79.setPassword("hi!");
        utenteBean79.setNome("hi!");
        ordineBean56.setClient(utenteBean79);
        boolean boolean86 = addressBean1.equals((java.lang.Object) utenteBean79);
        java.sql.Date date94 = null;
        ita.kangaroo.model.OrdineBean ordineBean96 = new ita.kangaroo.model.OrdineBean(97, utenteBean79, (float) '#', "", "da39a3ee5e6b4b0d3255bfef95601890afd80709", "", "da39a3ee5e6b4b0d3255bfef95601890afd80709", "hi!", "hi!", date94, "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertNull(date60);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        ita.kangaroo.model.OrdineBean ordineBean0 = new ita.kangaroo.model.OrdineBean();
        ita.kangaroo.model.tipo tipo6 = null;
        ita.kangaroo.model.utenteBean utenteBean12 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo6, "hi!", "", "", "hi!", "");
        utenteBean12.setEmail("hi!");
        utenteBean12.setPassword("hi!");
        utenteBean12.setProvincia("hi!");
        utenteBean12.setUsername("hi!");
        java.lang.String str21 = utenteBean12.getTelefono();
        java.lang.String str22 = utenteBean12.getUsername();
        ordineBean0.setClient(utenteBean12);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        utenteBean11.setEmail("hi!");
        utenteBean11.setPassword("hi!");
        utenteBean11.setProvincia("hi!");
        java.lang.String str18 = utenteBean11.getUsername();
        java.lang.String str19 = utenteBean11.getVia();
        utenteBean11.setEmail("");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        ita.kangaroo.model.tipo tipo19 = null;
        ita.kangaroo.model.utenteBean utenteBean25 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo19, "hi!", "", "", "hi!", "");
        utenteBean25.setEmail("hi!");
        ordineBean12.setClient(utenteBean25);
        utenteBean25.setPassword("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        ita.kangaroo.model.tipo tipo6 = null;
        ita.kangaroo.model.utenteBean utenteBean12 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo6, "hi!", "", "", "hi!", "");
        utenteBean12.setEmail("hi!");
        utenteBean12.setPassword("hi!");
        utenteBean12.setProvincia("hi!");
        utenteBean12.setUsername("hi!");
        utenteBean12.setCognome("hi!");
        java.sql.Date date30 = null;
        ita.kangaroo.model.OrdineBean ordineBean32 = new ita.kangaroo.model.OrdineBean((int) (byte) 10, utenteBean12, (float) (short) 100, "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "hi!", "", "", "hi!", "", date30, "");
        java.lang.String str33 = utenteBean12.getNome();
        utenteBean12.setCitta("");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        utenteBean11.setEmail("hi!");
        utenteBean11.setPassword("hi!");
        utenteBean11.setProvincia("hi!");
        java.lang.String str18 = utenteBean11.getUsername();
        java.lang.String str19 = utenteBean11.getVia();
        java.lang.String str20 = utenteBean11.getCap();
        utenteBean11.setNome("");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
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
        java.lang.String str51 = ordineBean12.toString();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(orderProductBeanList28);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Data non disponibile" + "'", str51, "Data non disponibile");
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        ita.kangaroo.model.Cart cart0 = new ita.kangaroo.model.Cart();
        ita.kangaroo.model.tipo tipo8 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean9 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo8);
        int int10 = prodottoBean9.getId();
        java.lang.String str11 = prodottoBean9.getImmagine();
        cart0.removeProduct(prodottoBean9);
        ita.kangaroo.model.tipo tipo13 = prodottoBean9.getTipo();
        float float14 = prodottoBean9.getIva();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(tipo13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        float float2 = orderProductBean0.getIVA();
        orderProductBean0.setPrezzo(10.0f);
        orderProductBean0.setId_ordine((int) 'a');
        orderProductBean0.setId_ordine((int) (short) 1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        ita.kangaroo.model.tipo tipo19 = null;
        ita.kangaroo.model.utenteBean utenteBean25 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo19, "hi!", "", "", "hi!", "");
        utenteBean25.setEmail("hi!");
        ordineBean12.setClient(utenteBean25);
        ita.kangaroo.model.utenteBean utenteBean29 = ordineBean12.getClient();
        utenteBean29.setCap("Data non disponibile");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(utenteBean29);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getImmagine();
        prodottoBean8.setPrezzo((float) (-1L));
        int int12 = prodottoBean8.getId();
        ita.kangaroo.model.CartProduct cartProduct14 = new ita.kangaroo.model.CartProduct(prodottoBean8, (int) (short) -1);
        ita.kangaroo.model.tipo tipo15 = null;
        prodottoBean8.setTipo(tipo15);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        ita.kangaroo.model.AddressBean addressBean0 = new ita.kangaroo.model.AddressBean();
        java.lang.String str1 = addressBean0.getVia();
        java.lang.String str2 = addressBean0.getUsername();
        addressBean0.setUsername("hi!");
        addressBean0.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        boolean boolean8 = addressBean0.equals((java.lang.Object) 10L);
        int int9 = addressBean0.getId();
        addressBean0.setCitta("hi!");
        int int12 = addressBean0.getId();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        ita.kangaroo.model.tipo tipo6 = null;
        ita.kangaroo.model.utenteBean utenteBean12 = new ita.kangaroo.model.utenteBean("", "", "", "", "Data non disponibile", tipo6, "hi!", "", "Data non disponibile", "Data non disponibile", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        java.sql.Date date20 = null;
        ita.kangaroo.model.OrdineBean ordineBean22 = new ita.kangaroo.model.OrdineBean((int) (byte) 10, utenteBean12, (float) 10, "", "", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "", "hi!", "hi!", date20, "Data non disponibile");
        ordineBean22.setIndirizzo_di_spedizione("Data non disponibile");
        java.lang.String str25 = ordineBean22.getIndirizzo_di_spedizione();
        java.lang.String str26 = ordineBean22.getMetodo_di_spedizione();
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Data non disponibile" + "'", str25, "Data non disponibile");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Data non disponibile" + "'", str26, "Data non disponibile");
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "", "", "hi!", "hi!", "hi!");
        java.lang.String str12 = utenteBean11.getPassword();
        java.lang.String str13 = utenteBean11.getPassword();
        utenteBean11.setNome("Data non disponibile");
        utenteBean11.setPassword("");
        java.lang.String str18 = utenteBean11.getNome();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Data non disponibile" + "'", str18, "Data non disponibile");
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
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
        java.lang.String str36 = metodoPagamentoBean0.getCvv();
        java.lang.String str37 = metodoPagamentoBean0.getUsername();
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
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(str37);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "", "", "hi!", "hi!", "hi!");
        java.lang.String str12 = utenteBean11.getUsername();
        utenteBean11.setCap("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        java.lang.String str15 = utenteBean11.getNome();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "", "", "hi!", "hi!", "hi!");
        java.lang.String str12 = utenteBean11.getPassword();
        utenteBean11.setProvincia("Data non disponibile");
        java.lang.String str15 = utenteBean11.getCognome();
        utenteBean11.setNome("");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        ita.kangaroo.model.AddressBean addressBean0 = new ita.kangaroo.model.AddressBean();
        addressBean0.setId((int) ' ');
        java.lang.String str3 = addressBean0.getVia();
        addressBean0.setCitta("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        addressBean0.setCAP("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
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
        java.lang.String str49 = ordineBean27.getIndirizzo_di_spedizione();
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(orderProductBeanList46);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Data non disponibile" + "'", str49, "Data non disponibile");
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        ita.kangaroo.model.utenteBean utenteBean0 = new ita.kangaroo.model.utenteBean();
        java.lang.String str1 = utenteBean0.getNome();
        java.lang.String str2 = utenteBean0.getCognome();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getCircuito();
        java.lang.String str14 = ordineBean12.toString();
        java.lang.String str15 = ordineBean12.getMetodo_di_pagamento();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Data non disponibile" + "'", str14, "Data non disponibile");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        ita.kangaroo.model.Cart cart0 = new ita.kangaroo.model.Cart();
        ita.kangaroo.model.tipo tipo8 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean9 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo8);
        java.lang.String str10 = prodottoBean9.getDescrizione();
        java.lang.String str11 = prodottoBean9.getNome();
        int int12 = prodottoBean9.getQuantita();
        prodottoBean9.setDescrizione("hi!");
        cart0.addProduct(prodottoBean9);
        ita.kangaroo.model.tipo tipo16 = null;
        prodottoBean9.setTipo(tipo16);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        int int2 = orderProductBean0.getId_ordine();
        orderProductBean0.setQuantita((int) 'a');
        int int5 = orderProductBean0.getId_ordine();
        orderProductBean0.setId_ordine(100);
        int int8 = orderProductBean0.getQuantita();
        orderProductBean0.setId_prodotto(1);
        orderProductBean0.setPrezzo((float) (byte) 100);
        float float13 = orderProductBean0.getPrezzo();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 100.0f + "'", float13 == 100.0f);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
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
        java.util.ArrayList<ita.kangaroo.model.OrderProductBean> orderProductBeanList38 = ordineBean12.getProducts();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(date37);
        org.junit.Assert.assertNull(orderProductBeanList38);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        utenteBean11.setEmail("hi!");
        java.lang.String str14 = utenteBean11.getCognome();
        ita.kangaroo.model.tipo tipo15 = utenteBean11.getTipo();
        java.lang.Class<?> wildcardClass16 = utenteBean11.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(tipo15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        ita.kangaroo.model.tipo tipo19 = null;
        ita.kangaroo.model.utenteBean utenteBean25 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo19, "hi!", "", "", "hi!", "");
        utenteBean25.setEmail("hi!");
        ordineBean12.setClient(utenteBean25);
        ordineBean12.setDestinatario("");
        int int31 = ordineBean12.getId();
        ordineBean12.setId((int) 'a');
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getImmagine();
        prodottoBean8.setPrezzo((float) (-1L));
        int int12 = prodottoBean8.getId();
        prodottoBean8.setPrezzo(10.0f);
        prodottoBean8.setPrezzo(0.0f);
        prodottoBean8.setNome("Data non disponibile");
        ita.kangaroo.model.tipo tipo19 = prodottoBean8.getTipo();
        int int20 = prodottoBean8.getQuantita();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(tipo19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        ordineBean12.setIndirizzo_di_spedizione("Data non disponibile");
        ordineBean12.setPrezzo_totale((float) (byte) 10);
        java.lang.String str17 = ordineBean12.getCircuito();
        java.lang.String str18 = ordineBean12.getIndirizzo_di_spedizione();
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Data non disponibile" + "'", str18, "Data non disponibile");
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        int int2 = orderProductBean0.getId_ordine();
        orderProductBean0.setQuantita((int) 'a');
        int int5 = orderProductBean0.getId_ordine();
        float float6 = orderProductBean0.getPrezzo();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
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
        java.lang.String str19 = metodoPagamentoBean0.getCvv();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getImmagine();
        prodottoBean8.setPrezzo((float) (-1L));
        int int12 = prodottoBean8.getId();
        float float13 = prodottoBean8.getIva();
        int int14 = prodottoBean8.getId();
        prodottoBean8.setPrezzo((float) (byte) 10);
        prodottoBean8.setPrezzo(0.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        ordineBean12.setNumero_carta("");
        java.sql.Date date16 = ordineBean12.getData();
        ordineBean12.setMetodo_di_pagamento("");
        ordineBean12.setNumero_di_tracking("");
        java.lang.String str21 = ordineBean12.toString();
        ordineBean12.setDestinatario("");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Data non disponibile" + "'", str21, "Data non disponibile");
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        ita.kangaroo.model.Cart cart0 = new ita.kangaroo.model.Cart();
        ita.kangaroo.model.tipo tipo8 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean9 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo8);
        java.lang.String str10 = prodottoBean9.getImmagine();
        prodottoBean9.setPrezzo((float) (-1L));
        int int13 = prodottoBean9.getId();
        float float14 = prodottoBean9.getIva();
        int int15 = prodottoBean9.getId();
        prodottoBean9.setPrezzo((float) (byte) 10);
        float float18 = prodottoBean9.getIva();
        prodottoBean9.setPrezzo((float) 0L);
        prodottoBean9.setDescrizione("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        cart0.removeProduct(prodottoBean9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 1.0f + "'", float18 == 1.0f);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) -1, "", "", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", (float) ' ', (int) (short) 1, (float) (short) 0, tipo7);
        java.lang.String str9 = prodottoBean8.getNome();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        ita.kangaroo.model.AddressBean addressBean0 = new ita.kangaroo.model.AddressBean();
        addressBean0.setVia("hi!");
        addressBean0.setUsername("");
        addressBean0.setId((int) '#');
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("", "hi!", "", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", tipo5, "", "hi!", "", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "");
        java.lang.String str12 = utenteBean11.getCognome();
        java.lang.String str13 = utenteBean11.getTelefono();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}" + "'", str13, "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        ita.kangaroo.model.AddressBean addressBean0 = new ita.kangaroo.model.AddressBean();
        java.lang.String str1 = addressBean0.getVia();
        java.lang.String str2 = addressBean0.getUsername();
        java.lang.String str3 = addressBean0.getCAP();
        java.lang.String str4 = addressBean0.getUsername();
        addressBean0.setId(10);
        int int7 = addressBean0.getId();
        java.lang.String str8 = addressBean0.getUsername();
        java.lang.String str9 = addressBean0.getUsername();
        addressBean0.setCAP("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        ita.kangaroo.model.tipo tipo6 = null;
        ita.kangaroo.model.utenteBean utenteBean12 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo6, "hi!", "", "", "hi!", "");
        java.lang.String str13 = utenteBean12.getUsername();
        java.lang.String str14 = utenteBean12.getCap();
        java.sql.Date date22 = null;
        ita.kangaroo.model.OrdineBean ordineBean24 = new ita.kangaroo.model.OrdineBean((int) (short) 0, utenteBean12, (float) 10L, "", "Data non disponibile", "hi!", "hi!", "", "", date22, "hi!");
        ordineBean24.setDestinatario("");
        ordineBean24.setIndirizzo_di_spedizione("Data non disponibile");
        java.lang.String str29 = ordineBean24.getNumero_carta();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "", "", "hi!", "hi!", "hi!");
        java.lang.String str12 = utenteBean11.getPassword();
        utenteBean11.setProvincia("Data non disponibile");
        utenteBean11.setCognome("hi!");
        java.lang.String str17 = utenteBean11.getPassword();
        java.lang.String str18 = utenteBean11.getProvincia();
        utenteBean11.setCognome("");
        utenteBean11.setCognome("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Data non disponibile" + "'", str18, "Data non disponibile");
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
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
        java.lang.String str49 = ordineBean48.toString();
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(orderProductBeanList46);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Data non disponibile" + "'", str49, "Data non disponibile");
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 10, "hi!", "", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", (float) (-1), (int) (byte) 100, (float) (byte) 0, tipo7);
        float float9 = prodottoBean8.getIva();
        int int10 = prodottoBean8.getQuantita();
        float float11 = prodottoBean8.getIva();
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        ita.kangaroo.model.MetodoPagamentoBean metodoPagamentoBean0 = new ita.kangaroo.model.MetodoPagamentoBean();
        metodoPagamentoBean0.setId((int) 'a');
        metodoPagamentoBean0.setCircuito("");
        metodoPagamentoBean0.setCvv("Data non disponibile");
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("Data non disponibile", "Data non disponibile", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "Data non disponibile", "", tipo5, "hi!", "", "hi!", "hi!", "");
        java.lang.String str12 = utenteBean11.getCognome();
        ita.kangaroo.model.tipo tipo13 = null;
        utenteBean11.setTipo(tipo13);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Data non disponibile" + "'", str12, "Data non disponibile");
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        ita.kangaroo.model.AddressBean addressBean0 = new ita.kangaroo.model.AddressBean();
        java.lang.String str1 = addressBean0.getVia();
        java.lang.String str2 = addressBean0.getUsername();
        addressBean0.setUsername("hi!");
        addressBean0.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        addressBean0.setId((int) '4');
        java.lang.String str9 = addressBean0.getVia();
        addressBean0.setCAP("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}" + "'", str9, "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        ita.kangaroo.model.tipo tipo6 = null;
        ita.kangaroo.model.utenteBean utenteBean12 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo6, "hi!", "", "", "hi!", "");
        utenteBean12.setEmail("hi!");
        utenteBean12.setPassword("hi!");
        utenteBean12.setProvincia("hi!");
        utenteBean12.setUsername("hi!");
        utenteBean12.setCognome("hi!");
        java.sql.Date date30 = null;
        ita.kangaroo.model.OrdineBean ordineBean32 = new ita.kangaroo.model.OrdineBean((int) (byte) 10, utenteBean12, (float) (short) 100, "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "hi!", "", "", "hi!", "", date30, "");
        java.lang.String str33 = ordineBean32.getMetodo_di_spedizione();
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        ita.kangaroo.model.Cart cart0 = new ita.kangaroo.model.Cart();
        ita.kangaroo.model.tipo tipo8 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean9 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo8);
        int int10 = prodottoBean9.getId();
        java.lang.String str11 = prodottoBean9.getImmagine();
        cart0.removeProduct(prodottoBean9);
        ita.kangaroo.model.tipo tipo13 = prodottoBean9.getTipo();
        java.lang.String str14 = prodottoBean9.getImmagine();
        ita.kangaroo.model.CartProduct cartProduct16 = new ita.kangaroo.model.CartProduct(prodottoBean9, (int) '#');
        int int17 = cartProduct16.getQuantity();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(tipo13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
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
        java.lang.String str26 = ordineBean12.getNumero_carta();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
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
        ordineBean32.setId((int) ' ');
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNotNull(orderProductBeanList51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        utenteBean11.setEmail("hi!");
        ita.kangaroo.model.OrdineBean ordineBean14 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        ordineBean14.setDestinatario("hi!");
        ordineBean14.setNumero_di_tracking("hi!");
        java.lang.String str19 = ordineBean14.getMetodo_di_pagamento();
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
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
        java.lang.String str16 = metodoPagamentoBean0.getData_scadenza();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getDestinatario();
        java.lang.String str14 = ordineBean12.toString();
        ordineBean12.setPrezzo_totale(10.0f);
        ordineBean12.setPrezzo_totale((float) ' ');
        java.sql.Date date19 = null;
        ordineBean12.setData(date19);
        ordineBean12.setPrezzo_totale(10.0f);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Data non disponibile" + "'", str14, "Data non disponibile");
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
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
        java.lang.String str34 = utenteBean12.getVia();
        org.junit.Assert.assertNull(tipo33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        boolean boolean1 = ita.kangaroo.model.AddressBean.isValidCAP("3a987acf8cbc1028b7dbc86bd086831151899a2b");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "", "", "hi!", "hi!", "hi!");
        java.lang.String str12 = utenteBean11.getUsername();
        utenteBean11.setCap("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        ita.kangaroo.model.OrdineBean ordineBean15 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str16 = utenteBean11.getEmail();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 10, "hi!", "", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", (float) (-1), (int) (byte) 100, (float) (byte) 0, tipo7);
        float float9 = prodottoBean8.getPrezzo();
        java.lang.String str10 = prodottoBean8.toString();
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ProdottoBean{id=10, descrizione='hi!', nome='', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}" + "'", str10, "ProdottoBean{id=10, descrizione='hi!', nome='', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}");
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) -1, "Data non disponibile", "", "", (float) 0, (int) (short) 100, 0.0f, tipo7);
        prodottoBean8.setPrezzo((float) (byte) -1);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        ordineBean12.setId((int) (byte) -1);
        java.lang.String str16 = ordineBean12.getNumero_di_tracking();
        ita.kangaroo.model.utenteBean utenteBean17 = ordineBean12.getClient();
        ordineBean12.setMetodo_di_spedizione("3a987acf8cbc1028b7dbc86bd086831151899a2b");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(utenteBean17);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
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
        utenteBean12.setUsername("ProdottoBean{id=10, descrizione='hi!', nome='', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
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
        java.util.ArrayList<ita.kangaroo.model.OrderProductBean> orderProductBeanList32 = ordineBean12.getProducts();
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(orderProductBeanList31);
        org.junit.Assert.assertNotNull(orderProductBeanList32);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        ita.kangaroo.model.tipo tipo19 = null;
        ita.kangaroo.model.utenteBean utenteBean25 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo19, "hi!", "", "", "hi!", "");
        utenteBean25.setEmail("hi!");
        ordineBean12.setClient(utenteBean25);
        ordineBean12.setDestinatario("");
        ordineBean12.setId(0);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        ordineBean12.setNumero_carta("hi!");
        java.sql.Date date16 = null;
        ordineBean12.setData(date16);
        ordineBean12.setMetodo_di_pagamento("hi!");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        ordineBean12.setNumero_carta("");
        java.sql.Date date16 = ordineBean12.getData();
        java.lang.String str17 = ordineBean12.getIndirizzo_di_spedizione();
        ordineBean12.setId((int) '4');
        ita.kangaroo.model.utenteBean utenteBean20 = ordineBean12.getClient();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(utenteBean20);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getDescrizione();
        java.lang.String str10 = prodottoBean8.getDescrizione();
        ita.kangaroo.model.CartProduct cartProduct11 = new ita.kangaroo.model.CartProduct(prodottoBean8);
        ita.kangaroo.model.ProdottoBean prodottoBean12 = cartProduct11.getProduct();
        cartProduct11.setQuantity(35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(prodottoBean12);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        ita.kangaroo.model.utenteBean utenteBean1 = new ita.kangaroo.model.utenteBean();
        java.lang.String str2 = utenteBean1.getPassword();
        java.sql.Date date10 = null;
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(0, utenteBean1, (float) (short) -1, "Data non disponibile", "", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "Data non disponibile", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", date10, "");
        java.lang.String str13 = utenteBean1.getVia();
        utenteBean1.setProvincia("ProdottoBean{id=10, descrizione='hi!', nome='', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        ordineBean12.setNumero_carta("");
        java.sql.Date date16 = ordineBean12.getData();
        ordineBean12.setMetodo_di_pagamento("");
        ordineBean12.setNumero_di_tracking("");
        ordineBean12.setPrezzo_totale((float) 100L);
        ordineBean12.setNumero_carta("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(date16);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
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
        utenteBean44.setTelefono("ProdottoBean{id=10, descrizione='hi!', nome='', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        float float2 = orderProductBean0.getIVA();
        float float3 = orderProductBean0.getPrezzo();
        float float4 = orderProductBean0.getPrezzo();
        orderProductBean0.setQuantita((int) (byte) 100);
        orderProductBean0.setId_prodotto(35);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        java.util.ArrayList<ita.kangaroo.model.OrderProductBean> orderProductBeanList0 = null;
        ita.kangaroo.model.OrdineBean ordineBean1 = new ita.kangaroo.model.OrdineBean(orderProductBeanList0);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
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
        java.lang.String str43 = addressBean0.getVia();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        java.lang.String str12 = utenteBean11.getVia();
        java.lang.String str13 = utenteBean11.getProvincia();
        java.lang.String str14 = utenteBean11.getNome();
        utenteBean11.setUsername("3a987acf8cbc1028b7dbc86bd086831151899a2b");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        float float2 = orderProductBean0.getIVA();
        orderProductBean0.setIVA((float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        ita.kangaroo.model.AddressBean addressBean0 = new ita.kangaroo.model.AddressBean();
        java.lang.String str1 = addressBean0.getVia();
        java.lang.String str2 = addressBean0.getUsername();
        java.lang.String str3 = addressBean0.getVia();
        addressBean0.setId((int) (short) 1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
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
        java.lang.String str21 = metodoPagamentoBean0.getNumero_carta();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        ita.kangaroo.model.MetodoPagamentoBean metodoPagamentoBean0 = new ita.kangaroo.model.MetodoPagamentoBean();
        metodoPagamentoBean0.setId((int) 'a');
        ita.kangaroo.model.AddressBean addressBean3 = new ita.kangaroo.model.AddressBean();
        java.lang.String str4 = addressBean3.getVia();
        addressBean3.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        addressBean3.setCitta("hi!");
        boolean boolean9 = metodoPagamentoBean0.equals((java.lang.Object) addressBean3);
        java.lang.String str10 = metodoPagamentoBean0.getNumero_carta();
        java.lang.String str11 = metodoPagamentoBean0.getUsername();
        metodoPagamentoBean0.setCvv("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
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
        utenteBean12.setVia("Data non disponibile");
        org.junit.Assert.assertNull(tipo33);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        float float2 = orderProductBean0.getIVA();
        orderProductBean0.setPrezzo(10.0f);
        float float5 = orderProductBean0.getPrezzo();
        orderProductBean0.setQuantita(0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10.0f + "'", float5 == 10.0f);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        utenteBean11.setEmail("hi!");
        ita.kangaroo.model.OrdineBean ordineBean14 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        ordineBean14.setDestinatario("hi!");
        ordineBean14.setNumero_di_tracking("hi!");
        java.lang.String str19 = ordineBean14.getCircuito();
        ordineBean14.setMetodo_di_pagamento("hi!");
        ita.kangaroo.model.tipo tipo27 = null;
        ita.kangaroo.model.utenteBean utenteBean33 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo27, "hi!", "", "", "hi!", "");
        utenteBean33.setEmail("hi!");
        utenteBean33.setPassword("hi!");
        utenteBean33.setProvincia("hi!");
        utenteBean33.setUsername("hi!");
        java.lang.String str42 = utenteBean33.getTelefono();
        utenteBean33.setTelefono("hi!");
        utenteBean33.setEmail("");
        utenteBean33.setEmail("da39a3ee5e6b4b0d3255bfef95601890afd80709");
        ordineBean14.setClient(utenteBean33);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        ita.kangaroo.model.AddressBean addressBean0 = new ita.kangaroo.model.AddressBean();
        java.lang.String str1 = addressBean0.getVia();
        java.lang.String str2 = addressBean0.getUsername();
        addressBean0.setUsername("hi!");
        addressBean0.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        boolean boolean8 = addressBean0.equals((java.lang.Object) 10L);
        int int9 = addressBean0.getId();
        java.lang.String str10 = addressBean0.getCAP();
        java.lang.String str11 = addressBean0.getUsername();
        addressBean0.setId((int) '4');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "", "", "hi!", "hi!", "hi!");
        java.lang.String str12 = utenteBean11.getPassword();
        java.lang.String str13 = utenteBean11.getPassword();
        utenteBean11.setUsername("");
        utenteBean11.setCognome("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) '4', "hi!", "Data non disponibile", "hi!", (float) 'a', 1, 0.0f, tipo7);
        prodottoBean8.setId(1);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        ita.kangaroo.model.MetodoPagamentoBean metodoPagamentoBean0 = new ita.kangaroo.model.MetodoPagamentoBean();
        metodoPagamentoBean0.setId((int) 'a');
        ita.kangaroo.model.AddressBean addressBean3 = new ita.kangaroo.model.AddressBean();
        java.lang.String str4 = addressBean3.getVia();
        addressBean3.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        addressBean3.setCitta("hi!");
        boolean boolean9 = metodoPagamentoBean0.equals((java.lang.Object) addressBean3);
        java.lang.String str10 = metodoPagamentoBean0.getNumero_carta();
        metodoPagamentoBean0.setCvv("3a987acf8cbc1028b7dbc86bd086831151899a2b");
        java.lang.String str13 = metodoPagamentoBean0.getCircuito();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        ita.kangaroo.model.CartProduct cartProduct10 = new ita.kangaroo.model.CartProduct(prodottoBean8, (int) (short) 100);
        prodottoBean8.setDescrizione("3a987acf8cbc1028b7dbc86bd086831151899a2b");
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        int int2 = orderProductBean0.getId_ordine();
        float float3 = orderProductBean0.getPrezzo();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        ordineBean12.setNumero_carta("");
        java.lang.String str16 = ordineBean12.getIndirizzo_di_spedizione();
        java.lang.String str17 = ordineBean12.getNumero_carta();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
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
        ita.kangaroo.model.ProdottoBean prodottoBean67 = new ita.kangaroo.model.ProdottoBean((int) (byte) 10, "hi!", "", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", (float) (-1), (int) (byte) 100, (float) (byte) 0, tipo66);
        float float68 = prodottoBean67.getIva();
        cart0.changeQuantity(prodottoBean67, (int) (short) 1);
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
        org.junit.Assert.assertTrue("'" + float68 + "' != '" + 0.0f + "'", float68 == 0.0f);
        org.junit.Assert.assertNotNull(cartProductList71);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        ita.kangaroo.model.AddressBean addressBean0 = new ita.kangaroo.model.AddressBean();
        java.lang.String str1 = addressBean0.getVia();
        java.lang.String str2 = addressBean0.getUsername();
        addressBean0.setUsername("hi!");
        addressBean0.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        java.lang.String str7 = addressBean0.getCitta();
        java.lang.String str8 = addressBean0.getUsername();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        ita.kangaroo.model.CartProduct cartProduct10 = new ita.kangaroo.model.CartProduct(prodottoBean8, (int) (short) 100);
        ita.kangaroo.model.tipo tipo11 = null;
        prodottoBean8.setTipo(tipo11);
        java.lang.String str13 = prodottoBean8.getImmagine();
        int int14 = prodottoBean8.getId();
        prodottoBean8.setIva((float) (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
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
        ordineBean81.setIndirizzo_di_spedizione("hi!");
        java.lang.String str86 = ordineBean81.getNumero_di_tracking();
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
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "hi!", "", "", "hi!", tipo5, "", "", "Data non disponibile", "", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        ita.kangaroo.model.tipo tipo12 = utenteBean11.getTipo();
        org.junit.Assert.assertNull(tipo12);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        int int2 = orderProductBean0.getId_ordine();
        orderProductBean0.setQuantita((int) 'a');
        int int5 = orderProductBean0.getId_ordine();
        int int6 = orderProductBean0.getId_ordine();
        float float7 = orderProductBean0.getPrezzo();
        orderProductBean0.setId_prodotto((int) (byte) 1);
        int int10 = orderProductBean0.getId_ordine();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        utenteBean11.setEmail("hi!");
        utenteBean11.setPassword("hi!");
        ita.kangaroo.model.tipo tipo16 = null;
        utenteBean11.setTipo(tipo16);
        java.lang.String str18 = utenteBean11.getCitta();
        java.lang.String str19 = utenteBean11.getProvincia();
        utenteBean11.setVia("");
        utenteBean11.setEmail("Data non disponibile");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
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
        java.sql.Date date84 = ordineBean81.getData();
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
        org.junit.Assert.assertNull(date84);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        ita.kangaroo.model.tipo tipo6 = null;
        ita.kangaroo.model.utenteBean utenteBean12 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo6, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean13 = new ita.kangaroo.model.OrdineBean(utenteBean12);
        java.lang.String str14 = ordineBean13.getMetodo_di_spedizione();
        java.util.ArrayList<ita.kangaroo.model.OrderProductBean> orderProductBeanList15 = ordineBean13.getProducts();
        ordineBean13.setNumero_carta("hi!");
        ita.kangaroo.model.tipo tipo23 = null;
        ita.kangaroo.model.utenteBean utenteBean29 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo23, "hi!", "", "", "hi!", "");
        utenteBean29.setEmail("hi!");
        java.lang.String str32 = utenteBean29.getCognome();
        utenteBean29.setCitta("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        ordineBean13.setClient(utenteBean29);
        java.sql.Date date43 = null;
        ita.kangaroo.model.OrdineBean ordineBean45 = new ita.kangaroo.model.OrdineBean((int) '4', utenteBean29, (float) 100, "hi!", "hi!", "3a987acf8cbc1028b7dbc86bd086831151899a2b", "da39a3ee5e6b4b0d3255bfef95601890afd80709", "da39a3ee5e6b4b0d3255bfef95601890afd80709", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", date43, "ProdottoBean{id=10, descrizione='hi!', nome='', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(orderProductBeanList15);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        ita.kangaroo.model.utenteBean utenteBean0 = new ita.kangaroo.model.utenteBean();
        java.lang.String str1 = utenteBean0.getPassword();
        java.lang.String str2 = utenteBean0.getUsername();
        utenteBean0.setCap("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        java.lang.Class<?> wildcardClass5 = utenteBean0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        utenteBean11.setEmail("hi!");
        utenteBean11.setPassword("hi!");
        utenteBean11.setProvincia("hi!");
        utenteBean11.setUsername("hi!");
        utenteBean11.setCognome("hi!");
        ita.kangaroo.model.tipo tipo22 = utenteBean11.getTipo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass23 = tipo22.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(tipo22);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
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
        int int84 = ordineBean81.getId();
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
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        ita.kangaroo.model.AddressBean addressBean0 = new ita.kangaroo.model.AddressBean();
        java.lang.String str1 = addressBean0.getVia();
        java.lang.String str2 = addressBean0.getUsername();
        addressBean0.setUsername("hi!");
        addressBean0.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        boolean boolean8 = addressBean0.equals((java.lang.Object) 10L);
        int int9 = addressBean0.getId();
        java.lang.String str10 = addressBean0.getCAP();
        java.lang.String str11 = addressBean0.getCAP();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        ordineBean12.setNumero_carta("");
        java.sql.Date date16 = ordineBean12.getData();
        ita.kangaroo.model.utenteBean utenteBean17 = ordineBean12.getClient();
        utenteBean17.setEmail("hi!");
        java.lang.String str20 = utenteBean17.getPassword();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertNotNull(utenteBean17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        ita.kangaroo.model.AddressBean addressBean0 = new ita.kangaroo.model.AddressBean();
        java.lang.String str1 = addressBean0.getVia();
        java.lang.String str2 = addressBean0.getUsername();
        addressBean0.setUsername("hi!");
        addressBean0.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        addressBean0.setUsername("hi!");
        java.lang.String str9 = addressBean0.getCAP();
        java.lang.String str10 = addressBean0.getUsername();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getImmagine();
        prodottoBean8.setPrezzo((float) (-1L));
        int int12 = prodottoBean8.getId();
        prodottoBean8.setPrezzo(10.0f);
        prodottoBean8.setPrezzo(0.0f);
        prodottoBean8.setNome("Data non disponibile");
        ita.kangaroo.model.tipo tipo19 = prodottoBean8.getTipo();
        prodottoBean8.setNome("");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(tipo19);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
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
        ordineBean82.setIndirizzo_di_spedizione("");
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
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        ordineBean12.setNumero_carta("");
        java.sql.Date date16 = ordineBean12.getData();
        ita.kangaroo.model.utenteBean utenteBean17 = ordineBean12.getClient();
        ita.kangaroo.model.tipo tipo18 = utenteBean17.getTipo();
        java.lang.String str19 = utenteBean17.getEmail();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertNotNull(utenteBean17);
        org.junit.Assert.assertNull(tipo18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "", "", "hi!", "hi!", "hi!");
        java.lang.String str12 = utenteBean11.getPassword();
        utenteBean11.setProvincia("Data non disponibile");
        java.lang.String str15 = utenteBean11.getCognome();
        java.lang.String str16 = utenteBean11.getCap();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
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
        java.lang.String str35 = utenteBean28.getProvincia();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(orderProductBeanList14);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        ita.kangaroo.model.tipo tipo6 = null;
        ita.kangaroo.model.utenteBean utenteBean12 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo6, "hi!", "", "", "hi!", "");
        java.lang.String str13 = utenteBean12.getUsername();
        java.lang.String str14 = utenteBean12.getCap();
        java.sql.Date date22 = null;
        ita.kangaroo.model.OrdineBean ordineBean24 = new ita.kangaroo.model.OrdineBean((int) (short) 0, utenteBean12, (float) 10L, "", "Data non disponibile", "hi!", "hi!", "", "", date22, "hi!");
        utenteBean12.setEmail("Data non disponibile");
        ita.kangaroo.model.OrdineBean ordineBean27 = new ita.kangaroo.model.OrdineBean(utenteBean12);
        java.lang.String str28 = utenteBean12.getVia();
        utenteBean12.setProvincia("Data non disponibile");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getImmagine();
        int int10 = prodottoBean8.getQuantita();
        java.lang.String str11 = prodottoBean8.getImmagine();
        ita.kangaroo.model.CartProduct cartProduct12 = new ita.kangaroo.model.CartProduct(prodottoBean8);
        prodottoBean8.setId((int) (short) 0);
        prodottoBean8.setId((int) (byte) 1);
        ita.kangaroo.model.CartProduct cartProduct17 = new ita.kangaroo.model.CartProduct(prodottoBean8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 10, "hi!", "", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", (float) (-1), (int) (byte) 100, (float) (byte) 0, tipo7);
        prodottoBean8.setIva((float) (byte) 1);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
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
        java.lang.String str34 = utenteBean29.getCap();
        java.lang.String str35 = utenteBean29.getCitta();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        ordineBean12.setNumero_carta("hi!");
        ordineBean12.setIndirizzo_di_spedizione("hi!");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        ita.kangaroo.model.tipo tipo19 = null;
        ita.kangaroo.model.utenteBean utenteBean25 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo19, "hi!", "", "", "hi!", "");
        utenteBean25.setEmail("hi!");
        ordineBean12.setClient(utenteBean25);
        ordineBean12.setDestinatario("");
        int int31 = ordineBean12.getId();
        java.sql.Date date32 = null;
        ordineBean12.setData(date32);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
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
        prodottoBean49.setPrezzo((float) 10L);
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
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        ordineBean12.setNumero_carta("hi!");
        float float16 = ordineBean12.getPrezzo_totale();
        java.lang.String str17 = ordineBean12.getDestinatario();
        java.lang.String str18 = ordineBean12.getNumero_carta();
        java.lang.String str19 = ordineBean12.getMetodo_di_pagamento();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        ita.kangaroo.model.MetodoPagamentoBean metodoPagamentoBean0 = new ita.kangaroo.model.MetodoPagamentoBean();
        metodoPagamentoBean0.setId((int) 'a');
        metodoPagamentoBean0.setCircuito("");
        java.lang.String str5 = metodoPagamentoBean0.getCvv();
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        orderProductBean0.setQuantita((int) (byte) 100);
        float float4 = orderProductBean0.getPrezzo();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        ita.kangaroo.model.MetodoPagamentoBean metodoPagamentoBean0 = new ita.kangaroo.model.MetodoPagamentoBean();
        metodoPagamentoBean0.setId((int) 'a');
        ita.kangaroo.model.AddressBean addressBean3 = new ita.kangaroo.model.AddressBean();
        java.lang.String str4 = addressBean3.getVia();
        addressBean3.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        addressBean3.setCitta("hi!");
        boolean boolean9 = metodoPagamentoBean0.equals((java.lang.Object) addressBean3);
        metodoPagamentoBean0.setUsername("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        metodoPagamentoBean0.setId(0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
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
        java.lang.String str19 = metodoPagamentoBean0.getUsername();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
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
        utenteBean25.setCognome("");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertNotNull(utenteBean25);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
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
        java.lang.String str14 = metodoPagamentoBean0.getCvv();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
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
        float float55 = prodottoBean41.getPrezzo();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + float55 + "' != '" + 0.0f + "'", float55 == 0.0f);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        ita.kangaroo.model.Cart cart0 = new ita.kangaroo.model.Cart();
        ita.kangaroo.model.tipo tipo8 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean9 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo8);
        java.lang.String str10 = prodottoBean9.getImmagine();
        prodottoBean9.setPrezzo((float) (-1L));
        cart0.changeQuantity(prodottoBean9, 97);
        ita.kangaroo.model.tipo tipo22 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean23 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo22);
        java.lang.String str24 = prodottoBean23.getDescrizione();
        prodottoBean23.setImmagine("");
        java.lang.String str27 = prodottoBean23.toString();
        cart0.removeProduct(prodottoBean23);
        ita.kangaroo.model.tipo tipo36 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean37 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo36);
        java.lang.String str38 = prodottoBean37.getImmagine();
        prodottoBean37.setPrezzo((float) (-1L));
        int int41 = prodottoBean37.getId();
        java.lang.String str42 = prodottoBean37.getNome();
        cart0.removeProduct(prodottoBean37);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}" + "'", str27, "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        ita.kangaroo.model.tipo tipo6 = null;
        ita.kangaroo.model.utenteBean utenteBean12 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo6, "hi!", "", "", "hi!", "");
        java.lang.String str13 = utenteBean12.getUsername();
        java.lang.String str14 = utenteBean12.getCap();
        java.sql.Date date22 = null;
        ita.kangaroo.model.OrdineBean ordineBean24 = new ita.kangaroo.model.OrdineBean((int) (short) 0, utenteBean12, (float) 10L, "", "Data non disponibile", "hi!", "hi!", "", "", date22, "hi!");
        utenteBean12.setEmail("Data non disponibile");
        java.lang.String str27 = utenteBean12.getUsername();
        ita.kangaroo.model.tipo tipo28 = null;
        utenteBean12.setTipo(tipo28);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        ita.kangaroo.model.tipo tipo18 = null;
        ita.kangaroo.model.utenteBean utenteBean24 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo18, "hi!", "", "", "hi!", "");
        utenteBean24.setEmail("hi!");
        utenteBean24.setPassword("hi!");
        java.lang.String str29 = utenteBean24.getCognome();
        ordineBean12.setClient(utenteBean24);
        java.lang.String str31 = utenteBean24.getVia();
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        ita.kangaroo.model.MetodoPagamentoBean metodoPagamentoBean0 = new ita.kangaroo.model.MetodoPagamentoBean();
        metodoPagamentoBean0.setId((int) 'a');
        ita.kangaroo.model.AddressBean addressBean3 = new ita.kangaroo.model.AddressBean();
        java.lang.String str4 = addressBean3.getVia();
        addressBean3.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        addressBean3.setCitta("hi!");
        boolean boolean9 = metodoPagamentoBean0.equals((java.lang.Object) addressBean3);
        java.lang.String str10 = addressBean3.getCitta();
        addressBean3.setUsername("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        int int13 = addressBean3.getId();
        java.lang.String str14 = addressBean3.getUsername();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}" + "'", str14, "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
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
        addressBean0.setCAP("hi!");
        addressBean0.setUsername("hi!");
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
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getDescrizione();
        java.lang.String str10 = prodottoBean8.getDescrizione();
        ita.kangaroo.model.CartProduct cartProduct11 = new ita.kangaroo.model.CartProduct(prodottoBean8);
        java.lang.String str12 = prodottoBean8.getNome();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "", "", "hi!", "hi!", "hi!");
        java.lang.String str12 = utenteBean11.getPassword();
        java.lang.String str13 = utenteBean11.getPassword();
        utenteBean11.setUsername("");
        java.lang.String str16 = utenteBean11.getPassword();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
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
        utenteBean28.setNome("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(orderProductBeanList14);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
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
        ordineBean12.setNumero_di_tracking("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        ita.kangaroo.model.MetodoPagamentoBean metodoPagamentoBean0 = new ita.kangaroo.model.MetodoPagamentoBean();
        metodoPagamentoBean0.setId((int) 'a');
        metodoPagamentoBean0.setCircuito("Data non disponibile");
        metodoPagamentoBean0.setData_scadenza("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        metodoPagamentoBean0.setId(0);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (short) 1, "hi!", "", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", (float) 1L, (int) (short) -1, (float) 32, tipo7);
        ita.kangaroo.model.CartProduct cartProduct10 = new ita.kangaroo.model.CartProduct(prodottoBean8, (int) ' ');
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getDestinatario();
        java.lang.String str14 = ordineBean12.toString();
        ordineBean12.setPrezzo_totale(10.0f);
        ordineBean12.setPrezzo_totale((float) ' ');
        ordineBean12.setIndirizzo_di_spedizione("hi!");
        java.lang.String str21 = ordineBean12.getCircuito();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Data non disponibile" + "'", str14, "Data non disponibile");
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) -1, "Data non disponibile", "Data non disponibile", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", (float) ' ', (int) ' ', (float) ' ', tipo7);
        java.lang.String str9 = prodottoBean8.getImmagine();
        int int10 = prodottoBean8.getQuantita();
        prodottoBean8.setIva((float) '4');
        prodottoBean8.setNome("");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}" + "'", str9, "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        ita.kangaroo.model.ProdottoBean prodottoBean0 = null;
        ita.kangaroo.model.CartProduct cartProduct2 = new ita.kangaroo.model.CartProduct(prodottoBean0, (int) (byte) 10);
        cartProduct2.setQuantity((int) (short) 100);
        int int5 = cartProduct2.getQuantity();
        cartProduct2.setQuantity(32);
        int int8 = cartProduct2.getQuantity();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        java.util.ArrayList<ita.kangaroo.model.OrderProductBean> orderProductBeanList14 = ordineBean12.getProducts();
        float float15 = ordineBean12.getPrezzo_totale();
        java.lang.String str16 = ordineBean12.getMetodo_di_pagamento();
        java.sql.Date date17 = null;
        ordineBean12.setData(date17);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(orderProductBeanList14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.0f + "'", float15 == 0.0f);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        ita.kangaroo.model.AddressBean addressBean0 = new ita.kangaroo.model.AddressBean();
        java.lang.String str1 = addressBean0.getVia();
        java.lang.String str2 = addressBean0.getUsername();
        addressBean0.setUsername("hi!");
        addressBean0.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        addressBean0.setCitta("hi!");
        addressBean0.setUsername("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        java.lang.String str11 = addressBean0.getCAP();
        java.lang.String str12 = addressBean0.getVia();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}" + "'", str12, "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        java.util.ArrayList<ita.kangaroo.model.OrderProductBean> orderProductBeanList14 = ordineBean12.getProducts();
        float float15 = ordineBean12.getPrezzo_totale();
        ordineBean12.setMetodo_di_pagamento("");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(orderProductBeanList14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.0f + "'", float15 == 0.0f);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        ita.kangaroo.model.AddressBean addressBean0 = new ita.kangaroo.model.AddressBean();
        java.lang.String str1 = addressBean0.getVia();
        java.lang.String str2 = addressBean0.getUsername();
        java.lang.String str3 = addressBean0.getCAP();
        java.lang.String str4 = addressBean0.getUsername();
        addressBean0.setId(10);
        addressBean0.setUsername("");
        addressBean0.setUsername("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        utenteBean11.setCognome("Data non disponibile");
        utenteBean11.setCognome("3a987acf8cbc1028b7dbc86bd086831151899a2b");
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("Data non disponibile", "Data non disponibile", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "Data non disponibile", "", tipo5, "hi!", "", "hi!", "hi!", "");
        utenteBean11.setCap("ProdottoBean{id=10, descrizione='hi!', nome='', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}");
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        ita.kangaroo.model.utenteBean utenteBean0 = new ita.kangaroo.model.utenteBean();
        java.lang.String str1 = utenteBean0.getPassword();
        java.lang.String str2 = utenteBean0.getUsername();
        utenteBean0.setCap("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        java.lang.String str5 = utenteBean0.getCitta();
        utenteBean0.setNome("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        ita.kangaroo.model.CartProduct cartProduct10 = new ita.kangaroo.model.CartProduct(prodottoBean8, (int) (short) 100);
        int int11 = cartProduct10.getQuantity();
        ita.kangaroo.model.ProdottoBean prodottoBean12 = cartProduct10.getProduct();
        prodottoBean12.setNome("");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(prodottoBean12);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        float float2 = orderProductBean0.getIVA();
        orderProductBean0.setPrezzo(10.0f);
        orderProductBean0.setQuantita((int) (short) -1);
        int int7 = orderProductBean0.getQuantita();
        orderProductBean0.setId_ordine((int) 'a');
        orderProductBean0.setId_prodotto((int) '#');
        int int12 = orderProductBean0.getId_ordine();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "", "", "hi!", "hi!", "hi!");
        java.lang.String str12 = utenteBean11.getUsername();
        utenteBean11.setPassword("");
        utenteBean11.setUsername("hi!");
        java.lang.String str17 = utenteBean11.getCitta();
        utenteBean11.setCitta("3a987acf8cbc1028b7dbc86bd086831151899a2b");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.utenteBean utenteBean13 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo7, "hi!", "", "", "hi!", "");
        utenteBean13.setEmail("hi!");
        java.lang.String str16 = utenteBean13.getCognome();
        java.sql.Date date24 = null;
        ita.kangaroo.model.OrdineBean ordineBean26 = new ita.kangaroo.model.OrdineBean((int) (byte) 10, utenteBean13, (float) (-1L), "Data non disponibile", "Data non disponibile", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "hi!", "hi!", "", date24, "Data non disponibile");
        ita.kangaroo.model.tipo tipo27 = utenteBean13.getTipo();
        java.sql.Date date35 = null;
        ita.kangaroo.model.OrdineBean ordineBean37 = new ita.kangaroo.model.OrdineBean(1, utenteBean13, (float) 0L, "", "Data non disponibile", "hi!", "hi!", "", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", date35, "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        int int38 = ordineBean37.getId();
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(tipo27);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        ita.kangaroo.model.MetodoPagamentoBean metodoPagamentoBean0 = new ita.kangaroo.model.MetodoPagamentoBean();
        metodoPagamentoBean0.setId((int) 'a');
        java.lang.String str3 = metodoPagamentoBean0.getUsername();
        java.lang.String str4 = metodoPagamentoBean0.getCircuito();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        utenteBean11.setEmail("hi!");
        utenteBean11.setPassword("hi!");
        utenteBean11.setProvincia("hi!");
        utenteBean11.setProvincia("hi!");
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        float float2 = orderProductBean0.getIVA();
        orderProductBean0.setPrezzo(10.0f);
        float float5 = orderProductBean0.getPrezzo();
        orderProductBean0.setIVA((float) 10);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10.0f + "'", float5 == 10.0f);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
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
        float float33 = ordineBean12.getPrezzo_totale();
        ordineBean12.setNumero_carta("ProdottoBean{id=10, descrizione='hi!', nome='', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 0.0f + "'", float33 == 0.0f);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
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
        ita.kangaroo.model.tipo tipo56 = prodottoBean49.getTipo();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 1.0f + "'", float35 == 1.0f);
        org.junit.Assert.assertNull(tipo38);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNull(tipo56);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        int int2 = orderProductBean0.getId_ordine();
        orderProductBean0.setQuantita((int) 'a');
        int int5 = orderProductBean0.getId_prodotto();
        float float6 = orderProductBean0.getPrezzo();
        orderProductBean0.setPrezzo((float) '#');
        orderProductBean0.setPrezzo((float) 1L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        ita.kangaroo.model.AddressBean addressBean0 = new ita.kangaroo.model.AddressBean();
        java.lang.String str1 = addressBean0.getVia();
        java.lang.String str2 = addressBean0.getUsername();
        addressBean0.setUsername("hi!");
        addressBean0.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        addressBean0.setCitta("hi!");
        addressBean0.setUsername("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        int int11 = addressBean0.getId();
        addressBean0.setId((int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
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
        java.lang.String str43 = addressBean0.getCAP();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        java.lang.String str12 = utenteBean11.getVia();
        utenteBean11.setProvincia("");
        ita.kangaroo.model.tipo tipo15 = null;
        utenteBean11.setTipo(tipo15);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        ita.kangaroo.model.AddressBean addressBean5 = new ita.kangaroo.model.AddressBean(100, "Data non disponibile", "Data non disponibile", "Data non disponibile", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        int int6 = addressBean5.getId();
        int int7 = addressBean5.getId();
        java.lang.String str8 = addressBean5.getCitta();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Data non disponibile" + "'", str8, "Data non disponibile");
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        ita.kangaroo.model.Cart cart0 = new ita.kangaroo.model.Cart();
        ita.kangaroo.model.tipo tipo8 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean9 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo8);
        java.lang.String str10 = prodottoBean9.getDescrizione();
        java.lang.String str11 = prodottoBean9.getNome();
        int int12 = prodottoBean9.getQuantita();
        prodottoBean9.setDescrizione("hi!");
        cart0.addProduct(prodottoBean9);
        ita.kangaroo.model.Cart cart16 = new ita.kangaroo.model.Cart();
        ita.kangaroo.model.tipo tipo24 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean25 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo24);
        java.lang.String str26 = prodottoBean25.getImmagine();
        prodottoBean25.setPrezzo((float) (-1L));
        int int29 = prodottoBean25.getId();
        prodottoBean25.setPrezzo(10.0f);
        prodottoBean25.setPrezzo(0.0f);
        prodottoBean25.setNome("Data non disponibile");
        cart16.changeQuantity(prodottoBean25, (int) '4');
        ita.kangaroo.model.tipo tipo45 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean46 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo45);
        java.lang.String str47 = prodottoBean46.getImmagine();
        prodottoBean46.setPrezzo((float) (-1L));
        int int50 = prodottoBean46.getId();
        float float51 = prodottoBean46.getIva();
        prodottoBean46.setQuantita((int) ' ');
        ita.kangaroo.model.tipo tipo54 = prodottoBean46.getTipo();
        cart16.changeQuantity(prodottoBean46, (int) (short) 100);
        ita.kangaroo.model.tipo tipo64 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean65 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo64);
        java.lang.String str66 = prodottoBean65.getImmagine();
        prodottoBean65.setPrezzo((float) (-1L));
        int int69 = prodottoBean65.getId();
        float float70 = prodottoBean65.getIva();
        prodottoBean65.setQuantita((int) ' ');
        ita.kangaroo.model.tipo tipo73 = prodottoBean65.getTipo();
        cart16.removeProduct(prodottoBean65);
        ita.kangaroo.model.tipo tipo82 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean83 = new ita.kangaroo.model.ProdottoBean((int) (byte) 10, "hi!", "", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", (float) (-1), (int) (byte) 100, (float) (byte) 0, tipo82);
        float float84 = prodottoBean83.getIva();
        cart16.changeQuantity(prodottoBean83, (int) (short) 1);
        cart0.changeQuantity(prodottoBean83, (int) (short) 10);
        java.lang.String str89 = prodottoBean83.getNome();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + float51 + "' != '" + 1.0f + "'", float51 == 1.0f);
        org.junit.Assert.assertNull(tipo54);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi!" + "'", str66, "hi!");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
        org.junit.Assert.assertTrue("'" + float70 + "' != '" + 1.0f + "'", float70 == 1.0f);
        org.junit.Assert.assertNull(tipo73);
        org.junit.Assert.assertTrue("'" + float84 + "' != '" + 0.0f + "'", float84 == 0.0f);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
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
        java.lang.String str24 = prodottoBean21.getNome();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getImmagine();
        prodottoBean8.setPrezzo((float) (-1L));
        int int12 = prodottoBean8.getId();
        float float13 = prodottoBean8.getIva();
        int int14 = prodottoBean8.getId();
        prodottoBean8.setImmagine("Data non disponibile");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        ita.kangaroo.model.AddressBean addressBean5 = new ita.kangaroo.model.AddressBean(100, "Data non disponibile", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "", "hi!");
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        utenteBean11.setEmail("hi!");
        utenteBean11.setPassword("hi!");
        utenteBean11.setCognome("Data non disponibile");
        utenteBean11.setTelefono("Data non disponibile");
        java.lang.String str20 = utenteBean11.getCap();
        utenteBean11.setCognome("hi!");
        ita.kangaroo.model.tipo tipo23 = utenteBean11.getTipo();
        ita.kangaroo.model.tipo tipo24 = utenteBean11.getTipo();
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(tipo23);
        org.junit.Assert.assertNull(tipo24);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        ita.kangaroo.model.tipo tipo6 = null;
        ita.kangaroo.model.utenteBean utenteBean12 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo6, "hi!", "", "", "hi!", "");
        utenteBean12.setEmail("hi!");
        java.lang.String str15 = utenteBean12.getCognome();
        utenteBean12.setCitta("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        utenteBean12.setUsername("Data non disponibile");
        java.sql.Date date27 = null;
        ita.kangaroo.model.OrdineBean ordineBean29 = new ita.kangaroo.model.OrdineBean(0, utenteBean12, (float) (byte) 0, "", "", "Data non disponibile", "Data non disponibile", "hi!", "", date27, "Data non disponibile");
        utenteBean12.setCognome("Data non disponibile");
        java.lang.String str32 = utenteBean12.getCap();
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
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
        int int34 = ordineBean29.getId();
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getDestinatario();
        java.lang.String str14 = ordineBean12.getCircuito();
        java.sql.Date date15 = ordineBean12.getData();
        ordineBean12.setNumero_carta("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        java.util.ArrayList<ita.kangaroo.model.OrderProductBean> orderProductBeanList18 = ordineBean12.getProducts();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(date15);
        org.junit.Assert.assertNotNull(orderProductBeanList18);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("", "hi!", "", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", tipo5, "", "hi!", "", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "");
        ita.kangaroo.model.tipo tipo12 = null;
        utenteBean11.setTipo(tipo12);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        ita.kangaroo.model.AddressBean addressBean0 = new ita.kangaroo.model.AddressBean();
        java.lang.String str1 = addressBean0.getVia();
        java.lang.String str2 = addressBean0.getUsername();
        addressBean0.setUsername("hi!");
        addressBean0.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        addressBean0.setId((int) '4');
        java.lang.String str9 = addressBean0.getVia();
        addressBean0.setId(0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}" + "'", str9, "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getDescrizione();
        prodottoBean8.setImmagine("");
        java.lang.String str12 = prodottoBean8.toString();
        float float13 = prodottoBean8.getIva();
        prodottoBean8.setIva(0.0f);
        float float16 = prodottoBean8.getPrezzo();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}" + "'", str12, "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
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
        prodottoBean49.setQuantita((int) ' ');
        ita.kangaroo.model.tipo tipo61 = prodottoBean49.getTipo();
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
        org.junit.Assert.assertNull(tipo61);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
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
        java.lang.String str27 = utenteBean11.getUsername();
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        java.lang.String str12 = utenteBean11.getProvincia();
        utenteBean11.setPassword("3a987acf8cbc1028b7dbc86bd086831151899a2b");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        ita.kangaroo.model.ProdottoBean prodottoBean0 = new ita.kangaroo.model.ProdottoBean();
        prodottoBean0.setDescrizione("hi!");
        prodottoBean0.setId((int) (short) 100);
        float float5 = prodottoBean0.getIva();
        java.lang.String str6 = prodottoBean0.getImmagine();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "", "", "hi!", "hi!", "hi!");
        java.lang.String str12 = utenteBean11.getPassword();
        java.lang.String str13 = utenteBean11.getPassword();
        utenteBean11.setUsername("");
        java.lang.Class<?> wildcardClass16 = utenteBean11.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        ita.kangaroo.model.CartProduct cartProduct10 = new ita.kangaroo.model.CartProduct(prodottoBean8, (int) (short) 100);
        ita.kangaroo.model.tipo tipo11 = null;
        prodottoBean8.setTipo(tipo11);
        prodottoBean8.setImmagine("da39a3ee5e6b4b0d3255bfef95601890afd80709");
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        float float2 = orderProductBean0.getIVA();
        orderProductBean0.setPrezzo(10.0f);
        orderProductBean0.setQuantita((int) (short) -1);
        orderProductBean0.setQuantita(32);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
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
        utenteBean24.setPassword("hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "3a987acf8cbc1028b7dbc86bd086831151899a2b" + "'", str34, "3a987acf8cbc1028b7dbc86bd086831151899a2b");
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        float float2 = orderProductBean0.getIVA();
        orderProductBean0.setPrezzo(10.0f);
        float float5 = orderProductBean0.getPrezzo();
        float float6 = orderProductBean0.getPrezzo();
        orderProductBean0.setId_ordine(1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10.0f + "'", float5 == 10.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
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
        java.lang.String str14 = metodoPagamentoBean0.getUsername();
        java.lang.String str15 = metodoPagamentoBean0.getData_scadenza();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        int int2 = orderProductBean0.getId_ordine();
        orderProductBean0.setQuantita((int) 'a');
        int int5 = orderProductBean0.getId_ordine();
        orderProductBean0.setId_ordine(100);
        int int8 = orderProductBean0.getQuantita();
        orderProductBean0.setId_prodotto(1);
        orderProductBean0.setPrezzo((float) (byte) 100);
        orderProductBean0.setId_prodotto((int) (short) 100);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        utenteBean11.setPassword("hi!");
        ita.kangaroo.model.tipo tipo15 = utenteBean11.getTipo();
        org.junit.Assert.assertNull(tipo15);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
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
        java.lang.String str32 = ordineBean12.getMetodo_di_pagamento();
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        ita.kangaroo.model.AddressBean addressBean0 = new ita.kangaroo.model.AddressBean();
        java.lang.String str1 = addressBean0.getVia();
        java.lang.String str2 = addressBean0.getUsername();
        addressBean0.setUsername("hi!");
        addressBean0.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        addressBean0.setCitta("hi!");
        addressBean0.setCitta("hi!");
        java.lang.String str11 = addressBean0.getCAP();
        addressBean0.setUsername("hi!");
        addressBean0.setId((int) '4');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "", "", "hi!", "hi!", "hi!");
        java.lang.String str12 = utenteBean11.getPassword();
        java.lang.String str13 = utenteBean11.getPassword();
        java.lang.String str14 = utenteBean11.getEmail();
        java.lang.String str15 = utenteBean11.getNome();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        float float2 = orderProductBean0.getIVA();
        orderProductBean0.setPrezzo(10.0f);
        float float5 = orderProductBean0.getPrezzo();
        float float6 = orderProductBean0.getPrezzo();
        float float7 = orderProductBean0.getIVA();
        orderProductBean0.setIVA((float) ' ');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10.0f + "'", float5 == 10.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        ita.kangaroo.model.tipo tipo19 = null;
        ita.kangaroo.model.utenteBean utenteBean25 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo19, "hi!", "", "", "hi!", "");
        utenteBean25.setEmail("hi!");
        ordineBean12.setClient(utenteBean25);
        ordineBean12.setNumero_carta("");
        java.lang.String str31 = ordineBean12.getCircuito();
        ordineBean12.setMetodo_di_pagamento("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
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
        cartProduct42.setQuantity(32);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 1.0f + "'", float35 == 1.0f);
        org.junit.Assert.assertNull(tipo38);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        ita.kangaroo.model.AddressBean addressBean0 = new ita.kangaroo.model.AddressBean();
        java.lang.String str1 = addressBean0.getVia();
        java.lang.String str2 = addressBean0.getUsername();
        addressBean0.setUsername("hi!");
        addressBean0.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        boolean boolean8 = addressBean0.equals((java.lang.Object) 10L);
        int int9 = addressBean0.getId();
        java.lang.String str10 = addressBean0.getUsername();
        int int11 = addressBean0.getId();
        java.lang.String str12 = addressBean0.getUsername();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        ordineBean12.setNumero_carta("");
        java.sql.Date date16 = ordineBean12.getData();
        float float17 = ordineBean12.getPrezzo_totale();
        ordineBean12.setPrezzo_totale(0.0f);
        ordineBean12.setNumero_di_tracking("da39a3ee5e6b4b0d3255bfef95601890afd80709");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.0f + "'", float17 == 0.0f);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        float float2 = orderProductBean0.getIVA();
        orderProductBean0.setPrezzo(10.0f);
        orderProductBean0.setIVA((float) 32);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
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
        java.lang.String str29 = metodoPagamentoBean0.getCircuito();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}" + "'", str29, "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        java.lang.String str12 = utenteBean11.getUsername();
        java.lang.String str13 = utenteBean11.getCap();
        utenteBean11.setCognome("hi!");
        java.lang.String str16 = utenteBean11.getTelefono();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
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
        ordineBean12.setNumero_carta("hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(date37);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        ita.kangaroo.model.AddressBean addressBean0 = new ita.kangaroo.model.AddressBean();
        java.lang.String str1 = addressBean0.getVia();
        java.lang.String str2 = addressBean0.getUsername();
        java.lang.String str3 = addressBean0.getCAP();
        java.lang.String str4 = addressBean0.getUsername();
        addressBean0.setId(10);
        int int7 = addressBean0.getId();
        addressBean0.setCAP("");
        addressBean0.setVia("3a987acf8cbc1028b7dbc86bd086831151899a2b");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        int int2 = orderProductBean0.getId_ordine();
        orderProductBean0.setQuantita((int) 'a');
        int int5 = orderProductBean0.getId_ordine();
        int int6 = orderProductBean0.getId_ordine();
        orderProductBean0.setId_prodotto(10);
        float float9 = orderProductBean0.getPrezzo();
        int int10 = orderProductBean0.getId_ordine();
        orderProductBean0.setId_prodotto((int) (byte) -1);
        orderProductBean0.setId_prodotto(0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
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
        java.lang.String str34 = utenteBean12.getVia();
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) -1, "", "", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", (float) ' ', (int) (short) 1, (float) (short) 0, tipo7);
        prodottoBean8.setImmagine("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        ita.kangaroo.model.CartProduct cartProduct11 = new ita.kangaroo.model.CartProduct(prodottoBean8);
        cartProduct11.setQuantity((int) ' ');
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        int int2 = orderProductBean0.getId_ordine();
        orderProductBean0.setQuantita((int) 'a');
        int int5 = orderProductBean0.getId_ordine();
        orderProductBean0.setIVA(100.0f);
        int int8 = orderProductBean0.getQuantita();
        float float9 = orderProductBean0.getIVA();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
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
        metodoPagamentoBean0.setCvv("");
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
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        ita.kangaroo.model.MetodoPagamentoBean metodoPagamentoBean0 = new ita.kangaroo.model.MetodoPagamentoBean();
        metodoPagamentoBean0.setId((int) 'a');
        ita.kangaroo.model.AddressBean addressBean3 = new ita.kangaroo.model.AddressBean();
        java.lang.String str4 = addressBean3.getVia();
        addressBean3.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        addressBean3.setCitta("hi!");
        boolean boolean9 = metodoPagamentoBean0.equals((java.lang.Object) addressBean3);
        java.lang.String str10 = addressBean3.getCitta();
        addressBean3.setUsername("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        addressBean3.setUsername("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        boolean boolean16 = addressBean3.equals((java.lang.Object) 100.0d);
        int int17 = addressBean3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
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
        java.lang.String str54 = ordineBean32.getCircuito();
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNotNull(orderProductBeanList51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        ita.kangaroo.model.MetodoPagamentoBean metodoPagamentoBean0 = new ita.kangaroo.model.MetodoPagamentoBean();
        metodoPagamentoBean0.setId((int) 'a');
        ita.kangaroo.model.AddressBean addressBean3 = new ita.kangaroo.model.AddressBean();
        java.lang.String str4 = addressBean3.getVia();
        addressBean3.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        addressBean3.setCitta("hi!");
        boolean boolean9 = metodoPagamentoBean0.equals((java.lang.Object) addressBean3);
        java.lang.String str10 = metodoPagamentoBean0.getNumero_carta();
        java.lang.String str11 = metodoPagamentoBean0.getNumero_carta();
        metodoPagamentoBean0.setCircuito("");
        java.lang.String str14 = metodoPagamentoBean0.getUsername();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        orderProductBean0.setIVA(1.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        ita.kangaroo.model.tipo tipo6 = null;
        ita.kangaroo.model.utenteBean utenteBean12 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo6, "hi!", "", "", "hi!", "");
        utenteBean12.setEmail("hi!");
        java.lang.String str15 = utenteBean12.getCognome();
        java.sql.Date date23 = null;
        ita.kangaroo.model.OrdineBean ordineBean25 = new ita.kangaroo.model.OrdineBean((int) (byte) 10, utenteBean12, (float) (-1L), "Data non disponibile", "Data non disponibile", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "hi!", "hi!", "", date23, "Data non disponibile");
        java.lang.String str26 = ordineBean25.toString();
        java.lang.String str27 = ordineBean25.getIndirizzo_di_spedizione();
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Data non disponibile" + "'", str26, "Data non disponibile");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        ita.kangaroo.model.MetodoPagamentoBean metodoPagamentoBean0 = new ita.kangaroo.model.MetodoPagamentoBean();
        metodoPagamentoBean0.setId((int) 'a');
        ita.kangaroo.model.AddressBean addressBean3 = new ita.kangaroo.model.AddressBean();
        java.lang.String str4 = addressBean3.getVia();
        addressBean3.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        addressBean3.setCitta("hi!");
        boolean boolean9 = metodoPagamentoBean0.equals((java.lang.Object) addressBean3);
        java.lang.String str10 = addressBean3.getCitta();
        addressBean3.setCAP("Data non disponibile");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getDescrizione();
        java.lang.String str10 = prodottoBean8.getNome();
        int int11 = prodottoBean8.getQuantita();
        prodottoBean8.setDescrizione("hi!");
        int int14 = prodottoBean8.getId();
        int int15 = prodottoBean8.getId();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        ita.kangaroo.model.AddressBean addressBean0 = new ita.kangaroo.model.AddressBean();
        java.lang.String str1 = addressBean0.getVia();
        java.lang.String str2 = addressBean0.getUsername();
        addressBean0.setUsername("hi!");
        addressBean0.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        boolean boolean8 = addressBean0.equals((java.lang.Object) 10L);
        addressBean0.setUsername("hi!");
        addressBean0.setVia("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        ita.kangaroo.model.AddressBean addressBean5 = new ita.kangaroo.model.AddressBean((int) '4', "3a987acf8cbc1028b7dbc86bd086831151899a2b", "ProdottoBean{id=10, descrizione='hi!', nome='', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}", "3a987acf8cbc1028b7dbc86bd086831151899a2b", "da39a3ee5e6b4b0d3255bfef95601890afd80709");
        addressBean5.setUsername("3a987acf8cbc1028b7dbc86bd086831151899a2b");
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        int int2 = orderProductBean0.getId_ordine();
        int int3 = orderProductBean0.getQuantita();
        int int4 = orderProductBean0.getId_ordine();
        float float5 = orderProductBean0.getPrezzo();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        ita.kangaroo.model.AddressBean addressBean5 = new ita.kangaroo.model.AddressBean((int) (byte) 0, "da39a3ee5e6b4b0d3255bfef95601890afd80709", "da39a3ee5e6b4b0d3255bfef95601890afd80709", "hi!", "");
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        orderProductBean0.setId_ordine(10);
        orderProductBean0.setId_ordine(97);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
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
        java.lang.String str16 = metodoPagamentoBean0.getUsername();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}" + "'", str16, "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        ita.kangaroo.model.AddressBean addressBean5 = new ita.kangaroo.model.AddressBean((int) (byte) 10, "da39a3ee5e6b4b0d3255bfef95601890afd80709", "hi!", "3a987acf8cbc1028b7dbc86bd086831151899a2b", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        float float2 = orderProductBean0.getIVA();
        int int3 = orderProductBean0.getId_prodotto();
        orderProductBean0.setId_ordine((int) (short) 10);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        float float13 = ordineBean12.getPrezzo_totale();
        java.lang.String str14 = ordineBean12.getMetodo_di_pagamento();
        ita.kangaroo.model.utenteBean utenteBean15 = ordineBean12.getClient();
        int int16 = ordineBean12.getId();
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(utenteBean15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        ita.kangaroo.model.AddressBean addressBean0 = new ita.kangaroo.model.AddressBean();
        java.lang.String str1 = addressBean0.getVia();
        java.lang.String str2 = addressBean0.getUsername();
        addressBean0.setUsername("hi!");
        addressBean0.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        int int7 = addressBean0.getId();
        ita.kangaroo.model.AddressBean addressBean8 = new ita.kangaroo.model.AddressBean();
        java.lang.String str9 = addressBean8.getVia();
        java.lang.String str10 = addressBean8.getUsername();
        java.lang.String str11 = addressBean8.getCAP();
        java.lang.String str12 = addressBean8.getUsername();
        addressBean8.setId(10);
        int int15 = addressBean8.getId();
        boolean boolean16 = addressBean0.equals((java.lang.Object) int15);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
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
        ordineBean27.setId((int) ' ');
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        float float2 = orderProductBean0.getIVA();
        int int3 = orderProductBean0.getId_prodotto();
        float float4 = orderProductBean0.getPrezzo();
        orderProductBean0.setId_prodotto(0);
        orderProductBean0.setQuantita((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
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
        int int14 = addressBean0.getId();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
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
        ita.kangaroo.model.utenteBean utenteBean25 = ordineBean12.getClient();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertNotNull(utenteBean25);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        ita.kangaroo.model.ProdottoBean prodottoBean0 = null;
        ita.kangaroo.model.CartProduct cartProduct2 = new ita.kangaroo.model.CartProduct(prodottoBean0, (int) (byte) 10);
        int int3 = cartProduct2.getQuantity();
        int int4 = cartProduct2.getQuantity();
        cartProduct2.setQuantity((int) (short) 1);
        cartProduct2.setQuantity(32);
        ita.kangaroo.model.ProdottoBean prodottoBean9 = cartProduct2.getProduct();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNull(prodottoBean9);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getImmagine();
        int int10 = prodottoBean8.getQuantita();
        prodottoBean8.setImmagine("hi!");
        ita.kangaroo.model.CartProduct cartProduct14 = new ita.kangaroo.model.CartProduct(prodottoBean8, (int) (short) 100);
        cartProduct14.setQuantity((int) '#');
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getDescrizione();
        java.lang.String str10 = prodottoBean8.getDescrizione();
        int int11 = prodottoBean8.getId();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        ita.kangaroo.model.AddressBean addressBean5 = new ita.kangaroo.model.AddressBean((int) (byte) -1, "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "Data non disponibile", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "");
        java.lang.String str6 = addressBean5.getUsername();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getImmagine();
        prodottoBean8.setPrezzo((float) (-1L));
        int int12 = prodottoBean8.getQuantita();
        int int13 = prodottoBean8.getQuantita();
        java.lang.String str14 = prodottoBean8.getNome();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getImmagine();
        int int10 = prodottoBean8.getQuantita();
        java.lang.String str11 = prodottoBean8.getImmagine();
        int int12 = prodottoBean8.getId();
        ita.kangaroo.model.tipo tipo13 = null;
        prodottoBean8.setTipo(tipo13);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        float float2 = orderProductBean0.getIVA();
        orderProductBean0.setPrezzo(10.0f);
        int int5 = orderProductBean0.getId_ordine();
        int int6 = orderProductBean0.getId_prodotto();
        int int7 = orderProductBean0.getQuantita();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        ita.kangaroo.model.AddressBean addressBean0 = new ita.kangaroo.model.AddressBean();
        java.lang.String str1 = addressBean0.getVia();
        java.lang.String str2 = addressBean0.getUsername();
        addressBean0.setUsername("hi!");
        addressBean0.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        java.lang.String str7 = addressBean0.getCitta();
        addressBean0.setId(100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) '4', "da39a3ee5e6b4b0d3255bfef95601890afd80709", "", "da39a3ee5e6b4b0d3255bfef95601890afd80709", 32.0f, (-1), (float) '4', tipo7);
        prodottoBean8.setDescrizione("hi!");
        float float11 = prodottoBean8.getPrezzo();
        float float12 = prodottoBean8.getPrezzo();
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 32.0f + "'", float11 == 32.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 32.0f + "'", float12 == 32.0f);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        utenteBean11.setEmail("hi!");
        java.lang.String str14 = utenteBean11.getCognome();
        java.lang.String str15 = utenteBean11.getCognome();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
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
        prodottoBean24.setImmagine("hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        ita.kangaroo.model.MetodoPagamentoBean metodoPagamentoBean0 = new ita.kangaroo.model.MetodoPagamentoBean();
        metodoPagamentoBean0.setId((int) 'a');
        java.lang.String str3 = metodoPagamentoBean0.getNumero_carta();
        metodoPagamentoBean0.setCircuito("Data non disponibile");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        ita.kangaroo.model.MetodoPagamentoBean metodoPagamentoBean0 = new ita.kangaroo.model.MetodoPagamentoBean();
        metodoPagamentoBean0.setId((int) (byte) 0);
        java.lang.String str3 = metodoPagamentoBean0.getCvv();
        java.lang.String str4 = metodoPagamentoBean0.getCvv();
        java.lang.String str5 = metodoPagamentoBean0.getUsername();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        int int2 = orderProductBean0.getId_ordine();
        orderProductBean0.setQuantita((int) 'a');
        int int5 = orderProductBean0.getId_prodotto();
        float float6 = orderProductBean0.getPrezzo();
        orderProductBean0.setPrezzo((float) '#');
        orderProductBean0.setIVA((float) ' ');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
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
        ordineBean48.setNumero_carta("Data non disponibile");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(orderProductBeanList46);
        org.junit.Assert.assertNull(str49);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 10, "hi!", "", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", (float) (-1), (int) (byte) 100, (float) (byte) 0, tipo7);
        float float9 = prodottoBean8.getIva();
        prodottoBean8.setQuantita(100);
        float float12 = prodottoBean8.getIva();
        java.lang.String str13 = prodottoBean8.toString();
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ProdottoBean{id=10, descrizione='hi!', nome='', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}" + "'", str13, "ProdottoBean{id=10, descrizione='hi!', nome='', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}");
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
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
        ordineBean81.setNumero_di_tracking("da39a3ee5e6b4b0d3255bfef95601890afd80709");
        java.sql.Date date86 = ordineBean81.getData();
        java.util.ArrayList<ita.kangaroo.model.OrderProductBean> orderProductBeanList87 = ordineBean81.getProducts();
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
        org.junit.Assert.assertNull(date86);
        org.junit.Assert.assertNotNull(orderProductBeanList87);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) '#', "3a987acf8cbc1028b7dbc86bd086831151899a2b", "3a987acf8cbc1028b7dbc86bd086831151899a2b", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", (float) (byte) 0, (int) (byte) 1, (float) (-1L), tipo7);
        prodottoBean8.setImmagine("Data non disponibile");
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getDestinatario();
        java.lang.String str14 = ordineBean12.getCircuito();
        java.sql.Date date15 = ordineBean12.getData();
        ordineBean12.setDestinatario("hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(date15);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((-1), "3a987acf8cbc1028b7dbc86bd086831151899a2b", "da39a3ee5e6b4b0d3255bfef95601890afd80709", "ProdottoBean{id=10, descrizione='hi!', nome='', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}", (float) (-1), (int) '4', (float) (byte) 0, tipo7);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
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
        metodoPagamentoBean0.setUsername("Data non disponibile");
        metodoPagamentoBean0.setNumero_carta("ProdottoBean{id=10, descrizione='hi!', nome='', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}");
        java.lang.String str17 = metodoPagamentoBean0.getCircuito();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        ordineBean12.setIndirizzo_di_spedizione("Data non disponibile");
        ordineBean12.setPrezzo_totale((float) (byte) 10);
        java.sql.Date date17 = ordineBean12.getData();
        ordineBean12.setPrezzo_totale((float) (short) -1);
        java.lang.Class<?> wildcardClass20 = ordineBean12.getClass();
        org.junit.Assert.assertNull(date17);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        ita.kangaroo.model.tipo tipo6 = null;
        ita.kangaroo.model.utenteBean utenteBean12 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo6, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean13 = new ita.kangaroo.model.OrdineBean(utenteBean12);
        java.lang.String str14 = ordineBean13.getMetodo_di_spedizione();
        ordineBean13.setNumero_carta("");
        java.sql.Date date17 = ordineBean13.getData();
        int int18 = ordineBean13.getId();
        ita.kangaroo.model.tipo tipo24 = null;
        ita.kangaroo.model.utenteBean utenteBean30 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo24, "hi!", "", "", "hi!", "");
        java.lang.String str31 = utenteBean30.getProvincia();
        java.lang.String str32 = utenteBean30.getCognome();
        ordineBean13.setClient(utenteBean30);
        java.lang.String str34 = utenteBean30.getCap();
        utenteBean30.setUsername("Data non disponibile");
        utenteBean30.setProvincia("Data non disponibile");
        java.sql.Date date46 = null;
        ita.kangaroo.model.OrdineBean ordineBean48 = new ita.kangaroo.model.OrdineBean((int) (short) 0, utenteBean30, 0.0f, "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "Data non disponibile", "hi!", "", "hi!", "Data non disponibile", date46, "");
        utenteBean30.setCognome("");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(date17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getImmagine();
        int int10 = prodottoBean8.getQuantita();
        java.lang.String str11 = prodottoBean8.getImmagine();
        ita.kangaroo.model.CartProduct cartProduct12 = new ita.kangaroo.model.CartProduct(prodottoBean8);
        java.lang.String str13 = prodottoBean8.getDescrizione();
        java.lang.String str14 = prodottoBean8.getImmagine();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
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
        java.lang.String str41 = prodottoBean30.getImmagine();
        int int42 = prodottoBean30.getId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 1.0f + "'", float35 == 1.0f);
        org.junit.Assert.assertNull(tipo38);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        utenteBean11.setEmail("hi!");
        utenteBean11.setPassword("hi!");
        utenteBean11.setCognome("Data non disponibile");
        utenteBean11.setTelefono("Data non disponibile");
        java.lang.String str20 = utenteBean11.getCap();
        utenteBean11.setCognome("hi!");
        utenteBean11.setCap("Data non disponibile");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        utenteBean11.setEmail("hi!");
        utenteBean11.setPassword("hi!");
        utenteBean11.setCognome("Data non disponibile");
        utenteBean11.setTelefono("Data non disponibile");
        java.lang.String str20 = utenteBean11.getCap();
        utenteBean11.setCognome("hi!");
        utenteBean11.setEmail("hi!");
        utenteBean11.setPassword("hi!");
        ita.kangaroo.model.tipo tipo27 = null;
        utenteBean11.setTipo(tipo27);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
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
        ordineBean27.setDestinatario("hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(orderProductBeanList46);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getImmagine();
        int int10 = prodottoBean8.getQuantita();
        java.lang.String str11 = prodottoBean8.getImmagine();
        java.lang.String str12 = prodottoBean8.getDescrizione();
        prodottoBean8.setIva((float) 32);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        ita.kangaroo.model.Cart cart0 = new ita.kangaroo.model.Cart();
        ita.kangaroo.model.tipo tipo8 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean9 = new ita.kangaroo.model.ProdottoBean((int) (byte) 10, "hi!", "hi!", "Data non disponibile", (float) (byte) 10, 10, (float) ' ', tipo8);
        cart0.removeProduct(prodottoBean9);
        prodottoBean9.setId((int) '4');
        prodottoBean9.setImmagine("hi!");
        prodottoBean9.setImmagine("ProdottoBean{id=10, descrizione='hi!', nome='', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}");
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        ita.kangaroo.model.CartProduct cartProduct10 = new ita.kangaroo.model.CartProduct(prodottoBean8, (int) (short) 100);
        ita.kangaroo.model.tipo tipo11 = null;
        prodottoBean8.setTipo(tipo11);
        prodottoBean8.setId((int) (short) -1);
        prodottoBean8.setImmagine("hi!");
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
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
        java.lang.String str51 = ordineBean48.getIndirizzo_di_spedizione();
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(orderProductBeanList46);
        org.junit.Assert.assertNull(str51);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
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
        java.util.ArrayList<ita.kangaroo.model.OrderProductBean> orderProductBeanList25 = ordineBean12.getProducts();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertNotNull(orderProductBeanList25);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        utenteBean11.setEmail("");
        ita.kangaroo.model.OrdineBean ordineBean15 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.util.ArrayList<ita.kangaroo.model.OrderProductBean> orderProductBeanList16 = ordineBean15.getProducts();
        org.junit.Assert.assertNotNull(orderProductBeanList16);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getDescrizione();
        java.lang.String str10 = prodottoBean8.getDescrizione();
        ita.kangaroo.model.CartProduct cartProduct11 = new ita.kangaroo.model.CartProduct(prodottoBean8);
        ita.kangaroo.model.ProdottoBean prodottoBean12 = cartProduct11.getProduct();
        int int13 = prodottoBean12.getQuantita();
        int int14 = prodottoBean12.getQuantita();
        int int15 = prodottoBean12.getId();
        prodottoBean12.setDescrizione("hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(prodottoBean12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
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
        java.lang.String str33 = ordineBean12.getNumero_carta();
        ordineBean12.setIndirizzo_di_spedizione("3a987acf8cbc1028b7dbc86bd086831151899a2b");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
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
        ordineBean12.setPrezzo_totale((float) (-1L));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str36);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getCircuito();
        ordineBean12.setMetodo_di_pagamento("hi!");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
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
        ordineBean12.setPrezzo_totale((float) (byte) 100);
        ordineBean12.setMetodo_di_pagamento("Data non disponibile");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(date16);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        float float2 = orderProductBean0.getIVA();
        orderProductBean0.setPrezzo(10.0f);
        orderProductBean0.setQuantita((int) (short) -1);
        int int7 = orderProductBean0.getQuantita();
        orderProductBean0.setId_ordine((int) 'a');
        orderProductBean0.setId_prodotto((int) (byte) -1);
        orderProductBean0.setQuantita(10);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "", "", "hi!", "hi!", "hi!");
        java.lang.String str12 = utenteBean11.getUsername();
        utenteBean11.setProvincia("da39a3ee5e6b4b0d3255bfef95601890afd80709");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        int int13 = ordineBean12.getId();
        java.lang.String str14 = ordineBean12.getDestinatario();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "", "", "hi!", "hi!", "hi!");
        java.lang.String str12 = utenteBean11.getPassword();
        utenteBean11.setProvincia("Data non disponibile");
        java.lang.String str15 = utenteBean11.getCognome();
        java.lang.String str16 = utenteBean11.getEmail();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
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
        java.lang.String str38 = utenteBean33.getCitta();
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(utenteBean33);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        ita.kangaroo.model.utenteBean utenteBean0 = new ita.kangaroo.model.utenteBean();
        java.lang.String str1 = utenteBean0.getNome();
        java.lang.String str2 = utenteBean0.getProvincia();
        java.lang.String str3 = utenteBean0.getCap();
        java.lang.String str4 = utenteBean0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        int int2 = orderProductBean0.getId_ordine();
        orderProductBean0.setQuantita((int) 'a');
        int int5 = orderProductBean0.getId_prodotto();
        orderProductBean0.setQuantita((int) (short) 10);
        float float8 = orderProductBean0.getIVA();
        orderProductBean0.setId_prodotto((int) ' ');
        float float11 = orderProductBean0.getPrezzo();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        orderProductBean0.setId_ordine(10);
        orderProductBean0.setId_ordine((int) '4');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        ita.kangaroo.model.AddressBean addressBean0 = new ita.kangaroo.model.AddressBean();
        java.lang.String str1 = addressBean0.getVia();
        java.lang.String str2 = addressBean0.getUsername();
        java.lang.String str3 = addressBean0.getCAP();
        java.lang.String str4 = addressBean0.getUsername();
        java.lang.String str5 = addressBean0.getCAP();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        ita.kangaroo.model.MetodoPagamentoBean metodoPagamentoBean0 = new ita.kangaroo.model.MetodoPagamentoBean();
        metodoPagamentoBean0.setId((int) (byte) 0);
        java.lang.String str3 = metodoPagamentoBean0.getCvv();
        java.lang.String str4 = metodoPagamentoBean0.getCvv();
        java.lang.String str5 = metodoPagamentoBean0.getCvv();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "", "", "hi!", "hi!", "hi!");
        java.lang.String str12 = utenteBean11.getPassword();
        utenteBean11.setTelefono("");
        utenteBean11.setCap("da39a3ee5e6b4b0d3255bfef95601890afd80709");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        int int2 = orderProductBean0.getId_ordine();
        orderProductBean0.setQuantita((int) 'a');
        orderProductBean0.setIVA((float) 32);
        orderProductBean0.setId_prodotto(0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        utenteBean11.setEmail("hi!");
        utenteBean11.setPassword("hi!");
        utenteBean11.setCognome("Data non disponibile");
        utenteBean11.setTelefono("Data non disponibile");
        java.lang.String str20 = utenteBean11.getCap();
        utenteBean11.setCognome("hi!");
        java.lang.String str23 = utenteBean11.getTelefono();
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Data non disponibile" + "'", str23, "Data non disponibile");
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        ita.kangaroo.model.AddressBean addressBean0 = new ita.kangaroo.model.AddressBean();
        java.lang.String str1 = addressBean0.getVia();
        java.lang.String str2 = addressBean0.getUsername();
        java.lang.String str3 = addressBean0.getCAP();
        java.lang.String str4 = addressBean0.getUsername();
        addressBean0.setId(10);
        addressBean0.setId((int) (byte) 0);
        addressBean0.setCAP("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        ita.kangaroo.model.MetodoPagamentoBean metodoPagamentoBean0 = new ita.kangaroo.model.MetodoPagamentoBean();
        metodoPagamentoBean0.setId((int) 'a');
        metodoPagamentoBean0.setCircuito("");
        java.lang.String str5 = metodoPagamentoBean0.getCircuito();
        metodoPagamentoBean0.setId((int) (byte) 0);
        java.lang.String str8 = metodoPagamentoBean0.getData_scadenza();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        ita.kangaroo.model.tipo tipo6 = null;
        ita.kangaroo.model.utenteBean utenteBean12 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo6, "hi!", "", "", "hi!", "");
        utenteBean12.setEmail("hi!");
        java.lang.String str15 = utenteBean12.getCognome();
        utenteBean12.setCitta("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        utenteBean12.setUsername("Data non disponibile");
        java.sql.Date date27 = null;
        ita.kangaroo.model.OrdineBean ordineBean29 = new ita.kangaroo.model.OrdineBean(0, utenteBean12, (float) (byte) 0, "", "", "Data non disponibile", "Data non disponibile", "hi!", "", date27, "Data non disponibile");
        ordineBean29.setMetodo_di_pagamento("Data non disponibile");
        ordineBean29.setMetodo_di_spedizione("hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
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
        utenteBean24.setCitta("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
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
        int int24 = metodoPagamentoBean0.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}" + "'", str23, "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        ita.kangaroo.model.AddressBean addressBean0 = new ita.kangaroo.model.AddressBean();
        addressBean0.setId((int) ' ');
        java.lang.String str3 = addressBean0.getVia();
        addressBean0.setCitta("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        java.lang.String str6 = addressBean0.getCitta();
        addressBean0.setUsername("da39a3ee5e6b4b0d3255bfef95601890afd80709");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}" + "'", str6, "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        ita.kangaroo.model.tipo tipo6 = null;
        ita.kangaroo.model.utenteBean utenteBean12 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo6, "hi!", "", "", "hi!", "");
        java.lang.String str13 = utenteBean12.getUsername();
        java.lang.String str14 = utenteBean12.getCap();
        java.sql.Date date22 = null;
        ita.kangaroo.model.OrdineBean ordineBean24 = new ita.kangaroo.model.OrdineBean((int) (short) 0, utenteBean12, (float) 10L, "", "Data non disponibile", "hi!", "hi!", "", "", date22, "hi!");
        ordineBean24.setDestinatario("");
        float float27 = ordineBean24.getPrezzo_totale();
        java.lang.String str28 = ordineBean24.toString();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 10.0f + "'", float27 == 10.0f);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Data non disponibile" + "'", str28, "Data non disponibile");
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
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
        utenteBean29.setEmail("hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        utenteBean11.setEmail("hi!");
        utenteBean11.setPassword("hi!");
        utenteBean11.setProvincia("hi!");
        utenteBean11.setUsername("hi!");
        java.lang.String str20 = utenteBean11.getTelefono();
        java.lang.String str21 = utenteBean11.getTelefono();
        ita.kangaroo.model.OrdineBean ordineBean22 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        ita.kangaroo.model.tipo tipo28 = null;
        ita.kangaroo.model.utenteBean utenteBean34 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo28, "hi!", "", "", "hi!", "");
        java.lang.String str35 = utenteBean34.getUsername();
        java.lang.String str36 = utenteBean34.getCap();
        utenteBean34.setUsername("");
        ita.kangaroo.model.OrdineBean ordineBean39 = new ita.kangaroo.model.OrdineBean(utenteBean34);
        ordineBean39.setCircuito("");
        java.util.ArrayList<ita.kangaroo.model.OrderProductBean> orderProductBeanList42 = ordineBean39.getProducts();
        ita.kangaroo.model.OrdineBean ordineBean43 = new ita.kangaroo.model.OrdineBean(orderProductBeanList42);
        ita.kangaroo.model.OrdineBean ordineBean44 = new ita.kangaroo.model.OrdineBean(orderProductBeanList42);
        ordineBean22.setProducts(orderProductBeanList42);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(orderProductBeanList42);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
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
        prodottoBean41.setImmagine("");
        ita.kangaroo.model.tipo tipo57 = null;
        prodottoBean41.setTipo(tipo57);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        ita.kangaroo.model.AddressBean addressBean0 = new ita.kangaroo.model.AddressBean();
        java.lang.String str1 = addressBean0.getVia();
        java.lang.String str2 = addressBean0.getUsername();
        java.lang.String str3 = addressBean0.getCAP();
        java.lang.String str4 = addressBean0.getUsername();
        addressBean0.setId(10);
        int int7 = addressBean0.getId();
        addressBean0.setCAP("");
        java.lang.String str10 = addressBean0.getUsername();
        java.lang.String str11 = addressBean0.getVia();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        java.lang.String str12 = utenteBean11.getUsername();
        java.lang.String str13 = utenteBean11.getCap();
        utenteBean11.setCognome("hi!");
        java.lang.String str16 = utenteBean11.getCap();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        ita.kangaroo.model.MetodoPagamentoBean metodoPagamentoBean0 = new ita.kangaroo.model.MetodoPagamentoBean();
        metodoPagamentoBean0.setId((int) 'a');
        ita.kangaroo.model.AddressBean addressBean3 = new ita.kangaroo.model.AddressBean();
        java.lang.String str4 = addressBean3.getVia();
        addressBean3.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        addressBean3.setCitta("hi!");
        boolean boolean9 = metodoPagamentoBean0.equals((java.lang.Object) addressBean3);
        java.lang.String str10 = metodoPagamentoBean0.getData_scadenza();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
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
        java.lang.String str83 = ordineBean81.getNumero_di_tracking();
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
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getImmagine();
        prodottoBean8.setPrezzo((float) (-1L));
        int int12 = prodottoBean8.getId();
        ita.kangaroo.model.CartProduct cartProduct14 = new ita.kangaroo.model.CartProduct(prodottoBean8, (int) (short) -1);
        ita.kangaroo.model.tipo tipo15 = prodottoBean8.getTipo();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(tipo15);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (short) 1, "hi!", "", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", (float) 1L, (int) (short) -1, (float) 32, tipo7);
        prodottoBean8.setQuantita((int) (byte) 1);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        java.util.ArrayList<ita.kangaroo.model.OrderProductBean> orderProductBeanList14 = ordineBean12.getProducts();
        float float15 = ordineBean12.getPrezzo_totale();
        java.lang.Class<?> wildcardClass16 = ordineBean12.getClass();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(orderProductBeanList14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.0f + "'", float15 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getDescrizione();
        prodottoBean8.setImmagine("");
        java.lang.String str12 = prodottoBean8.toString();
        prodottoBean8.setPrezzo((float) 10L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}" + "'", str12, "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
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
        java.lang.String str13 = metodoPagamentoBean0.getData_scadenza();
        metodoPagamentoBean0.setUsername("ProdottoBean{id=10, descrizione='hi!', nome='', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        utenteBean11.setEmail("hi!");
        utenteBean11.setPassword("hi!");
        utenteBean11.setProvincia("hi!");
        utenteBean11.setUsername("hi!");
        java.lang.String str20 = utenteBean11.getTelefono();
        java.lang.String str21 = utenteBean11.getUsername();
        utenteBean11.setProvincia("da39a3ee5e6b4b0d3255bfef95601890afd80709");
        utenteBean11.setProvincia("hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
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
        java.lang.String str56 = prodottoBean49.getDescrizione();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 1.0f + "'", float35 == 1.0f);
        org.junit.Assert.assertNull(tipo38);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
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
        ita.kangaroo.model.tipo tipo53 = prodottoBean41.getTipo();
        prodottoBean41.setNome("3a987acf8cbc1028b7dbc86bd086831151899a2b");
        prodottoBean41.setImmagine("hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNull(tipo53);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "", "", "hi!", "hi!", "hi!");
        java.lang.String str12 = utenteBean11.getUsername();
        utenteBean11.setPassword("");
        java.lang.String str15 = utenteBean11.getCitta();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        ita.kangaroo.model.MetodoPagamentoBean metodoPagamentoBean0 = new ita.kangaroo.model.MetodoPagamentoBean();
        metodoPagamentoBean0.setId((int) (byte) 0);
        java.lang.String str3 = metodoPagamentoBean0.getCvv();
        java.lang.String str4 = metodoPagamentoBean0.getCvv();
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
        boolean boolean29 = metodoPagamentoBean0.equals((java.lang.Object) prodottoBean26);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
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
        addressBean15.setCitta("da39a3ee5e6b4b0d3255bfef95601890afd80709");
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
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
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
        java.lang.String str83 = ordineBean82.getDestinatario();
        java.lang.String str84 = ordineBean82.toString();
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
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "Data non disponibile" + "'", str84, "Data non disponibile");
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        float float2 = orderProductBean0.getIVA();
        float float3 = orderProductBean0.getPrezzo();
        float float4 = orderProductBean0.getPrezzo();
        float float5 = orderProductBean0.getPrezzo();
        orderProductBean0.setQuantita(35);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        java.lang.String str12 = utenteBean11.getUsername();
        java.lang.String str13 = utenteBean11.getCap();
        utenteBean11.setUsername("");
        ita.kangaroo.model.OrdineBean ordineBean16 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        utenteBean11.setVia("3a987acf8cbc1028b7dbc86bd086831151899a2b");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        ita.kangaroo.model.MetodoPagamentoBean metodoPagamentoBean0 = new ita.kangaroo.model.MetodoPagamentoBean();
        metodoPagamentoBean0.setId((int) (byte) 0);
        java.lang.String str3 = metodoPagamentoBean0.getCvv();
        java.lang.String str4 = metodoPagamentoBean0.getCvv();
        java.lang.String str5 = metodoPagamentoBean0.getData_scadenza();
        metodoPagamentoBean0.setUsername("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        utenteBean11.setEmail("hi!");
        utenteBean11.setPassword("hi!");
        utenteBean11.setCognome("Data non disponibile");
        java.lang.String str18 = utenteBean11.getPassword();
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "3a987acf8cbc1028b7dbc86bd086831151899a2b" + "'", str18, "3a987acf8cbc1028b7dbc86bd086831151899a2b");
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        ita.kangaroo.model.AddressBean addressBean0 = new ita.kangaroo.model.AddressBean();
        java.lang.String str1 = addressBean0.getVia();
        java.lang.String str2 = addressBean0.getUsername();
        java.lang.String str3 = addressBean0.getCAP();
        java.lang.String str4 = addressBean0.getUsername();
        addressBean0.setId(10);
        java.lang.String str7 = addressBean0.getCitta();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
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
        java.lang.String str36 = utenteBean12.getCitta();
        org.junit.Assert.assertNull(tipo33);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
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
        java.lang.String str62 = ordineBean27.getDestinatario();
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        ita.kangaroo.model.ProdottoBean prodottoBean0 = new ita.kangaroo.model.ProdottoBean();
        java.lang.String str1 = prodottoBean0.getNome();
        prodottoBean0.setIva((float) (-1L));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        ita.kangaroo.model.Cart cart0 = new ita.kangaroo.model.Cart();
        ita.kangaroo.model.tipo tipo8 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean9 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo8);
        java.lang.String str10 = prodottoBean9.getDescrizione();
        java.lang.String str11 = prodottoBean9.getNome();
        int int12 = prodottoBean9.getQuantita();
        prodottoBean9.setDescrizione("hi!");
        cart0.addProduct(prodottoBean9);
        ita.kangaroo.model.Cart cart16 = new ita.kangaroo.model.Cart();
        ita.kangaroo.model.tipo tipo24 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean25 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo24);
        java.lang.String str26 = prodottoBean25.getImmagine();
        prodottoBean25.setPrezzo((float) (-1L));
        int int29 = prodottoBean25.getId();
        prodottoBean25.setPrezzo(10.0f);
        prodottoBean25.setPrezzo(0.0f);
        prodottoBean25.setNome("Data non disponibile");
        cart16.changeQuantity(prodottoBean25, (int) '4');
        ita.kangaroo.model.tipo tipo45 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean46 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo45);
        java.lang.String str47 = prodottoBean46.getImmagine();
        prodottoBean46.setPrezzo((float) (-1L));
        int int50 = prodottoBean46.getId();
        float float51 = prodottoBean46.getIva();
        prodottoBean46.setQuantita((int) ' ');
        ita.kangaroo.model.tipo tipo54 = prodottoBean46.getTipo();
        cart16.changeQuantity(prodottoBean46, (int) (short) 100);
        ita.kangaroo.model.tipo tipo64 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean65 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo64);
        java.lang.String str66 = prodottoBean65.getImmagine();
        prodottoBean65.setPrezzo((float) (-1L));
        int int69 = prodottoBean65.getId();
        float float70 = prodottoBean65.getIva();
        prodottoBean65.setQuantita((int) ' ');
        ita.kangaroo.model.tipo tipo73 = prodottoBean65.getTipo();
        cart16.removeProduct(prodottoBean65);
        ita.kangaroo.model.tipo tipo82 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean83 = new ita.kangaroo.model.ProdottoBean((int) (byte) 10, "hi!", "", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", (float) (-1), (int) (byte) 100, (float) (byte) 0, tipo82);
        float float84 = prodottoBean83.getIva();
        cart16.changeQuantity(prodottoBean83, (int) (short) 1);
        cart0.changeQuantity(prodottoBean83, (int) (short) 10);
        prodottoBean83.setPrezzo(1.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + float51 + "' != '" + 1.0f + "'", float51 == 1.0f);
        org.junit.Assert.assertNull(tipo54);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi!" + "'", str66, "hi!");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
        org.junit.Assert.assertTrue("'" + float70 + "' != '" + 1.0f + "'", float70 == 1.0f);
        org.junit.Assert.assertNull(tipo73);
        org.junit.Assert.assertTrue("'" + float84 + "' != '" + 0.0f + "'", float84 == 0.0f);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        float float2 = orderProductBean0.getIVA();
        float float3 = orderProductBean0.getPrezzo();
        float float4 = orderProductBean0.getPrezzo();
        orderProductBean0.setQuantita((int) (byte) 100);
        int int7 = orderProductBean0.getId_ordine();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("", "", "", "", "Data non disponibile", tipo5, "hi!", "", "Data non disponibile", "Data non disponibile", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        utenteBean11.setPassword("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        java.lang.String str14 = utenteBean11.getPassword();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "3d1583397bcebff274b1e7cb58087c39153af974" + "'", str14, "3d1583397bcebff274b1e7cb58087c39153af974");
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) -1, "Data non disponibile", "Data non disponibile", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", (float) ' ', (int) ' ', (float) ' ', tipo7);
        java.lang.String str9 = prodottoBean8.getImmagine();
        int int10 = prodottoBean8.getQuantita();
        float float11 = prodottoBean8.getPrezzo();
        java.lang.String str12 = prodottoBean8.getNome();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}" + "'", str9, "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 32.0f + "'", float11 == 32.0f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Data non disponibile" + "'", str12, "Data non disponibile");
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
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
        utenteBean29.setUsername("");
        utenteBean29.setProvincia("hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        ita.kangaroo.model.AddressBean addressBean5 = new ita.kangaroo.model.AddressBean((int) (byte) 0, "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "da39a3ee5e6b4b0d3255bfef95601890afd80709", "ProdottoBean{id=10, descrizione='hi!', nome='', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}", "3d1583397bcebff274b1e7cb58087c39153af974");
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        java.lang.String str12 = utenteBean11.getVia();
        java.lang.String str13 = utenteBean11.getProvincia();
        utenteBean11.setPassword("3a987acf8cbc1028b7dbc86bd086831151899a2b");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
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
        prodottoBean30.setQuantita((int) (short) -1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        int int2 = orderProductBean0.getId_ordine();
        orderProductBean0.setQuantita((int) 'a');
        int int5 = orderProductBean0.getId_ordine();
        orderProductBean0.setId_ordine(100);
        float float8 = orderProductBean0.getPrezzo();
        float float9 = orderProductBean0.getPrezzo();
        int int10 = orderProductBean0.getId_prodotto();
        orderProductBean0.setPrezzo(0.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getImmagine();
        prodottoBean8.setPrezzo((float) (-1L));
        int int12 = prodottoBean8.getId();
        ita.kangaroo.model.CartProduct cartProduct14 = new ita.kangaroo.model.CartProduct(prodottoBean8, (int) (short) -1);
        prodottoBean8.setId((int) (byte) 0);
        ita.kangaroo.model.tipo tipo17 = null;
        prodottoBean8.setTipo(tipo17);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean(1, "", "da39a3ee5e6b4b0d3255bfef95601890afd80709", "3a987acf8cbc1028b7dbc86bd086831151899a2b", (float) (byte) 10, (int) 'a', 100.0f, tipo7);
        java.lang.String str9 = prodottoBean8.getImmagine();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3a987acf8cbc1028b7dbc86bd086831151899a2b" + "'", str9, "3a987acf8cbc1028b7dbc86bd086831151899a2b");
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        float float2 = orderProductBean0.getIVA();
        orderProductBean0.setPrezzo(10.0f);
        orderProductBean0.setId_ordine((int) (short) 0);
        orderProductBean0.setIVA((-1.0f));
        int int9 = orderProductBean0.getId_prodotto();
        int int10 = orderProductBean0.getId_ordine();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        utenteBean11.setEmail("hi!");
        ita.kangaroo.model.OrdineBean ordineBean14 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str15 = utenteBean11.getEmail();
        java.lang.String str16 = utenteBean11.getUsername();
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        ita.kangaroo.model.AddressBean addressBean0 = new ita.kangaroo.model.AddressBean();
        java.lang.String str1 = addressBean0.getVia();
        addressBean0.setVia("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        addressBean0.setCitta("hi!");
        addressBean0.setId((int) (byte) 0);
        java.lang.String str8 = addressBean0.getCitta();
        int int9 = addressBean0.getId();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
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
        java.lang.String str15 = metodoPagamentoBean0.getData_scadenza();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Data non disponibile" + "'", str15, "Data non disponibile");
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        int int2 = orderProductBean0.getId_ordine();
        int int3 = orderProductBean0.getQuantita();
        int int4 = orderProductBean0.getId_prodotto();
        float float5 = orderProductBean0.getPrezzo();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        ita.kangaroo.model.tipo tipo6 = null;
        ita.kangaroo.model.utenteBean utenteBean12 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo6, "hi!", "", "", "hi!", "");
        java.lang.String str13 = utenteBean12.getUsername();
        java.lang.String str14 = utenteBean12.getCap();
        java.sql.Date date22 = null;
        ita.kangaroo.model.OrdineBean ordineBean24 = new ita.kangaroo.model.OrdineBean((int) (short) 0, utenteBean12, (float) 10L, "", "Data non disponibile", "hi!", "hi!", "", "", date22, "hi!");
        ordineBean24.setDestinatario("");
        float float27 = ordineBean24.getPrezzo_totale();
        java.util.ArrayList<ita.kangaroo.model.OrderProductBean> orderProductBeanList28 = ordineBean24.getProducts();
        java.lang.Class<?> wildcardClass29 = ordineBean24.getClass();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 10.0f + "'", float27 == 10.0f);
        org.junit.Assert.assertNotNull(orderProductBeanList28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        ordineBean12.setNumero_carta("");
        java.sql.Date date16 = ordineBean12.getData();
        ordineBean12.setMetodo_di_pagamento("");
        ordineBean12.setNumero_di_tracking("");
        ordineBean12.setPrezzo_totale((float) 100L);
        int int23 = ordineBean12.getId();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        ordineBean12.setNumero_carta("");
        java.lang.String str16 = ordineBean12.getIndirizzo_di_spedizione();
        java.lang.String str17 = ordineBean12.getDestinatario();
        ordineBean12.setIndirizzo_di_spedizione("hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
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
        java.lang.String str40 = ordineBean12.getIndirizzo_di_spedizione();
        ordineBean12.setId(1);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(date37);
        org.junit.Assert.assertNull(str40);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getDescrizione();
        java.lang.String str10 = prodottoBean8.getNome();
        ita.kangaroo.model.CartProduct cartProduct11 = new ita.kangaroo.model.CartProduct(prodottoBean8);
        prodottoBean8.setPrezzo((float) (byte) 0);
        float float14 = prodottoBean8.getIva();
        java.lang.String str15 = prodottoBean8.getImmagine();
        float float16 = prodottoBean8.getPrezzo();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
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
        ordineBean12.setNumero_carta("ProdottoBean{id=10, descrizione='hi!', nome='', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        java.lang.String str12 = utenteBean11.getCitta();
        java.lang.String str13 = utenteBean11.getTelefono();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "", "", "hi!", "hi!", "hi!");
        java.lang.String str12 = utenteBean11.getUsername();
        utenteBean11.setCap("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        ita.kangaroo.model.OrdineBean ordineBean15 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str16 = ordineBean15.toString();
        ita.kangaroo.model.tipo tipo23 = null;
        ita.kangaroo.model.utenteBean utenteBean29 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo23, "hi!", "", "", "hi!", "");
        java.lang.String str30 = utenteBean29.getUsername();
        java.lang.String str31 = utenteBean29.getCap();
        utenteBean29.setUsername("");
        ita.kangaroo.model.OrdineBean ordineBean34 = new ita.kangaroo.model.OrdineBean(utenteBean29);
        java.sql.Date date42 = null;
        ita.kangaroo.model.OrdineBean ordineBean44 = new ita.kangaroo.model.OrdineBean((int) (short) 1, utenteBean29, (float) (byte) -1, "hi!", "hi!", "Data non disponibile", "", "Data non disponibile", "Data non disponibile", date42, "");
        ordineBean15.setClient(utenteBean29);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Data non disponibile" + "'", str16, "Data non disponibile");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "hi!", "", "", "hi!", tipo5, "", "", "Data non disponibile", "", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        java.lang.String str12 = utenteBean11.getEmail();
        java.lang.String str13 = utenteBean11.getVia();
        java.lang.String str14 = utenteBean11.getTelefono();
        utenteBean11.setEmail("hi!");
        ita.kangaroo.model.tipo tipo17 = null;
        utenteBean11.setTipo(tipo17);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
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
        prodottoBean8.setIva((float) 97);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(tipo19);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
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
        int int37 = metodoPagamentoBean0.getId();
        ita.kangaroo.model.tipo tipo43 = null;
        ita.kangaroo.model.utenteBean utenteBean49 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo43, "hi!", "", "", "hi!", "");
        java.lang.String str50 = utenteBean49.getProvincia();
        java.lang.String str51 = utenteBean49.getCognome();
        java.lang.String str52 = utenteBean49.getVia();
        boolean boolean53 = metodoPagamentoBean0.equals((java.lang.Object) utenteBean49);
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
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 97 + "'", int37 == 97);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        ita.kangaroo.model.utenteBean utenteBean1 = new ita.kangaroo.model.utenteBean();
        java.lang.String str2 = utenteBean1.getPassword();
        java.sql.Date date10 = null;
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(0, utenteBean1, (float) (short) -1, "Data non disponibile", "", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "Data non disponibile", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", date10, "");
        utenteBean1.setTelefono("");
        java.lang.String str15 = utenteBean1.getCap();
        ita.kangaroo.model.OrdineBean ordineBean16 = new ita.kangaroo.model.OrdineBean(utenteBean1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        ita.kangaroo.model.Cart cart0 = new ita.kangaroo.model.Cart();
        ita.kangaroo.model.tipo tipo8 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean9 = new ita.kangaroo.model.ProdottoBean((int) (byte) -1, "Data non disponibile", "Data non disponibile", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", (float) ' ', (int) ' ', (float) ' ', tipo8);
        ita.kangaroo.model.CartProduct cartProduct10 = new ita.kangaroo.model.CartProduct(prodottoBean9);
        cart0.changeQuantity(prodottoBean9, 0);
        ita.kangaroo.model.tipo tipo20 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean21 = new ita.kangaroo.model.ProdottoBean((int) (byte) -1, "Data non disponibile", "Data non disponibile", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", (float) ' ', (int) ' ', (float) ' ', tipo20);
        ita.kangaroo.model.CartProduct cartProduct22 = new ita.kangaroo.model.CartProduct(prodottoBean21);
        int int23 = prodottoBean21.getQuantita();
        java.lang.String str24 = prodottoBean21.getDescrizione();
        prodottoBean21.setPrezzo((float) (-1));
        cart0.changeQuantity(prodottoBean21, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 32 + "'", int23 == 32);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Data non disponibile" + "'", str24, "Data non disponibile");
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        java.util.ArrayList<ita.kangaroo.model.OrderProductBean> orderProductBeanList14 = ordineBean12.getProducts();
        ordineBean12.setId((int) 'a');
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(orderProductBeanList14);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
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
        java.lang.String str78 = utenteBean61.getTelefono();
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(orderProductBeanList46);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "hi!" + "'", str76, "hi!");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "hi!" + "'", str78, "hi!");
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
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
        prodottoBean17.setImmagine("Data non disponibile");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(tipo13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(prodottoBean17);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getImmagine();
        prodottoBean8.setPrezzo((float) (-1L));
        int int12 = prodottoBean8.getId();
        ita.kangaroo.model.CartProduct cartProduct14 = new ita.kangaroo.model.CartProduct(prodottoBean8, (int) (short) -1);
        cartProduct14.setQuantity((-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
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
        java.lang.String str24 = utenteBean11.getEmail();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getDescrizione();
        prodottoBean8.setImmagine("");
        java.lang.String str12 = prodottoBean8.toString();
        float float13 = prodottoBean8.getIva();
        prodottoBean8.setIva(0.0f);
        int int16 = prodottoBean8.getQuantita();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}" + "'", str12, "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) -1, "", "", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", (float) ' ', (int) (short) 1, (float) (short) 0, tipo7);
        prodottoBean8.setImmagine("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        ita.kangaroo.model.CartProduct cartProduct11 = new ita.kangaroo.model.CartProduct(prodottoBean8);
        cartProduct11.setQuantity((int) (byte) 0);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
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
        metodoPagamentoBean0.setNumero_carta("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        java.lang.String str17 = metodoPagamentoBean0.getUsername();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        ordineBean12.setNumero_carta("");
        java.sql.Date date16 = ordineBean12.getData();
        float float17 = ordineBean12.getPrezzo_totale();
        ordineBean12.setDestinatario("da39a3ee5e6b4b0d3255bfef95601890afd80709");
        java.lang.String str20 = ordineBean12.getMetodo_di_spedizione();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.0f + "'", float17 == 0.0f);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
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
        ita.kangaroo.model.tipo tipo42 = utenteBean26.getTipo();
        utenteBean26.setTelefono("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        ita.kangaroo.model.OrdineBean ordineBean45 = new ita.kangaroo.model.OrdineBean(utenteBean26);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(tipo42);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        java.lang.String str13 = ordineBean12.getMetodo_di_spedizione();
        java.util.ArrayList<ita.kangaroo.model.OrderProductBean> orderProductBeanList14 = ordineBean12.getProducts();
        float float15 = ordineBean12.getPrezzo_totale();
        ordineBean12.setId((int) (byte) 0);
        ordineBean12.setMetodo_di_spedizione("Data non disponibile");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(orderProductBeanList14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.0f + "'", float15 == 0.0f);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        ita.kangaroo.model.utenteBean utenteBean1 = new ita.kangaroo.model.utenteBean();
        java.lang.String str2 = utenteBean1.getPassword();
        java.sql.Date date10 = null;
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(0, utenteBean1, (float) (short) -1, "Data non disponibile", "", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "Data non disponibile", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", date10, "");
        ordineBean12.setMetodo_di_spedizione("");
        java.lang.String str15 = ordineBean12.toString();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Data non disponibile" + "'", str15, "Data non disponibile");
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
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
        java.lang.String str45 = metodoPagamentoBean0.getUsername();
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
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        ita.kangaroo.model.AddressBean addressBean5 = new ita.kangaroo.model.AddressBean((int) (short) 100, "", "3a987acf8cbc1028b7dbc86bd086831151899a2b", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "3d1583397bcebff274b1e7cb58087c39153af974");
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
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
        java.lang.String str39 = metodoPagamentoBean0.getCircuito();
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
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "ProdottoBean{id=10, descrizione='hi!', nome='', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}" + "'", str39, "ProdottoBean{id=10, descrizione='hi!', nome='', immagine='ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}', prezzo=-1.0, quantita=100, iva=0.0, tipo=null}");
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        ordineBean12.setIndirizzo_di_spedizione("Data non disponibile");
        ordineBean12.setPrezzo_totale((float) (byte) 10);
        java.sql.Date date17 = ordineBean12.getData();
        ordineBean12.setIndirizzo_di_spedizione("hi!");
        java.lang.String str20 = ordineBean12.getCircuito();
        java.lang.String str21 = ordineBean12.toString();
        org.junit.Assert.assertNull(date17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Data non disponibile" + "'", str21, "Data non disponibile");
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
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
        java.lang.String str32 = ordineBean12.getDestinatario();
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        orderProductBean0.setQuantita((int) (byte) 100);
        orderProductBean0.setId_ordine((int) (byte) 0);
        orderProductBean0.setIVA((float) (short) 0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
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
        int int21 = prodottoBean8.getQuantita();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 1.0f + "'", float17 == 1.0f);
        org.junit.Assert.assertNull(tipo20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "", "", "hi!", "hi!", "hi!");
        java.lang.String str12 = utenteBean11.getUsername();
        utenteBean11.setPassword("");
        ita.kangaroo.model.tipo tipo15 = null;
        utenteBean11.setTipo(tipo15);
        utenteBean11.setProvincia("hi!");
        utenteBean11.setNome("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        utenteBean11.setCognome("hi!");
        utenteBean11.setNome("");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", "hi!", "", "", "hi!", tipo5, "", "", "Data non disponibile", "", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        java.lang.String str12 = utenteBean11.getEmail();
        java.lang.String str13 = utenteBean11.getVia();
        utenteBean11.setCitta("hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        ita.kangaroo.model.OrderProductBean orderProductBean0 = new ita.kangaroo.model.OrderProductBean();
        float float1 = orderProductBean0.getIVA();
        float float2 = orderProductBean0.getIVA();
        float float3 = orderProductBean0.getPrezzo();
        int int4 = orderProductBean0.getQuantita();
        orderProductBean0.setId_prodotto((int) '4');
        float float7 = orderProductBean0.getIVA();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        ita.kangaroo.model.tipo tipo7 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean8 = new ita.kangaroo.model.ProdottoBean((int) (byte) 1, "hi!", "hi!", "hi!", (float) (short) 1, (int) (short) -1, (float) (short) 1, tipo7);
        java.lang.String str9 = prodottoBean8.getDescrizione();
        java.lang.String str10 = prodottoBean8.getNome();
        ita.kangaroo.model.CartProduct cartProduct11 = new ita.kangaroo.model.CartProduct(prodottoBean8);
        prodottoBean8.setPrezzo((float) (byte) 0);
        float float14 = prodottoBean8.getIva();
        java.lang.String str15 = prodottoBean8.getImmagine();
        float float16 = prodottoBean8.getIva();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        ita.kangaroo.model.tipo tipo6 = null;
        ita.kangaroo.model.utenteBean utenteBean12 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo6, "hi!", "", "", "hi!", "");
        java.lang.String str13 = utenteBean12.getUsername();
        java.lang.String str14 = utenteBean12.getCap();
        java.sql.Date date22 = null;
        ita.kangaroo.model.OrdineBean ordineBean24 = new ita.kangaroo.model.OrdineBean((int) (short) 0, utenteBean12, (float) 10L, "", "Data non disponibile", "hi!", "hi!", "", "", date22, "hi!");
        ordineBean24.setDestinatario("");
        float float27 = ordineBean24.getPrezzo_totale();
        java.lang.String str28 = ordineBean24.getNumero_carta();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 10.0f + "'", float27 == 10.0f);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean12 = new ita.kangaroo.model.OrdineBean(utenteBean11);
        float float13 = ordineBean12.getPrezzo_totale();
        java.lang.String str14 = ordineBean12.getNumero_carta();
        ordineBean12.setNumero_carta("");
        ordineBean12.setPrezzo_totale((float) (short) 0);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        ita.kangaroo.model.tipo tipo5 = null;
        ita.kangaroo.model.utenteBean utenteBean11 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo5, "hi!", "", "", "hi!", "");
        utenteBean11.setEmail("hi!");
        utenteBean11.setPassword("hi!");
        utenteBean11.setCognome("Data non disponibile");
        utenteBean11.setTelefono("Data non disponibile");
        java.lang.String str20 = utenteBean11.getCap();
        utenteBean11.setCognome("");
        java.lang.String str23 = utenteBean11.getProvincia();
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
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
        ordineBean12.setPrezzo_totale((float) 1);
        int int27 = ordineBean12.getId();
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(date16);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        ita.kangaroo.model.AddressBean addressBean5 = new ita.kangaroo.model.AddressBean((int) (short) 0, "", "", "", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        ita.kangaroo.model.tipo tipo11 = null;
        ita.kangaroo.model.utenteBean utenteBean17 = new ita.kangaroo.model.utenteBean("hi!", "", "", "", "hi!", tipo11, "hi!", "", "", "hi!", "");
        ita.kangaroo.model.OrdineBean ordineBean18 = new ita.kangaroo.model.OrdineBean(utenteBean17);
        java.lang.String str19 = ordineBean18.getMetodo_di_spedizione();
        ordineBean18.setNumero_carta("");
        java.lang.String str22 = ordineBean18.getIndirizzo_di_spedizione();
        java.sql.Date date23 = null;
        ordineBean18.setData(date23);
        boolean boolean25 = addressBean5.equals((java.lang.Object) ordineBean18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
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
        ita.kangaroo.model.tipo tipo51 = null;
        ita.kangaroo.model.ProdottoBean prodottoBean52 = new ita.kangaroo.model.ProdottoBean((int) (byte) -1, "Data non disponibile", "Data non disponibile", "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}", (float) ' ', (int) ' ', (float) ' ', tipo51);
        java.lang.String str53 = prodottoBean52.getImmagine();
        cart0.addProduct(prodottoBean52);
        java.lang.String str55 = prodottoBean52.getImmagine();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(cartProductList16);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertNull(tipo41);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}" + "'", str53, "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}" + "'", str55, "ProdottoBean{id=1, descrizione='hi!', nome='hi!', immagine='', prezzo=1.0, quantita=-1, iva=1.0, tipo=null}");
    }
}

