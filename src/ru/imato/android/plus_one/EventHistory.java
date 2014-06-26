package ru.imato.android.plus_one;

import java.util.Calendar;
import java.util.Hashtable;

public class EventHistory {
	
	private Hashtable<String, Integer> history;

	public EventHistory() {
		history = new Hashtable<String, Integer>();
		
	}
	
	public void put(){
		Calendar c = Calendar.getInstance();
		String date = Utills.dataTimeToStr(c);
		Integer count = history.get(date);
		if (count == null)
			history.put(date, Integer.valueOf(1));
		else 
			history.put(date, Integer.valueOf(count.intValue()+1));
	}
	
	
	public void delete(){
		Calendar c = Calendar.getInstance();
		String date = Utills.dataTimeToStr(c);
		Integer count = history.get(date);
		if (count != null)
			if (count.intValue()>1)
				history.put(date, Integer.valueOf(count.intValue()-1));
			else 
				history.remove(date);
	}
	
}
