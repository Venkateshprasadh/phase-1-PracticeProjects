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
<% String username=request.getParameter("username");
String flight_no=request.getParameter("flight_no");
int no_of_person=Integer.parseInt(request.getParameter("no_of_person"));
%>

<form action="review.jsp">
  Fullname: <input type="text" name ="name"><br>
  Address: <input type="text" name ="address"><br>
  age: <input type="number" name ="age"><br>
  Phone no: <input type="number" name ="pno"><br>
  Goverment proof:<select name="govproof" >
  <option value="Aadhar number">Aadhar number</option>
  <option value="Voter ID">Voter ID</option>
  <option value="Driving Licence">Driving Licence</option>
  <option value="Pan Card">Pan Card</option>
</select>
  Government value :<input type="text" name ="gidvalue"><br>
  Country :<input type="text" name ="country"><br>
  
  

<input type = "hidden" name = "username" value ="${param.username}" />
<input type = "hidden" name = "flight_no" value ="${param.flight_no}" />
<input type = "hidden" name = "no_of_person" value ="${param.no_of_person}" />
<button>Submit</button>
</form>


</body>
</html>