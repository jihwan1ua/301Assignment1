/*
 Travel Expense Tracker: CMPUT 301 Assignment university of alberta, app tracks the expenses of user during travel duration
 
 Copyright (C) 2015 Ji Hwan Kim. jihwan@ualberta.ca

 This program is free software: you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by
 the Free Software Foundation, either version 3 of the License, or
 (at your option) any later version.

 This program is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package com.example.travelexpensetracker;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainClaimActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_claim);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_claim, menu);
		return true;
	}
	
	// https://www.youtube.com/watch?v=YGgOHSVyA64. 2015-02-02
	public void onClick(View v)
	{
		TextView tv = (TextView)findViewById(R.id.StartDescription);
		tv.setText("Press Menu on the right upper conner to see Claim menu");
		
	}
	
	// StudentPicker by Dr. Abram Hindle CMPUT301. 2015-02-02
	public void claim_list(MenuItem menu)
	{
		Toast.makeText(this, "Claim List", Toast.LENGTH_SHORT).show();
		Intent intent = new Intent(MainClaimActivity.this, ClaimListActivity.class);
		startActivity(intent);
	}
	
}
