<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Login Form</h1>
	<form action="LoginServlet" method="get" target="_blank" >
		<label for="uname">Username: </label>
		<br>
		<input type="text" name="uname" />
		<br>
		<label for="pwd">Password: </label>
		<br>
		<input type="password" name="pwd" />
		<br>
		<button>Login</button>
	</form>
</body>
</html>