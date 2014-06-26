package ru.imato.android.plus_one;

import java.util.Calendar;

public class Utills {
	
	public static int dateTimeToInt(Calendar c){
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH);
		int day = c.get(Calendar.DAY_OF_MONTH);
		int hour = c.get(Calendar.HOUR_OF_DAY);
		
		return hour+day*100+month*10000+year*1000000;
	}
	
	public static String dataTimeToStr(Calendar c){
	
		return String.valueOf(dateTimeToInt(c));
	}
	
	public static Calendar intToDateTime(int i){
		
		int year = i/1000000;
		int month = (i - year*1000000)/10000;
		int day = (i - year*1000000 - month*10000)/100;
		int hour = i%100;
		
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, year);
		c.set(Calendar.MONTH, month);
		c.set(Calendar.DAY_OF_MONTH, day);
		c.set(Calendar.HOUR_OF_DAY, hour);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);
		c.set(Calendar.MILLISECOND, 0);
		
		return c;
		
	}

}
