package com.restrau.service;

import java.util.List;

import com.restrau.model.CategoryDishCommon;
import com.restrau.model.Dish;

//POJI for DishService 
public interface IDishService {

	public List<Dish> getAllDishes();

	public Dish getDishByDishID(int dishId);

	public int createDish(CategoryDishCommon newDish);

	public int updateDish(Dish dish, int dishId);
	
	public int deleteDish(int dishId);
 

	
}
