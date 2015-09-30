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
public class Koncime extends HttpServlet {

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
            String castka = request.getParameter("castka");
            String cislokarty = request.getParameter("cislokarty");
            String datum = request.getParameter("datum");
            String cv2 = request.getParameter("cv2");
            String uzavatel=(String)request.getSession().getAttribute("user1");
            String [] seznam = new String[]{"Thecodontosaurus","Brachiosauridae","Tetanurae","Somphospondyli","Nodosauridae","Herrerasauria","Ceratosauridae","Megalosauria","Spinosauroidea","Allosauridae","Dromaeosauridae","Macronaria"};
            for(String dino:seznam)
            {
            Object[][] souhrn14 = Seznam.SeznamZDatabaze.vytvorKolekci("UPDATE ZBOZI SET IDZAKAZNIKA='" + uzavatel + "' WHERE JMENODINOSAURA='"+dino+"'","dnadler", "nadlerka", "org.apache.derby.jdbc.ClientDriver", "jdbc:derby://localhost:1527/ONLINEOBCHOD");
            Object[][] souhrn15 = Seznam.SeznamZDatabaze.vytvorKolekci("UPDATE ZBOZI SET SKLAD=SKLAD-(SELECT "+dino+" FROM OBJEDNAVKA WHERE IDZAKAZNIKA='" + uzavatel + "') WHERE JMENODINOSAURA= '"+dino+"'","dnadler", "nadlerka", "org.apache.derby.jdbc.ClientDriver", "jdbc:derby://localhost:1527/ONLINEOBCHOD");
            }
            Object[][] souhrn13 = Seznam.SeznamZDatabaze.vytvorKolekci("UPDATE PLATBA SET CISLOKARTY=" + cislokarty + ",CVV2=" + cv2 + ",DATEEXPIRATION='" + datum + "',CASTKA=" + castka+" WHERE IDZAKAZNIKA='" + uzavatel + "'" ,"dnadler", "nadlerka", "org.apache.derby.jdbc.ClientDriver", "jdbc:derby://localhost:1527/ONLINEOBCHOD");
            Object[][] souhrn12 = Seznam.SeznamZDatabaze.vytvorKolekci("UPDATE OBJEDNAVKA SET Thecodontosaurus=0,Brachiosauridae=0,Tetanurae=0,Somphospondyli=0,Nodosauridae=0,Herrerasauria=0,Ceratosauridae=0,Megalosauria=0,Spinosauroidea=0,Allosauridae=0,Dromaeosauridae=0,Macronaria=0 WHERE IDZAKAZNIKA='"+uzavatel+"'", "dnadler", "nadlerka", "org.apache.derby.jdbc.ClientDriver", "jdbc:derby://localhost:1527/ONLINEOBCHOD");
            response.sendRedirect("https://www.google.cz");
            
        } catch (Exception ex) {
            request.setAttribute("zprava","Piš to co máš.");
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("Zaplatit");
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
