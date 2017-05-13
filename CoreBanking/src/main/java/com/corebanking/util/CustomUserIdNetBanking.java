package com.corebanking.util;

import java.util.Calendar;
import java.util.Random;

public class CustomUserIdNetBanking{

	public static String generateUserId(){
		
		Random random = new Random();
		int no= random.nextInt(100);

		Calendar calendar = Calendar.getInstance();
		return "sbi_" +no+ "_" + calendar.get(Calendar.YEAR);
	}
}
