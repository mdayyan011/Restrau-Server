package com.restrau.model;

//POJO for Dish
public class Dish{
	
	// private fields
	private int _dishId;
	private String _dishName, _dishDescription, _dishImage, _nature;
	private double _price;
	private int _isDelete;
	
	// parametrized constructor
	public Dish(int _dishId, String _dishName, String _dishDescription, String _dishImage, String _nature,
			double _price, int _isDelete) {
		super();
		this._dishId = _dishId;
		this._dishName = _dishName;
		this._dishDescription = _dishDescription;
		this._dishImage = _dishImage;
		this._nature = _nature;
		this._price = _price;
		this._isDelete = _isDelete;
	}
	
	// default constructor
	public Dish() {}

	
	// ---------------- Getter Setter
	/**
	 * @return the _dishId
	 */
	public int get_dishId() {
		return _dishId;
	}

	/**
	 * @param _dishId the _dishId to set
	 */
	public void set_dishId(int _dishId) {
		this._dishId = _dishId;
	}

	/**
	 * @return the _dishName
	 */
	public String get_dishName() {
		return _dishName;
	}

	/**
	 * @param _dishName the _dishName to set
	 */
	public void set_dishName(String _dishName) {
		this._dishName = _dishName;
	}

	/**
	 * @return the _dishDescription
	 */
	public String get_dishDescription() {
		return _dishDescription;
	}

	/**
	 * @param _dishDescription the _dishDescription to set
	 */
	public void set_dishDescription(String _dishDescription) {
		this._dishDescription = _dishDescription;
	}

	/**
	 * @return the _dishImage
	 */
	public String get_dishImage() {
		return _dishImage;
	}

	/**
	 * @param _dishImage the _dishImage to set
	 */
	public void set_dishImage(String _dishImage) {
		this._dishImage = _dishImage;
	}

	/**
	 * @return the _nature
	 */
	public String get_nature() {
		return _nature;
	}

	/**
	 * @param _nature the _nature to set
	 */
	public void set_nature(String _nature) {
		this._nature = _nature;
	}

	/**
	 * @return the _price
	 */
	public double get_price() {
		return _price;
	}

	/**
	 * @param _price the _price to set
	 */
	public void set_price(double _price) {
		this._price = _price;
	}

	/**
	 * @return the _isDelete
	 */
	public int get_isDelete() {
		return _isDelete;
	}

	/**
	 * @param _isDelete the _isDelete to set
	 */
	public void set_isDelete(int _isDelete) {
		this._isDelete = _isDelete;
	}
	
	
	
	
	 
}
