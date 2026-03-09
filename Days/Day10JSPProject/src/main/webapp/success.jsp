<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3 style="color:green" class="bg-primary">Welcome <%
		String uname = (String) session.getAttribute("uname");
		if(uname != null){
			out.println("my session attribute value is "+ uname);
			out.println("session id "+session.getId());
			out.println("session creation time "+new java.util.Date(session.getCreationTime()));
		}else{
			out.println("No session found");
		}
	%> !</h3>
</body>
</html>