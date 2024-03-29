package com.restrau.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.restrau.exception.NullException;
import com.restrau.exception.ResourceNotFound;
import com.restrau.model.User;
import com.restrau.service.IUserService;

//declaring it as rest controller
//@CrossOrigin(origins="*",allowedHeaders = { "GET", "POST", "PUT", "DELETE" }, methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT,RequestMethod.DELETE })
//@CrossOrigin(origins = "*", allowedHeaders = { "Authorization", "Content-Type" }, methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE })
@CrossOrigin(origins = "https://restrau-delite.onrender.com", allowedHeaders = { "Authorization", "Content-Type" }, methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE })

@RequestMapping("/api")
@RestController
public class UserController {
	
	// autowiring with the service
	@Autowired
	IUserService userService;
	
	// authenticating 
	@PostMapping("/authUser")
	public boolean checkUser(@RequestBody User user) throws ResourceNotFound, NullException { 
		System.out.println("Request recived for checkUser");
		return userService.checkUser(user);
	}
}
