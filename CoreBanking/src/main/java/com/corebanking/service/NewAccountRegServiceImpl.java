package com.corebanking.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.corebanking.dao.NewAccountRegDAO;
import com.corebanking.domain.NewAccountRegBO;
import com.corebanking.domain.NewOnlineAccountBO;
import com.corebanking.dto.NewAccountRegDTO;
import com.corebanking.dto.NewOnlineAccountDTO;

@Service
public class NewAccountRegServiceImpl implements NewAccountRegService{
	
	@Autowired
	private NewAccountRegDAO dao;
	
	@Override
	public String register(NewAccountRegDTO dto) {
		NewAccountRegBO bo=null;
		
		//convert DTO Object to Bo object
		bo=new NewAccountRegBO();
		BeanUtils.copyProperties(dto, bo);
		
		//use dao
		Long id=0l;
		id=dao.saveNewCustomerData(bo);
		
		if(id>0)
			return "Your Information Registered SuccessFully.. With Account Number  "+id;
		else
			return "Registration Failed";
	}

	@Override
	public String registerOnlineAccount(NewOnlineAccountDTO dto) {
	NewOnlineAccountBO bo=null;
		
		//convert DTO Object to Bo object
		bo=new NewOnlineAccountBO();
		BeanUtils.copyProperties(dto, bo);
		
		//use dao
		Long id=0l;
		id=dao.insertNewCustomer(bo);
		return null;
	}
}
