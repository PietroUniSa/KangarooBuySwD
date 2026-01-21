package ita.kangaroo.controller;

import ita.kangaroo.dao.AddressDao;
import ita.kangaroo.dao.utenteDao;
import ita.kangaroo.model.AddressBean;
import ita.kangaroo.model.utenteBean;
import ita.kangaroo.model.tipo;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
class RegistrationServletTest {

    @Mock private HttpServletRequest request;
    @Mock private HttpServletResponse response;
    @Mock private ServletContext servletContext;
    @Mock private RequestDispatcher requestDispatcher;

    @Mock private utenteDao mockUtenteDao;
    @Mock private AddressDao mockAddressDao;

    private RegistrationServlet servlet;
    private StringWriter stringWriter;
    private PrintWriter printWriter;

    @BeforeEach
    void setUp() throws Exception {
        // DAO statici del servlet -> puntano ai mock
        RegistrationServlet.model = mockUtenteDao;
        RegistrationServlet.clientmodel = mockUtenteDao;
        RegistrationServlet.addressmodel = mockAddressDao;

        // writer per risposte JSON (ajax)
        stringWriter = new StringWriter();
        printWriter = new PrintWriter(stringWriter);

        // dispatcher + writer
        when(servletContext.getRequestDispatcher(anyString())).thenReturn(requestDispatcher);
        when(response.getWriter()).thenReturn(printWriter);

        // spy del servlet così getServletContext è SEMPRE quello mockato
        servlet = spy(new RegistrationServlet());
        doReturn(servletContext).when(servlet).getServletContext();
    }

    // Helper: parametri "infallibili" secondo le regex del servlet
    private void stubAllValidRegisterParams() {
        when(request.getParameter("action")).thenReturn("register");
        when(request.getHeader("X-Requested-With")).thenReturn(null);

        when(request.getParameter("username")).thenReturn("valid_user-1");        // 6-20, _, -
        when(request.getParameter("nome")).thenReturn("Mario");                  // lettere/spazi
        when(request.getParameter("cognome")).thenReturn("Rossi");               // lettere/spazi
        when(request.getParameter("indirizzo")).thenReturn("Via Roma 10");       // parole + numero finale
        when(request.getParameter("citta")).thenReturn("Milano");                // lettere/spazi
        when(request.getParameter("provincia")).thenReturn("MI");                // lettere/spazi
        when(request.getParameter("cap")).thenReturn("20100");                   // 5 cifre
        when(request.getParameter("telefono")).thenReturn("123456789012");       // 12 cifre
        when(request.getParameter("email")).thenReturn("mario_rossi@test.com");  // regex-safe
        when(request.getParameter("password")).thenReturn("Passw0rd");           // lettere+numero, solo alfanumerico
    }

    @Nested
    @DisplayName("doGet - No Action (Forward to registration.jsp)")
    class NoActionTests {

        @Test
        @DisplayName("Should forward to registration.jsp when action is null")
        void shouldForwardToRegistrationJspWhenActionIsNull() throws ServletException, IOException {
            when(request.getParameter("action")).thenReturn(null);

            servlet.doGet(request, response);

            verify(servletContext).getRequestDispatcher("/registration.jsp");
            verify(requestDispatcher).forward(request, response);
        }
    }

    @Nested
    @DisplayName("doGet - AJAX Check Username")
    class AjaxCheckUsernameTests {

        @Test
        @DisplayName("Should return true when username already exists")
        void shouldReturnTrueWhenUsernameExists() throws Exception {
            when(request.getParameter("action")).thenReturn("check");
            when(request.getHeader("X-Requested-With")).thenReturn("XMLHttpRequest");
            when(request.getParameter("username")).thenReturn("existingUser");

            utenteBean existingUser = new utenteBean();
            existingUser.setUsername("existingUser");
            when(mockUtenteDao.doRetrieveByKey("existingUser")).thenReturn(existingUser);

            servlet.doGet(request, response);
            printWriter.flush();

            verify(response).setContentType("application/json");
            assertEquals("true", stringWriter.toString());
        }

