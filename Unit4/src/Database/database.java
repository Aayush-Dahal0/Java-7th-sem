package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class database {
    Connection con;

    public database() throws ClassNotFoundException, SQLException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

        String database = "Java_db";
        String server = "localhost\\SQLEXPRESS";
        int port = 1433;

        String cs = "jdbc:sqlserver://" + server + ":" + port +
                    ";databaseName=" + database +
                    ";integratedSecurity=true;encrypt=true;trustServerCertificate=true";

        con = DriverManager.getConnection(cs);

        // Check if the connection is valid within 5 seconds
        if (con != null && con.isValid(5)) {
            JOptionPane.showMessageDialog(null, "Connected to the Database Successfully!");
        } else {
            JOptionPane.showMessageDialog(null, "Failed to Connect to the Database.");
        }
    }
Connection getConnetion() {
	return con;
}
    public static void main(String[] args) {
        try {
            new database();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Connection Error: " + e.getMessage());
        }
    }
}
