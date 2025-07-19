import java.sql.*;
import java.util.Scanner;

public class JdbcCrudExample {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String URL = "jdbc:mysql://localhost:3306/testdb";
        String USER = "root";

        try {
            Connection conn = DriverManager.getConnection(URL, USER, "");

            String insertSQL = "INSERT INTO users (name, email) VALUES (?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(insertSQL);


            for (int i = 0; i < 99; i++) {


                System.out.print("Enter name: ");
                String name = sc.nextLine();

                System.out.print("Enter email: ");
                String email = sc.nextLine();

                pstmt.setString(1, name);
                pstmt.setString(2, email);

                int rowsAffected = pstmt.executeUpdate();

                if (rowsAffected > 0) {
                    System.out.println("Data inserted successfully.");
                } else {
                    System.out.println("Failed to insert data.");
                }

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

class ReadExample {
    public static void main(String[] args) {
        String URL = "jdbc:mysql://localhost:3306/testdb";
        String USER = "root";

        try {
            Connection conn = DriverManager.getConnection(URL, USER, "");

            String selectSQL = "SELECT * FROM users";
            PreparedStatement pstmt = conn.prepareStatement(selectSQL);

            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                String name = rs.getString("name");
                String email = rs.getString("email");

                System.out.printf("Name: %s, Email: %s , \n", name, email);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


class ReadEspecificExample {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String URL = "jdbc:mysql://localhost:3306/testdb";
        String USER = "root";

        try {
            Connection conn = DriverManager.getConnection(URL, USER, "");

            String selectSQL = "SELECT * FROM users where departmnet=?";
            PreparedStatement pstmt = conn.prepareStatement(selectSQL);



            pstmt.setString(1, "mgmt");



            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                String name = rs.getString("name");
               String email = rs.getString("email");

                System.out.printf("Name: %s, Email: %s , \n", name, email);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


class UpdateExample {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String URL = "jdbc:mysql://localhost:3306/testdb";
        String USER = "root";

        try {
            Connection conn = DriverManager.getConnection(URL, USER, "");

            String updateSQL = "UPDATE users SET name = ? WHERE email = ?";
            PreparedStatement pstmt = conn.prepareStatement(updateSQL);

            System.out.print("Enter email where you want to update: ");
            String email = sc.nextLine();

            System.out.print("Enter new name: ");
            String name = sc.nextLine();

            pstmt.setString(1, name);
            pstmt.setString(2, email);

            int rowsAffected = pstmt.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Data updated successfully.");
            } else {
                System.out.println("Failed to update data.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


class DeleteExample {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String URL = "jdbc:mysql://localhost:3306/testdb";
        String USER = "root";

        try {
            Connection conn = DriverManager.getConnection(URL, USER, "");

            String deleteSQL = "DELETE FROM users WHERE email = ?";
            PreparedStatement pstmt = conn.prepareStatement(deleteSQL);

            System.out.print("Enter email: ");
            String email = sc.nextLine();

            pstmt.setString(1, email);

            int rowsAffected = pstmt.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Data deleted successfully.");
            } else {
                System.out.println("Failed to delete data.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
