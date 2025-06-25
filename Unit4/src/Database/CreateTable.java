package Database;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
Connection con;
Statement st; //sql commands or queries
	public CreateTable() throws ClassNotFoundException, SQLException {
		con=new database().getConnetion(); //connection to database
		st=con.createStatement(); // we can write sql queries over connection
		String create="CREATE TABLE student_tbl(sid int,stname varchar(20));"; //sql query
		st.executeUpdate(create); // executes the sql server
		System.out.println("Table created");
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		new CreateTable();
	}

}
