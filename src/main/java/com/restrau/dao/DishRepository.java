package com.restrau.dao;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.sql.ResultSet;
 
import com.restrau.model.CategoryDishCommon;
import com.restrau.model.Dish;

//declaring DishRepository as Repository using annotation
@Repository
public class DishRepository {

	// autowiring jdbcTemplate
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	// lambda expression
	private org.springframework.jdbc.core.RowMapper<Dish> rowMapper = (ResultSet rs, int rowNum) ->{
		Dish dish = new Dish();
		dish.set_dishId(rs.getInt(1));
		dish.set_dishName(rs.getString(2));
		dish.set_dishDescription(rs.getString(3));
		dish.set_price(rs.getDouble(4));
		dish.set_dishImage(rs.getString(5));
		dish.set_nature(rs.getString(6));
		dish.set_isDelete(rs.getInt(7));
		return dish;	
	}; 
	private org.springframework.jdbc.core.RowMapper<Dish> rowMapper1 = (ResultSet rs, int rowNum) ->{
		Dish dish = new Dish();
		dish.set_dishId(rs.getInt(1));
		return dish;	
	}; 

	// fetching all dishes from dish_master table
	public List<Dish> getAllDishes() {
		return jdbcTemplate.query("select * from Dish WHERE isDelete=0", rowMapper);
	}

	// fetching dish detail from dish_master table
	public Dish getDishByDishID(int dishId) {
		String sql = "select * from Dish where DishID = ? AND isDelete=0";
		return jdbcTemplate.queryForObject(sql, rowMapper , dishId);
	}

	// inserting a new dish to dish_master table
	public int saveDish(CategoryDishCommon newDish) {
		String sql = "insert into Dish values(?,?,?,?,?,?,?)";
		int dishInsertionStatus = jdbcTemplate.update(sql,newDish.get_dishId(),newDish.get_dishName(),newDish.get_dishDescription(),newDish.get_price(),newDish.get_dishImage(),newDish.get_nature(),0);
		String lastInsertIdSql = "SELECT LAST_INSERT_ID()";
		int dishId =jdbcTemplate.queryForObject(lastInsertIdSql, rowMapper1).get_dishId(); 
		String insertCatDishSql = "INSERT INTO categorydish VALUES (?,?)";
		int insertCatDishStatus = jdbcTemplate.update(insertCatDishSql,newDish.get_categoryId(),dishId);
		
		return insertCatDishStatus;
	}

	// updating a new dish based on dish Id
	public int updateDish(Dish updatedDish, int dishID) {
		String sql = "update Dish set DishName= ? , DishDescription= ? ,DishPrice=?,DishImage= ?,Nature= ? where DishID=? AND isDelete=0"; 
		return jdbcTemplate.update(sql,updatedDish.get_dishName(),updatedDish.get_dishDescription(),updatedDish.get_price(),updatedDish.get_dishImage(),updatedDish.get_dishName(),dishID);
	}

	// performing soft delete
	public int deleteDish(int dishId) {
		// TODO Auto-generated method stub
		String sql = "update dish set isDelete='"+1+"'where DishID='"+dishId+"';";

		return jdbcTemplate.update(sql);
	}

}
