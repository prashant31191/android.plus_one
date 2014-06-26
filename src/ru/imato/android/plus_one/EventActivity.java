package ru.imato.android.plus_one;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;

public class EventActivity extends Activity {
	
	EditText etName, etCount;
	Event event;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_event);
		
		etName = (EditText) findViewById(R.id.etName);
		etCount = (EditText) findViewById(R.id.etCount);
		
		
		
	}
}
