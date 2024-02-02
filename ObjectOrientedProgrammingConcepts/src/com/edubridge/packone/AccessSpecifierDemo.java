package com.edubridge.packone;

public class AccessSpecifierDemo {

	private int atm_pinNo;//private variable
	public String emailId;// public variable
	float percentage;//Default Variable
	
	private void displayPinNo()//Private Method
	{
		System.out.println(atm_pinNo);
	}
	
	public void displayemailId()//Private Method
	{
		System.out.println(emailId);
	}
	
	void displayPercentage()
	{
		System.out.println(percentage);
	}
	

}
