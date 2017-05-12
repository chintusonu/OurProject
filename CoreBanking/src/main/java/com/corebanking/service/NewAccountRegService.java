package com.corebanking.service;

import com.corebanking.dto.NewAccountRegDTO;
import com.corebanking.dto.NewOnlineAccountDTO;

public interface NewAccountRegService {
	public String register(NewAccountRegDTO dto);
	public String registerOnlineAccount(NewOnlineAccountDTO dto);
	
}
