package com.example.countbackday;


import android.os.Bundle;
import android.app.ActionBar;

import android.support.v4.app.FragmentActivity;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends FragmentActivity {
	
	private MenuItem mMenuCreate;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
		final ActionBar actionBar = getActionBar();
		actionBar.setDisplayShowTitleEnabled(true);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		mMenuCreate = menu.getItem(0);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		TaskCreateFragment tcf = new TaskCreateFragment();
		tcf.show(getSupportFragmentManager(), "");
		
		return super.onOptionsItemSelected(item);
	}

	public void showTimePickerDialog(View v) {
	}

}
