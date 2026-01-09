describe("Home page", () => {
    it("La home dell'applicazione si carica", () => {
        cy.visit("/");
        cy.get("body").should("be.visible");
        cy.screenshot("home-loaded");
    });
});
