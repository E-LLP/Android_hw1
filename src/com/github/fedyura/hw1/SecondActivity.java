package com.github.fedyura.hw1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

public class SecondActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		
		Intent intent = getIntent();
	    String message = intent.getStringExtra(MainActivity.MSG_TO_SECOND_ACTIVITY);
	    
	    TextView TViewLeft = (TextView) findViewById(R.id.SPTextView1);
	    TextView TViewRight = (TextView) findViewById(R.id.SPTextView2);
	    TViewLeft.setText(message);
	    TViewRight.setText(message);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.second, menu);
		return true;
	}

}
