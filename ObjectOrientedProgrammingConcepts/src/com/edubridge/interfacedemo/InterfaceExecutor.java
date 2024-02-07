package com.edubridge.interfacedemo;

public class InterfaceExecutor {

	public static void main(String[] args) {
		//Cannot create a object for an interface
		TheVibe t=new TheVibe();
		t.showMenu("Pizza");
		t.displayPrice(230);
	}

}
