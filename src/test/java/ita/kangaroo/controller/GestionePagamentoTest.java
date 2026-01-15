package ita.kangaroo.controller;

import ita.kangaroo.dao.*;
import ita.kangaroo.model.*;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;
import java.util.ArrayList;

import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;

class GestionePagamentoTest {

    private HttpServletRequest request;
    private HttpServletResponse response;
    private HttpSession session;
    private ServletContext servletContext;
    private RequestDispatcher dispatcher;

    private OrdineDao orderModel;
    private prodottoDao prodottoModel;
    private AddressDao addressModel;
    private MetodoPagamentoDao paymentModel;
    private FatturazioneDao invoiceModel;

    @BeforeEach
    void setup() {
        request = mock(HttpServletRequest.class);
        response = mock(HttpServletResponse.class);
        session = mock(HttpSession.class);
        servletContext = mock(ServletContext.class);
        dispatcher = mock(RequestDispatcher.class);

        when(request.getSession()).thenReturn(session);

        // Mock DAO per evitare DB/JNDI
        orderModel = mock(OrdineDao.class);
        prodottoModel = mock(prodottoDao.class);
        addressModel = mock(AddressDao.class);
        paymentModel = mock(MetodoPagamentoDao.class);
        invoiceModel = mock(FatturazioneDao.class);

        // Rewire static DAO nel servlet
        GestionePagamento.orderModel = orderModel;
        GestionePagamento.prodottoModel = prodottoModel;
        GestionePagamento.addressmodel = addressModel;
        GestionePagamento.paymentmodel = paymentModel;
        GestionePagamento.invoicemodel = invoiceModel;
    }

    private GestionePagamento servlet() {
        GestionePagamento s = spy(new GestionePagamento());
        doReturn(servletContext).when(s).getServletContext();
        return s;
    }

    private utenteBean loggedUser() {
        utenteBean u = new utenteBean();
        u.setEmail("mario@example.com");
        u.setUsername("mario");
        return u;
    }

    @Test
    void actionNull_forwardsToCheckout() throws Exception {
        GestionePagamento s = servlet();
        when(request.getParameter("action")).thenReturn(null);

        when(servletContext.getRequestDispatcher("/checkout.jsp")).thenReturn(dispatcher);

        s.doGet(request, response);

        verify(dispatcher).forward(request, response);
        verify(response, never()).sendRedirect(anyString());
    }

    @Test
    void actionBuy_forwardsToCheckout() throws Exception {
        GestionePagamento s = servlet();
        when(request.getParameter("action")).thenReturn("buy");

        when(servletContext.getRequestDispatcher("/checkout.jsp")).thenReturn(dispatcher);

        s.doGet(request, response);

        verify(dispatcher).forward(request, response);
        verify(response, never()).sendRedirect(anyString());
    }

    @Test
    void invalidDestinatario_callsSendError_andForwardsCheckout() throws Exception {
        GestionePagamento s = servlet();
        when(request.getParameter("action")).thenReturn("confirm_buy");

        // parsati prima della validazione
        when(request.getParameter("carta")).thenReturn("1");
        when(request.getParameter("indirizzo")).thenReturn("1");

        // destinatario invalido
        when(request.getParameter("destinatario")).thenReturn("Mario123");
        when(request.getParameter("note")).thenReturn("Nota");
        when(request.getParameter("spedizione")).thenReturn("Standard");
        when(request.getParameter("metodo_di_pagamento")).thenReturn("carta_di_credito");

        when(servletContext.getRequestDispatcher("/checkout.jsp")).thenReturn(dispatcher);

        s.doGet(request, response);

        verify(request).setAttribute(eq("error"), contains("problema durante il pagamento"));
        verify(dispatcher).forward(request, response);
        verify(response, never()).sendRedirect(anyString());
    }

    @Test
    void emptyCart_redirectsToCartError() throws Exception {
        GestionePagamento s = servlet();

        when(request.getParameter("action")).thenReturn("confirm_buy");
        when(session.getAttribute("cart")).thenReturn(null);
        when(session.getAttribute("utente")).thenReturn(loggedUser());

        // parametri letti prima del controllo cart
        when(request.getParameter("carta")).thenReturn("1");
        when(request.getParameter("indirizzo")).thenReturn("1");
        when(request.getParameter("destinatario")).thenReturn("Mario Rossi");
        when(request.getParameter("note")).thenReturn("Nota");
        when(request.getParameter("spedizione")).thenReturn("Standard");
        when(request.getParameter("metodo_di_pagamento")).thenReturn("carta_di_credito");

        when(orderModel.lastOrder()).thenReturn(null);

        s.doGet(request, response);

        verify(response).sendRedirect("./ErrorPage/cartError.jsp");
    }

