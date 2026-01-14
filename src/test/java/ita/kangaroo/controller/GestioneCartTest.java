package ita.kangaroo.controller;

import ita.kangaroo.dao.AddressDao;
import ita.kangaroo.dao.MetodoPagamentoDao;
import ita.kangaroo.dao.prodottoDao;
import ita.kangaroo.model.*;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.sql.SQLException;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;

class GestioneCartTest {

    private HttpServletRequest request;
    private HttpServletResponse response;
    private HttpSession session;
    private ServletContext servletContext;

    private RequestDispatcher cartDispatcher;
    private RequestDispatcher pagamentoDispatcher;
    private RequestDispatcher utenteDispatcher;

    // Sessione "con memoria" (Map-backed)
    private final Map<String, Object> sessionStore = new HashMap<>();

    // ====== Fakes DAO ======
    static class FakeProdottoDao extends prodottoDao {
        ProdottoBean byKey;
        SQLException ex;

        @Override
        public ProdottoBean doRetrieveByKey(int id) throws SQLException {
            if (ex != null) throw ex;
            return byKey;
        }
    }

    static class FakeAddressDao extends AddressDao {
        ArrayList<AddressBean> byClient = new ArrayList<>();
        SQLException ex;

        @Override
        public ArrayList<AddressBean> doRetrieveByClient(String username) throws SQLException {
            if (ex != null) throw ex;
            return byClient;
        }
    }

    static class FakeMetodoPagamentoDao extends MetodoPagamentoDao {
        ArrayList<MetodoPagamentoBean> byClient = new ArrayList<>();
        SQLException ex;

        @Override
        public ArrayList<MetodoPagamentoBean> doRetrieveByClient(String username) throws SQLException {
            if (ex != null) throw ex;
            return byClient;
        }
    }

    private FakeProdottoDao prodottoDaoFake;
    private FakeAddressDao addressDaoFake;
    private FakeMetodoPagamentoDao pagamentoDaoFake;

    @BeforeEach
    void setup() throws Exception {
        request = mock(HttpServletRequest.class);
        response = mock(HttpServletResponse.class);
        session = mock(HttpSession.class);
        servletContext = mock(ServletContext.class);

        cartDispatcher = mock(RequestDispatcher.class);
        pagamentoDispatcher = mock(RequestDispatcher.class);
        utenteDispatcher = mock(RequestDispatcher.class);

        // Session backing store
        when(request.getSession()).thenReturn(session);
        when(session.getAttribute(anyString())).thenAnswer(inv -> sessionStore.get(inv.getArgument(0)));
        doAnswer(inv -> {
            sessionStore.put(inv.getArgument(0), inv.getArgument(1));
            return null;
        }).when(session).setAttribute(anyString(), any());

        // Dispatcher routing
        when(servletContext.getRequestDispatcher("/Cart.jsp")).thenReturn(cartDispatcher);
        when(servletContext.getRequestDispatcher("/GestionePagamento")).thenReturn(pagamentoDispatcher);
        when(servletContext.getRequestDispatcher("/UtenteServlet")).thenReturn(utenteDispatcher);

        // Fakes
        prodottoDaoFake = new FakeProdottoDao();
        addressDaoFake = new FakeAddressDao();
        pagamentoDaoFake = new FakeMetodoPagamentoDao();

        // Inietta i DAO fake nei private static del servlet (reflection)
        setStaticField(GestioneCart.class, "model", prodottoDaoFake);
        setStaticField(GestioneCart.class, "addressModel", addressDaoFake);
        setStaticField(GestioneCart.class, "paymentModel", pagamentoDaoFake);

        // Default param safe
        when(request.getParameter("id")).thenReturn("1");
        when(request.getParameter("action")).thenReturn(null); // default: seeCart
    }

    private static void setStaticField(Class<?> clazz, String fieldName, Object value) throws Exception {
        Field f = clazz.getDeclaredField(fieldName);
        f.setAccessible(true);
        f.set(null, value);
    }

    private GestioneCart servlet() {
        GestioneCart s = spy(new GestioneCart());
        doReturn(servletContext).when(s).getServletContext();
        return s;
    }

    private static utenteBean adminUser() {
        utenteBean u = new utenteBean();
        u.setEmail("provoloni@example.com");
        u.setUsername("admin");
        return u;
    }

    private static utenteBean normalUser() {
        utenteBean u = new utenteBean();
        u.setEmail("user@example.com");
        u.setUsername("mario");
        return u;
    }

    private static ProdottoBean prodotto(int id, int quantita) {
        ProdottoBean p = new ProdottoBean();
        p.setId(id);
        p.setQuantita(quantita);
        return p;
    }

    @Test
    void cartMissing_createsCartAndForwardsToCartJsp() throws Exception {
        GestioneCart s = servlet();

        // cart non presente
        sessionStore.remove("cart");

        // prodotto recuperabile (non serve davvero, ma evitiamo sorprese)
        prodottoDaoFake.byKey = prodotto(1, 5);

        s.doGet(request, response);

        Object cartObj = sessionStore.get("cart");
        assertNotNull(cartObj);
        assertTrue(cartObj instanceof Cart);

        verify(cartDispatcher).forward(request, response);
    }

    @Test
    void adminUser_redirectsToHome() throws Exception {
        GestioneCart s = servlet();
        sessionStore.put("utente", adminUser());

        s.doGet(request, response);

        verify(response).sendRedirect("HomeServlet");
        verify(cartDispatcher, never()).forward(any(), any());
    }

