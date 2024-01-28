package com.restrau.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.sql.ResultSet;
import java.util.List;
import java.util.Optional;

import com.restrau.model.Common;
@Repository
public class CommonRepository {
	
	// autowiring jdbcTemplate
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	// lambda expression
	private org.springframework.jdbc.core.RowMapper<Common> rowMapper = (ResultSet rs, int rowNum) ->{
		Common common = new Common();
		common.set_menuName(rs.getString(1));
		common.set_categoryName(rs.getString(2));
		common.set_dishName(rs.getString(3));
		common.set_dishImage(rs.getString(4));
		common.set_dishPrice(rs.getDouble(5));
		common.set_dishNature(rs.getString(6));
		common.set_dishDescription(rs.getString(7));
		return common;	
	};
	
	 

    // list of Common
    public List<Common> getAll() {
        return jdbcTemplate.query("SELECT m.\"MenuName\", c.\"CategoryName\", d.\"DishName\", d.\"DishImage\", d.\"DishPrice\", d.\"Nature\", d.\"DishDescription\"\r\n"
                + "FROM Menu m\r\n"
                + "JOIN MenuCategory mc ON m.\"MenuID\" = mc.\"MenuID\"\r\n"
                + "JOIN Category c ON mc.\"CategoryID\" = c.\"CategoryID\"\r\n"
                + "JOIN CategoryDish cd ON c.\"CategoryID\" = cd.\"CategoryID\"\r\n"
                + "JOIN Dish d ON cd.\"DishID\" = d.\"DishID\"\r\n"
                + "GROUP BY m.\"MenuName\", c.\"CategoryName\", d.\"DishName\", d.\"DishImage\", d.\"DishPrice\", d.\"Nature\", d.\"DishDescription\"\r\n"
                + "ORDER BY m.\"MenuName\", c.\"CategoryName\", d.\"DishName\";", rowMapper);
    }

    public Optional<Common> findbyId(int _dishID) {
        String sql = "SELECT m.\"MenuName\", c.\"CategoryName\", d.\"DishName\", d.\"DishImage\", d.\"DishPrice\", d.\"Nature\", d.\"DishDescription\" " +
                "FROM Menu m " +
                "JOIN MenuCategory mc ON m.\"MenuID\" = mc.\"MenuID\" " +
                "JOIN Category c ON mc.\"CategoryID\" = c.\"CategoryID\" " +
                "JOIN CategoryDish cd ON c.\"CategoryID\" = cd.\"CategoryID\" " +
                "JOIN Dish d ON cd.\"DishID\" = d.\"DishID\" " +
                "GROUP BY m.\"MenuName\", c.\"CategoryName\", d.\"DishName\", d.\"DishImage\", d.\"DishPrice\", d.\"Nature\", d.\"DishDescription\"";

        return jdbcTemplate.query(sql, rowMapper).stream().findFirst();
    }
}
