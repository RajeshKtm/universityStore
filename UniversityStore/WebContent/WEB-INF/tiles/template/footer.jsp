<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<footer>
<ul>
<li><a href="<spring:url value="/welcome"/>">Home</a></li>
<li><a href="<spring:url value="/CatListWithProd"/>">Product List</a></li>
<li><a href="<spring:url value="/products/"/>">Products</a></li>
<li><a href="<spring:url value="/products/add"/>">Add Product</a></li>
<li><a href="<spring:url value="/cart/"/>">Cart</a></li>
</ul>
&copy; Pulsar 2015, All Rights Reserved. <br />
<img height="50" src="<spring:url value='/resources/images/pulsar.png'/>" alt="MUM Store">
</footer>