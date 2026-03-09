<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String uname = request.getParameter("uname");
		if(uname!=null && uname.equals("gaurav"))
			response.sendRedirect("success.jsp"+"?uname=gaurav");
		else
			response.sendRedirect("error.jsp");
	%>
</body>
</html>