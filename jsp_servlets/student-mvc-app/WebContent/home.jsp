<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="java.util.*"
    import="com.monocept.model.*"
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
<title>Insert title here</title>
</head>
<body>

<%
	String name = (String) session. getAttribute( "name" );
	String email = (String) session. getAttribute( "email" );
	
	if(name==null){
		out.println("<h2>Guest User!</h2><p>");
	}
	else{
		out.println("<h2 id=\"user\">"+name+"("+email+")"+"</h2><p>");
	}

	List<Student> students = (List)request.getAttribute("students");
	out.println("<h3>Number of students: "+students.size()+"</h3><p>");
	out.println("<a href=\"addStudent\">Add Student</a>");
%>
	<table class="table table-striped">
		<tr>
			<th>Roll No</th>
    		<th>FirstName</th>
    		<th>LastName</th>
    		<th>CGPA</th>
    		<th>Edit</th>
		</tr>
		
		<%
			for(Student std: students){
				out.println("<tr><td>"+std.getRollNo()+"</td> <td>"+std.getFirstName()+"</td> <td>"+std.getLastName()+"</td> <td>"+std.getCgpa()+"</td> <td><a href=\"editStudent?id="+std.getRollNo()+"\">edit</td> </tr>");
			}
		%>
		
	</table>
</body>
</html>