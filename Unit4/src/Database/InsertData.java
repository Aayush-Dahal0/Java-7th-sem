package Database;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {
Connection con;
Statement st;
	public InsertData() throws ClassNotFoundException, SQLException {
		con=new database().getConnetion();
		st=con.createStatement();
		String insert="INSERT INTO student_tbl VALUES(3,'Laxman')";
		st.executeUpdate(insert);
		System.out.println("Data inserted successfully");
		
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	new InsertData();
}
}
