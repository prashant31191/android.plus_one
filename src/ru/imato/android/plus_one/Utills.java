package ru.imato.android.plus_one;

import java.util.Calendar;

public class Utills {
	
	public static int dataTimeToInt(Calendar c){
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH);
		int day = c.get(Calendar.DAY_OF_MONTH);
		int hour = c.get(Calendar.HOUR);
		
		return hour+day*100+month*10000+year*1000000;
	}
	
	public static String dataTimeToStr(Calendar c){
	
		return String.valueOf(dataTimeToInt(c));
	}
	

}
