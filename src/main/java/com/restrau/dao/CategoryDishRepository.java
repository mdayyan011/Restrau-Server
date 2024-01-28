package com.restrau.dao;

import java.sql.ResultSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.restrau.model.CategoryDish;

//Declaring DishCategoryRepository as Repository using annotation
@Repository
public class CategoryDishRepository {
	
	// autowiring jdbcTemplate
			@Autowired
			private JdbcTemplate jdbcTemplate;
			
			// lambda expression
			private org.springframework.jdbc.core.RowMapper<CategoryDish> rowMapper = (ResultSet rs, int rowNum) ->{
				CategoryDish dishCategory = new CategoryDish();
				dishCategory.set_categoryId(rs.getInt(1));     
				dishCategory.set_dishId(rs.getInt(2));	   
				return dishCategory;	
			}; 

			// get all category by menu Id 
			public List<CategoryDish> getAllCatByMenuId(int categoryId){
				String sql="SELECT * FROM categorydish WHERE \"CategoryID\"=?";
				return jdbcTemplate.query(sql, rowMapper , categoryId);
			}
}
