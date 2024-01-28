package com.restrau.model;

//POJO for Menu
public class Menu {

	// private fields
	private int _menuId;
	private String _menuName, _menuDescription, _menuImage;
	
	// default constructor
	public Menu() {}

	// arg-constructor to initialize fields
	public Menu(int _menuId, String _menuName, String _menuDescription, String _menuImage) {
		super();
		this._menuId = _menuId;
		this._menuName = _menuName;
		this._menuDescription = _menuDescription;
		this._menuImage = _menuImage;
	}

	// getter for menuId  
	public int get_menuId() {
		return _menuId;
	}

 
	// setter for menuId  
	public void set_menuId(int _menuId) {
		this._menuId = _menuId;
	}
 
	// getter for menuName  
	public String get_menuName() {
		return _menuName;
	}

 
	// setter for menuName  
	public void set_menuName(String _menuName) {
		this._menuName = _menuName;
	}
 
	// getter for menuDescription  
	public String get_menuDescription() {
		return _menuDescription;
	}

	 
	// setter for menuDescription  
	public void set_menuDescription(String _menuDescription) {
		this._menuDescription = _menuDescription;
	}
 
	// getter for menuImage  
	public String get_menuImage() {
		return _menuImage;
	}

	 
	// setter for menuImage  
	public void set_menuImage(String _menuImage) {
		this._menuImage = _menuImage;
	}

	
	
	// to get the state of object
	@Override
	public String toString() {
		return "Menu [_menuId=" + _menuId + ", _menuName=" + _menuName + ", _menuDescription=" + _menuDescription
				+ ", _menuImage=" + _menuImage + "]";
	}
}
 