/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlety;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author david
 */
public class OdAdmina extends HttpServlet {

    public enum Level {

        KONTAKTY,
        OBJEDNAVKA,
        PLATBA,
        ZBOZI
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String dinosaurio = request.getParameter("dinosaur");
        String idecko = request.getParameter("idecko");
        String pocet = request.getParameter("pocet");
        try {
            response.setContentType("text/html;charset=UTF-8");
            String tabulka = request.getParameter("userm");
            Level lev = Level.valueOf(tabulka);
            switch (lev) {
                case KONTAKTY:
                    Object[][] souhrn9 = Seznam.SeznamZDatabaze.vytvorKolekci("UPDATE KONTAKTY SET " + dinosaurio + " = '" + pocet + "' WHERE UZIVATEL = '" + idecko + "'", "dnadler", "nadlerka", "org.apache.derby.jdbc.ClientDriver", "jdbc:derby://localhost:1527/ONLINEOBCHOD");
                    break;
                case PLATBA:
                    if ("DATEEXPIRATION".equals(dinosaurio) || "IDZAKAZNIKA".equals(dinosaurio)) {
                        Object[][] souhrn66 = Seznam.SeznamZDatabaze.vytvorKolekci("UPDATE PLATBA SET " + dinosaurio + " = '" + pocet + "' WHERE CISLOKARTY = " + idecko, "dnadler", "nadlerka", "org.apache.derby.jdbc.ClientDriver", "jdbc:derby://localhost:1527/ONLINEOBCHOD");
                    } else {
                        Object[][] souhrn666 = Seznam.SeznamZDatabaze.vytvorKolekci("UPDATE PLATBA SET " + dinosaurio + " = " + pocet + " WHERE CISLOKARTY = " + idecko, "dnadler", "nadlerka", "org.apache.derby.jdbc.ClientDriver", "jdbc:derby://localhost:1527/ONLINEOBCHOD");
                    }
                    break;
                case ZBOZI:
                    if ("CENA".equals(dinosaurio)) {
                        Object[][] souhrn7777 = Seznam.SeznamZDatabaze.vytvorKolekci("UPDATE ZBOZI SET " + dinosaurio + " = " + pocet + " WHERE IDDINOSAURA = '" + idecko + "'", "dnadler", "nadlerka", "org.apache.derby.jdbc.ClientDriver", "jdbc:derby://localhost:1527/ONLINEOBCHOD");
                    } else {
                        Object[][] souhrn77777 = Seznam.SeznamZDatabaze.vytvorKolekci("UPDATE ZBOZI SET " + dinosaurio + " = '" + pocet + "' WHERE IDDINOSAURA = '" + idecko + "'", "dnadler", "nadlerka", "org.apache.derby.jdbc.ClientDriver", "jdbc:derby://localhost:1527/ONLINEOBCHOD");
                    }
                    break;
            }
            Object[][] souhrn = Seznam.SeznamZDatabaze.vytvorKolekci("SELECT * FROM KONTAKTY", "dnadler", "nadlerka", "org.apache.derby.jdbc.ClientDriver", "jdbc:derby://localhost:1527/ONLINEOBCHOD");
            Object[][] souhrn1 = Seznam.SeznamZDatabaze.vytvorKolekci("SELECT * FROM OBJEDNAVKA", "dnadler", "nadlerka", "org.apache.derby.jdbc.ClientDriver", "jdbc:derby://localhost:1527/ONLINEOBCHOD");
            Object[][] souhrn2 = Seznam.SeznamZDatabaze.vytvorKolekci("SELECT * FROM PLATBA", "dnadler", "nadlerka", "org.apache.derby.jdbc.ClientDriver", "jdbc:derby://localhost:1527/ONLINEOBCHOD");
            Object[][] souhrn3 = Seznam.SeznamZDatabaze.vytvorKolekci("SELECT * FROM ZBOZI", "dnadler", "nadlerka", "org.apache.derby.jdbc.ClientDriver", "jdbc:derby://localhost:1527/ONLINEOBCHOD");
            request.setAttribute("kolekce", souhrn);
            request.setAttribute("kolekce1", souhrn1);
            request.setAttribute("kolekce2", souhrn2);
            request.setAttribute("kolekce3", souhrn3);
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("kAdminovi");
            requestDispatcher.forward(request, response);
        } catch (Exception ex) {
            try {
                Object[][] souhrn = Seznam.SeznamZDatabaze.vytvorKolekci("SELECT * FROM KONTAKTY", "dnadler", "nadlerka", "org.apache.derby.jdbc.ClientDriver", "jdbc:derby://localhost:1527/ONLINEOBCHOD");
                Object[][] souhrn1 = Seznam.SeznamZDatabaze.vytvorKolekci("SELECT * FROM OBJEDNAVKA", "dnadler", "nadlerka", "org.apache.derby.jdbc.ClientDriver", "jdbc:derby://localhost:1527/ONLINEOBCHOD");
                Object[][] souhrn2 = Seznam.SeznamZDatabaze.vytvorKolekci("SELECT * FROM PLATBA", "dnadler", "nadlerka", "org.apache.derby.jdbc.ClientDriver", "jdbc:derby://localhost:1527/ONLINEOBCHOD");
                Object[][] souhrn3 = Seznam.SeznamZDatabaze.vytvorKolekci("SELECT * FROM ZBOZI", "dnadler", "nadlerka", "org.apache.derby.jdbc.ClientDriver", "jdbc:derby://localhost:1527/ONLINEOBCHOD");
                request.setAttribute("kolekce", souhrn);
                request.setAttribute("kolekce1", souhrn1);
                request.setAttribute("kolekce2", souhrn2);
                request.setAttribute("kolekce3", souhrn3);
                RequestDispatcher requestDispatcher = request.getRequestDispatcher("kAdminovi");
                requestDispatcher.forward(request, response);
            } catch (Exception ex1) {
                RequestDispatcher requestDispatcher = request.getRequestDispatcher("");
                requestDispatcher.forward(request, response);
            }
        }

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
