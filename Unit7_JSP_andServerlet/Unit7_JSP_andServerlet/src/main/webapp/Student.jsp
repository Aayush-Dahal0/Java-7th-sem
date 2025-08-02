<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%@page import="java.sql.*"%>
<%@page import="Student.Database"%>

<body>

	<%
	String name = request.getParameter("stname");
	String email = request.getParameter("stemail");
	String address = request.getParameter("staddress");
	%>
	<%
	//db conn
	Connection con = new Database().getConnection();
	Statement st = con.createStatement();
	String insert = "INSERT INTO StudentNew_tbl VALUES ('" + name + "','" + email + "','" + address)"; 
	st.executeUpdate(insert);
	ResultSet set = st.executeQuery("SELECT * FROM StudentNew_tb1");
	%>
	<table border=1>
		<th>Name</th>
		<th>Email</th>
		<th>Address</th>
		<%
		while (set.next()) {
		%>
		<tr>
			<td><%=set.getString("studentname")%></td>
			<td><%=set.getString("studentemail")%></td>
			<td><%=set.getString("studentaddress")%></td>
		</tr>
		<%
		}
		%>

	</table>


</body>
</html>