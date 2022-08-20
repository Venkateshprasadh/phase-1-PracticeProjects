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
<sql:query  dataSource="${db}"  var="rs">
select * from booking;
</sql:query>
<table border="1">
<tr><th>Username</th><th> Booking_Id</th><th>Flight_No</th></tr>
<c:forEach var="table" items="${rs.rows}" >
<tr><td>${table.username}</td><td>${table.bookingid}</td><td>${table.flight_no}</td></tr>
</c:forEach>
</table>
</body>
</html>