package com.edubridge.interfacedemo;

public class TheVibe implements Cafe {

	@Override
	public void showMenu(String food) {
		System.out.println("Menu is: "+food);
		
	}

	@Override
	public void displayPrice(int price) {
		System.out.println("The price for "+food+" is "+price);
		
	}
	
	

}
