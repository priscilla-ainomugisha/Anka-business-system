import java.sql.*;
public class Dbconnection{
   public static void main (String[] args){
    try(
        Connection conn = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/anka_participant",
            "root", ""); 
        Statement stmt= conn.createStatement();
        ){

        String strSelect ="select password,date_of_birth from login";
        System.out.println("The SQL statement is:" + strSelect + "\n");

        ResultSet rset= stmt.executeQuery(strSelect);

        System.out.println("The records selected are:");
        int rowCount = 0;

        while (rset.next()) {
            String password= rset.getString("password");
            Date date_of_birth = rset.getDate("date_of_birth");

            System.out.println(password +","+ date_of_birth);
            ++rowCount;
        }
        System.out.println("Total number of records = "+ rowCount);    
    } 
    catch (SQLException ex) {
        ex.printStackTrace();
    }
}
}
    