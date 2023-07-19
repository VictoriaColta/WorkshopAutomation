package testsPractice.DB;

import org.junit.Assert;
import org.junit.Test;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Sql3 {

//    Cerinta SQL_3: Afisati in consola numele produselor ce au pretul de cumparare mai mare decat 40 si sunt din gama Motorcycles.


    @Test
    public void executeQuery() throws SQLException, ClassNotFoundException {
        // set jdbc driver for MySQL
        Class.forName("com.mysql.cj.jdbc.Driver");
        // Start connecting to the DB
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/classicmodels", "Andreea", "Andreea1!");
        String query = "SELECT * FROM classicmodels.products productName where buyPrice > '40' And productLine = 'Motorcycles' ";
        // execute query
        Statement st = con.createStatement();
        ResultSet rs
                = st.executeQuery(query);
        // handle results
        List<String> results = new ArrayList<>();
        while (rs.next()) {
            System.out.println(rs.getString("productName"));
            results.add(rs.getString("productName"));
            System.out.println(rs.getString("buyPrice"));
            results.add(rs.getString("buyPrice"));
            System.out.println(rs.getString("productLine"));
            results.add(rs.getString("productLine"));
        }


        // close connec
        con.close();
    }

}
