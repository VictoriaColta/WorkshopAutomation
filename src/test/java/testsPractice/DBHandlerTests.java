package testsPractice;

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
                "jdbc:mysql://localhost:3306/classicmodels", "root", "Acce$$Denied13");
        // execute query
        Statement st = con.createStatement();
        ResultSet rs
                = st.executeQuery("SELECT * from classicmodels.customers where contactFirstName='Peter';");
        // handle results
        List<String> arrayList = new ArrayList<>();
        while (rs.next()) {
            System.out.println(rs.getString("contactLastName"));
            arrayList.add(rs.getString("contactLastName"));
        }

        // close connection
        con.close();
    }
}
