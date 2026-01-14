package ita.kangaroo.controller;

import ita.kangaroo.dao.AddressDao;
import ita.kangaroo.dao.MetodoPagamentoDao;
import ita.kangaroo.dao.utenteDao;
import ita.kangaroo.model.AddressBean;
import ita.kangaroo.model.MetodoPagamentoBean;
import ita.kangaroo.model.utenteBean;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;
import java.sql.SQLException;
import java.util.ArrayList;

import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;

class UtenteServletTest {

    private HttpServletRequest request;
    private HttpServletResponse response;
    private HttpSession session;
    private ServletContext servletContext;
    private RequestDispatcher dispatcher;

    // DAO mock (no DB, no DataSource)
    private utenteDao clientDao;
    private AddressDao addressDao;
    private MetodoPagamentoDao paymentDao;

    @BeforeEach
    void setup() {
        request = mock(HttpServletRequest.class);
        response = mock(HttpServletResponse.class);
        session = mock(HttpSession.class);
        servletContext = mock(ServletContext.class);
        dispatcher = mock(RequestDispatcher.class);

        when(request.getSession()).thenReturn(session);

        clientDao = mock(utenteDao.class);
        addressDao = mock(AddressDao.class);
        paymentDao = mock(MetodoPagamentoDao.class);

        // rewire static DAO nel servlet
        UtenteServlet.clientModel = clientDao;
        UtenteServlet.addressmodel = addressDao;
        UtenteServlet.paymentmodel = paymentDao;
    }

    private UtenteServlet servlet() {
        UtenteServlet s = spy(new UtenteServlet());
        doReturn(servletContext).when(s).getServletContext();
        return s;
    }

    private utenteBean normalUser() {
        utenteBean u = new utenteBean();
        u.setUsername("mario");
        u.setEmail("mario@example.com");
        return u;
    }

    private utenteBean adminUser() {
        utenteBean u = new utenteBean();
        u.setUsername("admin");
        u.setEmail("provoloni@example.com");
        return u;
    }

    /**
     * Stubbiamo un metodo che può ritornare int o boolean senza sapere la firma precisa,
     * così evitiamo:
     * - doNothing su non-void
     * - thenReturn con tipo sbagliato
     * - chiamate al DAO reale (DataSource not configured)
     */
    private static Object successForReturnType(Method m) {
        Class<?> rt = m.getReturnType();
        if (rt == boolean.class || rt == Boolean.class) return true;
        if (rt == int.class || rt == Integer.class) return 1;
        return null; // fallback (se fosse void o altro)
    }

    // =========================
    // BASE FLOW
    // =========================

    @Test
    void whenNotLogged_redirectsToLogin() throws Exception {
        UtenteServlet s = servlet();
        when(session.getAttribute("utente")).thenReturn(null);

        s.doGet(request, response);

        verify(response).sendRedirect("LoginServlet");
    }

    @Test
    void whenAdmin_forwardsToAdminClientsNoFilter() throws Exception {
        UtenteServlet s = servlet();
        when(session.getAttribute("utente")).thenReturn(adminUser());

        when(servletContext.getRequestDispatcher("/AdminServlet?action=clientsNoFilter")).thenReturn(dispatcher);

        s.doGet(request, response);

        verify(dispatcher).forward(request, response);
        verify(response, never()).sendRedirect(anyString());
    }

    @Test
    void actionNull_forwardsClienteJsp_withAddressesAndPayments() throws Exception {
        UtenteServlet s = servlet();
        when(session.getAttribute("utente")).thenReturn(normalUser());
        when(request.getParameter("action")).thenReturn(null);

        when(addressDao.doRetrieveByClient(anyString())).thenReturn(new ArrayList<>());
        when(paymentDao.doRetrieveByClient(anyString())).thenReturn(new ArrayList<>());

        when(servletContext.getRequestDispatcher("/Cliente.jsp")).thenReturn(dispatcher);

        s.doGet(request, response);

        verify(request, atLeastOnce()).setAttribute(eq("addresses"), any(ArrayList.class));
        verify(request, atLeastOnce()).setAttribute(eq("payments"), any(ArrayList.class));
        verify(dispatcher).forward(request, response);
    }

    // =========================
    // MODIFY USER
    // =========================

