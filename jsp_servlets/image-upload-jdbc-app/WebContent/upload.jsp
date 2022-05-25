<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="upload" method="post" enctype="multipart/form-data">
	<label><b>Id:</b></label>
	<input type="text" name="id">
	<input type="file" name="image" required="required"><br><br>
	<button type="submit">Upload</button>
	</form>
</body>
</html>