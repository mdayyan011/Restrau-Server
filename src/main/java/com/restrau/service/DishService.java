package com.restrau.service;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restrau.dao.DishRepository;
import com.restrau.model.CategoryDishCommon;
import com.restrau.model.Dish;

//Declaring CategoryService as @Service using annotation

@Service
public class DishService implements IDishService{

	// autowiring dishRepository
	@Autowired
	DishRepository dishRepository;
	
	public DishService() {}

	// getting all dishes from the dishRepository
	@Override
	public List<Dish> getAllDishes() {
		return dishRepository.getAllDishes();
	}

	// getting dish detail of a particular dish from dishRepository
	@Override
	public Dish getDishByDishID(int dishId) {
		return dishRepository.getDishByDishID(dishId);
	}
	
	// creating a new dish by calling saveCategory method from categoryRepository
	@Override
	public int createDish(CategoryDishCommon newDish) {
		return dishRepository.saveDish(newDish);
	}

	@Override
	public int updateDish(Dish updatedDish, int dishId) {
		return dishRepository.updateDish(updatedDish,dishId);
	}

	@Override
	public int deleteDish(int dishId) {
		// TODO Auto-generated method stub
		return dishRepository.deleteDish(dishId);
	}
	
	
}