    @Test
    void modify_valid_updatesUser_andForwardsClienteJsp() throws Exception {
        UtenteServlet s = servlet();
        utenteBean u = normalUser();
        when(session.getAttribute("utente")).thenReturn(u);

        when(request.getParameter("action")).thenReturn("modify");

        when(request.getParameter("nome")).thenReturn("Mario");
        when(request.getParameter("cognome")).thenReturn("Rossi");
        when(request.getParameter("indirizzo")).thenReturn("Via Roma 10");
        when(request.getParameter("citta")).thenReturn("Napoli");
        when(request.getParameter("provincia")).thenReturn("NA");
        when(request.getParameter("cap")).thenReturn("80100");
        when(request.getParameter("telefono")).thenReturn("123456789012");
        when(request.getParameter("email")).thenReturn("mario2@example.com");

        when(addressDao.doRetrieveByClient(anyString())).thenReturn(new ArrayList<>());
        when(paymentDao.doRetrieveByClient(anyString())).thenReturn(new ArrayList<>());

        // doModify nel tuo progetto ritorna (quasi certamente) int, ma qui non rischiamo:
        // se fosse boolean, basta cambiare sotto a true.
        when(clientDao.doModify(any(utenteBean.class))).thenReturn(1);

        when(servletContext.getRequestDispatcher("/Cliente.jsp")).thenReturn(dispatcher);

        s.doGet(request, response);

        verify(clientDao).doModify(any(utenteBean.class));
        verify(dispatcher).forward(request, response);
    }

    // =========================
    // ADD PAYMENT
    // =========================

    @Test
    void addPaymentCard_valid_savesAndAddsToPayments_thenForwards() throws Exception {
        UtenteServlet s = servlet();
        utenteBean u = normalUser();
        when(session.getAttribute("utente")).thenReturn(u);

        when(request.getParameter("action")).thenReturn("addPaymentCard");

        when(request.getParameter("numero_carta")).thenReturn("4111111111111111");
        when(request.getParameter("cvv")).thenReturn("123");
        when(request.getParameter("data_scadenza")).thenReturn("2030-12-31");
        when(request.getParameter("circuito")).thenReturn("VISA");

        when(addressDao.doRetrieveByClient(anyString())).thenReturn(new ArrayList<>());
        when(paymentDao.doRetrieveByClient(anyString())).thenReturn(new ArrayList<>());

        when(paymentDao.doSave(any(MetodoPagamentoBean.class))).thenReturn(77);

        when(servletContext.getRequestDispatcher("/Cliente.jsp")).thenReturn(dispatcher);

        s.doGet(request, response);

        verify(paymentDao).doSave(any(MetodoPagamentoBean.class));
        verify(request, atLeastOnce()).setAttribute(eq("payments"), any(ArrayList.class));
        verify(dispatcher).forward(request, response);
    }

    // =========================
    // DELETE PAYMENT  ✅ FIX DataSource
    // =========================

    @Test
    void deletePaymentCard_valid_retrievesRemovesAndDeletes_thenForwards() throws Exception {
        UtenteServlet s = servlet();
        utenteBean u = normalUser();
        when(session.getAttribute("utente")).thenReturn(u);

        when(request.getParameter("action")).thenReturn("deletePaymentCard");
        when(request.getParameter("id_carta")).thenReturn("10");

        ArrayList<AddressBean> addresses = new ArrayList<>();
        ArrayList<MetodoPagamentoBean> payments = new ArrayList<>();

        MetodoPagamentoBean card = new MetodoPagamentoBean();
        card.setId(10);
        payments.add(card);

        when(addressDao.doRetrieveByClient(anyString())).thenReturn(addresses);
        when(paymentDao.doRetrieveByClient(anyString())).thenReturn(payments);

        when(paymentDao.doRetrieveByKey(10)).thenReturn(card);

        // >>> IMPORTANTISSIMO: stub doDelete senza chiamare quello reale
        doAnswer(inv -> successForReturnType(inv.getMethod()))
                .when(paymentDao).doDelete(anyInt());

        when(servletContext.getRequestDispatcher("/Cliente.jsp")).thenReturn(dispatcher);

        s.doGet(request, response);

        verify(paymentDao).doDelete(10);
        verify(request, atLeastOnce()).setAttribute(eq("payments"), any(ArrayList.class));
        verify(dispatcher).forward(request, response);
    }

    // =========================
    // ADD ADDRESS
    // =========================

