package mum.universitystore.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import mum.universitystore.model.Category;
import mum.universitystore.model.Product;
import mum.universitystore.service.CategoryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/categories")
public class CategoryController {

	@Autowired
	private CategoryService categoryService;

	// @Autowired
	// private ProductValidator productValidator;

	//@PreAuthorize(value = "ROLE_ADMIN")
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String getAddNewCategoryForm(
			@ModelAttribute("newCategory") Category newCategory, Model model) {

		return "addCategory";
	}

	//@PreAuthorize(value = "ROLE_ADMIN")
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String processAddNewProductForm(@Valid Category newCategory,
			BindingResult result, HttpServletRequest request) {
		if (result.hasErrors()) {
			return "addCategory";
		}

		System.out.println(newCategory);
		String[] suppressedFields = result.getSuppressedFields();

		if (suppressedFields.length > 0) {
			throw new RuntimeException("Attempting to bind disallowed fields: "
					+ StringUtils.arrayToCommaDelimitedString(suppressedFields));
		}

		categoryService.addCategory(newCategory);
		return "redirect:/categories";
	}
	
	@RequestMapping
	public String listCategories(Model model){
		List<Category> categories = categoryService.getAllCategory();
		System.out.println(categories);
		model.addAttribute("categories", categories);
		return "CategoryAndProduct";
	}
	
	@RequestMapping(value = "/CatListWithProd", method = RequestMethod.GET)
	public String catListWithProduct(Model model){
		
		List<Category> ls=categoryService.getAllCategory();
		model.addAttribute("categories", ls);
		
		
		
		System.out.println(ls.size());
		
		return "catListWithProd";
	}

}
