/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author david
 */
public class VytvorimeDatabazi {

    private static Connection conn = null;
    private static Statement stmt = null;

    public static ResultSet vratHodnotu(String sql, String user, String password, String driver, String url) throws SQLException, Exception {
        //STEP 2: Register JDBC driver 
        Class.forName(driver);
        //STEP 3: Open a connection 
        System.out.println("Connecting to database...");
        conn = DriverManager.getConnection(url, user, password);
        //STEP 4: Execute a query 
        System.out.println("Creating statement...");
        stmt = conn.createStatement();
        if (sql.startsWith("S")) {
            ResultSet rs = stmt.executeQuery(sql);
            return rs;
        } else {
            stmt.executeUpdate(sql);
            return null;
        }
    }
}
