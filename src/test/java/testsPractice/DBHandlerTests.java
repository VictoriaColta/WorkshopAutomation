package testsPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.*;

public class DBHandlerTests {

    @Test
    public void executeQuery() throws SQLException, ClassNotFoundException {
        // set jdbc driver for MySQL
        Class.forName("com.mysql.cj.jdbc.Driver");
        // Start connecting to the DB
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/classicmodels", "root", "root");
        // execute query
        Statement st = con.createStatement();
        ResultSet rs
                = st.executeQuery("SELECT * FROM classicmodels.offices;");
        // handle results
        while (rs.next()) {
            System.out.println(rs.getString("city"));
        }
        // close connection
        con.close();
    }
}
