<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import="java.util.*" %>
    
   <%@ page import="com.example.*" %>

    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
InsertDAO dao=new InsertDAO();
List<product> e=dao.get();
%>
<table  border="1">
<tr><th>id</th><th>name</th><th>price</th></tr>
<%for(product ee:e){ %>
<<tr><td><%=ee.getProd_id()%></td><td><%=ee.getProd_name()%></td><td><%=ee.getProd_price()%></td></tr>
<%} %>
</table>

</body>
</html>