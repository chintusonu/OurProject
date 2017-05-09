package com.corebanking.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.corebanking.dao.NewAccountRegDAO;
import com.corebanking.domain.NewAccountRegBO;
import com.corebanking.dto.NewAccountRegDTO;
@Service
public class NewAccountRegServiceImpl implements NewAccountRegService{
	@Autowired
private NewAccountRegDAO dao;
	
	@Override
	public String register(NewAccountRegDTO dto) {
		NewAccountRegBO bo=null;
    //convert DTO Object to Bo object
		BeanUtils.copyProperties(dto, bo);
		//use dao
		int id=0;
		id=dao.saveNewCustomerData(bo);
			return "Employee Registered with "+id;
	}

}
