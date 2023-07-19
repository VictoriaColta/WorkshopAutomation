package testsPractice.DB;

import org.junit.Assert;
import org.junit.Test;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBTest {
    Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/classicmodels", "Andreea", "Andreea1!");

    public DBTest() throws SQLException {
    }

    @Test
    public void executeQuery() throws SQLException, ClassNotFoundException {
        // set jdbc driver for MySQL
        Class.forName("com.mysql.cj.jdbc.Driver");
        // Start connecting to the DB
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/classicmodels", "Andreea", "Andreea1!");
        String query = "SELECT * FROM classicmodels.customers where contactFirstName = 'Peter';";
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
        Assert.assertEquals(results.get(0), "Peter");

        // close connec
        con.close();
    }

}
