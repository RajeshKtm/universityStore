package mum.universitystore.serviceImpl;

import java.util.List;

import mum.universitystore.model.Category;
import mum.universitystore.model.Product;
import mum.universitystore.repository.ProductRepository;
import mum.universitystore.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepository productRepository;

	public List<Product> getAll() {
		return (List<Product>) productRepository.findAll();
	}

	public List<Product> getAllProducts() {
		return productRepository.getAllProducts();
	}

	public void save(Product product) {
		productRepository.save(product);
		return;
	}

	public Product find(Long id) {
		return productRepository.findOne(id);

	}

	public List<Product> getProductsByCategoryID(long ID) {
		// TODO Auto-generated method stub
		return productRepository.getProductsByCategoryID(ID);
	}

	@Override
	public void addProduct(Product product) {
		productRepository.save(product);
		return;
	}

	@Override
	public List<Product> getProductsByCategoryID(Long ID) {
		// TODO Auto-generated method stub
		return null;
	}

}
