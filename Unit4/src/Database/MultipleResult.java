package Database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MultipleResult {
	ResultSet set;
	Connection con;
	Statement st;

	public MultipleResult() throws ClassNotFoundException, SQLException {
		int rscount = 0;
		con = new database().getConnetion();
		st = con.createStatement();
		String sql = "SELECT * FROM student_tbl where stname='Rajesh'"
				+ "SELECT * FROM student_tbl where stname='CFC' ";
		boolean results = st.execute(sql);
		do {
			if (results) {
				set = st.getResultSet(); // for multiple data set
				rscount++;
				System.out.println("ResultSet#" + rscount);
				while (set.next()) {
					int id = set.getInt("sid");
					String name = set.getString("stname");
					System.out.println("The id is: " + id + " And name is: " + name);
				}
				set.close();
				results = st.getMoreResults();
			}

		} while (results);
		st.close();
		con.close();
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		new MultipleResult();
	}

}
