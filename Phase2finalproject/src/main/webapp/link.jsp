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


<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/airplane" user="root" password="Shreenidhi@392004"/> 
     
<sql:update dataSource="${db}" var="rows">
update  admin 
set npassword=(?),cpassword=npassword
where aid=(?);
<sql:param value="${param.npassword}"></sql:param>
<sql:param value="${param.aid}"></sql:param>
</sql:update>
<form action="admin.jsp">

Updated <input type="submit" value="return to Login">
</form>
</body>
</html>