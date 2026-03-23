<%@page import="java.util.List"%>
<%@page import="com.coforge.entities.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All Students</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<div class="container">
	<div class="card">
		<div class="card" >
			<a class="btn btn-info" href="../student/add" > Add </a>
		</div>
		<table class="table table-striped">
			<thead> 
				<tr>
					<td>Student Id</td>
					<td>Student Name</td>
					<td>Student Course</td>
					<td>Student Address</td>
					<td colspan="3" >Action</td>
				</tr>
			</thead>
			
			<tbody>
				<% for(Student s:(List<Student>)request.getAttribute("slist")){  %>
					<tr>
						<td><% out.println(s.getSid()); %></td>
						<td><% out.println(s.getSname()); %></td>
						<td><% out.println(s.getCourse()); %></td>
						<td><% out.println(s.getAddress()); %></td>
						<td><a class="btn btn-primary" href="../student/view?sid=<% out.println(s.getSid()); %>" >View</a></td>
						<td><a class="btn btn-dark" href="../student/update?sid=<% out.println(s.getSid()); %>" >Update</a></td>
						<td><a class="btn btn-danger" href="../student/delete?sid=<% out.println(s.getSid()); %>" >Delete</a></td>
					</tr>
				<% } %>
			</tbody>
		</table>
	</div>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

</body>
</html>