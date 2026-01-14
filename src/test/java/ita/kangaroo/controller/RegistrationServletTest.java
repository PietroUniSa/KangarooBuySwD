package ita.kangaroo.controller;

import com.google.gson.Gson;
import ita.kangaroo.dao.AddressDao;
import ita.kangaroo.dao.utenteDao;
import ita.kangaroo.model.AddressBean;
import ita.kangaroo.model.utenteBean;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;

class RegistrationServletTest {

    private HttpServletRequest request;
    private HttpServletResponse response;
    private HttpSession session;
    private ServletContext servletContext;
    private RequestDispatcher dispatcher;

    // ---- Fakes ----
    static class FakeClientDao extends utenteDao {
        utenteBean byUsername;
        utenteBean byEmail;
        SQLException ex;

        @Override
        public utenteBean doRetrieveByKey(String username) throws SQLException {
            if (ex != null) throw ex;
            return byUsername;
        }

        @Override
        public utenteBean doRetrieveByEmail(String email) throws SQLException {
            if (ex != null) throw ex;
            return byEmail;
        }
    }

    static class FakeRegisterDao extends utenteDao {
        int saveResult = 1; // 1 = ok, 0 = fallito
        SQLException ex;

        @Override
        public int doSave(utenteBean u) throws SQLException {
            if (ex != null) throw ex;
            return saveResult;
        }
    }

    static class FakeAddressDao extends AddressDao {
        SQLException ex;
        int saveResult = 1; // 1 = ok, 0 = fallito (se vuoi simularlo)
        AddressBean saved;

        @Override
        public int doSave(AddressBean a) throws SQLException {
            if (ex != null) throw ex;
            saved = a;
            return saveResult;
        }
    }

    private FakeClientDao clientDaoFake;
    private FakeRegisterDao registerDaoFake;
    private FakeAddressDao addressDaoFake;

    @BeforeEach
    void setup() {
        request = mock(HttpServletRequest.class);
        response = mock(HttpServletResponse.class);
        session = mock(HttpSession.class);
        servletContext = mock(ServletContext.class);
        dispatcher = mock(RequestDispatcher.class);

        when(request.getSession()).thenReturn(session);
        when(request.getContextPath()).thenReturn("/app");

        clientDaoFake = new FakeClientDao();
        registerDaoFake = new FakeRegisterDao();
        addressDaoFake = new FakeAddressDao();

        RegistrationServlet.clientmodel = clientDaoFake;
        RegistrationServlet.model = registerDaoFake;
        RegistrationServlet.addressmodel = addressDaoFake;
    }

    private RegistrationServlet servlet() {
        RegistrationServlet s = spy(new RegistrationServlet());
        doReturn(servletContext).when(s).getServletContext();
        return s;
    }

    // helper: setup writer to capture JSON output
    private StringWriter mockJsonWriter() throws Exception {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        when(response.getWriter()).thenReturn(pw);
        return sw;
    }

    @Test
    void actionNull_forwardsToRegistrationJsp() throws Exception {
        RegistrationServlet s = servlet();
        when(request.getParameter("action")).thenReturn(null);

        when(servletContext.getRequestDispatcher("/registration.jsp")).thenReturn(dispatcher);

        s.doGet(request, response);

        verify(dispatcher).forward(request, response);
        verify(response, never()).sendRedirect(anyString());
    }

    @Test
    void ajaxCheck_usernameExists_returnsJsonTrue() throws Exception {
        RegistrationServlet s = servlet();
        when(request.getHeader("X-Requested-With")).thenReturn("XMLHttpRequest");
        when(request.getParameter("action")).thenReturn("check");
        when(request.getParameter("username")).thenReturn("mario123");

        clientDaoFake.byUsername = new utenteBean(); // exists

        StringWriter sw = mockJsonWriter();

        s.doGet(request, response);

        verify(response).setContentType("application/json");
        assertEquals(new Gson().toJson(true), sw.toString());
        verify(response, never()).sendRedirect(anyString());
        verify(dispatcher, never()).forward(any(), any());
    }

    @Test
    void ajaxCheck_usernameNotExists_returnsJsonFalse() throws Exception {
        RegistrationServlet s = servlet();
        when(request.getHeader("X-Requested-With")).thenReturn("XMLHttpRequest");
        when(request.getParameter("action")).thenReturn("check");
        when(request.getParameter("username")).thenReturn("nuovoUser");

        clientDaoFake.byUsername = null;

        StringWriter sw = mockJsonWriter();

        s.doGet(request, response);

        verify(response).setContentType("application/json");
        assertEquals(new Gson().toJson(false), sw.toString());
    }

    @Test
    void ajaxCheckEmail_emailExists_returnsJsonTrue() throws Exception {
        RegistrationServlet s = servlet();
        when(request.getHeader("X-Requested-With")).thenReturn("XMLHttpRequest");
        when(request.getParameter("action")).thenReturn("checkemail");
        when(request.getParameter("email")).thenReturn("x@y.com");

        clientDaoFake.byEmail = new utenteBean();

        StringWriter sw = mockJsonWriter();

        s.doGet(request, response);

        verify(response).setContentType("application/json");
        assertEquals(new Gson().toJson(true), sw.toString());
    }

    @Test
    void ajaxDaoSqlException_redirectsToGeneralError() throws Exception {
        RegistrationServlet s = servlet();
        when(request.getHeader("X-Requested-With")).thenReturn("XMLHttpRequest");
        when(request.getParameter("action")).thenReturn("check");
        when(request.getParameter("username")).thenReturn("mario123");

        clientDaoFake.ex = new SQLException("DB down");

        s.doGet(request, response);

        verify(response).sendRedirect("./ErrorPage/generalError.jsp");
    }

