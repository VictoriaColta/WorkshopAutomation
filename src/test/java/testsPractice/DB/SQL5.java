package testsPractice.DB;

import org.junit.Test;

import java.sql.*;
import java.util.*;

public class SQL5 {

//    Cerinta SQL_5: Scrieti un algoritm in care sa verificati din ce tara au fost cele mai multe comenzi.
@Test
public void executeQuery() throws SQLException, ClassNotFoundException {
    // set jdbc driver for MySQL
    Class.forName("com.mysql.cj.jdbc.Driver");
    // Start connecting to the DB
    Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/classicmodels", "Andreea", "Andreea1!");
    // execute query
    Statement st = con.createStatement();
    ResultSet rs
            = st.executeQuery("SELECT country, SUM(amount) FROM classicmodels.customers as c, classicmodels.payments as p\n" +
                    "where c.customerNumber = p.customerNumber\n" +
                    "group by c.country" +
                    "order by SUM(amount) ASC;");
    // handle results
    // List<Integer> arrayList = new ArrayList<>();
    Map<String, Integer> countryOrders = new HashMap<String, Integer>();
    while (rs.next()) {
        String country = rs.getString("country");
        Integer totalOrders = rs.getInt("payments");

        countryOrders.put(country, totalOrders);

        System.out.println(countryOrders);
    }


    con.close();
}

}
