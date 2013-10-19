package com.github.fedyura.hw1;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import android.view.View;

public class ForthActivity extends FragmentActivity
	implements ForthPageDialog.EditMessageDialogListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_forth);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.forth, menu);
		return true;
	}
	
	public void openDialog(View view) {
	    // Do something in response to button
		DialogFragment dialog = new ForthPageDialog();
        dialog.show(getSupportFragmentManager(), "ForthPageDialogFragment");
	}
	
	@Override
    public void onDialogPositiveClick(DialogFragment dialog) {
        // User touched the dialog's positive button
    }

    @Override
    public void onDialogNegativeClick(DialogFragment dialog) {
        // User touched the dialog's negative button
        
    }
}
