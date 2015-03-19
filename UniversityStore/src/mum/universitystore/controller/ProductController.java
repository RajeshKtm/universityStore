package mum.universitystore.controller;

import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import mum.universitystore.model.Category;
import mum.universitystore.model.Product;
import mum.universitystore.service.CategoryService;
import mum.universitystore.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@Autowired
	private CategoryService categoryService;
	
//	@Autowired
//	private ProductValidator productValidator;;
	
	//@PreAuthorize(value = "ROLE_ADMIN")
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String getAddNewProductForm(@ModelAttribute("newProduct") Product newProduct, Model model) {
		List<Category> categories = categoryService.getAllCategory();
		System.out.println(categories);
		System.out.println("this is a test");
		model.addAttribute("categories", categories);
	   return "addProduct";
	}
	
	@RequestMapping
	public String list(Model model) {
		model.addAttribute("products", productService.getAllProducts());
		return "products";
	}
	
	//@PreAuthorize(value = "ROLE_ADMIN")
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String processAddNewProductForm(@ModelAttribute("newProduct") @Valid Product newProduct, BindingResult result, HttpServletRequest request) {
		if(result.hasErrors()) {
			return "addProduct";
		}
		System.out.println(newProduct);
		System.out.println(newProduct.getCategory());
//		String[] suppressedFields = result.getSuppressedFields();
//		
//		if (suppressedFields.length > 0) {
//			throw new RuntimeException("Attempting to bind disallowed fields: " + StringUtils.arrayToCommaDelimitedString(suppressedFields));
//		}
		
//		MultipartFile productImage = newProduct.getProductImage();
//		String rootDirectory = request.getSession().getServletContext().getRealPath("/");
//				
//			if (productImage!=null && !productImage.isEmpty()) {
//		       try {
//		      	productImage.transferTo(new File(rootDirectory+"\\resources\\images\\"+newProduct.getProductId() + ".png"));
//		       } catch (Exception e) {
//				throw new RuntimeException("Product Image saving failed", e);
//		   }
//		   }
		
	   	productService.addProduct(newProduct);
		return "redirect:/products";
	}
	
//	@RequestMapping("/{categoryid}")
//	public @ResponseBody List<Product> getProductsByCategory(@PathVariable("categoryid")long categoryId) {
//		return productService.getProductsByCategoryID(categoryId);
//	
//	}
	   
	@RequestMapping(value = { "/", "/list" })
	public String productList(Model model) {
		return "welcome";
	}


}

