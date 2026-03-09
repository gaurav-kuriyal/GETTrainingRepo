<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Printing numbers from 1 to 10</h1>
	<c:forEach var="i" begin="1" end="10" step="1" >
		<c:out value="${i }"></c:out>
	</c:forEach>
</body>
</html>