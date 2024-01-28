package com.restrau.model;

public class CategoryDishCommon extends Dish{

	// private field
	private int _categoryId;
	
	// default constructor
	public CategoryDishCommon() {}

	// parametrized query
	public CategoryDishCommon(int _categoryId) {
		super();
		this._categoryId = _categoryId;
	}
 
	// getter for category Id
	public int get_categoryId() {
		return _categoryId;
	}
 
	// setter for category Id
	public void set_categoryId(int _categoryId) {
		this._categoryId = _categoryId;
	}

	 
	
	
}
