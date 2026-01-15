package ita.kangaroo.controller;

import ita.kangaroo.dao.AddressDao;
import ita.kangaroo.dao.MetodoPagamentoDao;
import ita.kangaroo.dao.utenteDao;
import ita.kangaroo.model.AddressBean;
import ita.kangaroo.model.MetodoPagamentoBean;
import ita.kangaroo.model.utenteBean;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.sql.SQLException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class UtenteServletTest {

    private UtenteServlet servlet;

    @Mock private HttpServletRequest request;
    @Mock private HttpServletResponse response;
    @Mock private HttpSession session;

    @Mock private ServletConfig servletConfig;
    @Mock private ServletContext servletContext;

    @Mock private RequestDispatcher dispatcherCliente;
    @Mock private RequestDispatcher dispatcherAdmin;

    @Mock private utenteDao clientModel;
    @Mock private AddressDao addressModel;
    @Mock private MetodoPagamentoDao paymentModel;

    private utenteBean utente;

    @BeforeEach
    void setUp() throws Exception {
        servlet = new UtenteServlet();

        UtenteServlet.clientModel = clientModel;
        UtenteServlet.addressmodel = addressModel;
        UtenteServlet.paymentmodel = paymentModel;

        // init container-like
        lenient().when(servletConfig.getServletContext()).thenReturn(servletContext);
        servlet.init(servletConfig);

        utente = mock(utenteBean.class);

        lenient().when(request.getSession()).thenReturn(session);
        lenient().when(session.getAttribute("utente")).thenReturn(utente);

        lenient().when(servletContext.getRequestDispatcher("/Cliente.jsp")).thenReturn(dispatcherCliente);
        lenient().when(servletContext.getRequestDispatcher("/AdminServlet?action=clientsNoFilter"))
                .thenReturn(dispatcherAdmin);
    }

    @Test
    void doGet_userNull_redirectsToLoginServlet() throws Exception {
        when(session.getAttribute("utente")).thenReturn(null);

        servlet.doGet(request, response);

        verify(response).sendRedirect("LoginServlet");
        verifyNoInteractions(dispatcherCliente, dispatcherAdmin);
    }

    @Test
    void doGet_adminUser_forwardsToAdminServlet() throws Exception {
        when(utente.getEmail()).thenReturn("provoloni@example.com");

        servlet.doGet(request, response);

        verify(dispatcherAdmin).forward(request, response);
        verify(dispatcherCliente, never()).forward(request, response);
    }

    @Test
    void doGet_noAction_forwardsClienteAndSetsLists() throws Exception {
        when(utente.getEmail()).thenReturn("user@example.com");
        when(utente.getUsername()).thenReturn("mario");

        ArrayList<AddressBean> addresses = new ArrayList<>();
        ArrayList<MetodoPagamentoBean> payments = new ArrayList<>();

        when(addressModel.doRetrieveByClient("mario")).thenReturn(addresses);
        when(paymentModel.doRetrieveByClient("mario")).thenReturn(payments);

        when(request.getParameter("action")).thenReturn(null);

        servlet.doGet(request, response);

        verify(request).setAttribute("addresses", addresses);
        verify(request).setAttribute("payments", payments);
        verify(dispatcherCliente).forward(request, response);
    }

    @Test
    void doGet_modify_invalidName_triggersSendError_forwardCliente() throws Exception {
        when(utente.getEmail()).thenReturn("user@example.com");
        when(utente.getUsername()).thenReturn("mario");

        when(addressModel.doRetrieveByClient("mario")).thenReturn(new ArrayList<>());
        when(paymentModel.doRetrieveByClient("mario")).thenReturn(new ArrayList<>());

        when(request.getParameter("action")).thenReturn("modify");

        when(request.getParameter("nome")).thenReturn("Ma1rio");
        when(request.getParameter("cognome")).thenReturn("Rossi");
        when(request.getParameter("indirizzo")).thenReturn("Via Roma 10");
        when(request.getParameter("citta")).thenReturn("Napoli");
        when(request.getParameter("provincia")).thenReturn("NA");
        when(request.getParameter("cap")).thenReturn("80100");
        when(request.getParameter("telefono")).thenReturn("123456789012");
        when(request.getParameter("email")).thenReturn("mario@rossi.com");

        servlet.doGet(request, response);

        verify(request).setAttribute(eq("error"), contains("KangarooBuy ha riscontrato un problema"));
        verify(dispatcherCliente).forward(request, response);
        verify(clientModel, never()).doModify(any());
    }

    @Test
    void doGet_addPaymentCard_valid_savesAndAddsToList() throws Exception {
        when(utente.getEmail()).thenReturn("user@example.com");
        when(utente.getUsername()).thenReturn("mario");

        ArrayList<AddressBean> addresses = new ArrayList<>();
        ArrayList<MetodoPagamentoBean> payments = new ArrayList<>();

        when(addressModel.doRetrieveByClient("mario")).thenReturn(addresses);
        when(paymentModel.doRetrieveByClient("mario")).thenReturn(payments);

        when(request.getParameter("action")).thenReturn("addPaymentCard");
        when(request.getParameter("numero_carta")).thenReturn("4111111111111111");
        when(request.getParameter("cvv")).thenReturn("123");
        when(request.getParameter("data_scadenza")).thenReturn("2030-12-31");
        when(request.getParameter("circuito")).thenReturn("VISA");

        when(paymentModel.doSave(any(MetodoPagamentoBean.class))).thenReturn(7);

        servlet.doGet(request, response);

        assertEquals(1, payments.size());
        assertEquals(7, payments.get(0).getId());
        verify(paymentModel).doSave(any(MetodoPagamentoBean.class));
        verify(dispatcherCliente).forward(request, response);
    }

    @Test
    void doGet_deletePaymentCard_removesAndDeletes() throws Exception {
        when(utente.getEmail()).thenReturn("user@example.com");
        when(utente.getUsername()).thenReturn("mario");

        ArrayList<AddressBean> addresses = new ArrayList<>();
        ArrayList<MetodoPagamentoBean> payments = new ArrayList<>();

        MetodoPagamentoBean existing = new MetodoPagamentoBean();
        existing.setId(99);
        payments.add(existing);

        when(addressModel.doRetrieveByClient("mario")).thenReturn(addresses);
        when(paymentModel.doRetrieveByClient("mario")).thenReturn(payments);

        when(request.getParameter("action")).thenReturn("deletePaymentCard");
        when(request.getParameter("id_carta")).thenReturn("99");

        when(paymentModel.doRetrieveByKey(99)).thenReturn(existing);

        servlet.doGet(request, response);

        assertTrue(payments.isEmpty());
        verify(paymentModel).doDelete(99);
        verify(dispatcherCliente).forward(request, response);
    }

    @Test
    void doGet_addAddress_valid_savesAndAddsToList() throws Exception {
        when(utente.getEmail()).thenReturn("user@example.com");
        when(utente.getUsername()).thenReturn("mario");

        ArrayList<AddressBean> addresses = new ArrayList<>();
        ArrayList<MetodoPagamentoBean> payments = new ArrayList<>();

        when(addressModel.doRetrieveByClient("mario")).thenReturn(addresses);
        when(paymentModel.doRetrieveByClient("mario")).thenReturn(payments);

        when(request.getParameter("action")).thenReturn("addAddress");
        when(request.getParameter("via_indirizzo")).thenReturn("Via Roma 10");
        when(request.getParameter("citta_indirizzo")).thenReturn("Napoli");
        when(request.getParameter("CAP_indirizzo")).thenReturn("80100");

        when(addressModel.doSave(any(AddressBean.class))).thenReturn(55);

        servlet.doGet(request, response);

        assertEquals(1, addresses.size());
        assertEquals(55, addresses.get(0).getId());
        verify(addressModel).doSave(any(AddressBean.class));
        verify(dispatcherCliente).forward(request, response);
    }

    @Test
    void doGet_deleteAddress_removesAndDeletes() throws Exception {
        when(utente.getEmail()).thenReturn("user@example.com");
        when(utente.getUsername()).thenReturn("mario");

        ArrayList<AddressBean> addresses = new ArrayList<>();
        ArrayList<MetodoPagamentoBean> payments = new ArrayList<>();

        AddressBean existing = new AddressBean();
        existing.setId(12);
        addresses.add(existing);

        when(addressModel.doRetrieveByClient("mario")).thenReturn(addresses);
        when(paymentModel.doRetrieveByClient("mario")).thenReturn(payments);

        when(request.getParameter("action")).thenReturn("deleteAddress");
        when(request.getParameter("id_indirizzo")).thenReturn("12");

        when(addressModel.doRetrieveByKey(12)).thenReturn(existing);

        servlet.doGet(request, response);

        assertTrue(addresses.isEmpty());
        verify(addressModel).doDelete(12);
        verify(dispatcherCliente).forward(request, response);
    }

    @Test
    void doGet_addressesSqlException_redirectsGeneralError() throws Exception {
        when(utente.getEmail()).thenReturn("user@example.com");
        when(utente.getUsername()).thenReturn("mario");

        when(addressModel.doRetrieveByClient("mario")).thenThrow(new SQLException("boom"));

        servlet.doGet(request, response);

        verify(response).sendRedirect("./ErrorPage/generalError.jsp");
        verify(dispatcherCliente, never()).forward(request, response);
    }

    @Test
    void doGet_paymentsSqlException_redirectsGeneralError() throws Exception {
        when(utente.getEmail()).thenReturn("user@example.com");
        when(utente.getUsername()).thenReturn("mario");

        when(addressModel.doRetrieveByClient("mario")).thenReturn(new ArrayList<>());
        when(paymentModel.doRetrieveByClient("mario")).thenThrow(new SQLException("boom"));

        servlet.doGet(request, response);

        verify(response).sendRedirect("./ErrorPage/generalError.jsp");
        verify(dispatcherCliente, never()).forward(request, response);
    }
    @Test
    void doGet_emptyAction_forwardsCliente() throws Exception {
        when(utente.getEmail()).thenReturn("user@example.com");
        when(utente.getUsername()).thenReturn("mario");

        ArrayList<AddressBean> addresses = new ArrayList<>();
        ArrayList<MetodoPagamentoBean> payments = new ArrayList<>();
        when(addressModel.doRetrieveByClient("mario")).thenReturn(addresses);
        when(paymentModel.doRetrieveByClient("mario")).thenReturn(payments);

        when(request.getParameter("action")).thenReturn("");

        servlet.doGet(request, response);

        verify(dispatcherCliente).forward(request, response);
    }

    @Test
    void doGet_unknownAction_stillForwardsCliente() throws Exception {
        when(utente.getEmail()).thenReturn("user@example.com");
        when(utente.getUsername()).thenReturn("mario");

        when(addressModel.doRetrieveByClient("mario")).thenReturn(new ArrayList<>());
        when(paymentModel.doRetrieveByClient("mario")).thenReturn(new ArrayList<>());

        when(request.getParameter("action")).thenReturn("boh");

        servlet.doGet(request, response);

        verify(dispatcherCliente).forward(request, response);
    }

    @Test
    void doGet_modify_valid_callsDoModify() throws Exception {
        when(utente.getEmail()).thenReturn("user@example.com");
        when(utente.getUsername()).thenReturn("mario");

        when(addressModel.doRetrieveByClient("mario")).thenReturn(new ArrayList<>());
        when(paymentModel.doRetrieveByClient("mario")).thenReturn(new ArrayList<>());

        when(request.getParameter("action")).thenReturn("modify");

        when(request.getParameter("nome")).thenReturn("Mario");
        when(request.getParameter("cognome")).thenReturn("Rossi");
        when(request.getParameter("indirizzo")).thenReturn("Via Roma 10");
        when(request.getParameter("citta")).thenReturn("Napoli");
        when(request.getParameter("provincia")).thenReturn("NA");
        when(request.getParameter("cap")).thenReturn("80100");
        when(request.getParameter("telefono")).thenReturn("123456789012");
        when(request.getParameter("email")).thenReturn("mario.rossi@example.com");

        servlet.doGet(request, response);

        verify(clientModel).doModify(utente);
        verify(dispatcherCliente).forward(request, response);
    }

    @Test
    void doGet_modify_sqlException_redirectsGeneralError() throws Exception {
        when(utente.getEmail()).thenReturn("user@example.com");
        when(utente.getUsername()).thenReturn("mario");

        when(addressModel.doRetrieveByClient("mario")).thenReturn(new ArrayList<>());
        when(paymentModel.doRetrieveByClient("mario")).thenReturn(new ArrayList<>());

        when(request.getParameter("action")).thenReturn("modify");

        when(request.getParameter("nome")).thenReturn("Mario");
        when(request.getParameter("cognome")).thenReturn("Rossi");
        when(request.getParameter("indirizzo")).thenReturn("Via Roma 10");
        when(request.getParameter("citta")).thenReturn("Napoli");
        when(request.getParameter("provincia")).thenReturn("NA");
        when(request.getParameter("cap")).thenReturn("80100");
        when(request.getParameter("telefono")).thenReturn("123456789012");
        when(request.getParameter("email")).thenReturn("mario.rossi@example.com");

        doThrow(new SQLException("boom")).when(clientModel).doModify(utente);

        servlet.doGet(request, response);

        verify(response).sendRedirect("./ErrorPage/generalError.jsp");
    }

    @Test
    void doGet_addPaymentCard_invalidCvv_triggersSendError() throws Exception {
        when(utente.getEmail()).thenReturn("user@example.com");
        when(utente.getUsername()).thenReturn("mario");

        when(addressModel.doRetrieveByClient("mario")).thenReturn(new ArrayList<>());
        when(paymentModel.doRetrieveByClient("mario")).thenReturn(new ArrayList<>());

        when(request.getParameter("action")).thenReturn("addPaymentCard");
        when(request.getParameter("numero_carta")).thenReturn("4111111111111111");
        when(request.getParameter("cvv")).thenReturn("12"); // invalido
        when(request.getParameter("data_scadenza")).thenReturn("2030-12-31");
        when(request.getParameter("circuito")).thenReturn("VISA");

        servlet.doGet(request, response);

        verify(request).setAttribute(eq("error"), contains("compila il form"));
        verify(dispatcherCliente).forward(request, response);
        verify(paymentModel, never()).doSave(any());
    }

    @Test
    void doGet_addAddress_invalidCap_triggersSendError() throws Exception {
        when(utente.getEmail()).thenReturn("user@example.com");
        when(utente.getUsername()).thenReturn("mario");

        when(addressModel.doRetrieveByClient("mario")).thenReturn(new ArrayList<>());
        when(paymentModel.doRetrieveByClient("mario")).thenReturn(new ArrayList<>());

        when(request.getParameter("action")).thenReturn("addAddress");
        when(request.getParameter("via_indirizzo")).thenReturn("Via Roma 10");
        when(request.getParameter("citta_indirizzo")).thenReturn("Napoli");
        when(request.getParameter("CAP_indirizzo")).thenReturn("8010"); // invalido

        servlet.doGet(request, response);

        verify(request).setAttribute(eq("error"), contains("compila il form"));
        verify(dispatcherCliente).forward(request, response);
        verify(addressModel, never()).doSave(any());
    }

    @Test
    void doGet_deletePaymentCard_retrieveSqlException_redirectsGeneralError() throws Exception {
        when(utente.getEmail()).thenReturn("user@example.com");
        when(utente.getUsername()).thenReturn("mario");

        when(addressModel.doRetrieveByClient("mario")).thenReturn(new ArrayList<>());
        when(paymentModel.doRetrieveByClient("mario")).thenReturn(new ArrayList<>());

        when(request.getParameter("action")).thenReturn("deletePaymentCard");
        when(request.getParameter("id_carta")).thenReturn("99");

        when(paymentModel.doRetrieveByKey(99)).thenThrow(new SQLException("boom"));

        servlet.doGet(request, response);

        verify(response).sendRedirect("./ErrorPage/generalError.jsp");
    }

    @Test
    void doGet_deleteAddress_deleteSqlException_redirectsGeneralError() throws Exception {
        when(utente.getEmail()).thenReturn("user@example.com");
        when(utente.getUsername()).thenReturn("mario");

        ArrayList<AddressBean> addresses = new ArrayList<>();
        AddressBean existing = new AddressBean();
        existing.setId(12);
        addresses.add(existing);

        when(addressModel.doRetrieveByClient("mario")).thenReturn(addresses);
        when(paymentModel.doRetrieveByClient("mario")).thenReturn(new ArrayList<>());

        when(request.getParameter("action")).thenReturn("deleteAddress");
        when(request.getParameter("id_indirizzo")).thenReturn("12");

        when(addressModel.doRetrieveByKey(12)).thenReturn(existing);
        doThrow(new SQLException("boom")).when(addressModel).doDelete(12);

        servlet.doGet(request, response);

        verify(response).sendRedirect("./ErrorPage/generalError.jsp");
    }

    @Test
    void doPost_delegatesToDoGet() throws Exception {
        // evita NPE dentro doGet
        when(utente.getEmail()).thenReturn("user@example.com");
        when(utente.getUsername()).thenReturn("mario");

        when(addressModel.doRetrieveByClient("mario")).thenReturn(new ArrayList<>());
        when(paymentModel.doRetrieveByClient("mario")).thenReturn(new ArrayList<>());
        when(request.getParameter("action")).thenReturn(null);

        UtenteServlet spyServlet = spy(servlet);

        spyServlet.doPost(request, response);

        verify(spyServlet).doGet(request, response);
    }


    @Test
    void doGet_deletePaymentCard_deleteSqlException_stillForwardsCliente() throws Exception {
        when(utente.getEmail()).thenReturn("user@example.com");
        when(utente.getUsername()).thenReturn("mario");

        ArrayList<AddressBean> addresses = new ArrayList<>();
        ArrayList<MetodoPagamentoBean> payments = new ArrayList<>();

        MetodoPagamentoBean existing = new MetodoPagamentoBean();
        existing.setId(99);
        payments.add(existing);

        when(addressModel.doRetrieveByClient("mario")).thenReturn(addresses);
        when(paymentModel.doRetrieveByClient("mario")).thenReturn(payments);

        when(request.getParameter("action")).thenReturn("deletePaymentCard");
        when(request.getParameter("id_carta")).thenReturn("99");

        when(paymentModel.doRetrieveByKey(99)).thenReturn(existing);
        doThrow(new SQLException("boom")).when(paymentModel).doDelete(99);

        servlet.doGet(request, response);

        // non redirecta, logga soltanto e continua
        verify(dispatcherCliente).forward(request, response);
    }

    @Test
    void doGet_addPaymentCard_saveSqlException_redirectsGeneralError() throws Exception {
        when(utente.getEmail()).thenReturn("user@example.com");
        when(utente.getUsername()).thenReturn("mario");

        when(addressModel.doRetrieveByClient("mario")).thenReturn(new ArrayList<>());
        when(paymentModel.doRetrieveByClient("mario")).thenReturn(new ArrayList<>());

        when(request.getParameter("action")).thenReturn("addPaymentCard");
        when(request.getParameter("numero_carta")).thenReturn("4111111111111111");
        when(request.getParameter("cvv")).thenReturn("123");
        when(request.getParameter("data_scadenza")).thenReturn("2030-12-31");
        when(request.getParameter("circuito")).thenReturn("VISA");

        when(paymentModel.doSave(any(MetodoPagamentoBean.class))).thenThrow(new SQLException("boom"));

        servlet.doGet(request, response);

        verify(response).sendRedirect("./ErrorPage/generalError.jsp");
    }

    @Test
    void doGet_addAddress_saveSqlException_redirectsGeneralError() throws Exception {
        when(utente.getEmail()).thenReturn("user@example.com");
        when(utente.getUsername()).thenReturn("mario");

        when(addressModel.doRetrieveByClient("mario")).thenReturn(new ArrayList<>());
        when(paymentModel.doRetrieveByClient("mario")).thenReturn(new ArrayList<>());

        when(request.getParameter("action")).thenReturn("addAddress");
        when(request.getParameter("via_indirizzo")).thenReturn("Via Roma 10");
        when(request.getParameter("citta_indirizzo")).thenReturn("Napoli");
        when(request.getParameter("CAP_indirizzo")).thenReturn("80100");

        when(addressModel.doSave(any(AddressBean.class))).thenThrow(new SQLException("boom"));

        servlet.doGet(request, response);

        verify(response).sendRedirect("./ErrorPage/generalError.jsp");
    }

    @Test
    void doGet_deleteAddress_retrieveSqlException_redirectsGeneralError() throws Exception {
        when(utente.getEmail()).thenReturn("user@example.com");
        when(utente.getUsername()).thenReturn("mario");

        when(addressModel.doRetrieveByClient("mario")).thenReturn(new ArrayList<>());
        when(paymentModel.doRetrieveByClient("mario")).thenReturn(new ArrayList<>());

        when(request.getParameter("action")).thenReturn("deleteAddress");
        when(request.getParameter("id_indirizzo")).thenReturn("12");

        when(addressModel.doRetrieveByKey(12)).thenThrow(new SQLException("boom"));

        servlet.doGet(request, response);

        verify(response).sendRedirect("./ErrorPage/generalError.jsp");
    }

    @Test
    void doGet_modify_invalidTelefono_triggersSendError() throws Exception {
        when(utente.getEmail()).thenReturn("user@example.com");
        when(utente.getUsername()).thenReturn("mario");

        when(addressModel.doRetrieveByClient("mario")).thenReturn(new ArrayList<>());
        when(paymentModel.doRetrieveByClient("mario")).thenReturn(new ArrayList<>());

        when(request.getParameter("action")).thenReturn("modify");

        when(request.getParameter("nome")).thenReturn("Mario");
        when(request.getParameter("cognome")).thenReturn("Rossi");
        when(request.getParameter("indirizzo")).thenReturn("Via Roma 10");
        when(request.getParameter("citta")).thenReturn("Napoli");
        when(request.getParameter("provincia")).thenReturn("NA");
        when(request.getParameter("cap")).thenReturn("80100");
        when(request.getParameter("telefono")).thenReturn("123"); // invalido
        when(request.getParameter("email")).thenReturn("mario.rossi@example.com");

        servlet.doGet(request, response);

        verify(request).setAttribute(eq("error"), contains("compila il form"));
        verify(dispatcherCliente).forward(request, response);
        verify(clientModel, never()).doModify(any());
    }

}
