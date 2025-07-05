import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.*;

class Insert{
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        String db URL = "jdbc:mysqli://localhost:3306/BCA-db";

        String dbusername="root";

        try{
            Connection conn = DriverManager.getConnection(dburl,dbusername);
            String insertQuery = "INSERT INTO users(name,email,address,phone)VALUES(?,?)";
            PreparedStatement ps = conn.prepareStatement(insertQuery);

            ps.setString(1, "Gwen");
            ps.setString(2, Iamunknown@sky.com);
            ps.setString(3, "Andor,wakanda,Titan");
            ps.setString(4, "9801234567");
            int(rowAffected<0){
                throw new Exception("Insertion failed");
                return;
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}