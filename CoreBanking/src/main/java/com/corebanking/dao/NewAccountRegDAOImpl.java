package com.corebanking.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.corebanking.domain.NewAccountAddrsBO;
import com.corebanking.domain.NewAccountRegBO;

@Transactional(readOnly=false,propagation=Propagation.REQUIRES_NEW)
@Repository
public class NewAccountRegDAOImpl implements NewAccountRegDAO {
	@Autowired
	private HibernateTemplate ht;

	@Override
	public Long saveNewCustomerData(NewAccountRegBO bo) {
		Transaction tx = null;
		Long id = 0l;
		
			tx = ht.getSessionFactory().getCurrentSession().beginTransaction();
			/*NewAccountAddrsBO addrs=new NewAccountAddrsBO();
			addrs.setADDRESS("10,HYD");
			addrs.setADDRESS_TYPE("Resident");
			addrs.setCITY("CTC");
			addrs.setMOBILE_NO(7859548685l);
			addrs.setPIN(785496);
			addrs.setSTATE("Odisha");
			
			List<NewAccountAddrsBO> list=new ArrayList<NewAccountAddrsBO>();
			list.add(addrs);
			bo.setADDRS(list);*/
			id=(Long) ht.save(bo);
			ht.flush();
			tx.commit();
	
			 
		System.out.println(id);
		return id;
	}
}
