package testsPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CerintaSQL_4 {
    //Cerinta SQL_4: Afisati in consola doar numele si checkNumber al clientilor cu amount peste 70000.
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
                = st.executeQuery("select c.customerName, p.checkNumber, p.amount\n" +
                "from customers c\n" +
                "join payments p on p.customerNumber=c.customerNumber\n" +
                "where p.amount >70000;");

        // handle results
        List<Double> amountList = new ArrayList<>();

        while (rs.next()) {
            System.out.println("Customer name is : " + rs.getString("customerName"));
            System.out.println("Check number is: : " + rs.getString("checkNumber"));
            amountList.add(rs.getDouble("amount"));

        }
        System.out.println("Amount list " + amountList);
        for (double amount : amountList) {
            Assert.assertTrue(amount > 70000);
        }
        // close connection
        con.close();
    }
}
