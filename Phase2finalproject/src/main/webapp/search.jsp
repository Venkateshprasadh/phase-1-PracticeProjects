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
<%String username=request.getParameter("username");
%>
<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/airplane" user="root" password="Shreenidhi@392004"/>

<sql:update dataSource="${db}" var="rows">
insert into login values(?,?);
<sql:param value="${param.username}"></sql:param>
<sql:param value="${param.password}"></sql:param>
</sql:update>




<form action="flightdetails.jsp">
Date of travel: <input type="date" name="date_of_travel"><br>
Source City : <input type="text" name="source_city"><br>
Destination City: <input type="text" name="destination_city"><br>
Number Of persons: <input type="number" name="no_of_person">
<input type = "hidden" name = "username" value ="${param.username}" />
<input type="submit" value="Show">


</form>

</body>
</html>