    @Test
    void confirmBuy_happyPath_savesOrder_updatesQuantities_savesInvoice_andRedirectsCatalogo() throws Exception {
        GestionePagamento s = servlet();

        when(request.getParameter("action")).thenReturn("confirm_buy");
        when(session.getAttribute("utente")).thenReturn(loggedUser());

        // cart con 1 prodotto quantità 2
        Cart cart = mock(Cart.class);
        CartProduct cp = mock(CartProduct.class);

        ProdottoBean prodInCart = new ProdottoBean();
        prodInCart.setId(10);
        prodInCart.setPrezzo(50f);
        prodInCart.setIva(22f);
        prodInCart.setQuantita(10);

        when(cp.getProduct()).thenReturn(prodInCart);
        when(cp.getQuantity()).thenReturn(2);

        ArrayList<CartProduct> cps = new ArrayList<>();
        cps.add(cp);

        when(cart.getProducts()).thenReturn(cps);
        when(session.getAttribute("cart")).thenReturn(cart);

        // request params
        when(request.getParameter("carta")).thenReturn("1");
        when(request.getParameter("indirizzo")).thenReturn("2");
        when(request.getParameter("destinatario")).thenReturn("Mario Rossi");
        when(request.getParameter("note")).thenReturn("Nota");
        when(request.getParameter("spedizione")).thenReturn("Standard");
        when(request.getParameter("metodo_di_pagamento")).thenReturn("carta_di_credito");

        // last order
        OrdineBean last = new OrdineBean();
        last.setId(7);
        when(orderModel.lastOrder()).thenReturn(last);

        // payment
        MetodoPagamentoBean mp = new MetodoPagamentoBean();
        mp.setCircuito("VISA");
        mp.setNumero_carta("4111111111111111");
        when(paymentModel.doRetrieveByKey(1)).thenReturn(mp);

        // address
        AddressBean ab = new AddressBean();
        ab.setVia("Via Roma");
        ab.setCitta("Napoli");
        when(addressModel.doRetrieveByKey(2)).thenReturn(ab);

        // prodottoModel: rilegge e poi updateQuantity
        ProdottoBean prodDb = new ProdottoBean();
        prodDb.setId(10);
        prodDb.setQuantita(10);
        when(prodottoModel.doRetrieveByKey(10)).thenReturn(prodDb);

        // metodi void: doNothing
        doNothing().when(orderModel).doSave(any(OrdineBean.class));
        doNothing().when(prodottoModel).updateQuantity(anyInt(), anyInt());
        doNothing().when(invoiceModel).doSave(any(FatturazioneBean.class));

        s.doGet(request, response);

        verify(orderModel).doSave(any(OrdineBean.class));
        verify(prodottoModel).updateQuantity(eq(10), eq(8));
        verify(invoiceModel).doSave(any(FatturazioneBean.class));

        verify(session).removeAttribute("cart");
        verify(session).setAttribute("cart", null);

        verify(response).sendRedirect("GestioneCatalogo");
    }

    @Test
    void confirmBuy_productsNotAvailable_redirectsToGeneralError() throws Exception {
        GestionePagamento s = servlet();

        when(request.getParameter("action")).thenReturn("confirm_buy");
        when(session.getAttribute("utente")).thenReturn(loggedUser());

        Cart cart = mock(Cart.class);
        CartProduct cp = mock(CartProduct.class);

        ProdottoBean prodInCart = new ProdottoBean();
        prodInCart.setId(10);
        prodInCart.setPrezzo(50f);
        prodInCart.setIva(22f);
        prodInCart.setQuantita(1); // disponibile 1

        when(cp.getProduct()).thenReturn(prodInCart);
        when(cp.getQuantity()).thenReturn(2); // richiesti 2 -> KO

        ArrayList<CartProduct> cps = new ArrayList<>();
        cps.add(cp);

        when(cart.getProducts()).thenReturn(cps);
        when(session.getAttribute("cart")).thenReturn(cart);

        when(request.getParameter("carta")).thenReturn("1");
        when(request.getParameter("indirizzo")).thenReturn("2");
        when(request.getParameter("destinatario")).thenReturn("Mario Rossi");
        when(request.getParameter("note")).thenReturn("Nota");
        when(request.getParameter("spedizione")).thenReturn("Standard");
        when(request.getParameter("metodo_di_pagamento")).thenReturn("carta_di_credito");

        when(orderModel.lastOrder()).thenReturn(null);

        MetodoPagamentoBean mp = new MetodoPagamentoBean();
        mp.setCircuito("VISA");
        mp.setNumero_carta("4111");
        when(paymentModel.doRetrieveByKey(1)).thenReturn(mp);

        AddressBean ab = new AddressBean();
        ab.setVia("Via Roma");
        ab.setCitta("Napoli");
        when(addressModel.doRetrieveByKey(2)).thenReturn(ab);

        s.doGet(request, response);

        verify(response).sendRedirect("./ErrorPage/generalError.jsp");
        verify(orderModel, never()).doSave(any());
        verify(invoiceModel, never()).doSave(any());
        verify(prodottoModel, never()).updateQuantity(anyInt(), anyInt());
    }

