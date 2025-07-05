import java.sql.*;
public class CurdEg{
    static final String URL = "jdbc:mysqli://localhost:3306/testdb";
    static final String USER = "root";

}
public static void main(String[] args){
    try {
        connection conn = DriverManager.getConnection(URL,USER,"");
        String insertQuery = "INSERT INTO users(name,email()VALUES(?,?))";
        
        PreparedStatement pstmt = conn.PreparedStatement(insertQuery);
        pstmt.setString(1, "Gwen");
        pstmt.setString(2, gwen@gmail.com);
        pstmt.executeUpdate();

        pstmt=conn.PreparedStatement("SELECT *FROM USER");
        ResultSet rs=pstmt.executeQuery();
        while(rs.next()){
            System.out.printf("Name:%s, Email:%s", rs.getString("name"),rs.getString("email"));
        }

        pstmt = conn.PreparedStatement("Update users set name=? where email = ? ");
        pstmt.setString(1, "Gwen");
        pstmt.setString(2, "gwen@gmail.com");
        pstmt.executeUpdate();

        pstmt=conn PreparedStatement("Delete from users where email=?");
        pstmt.setString(1, gwen@gmail.com);
        pstmt.executeUpdate();


    } catch (SQLException e) {
        e.printStackTrace();
    }
}
