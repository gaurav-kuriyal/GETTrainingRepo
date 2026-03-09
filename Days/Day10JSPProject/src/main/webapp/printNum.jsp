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
	<form >
		<label>Username: </label>
		<input type="text" name="uname" />
		<button>Click</button>
	</form>
	
	<c:out value="${param.uname }"></c:out>
</body>
</html>	