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
<%String price=request.getParameter("price");
double a= Double.parseDouble(price);
int no_of_person=Integer.parseInt(request.getParameter("no_of_person"));
String username=request.getParameter("username");
String flight_no=request.getParameter("flight_no");
%>
<center><h2>Amount payable is<strong><%=a*no_of_person %></strong></h2></center>
<form action="success.jsp">
<center><img src="https://www.qrcode-monkey.com/img/default-preview-qr.svg"  width="500" height="600"><br>
<input type = "hidden" name = "flight_no" value ="${param.flight_no}" />
<input type = "hidden" name = "username" value ="${param.username}" />
<input type="submit" value="pay">
</form>
</body>
</html>