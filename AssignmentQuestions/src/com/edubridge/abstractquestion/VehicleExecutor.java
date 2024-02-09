package com.edubridge.abstractquestion;

public class VehicleExecutor {

	public static void main(String[] args) {
		Car c=new Car();
		Motorcycle m=new Motorcycle();
		c.startEngine();
		c.stopEngine();
		m.startEngine();
		m.stopEngine();

	}

}
