//11. Write a program to update and delete the row data in database table using PreparedStatement.
import java.sql.*;

public class Q11_UpdateDeleteDatabase {
    public static void main(String[] args) {
        // Use your SQL Server instance name and database
        String url = "jdbc:sqlserver://localhost:1433;databaseName=Java_db;integratedSecurity=true;encrypt=true;trustServerCertificate=true";

        try (Connection conn = DriverManager.getConnection(url)) {
            String updateSQL = "UPDATE contacts SET firstname=? WHERE id=?";
            PreparedStatement updateStmt = conn.prepareStatement(updateSQL);
            updateStmt.setString(1, "Rambabu");
            updateStmt.setInt(2, 1);
            updateStmt.executeUpdate();

            String deleteSQL = "DELETE FROM contacts WHERE id=?";
            PreparedStatement deleteStmt = conn.prepareStatement(deleteSQL);
            deleteStmt.setInt(1, 2);
            deleteStmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
