<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%String fname=request.getParameter("fname");
	String lname=request.getParameter("lname");
	String email= request.getParameter("email");
	%>
	
	<%="First Name: "+fname+" Last Name: "+lname+" Email ID: "+email%>
	
</body>
</html>