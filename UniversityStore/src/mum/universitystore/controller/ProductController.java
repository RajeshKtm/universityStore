package mum.universitystore.controller;

import java.io.File;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import mum.universitystore.model.Category;
import mum.universitystore.model.Product;
import mum.universitystore.service.CategoryService;
import mum.universitystore.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.support.RequestContext;
import org.springframework.web.servlet.support.RequestContextUtils;



@Controller
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@Autowired
	private CategoryService categoryService;
	
//	@Autowired
//	private ProductValidator productValidator;
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String getAddNewProductForm(@ModelAttribute("newProduct") Product newProduct, Model model) {
		List<Category> categories = categoryService.getAllCategory();
		System.out.println(categories);
		System.out.println("this is a test");
		model.addAttribute("categories", categories);
	   return "addProduct";
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String processAddNewProductForm(@ModelAttribute("newProduct") @Valid Product newProduct, BindingResult result, HttpServletRequest request) {
		if(result.hasErrors()) {
			return "addProduct";
		}

		String[] suppressedFields = result.getSuppressedFields();
		
		if (suppressedFields.length > 0) {
			throw new RuntimeException("Attempting to bind disallowed fields: " + StringUtils.arrayToCommaDelimitedString(suppressedFields));
		}
		
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
	   
	


}
