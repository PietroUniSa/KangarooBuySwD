package ita.kangaroo.controller;

import ita.kangaroo.dao.OrdineDao;
import ita.kangaroo.dao.prodottoDao;
import ita.kangaroo.dao.utenteDao;
import ita.kangaroo.model.*;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import javax.naming.*;
import javax.naming.spi.InitialContextFactory;
import javax.sql.DataSource;

import java.io.*;
import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class AdminServletTest {

    // ---- JNDI config: MUST match your DAO ----
    private static final String ENV_CTX = "java:comp/env";
    private static final String JNDI_DS_NAME = "jdbc/kangaroodb";

    // ---- Servlet mocks ----
    @Mock private ServletConfig servletConfig;
    @Mock private HttpServletRequest request;
    @Mock private HttpServletResponse response;
    @Mock private HttpSession session;
    @Mock private ServletContext servletContext;
    @Mock private RequestDispatcher dispatcher;
    @Mock private Part filePart;
    @Mock private InputStream inputStream;

    // ---- DAO mocks ----
    @Mock private OrdineDao mockOrderModel;
    @Mock private prodottoDao mockProductModel;
    @Mock private utenteDao mockClientModel;

    // ---- DataSource mocks (JNDI) ----
    @Mock private DataSource dataSource;
    @Mock private Connection connection;

    private AdminServlet adminServlet;
    private utenteBean adminUser;
    private utenteBean nonAdminUser;

    // ------------------------------------------------------------
    // ✅ JNDI init BEFORE any DAO static initializers might run
    // ------------------------------------------------------------
    @BeforeAll
    static void initJndiFactory() {
        System.setProperty(Context.INITIAL_CONTEXT_FACTORY, InMemoryInitialContextFactory.class.getName());
    }

    @BeforeEach
    void setUp() throws Exception {
        // ------------------------------------------------------------
        // ✅ Bind mocked DataSource into JNDI: java:comp/env/jdbc/kangaroodb
        // ------------------------------------------------------------
        InitialContext ic = new InitialContext();

        Context env;
        try {
            env = (Context) ic.lookup(ENV_CTX);
        } catch (NamingException e) {
            env = ic.createSubcontext(ENV_CTX);
        }
        env.rebind(JNDI_DS_NAME, dataSource);

        // If DAOs ask for connections
        lenient().when(dataSource.getConnection()).thenReturn(connection);

        // ------------------------------------------------------------
        // Servlet init
        // ------------------------------------------------------------
        adminServlet = new AdminServlet();

        lenient().when(servletConfig.getServletContext()).thenReturn(servletContext);
        adminServlet.init(servletConfig);

        // Setup users
        adminUser = new utenteBean();
        adminUser.setEmail("provoloni@example.com");

        nonAdminUser = new utenteBean();
        nonAdminUser.setEmail("user@example.com");

        // Inject mocked DAOs (static fields on servlet)
        injectMockDao("orderModel", mockOrderModel);
        injectMockDao("model", mockProductModel);
        injectMockDao("clientModel", mockClientModel);

        // Common mocks
        lenient().when(request.getSession()).thenReturn(session);
        lenient().when(request.getServletContext()).thenReturn(servletContext);
        lenient().when(servletContext.getRequestDispatcher(anyString())).thenReturn(dispatcher);
        lenient().when(request.getRequestDispatcher(anyString())).thenReturn(dispatcher);
    }

    private void injectMockDao(String fieldName, Object mockDao) throws Exception {
        Field field = AdminServlet.class.getDeclaredField(fieldName);
        field.setAccessible(true);
        field.set(null, mockDao); // static field
    }

    // ------------------------------------------------------------
    // ✅ JNDI in-memory implementation
    // ------------------------------------------------------------
    public static final class InMemoryInitialContextFactory implements InitialContextFactory {
        private static final Context ROOT = new InMemoryContext();
        @Override public Context getInitialContext(Hashtable<?, ?> environment) {
            return ROOT;
        }
    }

    public static final class InMemoryContext implements Context {
        private final Map<String, Object> bindings = new ConcurrentHashMap<>();

        @Override
        public Object lookup(String name) throws NamingException {
            if (bindings.containsKey(name)) return bindings.get(name);

            // hierarchical lookup "java:comp/env"
            int slash = name.indexOf('/');
            if (slash > 0) {
                String head = name.substring(0, slash);
                String tail = name.substring(slash + 1);
                Object child = bindings.get(head);
                if (child instanceof Context) return ((Context) child).lookup(tail);
            }

            throw new NamingException("Name not bound: " + name);
        }

        @Override
        public Context createSubcontext(String name) {
            InMemoryContext sub = new InMemoryContext();
            rebind(name, sub);
            return sub;
        }

        @Override public void bind(String name, Object obj) { bindings.put(name, obj); }
        @Override public void rebind(String name, Object obj) { bindings.put(name, obj); }
        @Override public void unbind(String name) { bindings.remove(name); }
        @Override public void close() {}

        @Override public Object lookup(Name name) throws NamingException { return lookup(name.toString()); }
        @Override public void bind(Name name, Object obj) throws NamingException { bind(name.toString(), obj); }
        @Override public void rebind(Name name, Object obj) throws NamingException { rebind(name.toString(), obj); }
        @Override public void unbind(Name name) throws NamingException { unbind(name.toString()); }
        @Override public Context createSubcontext(Name name) throws NamingException { return createSubcontext(name.toString()); }

        // Not needed in these tests
        @Override public NamingEnumeration<NameClassPair> list(String name) { throw new UnsupportedOperationException(); }
        @Override public NamingEnumeration<NameClassPair> list(Name name) { throw new UnsupportedOperationException(); }
        @Override public NamingEnumeration<Binding> listBindings(String name) { throw new UnsupportedOperationException(); }
        @Override public NamingEnumeration<Binding> listBindings(Name name) { throw new UnsupportedOperationException(); }
        @Override public void destroySubcontext(String name) { throw new UnsupportedOperationException(); }
        @Override public void destroySubcontext(Name name) { throw new UnsupportedOperationException(); }
        @Override public Object lookupLink(String name) { throw new UnsupportedOperationException(); }
        @Override public Object lookupLink(Name name) { throw new UnsupportedOperationException(); }
        @Override public NameParser getNameParser(String name) { throw new UnsupportedOperationException(); }
        @Override public NameParser getNameParser(Name name) { throw new UnsupportedOperationException(); }
        @Override public Name composeName(Name name, Name prefix) { throw new UnsupportedOperationException(); }
        @Override public String composeName(String name, String prefix) { throw new UnsupportedOperationException(); }
        @Override public Object addToEnvironment(String propName, Object propVal) { throw new UnsupportedOperationException(); }
        @Override public Object removeFromEnvironment(String propName) { throw new UnsupportedOperationException(); }
        @Override public Hashtable<?, ?> getEnvironment() { return new Hashtable<>(); }
        @Override public String getNameInNamespace() { return ""; }
        @Override public void rename(String oldName, String newName) { throw new UnsupportedOperationException(); }
        @Override public void rename(Name oldName, Name newName) { throw new UnsupportedOperationException(); }
    }

    // ------------------------------------------------------------
    // ✅ Tests (your originals)
    // ------------------------------------------------------------

    @Test
    void testDoGet_AdminUserCanAccess() throws ServletException, IOException {
        when(session.getAttribute("utente")).thenReturn(adminUser);
        when(request.getParameter("action")).thenReturn("");

        adminServlet.doGet(request, response);

        verify(dispatcher).forward(request, response);
        verify(response, never()).sendRedirect(anyString());
    }

    @Test
    void testDoGet_NonAdminUserRedirected() throws ServletException, IOException {
        when(session.getAttribute("utente")).thenReturn(nonAdminUser);

        adminServlet.doGet(request, response);

        verify(response).sendRedirect("HomeServlet");
        verify(dispatcher, never()).forward(request, response);
    }

    @Test
    void testDoGet_NullUserRedirected() throws ServletException, IOException {
        when(session.getAttribute("utente")).thenReturn(null);

        adminServlet.doGet(request, response);

        verify(response).sendRedirect("HomeServlet");
    }

    @Test
    void testDoGet_EmptyActionForwardsToAdminPage() throws ServletException, IOException {
        when(session.getAttribute("utente")).thenReturn(adminUser);
        when(request.getParameter("action")).thenReturn("");

        adminServlet.doGet(request, response);

        verify(servletContext).getRequestDispatcher("/admin.jsp");
        verify(dispatcher).forward(request, response);
    }

    @Test
    void testDoGet_InsertProductSuccess() throws Exception {
        when(session.getAttribute("utente")).thenReturn(adminUser);
        when(request.getParameter("action")).thenReturn("insert");

        when(request.getPart("image")).thenReturn(filePart);
        when(filePart.getInputStream()).thenReturn(inputStream);
        when(inputStream.read(any(byte[].class))).thenReturn(-1);

        setupValidProductParameters();

        adminServlet.doGet(request, response);

        verify(mockProductModel).doSave(any(ProdottoBean.class));
        verify(request).setAttribute("success", "Prodotto inserito correttamente.");
    }

    @Test
    void testDoGet_InsertProductInvalidName() throws Exception {
        when(request.getSession()).thenReturn(session);
        when(session.getAttribute("utente")).thenReturn(adminUser);
        when(request.getParameter("action")).thenReturn("insert");

        when(request.getPart("image")).thenReturn(filePart);
        when(filePart.getInputStream()).thenReturn(inputStream);
        // REMOVED: when(inputStream.read(...)).thenReturn(-1);

        setupValidProductParameters();
        when(request.getParameter("name")).thenReturn("Invalid123");

        adminServlet.doGet(request, response);

        verify(request).setAttribute("error",
                "Kangaroo ha incontrato un problema con la sottomissione del form, per favore riprova.");
        verify(dispatcher).forward(request, response);
    }


    @Test
    void testDoGet_InsertProductInvalidCategory() throws Exception {
        when(request.getSession()).thenReturn(session);
        when(session.getAttribute("utente")).thenReturn(adminUser);
        when(request.getParameter("action")).thenReturn("insert");

        when(request.getPart("image")).thenReturn(filePart);
        when(filePart.getInputStream()).thenReturn(inputStream);
        // REMOVED: when(inputStream.read(...)).thenReturn(-1);

        setupValidProductParameters();
        when(request.getParameter("category")).thenReturn("invalid_category");

        adminServlet.doGet(request, response);

        verify(request).setAttribute("error",
                "Kangaroo ha incontrato un problema con la sottomissione del form, per favore riprova.");
        verify(dispatcher).forward(request, response);
    }



    @Test
    void testDoGet_InsertProductSQLException() throws Exception {
        when(session.getAttribute("utente")).thenReturn(adminUser);
        when(request.getParameter("action")).thenReturn("insert");

        when(request.getPart("image")).thenReturn(filePart);
        when(filePart.getInputStream()).thenReturn(inputStream);
        when(inputStream.read(any(byte[].class))).thenReturn(-1);

        setupValidProductParameters();
        doThrow(new SQLException("Database error")).when(mockProductModel).doSave(any(ProdottoBean.class));
        when(request.getContextPath()).thenReturn("/kangaroo");

        adminServlet.doGet(request, response);

        verify(response).sendRedirect("/kangaroo/ErrorPage/generalError.jsp");
    }

    @Test
    void testDoGet_LoadProductSuccess() throws Exception {
        when(session.getAttribute("utente")).thenReturn(adminUser);
        when(request.getParameter("action")).thenReturn("load");
        when(request.getParameter("id")).thenReturn("1");

        ProdottoBean product = new ProdottoBean();
        product.setId(1);
        product.setNome("Test Product");
        when(mockProductModel.doRetrieveByKey(1)).thenReturn(product);

        adminServlet.doGet(request, response);

        verify(request).setAttribute("prodotto", product);
        verify(dispatcher, atLeastOnce()).forward(request, response);
    }

    @Test
    void testDoGet_LoadProductNotFound() throws Exception {
        when(session.getAttribute("utente")).thenReturn(adminUser);
        when(request.getParameter("action")).thenReturn("load");
        when(request.getParameter("id")).thenReturn("999");
        when(mockProductModel.doRetrieveByKey(999)).thenReturn(null);

        adminServlet.doGet(request, response);

        verify(request).setAttribute("error", "Prodotto con ID 999 non trovato.");
        verify(dispatcher, atLeastOnce()).forward(request, response);
    }

    @Test
    void testDoGet_ModifyProductSuccess() throws Exception {
        when(session.getAttribute("utente")).thenReturn(adminUser);
        when(request.getParameter("action")).thenReturn("modify");
        setupValidModifyParameters();

        adminServlet.doGet(request, response);

        verify(mockProductModel).doModify(any(ProdottoBean.class));
        verify(dispatcher).forward(request, response);
    }

    @Test
    void testDoGet_DeleteProductSuccess() throws Exception {
        when(session.getAttribute("utente")).thenReturn(adminUser);
        when(request.getParameter("action")).thenReturn("delete");
        when(request.getParameter("id")).thenReturn("1");
        when(request.getContextPath()).thenReturn("/kangaroo");

        ProdottoBean product = new ProdottoBean();
        product.setId(1);
        when(mockProductModel.doRetrieveByKey(1)).thenReturn(product);

        adminServlet.doGet(request, response);

        verify(mockProductModel).doDelete(1);
        verify(response).sendRedirect("/kangaroo/admin.jsp");
    }

    @Test
    void testDoGet_DeleteProductReferencedInOrders() throws Exception {
        when(session.getAttribute("utente")).thenReturn(adminUser);
        when(request.getParameter("action")).thenReturn("delete");
        when(request.getParameter("id")).thenReturn("1");

        ProdottoBean product = new ProdottoBean();
        product.setId(1);
        when(mockProductModel.doRetrieveByKey(1)).thenReturn(product);

        doThrow(new SQLException("Cannot delete product, it is referenced in composizione. "))
                .when(mockProductModel).doDelete(1);

        adminServlet.doGet(request, response);

        verify(request).setAttribute("error", "Non è possibile eliminare il prodotto poiché è presente in uno o più ordini.");
        verify(request).getRequestDispatcher("/admin.jsp");
        verify(dispatcher, times(2)).forward(request, response);
    }

    @Test
    void testDoGet_OrdersNoFilter() throws Exception {
        when(session.getAttribute("utente")).thenReturn(adminUser);
        when(request.getParameter("action")).thenReturn("ordersNoFilter");

        ArrayList<OrdineBean> orders = new ArrayList<>();
        orders.add(new OrdineBean());
        when(mockOrderModel.doRetrieveAll()).thenReturn(orders);

        adminServlet.doGet(request, response);

        verify(request).setAttribute("ordini", orders);
        verify(servletContext).getRequestDispatcher("/clientsorder.jsp");
        verify(dispatcher).forward(request, response);
    }

    @Test
    void testDoGet_OrdersByClient() throws Exception {
        when(session.getAttribute("utente")).thenReturn(adminUser);
        when(request.getParameter("action")).thenReturn("orders");
        when(request.getParameter("Order By Client")).thenReturn("true");
        when(request.getParameter("cliente")).thenReturn("testuser");

        ArrayList<OrdineBean> orders = new ArrayList<>();
        orders.add(new OrdineBean());
        when(mockOrderModel.doRetrieveByClient("testuser")).thenReturn(orders);

        adminServlet.doGet(request, response);

        verify(request).setAttribute("ordini", orders);
        verify(dispatcher).forward(request, response);
    }

    @Test
    void testDoGet_OrdersByClientNoOrdersFound() throws Exception {
        when(session.getAttribute("utente")).thenReturn(adminUser);
        when(request.getParameter("action")).thenReturn("orders");
        when(request.getParameter("Order By Client")).thenReturn("true");
        when(request.getParameter("cliente")).thenReturn("testuser");
        when(mockOrderModel.doRetrieveByClient("testuser")).thenReturn(new ArrayList<>());

        adminServlet.doGet(request, response);

        verify(request).setAttribute("clientError", "Questo utente non ha ordini salvati");
        verify(dispatcher).forward(request, response);
    }

    @Test
    void testDoGet_OrdersByDateRange() throws Exception {
        when(session.getAttribute("utente")).thenReturn(adminUser);
        when(request.getParameter("action")).thenReturn("orders");
        when(request.getParameter("Order By Client")).thenReturn(null);
        when(request.getParameter("Order By Date")).thenReturn("true");
        when(request.getParameter("data_da")).thenReturn("2023-01-01");
        when(request.getParameter("data_a")).thenReturn("2023-12-31");

        ArrayList<OrdineBean> orders = new ArrayList<>();
        orders.add(new OrdineBean());
        when(mockOrderModel.DateOrders("2023-01-01", "2023-12-31")).thenReturn(orders);

        adminServlet.doGet(request, response);

        verify(request).setAttribute("ordini", orders);
        verify(dispatcher).forward(request, response);
    }

    @Test
    void testDoGet_OrdersByDateRangeInvalidDates() throws Exception {
        when(session.getAttribute("utente")).thenReturn(adminUser);
        when(request.getParameter("action")).thenReturn("orders");
        when(request.getParameter("Order By Client")).thenReturn(null);
        when(request.getParameter("Order By Date")).thenReturn("true");
        when(request.getParameter("data_da")).thenReturn("2023-12-31");
        when(request.getParameter("data_a")).thenReturn("2023-01-01");

        adminServlet.doGet(request, response);

        verify(request).setAttribute("dateError", "Inserisci date valide");
        verify(dispatcher).forward(request, response);
    }

    @Test
    void testDoGet_ClientsNoFilter() throws Exception {
        when(session.getAttribute("utente")).thenReturn(adminUser);
        when(request.getParameter("action")).thenReturn("clientsNoFilter");

        ArrayList<utenteBean> clients = new ArrayList<>();
        clients.add(new utenteBean());
        when(mockClientModel.doRetrieveAll()).thenReturn(clients);

        adminServlet.doGet(request, response);

        verify(request).setAttribute("clienti", clients);
        verify(servletContext).getRequestDispatcher("/Cliente.jsp");
        verify(dispatcher).forward(request, response);
    }

    @Test
    void testDoGet_ByClientSuccess() throws Exception {
        when(session.getAttribute("utente")).thenReturn(adminUser);
        when(request.getParameter("action")).thenReturn("ByClient");
        when(request.getParameter("cliente")).thenReturn("testuser");

        utenteBean client = new utenteBean();
        client.setUsername("testuser");
        when(mockClientModel.doRetrieveByKey("testuser")).thenReturn(client);

        adminServlet.doGet(request, response);

        verify(request).setAttribute(eq("clienti"), any(ArrayList.class));
        verify(dispatcher).forward(request, response);
    }

    @Test
    void testDoGet_ByClientNotFound() throws Exception {
        when(session.getAttribute("utente")).thenReturn(adminUser);
        when(request.getParameter("action")).thenReturn("ByClient");
        when(request.getParameter("cliente")).thenReturn("nonexistent");
        when(mockClientModel.doRetrieveByKey("nonexistent")).thenReturn(null);

        adminServlet.doGet(request, response);

        verify(request).setAttribute("clientError", "Questo utente non esiste");
        verify(dispatcher).forward(request, response);
    }

    @Test
    void testDoPost_DelegatesToDoGet() throws Exception {
        when(session.getAttribute("utente")).thenReturn(adminUser);
        when(request.getParameter("action")).thenReturn("");

        adminServlet.doPost(request, response);

        verify(dispatcher).forward(request, response);
    }

    @Test
    void testParseOrDefault_ValidInteger() throws Exception {
        var method = AdminServlet.class.getDeclaredMethod("parseOrDefault", String.class, int.class);
        method.setAccessible(true);

        int result = (int) method.invoke(adminServlet, "42", 0);
        assertEquals(42, result);
    }

    @Test
    void testParseOrDefault_InvalidInteger() throws Exception {
        var method = AdminServlet.class.getDeclaredMethod("parseOrDefault", String.class, int.class);
        method.setAccessible(true);

        int result = (int) method.invoke(adminServlet, "invalid", 10);
        assertEquals(10, result);
    }

    @Test
    void testParseOrDefaultFloat_ValidFloat() throws Exception {
        var method = AdminServlet.class.getDeclaredMethod("parseOrDefaultFloat", String.class, float.class);
        method.setAccessible(true);

        float result = (float) method.invoke(adminServlet, "3.14", 0f);
        assertEquals(3.14f, result, 0.001f);
    }

    @Test
    void testParseOrDefaultFloat_InvalidFloat() throws Exception {
        var method = AdminServlet.class.getDeclaredMethod("parseOrDefaultFloat", String.class, float.class);
        method.setAccessible(true);

        float result = (float) method.invoke(adminServlet, "invalid", 1.5f);
        assertEquals(1.5f, result, 0.001f);
    }

    @Test
    void testDoGet_LoadProductInvalidId_redirectsGeneralError() throws Exception {
        when(session.getAttribute("utente")).thenReturn(adminUser);
        when(request.getParameter("action")).thenReturn("load");
        when(request.getParameter("id")).thenReturn("abc");
        when(request.getContextPath()).thenReturn("/kangaroo");

        adminServlet.doGet(request, response);

        verify(response).sendRedirect("/kangaroo/ErrorPage/generalError.jsp");
    }

    @Test
    void testDoGet_DeleteProductNotFound_forwardsAdminWithError() throws Exception {
        when(session.getAttribute("utente")).thenReturn(adminUser);
        when(request.getParameter("action")).thenReturn("delete");
        when(request.getParameter("id")).thenReturn("10");

        when(mockProductModel.doRetrieveByKey(10)).thenReturn(null);

        adminServlet.doGet(request, response);

        verify(request).setAttribute(eq("error"), contains("non trovato"));
        verify(dispatcher, atLeastOnce()).forward(request, response);
        verify(response, never()).sendRedirect(contains("/admin.jsp"));
    }

    @Test
    void testDoGet_DeleteProductSQLExceptionGeneric_redirectsGeneralError() throws Exception {
        when(session.getAttribute("utente")).thenReturn(adminUser);
        when(request.getParameter("action")).thenReturn("delete");
        when(request.getParameter("id")).thenReturn("1");
        when(request.getContextPath()).thenReturn("/kangaroo");

        ProdottoBean product = new ProdottoBean();
        product.setId(1);
        when(mockProductModel.doRetrieveByKey(1)).thenReturn(product);

        doThrow(new SQLException("DB generic error")).when(mockProductModel).doDelete(1);

        adminServlet.doGet(request, response);

        verify(response).sendRedirect("/kangaroo/ErrorPage/generalError.jsp");
    }

    @Test
    void testDoGet_OrdersNoFilterSQLException_redirectsGeneralError() throws Exception {
        when(session.getAttribute("utente")).thenReturn(adminUser);
        when(request.getParameter("action")).thenReturn("ordersNoFilter");
        when(request.getContextPath()).thenReturn("/kangaroo");

        when(mockOrderModel.doRetrieveAll()).thenThrow(new SQLException("db down"));

        adminServlet.doGet(request, response);

        verify(response).sendRedirect("/kangaroo/ErrorPage/generalError.jsp");
    }

    @Test
    void testDoGet_ModifyProductInvalidCategory_triggersSendError() throws Exception {
        when(session.getAttribute("utente")).thenReturn(adminUser);
        when(request.getParameter("action")).thenReturn("modify");

        when(request.getParameter("idM")).thenReturn("1");
        when(request.getParameter("availabilityM")).thenReturn("15");
        when(request.getParameter("IVAM")).thenReturn("20.0");
        when(request.getParameter("priceM")).thenReturn("39.99");

        when(request.getParameter("nameM")).thenReturn("Modified Product");
        when(request.getParameter("categoryM")).thenReturn("NOT_A_TIPO");
        when(request.getParameter("descriptionM")).thenReturn("Modified description.");

        adminServlet.doGet(request, response);

        verify(request).setAttribute(eq("error"), anyString());
        verify(dispatcher).forward(request, response);
        verify(mockProductModel, never()).doModify(any());
    }

    @Test
    void testDoGet_InsertProduct_ImageIOException_sends500() throws Exception {
        when(session.getAttribute("utente")).thenReturn(adminUser);
        when(request.getParameter("action")).thenReturn("insert");

        when(request.getPart("image")).thenReturn(filePart);
        when(filePart.getInputStream()).thenThrow(new IOException("boom"));

        adminServlet.doGet(request, response);

        verify(response).sendError(eq(HttpServletResponse.SC_INTERNAL_SERVER_ERROR), contains("Errore immagine"));
        verify(mockProductModel, never()).doSave(any());
    }

    private void setupValidProductParameters() {
        when(request.getParameter("name")).thenReturn("Test Product");
        when(request.getParameter("category")).thenReturn("animale");
        lenient().when(request.getParameter("availability")).thenReturn("10");
        lenient().when(request.getParameter("IVA")).thenReturn("22.0");
        lenient().when(request.getParameter("price")).thenReturn("29.99");
        when(request.getParameter("description")).thenReturn("A test product description.");
    }

    private void setupValidModifyParameters() {
        when(request.getParameter("idM")).thenReturn("1");
        when(request.getParameter("nameM")).thenReturn("Modified Product");
        when(request.getParameter("categoryM")).thenReturn("cibo");
        when(request.getParameter("availabilityM")).thenReturn("15");
        when(request.getParameter("IVAM")).thenReturn("20.0");
        when(request.getParameter("priceM")).thenReturn("39.99");
        when(request.getParameter("descriptionM")).thenReturn("Modified description.");
        when(request.getParameter("imageM")).thenReturn("/path/to/image.jpg");
    }
}
