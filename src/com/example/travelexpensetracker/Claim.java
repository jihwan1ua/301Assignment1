package com.example.travelexpensetracker;

import java.util.ArrayList;
import java.util.Date;

public class Claim {
	// claim_status will be either submitted, returned, or approved
	private String claim_status;
	// item will be the ArrayList of Strings in order of [date, price]
	private ArrayList<String> item;
	// item will be the date for the claim not for the date of each items
	protected Date claim_date;
	
	
	// I'll assume the claim first start from the submitted
	
	// get the date of the claim
	public Date get_date()
	{
		return claim_date;
	}
	
	// set the date of the claim
	public void set_date(Date date)
	{
		// change the date of the claim only if the claim is not approved
		if (claim_status == "returned" || claim_status == "submitted")
		{
			this.claim_date = date;
		}
	}
	
	// Return current claim_status
	public String get_status()
	{
		return claim_status;
	}
		
	// Return the item
	public ArrayList<String> get_item()
	{
		return item;
	}
	
	// this is for editing item, set item only if the claim status is returned or submitted
	public void set_item(ArrayList<String> item)
	{
		// if the claim is returned or submitted, they can be edited
		if (claim_status == "returned" || claim_status == "submitted")
			{
				this.item = item;
			}
	}
	
	// This is for editing the date of an item that has already been created 
	public void set_date(String date)
	{
		// if the claim is not approved
		if (claim_status == "returned" || claim_status == "submitted")
		{
			item.add(0, date);
		}
	}
	
	// This is the method for changing the claim status into submitted, approved, etc
	// default value of the claim is submitted
	public void set_status(String status)
	{
		// if the claim is not approved then update the status
		if (claim_status != "approved")
		{
			this.claim_status = status;
		}
	}
		
}
