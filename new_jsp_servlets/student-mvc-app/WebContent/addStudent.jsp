<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.0/jquery.min.js"> </script>

<script type="text/javascript">
$(document).ready(function(){

  var rollNo = $("#rollNo");
  
  rollNo.keyup(function(){
    var rollNoValue = rollNo.val();
    $.ajax({
    	type:'POST',
    	data: {rollNo:rollNoValue},
    	url:'home',
    	success: function(result){
    		if(result==true){
    			$("#rollError").html("roll no already taken");
    			$("#tick").html("");
    		}
    		else{
    			
    			$("#rollError").html("");
    			if(rollNoValue>=100)
    				$("#tick").html("&#10004");
    			else
    				$("#tick").html("");
    		}
    	}
    });
  });

});

	function validateForm(){
		if($("#rollNo").val()==""){
			alert("Please enter roll no!");
			return false;
		}
		if($("#rollNo").val()<100){
			alert("Roll no should be atleast three digit long!");
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
  		<input type="text" id="rollNo" name="rollNo" >
  		<label for="rollNo" id="tick" style="color:green"></label><br> 
  		<p id=rollError style="color:red;"></p> 
  		
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