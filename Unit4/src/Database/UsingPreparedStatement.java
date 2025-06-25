package Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UsingPreparedStatement {
	PreparedStatement ps;
	Connection con;
	Statement st;
	ResultSet set;

	public UsingPreparedStatement() throws ClassNotFoundException, SQLException {
		con = new database().getConnetion();
		String insertdata = "Insert INTO student_tbl VALUES(?,?)"; // values(?,?) 1 is the first and 2 is the second marker
		ps = con.prepareStatement(insertdata);
		
		ps.setInt(1, 101); // 1 indicates the 1st marker
		ps.setString(2, "Chelsea");// 2 indicates the 2nd marker
		ps.execute();
		
		ps.setInt(1, 102); // 1 indicates the 1st marker
		ps.setString(2, "LFC");// 2 indicates the 2nd marker
		ps.execute();
		
		ps.setInt(1, 103); // 1 indicates the 1st marker
		ps.setString(2, "KFC");// 2 indicates the 2nd marker
		ps.execute();
		
		st = con.createStatement();
		set=st.executeQuery("select * FROM student_tbl");
		while (set.next()) { //while set contains row data
			System.out.println(set.getInt("sid")); 
			System.out.println(set.getString("stname"));
		}
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		new UsingPreparedStatement();
	}
}
