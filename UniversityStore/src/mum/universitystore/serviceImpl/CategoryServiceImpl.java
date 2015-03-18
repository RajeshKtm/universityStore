package mum.universitystore.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mum.universitystore.model.Category;
import mum.universitystore.model.Product;
import mum.universitystore.repository.CategoryRepository;
import mum.universitystore.service.CategoryService;

@Transactional
@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	CategoryRepository categoryRepository;

	@Override
	public List<Category> getAllCategory() {
		return categoryRepository.getAllCategory();
	}

	@Override
	public Category find(Long id) {
		return categoryRepository.findOne(id);
	}

	@Override
	public void addCategory(Category category) {
		categoryRepository.save(category);
	}

}
