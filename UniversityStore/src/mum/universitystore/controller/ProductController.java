package mum.universitystore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller

public class ProductController {

	@RequestMapping(value = { "/", "/list" })
	public String productList(Model model) {
		return "welcome";
	}

	@RequestMapping(value = "/products/add", method = RequestMethod.GET)
	public String addProduct() {
		return "addProduct";
	}

}
