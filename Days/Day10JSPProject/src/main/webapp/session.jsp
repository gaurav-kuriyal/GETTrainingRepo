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
		String uname= request.getParameter("uname");
		session.setAttribute("uname",uname);
	%>
	
	<form action="success.jsp">
		<button>Click</button>
	</form>
</body>
</html>