//10. Write a program to save the information Firstname, Lastname and ContactNumber in a database.
import java.sql.*;

public class Q10_SaveToDatabase {
    public static void main(String[] args) {
        // Windows Authentication connection URL
        String url = "jdbc:sqlserver://localhost:1433;databaseName=Java_db;integratedSecurity=true;encrypt=true;trustServerCertificate=true";

        try (Connection conn = DriverManager.getConnection(url)) {
            System.out.println("Connected to SQL Server using Windows Authentication.");

            // Create table if not exists
            String createTableSQL = """
                IF NOT EXISTS (SELECT * FROM sysobjects WHERE name='contacts' AND xtype='U')
                CREATE TABLE contacts (
                    id INT IDENTITY(1,1) PRIMARY KEY,
                    firstname VARCHAR(50),
                    lastname VARCHAR(50),
                    contactnumber VARCHAR(15)
                )
            """;
            Statement createStmt = conn.createStatement();
            createStmt.executeUpdate(createTableSQL);
            System.out.println("Table created successfully.");

            // Insert data
            String insertSQL = "INSERT INTO contacts (firstname, lastname, contactnumber) VALUES (?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(insertSQL);
            stmt.setString(1, "Aayush");
            stmt.setString(2, "Dahal");
            stmt.setString(3, "980000678");

            int rowsInserted = stmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Data inserted successfully.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
