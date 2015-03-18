$(document).ready(function() {
	
	var cartId;
	
	addToCart = function(productId){
			$.ajax({
		 		url: '/webstore8/rest/cart/add/' + productId,
		 		type: 'PUT',
				dataType: "json",
				success: function(response){
	 		 		alert("Product Successfully added to the Cart!");

				},
				error: function(){						
					alert('Error while request..');
				}
			});
		}

	   removeFromCart = function(productId) {
			$.ajax({
				url: '/webstore8/rest/cart/remove/'+ productId,
		 		type: 'PUT',
				dataType: "json",
			 	 success: function (response) {
		 		 		location.reload(true);
					},
					error: function(){						
						alert('Error while request..');
			 	 } 
		   });
	   }

	 
       $("#cart_table").find("tr").click(function() {  
	       	var productId=  $(this).find("td:first").html();
				showProduct(productId);
	          });

	   
	   function showProduct(productId) {
			$.ajax({
				url: '/webstore8/rest',
		 		type: 'GET',
		 		async:false,
				dataType: "json",
				data:'id=' + productId,
			 	 success: function (response) {
		 		 		 displayProduct(response);
					},
					error: function(){						
 			 	 } 
		   });
	   }
	   
	   function displayProduct(product) {
	 
			$('#result').html("");
			$("#result").append( '<H3> Product Information <H3>');                
			$("#result").append( '<H4>' + product.productId + '<H4>');                
			$("#result").append( '<H4>' + product.name + '<H4>');                
			$("#result").append( '<H4>' + product.unitPrice + '<H4>');                
			$("#result").append( '<H4>' + product.manufacturer + '<H4>');                
			$("#result").append( '<H4>' + product.category + '<H4>');                
     
	 		} 
	 
	   
	   
//------------------------------------------------------------------------------	   
	   

		 getCartId = function( ) {
				$.ajax({
					url: '/webstore8/rest/cart/getId/',
					type: 'GET',
					success : function(id) {
					 		 		 cartId = id;
					 	 		}
			});
		 }

		 refreshCart = function() {
		 		getCartId();
				$.ajax({
					url: '/webstore8/rest/cart/'+ cartId,
					type: 'GET',
					dataType: "json",
					success : function(cartData) {
  					 }
			});
		 }


});

 