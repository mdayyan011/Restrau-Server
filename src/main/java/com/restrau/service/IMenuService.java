package com.restrau.service;

import java.util.List;

import com.restrau.exception.NullException;
import com.restrau.exception.ResourceNotFound;
import com.restrau.model.Menu;

//POJI for MenuService
public interface IMenuService {

	public List<Menu> findAllMenus() throws ResourceNotFound, NullException; 
	public Menu getByMenuId(int _menuId) throws ResourceNotFound, NullException;
	public int createMenu(Menu newmenu) throws ResourceNotFound, NullException;
	public int updateMenu(Menu menu, int _menuId) throws ResourceNotFound, NullException;
}