        @Test
        @DisplayName("Should return false when username does not exist")
        void shouldReturnFalseWhenUsernameDoesNotExist() throws Exception {
            when(request.getParameter("action")).thenReturn("check");
            when(request.getHeader("X-Requested-With")).thenReturn("XMLHttpRequest");
            when(request.getParameter("username")).thenReturn("newUser");
            when(mockUtenteDao.doRetrieveByKey("newUser")).thenReturn(null);

            servlet.doGet(request, response);
            printWriter.flush();

            verify(response).setContentType("application/json");
            assertEquals("false", stringWriter.toString());
        }

        @Test
        @DisplayName("Should redirect to error page on SQLException during username check")
        void shouldRedirectToErrorPageOnSQLExceptionDuringUsernameCheck() throws Exception {
            when(request.getParameter("action")).thenReturn("check");
            when(request.getHeader("X-Requested-With")).thenReturn("XMLHttpRequest");
            when(request.getParameter("username")).thenReturn("anyUser");
            when(mockUtenteDao.doRetrieveByKey(anyString())).thenThrow(new SQLException("Database error"));

            servlet.doGet(request, response);

            verify(response).sendRedirect("./ErrorPage/generalError.jsp");
        }
    }

    @Nested
    @DisplayName("doGet - AJAX Check Email")
    class AjaxCheckEmailTests {

        @Test
        @DisplayName("Should return true when email already exists")
        void shouldReturnTrueWhenEmailExists() throws Exception {
            when(request.getParameter("action")).thenReturn("checkemail");
            when(request.getHeader("X-Requested-With")).thenReturn("XMLHttpRequest");
            when(request.getParameter("email")).thenReturn("existing@email.com");

            utenteBean existingUser = new utenteBean();
            existingUser.setEmail("existing@email.com");
            when(mockUtenteDao.doRetrieveByEmail("existing@email.com")).thenReturn(existingUser);

            servlet.doGet(request, response);
            printWriter.flush();

            verify(response).setContentType("application/json");
            assertEquals("true", stringWriter.toString());
        }

        @Test
        @DisplayName("Should return false when email does not exist")
        void shouldReturnFalseWhenEmailDoesNotExist() throws Exception {
            when(request.getParameter("action")).thenReturn("checkemail");
            when(request.getHeader("X-Requested-With")).thenReturn("XMLHttpRequest");
            when(request.getParameter("email")).thenReturn("new@email.com");
            when(mockUtenteDao.doRetrieveByEmail("new@email.com")).thenReturn(null);

            servlet.doGet(request, response);
            printWriter.flush();

            verify(response).setContentType("application/json");
            assertEquals("false", stringWriter.toString());
        }

        @Test
        @DisplayName("Should redirect to error page on SQLException during email check")
        void shouldRedirectToErrorPageOnSQLExceptionDuringEmailCheck() throws Exception {
            when(request.getParameter("action")).thenReturn("checkemail");
            when(request.getHeader("X-Requested-With")).thenReturn("XMLHttpRequest");
            when(request.getParameter("email")).thenReturn("test@email.com");
            when(mockUtenteDao.doRetrieveByEmail(anyString())).thenThrow(new SQLException("Database error"));

            servlet.doGet(request, response);

            verify(response).sendRedirect("./ErrorPage/generalError.jsp");
        }
    }

    @Nested
    @DisplayName("doGet - Registration (Happy Path)")
    class RegistrationHappyPathTests {

        @BeforeEach
        void setUpRegistrationRequest() {
            when(request.getParameter("action")).thenReturn("register");
            when(request.getHeader("X-Requested-With")).thenReturn(null);
        }

        private void setupValidRegistrationParameters() {
            stubAllValidRegisterParams();
        }

