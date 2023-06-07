package testsPractice;

import org.testng.Assert;
import org.testng.annotations.Test;
import utils.DataLoader;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CerintaSQL_1 {
    // Cerinta SQL_1: Afisati in consola toti clientii ce au orderdetails.quantityOrdered intre 30 si 40.
    public static String user= DataLoader.getInstance().getUser();
    public static String password=DataLoader.getInstance().getPassword();
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
                = st.executeQuery("select c.contactLastName, od.quantityOrdered\n" +
                "from customers c\n" +
                "join orders o on c.customerNumber=o.customerNumber\n" +
                "join orderdetails od on o.orderNumber=od.orderNumber\n" +
                "where od.quantityOrdered between 30 and 40;");
        // handle results
        List<String> arrayList = new ArrayList<>();
        while (rs.next()) {
            System.out.println("Contact last name is: " + rs.getString("c.contactLastName"));
            System.out.println("Quantity ordered is: " + rs.getString("od.quantityOrdered"));
            arrayList.add(rs.getString("od.quantityOrdered"));
        }
        System.out.println("array list " + arrayList);
        ArrayList<Integer> intList = new ArrayList<>();
        for (String str : arrayList) {
            intList.add(Integer.parseInt(str)); //to convert the string to int and add to intList
        }
        for (int number : intList) {
            Assert.assertTrue(number >= 30 && number <= 40);
        }
        // close connection
        con.close();
    }
}
