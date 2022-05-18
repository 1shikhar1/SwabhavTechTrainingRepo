<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="java.util.*"
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h2><a href="home">Home</a></h2>

	
	
	<% 
		List<String> courses = (List<String>)request.getAttribute("courses");
	
		if(courses==null)
			out.print("<h3>No data available!</h3>");
		else
		{
			out.print("<ul>");
			for(String course: courses){
				out.println("<li>"+course+"</li>");
			}
			out.print("<ul>");
		}
			
	%>
	
</body>
</html>