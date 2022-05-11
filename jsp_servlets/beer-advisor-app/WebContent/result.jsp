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
	<h1 align="center">Beer Recommendations Jsp</h1>
	<p>
	<%
		List<String> styles = (List)request.getAttribute("styles");
		Iterator itr = styles.iterator();
		
		while(itr.hasNext()){
			out.print("<br>try: "+itr.next());
		}
	%>
</body>
</html>