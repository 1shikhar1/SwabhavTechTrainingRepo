<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="com.monocept.service.*"
    import="java.io.OutputStream"
    %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1><a href="home">Home</a></h1>
	<br>
	<%
	String res = (String)request.getAttribute("id");
	int id = Integer.valueOf(res);
	byte[] image = new ImageService().getImage(id);
	
	OutputStream os = response.getOutputStream();
	os.write(image);
	os.flush();
	os.close();
	%>
		
</body>
</html>