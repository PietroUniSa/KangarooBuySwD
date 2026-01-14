package ita.kangaroo.controller;

import ita.kangaroo.dao.OrdineDao;
import ita.kangaroo.model.OrdineBean;
import ita.kangaroo.model.utenteBean;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;
import java.util.ArrayList;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

class OrdiniUtenteServletTest {

    private HttpServletRequest request;
    private HttpServletResponse response;
    private HttpSession session;
    private ServletContext servletContext;
    private RequestDispatcher dispatcher;

    static class FakeOrdineDao extends OrdineDao {
        ArrayList<OrdineBean> byClient;
        SQLException ex;

        @Override
        public ArrayList<OrdineBean> doRetrieveByClient(String username) throws SQLException {
            if (ex != null) throw ex;
            return byClient;
        }
    }

    private FakeOrdineDao ordineDaoFake;

    @BeforeEach
    void setup() {
        request = mock(HttpServletRequest.class);
        response = mock(HttpServletResponse.class);
        session = mock(HttpSession.class);
        servletContext = mock(ServletContext.class);
        dispatcher = mock(RequestDispatcher.class);

        when(request.getSession()).thenReturn(session);

        ordineDaoFake = new FakeOrdineDao();
        OrdiniUtenteServlet.orderModel = ordineDaoFake;
    }

    private OrdiniUtenteServlet servlet() {
        OrdiniUtenteServlet s = spy(new OrdiniUtenteServlet());
        doReturn(servletContext).when(s).getServletContext();
        return s;
    }

    private utenteBean adminUser() {
        utenteBean u = new utenteBean();
        u.setEmail("provoloni@example.com");
        u.setUsername("admin");
        return u;
    }

    private utenteBean normalUser() {
        utenteBean u = new utenteBean();
        u.setEmail("user@example.com");
        u.setUsername("mario");
        return u;
    }

    @Test
    void whenUserNotLogged_redirectsToLogin() throws Exception {
        OrdiniUtenteServlet s = servlet();
        when(session.getAttribute("utente")).thenReturn(null);

        s.doGet(request, response);

        verify(response).sendRedirect("LoginServlet");
        verify(servletContext, never()).getRequestDispatcher(anyString());
        verify(dispatcher, never()).forward(any(), any());
    }

    @Test
    void whenAdmin_forwardsToAdminOrdersNoFilter() throws Exception {
        OrdiniUtenteServlet s = servlet();
        when(session.getAttribute("utente")).thenReturn(adminUser());

        when(servletContext.getRequestDispatcher("/AdminServlet?action=ordersNoFilter")).thenReturn(dispatcher);

        s.doGet(request, response);

        verify(dispatcher).forward(request, response);
        verify(response, never()).sendRedirect(anyString());
        verify(request, never()).setAttribute(eq("ordini"), any());
        verify(servletContext, never()).getRequestDispatcher("/clientsorder.jsp");
    }

    @Test
    void whenNormalUser_setsOrdersAndForwardsToClientsOrderJsp() throws Exception {
        OrdiniUtenteServlet s = servlet();
        utenteBean user = normalUser();
        when(session.getAttribute("utente")).thenReturn(user);

        ArrayList<OrdineBean> list = new ArrayList<>();
        list.add(new OrdineBean());
        ordineDaoFake.byClient = list;

        when(servletContext.getRequestDispatcher("/clientsorder.jsp")).thenReturn(dispatcher);

        s.doGet(request, response);

        verify(request).setAttribute("ordini", list);
        verify(dispatcher).forward(request, response);
        verify(response, never()).sendRedirect(anyString());
    }

    @Test
    void whenNormalUser_sqlException_redirectsToGeneralError() throws Exception {
        OrdiniUtenteServlet s = servlet();
        when(session.getAttribute("utente")).thenReturn(normalUser());

        ordineDaoFake.ex = new SQLException("DB down");

        s.doGet(request, response);

        verify(response).sendRedirect("./ErrorPage/generalError.jsp");
        verify(servletContext, never()).getRequestDispatcher("/clientsorder.jsp");
        verify(dispatcher, never()).forward(any(), any());
    }

    @Test
    void doPost_delegatesToDoGet() throws Exception {
        OrdiniUtenteServlet s = servlet();

        // caso facile: utente non loggato
        when(session.getAttribute("utente")).thenReturn(null);

        s.doPost(request, response);

        verify(response).sendRedirect("LoginServlet");
    }
}
