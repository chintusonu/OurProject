package com.corebanking.dao;

import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.corebanking.domain.NewAccountRegBO;

@Repository
public class NewAccountRegDAOImpl implements NewAccountRegDAO {
	@Autowired
	private HibernateTemplate ht;

	@Override
	public int saveNewCustomerData(NewAccountRegBO bo) {
		Transaction tx = null;
		int id = 0;
      try{
		tx = ht.getSessionFactory().getCurrentSession().beginTransaction();
		id = (Integer) ht.save(bo);
		tx.commit();
		return id;
      }catch (Exception e) {
		tx.rollback();
	}
	return id;
	}

}
