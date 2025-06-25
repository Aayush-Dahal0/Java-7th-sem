package Database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteRowData {
	Connection con;
	Statement st;
	ResultSet set;

	public DeleteRowData() throws ClassNotFoundException, SQLException {
		con = new database().getConnetion();
		st = con.createStatement();
		

		String delete="DELETE FROM student_tbl where sid=2";
		st.execute(delete);
		
		set = st.executeQuery("SELECT * FROM student_tbl");
		while (set.next()) { //while set contains row data
			System.out.println(set.getInt("sid")); 
			System.out.println(set.getString("stname"));
		}
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		new DeleteRowData();
	}
}
