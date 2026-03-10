<html>
<body>
<h2><%= "Hello World!" %></h2>
</body>

<a href="CustomerServlet?action=select">Get Customers</a>
<br>
<a href="CustomerServlet?action=insert">Add Customer</a>
<br>
<!-- <a href="CustomerServlet?action=get&custId=1">Get Customer</a> -->
<form action="CustomerServlet">
	<input name="action" value="get" type="hidden" >
	<label>Get Customer</label>
	<input name="custId" type="number" >
	<button>Get</button>
</form>

</html>
