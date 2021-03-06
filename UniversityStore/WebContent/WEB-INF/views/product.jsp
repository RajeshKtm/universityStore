<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<script type="text/javascript"
	src="http://code.jquery.com/jquery-1.10.1.min.js"></script>
<script type="text/javascript"
	src="<spring:url value="/resource/js/cart.js"/>"></script>

	<div class="container">

		<div class="row"> 
			<%-- <div class="col-md-5">
				<img
					src="<c:url value="/resource/images/${product.productId}.png"></c:url>"
					alt="image" style="width: 100%" />
			</div> --%>

			<div class="col-md-5">
				<h3>${product.name}</h3>
				<p>${product.description}</p>
				<p>
					<strong>Item Code : </strong><span class="label label-warning">${product.productId}</span>
				</p>
				<p>
					<strong>manufacturer</strong> : ${product.manufacturer}
				</p>
				<p>
					<strong>category</strong> : ${product.category}
				</p>
				<p>
					<strong>Condition</strong> : ${product.condition}
				</p>
				<p>
					<strong>Availble units in stock </strong> : ${product.unitsInStock}
				</p>
				<h4>${product.unitPrice}USD</h4>
				
				<p ng-controller="cartCtrl">
					<a href="#" class="btn btn-warning btn-large"
						onclick="addToCart('${product.productId}')"> <span
						class="glyphicon-shopping-cart glyphicon"></span> Order Now
					</a> <a href="<spring:url value="/cart" />" class="btn btn-default">
						<span class="glyphicon-hand-right glyphicon"></span> View Cart
					</a> <a href="<spring:url value="/products" />" class="btn btn-default">
						<span class="glyphicon-hand-left glyphicon"></span> back
					</a>

				</p>

			</div>
		</div>
		<!--/div-->
	</div>
