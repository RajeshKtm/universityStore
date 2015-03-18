<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>
<html>
<head>
<title></title>
<style type="text/css">@import url(css/main.css);</style>
</head>
<body>
	
	
	<form action="admin" method="post">
    <fieldset>
        <legend>Admin Login</legend>
        <p>
            <label for="name">Name: </label>
            <input type="text" id="name" name="name" 
                tabindex="1">
        </p>
        <p>
            <label for="password">Password: </label>
            <input type="passowrd" id="description" 
                name="password" tabindex="2">
        </p>
        
        <p id="buttons">
            <input id="reset" type="reset" >
            <input id="submit" type="submit" tabindex="5" 
                value="Log In">
        </p>
    </fieldset>
</form>

</body>
</html>