package com.example.travelexpensetracker;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class ClaimListActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.claim_lists);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.claim_list, menu);
		return true;
	}
	
	// StudentPicker by Dr. Abram Hindle CMPUT301. 2015-02-02	
	// this is the option for user to go into different claim options
	// i.e. creating claim, editing claim, deleting claim, submitting, approving, returning
	
	// for creating claim
	public void create_claim(MenuItem menu)
	{
		Toast.makeText(this, "CreateClaim", Toast.LENGTH_SHORT).show();
		Intent intent = new Intent(ClaimListActivity.this, CreateClaimActivity.class);
		startActivity(intent);
	}
	
	// for edit and deleting claim
	public void edit_delete_claim(MenuItem menu)
	{
		Toast.makeText(this, "Edit Delete Claim", Toast.LENGTH_SHORT).show();
		Intent intent = new Intent(ClaimListActivity.this, EditDeleteClaimActivity.class);
		startActivity(intent);
	}
	
	// for submitting and returning claim
	public void submit_return_claim(MenuItem menu)
	{
		Toast.makeText(this, "Submit Return Claim", Toast.LENGTH_SHORT).show();
		Intent intent = new Intent(ClaimListActivity.this, SubmitReturnClaimActivity.class);
		startActivity(intent);
	}
	
	// for approving claim, after this step the claim can no longer be edited
	public void approve_claim(MenuItem menu)
	{
		Toast.makeText(this, "Approve Claim", Toast.LENGTH_SHORT).show();
		Intent intent = new Intent(ClaimListActivity.this, ApproveClaimActivity.class);
		startActivity(intent);
	}
		
}
