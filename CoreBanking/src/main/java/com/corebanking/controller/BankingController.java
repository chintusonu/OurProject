package com.corebanking.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.corebanking.command.NetBankingCommand;
import com.corebanking.domain.NetBankingBO;
import com.corebanking.domain.NewAccountAddrsBO;
import com.corebanking.domain.NewAccountRegBO;
import com.corebanking.domain.NewAccountRegModel;
import com.corebanking.dto.NetBankingDTO;
import com.corebanking.dto.NewAccountRegDTO;
import com.corebanking.service.NetBankingService;
import com.corebanking.service.NewAccountRegService;
import com.corebanking.util.CustomPwdNetBanking;
import com.corebanking.util.CustomUserIdNetBanking;

@Controller
public class BankingController {

	@Autowired
	private NewAccountRegService service;

	@Autowired
	private NetBankingService netService;

	@RequestMapping(value = "getRegForm.htm")
	public String showNewRegistrationForm() {
		return "new_account_reg";
	}

	@RequestMapping(value = "/newregister.htm", method = RequestMethod.POST)
	public String submitRegistrationForm(Map<String, Object> map,
			@ModelAttribute("accountRegBO") NewAccountRegModel accountRegModel) {
		String result = null;
		NewAccountRegDTO dto = null;
		
		NewAccountRegBO accountRegBO = new NewAccountRegBO();
		BeanUtils.copyProperties(accountRegModel, accountRegBO);
		
		List<NewAccountAddrsBO> list = new ArrayList<NewAccountAddrsBO>();
		list.add(accountRegModel.getTempAddress());
		list.add(accountRegModel.getPermanentAddress());

		accountRegBO.setADDRS(list);

		// convert bo to dto
		dto = new NewAccountRegDTO();
		BeanUtils.copyProperties(accountRegBO, dto);

		// use service
		result = service.register(dto);
		map.put("Result", result);
		return "result";
	}

	@RequestMapping(value = "/getNetForm.htm")
	public ModelAndView showNetBankingForm(ModelMap model) {
		NetBankingCommand command = new NetBankingCommand();
		command.setBRANCH_CODE("SBIN0005");
		model.addAttribute("netCmd", command);
		ModelAndView modelAndView = new ModelAndView("net_banking");
		return modelAndView;
	}

	@RequestMapping(value = "/netBanking.htm", method = RequestMethod.POST)
	public String submitNetBankingForm(Map<String, Object> map, @ModelAttribute("netBanking") NetBankingBO bankingBO) {
		String result = null;
		NetBankingDTO dto = null;

		bankingBO.setUSER_ID(CustomUserIdNetBanking.generateUserId());
		bankingBO.setPASSWORD(CustomPwdNetBanking.genPass() + "");
		// convert bo to dto
		dto = new NetBankingDTO();
		BeanUtils.copyProperties(bankingBO, dto);

		// use service
		result = netService.registerNetBanking(dto);

		map.put("Result", result);
		return "result";

	}
}