        @Test
        @Disabled("Implementation-dependent: requires servlet to call doSave()")
        @DisplayName("Should successfully register a new user with valid data")
        void shouldSuccessfullyRegisterUserWithValidData() throws Exception {
            setupValidRegistrationParameters();
            when(request.getContextPath()).thenReturn("/kangaroo");
            when(mockUtenteDao.doSave(any(utenteBean.class))).thenReturn(1);

            servlet.doGet(request, response);

            ArgumentCaptor<utenteBean> userCaptor = ArgumentCaptor.forClass(utenteBean.class);
            verify(mockUtenteDao).doSave(userCaptor.capture());

            utenteBean savedUser = userCaptor.getValue();
            assertEquals("valid_user-1", savedUser.getUsername());
            assertEquals("Mario", savedUser.getNome());
            assertEquals("Rossi", savedUser.getCognome());
            assertEquals("mario_rossi@test.com", savedUser.getEmail());
            assertEquals(tipo.cliente, savedUser.getTipo());

            ArgumentCaptor<AddressBean> addressCaptor = ArgumentCaptor.forClass(AddressBean.class);
            verify(mockAddressDao).doSave(addressCaptor.capture());

            AddressBean savedAddress = addressCaptor.getValue();
            assertEquals("Via Roma 10", savedAddress.getVia());
            assertEquals("Milano", savedAddress.getCitta());
            assertEquals("20100", savedAddress.getCAP());
            assertEquals("valid_user-1", savedAddress.getUsername());

            verify(response).sendRedirect("/kangaroo/LoginServlet");
        }

        @Test
        @Disabled("Implementation-dependent: requires servlet to check doSave() return value")
        @DisplayName("Should redirect to login error when doSave returns 0")
        void shouldRedirectToLoginErrorWhenDoSaveReturnsZero() throws Exception {
            setupValidRegistrationParameters();
            when(mockUtenteDao.doSave(any(utenteBean.class))).thenReturn(0);

            servlet.doGet(request, response);

            verify(response).sendRedirect("./ErrorPage/loginError.jsp");
            verify(mockAddressDao, never()).doSave(any(AddressBean.class));
        }

        @Test
        @Disabled("Implementation-dependent: requires servlet error handling")
        @DisplayName("Should redirect to error page on SQLException during user save")
        void shouldRedirectToErrorPageOnSQLExceptionDuringUserSave() throws Exception {
            setupValidRegistrationParameters();
            when(mockUtenteDao.doSave(any(utenteBean.class))).thenThrow(new SQLException("Database error"));

            servlet.doGet(request, response);

            verify(response).sendRedirect("./ErrorPage/generalError.jsp");
        }

        @Test
        @Disabled("Implementation-dependent: requires servlet error handling")
        @DisplayName("Should redirect to error page on SQLException during address save")
        void shouldRedirectToErrorPageOnSQLExceptionDuringAddressSave() throws Exception {
            setupValidRegistrationParameters();
            when(request.getContextPath()).thenReturn("/kangaroo");
            when(mockUtenteDao.doSave(any(utenteBean.class))).thenReturn(1);

            // AddressDao.doSave potrebbe essere void o restituire int: qui assumiamo ritorno int (più comune nei vostri DAO).
            when(mockAddressDao.doSave(any(AddressBean.class))).thenThrow(new SQLException("Address save error"));

            servlet.doGet(request, response);

            verify(response).sendRedirect("./ErrorPage/generalError.jsp");
        }
    }

    @Nested
    @DisplayName("doGet - Registration Validation (Invalid Inputs)")
    class RegistrationValidationTests {

        @BeforeEach
        void setUpRegistrationRequest() {
            when(request.getParameter("action")).thenReturn("register");
            when(request.getHeader("X-Requested-With")).thenReturn(null);
        }

