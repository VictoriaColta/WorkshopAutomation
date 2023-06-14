package testsPractice;

import com.sun.source.tree.CompilationUnitTree;
import com.thoughtworks.qdox.model.JavaModelUtils;
import org.junit.Assert;
import org.junit.Test;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SQL1 {
//    Cerinte SQL:
//
//    Cerinta SQL_1: Afisati in consola toti clientii ce au orderdetails.quantityOrdered intre 30 si 40.

    @Test
    public void sql_1() throws SQLException, ClassNotFoundException {
        // set jdbc driver for MySQL
        Class.forName("com.mysql.cj.jdbc.Driver");
        // Start connecting to the DB
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/classicmodels", "Andreea", "Andreea1!");

        Statement st = con.createStatement();
        ResultSet rs
                = st.executeQuery("select customerName from classicmodels.customers as c " +
                "inner join classicmodels.orders as o " +
                "on  c.customerNumber=o.customerNumber" +
                "inner join classicmodels.orderdetails as od" +
                "on o.orderNumber=od.orderNumber" +
                "where od.quantityOrdered  between 30 and 40");
        // handle results
        List<String> results = new ArrayList<>();
        while (rs.next()) {
      String customerName = rs.getString("customerName");
            String quantityOrdered = rs.getString("quantityOrdered");
            results.add(rs.getString("quantityOrdered"));

        }

    }

}
