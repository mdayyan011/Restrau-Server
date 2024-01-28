package com.restrau.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restrau.model.Common;
import com.restrau.service.*;

//declaring as a rest controller
@RequestMapping("/api")
@CrossOrigin(origins="http://localhost:4200")
@RestController
public class CommonController {

	
	// autowiring commonService
	@Autowired
	ICommonService commonService;
	
	// to get all list
	@GetMapping("/common")
	List<Common> all()
	{
		System.out.println("Request recived for all");
		return commonService.findAll();
	}
	
	// to get common by id
	@GetMapping("/common/{_dishID}")
	Optional<Common> menuById(@PathVariable int _dishID)
	{
		System.out.println("Request recived for menuById");
		return commonService.getByDish(_dishID);	
	}
	
	
 
}