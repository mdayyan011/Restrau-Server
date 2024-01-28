package com.restrau.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.restrau.model.Category;
import com.restrau.model.MenuCategoryCommon;

import java.sql.ResultSet;
import java.util.List;
import java.util.Optional;

// Declaring CategoryRepository as Repository using annotation
@Repository
public class CategoryRepository {
	
	// autowiring jdbcTemplate 
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	// lambda expression

	private org.springframework.jdbc.core.RowMapper<Category> rowMapper = (ResultSet rs, int rowNum)->{
		Category category = new Category();
		category.set_categoryId(rs.getInt(1));
		category.set_categoryName(rs.getString(2));
		category.set_categoryDescription(rs.getString(3));
		category.set_categoryImage(rs.getString(4));
		return category;
	};
	
	
	private org.springframework.jdbc.core.RowMapper<Category> rowMapper1 = (ResultSet rs, int rowNum)->{
		Category category = new Category();
		category.set_categoryId(rs.getInt(1));
		return category;
	};
	
	// fetching all categories from category_master table
	public List<Category> getAllCategories(){
		return jdbcTemplate.query("SELECT * FROM category", rowMapper);
	}
	
	// fetching details of particular category by category Id
	public Category findbyId(int id) {
		String sql="SELECT * FROM category WHERE categoryID=?";
		return jdbcTemplate.queryForObject(sql, rowMapper, id);
	}
	
	// inserting a new category to category_master table using parametrized query
	public int saveCategory(MenuCategoryCommon category) {
		String queryCategory="insert into category values(?,?,?,?)";
		int catergoryInsertionStatus = jdbcTemplate.update(queryCategory,category.get_categoryId(),category.get_categoryName(),category.get_categoryDescription(),category.get_categoryImage());
		String lastIdSql = "SELECT LAST_INSERT_ID()";
		Category categoryRes = (Category) jdbcTemplate.queryForObject(lastIdSql,rowMapper1);
		int categoryId = categoryRes.get_categoryId();
		String insertMenuCatSql = "INSERT INTO \"menucategory\" VALUES (?,?,?)";
		int menuCategoryInsertionStatus = jdbcTemplate.update(insertMenuCatSql,category.get_menuId(),categoryId,0);
		 
		return menuCategoryInsertionStatus;
	}
	
	// updating a category based on category Id
	public int updateCategory(Category pm, int id) {
	    return jdbcTemplate.update("UPDATE Category SET \"categoryNAME\"='" + pm.get_categoryName() +
	            "', \"categoryDESCRIPTION\"='" + pm.get_categoryDescription() +
	            "', \"categoryIMAGE\"='" + pm.get_categoryImage() +
	            "' WHERE \"categoryID\"='" + id + "'");
	}

}
