<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.0/jquery.min.js"> </script>

<script type="text/javascript">
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
	<form onsubmit="return validateForm()" action="addStudent" method="post">
		<label for="rollNo">Roll No:</label><br>
  		<input type="text" id="rollNo" name="rollNo" ><br>
  		
  		<label for="fname">First name:</label><br>
  		<input type="text" id="fname" name="fname" ><br>
  		
  		<label for="lname">Last name:</label><br>
  		<input type="text" id="lname" name="lname" ><br><br>
  		
  		<label for="cgpa">CGPA:</label><br>
  		<input type="text" id="cgpa" name="cgpa" ><br><br>
  		
  		
  		<button type="submit" >Submit</button>
	</form> 
</body>
</html>