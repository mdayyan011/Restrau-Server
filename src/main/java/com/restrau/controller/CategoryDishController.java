package com.restrau.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.restrau.exception.NullException;
import com.restrau.exception.ResourceNotFound;
import com.restrau.model.Category;
import com.restrau.model.Dish;
import com.restrau.service.ICategoryDishService;

//declaring as a rest controller

@CrossOrigin(origins="*",allowedHeaders = { "GET", "POST", "PUT", "DELETE" }, methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT,RequestMethod.DELETE })
@RequestMapping("/api")
@RestController
public class CategoryDishController {

	@Autowired
	ICategoryDishService catDishService;
	
	// for fetching all dishes by category id
		@GetMapping("/dishesbycatid/{catId}")
		public List<Dish> getAllDish(@PathVariable int catId) throws ResourceNotFound, NullException {
			System.out.println("Request recived for getAllDish");
			return catDishService.getAllDishByCatId(catId);
		}
}
