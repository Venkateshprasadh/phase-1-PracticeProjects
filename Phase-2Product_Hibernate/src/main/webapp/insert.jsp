<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>


<%@ page import="com.example.*" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Insert title here</title>
</head>
<body>
<%
int prod_id=Integer.parseInt(request.getParameter("pid"));
String prod_name=request.getParameter("pname");
double prod_price=Double.parseDouble(request.getParameter("pprice"));
System.out.println("testing");
product p=new product();
p.setProd_id(prod_id);
p.setProd_name(prod_name);
p.setProd_price(prod_price);
InsertDAO dao=new InsertDAO();
int res;
res=dao.insert(p);
if(res>0) {
	out.print("insertion done");
}
%>

<form action="retrive.jsp" method="post">
<input type="submit" value="getdetails">
</form>
</body>
</html>
