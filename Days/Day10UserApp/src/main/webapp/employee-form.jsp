<%@page import="com.coforge.models.Employee"%>
<%@page import="java.time.LocalDate"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

</head>
<body>
	<%
		Employee emp = (Employee) request.getAttribute("employee");
// 		emp = new Employee(1,"Gaurav",5000,"gaurav@mail.com","636767333",new LocalDate("21-01-2026"),new LocalDate("01-01-2003"));
		boolean editMode= emp!=null;
		boolean editable = request.getAttribute("editable")==null?true: request.getAttribute("editable")=="true"?true:false;
	%>
	<div class="container mt-4">
		<div class="card shadow">
			<div class="card-header bg-dark text-white ">
				<h3><%= editable?editMode?"Edit Employee":"Add Employee":"Employee Details" %></h3>
			</div>
			<div class="card-body">
				<form action="EmployeeServlet" method="post">
					<input type="hidden" name="eid" value='<%=editMode?emp.getEid():""%>' >
					<div class="mb-3">
						<label class="form-label" >Employee Name:</label>
						<input type="text" class="form-control" <%= editable?"":"readOnly" %> name="ename" value='<%=editMode?emp.getEname():""%>' />
					</div>
					<div class="mb-3">
						<label class="form-label" >Employee Salary:</label>
						<input type="text" class="form-control" <%= editable?"":"readOnly" %> name="salary" value='<%=editMode?emp.getSalary():""%>' />
					</div>
					<div class="mb-3">
						<label class="form-label" >Employee Email:</label>
						<input type="email" class="form-control" <%= editable?"":"readOnly" %> name="email" value='<%=editMode?emp.getEmail():""%>' />
					</div>
					<div class="mb-3">
						<label class="form-label" >Employee Mobile Number:</label>
						<input type="tel" class="form-control" <%= editable?"":"readOnly" %> name="mobile" value='<%=editMode?emp.getMobile():""%>' />
					</div>
					<div class="mb-3">
						<label class="form-label" >Employee DOJ:</label>
						<input type="text" class="form-control" <%= editable?"":"readOnly" %> name="doj" value='<%=editMode?emp.getDoj():""%>' />
					</div>
					<div class="mb-3">
						<label class="form-label" >Employee DOB:</label>
						<input type="text" class="form-control" <%= editable?"":"readOnly" %> name="dob" value='<%=editMode?emp.getDob():""%>' />
					</div>
					
					<% if(editable){ %>
					<button type="submit" class="btn btn-success" >
						<%= editMode?"Edit Employee":"Save Employee" %>
					</button>
					<% } %>
					<br>
					<br>
					<a href="EmployeeServlet?action=list" class="btn btn-dark text-white" >Back</a>
				</form>
			</div>
		</div> 
	</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</body>
</html>