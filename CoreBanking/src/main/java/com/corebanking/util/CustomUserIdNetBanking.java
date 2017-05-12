package com.corebanking.util;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.id.IdentifierGenerator;

public class CustomUserIdNetBanking implements IdentifierGenerator {


	public int generateCustId() {
        Random random = new Random();
        return random.nextInt(100);
    }
	
	@Override
	public Serializable generate(SessionImplementor arg0, Object arg1) throws HibernateException {
		
		
		 Date date = new Date();
         	
	        Calendar calendar = Calendar.getInstance();
	        return "SBI_" + this.generateCustId() + "_" + calendar.get(Calendar.YEAR);
		
	}

}
