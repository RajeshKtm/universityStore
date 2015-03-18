<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE HTML>
<html>
<head>
<title>Add Product Form</title>
<style type="text/css">@import url(css/main.css);</style>
</head>
	<body>
		<h1>Welcome ${Admin.name} </h1>
		<form action="logout" method="get">
   			 <input type="submit" value="logout">
		</form>
		<br />
		 <a href="<spring:url value='/welcome' />"  >Add Product</a><br />
		 <a href="<spring:url value='/categories' />"  >Add Categories </a>
	</body>
	
</html>
