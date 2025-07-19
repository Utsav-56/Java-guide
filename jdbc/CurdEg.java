import java.sql.*;

public class CurdEg {



    public static void main(String[] args) {
         String URL = "jdbc:mysqli://localhost:3306/testdb";
         String USER = "root";
        try {
            Connection conn = DriverManager.getConnection(URL, USER, "");

            String insertQuery = "INSERT INTO users(name,email,address)VALUES(?,?,?)";
            PreparedStatement pstmt = conn.prepareStatement(insertQuery);


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

//import java.sql.*;

class JdbcCrudExample2 {
    static final String URL = "jdbc:mysql://localhost:3306/testdb";
    static final String USER = "root";
    static final String PASSWORD = "yourpassword";

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {

            // CREATE
            String insertSQL = "INSERT INTO users (name, email) VALUES (?, ?)";
            try (PreparedStatement pstmt = conn.prepareStatement(insertSQL)) {
                pstmt.setString(1, "Alice");
                pstmt.setString(2, "alice@example.com");
                pstmt.executeUpdate();
            }

            // READ
            String selectSQL = "SELECT * FROM users";
            try (PreparedStatement pstmt = conn.prepareStatement(selectSQL)) {
                ResultSet rs = pstmt.executeQuery();
                while (rs.next()) {
                    System.out.println(rs.getInt("id") + " | " + rs.getString("name") + " | " + rs.getString("email"));
                }
            }

            // UPDATE
            String updateSQL = "UPDATE users SET email = ? WHERE name = ?";
            try (PreparedStatement pstmt = conn.prepareStatement(updateSQL)) {
                pstmt.setString(1, "alice@newdomain.com");
                pstmt.setString(2, "Alice");
                pstmt.executeUpdate();
            }

            // DELETE
            String deleteSQL = "DELETE FROM users WHERE name = ?";
            try (PreparedStatement pstmt = conn.prepareStatement(deleteSQL)) {
                pstmt.setString(1, "Alice");
                pstmt.executeUpdate();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
