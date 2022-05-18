<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="com.monocept.service.*"
    import="com.monocept.model.*"
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.0/jquery.min.js"> </script>  

<script>  
function validateForm(){
	if($("#rollNo").val()==""){
		alert("Please enter roll no!");
		return false;
	}
	else if($("#fname").val()==""){
		alert("Please enter first name!");
		return false;
	}
	else if($("#lname").val()==""){
		alert("Please enter last name!");
		return false;
	}
	else if($("#cgpa").val()==""){
		alert("Please enter cgpa!");
		return false;
	}
} 
</script>  
  
<title>Insert title here</title>
</head>
<body>
	<%
		Student student = (Student)request.getAttribute("student");
		StudentService service = StudentService.getInstance();
		service.getStudents().remove(student);
	%>
	<form onsubmit="return validateForm()" id="form" action="addStudent"  method="post">
		<label for="rollNo">Roll No:</label><br>
  		<input type="text" id="rollNo" name="rollNo" value=<%out.print(student.getRollNo());%>><br>
  		
  		<label for="fname">First name:</label><br>
  		<input type="text" id="fname" name="fname" value=<%out.print(student.getFirstName());%>><br>
  		
  		<label for="lname">Last name:</label><br>
  		<input type="text" id="lname" name="lname" value=<%out.print(student.getLastName());%>><br><br>
  		
  		<label for="cgpa">CGPA:</label><br>
  		<input type="text" id="cgpa" name="cgpa" value=<%out.print(student.getCgpa());%>><br><br>
  		
  		
  		<button id="submit" type="submit" >Update</button>
	</form> 
</body>
</html>