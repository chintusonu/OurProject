package com.corebanking.dao;

import org.hibernate.Session;

import com.corebanking.utility.HibernateUtil;

public class NewAccountRegDAOImpl implements NewAccountRegDAO {

	@Override
	public void saveNewCustomerData() {
		Session session=null;
		//get session
		session = HibernateUtil.getSession();
		//prepare objects
		
		
	}

}
