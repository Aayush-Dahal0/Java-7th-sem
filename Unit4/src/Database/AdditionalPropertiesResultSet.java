package Database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AdditionalPropertiesResultSet {
 Connection con;
 Statement st;
 ResultSet set;
	public AdditionalPropertiesResultSet() throws ClassNotFoundException, SQLException {
		con=new database().getConnetion();
		st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		set=st.executeQuery("SELECT * FROM student_tbl");
		set.first();
		set.updateString("stname", "Raj");
		set.updateRow();
		
		System.out.println("id:"+set.getInt("sid")+"and name:"+set.getString("stname"));
		ResultSet set1=st.executeQuery("SELECT stname from student_tbl");
		System.out.println("Complete data:");
		
		while(set1.next()) {
			System.out.println(set1.getString("stname"));
		}
	}
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	new AdditionalPropertiesResultSet();
}
}
