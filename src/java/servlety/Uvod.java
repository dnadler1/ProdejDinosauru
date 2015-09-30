/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlety;

import java.io.IOException;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author david
 */
public class Uvod extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            if ("admin".equals(request.getParameter("user")) && "admin".equals(request.getParameter("password"))) {
                response.setContentType("text/html;charset=UTF-8");
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
            } else {
                Object[][] souhrn = Seznam.SeznamZDatabaze.vytvorKolekci("SELECT * FROM KONTAKTY", "dnadler", "nadlerka", "org.apache.derby.jdbc.ClientDriver", "jdbc:derby://localhost:1527/ONLINEOBCHOD");
                for (Object[] souhrn1 : souhrn) {
                    if (souhrn1[3].equals(request.getParameter("user")) && souhrn1[4].equals(request.getParameter("password"))) {
                        Object[][] souhrn11 = Seznam.SeznamZDatabaze.vytvorKolekci("SELECT Thecodontosaurus*2587000+Brachiosauridae*23658963+Tetanurae*2589654+Somphospondyli*25896541+Nodosauridae*2587456+Herrerasauria*25463021+Ceratosauridae*23654789+Megalosauria*5632147+Spinosauroidea*2031456+Allosauridae*20314558+Dromaeosauridae*258963214+Macronaria*23654789 AS SOUCET  FROM OBJEDNAVKA WHERE IDZAKAZNIKA='"+request.getParameter("user")+"'", "dnadler", "nadlerka", "org.apache.derby.jdbc.ClientDriver", "jdbc:derby://localhost:1527/ONLINEOBCHOD");
                        Integer cislo=Integer.valueOf((String)souhrn11[0][0]);
                        NumberFormat pFormat = NumberFormat.getInstance(Locale.ENGLISH);
                        HttpSession session=(HttpSession)request.getSession();
                        request.setAttribute("kolekce", pFormat.format(cislo));
                        session.removeAttribute(request.getParameter("user"));
                        session.setAttribute("user1", request.getParameter("user"));
                        RequestDispatcher requestDispatcher = request.getRequestDispatcher("Dokramu");
                        requestDispatcher.forward(request, response);
                    }
                }
            }
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
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(Uvod.class.getName()).log(Level.SEVERE, null, ex);
        }

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
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(Uvod.class.getName()).log(Level.SEVERE, null, ex);
        }
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
