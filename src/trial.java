
import java.sql.*;
public class trial{
   public static void main (String[] args) throws Exception{
    try {
       
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/anka_participant",
            "root", ""); 
        Statement state= con.createStatement();
        ResultSet resultSet;
        ResultSet rs= state.executeQuery(
            "select * from login");
        while (rs.next()) {
            System.out.println("database is successfully connected");
        con.close();
        }
        
    } 
    catch (Exception ae) {
        System.out.println("database not connected");
    }
}
}

    

