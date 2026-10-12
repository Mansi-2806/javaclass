import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/school";
        String username = "root";
        String password = "1234";

        try {
            Connection con = DriverManager.getConnection(url, username, password);

            System.out.println("Database Connected Successfully");

            con.close();

        } catch (Exception e) {
            System.out.println("Database Connection Failed");
            System.out.println(e.getMessage());
        }
    }
}