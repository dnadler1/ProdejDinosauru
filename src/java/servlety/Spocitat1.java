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
public class Spocitat1 extends HttpServlet {

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
        try {
            Integer dinosaur1 = Integer.valueOf(request.getParameter("dinosaurus1"));
            Integer dinosaur2 = Integer.valueOf(request.getParameter("dinosaurus2"));
            Integer dinosaur3 = Integer.valueOf(request.getParameter("dinosaurus3"));
            Integer dinosaur4 = Integer.valueOf(request.getParameter("dinosaurus4"));
            String uzavatel = (String) request.getSession().getAttribute("user1");
            Object[][] souhrn10 = Seznam.SeznamZDatabaze.vytvorKolekci("UPDATE OBJEDNAVKA SET Thecodontosaurus=" + dinosaur1 + ",Brachiosauridae=" + dinosaur2 + ",Tetanurae=" + dinosaur3 + ",Somphospondyli=" + dinosaur4 + " WHERE IDZAKAZNIKA='" + uzavatel + "'", "dnadler", "nadlerka", "org.apache.derby.jdbc.ClientDriver", "jdbc:derby://localhost:1527/ONLINEOBCHOD");
            Object[][] souhrn11 = Seznam.SeznamZDatabaze.vytvorKolekci("SELECT Thecodontosaurus*2587000+Brachiosauridae*23658963+Tetanurae*2589654+Somphospondyli*25896541+Nodosauridae*2587456+Herrerasauria*25463021+Ceratosauridae*23654789+Megalosauria*5632147+Spinosauroidea*2031456+Allosauridae*20314558+Dromaeosauridae*258963214+Macronaria*23654789 AS SOUCET  FROM OBJEDNAVKA WHERE IDZAKAZNIKA='" + uzavatel + "'", "dnadler", "nadlerka", "org.apache.derby.jdbc.ClientDriver", "jdbc:derby://localhost:1527/ONLINEOBCHOD");
            Integer cislo = Integer.valueOf((String) souhrn11[0][0]);
            request.setAttribute("kolekce", cislo);
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("Zaplatit");
            requestDispatcher.forward(request, response);
        } catch (Exception ex) {
            request.setAttribute("zprava", "Piš jenom čísla");
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("Dokramu");
            requestDispatcher.forward(request, response);
        } finally {

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
