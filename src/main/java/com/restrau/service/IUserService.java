package com.restrau.service;
 

import com.restrau.exception.NullException;
import com.restrau.exception.ResourceNotFound;
import com.restrau.model.User;

public interface IUserService {

	public boolean checkUser(User user) throws ResourceNotFound,NullException;
}
