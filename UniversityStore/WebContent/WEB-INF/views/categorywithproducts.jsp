<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<div>
	<div style="border: 1px solid; border-radius: 25px; width: 50%; float: left">
		<p>Category List:</p>
		<form:form modelAttribute="categoryItem" action="" method="get">

			<c:forEach items="${categories}" var="category">
				<label for="name">Category Name: </label>
				<%-- 				<form:label path=""> Category Name : </form:label> --%>
				<%-- 				<c:out value="${category.name}" /> <br /> --%>

				<a href="<spring:url value='/category/${category.id}'/>">${category.name}</a>
				<br />
			</c:forEach>


		</form:form>
	</div>

	<div
		style="border: 1px solid; border-radius: 25px; width: 50%; float: right">
		<p>Product List:</p>
		<form:form modelAttribute="product" action="" method="get">
			<a href="<spring:url value="/welcome"/>">Spring MVC</a>

			<%-- 			<c:foreach items="${categories}" var="category"> --%>
			<%-- 			<c:out value="${category}" /> <br/> --%>
			<%-- 				<a href="<spring:url value="/"+ ${category}+"/>"${category}</a><br /> --%>
			<%-- 			</c:foreach> --%>

		</form:form>
	</div>
</div>