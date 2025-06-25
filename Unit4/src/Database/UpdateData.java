package Database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateData {
	Connection con;
	Statement st;
	ResultSet set;

	public UpdateData() throws ClassNotFoundException, SQLException {
		con = new database().getConnetion();
		st = con.createStatement();
		String update = "UPDATE student_tbl SET stname='Ram' where stname='Aayush'";
		st.execute(update);
		set = st.executeQuery("SELECT * FROM student_tbl");
		while (set.next()) {
			System.out.println(set.getInt("sid"));
			System.out.println(set.getString("stname"));
		}
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		new UpdateData();
	}
}
