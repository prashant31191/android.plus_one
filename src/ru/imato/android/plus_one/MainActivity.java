package ru.imato.android.plus_one;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends Activity implements OnClickListener{

	private static final String LOG_ID = "Plus one log";
	
	private EventStore eventStore;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//Log.i(LOG_ID, "Test utils: " + Utills.dataTimeToStr(Calendar.getInstance()));
		
		eventStore = new EventStore();

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

}
