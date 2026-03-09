<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% 
		int option=(int)(Math.random()*5); 
		out.println(option);
		switch(option){
		case 0:
			int a=10,b=0;
			int res = a/b;
			out.println("Result: "+res);
			break;
		case 1:
			String str = null;
			out.println(str.charAt(3));
			break;
		case 2:
			int arr[] = {1,2,3,4,5};
			for(int i =0;i<=arr.length;i++)
				out.println(arr[i]);
			break;
		case 3:
			String s = "hello";
			for(int i =0;i<=s.length();i++)
				out.println(s.charAt(i));
			break;
		case 4:
			String s2 = "abc";
			out.println(Integer.parseInt(s2));
			break;
		default:
			out.println("No exception");
		}
	%>
</body>
</html>