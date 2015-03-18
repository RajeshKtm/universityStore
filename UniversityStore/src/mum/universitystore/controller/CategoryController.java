package mum.universitystore.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import mum.universitystore.model.Category;
import mum.universitystore.model.Product;
import mum.universitystore.service.CategoryService;

import org.springframework.beans.factory.annotation.Autowired;
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

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String getAddNewCategoryForm(
			@ModelAttribute("newCategory") Category newCategory, Model model) {

		return "addCategory";
	}

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
	
	@RequestMapping(value = "/CatListWithProd", method = RequestMethod.GET)
	public String catListWithProduct(Model model){
		model.addAttribute("categories",categoryService.getAllCategory());
		return "catListWithProd";
	}

}
