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
	<div class="container card">
		<h3>
		<% for(int i=1;i<=15;i++)
			if(i%2==0)out.println(i+"<br>");	
		%>
		</h3>
		
		<%! String fruits[] = {"Apple","Banana","Coconut"}; %>
		<p>
		<% for(int i=0;i< fruits.length;i++)
			out.println(fruits[i]+"<br>");	
		%>
		</p>
		
		<p>	
			<%@ page import="java.util.Date" %>
			<%! Date date = new Date(); %>
			<%= date %>
		</p>
		
		<form >
			<input type="number" name="num1" />^<input type="number" name="num2" />
			<button>
				Power
			</button>
		</form>
		<p>	
			<% String num1 = request.getParameter("num1"), num2 = request.getParameter("num2"); %>
			<% if(num1!=null&num2!=null)out.println(Math.pow(Double.parseDouble(num1),Double.parseDouble(num2))); %>
		</p>
		
		<%@ include file="header.jsp" %>
	</div>
</body>
</html>