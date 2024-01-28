	package com.restrau.service;
	
	import java.util.List;
	import java.util.Optional;
	
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;
	
	import com.restrau.dao.CommonRepository;
	import com.restrau.model.Common;
	
	@Service
	public class CommonService implements ICommonService {
		@Autowired
		CommonRepository commonRepository;
		public CommonService() { 
		}
		@Override
		public List<Common> findAll() { 
			return commonRepository.getAll();
		}
		@Override
		public Optional<Common> getByDish(int _dishID) { 
			return commonRepository.findbyId(_dishID);
		}
	
		
	
	}