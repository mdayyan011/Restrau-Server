package com.restrau.service;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restrau.dao.MenuRepository;
import com.restrau.exception.NullException;
import com.restrau.exception.ResourceNotFound;
import com.restrau.model.Menu;

@Service
public class MenuService implements IMenuService{

	
	@Autowired
	MenuRepository menuRepository;
	  
	
	@Override
	public List<Menu> findAllMenus() throws ResourceNotFound, NullException {
		// TODO Auto-generated method stub
		return menuRepository.getAllMenus();
	}

	@Override
	public Menu getByMenuId(int _menuId) throws ResourceNotFound, NullException{
		 
		return menuRepository.getMenuByMenuId(_menuId);
	}

	@Override
	public int createMenu(Menu newmenu) throws ResourceNotFound, NullException{ 
		return menuRepository.saveMenu(newmenu);
	}

	@Override
	public int updateMenu(Menu menu, int menuId) throws ResourceNotFound, NullException{ 
		return menuRepository.updatMenu(menu, menuId);
	}
}
