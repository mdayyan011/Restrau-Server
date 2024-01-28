package com.restrau.model;

public class MenuCategoryCommon extends Category{

	// private fields
	private int _menuId;

	public MenuCategoryCommon() {
		super();
	}

	public MenuCategoryCommon(int _menuId) {
		super();
		this._menuId = _menuId;
	}
	
	 
	public int get_menuId() {
		return _menuId;
	}
 
	public void set_menuId(int _menuId) {
		this._menuId = _menuId;
	}

	@Override
	public String toString() {
		return "MenuCatCommon [_menuId=" + _menuId + ", get_categoryId()=" + get_categoryId() + ", get_categoryName()="
				+ get_categoryName() + ", get_categoryDescription()=" + get_categoryDescription()
				+ ", get_categoryImage()=" + get_categoryImage() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}	
}
