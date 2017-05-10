package com.corebanking.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.corebanking.dao.NewAccountRegDAO;
import com.corebanking.domain.NewAccountAddrsBO;
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
		bo=new NewAccountRegBO();
		BeanUtils.copyProperties(dto, bo);
		
		//use dao
		Long id=0l;
		//NewAccountAddrsBO addbo=new NewAccountAddrsBO();
		//bo.setADDRS(bo.getADDRS());
		//System.out.println(bo.getADDRS());
		id=dao.saveNewCustomerData(bo);
		
		if(id>0)
			return "Your Information Registered SuccessFully.. With Account Number  "+id+"--"+bo.getADDRS();
		else
			return "Registration Failed";
	}
}
