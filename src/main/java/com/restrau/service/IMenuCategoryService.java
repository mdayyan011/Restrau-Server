package com.restrau.service;

import java.util.List;

import com.restrau.model.Category; 

//POJI for menuCategoryService 
public interface IMenuCategoryService {

	public List<Category> getAllCatByMenuId(int menuId);
	
}
