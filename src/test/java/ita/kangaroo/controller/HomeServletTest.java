package ita.kangaroo.controller;

import ita.kangaroo.dao.prodottoDao;
import ita.kangaroo.model.ProdottoBean;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.mockito.MockedConstruction;

import java.sql.SQLException;
import java.util.ArrayList;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

class HomeServletTest {

    private HomeServlet servletWithContext(ServletContext ctx) {
        HomeServlet s = spy(new HomeServlet());
        doReturn(ctx).when(s).getServletContext();
        return s;
    }

    @Test
    void doGet_success_setsProdottiAndForwardsHomeJsp() throws Exception {
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        ServletContext servletContext = mock(ServletContext.class);
        RequestDispatcher dispatcher = mock(RequestDispatcher.class);

        when(servletContext.getRequestDispatcher("/home.jsp")).thenReturn(dispatcher);

        ArrayList<ProdottoBean> prodotti = new ArrayList<>();
        prodotti.add(new ProdottoBean());
        prodotti.add(new ProdottoBean());

        try (MockedConstruction<prodottoDao> mocked = mockConstruction(
                prodottoDao.class,
                (mock, context) -> when(mock.doRetrieveAllLimit()).thenReturn(prodotti)
        )) {
            HomeServlet s = servletWithContext(servletContext);

            s.doGet(request, response);

            verify(request).setAttribute("prodotti", prodotti);
            verify(servletContext).getRequestDispatcher("/home.jsp");
            verify(dispatcher).forward(request, response);
            verify(response, never()).sendRedirect(anyString());

            // sanity: davvero ha costruito il DAO una volta
            // (non è obbligatorio, ma aiuta a capire che mockConstruction sta lavorando)
            org.junit.jupiter.api.Assertions.assertEquals(1, mocked.constructed().size());
        }
    }

    @Test
    void doGet_sqlException_redirectsToGeneralError_andDoesNotForward() throws Exception {
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        ServletContext servletContext = mock(ServletContext.class);

        try (MockedConstruction<prodottoDao> mocked = mockConstruction(
                prodottoDao.class,
                (mock, context) -> when(mock.doRetrieveAllLimit()).thenThrow(new SQLException("DB down"))
        )) {
            HomeServlet s = servletWithContext(servletContext);

            s.doGet(request, response);

            verify(response).sendRedirect("./ErrorPage/generalError.jsp");
            verify(servletContext, never()).getRequestDispatcher(anyString());
            verify(request, never()).setAttribute(eq("prodotti"), any());
        }
    }

    @Test
    void doPost_delegatesToDoGet() throws Exception {
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        ServletContext servletContext = mock(ServletContext.class);
        RequestDispatcher dispatcher = mock(RequestDispatcher.class);

        when(servletContext.getRequestDispatcher("/home.jsp")).thenReturn(dispatcher);

        ArrayList<ProdottoBean> prodotti = new ArrayList<>();
        prodotti.add(new ProdottoBean());

        try (MockedConstruction<prodottoDao> mocked = mockConstruction(
                prodottoDao.class,
                (mock, context) -> when(mock.doRetrieveAllLimit()).thenReturn(prodotti)
        )) {
            HomeServlet s = servletWithContext(servletContext);

            s.doPost(request, response);

            verify(request).setAttribute("prodotti", prodotti);
            verify(dispatcher).forward(request, response);
        }
    }
}
