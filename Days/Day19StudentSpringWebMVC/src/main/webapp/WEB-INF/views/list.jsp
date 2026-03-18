<%@page import="java.util.List"%>
<%@page import="com.coforge.entities.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% for(Student s:(List<Student>)request.getAttribute("slist")){ 
	out.println(s);
} %>
</body>
</html>