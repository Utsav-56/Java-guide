import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.*;

class Insert {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String DB_URL = "jdbc:mysqli://localhost:3306/BCA-db";

        String DB_USERNAME = "root";

        try {
            Connection conn = DriverManager.getConnection(DB_URL, DB_USERNAME, "");
            String insertQuery = "INSERT INTO users(name,email,address,phone)VALUES(?,?)";
            PreparedStatement ps = conn.prepareStatement(insertQuery);

            ps.setString(1, "Gwen");
            ps.setString(2, "Iamunknown @sky.com");
            ps.setString(3, "Andor,wakanda,Titan");
            ps.setString(4, "9801234567");

            int rowAffected = ps.executeUpdate();

            if (rowAffected < 0) {
                throw new Exception("Insertion failed");
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}