package com.restrau.dao;

import java.sql.ResultSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.restrau.model.Category;
import com.restrau.model.MenuCategory;

//declaring MenuCategoryRespository as Repository using annotation 
@Repository
public class MenuCategoryRespository {

		// autowiring jdbcTemplate
		@Autowired
		private JdbcTemplate jdbcTemplate;
		
		// lambda expression
		private org.springframework.jdbc.core.RowMapper<MenuCategory> rowMapper = (ResultSet rs, int rowNum) ->{
			MenuCategory menuCategory = new MenuCategory();
			menuCategory.set_menuId(rs.getInt(1));	   
			menuCategory.set_categoryId(rs.getInt(2));  
			menuCategory.set_displayOrder(rs.getInt(3));  
			return menuCategory;	
		}; 

		// fetching category id by menu id
		public List<MenuCategory> getAllCatByMenuId(int menuId){
			String sql="SELECT * FROM menucategory WHERE MenuID=?";
			return jdbcTemplate.query(sql, rowMapper , menuId);
		}

		
		
}

