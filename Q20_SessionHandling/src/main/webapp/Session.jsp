<%--20. Write a program to implement Session Handling in servlet and JSP. --%>
<%@ page language="java" %>
<%
    session.setAttribute("username", "Samridha");
%>
<html>
  <body>
    <h2>Session Started</h2>
    User: <%= session.getAttribute("username") %>
  </body>
</html>
