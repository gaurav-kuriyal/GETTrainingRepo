<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>

<nav class="navbar navbar-expand-lg navbar-light bg-white border">
  <div class="container-fluid">
    <a class="navbar-brand" href="/Day8AuthenticationApplication">Navbar</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="/Day8AuthenticationApplication">Home</a>
        </li>
      </ul>
      <div class="d-flex gap-3">
		<form action="signin.jsp">
			<button class="btn btn-outline-primary">Sign In</button>
		</form> 
		<form action="signup.jsp">
			<button class="btn btn-outline-info">Sign Up</button>
		</form>    	
      </div>
    </div>
  </div>
</nav>

<div class="d-flex flex-column justify-content-center align-items-center p-5 gap-3">
	<form action="signin.jsp">
		<button class="btn btn-primary">Sign In</button>
	</form>
	<form action="signup.jsp">
		<button class="btn btn-info">Sign Up</button>
	</form>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</body>
</html>
