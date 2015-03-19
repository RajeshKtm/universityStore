<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

	<section class="container">
		<form:form  modelAttribute="newProduct" class="form-horizontal" enctype="multipart/form-data">
		
			
				<form:errors path="*" cssClass="alert alert-danger" element="div"/>
				<div class="form-group">
					<label class="control-label col-lg-2 col-lg-2" for="productId">ProductId:</label>
					<div class="col-lg-10">
						<form:input id="productId" path="id" type="text" class="form:input-large"/>
						<form:errors path="id" cssClass="text-danger"/>
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="name">Product Name:</label>
					<div class="col-lg-10">
						<form:input id="name" path="name" type="text" class="form:input-large"/>
						<form:errors path="name" cssClass="text-danger"/>
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="unitPrice">Unit Price:</label>
					<div class="col-lg-10">
						<div class="form:input-prepend">
							<form:input id="unitPrice" path="unitPrice" type="text" class="form:input-large"/>
							<form:errors path="unitPrice" cssClass="text-danger"/>
						</div>
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="description">Description:</label>
					<div class="col-lg-10">
						<form:textarea id="description" path="description" rows = "2"/>
					</div>
				</div>
    				<div class="form-group">
					<label class="control-label col-lg-2" for="manufacturer">Manufacturer:</label>
					<div class="col-lg-10">
						<form:input id="manufacturer" path="manufacturer" type="text" class="form:input-large"/>
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="category">Category:</label>
					<div class="col-lg-10">
            		 	<form:select id="category" path="category.id" 
               		items="${categories}" itemLabel="name" itemValue="id"/> 
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="unitsInStock">UnitInStock</label>
					<div class="col-lg-10">
						<form:input id="unitsInStock" path="unitsInStock" type="text" class="form:input-large"/>
					</div>
				</div>

<!-- 				<div class="form-group"> -->
<!-- 					<label class="control-label col-lg-2" for="condition">Condition</label> -->
<!-- 					<div class="col-lg-10"> -->
<%-- 						<form:radiobutton path="condition" value="New" />New  --%>
<%-- 						<form:radiobutton path="condition" value="Old" />Old  --%>
<%-- 						<form:radiobutton path="condition" value="Refurbished" />Refurbished --%>
<!-- 					</div> -->
<!-- 				</div> -->
				
<!-- 				<div class="form-group"> -->
<!-- 					<label class="control-label col-lg-2" for="productImage">Image:</label> -->
<!-- 					<div class="col-lg-10"> -->
<%-- 						<form:input id="productImage" path="productImage" type="file" --%>
<%-- 							class="form:input-large" /> --%>
<!-- 					</div> -->
<!-- 				</div> -->
				<div class="form-group">
				<label class=""> &nbsp;</label>
					<div class="col-lg-10">
						<input type="submit" id="btnAdd" value ="Add"/>
					</div>
				</div>
				
			
		</form:form>
	</section>

