<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<div class="container">

	<c:if test="${not empty error}">
		<div class="alert alert-danger">
			<spring:message
				code="AbstractUserDetailsAuthenticationProvider.badCredentials" />
			<br />
		</div>
	</c:if>
	<form
		action="<spring:url value="/j_spring_security_check"></spring:url>"
		method="post">

		<label>Username: </label>
		<div class="col-lg-10">
			<input class="form:input-large" placeholder="User Name"
				name='j_username' type="text">
		</div>

		<label>Password: </label>
		<div class="col-lg-10">
			<input class=" form:input-large" placeholder="Password"
				name='j_password' type="password" value="">
		</div>
		<label>&nbsp;</label>
		<div class="col-lg-10">
			<input class="btn btn-lg btn-success btn-mini" type="submit"
				value="Login">
		</div>

	</form>


</div>
