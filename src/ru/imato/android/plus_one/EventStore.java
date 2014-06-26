package ru.imato.android.plus_one;

import java.util.ArrayList;

public class EventStore {

	private static ArrayList<Event> events;
	private static int lastId = 0;
	
	public static Event getEvent(int id){
		
		loadEvents();
		Event event = null;
		for (Event e : events) {
			if (e.getId() == id)
				event = e;
		}
		
		return event;
	}
	
	public static Event getEvent(String name){
		
		loadEvents();
		Event event = null;
		for (Event e : events) {
			if (e.getName() == name)
				event = e;
		}
		
		return event;
	}
	
	private static void loadEvents(){
		
		if (events == null){
			events = Db.getEvents(0, 10, Db.ORDER_DATE);
		}
	}
	
	private static void saveEvents(){
			Db.saveEvent(events);
	}
	
	public void addEvent(String name){
		Event e = new Event(name, lastId++);
		events.add(e);
		saveEvents();
	}
	
	public static void addCount(int eventId){
		Event e = getEvent(eventId);
		e.add();
		saveEvents();
	}
	
	public static void subCount(int eventId){
		Event e = getEvent(eventId);
		e.sub();
		saveEvents();
	}
	
	public static ArrayList<Event> getEvents(){
		return events;
	}
	
	@Override
	protected void finalize() throws Throwable {
		saveEvents();
		super.finalize();
	}
}
