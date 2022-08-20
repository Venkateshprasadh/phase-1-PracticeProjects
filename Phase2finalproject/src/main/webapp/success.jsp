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

</body>
</html><%
String flightno=request.getParameter("flight_no");
String username=request.getParameter("username");
%>

<center><img src=https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQuElBpM1Z4kqdcegU3VYCZrImLL3Ye2AOCEw&usqp=CAU width="400" height="400">
<center>
<center>
<center><h2>payment successful..!!!</h2>
<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/airplane" user="root" password="Shreenidhi@392004"/>
     
<sql:update dataSource="${db}" var="rows">
 insert into booking(username,flight_no)select username ,flight_no from login,flightdetails where username=(?) and flight_no=(?);
<sql:param value="${param.username}"></sql:param>
<sql:param value="${param.flight_no}"></sql:param>
</sql:update>