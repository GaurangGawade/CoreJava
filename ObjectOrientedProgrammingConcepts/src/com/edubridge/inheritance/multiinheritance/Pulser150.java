package com.edubridge.inheritance.multiinheritance;

public class Pulser150 {
	
	public int speed;
	public int price;
	
	public Pulser150(int speed,int price) {
		super();
		this.speed=speed;
		this.price=price;
		
		
	}

	@Override
	public String toString() {
		return "Pulser150 [speed=" + speed + ", price=" + price + "]";
	}
	
	void display() {
		
		System.out.println("This is Pulser 150cc");
	}
	
	

	

}
