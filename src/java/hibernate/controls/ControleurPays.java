/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate.controls;

import hibernate.daos.PaysDAO;
import hibernate.entities.Pays;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author formation
 */
@WebServlet(name = "ControleurPays", urlPatterns = {"/ControleurPays"})
public class ControleurPays extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
// --- Les variables communes
        String lsAction;
        PaysDAO dao;
        List<Pays> listePays;
        String lsMessage;
        String lsURL;

// --- Code "actif"
        dao = new PaysDAO();

        try {
            lsAction = request.getParameter("action");

            // --- AFFICHAGE
            if (lsAction.equals("select")) {
                listePays = dao.getPays();
                request.setAttribute("fragment", "PaysSelectFragment.jsp");
                request.setAttribute("titre", "Gestion des pays");
                request.setAttribute("listePays", listePays);
            } /// select

            // --- AJOUT
            if (lsAction.equals("insert")) {
                request.setAttribute("fragment", "PaysInsertFragment.jsp");
            } /// insert

            // --- AJOUT VALIDER
            if (lsAction.equals("insertValider")) {
                lsMessage = dao.inserer(new Pays(request.getParameter("idPays"), request.getParameter("nomPays")));
                request.setAttribute("fragment", "PaysInsertFragment.jsp");
                request.setAttribute("message", lsMessage);
            } /// insertValider

            // --- SUPPRESSION
            if (lsAction.equals("delete")) {
                request.setAttribute("fragment", "PaysDeleteFragment.jsp");
            } /// delete

            // --- SUPPRESSION VALIDER
            if (lsAction.equals("deleteValider")) {
                lsMessage = dao.supprimer(new Pays(request.getParameter("idPays"), ""));
                request.setAttribute("fragment", "PaysDeleteFragment.jsp");
                request.setAttribute("message", lsMessage);
            } /// deleteValider

        } /// try
        catch (Exception e) {
            request.setAttribute("message", e.getMessage());
        } /// catch

        lsURL = "jsp/PaysCadre.jsp";
        request.getRequestDispatcher(lsURL).forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
