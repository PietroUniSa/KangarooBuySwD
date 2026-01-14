package ita.kangaroo.controller;

import ita.kangaroo.dao.utenteDao;
import ita.kangaroo.model.utenteBean;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.sql.SQLException;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

class LoginServletTest {

    private HttpServletRequest request;
    private HttpServletResponse response;
    private HttpSession session;
    private ServletContext servletContext;
    private RequestDispatcher dispatcher;

    static class FakeUtenteDao extends utenteDao {
        utenteBean result;
        SQLException ex;

        @Override
        public utenteBean doRetrieveByEmailAndPassword(String email, String password) throws SQLException {
            if (ex != null) throw ex;
            return result;
        }
    }

    private FakeUtenteDao daoFake;

    @BeforeEach
    void setup() throws Exception {
        request = mock(HttpServletRequest.class);
        response = mock(HttpServletResponse.class);
        session = mock(HttpSession.class);
        servletContext = mock(ServletContext.class);
        dispatcher = mock(RequestDispatcher.class);

        when(request.getSession()).thenReturn(session);

        daoFake = new FakeUtenteDao();
        setPrivateStaticField(LoginServlet.class, "model", daoFake);
    }

    private static void setPrivateStaticField(Class<?> clazz, String fieldName, Object value) throws Exception {
        Field f = clazz.getDeclaredField(fieldName);
        f.setAccessible(true);
        f.set(null, value);
    }

    private LoginServlet servlet() {
        LoginServlet s = spy(new LoginServlet());
        doReturn(servletContext).when(s).getServletContext();
        return s;
    }

    private utenteBean adminUser() {
        utenteBean u = new utenteBean();
        u.setEmail("provoloni@example.com");
        return u;
    }

    private utenteBean normalUser() {
        utenteBean u = new utenteBean();
        u.setEmail("user@example.com");
        return u;
    }

    @Test
    void logout_invalidatesSession_andRedirectsHome() throws Exception {
        LoginServlet s = servlet();
        when(request.getParameter("action")).thenReturn("logout");

        s.doGet(request, response);

        verify(session).invalidate();
        verify(response).sendRedirect("HomeServlet");
        verify(servletContext, never()).getRequestDispatcher(anyString());
    }

    @Test
    void actionNull_forwardsToLoginJsp() throws Exception {
        LoginServlet s = servlet();
        when(request.getParameter("action")).thenReturn(null);

        when(servletContext.getRequestDispatcher("/Login.jsp")).thenReturn(dispatcher);

        s.doGet(request, response);

        verify(dispatcher).forward(request, response);
        verify(response, never()).sendRedirect(anyString());
    }

    @Test
    void actionEmpty_forwardsToLoginJsp() throws Exception {
        LoginServlet s = servlet();
        when(request.getParameter("action")).thenReturn("");

        when(servletContext.getRequestDispatcher("/Login.jsp")).thenReturn(dispatcher);

        s.doGet(request, response);

        verify(dispatcher).forward(request, response);
        verify(response, never()).sendRedirect(anyString());
    }

    @Test
    void login_sqlException_redirectsToLoginError() throws Exception {
        LoginServlet s = servlet();
        when(request.getParameter("action")).thenReturn("login");
        when(request.getParameter("email")).thenReturn("a@b.com");
        when(request.getParameter("password")).thenReturn("pw");

        daoFake.ex = new SQLException("DB down");

        s.doGet(request, response);

        verify(response).sendRedirect("./ErrorPage/loginError.jsp");
        verify(session, never()).setAttribute(eq("utente"), any());
    }

    @Test
    void login_wrongCredentials_redirectsToLoginError() throws Exception {
        LoginServlet s = servlet();
        when(request.getParameter("action")).thenReturn("login");
        when(request.getParameter("email")).thenReturn("a@b.com");
        when(request.getParameter("password")).thenReturn("pw");

        daoFake.result = null;

        s.doGet(request, response);

        verify(response).sendRedirect("./ErrorPage/loginError.jsp");
        verify(session, never()).setAttribute(eq("utente"), any());
    }

    @Test
    void login_admin_forwardsToAdminServlet_andSetsSessionUser() throws Exception {
        LoginServlet s = servlet();
        when(request.getParameter("action")).thenReturn("login");
        when(request.getParameter("email")).thenReturn("provoloni@example.com");
        when(request.getParameter("password")).thenReturn("pw");

        daoFake.result = adminUser();

        when(servletContext.getRequestDispatcher("/AdminServlet")).thenReturn(dispatcher);

        s.doGet(request, response);

        verify(session).setAttribute("utente", daoFake.result);
        verify(dispatcher).forward(request, response);
        verify(response, never()).sendRedirect("HomeServlet"); // perché fa forward e return
    }

    @Test
    void login_normalUser_redirectsHome_andSetsSessionUser() throws Exception {
        LoginServlet s = servlet();
        when(request.getParameter("action")).thenReturn("login");
        when(request.getParameter("email")).thenReturn("user@example.com");
        when(request.getParameter("password")).thenReturn("pw");

        daoFake.result = normalUser();

        s.doGet(request, response);

        verify(session).setAttribute("utente", daoFake.result);
        verify(response).sendRedirect("HomeServlet");
        verify(servletContext, never()).getRequestDispatcher("/AdminServlet");
    }

    @Test
    void doPost_delegatesToDoGet() throws Exception {
        LoginServlet s = servlet();
        when(request.getParameter("action")).thenReturn(null);
        when(servletContext.getRequestDispatcher("/Login.jsp")).thenReturn(dispatcher);

        s.doPost(request, response);

        verify(dispatcher).forward(request, response);
    }
}
