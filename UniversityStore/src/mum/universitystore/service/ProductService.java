package mum.universitystore.service;

import java.util.List;

import mum.universitystore.model.Category;
import mum.universitystore.model.Product;


public interface ProductService   {

	public List<Product> getAll();

	public List<Product> getAllProducts();

	public void save(Product product);

	public Product find(Long id);

	void addProduct(Product product);

		   
}
 
