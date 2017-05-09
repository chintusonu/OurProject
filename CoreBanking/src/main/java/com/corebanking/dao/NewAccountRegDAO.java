package com.corebanking.dao;

import com.corebanking.domain.NewAccountRegBO;

public interface NewAccountRegDAO {
	//save CustomerDetails
	public int saveNewCustomerData(NewAccountRegBO bo);
}
