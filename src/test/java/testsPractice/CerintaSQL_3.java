package testsPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CerintaSQL_3 {
    // Cerinta SQL_3: Afisati in consola numele produselor ce au pretul de cumparare mai mare decat 40 si sunt din gama Motorcycles.
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
                = st.executeQuery("select productName, buyPrice, productLine from products where buyPrice>40 and productLine=\"Motorcycles\";");

        // handle results
        List<Double> priceList = new ArrayList<>();
        List<String> productLineList = new ArrayList<>();
        while (rs.next()) {
            System.out.println("Product name: " + rs.getString("productName"));
            priceList.add(rs.getDouble("buyPrice"));
            productLineList.add(rs.getString("productLine"));
        }
        System.out.println("Price list " + priceList);
        System.out.println("Product line list " + productLineList);

        for (double price : priceList) {
            Assert.assertTrue(price>40);
        }
        for (String productLine : productLineList) {
            Assert.assertEquals(productLine,"Motorcycles");
        }
        // close connection
        con.close();
    }
}
