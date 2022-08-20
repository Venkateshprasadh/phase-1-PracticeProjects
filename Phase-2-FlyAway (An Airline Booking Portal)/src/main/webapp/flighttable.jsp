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
select * from flightdetails;
</sql:query>
<table border="1">
<tr><th>airline_name</th><th>price</th><th>flight_no</th><th>source_city</th><th>destination_city</th><th>depature_time</th><th>arrival_time</th><th>total_seats</th><th>booked_seats</th><th>available_seats</th><th>date_of_travel</th><th>type</th></tr>
<c:forEach var="table" items="${rs.rows}" >
<tr><td>${table.airline_name}</td><td>${table.price}</td><td>${table.flight_no}</td><td>${table.source_city}</td><td>${table.destination_city}</td><td>${table.depature_time}</td><td>${table.arrival_time}</td><td>${table.total_seats}</td><td>${table.booked_seats}</td><td>${table.available_seats}</td><td>${table.date_of_travel}</td><td>${table.type}</td></tr>
</c:forEach>
</table>
</body>
</html>