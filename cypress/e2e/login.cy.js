describe("Login - pagina", () => {
    it("La pagina di login (LoginServlet) si carica correttamente", () => {
        cy.visit("/LoginServlet");

        cy.get("body").should("be.visible");

        cy.screenshot("login-page-loaded");
    });
});
describe("Login - credenziali errate", () => {
    it("Il sistema rifiuta un login non valido", () => {
        cy.visit("/LoginServlet");

        cy.get("#email").type("wrong@email.com");
        cy.get("#password").type("passwordSbagliata");

        cy.get("input.submit-btn").click();

        // verifica messaggio di errore (adatta il testo se serve)
        cy.contains("error").should("be.visible");

        cy.screenshot("login-failed");
    });
});


describe("Login - credenziali valide", () => {
    it("Login avviene correttamente", () => {
        cy.visit("/LoginServlet");

        cy.get("#email").type("renatomancio@gmail.com");
        cy.get("#password").type("3Dqwerty");

        cy.get("input.submit-btn").click();

        // verifica che NON siamo più nella login
        cy.url().should("not.include", "LoginServlet");

        // oppure verifica elemento post-login
        cy.contains("Logout").should("be.visible");

        cy.screenshot("login-success");
    });
});
