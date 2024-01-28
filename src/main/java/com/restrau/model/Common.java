package com.restrau.model;
 
public class Common {
	 
	
	// private fields
	private String _menuName; 
	private String _categoryName; 
	private String _dishName;
	private String _dishImage; 
	private double _dishPrice;
	private String _dishNature;
	private String _dishDescription;
	
	public String get_dishDescription() {
		return _dishDescription;
	}
	public void set_dishDescription(String _dishDescription) {
		this._dishDescription = _dishDescription;
	}
	public String get_dishImage() {
		return _dishImage;
	}
	public void set_dishImage(String _dishImage) {
		this._dishImage = _dishImage;
	}
	public void set_menuName(String _menuName) {
		this._menuName = _menuName;
	}
	public String get_menuName() {
		return _menuName;
	}
	public String get_categoryName() {
		return _categoryName;
	}
	public void set_categoryName(String _categoryName) {
		this._categoryName = _categoryName;
	}
	public String get_dishName() {
		return _dishName;
	}
	public double get_dishPrice() {
		return _dishPrice;
	}
	public void set_dishPrice(double _dishPrice) {
		this._dishPrice = _dishPrice;
	}
	public String get_dishNature() {
		return _dishNature;
	}
	public void set_dishNature(String _dishNature) {
		this._dishNature = _dishNature;
	}
	public void set_dishName(String _dishName) {
		this._dishName = _dishName;
	}
}