<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
          <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="validate.jsp">
Admin Id: <input type="number" name="aid"><br>
Password : <input type="password" name="cpassword"> 
<a href="changepassword.jsp">change password</a><br>
<input type="submit" value="Login">
</form>
</body>
</html>