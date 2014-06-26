package ru.imato.android.plus_one;

import java.util.Date;

public class Event {
	
	private String name;
	private int count;
	private int id;
	private Date date;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	public Event (String name, int id){
		this.name = name;
		this.id = id;
		this.date = new Date();
		this.count = 0;
	}
	
	public void add(){
		count++;
	}
	
	public void sub(){
		count--;
	}

}
