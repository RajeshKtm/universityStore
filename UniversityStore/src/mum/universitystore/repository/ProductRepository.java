package mum.universitystore.repository;

import java.util.List;

import mum.universitystore.model.Category;
import mum.universitystore.model.Product;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {

	@Query(value = "select distinct p from Product p")
	List<Product> getAllProducts();

	@Query("SELECT p FROM Product p where categoryId = :catId")
	List<Product> getProductsByCategoryID(@Param("catId") long Id);

}
