package test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Дима on 26.01.2017.
 */

public class Test {
   public static void main(String[] args) {

       Connection conn = null;

       try {
           String query = "SELECT * FROM Item WHERE ID=110";
           Statement stmt = conn.createStatement();
           ResultSet rs = stmt.executeQuery(query);
           while (rs.next ()) {
               System.out.println("ID: " + rs.getInt("Id"));
               System.out.println("Description: " + rs.getString("Descrip"));
               System.out.println("Price: " + rs.getDouble("Price"));
               System.out.println("Quantity: "+ rs.getInt("Quantity"));
           }
       } catch (SQLException se) {
           System.out.println("Error");
       }

       try {
           String query = "SELECT * FROM Employee WHERE ID=110";
           Statement stmt = conn.createStatement();
           ResultSet rs = stmt.executeQuery(query); // Line1
           System.out.println("Employee ID: " + rs.getInt("ID"));  // Line2
       } catch (Exception se) {
           System.out.println("Error");
       }




       String query = "SELECT ID FROM Employee";
       try (Statement stmt = conn.createStatement()) {
           ResultSet rs = stmt.executeQuery(query);
           stmt.executeQuery ("SELECT ID FROM Customer");
           while (rs.next()) {
// process the results
               System.out.println ("Employee ID: " + rs.getInt("ID") );
           }
       } catch (Exception e) {
           System.out.println ("Error");
       }

   }
}