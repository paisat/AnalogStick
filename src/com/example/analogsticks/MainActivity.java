package com.example.analogsticks;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		TextView x=(TextView)findViewById(R.id.x);
		TextView y=(TextView)findViewById(R.id.y);
		
		RelativeLayout rl = (RelativeLayout) findViewById(R.id.main);
	        rl.addView(new AnalogStick(this,x,y));
		
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
