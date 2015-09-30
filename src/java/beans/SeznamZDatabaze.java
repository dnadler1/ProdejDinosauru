/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

/**
 *
 * @author david
 */
public class SeznamZDatabaze {

    private static ResultSetMetaData rsmd = null;
    private static Integer cislo = 0;

    public static Object[][] vytvorKolekci(String sql, String user, String password, String driver, String url) throws SQLException, Exception {
        ResultSet rs = VytvorimeDatabazi.vratHodnotu(sql, user, password, driver, url);
        while (rs.next()) {
            cislo++;
        }
        rs.close();
        ResultSet rs2 = VytvorimeDatabazi.vratHodnotu(sql, user, password, driver, url);
        ResultSetMetaData rsmd = rs2.getMetaData();
        Object poles[][] = new Object[cislo][rsmd.getColumnCount()];
        cislo = 0;
        while (rs2.next()) {

            for (int i = 0; i <= rsmd.getColumnCount() - 1; i++) {
                if ("VARCHAR".equals(rsmd.getColumnTypeName(i + 1))) {
                    poles[cislo][i] = (Object) rs2.getString(rsmd.getColumnName(i + 1));
                } else if ("INTEGER".equals(rsmd.getColumnTypeName(i + 1))) {
                    poles[cislo][i] = (Object) rs2.getInt(rsmd.getColumnName(i + 1));
                } else {
                    poles[cislo][i] = (Object) rs2.getString(rsmd.getColumnName(i + 1));
                }
            }
            cislo++;
        }
        rs2.close();
        return poles;

    }
}
