package ru.imato.android.plus_one;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends Activity implements OnClickListener, OnItemClickListener{

	private static final String LOG_ID = "Plus one log";
	
	private EventStore eventStore;
	private ListView listView;
	private ArrayAdapter<Event> adapter;
	private ArrayList<Event> events;
	private Button btAddEvent;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//Log.i(LOG_ID, "Test utils: " + Utills.dataTimeToStr(Calendar.getInstance()));
		
		eventStore = new EventStore();
		events = eventStore.getEvents();
		listView = (ListView) findViewById(R.id.listView1);
		adapter = new ArrayAdapter<Event>(this, android.R.layout.simple_list_item_1, events);
		listView.setAdapter(adapter);		
		listView.setOnItemClickListener(this);
		btAddEvent = (Button) findViewById(R.id.btAddEvent);
		btAddEvent.setOnClickListener(this);		

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		
		switch (v.getId()) {
		case R.id.btAddEvent:
			
			
			
			break;

		}
		
	}

	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		// TODO Auto-generated method stub
		
	}

	private class EventAdapter extends ArrayAdapter<Event>{
		
		public EventAdapter(ArrayList<Event> events){
			super (getApplicationContext(), 0, events);
		}
		
		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			
		}
	}
	
}