    @Test
    void lastOrder_sqlException_redirectsToGeneralError() throws Exception {
        GestionePagamento s = servlet();

        when(request.getParameter("action")).thenReturn("confirm_buy");
        when(session.getAttribute("utente")).thenReturn(loggedUser());

        // cart non vuoto altrimenti va su cartError
        Cart cart = mock(Cart.class);
        when(cart.getProducts()).thenReturn(new ArrayList<>());
        when(session.getAttribute("cart")).thenReturn(cart);

        when(request.getParameter("carta")).thenReturn("1");
        when(request.getParameter("indirizzo")).thenReturn("2");
        when(request.getParameter("destinatario")).thenReturn("Mario Rossi");
        when(request.getParameter("note")).thenReturn("Nota");
        when(request.getParameter("spedizione")).thenReturn("Standard");
        when(request.getParameter("metodo_di_pagamento")).thenReturn("carta_di_credito");

        when(orderModel.lastOrder()).thenThrow(new SQLException("DB down"));

        s.doGet(request, response);

        verify(response).sendRedirect("./ErrorPage/generalError.jsp");
    }
    @Test
    void actionEmpty_forwardsToCheckout() throws Exception {
        GestionePagamento s = servlet();
        when(request.getParameter("action")).thenReturn("");

        when(servletContext.getRequestDispatcher("/checkout.jsp")).thenReturn(dispatcher);

        s.doGet(request, response);

        verify(dispatcher).forward(request, response);
        verify(response, never()).sendRedirect(anyString());
    }

    @Test
    void invalidSpedizione_callsSendError_andForwardsCheckout() throws Exception {
        GestionePagamento s = servlet();
        when(request.getParameter("action")).thenReturn("confirm_buy");

        // parametri letti prima e durante la validazione
        when(request.getParameter("carta")).thenReturn("1");
        when(request.getParameter("indirizzo")).thenReturn("1");
        when(request.getParameter("destinatario")).thenReturn("Mario Rossi");
        when(request.getParameter("note")).thenReturn("Nota");
        when(request.getParameter("spedizione")).thenReturn("Teleport"); // invalido
        when(request.getParameter("metodo_di_pagamento")).thenReturn("carta_di_credito");

        when(servletContext.getRequestDispatcher("/checkout.jsp")).thenReturn(dispatcher);

        // lastOrder viene chiamata sempre prima del check cart nel tuo codice
        when(orderModel.lastOrder()).thenReturn(null);

        // cart non vuoto: serve per non finire in cartError dopo lastOrder
        Cart cart = mock(Cart.class);
        when(cart.getProducts()).thenReturn(new ArrayList<>() {{ add(mock(CartProduct.class)); }});
        when(session.getAttribute("cart")).thenReturn(cart);
        when(session.getAttribute("utente")).thenReturn(loggedUser());

        s.doGet(request, response);

        verify(request).setAttribute(eq("error"), contains("problema durante il pagamento"));
        verify(dispatcher).forward(request, response);
    }

