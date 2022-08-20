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
<%String cpassword=request.getParameter("cpassword");%>

<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/airplane" user="root" password="Shreenidhi@392004"/> 
     
<sql:query  dataSource="${db}"  var="rs">
select aid from admin where cpassword=(?) and aid=(?);
<sql:param value="${param.cpassword}"></sql:param>
<sql:param value="${param.aid}"></sql:param>
</sql:query>


<tr><th>INVALID login</th></tr>
<c:forEach var="table" items="${rs.rows}" >
<!-- <tr><td>INVALID Login</td></tr> -->
<%response.sendRedirect("showtable.jsp"); %>

</c:forEach>




</body>
</html>