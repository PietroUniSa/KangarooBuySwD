package ita.kangaroo.controller;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;
import ita.kangaroo.dao.prodottoDao;
import ita.kangaroo.model.ProdottoBean;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockedConstruction;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;

class GestioneCatalogoTest {

    private HttpServletRequest request;
    private HttpServletResponse response;
    private ServletContext servletContext;
    private RequestDispatcher dispatcher;

    @BeforeEach
    void setup() {
        request = mock(HttpServletRequest.class);
        response = mock(HttpServletResponse.class);
        servletContext = mock(ServletContext.class);
        dispatcher = mock(RequestDispatcher.class);
    }

    private GestioneCatalogo servlet() {
        GestioneCatalogo s = spy(new GestioneCatalogo());
        doReturn(servletContext).when(s).getServletContext();
        return s;
    }

    private static StringWriter wireResponseWriter(HttpServletResponse response) throws Exception {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw, true);
        when(response.getWriter()).thenReturn(pw);
        return sw;
    }

    private static JsonArray parseJsonArray(String json) {
        return JsonParser.parseString(json).getAsJsonArray();
    }

    @Test
    void nonAjax_actionNull_forwardsToCatalogoJsp() throws Exception {
        GestioneCatalogo s = servlet();

        when(request.getHeader("X-Requested-With")).thenReturn(null); // non-ajax
        when(request.getParameter("action")).thenReturn(null);
        when(servletContext.getRequestDispatcher("/Catalogo.jsp")).thenReturn(dispatcher);

        s.doGet(request, response);

        verify(dispatcher).forward(request, response);
        verify(response, never()).sendRedirect(anyString());
    }

    @Test
    void ajax_actionNull_returnsAllAsJson() throws Exception {
        GestioneCatalogo s = servlet();

        when(request.getHeader("X-Requested-With")).thenReturn("XMLHttpRequest");
        when(request.getParameter("action")).thenReturn(null);

        ArrayList<ProdottoBean> list = new ArrayList<>();
        list.add(new ProdottoBean());
        list.add(new ProdottoBean());

        StringWriter sw = wireResponseWriter(response);

        try (MockedConstruction<prodottoDao> mocked = mockConstruction(prodottoDao.class,
                (mock, ctx) -> when(mock.doRetrieveAll()).thenReturn(list))) {

            s.doGet(request, response);
        }

        verify(response).setContentType("application/json");

        JsonArray arr = parseJsonArray(sw.toString());
        assertEquals(2, arr.size());
    }

    @Test
    void ajax_suggest_returnsMatchesAsJson() throws Exception {
        GestioneCatalogo s = servlet();

        when(request.getHeader("X-Requested-With")).thenReturn("XMLHttpRequest");
        when(request.getParameter("action")).thenReturn("suggest");
        when(request.getParameter("keyword")).thenReturn("mic");

        ArrayList<ProdottoBean> list = new ArrayList<>();
        list.add(new ProdottoBean());

        StringWriter sw = wireResponseWriter(response);

        try (MockedConstruction<prodottoDao> mocked = mockConstruction(prodottoDao.class,
                (mock, ctx) -> when(mock.doRetrieveAllByName("mic")).thenReturn(list))) {

            s.doGet(request, response);
        }

        JsonArray arr = parseJsonArray(sw.toString());
        assertEquals(1, arr.size());
    }

    @Test
    void ajax_searchByCategory_returnsMatchesAsJson() throws Exception {
        GestioneCatalogo s = servlet();

        when(request.getHeader("X-Requested-With")).thenReturn("XMLHttpRequest");
        when(request.getParameter("action")).thenReturn("searchByCategory");
        when(request.getParameter("category")).thenReturn("GOMME");

        ArrayList<ProdottoBean> list = new ArrayList<>();
        list.add(new ProdottoBean());
        list.add(new ProdottoBean());
        list.add(new ProdottoBean());

        StringWriter sw = wireResponseWriter(response);

        try (MockedConstruction<prodottoDao> mocked = mockConstruction(prodottoDao.class,
                (mock, ctx) -> when(mock.doRetrieveAllByCategory("GOMME")).thenReturn(list))) {

            s.doGet(request, response);
        }

        JsonArray arr = parseJsonArray(sw.toString());
        assertEquals(3, arr.size());
    }

    @Test
    void ajax_filter_buildsSqlAndReturnsJson() throws Exception {
        GestioneCatalogo s = servlet();

        when(request.getHeader("X-Requested-With")).thenReturn("XMLHttpRequest");
        when(request.getParameter("action")).thenReturn("filter");

        when(request.getParameter("prezzo_da")).thenReturn("10");
        when(request.getParameter("prezzo_a")).thenReturn("99.9");
        when(request.getParameter("categoria")).thenReturn("ANIMALI");

        ArrayList<ProdottoBean> list = new ArrayList<>();
        list.add(new ProdottoBean());

        StringWriter sw = wireResponseWriter(response);

        try (MockedConstruction<prodottoDao> mocked = mockConstruction(prodottoDao.class,
                (mock, ctx) -> {
                    when(mock.doRetrieveAllByKeyword(eq(""), anyString())).thenReturn(list);
                })) {

            s.doGet(request, response);

            prodottoDao daoMock = mocked.constructed().get(0);
            // Verifica che la SQL contenga i pezzi importanti
            verify(daoMock).doRetrieveAllByKeyword(eq(""), argThat(sql ->
                    sql.contains("Prezzo >=") &&
                    sql.contains("10") &&
                    sql.contains("Prezzo <=") &&
                    sql.contains("99.9") &&
                    sql.contains("Tipo = 'ANIMALI'")
            ));
        }

        JsonArray arr = parseJsonArray(sw.toString());
        assertEquals(1, arr.size());
    }

    @Test
    void ajax_filter_invalidPrice_redirectsToGeneralError() throws Exception {
        GestioneCatalogo s = servlet();

        when(request.getHeader("X-Requested-With")).thenReturn("XMLHttpRequest");
        when(request.getParameter("action")).thenReturn("filter");
        when(request.getParameter("prezzo_da")).thenReturn("boh"); // invalido

        // anche se mockiamo il costruttore, qui non deve arrivare a fare query
        try (MockedConstruction<prodottoDao> ignored = mockConstruction(prodottoDao.class)) {
            s.doGet(request, response);
        }

        verify(response).sendRedirect("./ErrorPage/generalError.jsp");
        verify(response, never()).setContentType("application/json");
    }

    @Test
    void ajax_sqlException_redirectsToGeneralError() throws Exception {
        GestioneCatalogo s = servlet();

        when(request.getHeader("X-Requested-With")).thenReturn("XMLHttpRequest");
        when(request.getParameter("action")).thenReturn(null);

        try (MockedConstruction<prodottoDao> mocked = mockConstruction(prodottoDao.class,
                (mock, ctx) -> when(mock.doRetrieveAll()).thenThrow(new SQLException("DB down")))) {

            s.doGet(request, response);
        }

        verify(response).sendRedirect("./ErrorPage/generalError.jsp");
    }
}
