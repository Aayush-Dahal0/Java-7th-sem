//12. Write a program to implement the additional properties of ResultSet.
import java.sql.*;

public class Q12_ResultSetProperties {
    public static void main(String[] args) {
        // Windows authentication (Integrated Security)
        String url = "jdbc:sqlserver://localhost:1433;databaseName=Java_db;integratedSecurity=true;encrypt=true;trustServerCertificate=true";

        try (Connection conn = DriverManager.getConnection(url)) {
            // Enable scrollable and read-only ResultSet
            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = stmt.executeQuery("SELECT * FROM contacts");

            // Move cursor to last row and get row number
            rs.last();
            int totalRows = rs.getRow();
            System.out.println("Total Rows: " + totalRows);

            // Reset cursor to before first and iterate
            rs.beforeFirst();
            while (rs.next()) {
                System.out.println(rs.getInt("id") + ": " + rs.getString("firstname"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
