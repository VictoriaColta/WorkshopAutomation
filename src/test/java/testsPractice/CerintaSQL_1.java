package testsPractice;

import org.testng.annotations.Test;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CerintaSQL_1 {
    // Cerinta SQL_1: Afisati in consola toti clientii ce au orderdetails.quantityOrdered intre 30 si 40.
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
                = st.executeQuery("select * from classicmodels.orderdetails where quantityOrdered between 30 and 40;");
        // handle results
        List<String> arrayList = new ArrayList<>();
        while (rs.next()) {
            System.out.println("Order number is: " + rs.getString("orderNumber"));
            System.out.println("Quantity ordered is: " + rs.getString("quantityOrdered"));
            arrayList.add(rs.getString("quantityOrdered"));
        }
        System.out.println("array list " + arrayList);
        ArrayList<Integer> intList = new ArrayList<>();
        for (String str : arrayList) {
            intList.add(Integer.parseInt(str)); //to convert the string to int and add to intList
        }
        for (int number : intList) {
            assert number >= 30 && number <= 40 : "Number" + number + "is not between 30 and 40"; //this is chatGpt version, much better
//            if(number>=30 && number<=40){
//                System.out.println("All numbers are between 30 and 40 ");
//            }
//            else{
//                System.out.println("Numbers are not between 30 and 40");
//            }
            //this is my version but is not ok, to many prints ;
        }
        System.out.println("All numbers are between 30 and 40 ");

        // close connection
        con.close();
    }
}
