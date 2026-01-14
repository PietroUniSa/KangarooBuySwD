package ita.kangaroo.controller;

import ita.kangaroo.dao.ComposizioneDao;
import ita.kangaroo.dao.FatturazioneDao;
import ita.kangaroo.dao.OrdineDao;
import ita.kangaroo.dao.prodottoDao;
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

class DettagliOrdiniTest {

    private HttpServletRequest request;
    private HttpServletResponse response;
    private HttpSession session;
    private ServletContext servletContext;
    private RequestDispatcher dispatcherOrderDetails;
    private RequestDispatcher dispatcherFatturazione;

    // ====== Fakes DAO (override solo ciò che serve) ======
    static class FakeOrdineDao extends OrdineDao {
        OrdineBean byKey;
        SQLException ex;

        @Override
        public OrdineBean doRetrieveByKey(int id) throws SQLException {
            if (ex != null) throw ex;
            return byKey;
        }
    }

    static class FakeComposizioneDao extends ComposizioneDao {
        ArrayList<OrderProductBean> byKey;
        SQLException ex;

        @Override
        public ArrayList<OrderProductBean> doRetrieveByKey(int idordine) throws SQLException {
            if (ex != null) throw ex;
            return byKey;
        }
    }

    static class FakeProdottoDao extends prodottoDao {
        ProdottoBean byKey;
        SQLException ex;

        @Override
        public ProdottoBean doRetrieveByKey(int id) throws SQLException {
            if (ex != null) throw ex;
            return byKey;
        }
    }

    static class FakeFatturazioneDao extends FatturazioneDao {
        FatturazioneBean byOrder;
        SQLException ex;

        @Override
        public FatturazioneBean doRetrieveByOrder(int idordine) throws SQLException {
            if (ex != null) throw ex;
            return byOrder;
        }
    }

    private FakeOrdineDao ordineDaoFake;
    private FakeComposizioneDao composizioneDaoFake;
    private FakeProdottoDao prodottoDaoFake;
    private FakeFatturazioneDao fatturazioneDaoFake;

    @BeforeEach
    void setup() {
        request = mock(HttpServletRequest.class);
        response = mock(HttpServletResponse.class);
        session = mock(HttpSession.class);
        servletContext = mock(ServletContext.class);
        dispatcherOrderDetails = mock(RequestDispatcher.class);
        dispatcherFatturazione = mock(RequestDispatcher.class);

        when(request.getSession()).thenReturn(session);

        ordineDaoFake = new FakeOrdineDao();
        composizioneDaoFake = new FakeComposizioneDao();
        prodottoDaoFake = new FakeProdottoDao();
        fatturazioneDaoFake = new FakeFatturazioneDao();

        // Rewire static DAO del servlet
        DettagliOrdini.orderModel = ordineDaoFake;
        DettagliOrdini.orderProdModel = composizioneDaoFake;
        DettagliOrdini.prodModel = prodottoDaoFake;
        DettagliOrdini.invoiceModel = fatturazioneDaoFake;
    }

    private DettagliOrdini servlet() {
        DettagliOrdini s = spy(new DettagliOrdini());
        doReturn(servletContext).when(s).getServletContext();

        when(servletContext.getRequestDispatcher("/orderDetails.jsp")).thenReturn(dispatcherOrderDetails);
        when(servletContext.getRequestDispatcher("/fatturazione.jsp")).thenReturn(dispatcherFatturazione);

        return s;
    }

    private utenteBean user(String username, String email) {
        utenteBean u = new utenteBean();
        u.setUsername(username);
        u.setEmail(email);
        return u;
    }

    private OrdineBean ordineConClientUsername(String username) {
        OrdineBean o = new OrdineBean();
        utenteBean client = new utenteBean();
        client.setUsername(username);
        o.setClient(client);
        return o;
    }

    @Test
    void whenNotLogged_redirectsToLogin_andReturns() throws Exception {
        DettagliOrdini s = servlet();
        when(session.getAttribute("utente")).thenReturn(null);

        s.doGet(request, response);

        verify(response).sendRedirect("LoginServlet");
        verify(dispatcherOrderDetails, never()).forward(any(), any());
        verify(dispatcherFatturazione, never()).forward(any(), any());
    }

    @Test
    void actionNull_orderOwned_setsDetailedOrder_andForwardsOrderDetails() throws Exception {
        DettagliOrdini s = servlet();
        utenteBean logged = user("mario", "mario@example.com");
        when(session.getAttribute("utente")).thenReturn(logged);

        when(request.getParameter("action")).thenReturn(null);
        when(request.getParameter("ordine")).thenReturn("10");

        OrdineBean ordine = ordineConClientUsername("mario");
        ordineDaoFake.byKey = ordine;

        s.doGet(request, response);

        verify(request).setAttribute("detailedOrder", ordine);
        verify(dispatcherOrderDetails).forward(request, response);
        verify(response, never()).sendRedirect("HomeServlet");
    }

    @Test
    void actionNull_orderNotOwned_andNotAdmin_redirectsHome_butStillForwardsOrderDetails() throws Exception {
        // NOTA: comportamento attuale del servlet: fa sendRedirect("HomeServlet") MA NON return
        // quindi poi forwarda comunque /orderDetails.jsp.
        DettagliOrdini s = servlet();
        utenteBean logged = user("mario", "mario@example.com");
        when(session.getAttribute("utente")).thenReturn(logged);

        when(request.getParameter("action")).thenReturn(null);
        when(request.getParameter("ordine")).thenReturn("11");

        OrdineBean ordine = ordineConClientUsername("luigi");
        ordineDaoFake.byKey = ordine;

        s.doGet(request, response);

        verify(response).sendRedirect("HomeServlet");
        verify(request, never()).setAttribute(eq("detailedOrder"), any());
        verify(dispatcherOrderDetails).forward(request, response);
    }

