package com.restrau.dao;

import java.sql.ResultSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.restrau.exception.NullException;
import com.restrau.exception.ResourceNotFound;
import com.restrau.model.Menu;
import com.restrau.model.User;

//declaring UserRepository as Repository using annotation
@Repository
public class UserRepository {
	
	// autowiring jdbcTemplate
		@Autowired
		private JdbcTemplate jdbcTemplate;
		
		// lambda expression
		private org.springframework.jdbc.core.RowMapper<User> rowMapper = (ResultSet rs, int rowNum) ->{
		User user = new User();
		user.setUser_password(rs.getString(1)); 
		return user;
		};
		
		// fetching user Details from user_master table
		public User getUserCredentials(User user) {  
			try {
		String sql ="select user_password from \"user\" where user_email=? and is_admin='1'"; 
		return jdbcTemplate.queryForObject(sql, rowMapper,user.getUser_email());
			}
			catch(Exception e ) {
				e.printStackTrace();
			}
			return null;	
		}
		
}
