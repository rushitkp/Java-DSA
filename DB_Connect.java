// import java.sql.Connection;
// import java.sql.DriverManager;
// import java.sql.Statement;

// public class DB_Connect {
//     public static void main(String[] args) {
//         String url = "jdbc:mysql://localhost/:3306";
//         String username = "root";
//         String password = "root";
//         try {
//             Connection con = DriverManager.getConnection(url, username, password);
//             Statement stmt = con.createStatement();
//             stmt.executeUpdate("create table emp(eno number,ename(13),esal num(10))");
//             System.out.println("Database Created Successfully");
//         } catch (Exception e) {
//             System.out.println("error:" + e);
//         }    
//     }
// }

import java.lang.Class;
import java.sql.*;

public class DB_Connect {
    public static void main(String[] args) {
        try {
            // Class.forName("com.mysql.cj.jdbc.Driver");
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rk", "root", "root");
            System.out.println("Connected to database!");
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC driver not found: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error connecting to database: " + e.getMessage());
        }
    }
}