    @Test
    void actionNull_adminCanSeeAnyOrder_setsDetailedOrder_andForwards() throws Exception {
        DettagliOrdini s = servlet();
        utenteBean admin = user("mario", "provoloni@example.com");
        when(session.getAttribute("utente")).thenReturn(admin);

        when(request.getParameter("action")).thenReturn(null);
        when(request.getParameter("ordine")).thenReturn("12");

        OrdineBean ordine = ordineConClientUsername("qualcunaltro");
        ordineDaoFake.byKey = ordine;

        s.doGet(request, response);

        verify(request).setAttribute("detailedOrder", ordine);
        verify(dispatcherOrderDetails).forward(request, response);
        verify(response, never()).sendRedirect("HomeServlet");
    }

    @Test
    void actionNull_sqlException_redirectsGeneralError_andReturns() throws Exception {
        DettagliOrdini s = servlet();
        utenteBean logged = user("mario", "mario@example.com");
        when(session.getAttribute("utente")).thenReturn(logged);

        when(request.getParameter("action")).thenReturn(null);
        when(request.getParameter("ordine")).thenReturn("13");

        ordineDaoFake.ex = new SQLException("DB down");

        s.doGet(request, response);

        verify(response).sendRedirect("./ErrorPage/generalError.jsp");
        verify(dispatcherOrderDetails, never()).forward(any(), any());
    }

    @Test
    void viewInvoice_happyPath_setsAttributes_andForwardsFatturazione() throws Exception {
        DettagliOrdini s = servlet();
        utenteBean logged = user("mario", "mario@example.com");
        when(session.getAttribute("utente")).thenReturn(logged);

        when(request.getParameter("action")).thenReturn("viewInvoice");
        when(request.getParameter("idOrder")).thenReturn("20");

        // composizione: 2 prodotti
        ArrayList<OrderProductBean> ops = new ArrayList<>();
        OrderProductBean op1 = new OrderProductBean();
        op1.setId_prodotto(1);
        OrderProductBean op2 = new OrderProductBean();
        op2.setId_prodotto(2);
        ops.add(op1);
        ops.add(op2);
        composizioneDaoFake.byKey = ops;

        // prodottoDao: qui per semplicità ritorniamo sempre lo stesso bean per ogni id
        ProdottoBean p = new ProdottoBean();
        p.setId(999);
        prodottoDaoFake.byKey = p;

        // fattura
        FatturazioneBean f = new FatturazioneBean();
        fatturazioneDaoFake.byOrder = f;

        s.doGet(request, response);

        // products: lista con 2 elementi (anche se stesso oggetto, va bene per il test)
        verify(request).setAttribute(eq("products"), argThat(list ->
                list instanceof ArrayList && ((ArrayList<?>) list).size() == 2
        ));
        verify(request).setAttribute("orderProducts", ops);
        verify(request).setAttribute("invoice", f);

        verify(dispatcherFatturazione).forward(request, response);
        verify(dispatcherOrderDetails, never()).forward(any(), any());
    }

    @Test
    void viewInvoice_composizioneSqlException_redirectsError_andReturns() throws Exception {
        DettagliOrdini s = servlet();
        utenteBean logged = user("mario", "mario@example.com");
        when(session.getAttribute("utente")).thenReturn(logged);

        when(request.getParameter("action")).thenReturn("viewInvoice");
        when(request.getParameter("idOrder")).thenReturn("21");

        composizioneDaoFake.ex = new SQLException("DB down");

        s.doGet(request, response);

        verify(response).sendRedirect("./ErrorPage/generalError.jsp");
        verify(dispatcherFatturazione, never()).forward(any(), any());
    }

    @Test
    void viewInvoice_prodottoSqlException_redirectsError_andReturns() throws Exception {
        DettagliOrdini s = servlet();
        utenteBean logged = user("mario", "mario@example.com");
        when(session.getAttribute("utente")).thenReturn(logged);

        when(request.getParameter("action")).thenReturn("viewInvoice");
        when(request.getParameter("idOrder")).thenReturn("22");

        ArrayList<OrderProductBean> ops = new ArrayList<>();
        OrderProductBean op1 = new OrderProductBean();
        op1.setId_prodotto(1);
        ops.add(op1);
        composizioneDaoFake.byKey = ops;

        prodottoDaoFake.ex = new SQLException("DB down");

        s.doGet(request, response);

        verify(response).sendRedirect("./ErrorPage/generalError.jsp");
        verify(dispatcherFatturazione, never()).forward(any(), any());
    }

    @Test
    void viewInvoice_invoiceSqlException_redirectsGeneralErrorJsp_andReturns() throws Exception {
        DettagliOrdini s = servlet();
        utenteBean logged = user("mario", "mario@example.com");
        when(session.getAttribute("utente")).thenReturn(logged);

        when(request.getParameter("action")).thenReturn("viewInvoice");
        when(request.getParameter("idOrder")).thenReturn("23");

        ArrayList<OrderProductBean> ops = new ArrayList<>();
        OrderProductBean op1 = new OrderProductBean();
        op1.setId_prodotto(1);
        ops.add(op1);
        composizioneDaoFake.byKey = ops;

        ProdottoBean p = new ProdottoBean();
        prodottoDaoFake.byKey = p;

        fatturazioneDaoFake.ex = new SQLException("DB down");

        s.doGet(request, response);

        // Nota: nel tuo codice qui fai response.sendRedirect("generalError.jsp") (senza ./ErrorPage/)
        verify(response).sendRedirect("generalError.jsp");
        verify(dispatcherFatturazione, never()).forward(any(), any());
    }
}
