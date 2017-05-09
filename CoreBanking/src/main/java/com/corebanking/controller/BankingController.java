package com.corebanking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BankingController {
	
	@RequestMapping(value="getRegForm.htm")
	public String getNewRegistrationForm(){
		return "newAccRegForm";
	}
	
	
}
