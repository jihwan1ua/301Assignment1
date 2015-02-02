package com.example.travelexpensetracker;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class ApproveClaimActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_approve_claim);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.approve_claim, menu);
		return true;
	}

}
