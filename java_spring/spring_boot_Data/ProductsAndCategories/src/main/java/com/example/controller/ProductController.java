//package com.example.controller;
//
//import java.util.List;
//import java.util.Locale.Category;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PathVariable;
//
//import com.example.models.Association;
//import com.example.models.Product;
//import com.example.services.AppService;
//
//;
//
//@Controller
//public class ProductController {
//	private AppService appService;
//	public ProductController(AppService service) {
//		this.appService = service;
//	}	
//	@GetMapping("/")
//	public String Index(Model model) {
//		model.addAttribute("products", appService.findProducts());
//		return "products/index.jsp";
//	}
////	@GetMapping("/{id}")
////	public String Show(@ModelAttribute("association") Association association, 
////		@PathVariable("id") Long id, Model model) {
////		Product thisOne = appService.getProduct(id);
//////		List<Category> others = appService.findCategoriesNotInProduct(thisOne);
////		model.addAttribute("product", thisOne);
////		model.addAttribute("notInCategories", others);
////		return "products/show.jsp";
////	}
//}
