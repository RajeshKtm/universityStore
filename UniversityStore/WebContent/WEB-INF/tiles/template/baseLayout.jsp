<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>


<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<title><tiles:insertAttribute name="title" /></title>
<link href="<spring:url value='/resources/css/main.css' />"
	type="text/css" rel="stylesheet" />
</head>

<body>
	<header>
		<div class="container">
			<div class="logo">
				<a href="<spring:url value='/'/>"><img
					src="<spring:url value='/resources/images/logo.png'/>"
					alt="MUM Store"></a>
			</div>
		</div>
		<nav>
			<div class="container">
				<ul class="nav nav-pills pull-right">
					<tiles:insertAttribute name="navigation" />
				</ul>
			</div>
		</nav>
	</header>
	<div class="container">
		<div class="content">
			<h1>
				<tiles:insertAttribute name="title" />
			</h1>
			<tiles:insertAttribute name="content" />
		</div>

		<div class="sidebar">
			<h2>Categories</h2>
			<ul>
				<li><a href="">Category1</a></li>
				<li><a href="">Category1</a></li>
				<li><a href="">Category1</a></li>
				<li><a href="">Category1</a></li>
				<li><a href="">Category1</a></li>
				<li><a href="">Category1</a></li>
				<li><a href="">Category1</a></li>
			</ul>
		</div>

	</div>
	<div class="footer">
		<tiles:insertAttribute name="footer" />
	</div>
</body>
</html>
