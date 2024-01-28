package com.restrau.service;

import java.util.List;

import com.restrau.exception.NullException;
import com.restrau.exception.ResourceNotFound; 
import com.restrau.model.Dish;

public interface ICategoryDishService {
 
	public List<Dish> getAllDishByCatId(int catId) throws ResourceNotFound, NullException;
	
}
