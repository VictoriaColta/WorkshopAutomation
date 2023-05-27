package testsPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CerintaSQL_2 {

    // Cerinta SQL_2: Afisati in consola toti clientii ce au order.amount intre 40000 si 60000.
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
                = st.executeQuery("select o.customerNumber,sum(od.priceEach) as amount\n" +
                "from orders o\n" +
                "join orderdetails od on  o.orderNumber=od.orderNumber\n" +
                "GROUP BY o.customerNumber\n" +
                "HAVING sum(od.priceEach) between 4000 and 6000;");
        //SQL statement explained:
        //Table orders have: customerNumber and orderNumber columns
        //Table order details have: orderNumber on priceEach(for each orderNumber)
        //a client (identified by customerNumber) may have multiple orders (orderNumber)
        //an order (orderNumber) may contain multiple products (priceEach)
        //I used sum to calculate the amount of items that a customerNumber have ordered

        // handle results
        List<String> arrayList = new ArrayList<>();
        while (rs.next()) {
            System.out.println("Customer number with order between 4000 and 6000 is : " + rs.getString("o.customerNumber"));
            arrayList.add(rs.getString("amount"));
        }
        System.out.println("array list " + arrayList);
        ArrayList<Double> doubleList = new ArrayList<>();
        for (String str : arrayList) {
           doubleList.add(Double.parseDouble(str)); //to convert the string to double and add to doubleList
        }
        for (double number : doubleList) {
            Assert.assertTrue(number >= 4000 && number <= 6000);
        }
        // close connection
        con.close();
    }
}
