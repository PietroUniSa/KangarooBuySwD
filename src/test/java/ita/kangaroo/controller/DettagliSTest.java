package ita.kangaroo.controller;

import ita.kangaroo.dao.prodottoDao;
import ita.kangaroo.model.ProdottoBean;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.*;

class DettagliSTest {

    private HttpServletRequest request;
    private HttpServletResponse response;
    private ServletContext servletContext;
    private RequestDispatcher dispatcher;

    static class FakeProdottoDao extends prodottoDao {
        ProdottoBean byKey;
        SQLException ex;

        @Override
        public ProdottoBean doRetrieveByKey(int id) throws SQLException {
            if (ex != null) throw ex;
            return byKey;
        }
    }

    private FakeProdottoDao fakeDao;

    @BeforeEach
    void setup() {
        request = mock(HttpServletRequest.class);
        response = mock(HttpServletResponse.class);
        servletContext = mock(ServletContext.class);
        dispatcher = mock(RequestDispatcher.class);

        fakeDao = new FakeProdottoDao();
        DettagliS.model = fakeDao;
    }

    private DettagliS servlet() {
        DettagliS s = spy(new DettagliS());
        doReturn(servletContext).when(s).getServletContext();
        return s;
    }

    @Test
    void idNull_redirectsToGestioneCatalogo() throws Exception {
        DettagliS s = servlet();
        when(request.getParameter("id")).thenReturn(null);

        s.doGet(request, response);

        verify(response).sendRedirect("GestioneCatalogo");
        verifyNoInteractions(dispatcher);
    }

    @Test
    void idZero_redirectsToGestioneCatalogo() throws Exception {
        DettagliS s = servlet();
        when(request.getParameter("id")).thenReturn("0");

        s.doGet(request, response);

        verify(response).sendRedirect("GestioneCatalogo");
        verifyNoInteractions(dispatcher);
    }

    @Test
    void idNotNumeric_redirectsToGeneralError() throws Exception {
        DettagliS s = servlet();
        when(request.getParameter("id")).thenReturn("abc");

        s.doGet(request, response);

        verify(response).sendRedirect("./ErrorPage/generalError.jsp");
        verifyNoInteractions(dispatcher);
    }

    @Test
    void productFound_quantityPositive_setsDetailed_andForwards() throws Exception {
        DettagliS s = servlet();
        when(request.getParameter("id")).thenReturn("5");
        when(servletContext.getRequestDispatcher("/details.jsp")).thenReturn(dispatcher);

        ProdottoBean p = new ProdottoBean();
        p.setQuantita(3);
        fakeDao.byKey = p;

        s.doGet(request, response);

        verify(request).setAttribute("detailed", p);
        verify(request, never()).setAttribute(eq("erroresoldout2"), any());
        verify(dispatcher).forward(request, response);
    }

    @Test
    void productFound_soldOut_setsSoldoutAttribute_andForwards() throws Exception {
        DettagliS s = servlet();
        when(request.getParameter("id")).thenReturn("5");
        when(servletContext.getRequestDispatcher("/details.jsp")).thenReturn(dispatcher);

        ProdottoBean p = new ProdottoBean();
        p.setQuantita(0);
        fakeDao.byKey = p;

        s.doGet(request, response);

        verify(request).setAttribute(eq("erroresoldout2"), anyString());
        verify(request).setAttribute("detailed", p);
        verify(dispatcher).forward(request, response);
    }

    @Test
    void daoThrowsSQLException_redirectsToGeneralError() throws Exception {
        DettagliS s = servlet();
        when(request.getParameter("id")).thenReturn("5");

        fakeDao.ex = new SQLException("DB down");

        s.doGet(request, response);

        verify(response).sendRedirect("./ErrorPage/generalError.jsp");
        verifyNoInteractions(dispatcher);
    }
}
