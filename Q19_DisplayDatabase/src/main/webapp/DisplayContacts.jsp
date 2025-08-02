<%--19. Write a program to display the database table’s complete data (at least ten row data) in a html table using jsp. --%>
<%@ page import="java.sql.*" %>
<html><body>
<table border="1">
<tr><th>ID</th><th>First Name</th><th>Last Name</th><th>Contact</th></tr>
<%
    try {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

       
        String connectionURL = "jdbc:sqlserver://localhost:1433;databaseName=Q10pracDb;integratedSecurity=true;encrypt=true;trustServerCertificate=true";
        Connection conn = DriverManager.getConnection(connectionURL);

        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM contacts");

        while (rs.next()) {
%>
<tr>
    <td><%= rs.getInt("id") %></td>
    <td><%= rs.getString("firstname") %></td>
    <td><%= rs.getString("lastname") %></td>
    <td><%= rs.getString("contactnumber") %></td>
</tr>
<%
        }
        conn.close();
    } catch (Exception e) {
        out.println("Error: " + e.getMessage());
        e.printStackTrace(new java.io.PrintWriter(out));
    }
%>
</table>
</body></html>