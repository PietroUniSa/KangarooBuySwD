package ita.kangaroo.controller;

import ita.kangaroo.dao.prodottoDao;
import ita.kangaroo.model.ProdottoBean;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

@WebServlet("/DettagliS")
public class DettagliS extends HttpServlet {

    // ✅ iniettabile dai test (come hai fatto con altri servlet)
    static prodottoDao model = new prodottoDao();

    private static final Logger LOGGER = Logger.getLogger(DettagliS.class.getName());

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String id = request.getParameter("id");
        int pid;

        try {
            if (id == null) {
                response.sendRedirect("GestioneCatalogo");
                return;
            }
            pid = Integer.parseInt(id);
            if (pid == 0) {
                response.sendRedirect("GestioneCatalogo");
                return;
            }
        } catch (NumberFormatException e) {
            LOGGER.log(Level.SEVERE, e.toString(), e);
            response.sendRedirect("./ErrorPage/generalError.jsp");
            return;
        }

        ProdottoBean p;
        try {
            p = model.doRetrieveByKey(pid);
        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, e.toString(), e);
            response.sendRedirect("./ErrorPage/generalError.jsp");
            return;
        }

        if (p.getQuantita() <= 0) {
            request.setAttribute("erroresoldout2", "Siamo spiacenti ma questo prodotto e' terminato");
        }

        request.setAttribute("detailed", p);

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/details.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