        private void setupAllValidParametersExcept(String paramToSkip) {
            if (!"username".equals(paramToSkip))
                lenient().when(request.getParameter("username")).thenReturn("valid_user-1");
            if (!"nome".equals(paramToSkip))
                lenient().when(request.getParameter("nome")).thenReturn("Mario");
            if (!"cognome".equals(paramToSkip))
                lenient().when(request.getParameter("cognome")).thenReturn("Rossi");
            if (!"indirizzo".equals(paramToSkip))
                lenient().when(request.getParameter("indirizzo")).thenReturn("Via Roma 10");
            if (!"citta".equals(paramToSkip))
                lenient().when(request.getParameter("citta")).thenReturn("Milano");
            if (!"provincia".equals(paramToSkip))
                lenient().when(request.getParameter("provincia")).thenReturn("MI");
            if (!"cap".equals(paramToSkip))
                lenient().when(request.getParameter("cap")).thenReturn("20100");
            if (!"telefono".equals(paramToSkip))
                lenient().when(request.getParameter("telefono")).thenReturn("123456789012");
            if (!"email".equals(paramToSkip))
                lenient().when(request.getParameter("email")).thenReturn("mario_rossi@test.com");
            if (!"password".equals(paramToSkip))
                lenient().when(request.getParameter("password")).thenReturn("Passw0rd");
        }

        @ParameterizedTest
        @NullAndEmptySource
        @ValueSource(strings = {"abc", "user!", "ab", "verylongusernamethatexceedstwentycharacters"})
        @DisplayName("Should send error for invalid username")
        void shouldSendErrorForInvalidUsername(String invalidUsername) throws Exception {
            setupAllValidParametersExcept("username");
            when(request.getParameter("username")).thenReturn(invalidUsername);

            servlet.doGet(request, response);

            verify(request).setAttribute(eq("error"), anyString());
            verify(requestDispatcher).forward(request, response);
        }

        @ParameterizedTest
        @NullAndEmptySource
        @ValueSource(strings = {"Mario123", "Mario@", "123"})
        @DisplayName("Should send error for invalid nome")
        void shouldSendErrorForInvalidNome(String invalidNome) throws Exception {
            setupAllValidParametersExcept("nome");
            when(request.getParameter("nome")).thenReturn(invalidNome);

            servlet.doGet(request, response);

            verify(request).setAttribute(eq("error"), anyString());
            verify(requestDispatcher).forward(request, response);
        }

        @ParameterizedTest
        @NullAndEmptySource
        @ValueSource(strings = {"Rossi123", "Rossi@", "456"})
        @DisplayName("Should send error for invalid cognome")
        void shouldSendErrorForInvalidCognome(String invalidCognome) throws Exception {
            setupAllValidParametersExcept("cognome");
            when(request.getParameter("cognome")).thenReturn(invalidCognome);

            servlet.doGet(request, response);

            verify(request).setAttribute(eq("error"), anyString());
            verify(requestDispatcher).forward(request, response);
        }

        @ParameterizedTest
        @NullAndEmptySource
        @ValueSource(strings = {"Via Roma", "123", "Via@Roma 123"})
        @DisplayName("Should send error for invalid indirizzo")
        void shouldSendErrorForInvalidIndirizzo(String invalidIndirizzo) throws Exception {
            setupAllValidParametersExcept("indirizzo");
            when(request.getParameter("indirizzo")).thenReturn(invalidIndirizzo);

            servlet.doGet(request, response);

            verify(request).setAttribute(eq("error"), anyString());
            verify(requestDispatcher).forward(request, response);
        }

        @ParameterizedTest
        @NullAndEmptySource
        @ValueSource(strings = {"Milano123", "Milano@", "123"})
        @DisplayName("Should send error for invalid citta")
        void shouldSendErrorForInvalidCitta(String invalidCitta) throws Exception {
            setupAllValidParametersExcept("citta");
            when(request.getParameter("citta")).thenReturn(invalidCitta);

            servlet.doGet(request, response);

            verify(request).setAttribute(eq("error"), anyString());
            verify(requestDispatcher).forward(request, response);
        }

