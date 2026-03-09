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
	<h2>JSTL demo</h2>
	<c:out value="Hello Gaurav"></c:out>
	
	<c:set var="myname" value='Gaurav' ></c:set>
	<h1>
		<c:out value="${myname}"></c:out>
	</h1>
	<c:set var="num1" value="123" ></c:set>
	<c:set var="num2" value="105" ></c:set>
	<c:set var="res" value="${num1+num2}" ></c:set>
	<h1>
		Sum: ${res}
	</h1>
	<c:set var="str" value="${res%2==0? 'Even Number':'Odd Number'}" ></c:set>
	${str}
	<br>
	<c:if test="${res>189 }">Greater than 819</c:if>
	<c:if test="${res<189 }">Less than 819</c:if>
	<br>
	<c:choose>
		<c:when test="${res>189 }">Hei</c:when>
		<c:otherwise >Hello</c:otherwise>
	</c:choose>
	
	<br>
	<c:out value="Before remove: ${res }"></c:out>
	<c:remove var="res"/>
	<c:out value="After remove: ${res }"></c:out>
	
</body>
</html>