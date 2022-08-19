<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="userid" class="com.example.Product"></jsp:useBean>
<jsp:setProperty property="*" name="userid"/>
properties of user are
<jsp:getProperty property="product_name" name="userid"/><br>
<jsp:getProperty property="prod_id" name="userid"/><br>
<jsp:getProperty property="prod_price" name="userid"/><br>

</body>
</html>