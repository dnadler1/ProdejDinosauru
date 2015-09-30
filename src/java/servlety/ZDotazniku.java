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
public class ZDotazniku extends HttpServlet {
    private Integer cislo=1;
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
            String uzivatel = request.getParameter("uzivatel");
            String heslo = request.getParameter("password");
            String jmeno = request.getParameter("name");
            String prijmeni = request.getParameter("surname");
            String adresa = request.getParameter("adresa");
            if(("".equals(uzivatel))|| ("".equals(heslo)) || ("".equals(jmeno)) || ("".equals(prijmeni)) || ("".equals(adresa)))
            {
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("dotaznik");
            requestDispatcher.forward(request, response);
            return;
            }
            
            Object[][] souhrn9 = Seznam.SeznamZDatabaze.vytvorKolekci("INSERT INTO KONTAKTY (JMENO,PRIJMENI,ADRESA,UZIVATEL,PASSWORD) VALUES ('" + jmeno + "','" + prijmeni + "', '" + adresa + "','" + uzivatel + "','" + heslo + "' )", "dnadler", "nadlerka", "org.apache.derby.jdbc.ClientDriver", "jdbc:derby://localhost:1527/ONLINEOBCHOD");
            Object[][] souhrn10 = Seznam.SeznamZDatabaze.vytvorKolekci("INSERT INTO OBJEDNAVKA (IDZAKAZNIKA,Thecodontosaurus,Brachiosauridae,Tetanurae,Somphospondyli,Nodosauridae,Herrerasauria,Ceratosauridae,Megalosauria,Spinosauroidea,Allosauridae,Dromaeosauridae,Macronaria) VALUES ('" + uzivatel + "',0,0,0,0,0,0,0,0,0,0,0,0 )", "dnadler", "nadlerka", "org.apache.derby.jdbc.ClientDriver", "jdbc:derby://localhost:1527/ONLINEOBCHOD");
            Object[][] souhrn11 = Seznam.SeznamZDatabaze.vytvorKolekci("INSERT INTO PLATBA(CISLOKARTY,CVV2,DATEEXPIRATION,IDZAKAZNIKA,CASTKA) VALUES (0,0,'01.01.2000','"+uzivatel+"',0)", "dnadler", "nadlerka", "org.apache.derby.jdbc.ClientDriver", "jdbc:derby://localhost:1527/ONLINEOBCHOD");
            request.setAttribute("jmeno2", "pandelak");
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("");
            requestDispatcher.forward(request, response);
        } catch (Exception ex) {
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("dotaznik");
            requestDispatcher.forward(request, response);
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
