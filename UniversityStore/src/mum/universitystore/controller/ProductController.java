package mum.universitystore.controller;

import java.util.List;

import mum.universitystore.repository.ProductRepository;
import mum.universitystore.service.ProductService;
import mum.universitystore.model.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class ProductController {
	@Autowired
	ProductService productservice;

	@RequestMapping(value = { "/", "/list" })
	public String productList(Model model) {
		return "welcome";
	}

	@RequestMapping(value = "/products/add", method = RequestMethod.GET)
	public String addProduct() {
		return "addProduct";
	}
	
	@RequestMapping(value="/CatListWithProd",method=RequestMethod.GET)
	public String catWiseProducts(){
		
		return "catListWithProd";
	}
	
//	@RequestMapping("products/{categoryid}")
//	public String getProductsByCategory(Model model,@PathVariable("categoryid")long categoryId) {
//	model.addAttribute("products", productservice.getProductsByCategoryID(categoryId));
//	return "products";
//	}
	@RequestMapping("products/{categoryid}")
	public @ResponseBody List<Product> getProductsByCategory(@PathVariable("categoryid")long categoryId) {
	return productservice.getProductsByCategoryID(categoryId);
	
	}
}
