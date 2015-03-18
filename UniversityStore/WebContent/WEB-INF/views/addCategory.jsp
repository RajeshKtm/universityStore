<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title>Products</title>
</head>
<body>
	
<!-- 	<section class="container"> -->
<%-- 		<form:form  modelAttribute="newCategory" class="form-horizontal" enctype="multipart/form-data" action="add" method="POST" > --%>
<!-- 			<fieldset> -->
<!-- 				<legend>Add new Category</legend> -->

<%-- 				<form:errors path="*" cssClass="alert alert-danger" element="div"/> --%>
<!-- 				<div class="form-group"> -->
<!-- 					<label class="control-label col-lg-2 col-lg-2" for="categoryId">categoryId:</label> -->
<!-- 					<div class="col-lg-10"> -->
<%-- 						<form:input id="categoryId" path="id" type="text" class="form:input-large"/> --%>
<%-- 						<form:errors path="id" cssClass="text-danger"/> --%>
<!-- 					</div> -->
<!-- 				</div> -->

<!-- 				<div class="form-group"> -->
<!-- 					<label class="control-label col-lg-2" for="name">Category Name:</label> -->
<!-- 					<div class="col-lg-10"> -->
<%-- 						<form:input id="name" path="name" type="text" class="form:input-large"/> --%>
<%-- 						<form:errors path="name" cssClass="text-danger"/> --%>
<!-- 					</div> -->
<!-- 				</div>	 -->
<!-- 				<div class="form-group"> -->
<!-- 					<div class="col-lg-offset-2 col-lg-10"> -->
<!-- 						<input type="submit" id="btnAdd" class="btn btn-primary" value ="Add"/> -->
<!-- 					</div> -->
<!-- 				</div>			 -->
<!-- 			</fieldset> -->
<%-- 		</form:form> --%>
<!-- 	</section> -->

<form:form modelAttribute="newCategory"  action= "add" method="post">
    <fieldset>
        <legend>Add a Category</legend>
         
        <p>
            <label for="id">Category Id:</label>
            <form:input id="id" path="id"/>
        </p>
        <p>
            <label for="name">Category Name:</label>
            <form:input id="name" path="name"/>
        </p>        
        <p id="buttons">
             <input id="submit" type="submit" value="Add Category">
        </p>
    </fieldset>
</form:form>
</body>
</html>
