package mum.universitystore.repository;


import java.util.List;

import mum.universitystore.model.Product;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;




	//@Repository
	public interface ProductRepository extends  CrudRepository<Product, Long> 
	{
	
 	    // findAll comes with repository
//	    @Query("SELECT p FROM Product p")
//		public List<Product> getAll();
 	
	    @Query(value = "select distinct p from Product p left join fetch p.hotLine")
	    List<Product> getAllProducts();

	    
	    //		List<Product> getProductsByCategory(String category);

	    @Query("SELECT p FROM Product p where categoryId = :catId")
	    List<Product> getProductsByCategoryID(@Param("catId")long Id);

	}