    @Test
    void addAddress_valid_savesAndAddsToAddresses_thenForwards() throws Exception {
        UtenteServlet s = servlet();
        utenteBean u = normalUser();
        when(session.getAttribute("utente")).thenReturn(u);

        when(request.getParameter("action")).thenReturn("addAddress");
        when(request.getParameter("via_indirizzo")).thenReturn("Via Milano 12");
        when(request.getParameter("citta_indirizzo")).thenReturn("Roma");
        when(request.getParameter("CAP_indirizzo")).thenReturn("00100");

        when(addressDao.doRetrieveByClient(anyString())).thenReturn(new ArrayList<>());
        when(paymentDao.doRetrieveByClient(anyString())).thenReturn(new ArrayList<>());

        when(addressDao.doSave(any(AddressBean.class))).thenReturn(55);

        when(servletContext.getRequestDispatcher("/Cliente.jsp")).thenReturn(dispatcher);

        s.doGet(request, response);

        verify(addressDao).doSave(any(AddressBean.class));
        verify(request, atLeastOnce()).setAttribute(eq("addresses"), any(ArrayList.class));
        verify(dispatcher).forward(request, response);
    }

    // =========================
    // DELETE ADDRESS ✅ FIX DataSource
    // =========================

    @Test
    void deleteAddress_valid_retrievesRemovesAndDeletes_thenForwards() throws Exception {
        UtenteServlet s = servlet();
        utenteBean u = normalUser();
        when(session.getAttribute("utente")).thenReturn(u);

        when(request.getParameter("action")).thenReturn("deleteAddress");
        when(request.getParameter("id_indirizzo")).thenReturn("5");

        ArrayList<AddressBean> addresses = new ArrayList<>();
        ArrayList<MetodoPagamentoBean> payments = new ArrayList<>();

        AddressBean a = new AddressBean();
        a.setId(5);
        addresses.add(a);

        when(addressDao.doRetrieveByClient(anyString())).thenReturn(addresses);
        when(paymentDao.doRetrieveByClient(anyString())).thenReturn(payments);

        when(addressDao.doRetrieveByKey(5)).thenReturn(a);

        // >>> IMPORTANTISSIMO: stub doDelete senza chiamare quello reale
        doAnswer(inv -> successForReturnType(inv.getMethod()))
                .when(addressDao).doDelete(anyInt());

        when(servletContext.getRequestDispatcher("/Cliente.jsp")).thenReturn(dispatcher);

        s.doGet(request, response);

        verify(addressDao).doDelete(5);
        verify(request, atLeastOnce()).setAttribute(eq("addresses"), any(ArrayList.class));
        verify(dispatcher).forward(request, response);
    }

    // =========================
    // ERROR PATH
    // =========================

    @Test
    void modify_invalid_triggersSendError_andForwards() throws Exception {
        UtenteServlet s = servlet();
        utenteBean u = normalUser();
        when(session.getAttribute("utente")).thenReturn(u);

        when(request.getParameter("action")).thenReturn("modify");

        // nome invalido
        when(request.getParameter("nome")).thenReturn("Mario123");
        when(request.getParameter("cognome")).thenReturn("Rossi");
        when(request.getParameter("indirizzo")).thenReturn("Via Roma 10");
        when(request.getParameter("citta")).thenReturn("Napoli");
        when(request.getParameter("provincia")).thenReturn("NA");
        when(request.getParameter("cap")).thenReturn("80100");
        when(request.getParameter("telefono")).thenReturn("123456789012");
        when(request.getParameter("email")).thenReturn("mario@example.com");

        when(addressDao.doRetrieveByClient(anyString())).thenReturn(new ArrayList<>());
        when(paymentDao.doRetrieveByClient(anyString())).thenReturn(new ArrayList<>());

        when(servletContext.getRequestDispatcher("/Cliente.jsp")).thenReturn(dispatcher);

        s.doGet(request, response);

        verify(request, atLeastOnce()).setAttribute(eq("error"), anyString());
        verify(dispatcher).forward(request, response);
    }

    @Test
    void addressRetrieve_sqlException_redirectsGeneralError() throws Exception {
        UtenteServlet s = servlet();
        when(session.getAttribute("utente")).thenReturn(normalUser());

        when(addressDao.doRetrieveByClient(anyString())).thenThrow(new SQLException("DB down"));

        s.doGet(request, response);

        verify(response).sendRedirect("./ErrorPage/generalError.jsp");
    }
}
