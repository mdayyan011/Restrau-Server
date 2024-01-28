package com.restrau.service;

import java.util.List;
import java.util.Optional;

import com.restrau.exception.NullException;
import com.restrau.exception.ResourceNotFound;
import com.restrau.model.Category;
import com.restrau.model.MenuCategoryCommon;

//POJI for CategoryService
public interface ICategoryService {

	public List<Category> findAllCategories() throws ResourceNotFound, NullException;

	public Category getCategoryById(int id) throws ResourceNotFound, NullException;

	public String createCategory(MenuCategoryCommon newCategory) throws ResourceNotFound, NullException;

	public String updateCategory(Category menu, int id) throws ResourceNotFound, NullException;
 

}
