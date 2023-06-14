package testsPractice;

import org.junit.Assert;
import org.junit.Test;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Sql2 {

//    Cerinta SQL_2: Afisati in consola toti clientii ce au order.amount intre 40000 si 60000.

    @Test
    public void executeQuery() throws SQLException, ClassNotFoundException {
        // set jdbc driver for MySQL
        Class.forName("com.mysql.cj.jdbc.Driver");
        // Start connecting to the DB
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/classicmodels", "Andreea", "Andreea1!");
        String query = "SELECT customerName from classicmodels.customers as c\n" +
                "inner join classicmodels.payments as p\n" +
                "on  c.customerNumber=p.customerNumber\n" +
                "where p.amount  between 40000 and 60000";

        // execute query
        Statement st = con.createStatement();
        ResultSet rs
                = st.executeQuery(query);
        // handle results
        List<String> results = new ArrayList<>();
        while (rs.next()) {
            System.out.println(rs.getString("contactFirstName"));
            results.add(rs.getString("contactFirstName"));
        }


        // close connec
        con.close();
    }
}