    @Test
    void invalidNote_callsSendError_andForwardsCheckout() throws Exception {
        GestionePagamento s = servlet();
        when(request.getParameter("action")).thenReturn("confirm_buy");

        when(request.getParameter("carta")).thenReturn("1");
        when(request.getParameter("indirizzo")).thenReturn("1");
        when(request.getParameter("destinatario")).thenReturn("Mario Rossi");
        when(request.getParameter("note")).thenReturn("Nota123"); // invalido (solo lettere/spazi)
        when(request.getParameter("spedizione")).thenReturn("Standard");
        when(request.getParameter("metodo_di_pagamento")).thenReturn("carta_di_credito");

        when(servletContext.getRequestDispatcher("/checkout.jsp")).thenReturn(dispatcher);
        when(orderModel.lastOrder()).thenReturn(null);

        Cart cart = mock(Cart.class);
        when(cart.getProducts()).thenReturn(new ArrayList<>() {{ add(mock(CartProduct.class)); }});
        when(session.getAttribute("cart")).thenReturn(cart);
        when(session.getAttribute("utente")).thenReturn(loggedUser());

        s.doGet(request, response);

        verify(request).setAttribute(eq("error"), contains("problema durante il pagamento"));
        verify(dispatcher).forward(request, response);
    }

    @Test
    void invalidMetodoPagamento_callsSendError_andForwardsCheckout() throws Exception {
        GestionePagamento s = servlet();
        when(request.getParameter("action")).thenReturn("confirm_buy");

        when(request.getParameter("carta")).thenReturn("1");
        when(request.getParameter("indirizzo")).thenReturn("1");
        when(request.getParameter("destinatario")).thenReturn("Mario Rossi");
        when(request.getParameter("note")).thenReturn("Nota");
        when(request.getParameter("spedizione")).thenReturn("Standard");
        when(request.getParameter("metodo_di_pagamento")).thenReturn("Bitcoin"); // invalido

        when(servletContext.getRequestDispatcher("/checkout.jsp")).thenReturn(dispatcher);
        when(orderModel.lastOrder()).thenReturn(null);

        Cart cart = mock(Cart.class);
        when(cart.getProducts()).thenReturn(new ArrayList<>() {{ add(mock(CartProduct.class)); }});
        when(session.getAttribute("cart")).thenReturn(cart);
        when(session.getAttribute("utente")).thenReturn(loggedUser());

        s.doGet(request, response);

        verify(request).setAttribute(eq("error"), contains("problema durante il pagamento"));
        verify(dispatcher).forward(request, response);
    }

    @Test
    void confirmBuy_cartaEmpty_setsIdCartaZero_thenPaymentRetrieveSqlException_redirectsGeneralError() throws Exception {
        GestionePagamento s = servlet();

        when(request.getParameter("action")).thenReturn("confirm_buy");
        when(session.getAttribute("utente")).thenReturn(loggedUser());

        // cart con 1 prodotto coerente
        Cart cart = mock(Cart.class);
        CartProduct cp = mock(CartProduct.class);
        ProdottoBean prod = new ProdottoBean();
        prod.setId(10); prod.setPrezzo(10f); prod.setIva(22f); prod.setQuantita(10);
        when(cp.getProduct()).thenReturn(prod);
        when(cp.getQuantity()).thenReturn(1);
        when(cart.getProducts()).thenReturn(new ArrayList<>() {{ add(cp); }});
        when(session.getAttribute("cart")).thenReturn(cart);

        when(request.getParameter("carta")).thenReturn(""); // ramo idcarta=0
        when(request.getParameter("indirizzo")).thenReturn("2");
        when(request.getParameter("destinatario")).thenReturn("Mario Rossi");
        when(request.getParameter("note")).thenReturn("Nota");
        when(request.getParameter("spedizione")).thenReturn("Standard");
        when(request.getParameter("metodo_di_pagamento")).thenReturn("carta_di_credito");

        when(orderModel.lastOrder()).thenReturn(null);

        // quando prova a fare doRetrieveByKey(0) fallisce -> generalError
        when(paymentModel.doRetrieveByKey(0)).thenThrow(new SQLException("no card"));

        s.doGet(request, response);

        verify(response).sendRedirect("./ErrorPage/generalError.jsp");
    }

    @Test
    void confirmBuy_paymentCircuitSqlException_redirectsGeneralError() throws Exception {
        GestionePagamento s = servlet();
        when(request.getParameter("action")).thenReturn("confirm_buy");
        when(session.getAttribute("utente")).thenReturn(loggedUser());

        Cart cart = mock(Cart.class);
        CartProduct cp = mock(CartProduct.class);
        ProdottoBean prod = new ProdottoBean();
        prod.setId(10); prod.setPrezzo(10f); prod.setIva(22f); prod.setQuantita(10);
        when(cp.getProduct()).thenReturn(prod);
        when(cp.getQuantity()).thenReturn(1);
        when(cart.getProducts()).thenReturn(new ArrayList<>() {{ add(cp); }});
        when(session.getAttribute("cart")).thenReturn(cart);

        when(request.getParameter("carta")).thenReturn("1");
        when(request.getParameter("indirizzo")).thenReturn("2");
        when(request.getParameter("destinatario")).thenReturn("Mario Rossi");
        when(request.getParameter("note")).thenReturn("Nota");
        when(request.getParameter("spedizione")).thenReturn("Standard");
        when(request.getParameter("metodo_di_pagamento")).thenReturn("carta_di_credito");

        when(orderModel.lastOrder()).thenReturn(null);

        // primo retrieve (circuito) lancia
        when(paymentModel.doRetrieveByKey(1)).thenThrow(new SQLException("boom"));

        s.doGet(request, response);

        verify(response).sendRedirect("./ErrorPage/generalError.jsp");
    }

