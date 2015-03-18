package mum.universitystore.repository;

import java.util.List;

import mum.universitystore.model.Category;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {
	
		    @Query(value = "select distinct c from Category c")
			List<Category> getAllCategory();
}
