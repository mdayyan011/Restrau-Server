package com.restrau.service;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restrau.dao.CategoryRepository;
import com.restrau.dao.MenuCategoryRespository;
import com.restrau.dao.MenuRepository;
import com.restrau.model.Category;
import com.restrau.model.MenuCategory;

@Service
public class MenuCategoryService implements IMenuCategoryService{

	@Autowired
	MenuCategoryRespository menuCategoryRepository;
	
	@Autowired
	CategoryRepository categoryRepository;
	

	@Override
	public List<Category> getAllCatByMenuId(int id) {
		
		List<Category> categories = new ArrayList<>();
		// get all category id with the given menu id from menucategory table
		List<MenuCategory> categoriesByMenuId = menuCategoryRepository.getAllCatByMenuId(id);
		
		// getting details of each category
		for(MenuCategory categoryByMenuId: categoriesByMenuId) {
			Category category = categoryRepository.findbyId(categoryByMenuId.get_categoryId());
			categories.add(new Category(category.get_categoryId(),category.get_categoryName(),category.get_categoryDescription(),category.get_categoryImage()));	
			
		} 
		return categories;
				
	}
	
		
}
