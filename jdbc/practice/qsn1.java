package practice;

/*
Wap to ask user for their name, age, sex, address and store them in database "census" under table "survey" and isplay only those person whose addrress is "itahari"

 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class qsn1 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String DB_URL = "jdbc:mysql://localhost:3306/BCA-db";

        String DB_USERNAME = "root";

        try {
            Connection conn = DriverManager.getConnection(DB_URL, DB_USERNAME, "");
            String insertQuery = "INSERT INTO users(name,age,sex,address)VALUES(?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(insertQuery);

            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter age: ");
            int age = sc.nextInt();

            System.out.print("Enter sex: ");
            String sex = sc.nextLine();

            System.out.print("Enter address: ");
            String address = sc.nextLine();

            ps.setString(1, name);
            ps.setInt(2, age);
            ps.setString(3, sex);
            ps.setString(4, address);


            int rowAffected = ps.executeUpdate();

            if (rowAffected > 0) {
                System.out.println("Data inserted successfully.");
            } else {
                System.out.println("Failed to insert data.");
            }


            String selectQuery = "SELECT * FROM users WHERE address = ?";
            PreparedStatement ps1 = conn.prepareStatement(selectQuery);

            ps1.setString(1, "itahari");
            ResultSet rs = ps1.executeQuery();

            while (rs.next()) {
                name = rs.getString("name");
                age = rs.getInt("age");
                sex = rs.getString("sex");
                address = rs.getString("address");

                System.out.println("Name: " + name);
                System.out.println("Age: " + age);
                System.out.println("Sex: " + sex);
                System.out.println("Address: " + address);

            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
