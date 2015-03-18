package mum.universitystore.service;

import java.util.List;

import mum.universitystore.model.Category;
import mum.universitystore.model.Product;

public interface CategoryService {

	public List<Category> getAllCategory();

	public Category find(Long id);

	public void addCategory(Category category);

}
