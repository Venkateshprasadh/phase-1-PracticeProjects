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
<form action="bookingtable.jsp">
<input type="submit" value="View_booking_details">
</form>
<form action="flighttable.jsp">
<input type="submit" value="View_flight_details">
</form>

<%-- <%int aid=Integer.parseInt(request.getParameter("aid"));%>
<%=aid %> --%>
</body>
</html>