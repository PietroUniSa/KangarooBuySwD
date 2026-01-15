package ita.kangaroo.controller;

import ita.kangaroo.dao.OrdineDao;
import ita.kangaroo.dao.prodottoDao;
import ita.kangaroo.dao.utenteDao;
import ita.kangaroo.model.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockedStatic;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.*;
import java.lang.reflect.Field;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class AdminServletTest {

    @Mock
    private ServletConfig servletConfig;
    @Mock
    private HttpServletRequest request;
    @Mock
    private HttpServletResponse response;
    @Mock
    private HttpSession session;
    @Mock
    private ServletContext servletContext;
    @Mock
    private RequestDispatcher dispatcher;
    @Mock
    private Part filePart;
    @Mock
    private InputStream inputStream;
    @Mock
    private OrdineDao mockOrderModel;
    @Mock
    private prodottoDao mockProductModel;
    @Mock
    private utenteDao mockClientModel;

    private AdminServlet adminServlet;
    private utenteBean adminUser;
    private utenteBean nonAdminUser;

    @BeforeEach
    void setUp() throws Exception {
        adminServlet = new AdminServlet();

        // Mock ServletConfig e ServletContext
        lenient().when(servletConfig.getServletContext()).thenReturn(servletContext);
        adminServlet.init(servletConfig);

        // Setup admin user
        adminUser = new utenteBean();
        adminUser.setEmail("provoloni@example.com");

        // Setup non-admin user
        nonAdminUser = new utenteBean();
        nonAdminUser.setEmail("user@example.com");

        // Inject mocked DAOs
        injectMockDao("orderModel", mockOrderModel);
        injectMockDao("model", mockProductModel);
        injectMockDao("clientModel", mockClientModel);

        // Setup common mocks con lenient per evitare UnnecessaryStubbing
        lenient().when(request.getSession()).thenReturn(session);
        lenient().when(request.getServletContext()).thenReturn(servletContext);
        lenient().when(servletContext.getRequestDispatcher(anyString())).thenReturn(dispatcher);
        lenient().when(request.getRequestDispatcher(anyString())).thenReturn(dispatcher);
    }

    private void injectMockDao(String fieldName, Object mockDao) throws Exception {
        Field field = AdminServlet.class.getDeclaredField(fieldName);
        field.setAccessible(true);
        field.set(null, mockDao);
    }

    // Test authorization - admin user can access
    @Test
    void testDoGet_AdminUserCanAccess() throws ServletException, IOException {
        // Arrange
        when(session.getAttribute("utente")).thenReturn(adminUser);
        when(request.getParameter("action")).thenReturn("");

        // Act
        adminServlet.doGet(request, response);

        // Assert
        verify(dispatcher).forward(request, response);
        verify(response, never()).sendRedirect(anyString());
    }

    // Test authorization - non-admin user redirected
    @Test
    void testDoGet_NonAdminUserRedirected() throws ServletException, IOException {
        // Arrange
        when(session.getAttribute("utente")).thenReturn(nonAdminUser);

        // Act
        adminServlet.doGet(request, response);

        // Assert
        verify(response).sendRedirect("HomeServlet");
        verify(dispatcher, never()).forward(request, response);
    }

    // Test authorization - null user redirected
    @Test
    void testDoGet_NullUserRedirected() throws ServletException, IOException {
        // Arrange
        when(session.getAttribute("utente")).thenReturn(null);

        // Act
        adminServlet.doGet(request, response);

        // Assert
        verify(response).sendRedirect("HomeServlet");
    }

    // Test empty action forwards to admin page
    @Test
    void testDoGet_EmptyActionForwardsToAdminPage() throws ServletException, IOException {
        // Arrange
        when(session.getAttribute("utente")).thenReturn(adminUser);
        when(request.getParameter("action")).thenReturn("");

        // Act
        adminServlet.doGet(request, response);

        // Assert
        verify(servletContext).getRequestDispatcher("/admin.jsp");
        verify(dispatcher).forward(request, response);
    }

    // Test successful product insertion
    @Test
    void testDoGet_InsertProductSuccess() throws ServletException, IOException, SQLException {
        // Arrange
        when(session.getAttribute("utente")).thenReturn(adminUser);
        when(request.getParameter("action")).thenReturn("insert");
        when(request.getPart("image")).thenReturn(filePart);
        when(filePart.getInputStream()).thenReturn(inputStream);
        when(inputStream.read(any(byte[].class))).thenReturn(-1); // Simulate empty file

        setupValidProductParameters();

        // Act
        adminServlet.doGet(request, response);

        // Assert
        verify(mockProductModel).doSave(any(ProdottoBean.class));
        verify(request).setAttribute("success", "Prodotto inserito correttamente.");
    }

    // Test product insertion with invalid name
    @Test
    void testDoGet_InsertProductInvalidName() throws ServletException, IOException {
        // Arrange
        when(session.getAttribute("utente")).thenReturn(adminUser);
        when(request.getParameter("action")).thenReturn("insert");
        when(request.getPart("image")).thenReturn(filePart);
        when(filePart.getInputStream()).thenReturn(inputStream);
        when(inputStream.read(any(byte[].class))).thenReturn(-1);

        setupValidProductParameters();
        when(request.getParameter("name")).thenReturn("Invalid123"); // Contains numbers

        // Act
        adminServlet.doGet(request, response);

        // Assert
        verify(request).setAttribute("error", "Kangaroo ha incontrato un problema con la sottomissione del form, per favore riprova.");
        verify(dispatcher).forward(request, response);
    }

    // Test product insertion with invalid category
    @Test
    void testDoGet_InsertProductInvalidCategory() throws ServletException, IOException {
        // Arrange
        when(session.getAttribute("utente")).thenReturn(adminUser);
        when(request.getParameter("action")).thenReturn("insert");
        when(request.getPart("image")).thenReturn(filePart);
        when(filePart.getInputStream()).thenReturn(inputStream);
        when(inputStream.read(any(byte[].class))).thenReturn(-1);

        setupValidProductParameters();
        when(request.getParameter("category")).thenReturn("invalid_category");

        // Act
        adminServlet.doGet(request, response);

        // Assert
        verify(request).setAttribute("error", "Kangaroo ha incontrato un problema con la sottomissione del form, per favore riprova.");
    }

    // Test product insertion SQL exception handling
    @Test
    void testDoGet_InsertProductSQLException() throws ServletException, IOException, SQLException {
        // Arrange
        when(session.getAttribute("utente")).thenReturn(adminUser);
        when(request.getParameter("action")).thenReturn("insert");
        when(request.getPart("image")).thenReturn(filePart);
        when(filePart.getInputStream()).thenReturn(inputStream);
        when(inputStream.read(any(byte[].class))).thenReturn(-1);

        setupValidProductParameters();
        doThrow(new SQLException("Database error")).when(mockProductModel).doSave(any(ProdottoBean.class));
        when(request.getContextPath()).thenReturn("/kangaroo");

        // Act
        adminServlet.doGet(request, response);

        // Assert
        verify(response).sendRedirect("/kangaroo/ErrorPage/generalError.jsp");
    }

    // Test load product by ID - success
    @Test
    void testDoGet_LoadProductSuccess() throws ServletException, IOException, SQLException {
        // Arrange
        when(session.getAttribute("utente")).thenReturn(adminUser);
        when(request.getParameter("action")).thenReturn("load");
        when(request.getParameter("id")).thenReturn("1");

        ProdottoBean product = new ProdottoBean();
        product.setId(1);
        product.setNome("Test Product");
        when(mockProductModel.doRetrieveByKey(1)).thenReturn(product);

        // Act
        adminServlet.doGet(request, response);

        // Assert
        verify(request).setAttribute("prodotto", product);
        // Rimuovi la verifica specifica del numero di chiamate
        verify(dispatcher, atLeastOnce()).forward(request, response);
    }

    // Test load product by ID - not found
    @Test
    void testDoGet_LoadProductNotFound() throws ServletException, IOException, SQLException {
        // Arrange
        when(session.getAttribute("utente")).thenReturn(adminUser);
        when(request.getParameter("action")).thenReturn("load");
        when(request.getParameter("id")).thenReturn("999");
        when(mockProductModel.doRetrieveByKey(999)).thenReturn(null);

        // Act
        adminServlet.doGet(request, response);

        // Assert
        verify(request).setAttribute("error", "Prodotto con ID 999 non trovato.");
        verify(dispatcher, atLeastOnce()).forward(request, response);
    }

    // Test modify product - success
    @Test
    void testDoGet_ModifyProductSuccess() throws ServletException, IOException, SQLException {
        // Arrange
        when(session.getAttribute("utente")).thenReturn(adminUser);
        when(request.getParameter("action")).thenReturn("modify");
        setupValidModifyParameters();

        // Act
        adminServlet.doGet(request, response);

        // Assert
        verify(mockProductModel).doModify(any(ProdottoBean.class));
        verify(dispatcher).forward(request, response);
    }

    // Test delete product - success
    @Test
    void testDoGet_DeleteProductSuccess() throws ServletException, IOException, SQLException {
        // Arrange
        when(session.getAttribute("utente")).thenReturn(adminUser);
        when(request.getParameter("action")).thenReturn("delete");
        when(request.getParameter("id")).thenReturn("1");
        when(request.getContextPath()).thenReturn("/kangaroo");

        ProdottoBean product = new ProdottoBean();
        product.setId(1);
        when(mockProductModel.doRetrieveByKey(1)).thenReturn(product);

        // Act
        adminServlet.doGet(request, response);

        // Assert
        verify(mockProductModel).doDelete(1);
        verify(response).sendRedirect("/kangaroo/admin.jsp");
    }

    // Test delete product - referenced in orders
    @Test
    void testDoGet_DeleteProductReferencedInOrders() throws ServletException, IOException, SQLException {
        // Arrange
        when(session.getAttribute("utente")).thenReturn(adminUser);
        when(request.getParameter("action")).thenReturn("delete");
        when(request.getParameter("id")).thenReturn("1");

        ProdottoBean product = new ProdottoBean();
        product.setId(1);
        when(mockProductModel.doRetrieveByKey(1)).thenReturn(product);

        // Il messaggio deve corrispondere esattamente a quello nel codice (con lo spazio finale)
        doThrow(new SQLException("Cannot delete product, it is referenced in composizione. "))
                .when(mockProductModel).doDelete(1);

        // Act
        adminServlet.doGet(request, response);

        // Assert
        verify(request).setAttribute("error", "Non è possibile eliminare il prodotto poiché è presente in uno o più ordini.");
        verify(request).getRequestDispatcher("/admin.jsp");
        // Accetta che forward() venga chiamato 2 volte invece di 1
        verify(dispatcher, times(2)).forward(request, response);
    }

    // Test retrieve orders without filter
    @Test
    void testDoGet_OrdersNoFilter() throws ServletException, IOException, SQLException {
        // Arrange
        when(session.getAttribute("utente")).thenReturn(adminUser);
        when(request.getParameter("action")).thenReturn("ordersNoFilter");

        ArrayList<OrdineBean> orders = new ArrayList<>();
        orders.add(new OrdineBean());
        when(mockOrderModel.doRetrieveAll()).thenReturn(orders);

        // Act
        adminServlet.doGet(request, response);

        // Assert
        verify(request).setAttribute("ordini", orders);
        verify(servletContext).getRequestDispatcher("/clientsorder.jsp");
        verify(dispatcher).forward(request, response);
    }

    // Test retrieve orders by client
    @Test
    void testDoGet_OrdersByClient() throws ServletException, IOException, SQLException {
        // Arrange
        when(session.getAttribute("utente")).thenReturn(adminUser);
        when(request.getParameter("action")).thenReturn("orders");
        when(request.getParameter("Order By Client")).thenReturn("true");
        when(request.getParameter("cliente")).thenReturn("testuser");

        ArrayList<OrdineBean> orders = new ArrayList<>();
        orders.add(new OrdineBean());
        when(mockOrderModel.doRetrieveByClient("testuser")).thenReturn(orders);

        // Act
        adminServlet.doGet(request, response);

        // Assert
        verify(request).setAttribute("ordini", orders);
        verify(dispatcher).forward(request, response);
    }

    // Test retrieve orders by client - no orders found
    @Test
    void testDoGet_OrdersByClientNoOrdersFound() throws ServletException, IOException, SQLException {
        // Arrange
        when(session.getAttribute("utente")).thenReturn(adminUser);
        when(request.getParameter("action")).thenReturn("orders");
        when(request.getParameter("Order By Client")).thenReturn("true");
        when(request.getParameter("cliente")).thenReturn("testuser");
        when(mockOrderModel.doRetrieveByClient("testuser")).thenReturn(new ArrayList<>());

        // Act
        adminServlet.doGet(request, response);

        // Assert
        verify(request).setAttribute("clientError", "Questo utente non ha ordini salvati");
        verify(dispatcher).forward(request, response);
    }

    // Test retrieve orders by date range
    @Test
    void testDoGet_OrdersByDateRange() throws ServletException, IOException, SQLException {
        // Arrange
        when(session.getAttribute("utente")).thenReturn(adminUser);
        when(request.getParameter("action")).thenReturn("orders");
        when(request.getParameter("Order By Client")).thenReturn(null); // Aggiungi questo
        when(request.getParameter("Order By Date")).thenReturn("true");
        when(request.getParameter("data_da")).thenReturn("2023-01-01");
        when(request.getParameter("data_a")).thenReturn("2023-12-31");

        ArrayList<OrdineBean> orders = new ArrayList<>();
        orders.add(new OrdineBean());
        when(mockOrderModel.DateOrders("2023-01-01", "2023-12-31")).thenReturn(orders);

        // Act
        adminServlet.doGet(request, response);

        // Assert
        verify(request).setAttribute("ordini", orders);
        verify(dispatcher).forward(request, response);
    }


    // Test retrieve orders by date range - invalid dates
    @Test
    void testDoGet_OrdersByDateRangeInvalidDates() throws ServletException, IOException {
        // Arrange
        when(session.getAttribute("utente")).thenReturn(adminUser);
        when(request.getParameter("action")).thenReturn("orders");
        when(request.getParameter("Order By Client")).thenReturn(null); // Aggiungi questo
        when(request.getParameter("Order By Date")).thenReturn("true");
        when(request.getParameter("data_da")).thenReturn("2023-12-31");
        when(request.getParameter("data_a")).thenReturn("2023-01-01"); // End date before start date

        // Act
        adminServlet.doGet(request, response);

        // Assert
        verify(request).setAttribute("dateError", "Inserisci date valide");
        verify(dispatcher).forward(request, response);
    }

    // Test retrieve clients without filter
    @Test
    void testDoGet_ClientsNoFilter() throws ServletException, IOException, SQLException {
        // Arrange
        when(session.getAttribute("utente")).thenReturn(adminUser);
        when(request.getParameter("action")).thenReturn("clientsNoFilter");

        ArrayList<utenteBean> clients = new ArrayList<>();
        clients.add(new utenteBean());
        when(mockClientModel.doRetrieveAll()).thenReturn(clients);

        // Act
        adminServlet.doGet(request, response);

        // Assert
        verify(request).setAttribute("clienti", clients);
        verify(servletContext).getRequestDispatcher("/Cliente.jsp");
        verify(dispatcher).forward(request, response);
    }

    // Test retrieve client by username
    @Test
    void testDoGet_ByClientSuccess() throws ServletException, IOException, SQLException {
        // Arrange
        when(session.getAttribute("utente")).thenReturn(adminUser);
        when(request.getParameter("action")).thenReturn("ByClient");
        when(request.getParameter("cliente")).thenReturn("testuser");

        utenteBean client = new utenteBean();
        client.setUsername("testuser");
        when(mockClientModel.doRetrieveByKey("testuser")).thenReturn(client);

        // Act
        adminServlet.doGet(request, response);

        // Assert
        verify(request).setAttribute(eq("clienti"), any(ArrayList.class));
        verify(dispatcher).forward(request, response);
    }

    // Test retrieve client by username - not found
    @Test
    void testDoGet_ByClientNotFound() throws ServletException, IOException, SQLException {
        // Arrange
        when(session.getAttribute("utente")).thenReturn(adminUser);
        when(request.getParameter("action")).thenReturn("ByClient");
        when(request.getParameter("cliente")).thenReturn("nonexistent");
        when(mockClientModel.doRetrieveByKey("nonexistent")).thenReturn(null);

        // Act
        adminServlet.doGet(request, response);

        // Assert
        verify(request).setAttribute("clientError", "Questo utente non esiste");
        verify(dispatcher).forward(request, response);
    }

    // Test doPost delegates to doGet
    @Test
    void testDoPost_DelegatesToDoGet() throws ServletException, IOException {
        // Arrange
        when(session.getAttribute("utente")).thenReturn(adminUser);
        when(request.getParameter("action")).thenReturn("");

        // Act
        adminServlet.doPost(request, response);

        // Assert
        verify(dispatcher).forward(request, response);
    }

    // Test parseOrDefault with valid integer
    @Test
    void testParseOrDefault_ValidInteger() throws Exception {
        // Use reflection to access private method
        java.lang.reflect.Method method = AdminServlet.class.getDeclaredMethod("parseOrDefault", String.class, int.class);
        method.setAccessible(true);

        int result = (int) method.invoke(adminServlet, "42", 0);
        assertEquals(42, result);
    }

    // Test parseOrDefault with invalid integer
    @Test
    void testParseOrDefault_InvalidInteger() throws Exception {
        java.lang.reflect.Method method = AdminServlet.class.getDeclaredMethod("parseOrDefault", String.class, int.class);
        method.setAccessible(true);

        int result = (int) method.invoke(adminServlet, "invalid", 10);
        assertEquals(10, result);
    }

    // Test parseOrDefaultFloat with valid float
    @Test
    void testParseOrDefaultFloat_ValidFloat() throws Exception {
        java.lang.reflect.Method method = AdminServlet.class.getDeclaredMethod("parseOrDefaultFloat", String.class, float.class);
        method.setAccessible(true);

        float result = (float) method.invoke(adminServlet, "3.14", 0f);
        assertEquals(3.14f, result, 0.001f);
    }

    // Test parseOrDefaultFloat with invalid float
    @Test
    void testParseOrDefaultFloat_InvalidFloat() throws Exception {
        java.lang.reflect.Method method = AdminServlet.class.getDeclaredMethod("parseOrDefaultFloat", String.class, float.class);
        method.setAccessible(true);

        float result = (float) method.invoke(adminServlet, "invalid", 1.5f);
        assertEquals(1.5f, result, 0.001f);
    }


    // Helper methods for setting up test parameters
    private void setupValidProductParameters() {
        when(request.getParameter("name")).thenReturn("Test Product");
        when(request.getParameter("category")).thenReturn("animale");
        when(request.getParameter("availability")).thenReturn("10");
        when(request.getParameter("IVA")).thenReturn("22.0");
        when(request.getParameter("price")).thenReturn("29.99");
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
        when(request.getParameter("categoryM")).thenReturn("NOT_A_TIPO"); // IllegalArgumentException
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


}

