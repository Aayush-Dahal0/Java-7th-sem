import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    Connection con;

    public Database() throws ClassNotFoundException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

        String database = "AJ2078_db";
        String server = "DESKTOP-96VI4QQ";
        int port = 1433;
        String cs = "jdbc:sqlserver://" + server + ":" + port +
                ";databaseName=" + database +
                ";integratedSecurity=true;" +
                "encrypt=true;trustServerCertificate=true";

        try {
            con = DriverManager.getConnection(cs);
            System.out.println("Connection successful");
        } catch (SQLException ex) {
            System.err.println("Connection failed");
            ex.printStackTrace();
        }
    }
    public Connection getConnection() {
        return con;
    }

    public static void main(String[] args) throws ClassNotFoundException {
        new Database();
    }
}
