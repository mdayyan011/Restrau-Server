package com.restrau.model;
 
// POJO for Category
public class Category {
	
	// private fields
	private int _categoryId;
	private String _categoryName, _categoryDescription, _categoryImage;
	
	// default constructor
	public Category() {}

	// arg-constructor to initialize fields
	public Category(int _categoryId, String _categoryName, String _categoryDescription, String _categoryImage) {
		super();
		this._categoryId = _categoryId;
		this._categoryName = _categoryName;
		this._categoryDescription = _categoryDescription;
		this._categoryImage = _categoryImage;
	}

	
	// getter for categoryId 
	public int get_categoryId() {
		return _categoryId;
	}

	 
	// setter for categoryId 
	public void set_categoryId(int _categoryId) {
		this._categoryId = _categoryId;
	}

	 
	// getter for categoryName 
	public String get_categoryName() {
		return _categoryName;
	}

	 
	// setter for categoryName 
	public void set_categoryName(String _categoryName) {
		this._categoryName = _categoryName;
	}
 
	// getter for categoryDescription 
	public String get_categoryDescription() {
		return _categoryDescription;
	}

	 
	// setter for categoryDescription 
	public void set_categoryDescription(String _categoryDescription) {
		this._categoryDescription = _categoryDescription;
	}

	 
	// getter for categoryImage 
	public String get_categoryImage() {
		return _categoryImage;
	}

	 
	// setter for categoryImage 
	public void set_categoryImage(String _categoryImage) {
		this._categoryImage = _categoryImage;
	}

	
	// to get the state of object
	@Override
	public String toString() {
		return "Category [_categoryId=" + _categoryId + ", _categoryName=" + _categoryName + ", _categoryDescription="
				+ _categoryDescription + ", _categoryImage=" + _categoryImage + "]";
	}

	 
	
	
}
