<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3 style="color:red">Error</h3>
	<%
// 		out.println("Exception occured "+exception+"<br>");
// 		out.println("Message "+exception.getMessage()+"<br>");
		
// 		out.println("Class : "+exception.getClass()+"<br>");
		
		if(exception instanceof ArithmeticException)
			out.println("Division by zero, exception occured");
		else if(exception instanceof NullPointerException)
			out.println("Null Pointer Exception occured");
		else if(exception instanceof ArrayIndexOutOfBoundsException)
			out.println("Index pointing out of array index");
		else if(exception instanceof StringIndexOutOfBoundsException)
			out.println("String index pointing out of length");
		else if(exception instanceof NumberFormatException)
			out.println("Number format exception");
	%>
</body>
</html>