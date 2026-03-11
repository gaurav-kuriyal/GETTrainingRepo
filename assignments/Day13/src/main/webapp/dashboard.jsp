<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<%@ include file="bootStrapStyle.jsp" %>
</head>
<body>
<% 
	String email = (String) session.getAttribute("email");
	if(email==null){
		response.sendRedirect("login.jsp");
		return;
	}
%>
	<h1 class="bg-info text-white px-5" >Dashboard Page <%=email %></h1>
	<a href="ProfileServlet" >Profile</a>
	<a href="HomeServlet">Home</a>
	<a href="LogoutServlet">Logout</a>

	<%@ include file="bootStrapScript.jsp" %>
</body>
</html>