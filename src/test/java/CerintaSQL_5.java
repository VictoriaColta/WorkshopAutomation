import org.testng.annotations.Test;

import java.sql.*;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static java.lang.System.out;

public class CerintaSQL_5 {
    // Cerinta SQL_5: Scrieti un algoritm in care sa verificati din ce tara au fost cele mai multe comenzi.
    @Test
    public void executeQuery() throws SQLException, ClassNotFoundException {
        // set jdbc driver for MySQL
        Class.forName("com.mysql.cj.jdbc.Driver");
        // Start connecting to the DB
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/classicmodels", "root", "Acce$$Denied13");
        // execute query
        Statement st = con.createStatement();
        ResultSet rs
                = st.executeQuery("select COUNT(o.orderNumber) as totalOrders, c.country from orders o\n" +
                "join customers c\n" +
                "on o.customerNumber=c.customerNumber\n" +
                "group by country ;");
        // handle results
        // List<Integer> arrayList = new ArrayList<>();
        Map<String, Integer> countryOrders = new HashMap<String, Integer>();
        while (rs.next()) {
            String country = rs.getString("c.country");
            Integer totalOrders = rs.getInt("totalOrders");
            out.println("Country is: " + country);
            out.println("Number of orders is : " + totalOrders);
            countryOrders.put(country, totalOrders);
        }
        out.println("map is : " + countryOrders);
        String countryMaxOrder = null;
        for (Map.Entry<String, Integer> entry : countryOrders.entrySet()) {
            countryMaxOrder = Collections.max(countryOrders.entrySet(), Map.Entry.comparingByValue()).getKey();
        }
        out.println("The country with the most orders is: " + countryMaxOrder);
        //     out.println("array list " + arrayList);
//        ArrayList<Integer> intList = new ArrayList<>();
//        int max_order = 0;
//        for (int total : arrayList) {
//            max_order = Collections.max(arrayList);
//        }
//        System.out.println("max order is: " + max_order);
        // close connection


        con.close();
    }
}
