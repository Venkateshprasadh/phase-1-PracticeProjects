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
<% String date_of_travel=request.getParameter("date_of_travel");
String source_city =request.getParameter("source_city");
String destination_city=request.getParameter("destination_city");
int no_of_person=Integer.parseInt(request.getParameter("no_of_person"));
String username=request.getParameter("username");

%>
<%=date_of_travel %>
<%=source_city %>
<%=destination_city %>
<%=no_of_person %>

<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/airplane" user="root" password="Shreenidhi@392004"/>
<sql:query  dataSource="${db}"  var="rs">
select airline_name,flight_no,depature_time,arrival_time,available_seats,price,type from flightdetails where source_city=(?) and destination_city=(?) and date_of_travel=(?)  ;
<sql:param value="${param.source_city}"></sql:param>
<sql:param value="${param.destination_city}"></sql:param>
<sql:param value="${param.date_of_travel}"></sql:param>
</sql:query>

<table border="1">
<tr><th>airline_name</th><th>flight_no</th><th>depature_time</th><th>arrival_time</th><th>available_seats</th><th>price</th><th>type</tr>
<c:forEach var="table" items="${rs.rows}" >
<tr><td>${table.airline_name}</td><td>${table.flight_no}</td><td>${table.depature_time}</td><td>${table.arrival_time}</td><td>${table.available_seats}</td><td>${table.price}</td><td>${table.type}</td><td><form action="register.jsp">
<input type = "hidden" name = "flight_no" value = "${table.flight_no}" />
<input type = "hidden" name = "username" value ="${param.username}" />
<input type = "hidden" name = "no_of_person" value ="${param.no_of_person}" />
<input type="submit" value="register"></form></td></tr>
</c:forEach>
</table>

</body>
</html>