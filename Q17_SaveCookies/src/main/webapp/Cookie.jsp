<%-- 17. Write a program to save cookies using Servlet and JSP. --%>

<%@ page language="java" %>
<%
    String name = "user";
    String value = "Samridha";
    javax.servlet.http.Cookie cookie = new javax.servlet.http.Cookie(name, value);
    response.addCookie(cookie);
%>
<html><body>
<h2>Cookie Saved</h2>
</body></html>
