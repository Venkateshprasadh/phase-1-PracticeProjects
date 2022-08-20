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
<%
String name=request.getParameter("name");
String address=request.getParameter("address");
int age=Integer.parseInt(request.getParameter("age"));
int pno=Integer.parseInt(request.getParameter("pno"));
String username=request.getParameter("username");
String govproof=request.getParameter("govproof");
String gidvalue=request.getParameter("gidvalue");
String country=request.getParameter("country");
String flight_no=request.getParameter("flight_no");
int no_of_person=Integer.parseInt(request.getParameter("no_of_person"));
%>
<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/airplane" user="root" password="Shreenidhi@392004"/> 
     
<sql:update dataSource="${db}" var="rows">
insert into registerdetails values(?,?,?,?,?,?,?,?);
<sql:param value="${param.name}"></sql:param>
<sql:param value="${param.address}"></sql:param>
<sql:param value="${param.age}"></sql:param>
<sql:param value="${param.pno}"></sql:param>
<sql:param value="${param.username}"></sql:param>
<sql:param value="${param.govproof}"></sql:param>
<sql:param value="${param.gidvalue}"></sql:param>
<sql:param value="${param.country}"></sql:param>
</sql:update>
<sql:update dataSource="${db}" var="rows">
UPDATE flightdetails
SET booked_seats =booked_seats+(?), available_seats =total_seats-booked_seats
WHERE flight_no = (?);
<sql:param value="${param.no_of_person}"></sql:param>
<sql:param value="${param.flight_no}"></sql:param>

</sql:update>


<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/airplane" user="root" password="Shreenidhi@392004"/>
<sql:query  dataSource="${db}"  var="rs">
select airline_name,flight_no,depature_time,arrival_time,available_seats,price,type from flightdetails where flight_no=(?)  ;

<sql:param value="${param.flight_no}"></sql:param>

</sql:query>

<table border="1">
<tr><th>airline_name</th><th>flight_no</th><th>depature_time</th><th>arrival_time</th><th>available_seats</th><th>price</th><th>type</tr>
<c:forEach var="table" items="${rs.rows}" >
<tr><td>${table.airline_name}</td><td>${table.flight_no}</td><td>${table.depature_time}</td><td>${table.arrival_time}</td><td>${table.available_seats}</td><td>${table.price}</td><td>${table.type}</td>
<td><form action="dummy.jsp">
<input type = "hidden" name = "price" value ="${table.price}" />
<input type = "hidden" name = "no_of_person" value ="${param.no_of_person}" />
<input type = "hidden" name = "flight_no" value ="${param.flight_no}" />
<input type = "hidden" name = "username" value ="${param.username}" />
<input type="submit" value="pay">
</form>
</td>

</tr>
</c:forEach>
</table>
<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/airplane" user="root" password="Shreenidhi@392004"/> 
     


</body>
</html>