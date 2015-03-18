<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE HTML>
<html>
<head>
<title>Book List</title>
<style type="text/css">@import url("<spring:url value="/css/main.css"/>");</style>
</head>
<body>

<div id="global">
<h1>Category List</h1>

 
 
<table>
<tr>
    <th>Category</th>
    <th>&nbsp;</th>
</tr>
<c:forEach items="${categories}" var="category">
    <tr>   
        <spring:url value="listProduct"  var="getProduct" >
   				<spring:param name="id" value="${category.id}" />
 		</spring:url>
        <td><a href="${getProduct}" id="${category.id}">${category.name}</a></td>
    </tr>
</c:forEach>
</table>
</div>
</body>
</html>
