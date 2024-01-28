package com.restrau.model;

//POJO for CategoryDish
public class CategoryDish {

	// private fields
	private int _categoryId, _dishId;
	
	// default constructor
	public CategoryDish() {}

	// arg-constructor to initialize fields
	public CategoryDish(int _categoryId, int _dishId) {
		super();
		this._categoryId = _categoryId;
		this._dishId = _dishId;
	}

	// getter for categoryId 
	public int get_categoryId() {
		return _categoryId;
	}

 
	// setter for categoryId
	public void set_categoryId(int _categoryId) {
		this._categoryId = _categoryId;
	}

 
	// getter for dishId 
	public int get_dishId() {
		return _dishId;
	}

	 
	// setter for dishId 
	public void set_dishId(int _dishId) {
		this._dishId = _dishId;
	}

	// to get the state of object
	@Override
	public String toString() {
		return "CategoryDish [_categoryId=" + _categoryId + ", _dishId=" + _dishId + "]";
	}
	
	
	
}
