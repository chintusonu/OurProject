package com.corebanking.util;

import java.io.Serializable;
import java.util.Random;

public class CustomPwdNetBanking implements Serializable{

	public static int genPass(){
		int pwd=0;
		Random random=null;
		
		random=new Random();
		pwd=random.nextInt(999999);
		
		return pwd;
	}

}
