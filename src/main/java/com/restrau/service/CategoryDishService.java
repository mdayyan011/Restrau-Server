package com.restrau.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.restrau.dao.CategoryDishRepository;
import com.restrau.dao.DishRepository;
import com.restrau.exception.NullException;
import com.restrau.exception.ResourceNotFound; 
import com.restrau.model.Dish;
import com.restrau.model.CategoryDish; 

@Service
public class CategoryDishService implements ICategoryDishService{

	@Autowired
	CategoryDishRepository dishCategoryRepository;
	
	@Autowired
	DishRepository dishRepository;
	

	@Override
	public List<Dish> getAllDishByCatId(int catId) throws ResourceNotFound, NullException{
		List<Dish> dishes = new ArrayList<>();
		
		// get all dish id by cat id from cat dish table
		List<CategoryDish> dishesByCatId = dishCategoryRepository.getAllCatByMenuId(catId);
		    
		// getting details of each category
				for(CategoryDish dishByCatId: dishesByCatId) {
					Dish dish = dishRepository.getDishByDishID(dishByCatId.get_dishId());
					
					dishes.add(new Dish(dish.get_dishId(),dish.get_dishName(),dish.get_dishDescription(),dish.get_dishImage(),dish.get_nature(),dish.get_price(),0));
					System.out.println(dish);
				} 
				return dishes; 
	}

}
