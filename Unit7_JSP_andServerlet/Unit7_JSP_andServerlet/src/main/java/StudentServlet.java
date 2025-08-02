
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {
	Connection con;
	Statement st;
	ResultSet set;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html"); //we can display html or text file as a response
		PrintWriter ou =response.getWriter();//out obj is used to write content in web page
		//request object has all the form parameters supplied by Student info.html file.
		String name=request.getParameter("stname");//just like $_GET["stname"]
		String email=request.getParameter("stemail");
		String address=request.getParameter("staddress");
		//lets connect database
		try {
			con=new Database().getConnection();
			st=con.createStatement();;			
			String insert="INSERT INTO StudentNew_tbl VALUES('"+name+"','"+email+"','"+address+"')";
			st.executeUpdate(insert);
			set=st.executeQuery("SELECT * FROM StudentNew_tbl");
			ou.print("<table border=1px>");
			ou.print("<th>NAME</th>");
			ou.print("<th>EMAIL</th>");
			ou.print("<th>ADDRESS</th>");
			
			while(set.next()) {
				ou.print("<tr>");
				ou.print("<td>"+set.getString("studentname")+"</td>");
				ou.print("<td>"+set.getString("studentemail")+"</td>");
				ou.print("<td>"+set.getString("studentaddress")+"</td>");
				ou.print("</tr>");
			}
			ou.print("</table>");
		}
		catch(ClassNotFoundException | SQLException e){
			e.printStackTrace();
		}
		
		
	}

}
