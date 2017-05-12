package com.corebanking.dao;

import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.corebanking.domain.NetBankingBO;

@Component
public class NetBankingDAOImpl implements NetBankingDAO {
	@Autowired
	private HibernateTemplate ht;
	
	@Override
	public Long insertNet(NetBankingBO bo) {
		Long res=0l;
		Transaction tx=ht.getSessionFactory().getCurrentSession().beginTransaction();
		res=(Long) ht.save(bo);
		ht.flush();
		tx.commit();
		return res;
	}

}