    @Test
    void confirmBuy_paymentNumeroSqlException_redirectsGeneralError() throws Exception {
        GestionePagamento s = servlet();
        when(request.getParameter("action")).thenReturn("confirm_buy");
        when(session.getAttribute("utente")).thenReturn(loggedUser());

        Cart cart = mock(Cart.class);
        CartProduct cp = mock(CartProduct.class);
        ProdottoBean prod = new ProdottoBean();
        prod.setId(10); prod.setPrezzo(10f); prod.setIva(22f); prod.setQuantita(10);
        when(cp.getProduct()).thenReturn(prod);
        when(cp.getQuantity()).thenReturn(1);
        when(cart.getProducts()).thenReturn(new ArrayList<>() {{ add(cp); }});
        when(session.getAttribute("cart")).thenReturn(cart);

        when(request.getParameter("carta")).thenReturn("1");
        when(request.getParameter("indirizzo")).thenReturn("2");
        when(request.getParameter("destinatario")).thenReturn("Mario Rossi");
        when(request.getParameter("note")).thenReturn("Nota");
        when(request.getParameter("spedizione")).thenReturn("Standard");
        when(request.getParameter("metodo_di_pagamento")).thenReturn("carta_di_credito");

        when(orderModel.lastOrder()).thenReturn(null);

        // prima chiamata ok, seconda esplode
        MetodoPagamentoBean mp = new MetodoPagamentoBean();
        mp.setCircuito("VISA");
        when(paymentModel.doRetrieveByKey(1)).thenReturn(mp)
                .thenThrow(new SQLException("boom2"));

        s.doGet(request, response);

        verify(response).sendRedirect("./ErrorPage/generalError.jsp");
    }

    @Test
    void confirmBuy_addressRetrieveSqlException_redirectsGeneralError() throws Exception {
        GestionePagamento s = servlet();
        when(request.getParameter("action")).thenReturn("confirm_buy");
        when(session.getAttribute("utente")).thenReturn(loggedUser());

        Cart cart = mock(Cart.class);
        CartProduct cp = mock(CartProduct.class);
        ProdottoBean prod = new ProdottoBean();
        prod.setId(10); prod.setPrezzo(10f); prod.setIva(22f); prod.setQuantita(10);
        when(cp.getProduct()).thenReturn(prod);
        when(cp.getQuantity()).thenReturn(1);
        when(cart.getProducts()).thenReturn(new ArrayList<>() {{ add(cp); }});
        when(session.getAttribute("cart")).thenReturn(cart);

        when(request.getParameter("carta")).thenReturn("1");
        when(request.getParameter("indirizzo")).thenReturn("2");
        when(request.getParameter("destinatario")).thenReturn("Mario Rossi");
        when(request.getParameter("note")).thenReturn("Nota");
        when(request.getParameter("spedizione")).thenReturn("Standard");
        when(request.getParameter("metodo_di_pagamento")).thenReturn("carta_di_credito");

        when(orderModel.lastOrder()).thenReturn(null);

        MetodoPagamentoBean mp = new MetodoPagamentoBean();
        mp.setCircuito("VISA");
        mp.setNumero_carta("4111111111111111");
        when(paymentModel.doRetrieveByKey(1)).thenReturn(mp);

        when(addressModel.doRetrieveByKey(2)).thenThrow(new SQLException("boom"));

        s.doGet(request, response);

        verify(response).sendRedirect("./ErrorPage/generalError.jsp");
    }

