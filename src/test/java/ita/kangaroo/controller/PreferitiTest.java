package ita.kangaroo.controller;

import ita.kangaroo.model.Prefered;
import ita.kangaroo.model.ProdottoBean;
import ita.kangaroo.model.utenteBean;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class PreferitiTest {

    private HttpServletRequest request;
    private HttpServletResponse response;
    private HttpSession session;

    @BeforeEach
    void setup() {
        request = mock(HttpServletRequest.class);
        response = mock(HttpServletResponse.class);
        session = mock(HttpSession.class);

        when(request.getSession()).thenReturn(session);
        when(request.getContextPath()).thenReturn("/app");
    }

    // Subclass testabile: override del "seam" retrieveProduct()
    static class TestablePreferiti extends Preferiti {
        ProdottoBean productToReturn;
        SQLException sqlExceptionToThrow;

        @Override
        protected ProdottoBean retrieveProduct(int productId) throws SQLException {
            if (sqlExceptionToThrow != null) throw sqlExceptionToThrow;
            return productToReturn;
        }
    }

    @Test
    void createsPreferitiInSessionIfMissing() throws Exception {
        TestablePreferiti servlet = new TestablePreferiti();

        when(session.getAttribute("preferiti")).thenReturn(null);
        when(session.getAttribute("utente")).thenReturn(null);
        when(request.getParameter("action")).thenReturn(null);

        servlet.doGet(request, response);

        // Deve salvare un Prefered in sessione
        verify(session).setAttribute(eq("preferiti"), any(Prefered.class));
        // Redirect alla pagina preferiti
        verify(response).sendRedirect("/app/preferiti.jsp");
    }

    @Test
    void redirectsHomeForBlockedUserEmail() throws Exception {
        TestablePreferiti servlet = new TestablePreferiti();

        Prefered prefered = new Prefered();
        utenteBean user = mock(utenteBean.class);

        when(session.getAttribute("preferiti")).thenReturn(prefered);
        when(session.getAttribute("utente")).thenReturn(user);
        when(user.getEmail()).thenReturn("provoloni@example.com");

        servlet.doGet(request, response);

        verify(response).sendRedirect("HomeServlet");
        verify(response, never()).sendRedirect("/app/preferiti.jsp");
    }

    @Test
    void whenActionNull_redirectsToPreferitiPage() throws Exception {
        TestablePreferiti servlet = new TestablePreferiti();

        Prefered prefered = new Prefered();
        when(session.getAttribute("preferiti")).thenReturn(prefered);
        when(session.getAttribute("utente")).thenReturn(null);
        when(request.getParameter("action")).thenReturn(null);

        servlet.doGet(request, response);

        verify(request).setAttribute("preferiti", prefered);
        verify(response).sendRedirect("/app/preferiti.jsp");
    }

    @Test
    void addAction_addsProductAndRedirects() throws Exception {
        TestablePreferiti servlet = new TestablePreferiti();

        Prefered prefered = spy(new Prefered());
        when(session.getAttribute("preferiti")).thenReturn(prefered);
        when(session.getAttribute("utente")).thenReturn(null);

        when(request.getParameter("action")).thenReturn("add");
        when(request.getParameter("id")).thenReturn("42");

        ProdottoBean product = new ProdottoBean();
        servlet.productToReturn = product;

        servlet.doGet(request, response);

        verify(prefered).addPreferito(product);
        verify(session).setAttribute("preferiti", prefered);
        verify(response).sendRedirect("/app/preferiti.jsp");
    }

    @Test
    void addAction_withMissingProduct_stillRedirectsButDoesNotAdd() throws Exception {
        TestablePreferiti servlet = new TestablePreferiti();

        Prefered prefered = spy(new Prefered());
        when(session.getAttribute("preferiti")).thenReturn(prefered);
        when(session.getAttribute("utente")).thenReturn(null);

        when(request.getParameter("action")).thenReturn("add");
        when(request.getParameter("id")).thenReturn("42");

        servlet.productToReturn = null; // prodotto non trovato

        servlet.doGet(request, response);

        verify(prefered, never()).addPreferito(any());
        verify(session, never()).setAttribute(eq("preferiti"), any());
        verify(response).sendRedirect("/app/preferiti.jsp");
    }

    @Test
    void removeAction_removesProductAndRedirects() throws Exception {
        TestablePreferiti servlet = new TestablePreferiti();

        Prefered prefered = spy(new Prefered());
        when(session.getAttribute("preferiti")).thenReturn(prefered);
        when(session.getAttribute("utente")).thenReturn(null);

        when(request.getParameter("action")).thenReturn("Rimuovi");
        when(request.getParameter("id")).thenReturn("7");

        ProdottoBean product = new ProdottoBean();
        servlet.productToReturn = product;

        servlet.doGet(request, response);

        verify(prefered).removePreferito(product);
        verify(session).setAttribute("preferiti", prefered);
        verify(response).sendRedirect("/app/preferiti.jsp");
    }

    @Test
    void addToCartAction_redirectsToGestioneCart() throws Exception {
        TestablePreferiti servlet = new TestablePreferiti();

        Prefered prefered = new Prefered();
        when(session.getAttribute("preferiti")).thenReturn(prefered);
        when(session.getAttribute("utente")).thenReturn(null);

        when(request.getParameter("action")).thenReturn("Aggiungi al carrello");
        when(request.getParameter("id")).thenReturn("99");

        servlet.doGet(request, response);

        verify(response).sendRedirect("GestioneCart?action=add&id=99");
    }

    @Test
    void invalidIdNumber_redirectsToErrorPage() throws Exception {
        TestablePreferiti servlet = new TestablePreferiti();

        Prefered prefered = new Prefered();
        when(session.getAttribute("preferiti")).thenReturn(prefered);
        when(session.getAttribute("utente")).thenReturn(null);

        when(request.getParameter("action")).thenReturn("add");
        when(request.getParameter("id")).thenReturn("not-a-number");

        servlet.doGet(request, response);

        verify(response).sendRedirect("./ErrorPage/generalError.jsp");
    }

    @Test
    void sqlException_redirectsToErrorPage() throws Exception {
        TestablePreferiti servlet = new TestablePreferiti();

        Prefered prefered = new Prefered();
        when(session.getAttribute("preferiti")).thenReturn(prefered);
        when(session.getAttribute("utente")).thenReturn(null);

        when(request.getParameter("action")).thenReturn("add");
        when(request.getParameter("id")).thenReturn("10");

        servlet.sqlExceptionToThrow = new SQLException("DB down");

        servlet.doGet(request, response);

        verify(response).sendRedirect("./ErrorPage/generalError.jsp");
    }
}
