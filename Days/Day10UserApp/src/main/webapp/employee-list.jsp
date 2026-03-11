<%@page import="com.coforge.models.Employee"%>
<%@page import="java.util.List"%>
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
		List<Employee> employeeList=(List<Employee>) request.getAttribute("empList");
	%>
	<div class="container mt-4">
		<div class="card shadow">
			<div class="card-header bg-primary text-white">
				<h1>Employee List</h1>
				
				<a href="EmployeeServlet?action=new" class="btn btn-success" >Add Employee</a>
				<a href="home.jsp" class="btn btn-warning" >Home</a>
				<a class="btn btn-primary" href="EmployeeServlet?action=list">
			View All Employees
		</a>
				<br>
				<br>
				<form class="d-flex gap-2 flex-row" action="EmployeeServlet">
					<input type="hidden" name="action" value="search" >
					<input type="text" class="form-control" placeholder="Enter Employee Name, Email, DOJ, DOB, Mobile to search" name="search" >
					<button class="btn btn-dark" >Search</button>
				</form>
			</div>
			<div class="card-body" >
				<table class="table table-bordered table-striped align-middle" >
					<thead class="table-dark">
						<tr>
							<th>Employee Id</th>
							<th>Employee Name</th>
<!-- 							<th>Employee Salary</th> -->
							<th>Employee Email</th>
							<th>Employee Mobile</th>
<!-- 							<th>Employee DOJ</th> -->
<!-- 							<th>Employee DOB</th> -->
							<th>Actions</th>
						</tr>
					</thead>
					<tbody>
						<% 
							if(employeeList!=null && !employeeList.isEmpty() ) {
								for(Employee emp:employeeList){
						%>
							<tr>
								<td><%= emp.getEid() %> </td>
								<td><%= emp.getEname() %> </td>
<%-- 								<td><%= emp.getSalary() %> </td> --%>
								<td><%= emp.getEmail() %> </td>
								<td><%= emp.getMobile() %> </td>
<%-- 								<td><%= emp.getDoj() %> </td> --%>
<%-- 								<td><%= emp.getDob() %> </td> --%>
								<td>
									<a href="EmployeeServlet?action=edit&eid=<%=emp.getEid() %>" class="btn btn-success">Edit</a>
									<a href="EmployeeServlet?action=delete&eid=<%=emp.getEid() %>" class="btn btn-danger" onClick="return('Confirm do you want to delete?')">Delete</a>
									<a href="EmployeeServlet?action=view&eid=<%=emp.getEid() %>" class="btn btn-primary">View</a>
								</td>
							</tr>
						<% }} else { %>
								<tr>
									<td colspan="8">No Employees found</td>
								</tr>
						<% } %>
					</tbody>
				</table>
			</div>
		</div>
	</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</body>
</html>