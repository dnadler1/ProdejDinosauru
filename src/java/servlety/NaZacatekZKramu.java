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
public class NaZacatekZKramu extends HttpServlet {

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
            String uzavatel=(String)request.getSession().getAttribute("user1");
            Object[][] souhrn12 = Seznam.SeznamZDatabaze.vytvorKolekci("UPDATE OBJEDNAVKA SET Thecodontosaurus=0,Brachiosauridae=0,Tetanurae=0,Somphospondyli=0,Nodosauridae=0,Herrerasauria=0,Ceratosaurida=0,Megalosauria=0,Spinosauroidea=0,Allosauridae=0,Dromaeosauridae=0,Macronaria=0 WHERE IDZAKAZNIKA='"+uzavatel+"'", "dnadler", "nadlerka", "org.apache.derby.jdbc.ClientDriver", "jdbc:derby://localhost:1527/ONLINEOBCHOD");
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("");
            requestDispatcher.forward(request, response);
        } catch (Exception ex) {
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("");
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
