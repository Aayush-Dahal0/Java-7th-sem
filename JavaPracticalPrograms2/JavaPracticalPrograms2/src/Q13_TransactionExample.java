//13. Write a program for Transaction.
import java.sql.*;

public class Q13_TransactionExample {
    public static void main(String[] args) {
        // JDBC URL with Windows Authentication and SSL trust settings
        String url = "jdbc:sqlserver://localhost:1433;databaseName=Java_db;integratedSecurity=true;encrypt=true;trustServerCertificate=true";

        try (Connection conn = DriverManager.getConnection(url)) {
            conn.setAutoCommit(false); // Disable auto-commit for transaction

            Statement stmt = conn.createStatement();

            // Two insert operations
            stmt.executeUpdate("INSERT INTO contacts (firstname, lastname, contactnumber) VALUES ('Rishi', 'Dhamala', '1111')");
            stmt.executeUpdate("INSERT INTO contacts (firstname, lastname, contactnumber) VALUES ('Rabi', 'Lamichane', '2222')");

            conn.commit(); // Commit the transaction
            System.out.println("Transaction committed successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

