package com.edubridge.abstractquestion;

public class Motorcycle extends Vehicle {

	@Override
	void startEngine() {
		System.out.println("Motorcycle engine has started");
		
	}

	@Override
	void stopEngine() {
		System.out.println("Motorcycle engine has stopped");
		
	}

}