    @Test
    void confirmBuy_orderSaveSqlException_redirectsGeneralError() throws Exception {
        GestionePagamento s = servlet();
        when(request.getParameter("action")).thenReturn("confirm_buy");
        when(session.getAttribute("utente")).thenReturn(loggedUser());

        Cart cart = mock(Cart.class);
        CartProduct cp = mock(CartProduct.class);
        ProdottoBean prod = new ProdottoBean();
        prod.setId(10); prod.setPrezzo(10f); prod.setIva(22f); prod.setQuantita(10);
        when(cp.getProduct()).thenReturn(prod);
        when(cp.getQuantity()).thenReturn(1);
        when(cart.getProducts()).thenReturn(new ArrayList<>() {{ add(cp); }});
        when(session.getAttribute("cart")).thenReturn(cart);

        when(request.getParameter("carta")).thenReturn("1");
        when(request.getParameter("indirizzo")).thenReturn("2");
        when(request.getParameter("destinatario")).thenReturn("Mario Rossi");
        when(request.getParameter("note")).thenReturn("Nota");
        when(request.getParameter("spedizione")).thenReturn("Standard");
        when(request.getParameter("metodo_di_pagamento")).thenReturn("carta_di_credito");

        when(orderModel.lastOrder()).thenReturn(null);

        MetodoPagamentoBean mp = new MetodoPagamentoBean();
        mp.setCircuito("VISA");
        mp.setNumero_carta("4111111111111111");
        when(paymentModel.doRetrieveByKey(1)).thenReturn(mp);

        AddressBean ab = new AddressBean();
        ab.setVia("Via Roma");
        ab.setCitta("Napoli");
        when(addressModel.doRetrieveByKey(2)).thenReturn(ab);

        // forza eccezione nel blocco try principale
        doThrow(new SQLException("boom")).when(orderModel).doSave(any(OrdineBean.class));

        s.doGet(request, response);

        verify(response).sendRedirect("./ErrorPage/generalError.jsp");
    }

    @Test
    void confirmBuy_invoiceSaveSqlException_redirectsGeneralError() throws Exception {
        GestionePagamento s = servlet();
        when(request.getParameter("action")).thenReturn("confirm_buy");
        when(session.getAttribute("utente")).thenReturn(loggedUser());

        Cart cart = mock(Cart.class);
        CartProduct cp = mock(CartProduct.class);
        ProdottoBean prod = new ProdottoBean();
        prod.setId(10); prod.setPrezzo(10f); prod.setIva(22f); prod.setQuantita(10);
        when(cp.getProduct()).thenReturn(prod);
        when(cp.getQuantity()).thenReturn(1);
        when(cart.getProducts()).thenReturn(new ArrayList<>() {{ add(cp); }});
        when(session.getAttribute("cart")).thenReturn(cart);

        when(request.getParameter("carta")).thenReturn("1");
        when(request.getParameter("indirizzo")).thenReturn("2");
        when(request.getParameter("destinatario")).thenReturn("Mario Rossi");
        when(request.getParameter("note")).thenReturn("Nota");
        when(request.getParameter("spedizione")).thenReturn("Express"); // per coprire totale+5
        when(request.getParameter("metodo_di_pagamento")).thenReturn("carta_di_credito");

        when(orderModel.lastOrder()).thenReturn(null);

        MetodoPagamentoBean mp = new MetodoPagamentoBean();
        mp.setCircuito("VISA");
        mp.setNumero_carta("4111111111111111");
        when(paymentModel.doRetrieveByKey(1)).thenReturn(mp);

        AddressBean ab = new AddressBean();
        ab.setVia("Via Roma");
        ab.setCitta("Napoli");
        when(addressModel.doRetrieveByKey(2)).thenReturn(ab);

        ProdottoBean prodDb = new ProdottoBean();
        prodDb.setId(10);
        prodDb.setQuantita(10);
        when(prodottoModel.doRetrieveByKey(10)).thenReturn(prodDb);

        doNothing().when(orderModel).doSave(any(OrdineBean.class));
        doNothing().when(prodottoModel).updateQuantity(anyInt(), anyInt());

        doThrow(new SQLException("invoice boom")).when(invoiceModel).doSave(any(FatturazioneBean.class));

        s.doGet(request, response);

        verify(response).sendRedirect("./ErrorPage/generalError.jsp");
    }

    @Test
    void doPost_delegatesToDoGet_withoutExecutingDoGet() throws Exception {
        GestionePagamento s = spy(new GestionePagamento());
        doReturn(servletContext).when(s).getServletContext();
        doNothing().when(s).doGet(any(HttpServletRequest.class), any(HttpServletResponse.class));

        s.doPost(request, response);

        verify(s, times(1)).doGet(request, response);
    }





}
