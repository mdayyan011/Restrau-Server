package com.restrau.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.restrau.model.CategoryDishCommon;
import com.restrau.model.Dish;
import com.restrau.service.IDishService;

// declaring it as rest controller
@CrossOrigin(origins="*",allowedHeaders = { "GET", "POST", "PUT", "DELETE" }, methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT,RequestMethod.DELETE })
@RequestMapping("/api")
@RestController
public class DishController {

	// autowiring with the service
	@Autowired
	IDishService dishService;
	
	// for fetching all dishes available
	@GetMapping("/dishitems")
	public List<Dish> menus()
	{
		System.out.println("Request recived for menus");
		return dishService.getAllDishes();
	}
	
	// for fetching a particular dish detail by Dish ID
	@GetMapping("/dishitems/{dishID}")
	public Dish getDishByDishID(@PathVariable int dishID)
	{
		System.out.println("Request recived for getDishByDishID");
		return dishService.getDishByDishID(dishID);	
	}
	
	// for creating a new dish
	@PostMapping("/dishitem")
	public int addDish(@RequestBody CategoryDishCommon newDish)
	{
		System.out.println("Request recived for addDish");
		return dishService.createDish(newDish);
	}
	
	// for updating a particular dish by Dish ID
	@PutMapping("/dishitems/{dishId}")
	public int updateDish(@RequestBody Dish dish,@PathVariable int dishId)
	{
		System.out.println("Request recived for updateDish");
		return dishService.updateDish(dish,dishId);
		
	} 
	
	// for soft deleting the dish
	@DeleteMapping("/deletedish/{dishId}")
	public int deleteDish(@PathVariable int dishId) {
		System.out.println("Request recived for deleteDish");
		return dishService.deleteDish(dishId);
	}
}
