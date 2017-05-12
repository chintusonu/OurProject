package com.corebanking.util;

import java.io.Serializable;
import java.util.Random;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.id.IdentifierGenerator;

public class CustomPwdNetBanking implements IdentifierGenerator {

	@Override
	public Serializable generate(SessionImplementor session, Object obj) throws HibernateException {
		int pwd=0;
		Random random=null;
		
		random=new Random();
		pwd=random.nextInt(999999);
		
		return pwd;
	}

}
