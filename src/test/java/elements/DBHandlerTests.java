package elements;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBHandlerTests {

    @Test
    public void executeQuery() throws SQLException, ClassNotFoundException {
        // set jdbc driver for MySQL
        Class.forName("com.mysql.cj.jdbc.Driver");
        // Start connecting to the DB
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/classicmodels", "root", "2569abc");
        // execute query
        Statement st = con.createStatement();
        ResultSet rs
                = st.executeQuery("SELECT*FROM customers\n" +
                "WHERE contactFirstName = \"Peter\"\n" +
                "AND city = \"Melbourne\";");
        // handle results
        while (rs.next()) {
            System.out.println(rs.getString("contactFirstName"));
//            System.out.println(rs.getString("city"));
//            System.out.println(rs.getString("customerNumber"));
        }
        // close connection
        con.close();
    }
}
