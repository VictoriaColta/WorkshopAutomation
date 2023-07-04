package testsPractice;

import org.testng.Assert;
import org.testng.annotations.Test;
import utils.DataLoader;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CerintaSQL_2 {

    // Cerinta SQL_2: Afisati in consola toti clientii ce au order.amount intre 40000 si 60000.
    String user = DataLoader.getInstance().getUser();
    String password = DataLoader.getInstance().getPassword();
    @Test
    public void executeQuery() throws SQLException, ClassNotFoundException {
        // set jdbc driver for MySQL
        Class.forName("com.mysql.cj.jdbc.Driver");
        // Start connecting to the DB
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/classicmodels", user, password);
        // execute query
        Statement st = con.createStatement();
        ResultSet rs
                = st.executeQuery("select customerNumber, amount from payments where amount between 40000 and 60000;");
        // handle results
        List<Double> amountList = new ArrayList<>();
        while (rs.next()) {
            System.out.println("Customer number with order between 40000 and 60000 is : " + rs.getString("customerNumber"));
            amountList.add(rs.getDouble("amount"));
        }
        System.out.println("amount list is :  " + amountList);
        for (double amount : amountList) {
            Assert.assertTrue(amount >= 40000 && amount <= 60000);
        }
        // close connection
        con.close();
    }
}
