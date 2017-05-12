package com.corebanking.dao;

import com.corebanking.domain.NewAccountRegBO;
import com.corebanking.domain.NewOnlineAccountBO;

public interface NewAccountRegDAO {

	public Long saveNewCustomerData(NewAccountRegBO bo);
	public Long insertNewCustomer(NewOnlineAccountBO bo);
}
