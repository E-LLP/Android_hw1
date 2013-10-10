package com.github.fedyura.hw1;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends FragmentActivity
	implements EditMessageDialogFragment.EditMessageDialogListener {

	public final static String MSG_TO_SECOND_ACTIVITY = "com.github.fedyura.hw1.MSG_TO_SECOND_ACTIVITY";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	@Override
	public void onSaveInstanceState(Bundle savedInstanceState) {
	  super.onSaveInstanceState(savedInstanceState);
	  // Save UI state changes to the savedInstanceState.
	  // This bundle will be passed to onCreate if the process is
	  // killed and restarted.
	  //savedInstanceState.putS
	  /*savedInstanceState.putBoolean("MyBoolean", true);
	  savedInstanceState.putDouble("myDouble", 1.9);
	  savedInstanceState.putInt("MyInt", 1);
	  savedInstanceState.putString("MyString", "Welcome back to Android");*/
	  // etc.
	}
	
	public void openDialog(View view) {
	    // Do something in response to button
		DialogFragment dialog = new EditMessageDialogFragment();
        dialog.show(getSupportFragmentManager(), "EditMessageDialogFragment");
	}
	
	// The dialog fragment receives a reference to this Activity through the
    // Fragment.onAttach() callback, which it uses to call the following methods
    // defined by the NoticeDialogFragment.NoticeDialogListener interface
    @Override
    public void onDialogPositiveClick(DialogFragment dialog) {
        // User touched the dialog's positive button
        //  dialog.getString(RESULT_OK);
    	//this.findViewById(android.R.id.edit   MPeditText);
    	EditText edText = (EditText) findViewById(R.id.MPeditText);
    	edText.setText(EditMessageDialogFragment.DialogMsg);
    }

    @Override
    public void onDialogNegativeClick(DialogFragment dialog) {
        // User touched the dialog's negative button
        
    }
    
    public void StartSecondActivity(View view) {
    	
    	Intent intent = new Intent(this, SecondActivity.class);
    	EditText editText = (EditText) findViewById(R.id.MPeditText);
        String message = editText.getText().toString();
        intent.putExtra(MSG_TO_SECOND_ACTIVITY, message);
        startActivity(intent);
    	
    }
    

}
