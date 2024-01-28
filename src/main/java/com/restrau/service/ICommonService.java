package com.restrau.service;

import java.util.List;
import java.util.Optional;

import com.restrau.model.Common;
 

public interface ICommonService {

	public List<Common> findAll();

	public Optional<Common> getByDish(int _dishID);

	

}