package com.restrau.controller;

import org.springframework.web.bind.annotation.RequestMethod;
import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restrau.exception.NullException;
import com.restrau.exception.ResourceNotFound;
import com.restrau.model.Category;
import com.restrau.model.MenuCategoryCommon;
import com.restrau.service.ICategoryService;

import org.springframework.web.bind.annotation.RequestMethod;

// declaring as a rest controller
//@CrossOrigin(origins="*",allowedHeaders = { "GET", "POST", "PUT", "DELETE" }, methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT,RequestMethod.DELETE })
@RequestMapping("/api")
@RestController
public class CategoryController {
	
	// autowiring with the service
	@Autowired
	ICategoryService categoryService;
	
	// for fetching all categories available
	@GetMapping("/categoryitems")
	public List<Category> Categories() throws ResourceNotFound, NullException {
		System.out.println("Request recived for /categoryitems");
		return categoryService.findAllCategories();
	}
	
	// for fetching a particular category detail by Category ID
	@GetMapping("/categoryitems/{id}")
	public Category findByCategoryId(@PathVariable int id) throws ResourceNotFound, NullException {
		System.out.println("Request recived for findByCategoryId");
		return categoryService.getCategoryById(id);
	}
	
	
	// for creating a new category
	@PostMapping ("/categoryitems")
	public String createCategory (@RequestBody MenuCategoryCommon newCategory) throws ResourceNotFound, NullException {
		System.out.println("Request recived for createCategory");
		return categoryService.createCategory(newCategory);
	}
	
	
	// for updating a particular category by Category ID
	@PutMapping(path="/categoryitems/{id}")
	public String updateCategory(@RequestBody Category category, @PathVariable int id) throws ResourceNotFound, NullException {
		System.out.println("Request recived for updateCategory");
		return categoryService.updateCategory(category, id);
	}
}
