package com.restrau.dao;

import java.util.List;
import java.util.Optional;
import java.sql.ResultSet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.restrau.model.Menu;

//declaring MenuRepository as Repository using annotation
@Repository
public class MenuRepository {
	
	// autowiring jdbcTemplate
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	// lambda expression
	private org.springframework.jdbc.core.RowMapper<Menu> rowMapper = (ResultSet rs, int rowNum) ->{
	Menu menu = new Menu();
	menu.set_menuId(rs.getInt(1));
	menu.set_menuName(rs.getString(2));
	menu.set_menuDescription(rs.getString(3));
	menu.set_menuImage(rs.getString(4));
	return menu;
	};
 
 
  
	// fetching all menus from menu_master table
	public List<Menu> getAllMenus() { 
	return jdbcTemplate.query("select * from Menu", rowMapper);
	}
	
	// fetching details of a particular menu by menu Id 
	public Menu getMenuByMenuId(int menuId){
		String sql = "SELECT * FROM Menu WHERE \"MenuID\"= ? ";
		return jdbcTemplate.queryForObject(sql , rowMapper , menuId );
	}
	
	// inserting a new menu to menu_master table using parametrized query 
	public int saveMenu(Menu newMenu) {
		String sql = "insert into Menu(\"MenuName\",\"MenuDescription\",\"MenuImage\") values(?,?,?)";
		System.out.println("newMenu.get_menuName( "+newMenu.get_menuName());
		System.out.println("newMenu.get_menuId( "+newMenu.get_menuId());
//		return jdbcTemplate.update(sql,newMenu.get_menuId(),newMenu.get_menuName(),newMenu.get_menuDescription(),newMenu.get_menuImage());
		return jdbcTemplate.update(sql,newMenu.get_menuName(),newMenu.get_menuDescription(),newMenu.get_menuImage());
	}

	// updating a menu based on menu Id
	public int updatMenu(Menu menu, int menuId) {
	    String sql = "UPDATE Menu SET \"MenuName\" = ?, \"MenuDescription\" = ?, \"MenuImage\" = ? WHERE \"MenuID\" = ?";
	    return jdbcTemplate.update(sql, menu.get_menuName(), menu.get_menuDescription(), menu.get_menuImage(), menuId);
	}

	
}