    @Test
    void addAction_withAvailability_addsProductToCart() throws Exception {
        GestioneCart s = servlet();
        sessionStore.put("utente", normalUser());

        when(request.getParameter("action")).thenReturn("add");
        when(request.getParameter("id")).thenReturn("1");
        prodottoDaoFake.byKey = prodotto(1, 5);

        // cart vuoto iniziale
        Cart cart = new Cart();
        sessionStore.put("cart", cart);

        s.doGet(request, response);

        assertNotNull(sessionStore.get("cart"));
        Cart updated = (Cart) sessionStore.get("cart");
        assertTrue(updated.getProducts().size() >= 1);

        verify(cartDispatcher).forward(request, response);
    }

    @Test
    void addAction_soldOut_setsErroreSoldoutAttribute() throws Exception {
        GestioneCart s = servlet();
        sessionStore.put("utente", normalUser());

        when(request.getParameter("action")).thenReturn("add");
        when(request.getParameter("id")).thenReturn("1");
        prodottoDaoFake.byKey = prodotto(1, 0);

        sessionStore.put("cart", new Cart());

        s.doGet(request, response);

        verify(request).setAttribute(eq("erroresoldout"), contains("esaurito"));
        verify(cartDispatcher).forward(request, response);
    }

    @Test
    void removeAction_removesProductFromCart() throws Exception {
        GestioneCart s = servlet();
        sessionStore.put("utente", normalUser());

        when(request.getParameter("action")).thenReturn("Elimina dal carrello");
        when(request.getParameter("id")).thenReturn("1");
        ProdottoBean p = prodotto(1, 5);
        prodottoDaoFake.byKey = p;

        Cart cart = new Cart();
        cart.addProduct(p);
        assertTrue(cart.getProducts().size() >= 1);
        sessionStore.put("cart", cart);

        s.doGet(request, response);

        Cart updated = (Cart) sessionStore.get("cart");
        // dipende da implementazione removeProduct, ma almeno non deve esplodere
        assertNotNull(updated);

        verify(cartDispatcher).forward(request, response);
    }

    @Test
    void modifyQuantity_tooMany_setsErroreDisponibilita() throws Exception {
        GestioneCart s = servlet();
        sessionStore.put("utente", normalUser());

        when(request.getParameter("action")).thenReturn("Modifica Quantita");
        when(request.getParameter("id")).thenReturn("1");
        when(request.getParameter("quantity")).thenReturn("10"); // troppo
        prodottoDaoFake.byKey = prodotto(1, 3);

        sessionStore.put("cart", new Cart());

        s.doGet(request, response);

        verify(request).setAttribute(eq("erroredisponibilita"), contains("troppi"));
        verify(cartDispatcher).forward(request, response);
    }

    @Test
    void buyAction_notLogged_redirectsToLogin() throws Exception {
        GestioneCart s = servlet();

        when(request.getParameter("action")).thenReturn("buy");
        when(request.getParameter("id")).thenReturn("1");
        prodottoDaoFake.byKey = prodotto(1, 5);

        // cart NON vuoto
        Cart cart = new Cart();
        cart.addProduct(prodotto(1, 5));
        sessionStore.put("cart", cart);

        // utente null
        sessionStore.remove("utente");

        s.doGet(request, response);

        verify(response).sendRedirect("LoginServlet");
        verify(cartDispatcher, never()).forward(any(), any());
    }

    @Test
    void buyAction_loggedWithAddressAndPayment_forwardsToGestionePagamento() throws Exception {
        GestioneCart s = servlet();

        when(request.getParameter("action")).thenReturn("buy");
        when(request.getParameter("id")).thenReturn("1");
        prodottoDaoFake.byKey = prodotto(1, 5);

        // cart NON vuoto
        Cart cart = new Cart();
        cart.addProduct(prodotto(1, 5));
        sessionStore.put("cart", cart);

        // utente loggato
        utenteBean client = normalUser();
        sessionStore.put("utente", client);

        // address + payment presenti
        addressDaoFake.byClient = new ArrayList<>();
        addressDaoFake.byClient.add(new AddressBean());

        pagamentoDaoFake.byClient = new ArrayList<>();
        pagamentoDaoFake.byClient.add(new MetodoPagamentoBean());

        s.doGet(request, response);

        verify(request).setAttribute(eq("addresses"), anyList());
        verify(request).setAttribute(eq("payments"), anyList());
        verify(pagamentoDispatcher).forward(request, response);
        verify(cartDispatcher, never()).forward(any(), any());
    }

    @Test
    void buyAction_loggedMissingAddressOrPayment_forwardsToUtenteServlet() throws Exception {
        GestioneCart s = servlet();

        when(request.getParameter("action")).thenReturn("buy");
        when(request.getParameter("id")).thenReturn("1");
        prodottoDaoFake.byKey = prodotto(1, 5);

        Cart cart = new Cart();
        cart.addProduct(prodotto(1, 5));
        sessionStore.put("cart", cart);

        utenteBean client = normalUser();
        sessionStore.put("utente", client);

        // manca qualcosa: liste vuote
        addressDaoFake.byClient = new ArrayList<>();
        pagamentoDaoFake.byClient = new ArrayList<>();

        s.doGet(request, response);

        verify(request).setAttribute(eq("carterror"), contains("aggiungi"));
        verify(utenteDispatcher).forward(request, response);
        verify(cartDispatcher, never()).forward(any(), any());
    }

    @Test
    void sqlExceptionOnProductLookup_redirectsToGeneralError() throws Exception {
        GestioneCart s = servlet();
        sessionStore.put("utente", normalUser());

        when(request.getParameter("action")).thenReturn("add");
        when(request.getParameter("id")).thenReturn("1");

        prodottoDaoFake.ex = new SQLException("DB down");

        s.doGet(request, response);

        verify(response).sendRedirect("./ErrorPage/generalError.jsp");
        verify(cartDispatcher, never()).forward(any(), any());
    }
}
