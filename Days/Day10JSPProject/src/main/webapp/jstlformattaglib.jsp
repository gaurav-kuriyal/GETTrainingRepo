<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Date" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Formating tag library</h1>
	<% 
		Date today= new Date();
		request.setAttribute("today",today);
	%>
	<c:out value="${today }"></c:out>
	<br>
	<h1>
		<fmt:formatDate value="${today}" pattern="yyyy-MM-dd" />
		<br>
		<fmt:formatDate value="${today}" pattern="dd-MM-yy HH:mm:ss:SS a" timeZone="Asia/Kolkata" />
		<br>
		<fmt:formatDate value="${today}" pattern="dd-MM-yy HH:mm:ss:SS a" timeZone="UTC-11:00" />
		<br>
		<fmt:formatDate value="${today}" pattern="dd-MM-yy HH:mm:ss:SS a" timeZone="IST" />
		<br>
		<fmt:formatDate value="${today}" pattern="dd-MM-yy HH:mm:ss:SS a" timeZone="EST" />
		<br>
		<fmt:formatDate value="${today}" pattern="dd-MM-yy HH:mm:ss:SS a" timeZone="AKST" />
		<br>
		<fmt:formatDate value="${today}" pattern="dd-MM-yy HH:mm:ss:SS a" timeZone="JST" />
	</h1>
	
	<br>
	<h1>Currency</h1>
	<c:set var="amount" value="1234.2"></c:set>
	<fmt:formatNumber value="${amount }" type="currency" ></fmt:formatNumber>
	<fmt:setLocale value="en_IN"/>
	<br>
	<fmt:formatNumber value="${amount }" type="currency" ></fmt:formatNumber>
	<fmt:setLocale value="jpn"/>
	<br>
	<fmt:formatNumber value="${amount }" type="currency" ></fmt:formatNumber>
	<fmt:setLocale value="bho"/>
	<br>
	<fmt:formatNumber value="${amount }" type="currency" ></fmt:formatNumber>
	<fmt:setLocale value="tel"/>
	<br>
	<fmt:formatNumber value="${amount }" type="currency" ></fmt:formatNumber>
</body>
</html>