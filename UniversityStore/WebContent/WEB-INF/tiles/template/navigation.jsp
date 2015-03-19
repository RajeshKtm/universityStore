<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags"%>

<li><a href="<spring:url value="/welcome"/>">Home</a></li>

<li><a href="<spring:url value="/products/"/>">Products</a></li>
<li><a href="<spring:url value="/cart/"/>">Cart</a></li>
<security:authorize access="isAuthenticated()"> 
<li><a href="<spring:url value="/CatListWithProd"/>">Product List</a></li>
 <li><a href="<spring:url value="/products/add"/>">Add Product</a></li>
 <li><a href="<spring:url value="categories"/>">Category List</a></li>
 <li><a href="<spring:url value="/categories/add"/>">Add Category</a></li>
<li class="login"> Welcome <security:authentication property="principal.username" /> |  <a href="<spring:url value="/doLogout"/>">Logout</a></li>
</security:authorize> 

 <security:authorize access="isAnonymous()"> 
 	<li class="login"><a href="<spring:url value='/login' />" >Login</a></li> 
 	<li class="login"><a href="<spring:url value='/members/add' />" >Signup</a></li> 
  </security:authorize>