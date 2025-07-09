import java.sql.*;

public class CurdEg {
    static final String URL = "jdbc:mysqli://localhost:3306/testdb";
    static final String USER = "root";


    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection(URL, USER, "");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

