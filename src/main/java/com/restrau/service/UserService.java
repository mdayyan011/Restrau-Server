package com.restrau.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restrau.dao.UserRepository;
import com.restrau.exception.NullException;
import com.restrau.exception.ResourceNotFound;
import com.restrau.model.User;

@Service
public class UserService implements IUserService{

	// autowiring categoryRepository
	@Autowired
	UserRepository userRepository;
	
	@Override
	public boolean checkUser(User user) throws ResourceNotFound,NullException{ 
		User correctCreds = userRepository.getUserCredentials(user); 
 
		if(correctCreds==null)
			return false;
		if(user.getUser_password().equals(correctCreds.getUser_password()))
		return true;
		return false;
	}	

}
