package com.edubridge.interfacedemo;

public interface Cafe {
	
	//All field inside interface are by default public static final
	String food="";
	int price=0;
	
	//methods inside interface are by default public abstract
	void showMenu(String food);
	void displayPrice(int price);

}
