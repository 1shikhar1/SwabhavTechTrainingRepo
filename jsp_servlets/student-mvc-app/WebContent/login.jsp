<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<script type="text/javascript">
	function validateForm(){
		if($("#loginId").val()==""){
			alert("Please enter login id!");
			return false;
		}
		else if($("#password").val()==""){
			alert("Please enter password!");
			return false;
		}
	}
</script>

<title>Login</title>
</head>
<body>
		<form onsubmit="return validateForm()" action="login" method="post">
		<label for="loginId">Login Id:</label><br>
  		<input type="text" id="loginId" name="loginId" ><br>
  		
  		<label for="password">Password:</label><br>
  		<input type="text" id="password" name="password" ><br>
  		
  		<button type="submit" >Login</button>
	</form> 
</body>
</html>