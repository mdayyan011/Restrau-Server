package com.restrau.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restrau.model.Category;
import com.restrau.model.MenuCategory;
 
import com.restrau.service.IMenuCategoryService;

//declaring it as rest controller
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/api")
@RestController
public class MenuCategoryController {

	// autowiring with the service
		@Autowired
		IMenuCategoryService menuCategoryService;
		
		// for getting categories by menu id
		@GetMapping("/categoriesbymenuid/{menuId}")
		public List<Category> getAllCatByMenuId(@PathVariable int menuId){
			
			return menuCategoryService.getAllCatByMenuId(menuId);
			
		}
}
