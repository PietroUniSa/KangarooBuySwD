const { defineConfig } = require("cypress");

module.exports = defineConfig({
    e2e: {
        baseUrl: "http://localhost:8080/Kangaroo_war_exploded",
        video: false,
        screenshotOnRunFailure: true,
        defaultCommandTimeout: 8000,

        setupNodeEvents(on, config) {
            // niente per ora
        },
    },
});
