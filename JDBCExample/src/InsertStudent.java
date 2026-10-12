import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertStudent {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/school";
        String username = "root";
        String password = "1234";

        String sql = "INSERT INTO student (id, name, city) VALUES (?, ?, ?)";

        try {
            Connection con = DriverManager.getConnection(url, username, password);

            PreparedStatement ps = con.prepareStatement(sql);

            // Student 1
            ps.setInt(1, 1);
            ps.setString(2, "Rahul");
            ps.setString(3, "Bangalore");
            ps.executeUpdate();

            // Student 2
            ps.setInt(1, 2);
            ps.setString(2, "Sneha");
            ps.setString(3, "Mysore");
            ps.executeUpdate();

            // Student 3
            ps.setInt(1, 3);
            ps.setString(2, "Aman");
            ps.setString(3, "Mumbai");
            ps.executeUpdate();

            // Student 4
            ps.setInt(1, 4);
            ps.setString(2, "Priya");
            ps.setString(3, "Chennai");
            ps.executeUpdate();

            // Student 5
            ps.setInt(1, 5);
            ps.setString(2, "Arjun");
            ps.setString(3, "Delhi");
            ps.executeUpdate();

            System.out.println("5 Student Records Inserted Successfully");

            ps.close();
            con.close();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}