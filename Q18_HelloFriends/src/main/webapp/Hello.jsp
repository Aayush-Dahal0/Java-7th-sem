<%-- 18. Write a program to print “Hello Friends” twenty times using JSP. --%>
<%@ page language="java" %>
<html><body>
<%
    for (int i = 0; i < 20; i++) {
        out.println("Hello Friends<br>");
    }
%>
</body></html>