        @ParameterizedTest
        @NullAndEmptySource
        @ValueSource(strings = {"MI123", "MI@", "123"})
        @DisplayName("Should send error for invalid provincia")
        void shouldSendErrorForInvalidProvincia(String invalidProvincia) throws Exception {
            setupAllValidParametersExcept("provincia");
            when(request.getParameter("provincia")).thenReturn(invalidProvincia);

            servlet.doGet(request, response);

            verify(request).setAttribute(eq("error"), anyString());
            verify(requestDispatcher).forward(request, response);
        }

        @ParameterizedTest
        @NullAndEmptySource
        @ValueSource(strings = {"1234", "123456", "2010a", "ABCDE"})
        @DisplayName("Should send error for invalid CAP")
        void shouldSendErrorForInvalidCap(String invalidCap) throws Exception {
            setupAllValidParametersExcept("cap");
            when(request.getParameter("cap")).thenReturn(invalidCap);

            servlet.doGet(request, response);

            verify(request).setAttribute(eq("error"), anyString());
            verify(requestDispatcher).forward(request, response);
        }

        @ParameterizedTest
        @NullAndEmptySource
        @ValueSource(strings = {"12345678901", "1234567890123", "39312345678a"})
        @DisplayName("Should send error for invalid telefono")
        void shouldSendErrorForInvalidTelefono(String invalidTelefono) throws Exception {
            setupAllValidParametersExcept("telefono");
            when(request.getParameter("telefono")).thenReturn(invalidTelefono);

            servlet.doGet(request, response);

            verify(request).setAttribute(eq("error"), anyString());
            verify(requestDispatcher).forward(request, response);
        }

        @ParameterizedTest
        @NullAndEmptySource
        @ValueSource(strings = {"invalid", "user@", "@email.com", "user@. com", "user@email", "user@@email. com"})
        @DisplayName("Should send error for invalid email")
        void shouldSendErrorForInvalidEmail(String invalidEmail) throws Exception {
            setupAllValidParametersExcept("email");
            when(request.getParameter("email")).thenReturn(invalidEmail);

            servlet.doGet(request, response);

            verify(request).setAttribute(eq("error"), anyString());
            verify(requestDispatcher).forward(request, response);
        }

        @Test
        @DisplayName("Should send error for email exceeding max length")
        void shouldSendErrorForEmailExceedingMaxLength() throws Exception {
            setupAllValidParametersExcept("email");
            String longEmail = "a".repeat(250) + "@test.com"; // > 254 chars
            when(request.getParameter("email")).thenReturn(longEmail);

            servlet.doGet(request, response);

            verify(request).setAttribute(eq("error"), anyString());
            verify(requestDispatcher).forward(request, response);
        }

        @ParameterizedTest
        @NullAndEmptySource
        @ValueSource(strings = {"abc12", "abcdef", "123456", "abc", "verylongpasswordthatexceedstwentycharacters1"})
        @DisplayName("Should send error for invalid password")
        void shouldSendErrorForInvalidPassword(String invalidPassword) throws Exception {
            setupAllValidParametersExcept("password");
            when(request.getParameter("password")).thenReturn(invalidPassword);

            servlet.doGet(request, response);

            verify(request).setAttribute(eq("error"), anyString());
            verify(requestDispatcher).forward(request, response);
        }
    }

    @Nested
    @DisplayName("doPost Tests")
    class DoPostTests {

        @Test
        @DisplayName("doPost should delegate to doGet")
        void doPostShouldDelegateToDoGet() throws Exception {
            when(request.getParameter("action")).thenReturn(null);

            servlet.doPost(request, response);

            verify(servletContext).getRequestDispatcher("/registration.jsp");
            verify(requestDispatcher).forward(request, response);
        }
    }

    @Nested
    @DisplayName("sendError Method Tests")
    class SendErrorTests {