    @Test
    void register_invalidUsername_callsSendError_andForwards() throws Exception {
        RegistrationServlet s = servlet();
        when(request.getHeader("X-Requested-With")).thenReturn(null); // not ajax
        when(request.getParameter("action")).thenReturn("register");

        // username invalido (troppo corto)
        when(request.getParameter("username")).thenReturn("abc");
        when(request.getParameter("nome")).thenReturn("Mario");
        when(request.getParameter("cognome")).thenReturn("Rossi");
        when(request.getParameter("indirizzo")).thenReturn("Via Roma 10");
        when(request.getParameter("citta")).thenReturn("Napoli");
        when(request.getParameter("provincia")).thenReturn("NA");
        when(request.getParameter("cap")).thenReturn("80100");
        when(request.getParameter("telefono")).thenReturn("123456789012");
        when(request.getParameter("email")).thenReturn("mario@rossi.com");
        when(request.getParameter("password")).thenReturn("abc123");

        when(servletContext.getRequestDispatcher("/registration.jsp")).thenReturn(dispatcher);

        s.doGet(request, response);

        verify(request).setAttribute(eq("error"), contains("registration"));
        verify(dispatcher).forward(request, response);
        verify(response, never()).sendRedirect(anyString());
    }

    @Test
    void register_validButSaveReturns0_redirectsToLoginError() throws Exception {
        RegistrationServlet s = servlet();
        when(request.getHeader("X-Requested-With")).thenReturn(null);
        when(request.getParameter("action")).thenReturn("register");

        // valori validi secondo regex del servlet
        when(request.getParameter("username")).thenReturn("mario_12");
        when(request.getParameter("nome")).thenReturn("Mario");
        when(request.getParameter("cognome")).thenReturn("Rossi");
        when(request.getParameter("indirizzo")).thenReturn("Via Roma 10");
        when(request.getParameter("citta")).thenReturn("Napoli");
        when(request.getParameter("provincia")).thenReturn("Napoli");
        when(request.getParameter("cap")).thenReturn("80100");
        when(request.getParameter("telefono")).thenReturn("123456789012");
        when(request.getParameter("email")).thenReturn("mario@rossi.com");
        when(request.getParameter("password")).thenReturn("abc123");

        registerDaoFake.saveResult = 0;

        s.doGet(request, response);

        verify(response).sendRedirect("./ErrorPage/loginError.jsp");
    }

    @Test
    void register_valid_success_savesAddress_andRedirectsToLoginServlet() throws Exception {
        RegistrationServlet s = servlet();
        when(request.getHeader("X-Requested-With")).thenReturn(null);
        when(request.getParameter("action")).thenReturn("register");

        when(request.getParameter("username")).thenReturn("mario_12");
        when(request.getParameter("nome")).thenReturn("Mario");
        when(request.getParameter("cognome")).thenReturn("Rossi");
        when(request.getParameter("indirizzo")).thenReturn("Via Roma 10");
        when(request.getParameter("citta")).thenReturn("Napoli");
        when(request.getParameter("provincia")).thenReturn("Napoli");
        when(request.getParameter("cap")).thenReturn("80100");
        when(request.getParameter("telefono")).thenReturn("123456789012");
        when(request.getParameter("email")).thenReturn("mario@rossi.com");
        when(request.getParameter("password")).thenReturn("abc123");

        registerDaoFake.saveResult = 1;

        s.doGet(request, response);

        verify(response).sendRedirect("/app/LoginServlet");
        assertEquals("mario_12", addressDaoFake.saved.getUsername());
        assertEquals("Via Roma 10", addressDaoFake.saved.getVia());
        assertEquals("Napoli", addressDaoFake.saved.getCitta());
        assertEquals("80100", addressDaoFake.saved.getCAP());
    }

    @Test
    void register_valid_addressSaveSQLException_redirectsToGeneralError() throws Exception {
        RegistrationServlet s = servlet();
        when(request.getHeader("X-Requested-With")).thenReturn(null);
        when(request.getParameter("action")).thenReturn("register");

        when(request.getParameter("username")).thenReturn("mario_12");
        when(request.getParameter("nome")).thenReturn("Mario");
        when(request.getParameter("cognome")).thenReturn("Rossi");
        when(request.getParameter("indirizzo")).thenReturn("Via Roma 10");
        when(request.getParameter("citta")).thenReturn("Napoli");
        when(request.getParameter("provincia")).thenReturn("Napoli");
        when(request.getParameter("cap")).thenReturn("80100");
        when(request.getParameter("telefono")).thenReturn("123456789012");
        when(request.getParameter("email")).thenReturn("mario@rossi.com");
        when(request.getParameter("password")).thenReturn("abc123");

        registerDaoFake.saveResult = 1;
        addressDaoFake.ex = new SQLException("DB down");

        s.doGet(request, response);

        verify(response).sendRedirect("./ErrorPage/generalError.jsp");
    }

    @Test
    void doPost_delegatesToDoGet() throws Exception {
        RegistrationServlet s = servlet();
        when(request.getParameter("action")).thenReturn(null);
        when(servletContext.getRequestDispatcher("/registration.jsp")).thenReturn(dispatcher);

        s.doPost(request, response);

        verify(dispatcher).forward(request, response);
    }
}
