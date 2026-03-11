<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
	<%@ include file="bootStrapStyle.jsp" %>

</head>
<body>
	<div class="container">
		<form action="LoginServlet" method="post" class="card p-5" >
		  <div class="mb-3">
		    <label for="exampleInputEmail1" class="form-label">Email address</label>
		    <input type="email" name="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
		    <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
		  </div>
		  <div class="mb-3">
		    <label for="exampleInputPassword1" class="form-label">Password</label>
		    <input type="password" name="password" class="form-control" id="exampleInputPassword1">
		  </div>
		  <button type="submit" class="btn btn-primary">Submit</button>
		</form>
	</div>
	<%@ include file="bootStrapScript.jsp" %>
</body>
</html>