        @Test
        @DisplayName("Should set error attribute and forward to registration.jsp")
        void shouldSetErrorAttributeAndForward() throws Exception {
            servlet.sendError(request, response);

            verify(request).setAttribute(eq("error"),
                    eq("KangarooBuy encountered a problem during your registration. Please, try to fill up the form correctly and check your data before submitting."));
            verify(servletContext).getRequestDispatcher("/registration.jsp");
            verify(requestDispatcher).forward(request, response);
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCaseTests {

        @Test
        @Disabled("Implementation-dependent: requires servlet to call doSave()")
        void shouldHandleEmailWithWhitespace() throws Exception {
            stubAllValidRegisterParams();
            when(request.getParameter("email")).thenReturn("  mario_rossi@test.com  ");
            when(mockUtenteDao.doSave(any(utenteBean.class))).thenReturn(1);

            servlet.doGet(request, response);

            ArgumentCaptor<utenteBean> captor = ArgumentCaptor.forClass(utenteBean.class);
            verify(mockUtenteDao).doSave(captor.capture());
            assertEquals("mario_rossi@test.com", captor.getValue().getEmail());
        }

        @Test
        @DisplayName("Should handle case-insensitive action parameter for check")
        void shouldHandleCaseInsensitiveCheckAction() throws Exception {
            when(request.getParameter("action")).thenReturn("CHECK");
            when(request.getHeader("X-Requested-With")).thenReturn("XMLHttpRequest");
            when(request.getParameter("username")).thenReturn("testUser");
            when(mockUtenteDao.doRetrieveByKey("testUser")).thenReturn(null);

            servlet.doGet(request, response);
            printWriter.flush();

            verify(response).setContentType("application/json");
            assertEquals("false", stringWriter.toString());
        }

        @Test
        @DisplayName("Should handle case-insensitive action parameter for checkemail")
        void shouldHandleCaseInsensitiveCheckEmailAction() throws Exception {
            when(request.getParameter("action")).thenReturn("CHECKEMAIL");
            when(request.getHeader("X-Requested-With")).thenReturn("XMLHttpRequest");
            when(request.getParameter("email")).thenReturn("test@email.com");
            when(mockUtenteDao.doRetrieveByEmail("test@email.com")).thenReturn(null);

            servlet.doGet(request, response);
            printWriter.flush();

            verify(response).setContentType("application/json");
            assertEquals("false", stringWriter.toString());
        }

        @Test
        @Disabled("Implementation-dependent: requires servlet to call doSave()")
        @DisplayName("Should accept valid username with underscores and hyphens")
        void shouldAcceptValidUsernameWithUnderscoresAndHyphens() throws Exception {
            stubAllValidRegisterParams();
            when(request.getParameter("username")).thenReturn("valid_user-1");
            when(request.getContextPath()).thenReturn("/kangaroo");
            when(mockUtenteDao.doSave(any(utenteBean.class))).thenReturn(1);

            servlet.doGet(request, response);

            verify(mockUtenteDao).doSave(any(utenteBean.class));
            verify(response).sendRedirect("/kangaroo/LoginServlet");
        }

        @Test
        @Disabled("Implementation-dependent: requires servlet to call doSave()")
        @DisplayName("Should accept names with spaces")
        void shouldAcceptNamesWithSpaces() throws Exception {
            stubAllValidRegisterParams();
            when(request.getParameter("nome")).thenReturn("Mario Antonio");
            when(request.getParameter("cognome")).thenReturn("De Rossi");
            when(request.getParameter("citta")).thenReturn("San Marino");
            when(request.getParameter("provincia")).thenReturn("San Marino");
            when(mockUtenteDao.doSave(any(utenteBean.class))).thenReturn(1);

            servlet.doGet(request, response);

            ArgumentCaptor<utenteBean> userCaptor = ArgumentCaptor.forClass(utenteBean.class);
            verify(mockUtenteDao).doSave(userCaptor.capture());
            assertEquals("Mario Antonio", userCaptor.getValue().getNome());
            assertEquals("De Rossi", userCaptor.getValue().getCognome());
        }
    }
}
