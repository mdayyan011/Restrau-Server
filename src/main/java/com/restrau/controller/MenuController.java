package com.restrau.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restrau.exception.NullException;
import com.restrau.exception.ResourceNotFound;
import com.restrau.model.Menu;
import com.restrau.service.IMenuService;
//declaring it as rest controller
@RequestMapping("/api")
@RestController
@CrossOrigin(origins="*")

public class MenuController {

	// autowiring with the service
	@Autowired
	IMenuService menuService;
	
	// for fetching all menu available
	@GetMapping("/menuitems")
	public List<Menu> menus() throws ResourceNotFound, NullException{
		System.out.println("Request recived for menus");
		return menuService.findAllMenus();
	}
	
	// for fetching a particular menu detail by Menu ID
	@GetMapping("/menuitems/{menuId}")
	public Menu getMenuByMenuId(@PathVariable int menuId) throws ResourceNotFound, NullException{
		System.out.println("Request recived for getMenuByMenuId");
		return menuService.getByMenuId(menuId);
	}
	
	// for creating a new menu
	@PostMapping("/menuitem")
	public int addMenu(@RequestBody Menu newmenu) throws ResourceNotFound, NullException {
		System.out.println("Request recived for addMenu");
		return menuService.createMenu(newmenu);
	}
	
	// for updating a particular menu by Menu ID
	@PutMapping("/menuitems/{menuId}")
	public int updateMenu(@RequestBody Menu updatedMenu, @PathVariable int menuId) throws ResourceNotFound, NullException {
		System.out.println("Request recived for updateMenu");
		return menuService.updateMenu(updatedMenu,menuId);
	}
}
