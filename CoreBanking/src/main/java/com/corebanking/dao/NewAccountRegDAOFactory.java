package com.corebanking.dao;

import com.corebanking.dao.NewAccountRegDAOImpl;

public class NewAccountRegDAOFactory {

	public static NewAccountRegDAO getInstance() {
		return new NewAccountRegDAOImpl();
	}
}
