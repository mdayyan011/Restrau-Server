package com.restrau.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restrau.dao.CategoryRepository;
import com.restrau.exception.NullException;
import com.restrau.exception.ResourceNotFound;
import com.restrau.model.Category;
import com.restrau.model.MenuCategoryCommon;

//Declaring CategoryService as @Service using annotation

@Service
public class CategoryService implements ICategoryService{

	// autowiring categoryRepository
	@Autowired
	CategoryRepository categoryRepository;
	
	// getting all categories from the categoryRepository
	@Override
	public List<Category> findAllCategories() throws ResourceNotFound, NullException {
		return categoryRepository.getAllCategories();
	}

	// getting category detail of a particular category from categoryRepository
	@Override
	public Category getCategoryById(int id) throws ResourceNotFound, NullException{
		Category updatedMenu = categoryRepository.findbyId(id);
		return updatedMenu;
	}

	// creating a new category by calling saveCategory method from categoryRepository
	@Override
	public String createCategory(MenuCategoryCommon newCategory) throws ResourceNotFound, NullException {
		if (categoryRepository.saveCategory(newCategory) == 1) {
			return "added successfully";
		} else {
			return "error";
		}
	}

	
	// updating an existing category by calling updateCategory method from categoryRepository
	@Override
	public String updateCategory(Category category, int id) {
		if (categoryRepository.updateCategory(category, id) == 1) {
			return "updated successfully";
		} else {
			return "error";
		}
	}

	
}
