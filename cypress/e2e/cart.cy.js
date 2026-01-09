describe("Carrello - aggiunta prodotto", () => {
    it("Aggiunta di un prodotto al carrello tramite catalogo", () => {

        // 1️⃣ Vai alla pagina catalogo
        cy.visit("/Catalogo.jsp"); // ⬅️ conferma che sia questo il nome

        // 2️⃣ Attendi il caricamento AJAX dei prodotti
        cy.get(".product", { timeout: 10000 }).should("exist");

        // 3️⃣ Clicca su Add to Cart del primo prodotto
        cy.get(".addToCart").first().click();

        // 4️⃣ Verifica redirect alla servlet GestioneCart
        cy.url().should("include", "GestioneCart");
        cy.url().should("include", "action=add");

        // 5️⃣ Verifica che il carrello contenga almeno un prodotto
        // (scegline UNA, in base a cosa mostra la pagina)
        cy.contains("€").should("be.visible");
        // oppure
        // cy.contains("Carrello").should("be.visible");

        // 6️⃣ Evidenza per la relazione
        cy.screenshot("add-product-to-cart-success");
    });
});
