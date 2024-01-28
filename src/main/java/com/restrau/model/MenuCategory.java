package com.restrau.model;

//POJO for MenuCategory
 public class MenuCategory {

	// private fields
	private int _menuId, _categoryId, _displayOrder;
	
	// default constructor
	public MenuCategory() {}

	// arg-constructor to initialize fields
	public MenuCategory(int _menuId, int _categoryId, int _displayOrder) {
		super();
		this._menuId = _menuId;
		this._categoryId = _categoryId;
		this._displayOrder = _displayOrder;
	}

	 
	// getter for menuId 
	public int get_menuId() {
		return _menuId;
	}

	 
	// setter for menuId 
	public void set_menuId(int _menuId) {
		this._menuId = _menuId;
	}

	 
	// getter for categoryId 
	public int get_categoryId() {
		return _categoryId;
	}
 
	// setter for categoryId 
	public void set_categoryId(int _categoryId) {
		this._categoryId = _categoryId;
	}

	 
	// getter for displayOrder 
	public int get_displayOrder() {
		return _displayOrder;
	}

 
	// setter for displayOrder 
	public void set_displayOrder(int _displayOrder) {
		this._displayOrder = _displayOrder;
	}

	// to get the state of object
	@Override
	public String toString() {
		return "MenuCategory [_menuId=" + _menuId + ", _categoryId=" + _categoryId + ", _displayOrder=" + _displayOrder
				+ "]";
	}
	
	
}
