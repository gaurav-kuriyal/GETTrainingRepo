<%@page import="com.coforge.entities.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View Student</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<div class="container">
	<div class="card">
		<table class="table table-striped">
		<% Student student = (Student) request.getAttribute("student"); %>
			<tbody>
					<tr>
						<td>Student Id</td>
						<td><% out.println(student.getSid()); %></td>
					</tr>
					<tr>
						<td>Student Name</td>
						<td><% out.println(student.getSname()); %></td>
					</tr>
					<tr>
						<td>Course</td>
						<td><% out.println(student.getCourse()); %></td>
					</tr>
					<tr>
						<td>Address</td>
						<td><% out.println(student.getAddress()); %></td>
					</tr>
					<tr>
						<td><a href="../student/list">List</a></td>
					</tr>
			</tbody>
		</table>
	</div>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</body>
</html>