package org.hj001.service;

import java.util.List;

import javax.annotation.Resource;

import org.hj001.dao.EmployeeDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EmployeeService {
	@Resource
	private EmployeeDao ed;
	
	public List<?> select(String hql){
		return ed.select(hql);
		
	}
	
	
	
}
