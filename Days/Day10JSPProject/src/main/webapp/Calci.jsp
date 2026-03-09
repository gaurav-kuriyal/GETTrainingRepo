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
		<label>Number 1: </label>
		<input type="number" name="num1" />
		<label>Number 2: </label>
		<input type="number" name="num2" />
		<button name="op" value="+" >+</button>
		<button name="op" value="-" >-</button>
		<button name="op" value="*" >*</button>
		<button name="op" value="/" >/</button>
	</form>
	
	<c:choose>
		<c:when test="${param.op=='*' }">
			<c:out value="${param.num1*param.num2 }"></c:out>
		</c:when>
		<c:when test="${param.op=='/' }">
			<c:out value="${param.num1/param.num2 }"></c:out>
		</c:when>
		<c:when test="${param.op=='+' }">
			<c:out value="${param.num1+param.num2 }"></c:out>
		</c:when>
		<c:when test="${param.op=='-' }">
			<c:out value="${param.num1-param.num2 }"></c:out>
		</c:when>
	</c:choose>
</body>
</html>