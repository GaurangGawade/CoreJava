package com.edubridge.inheritance.multiinheritance;

public class Pulser220 extends Pulser150 {
	
	public int speed;
	public int price;
	
	public Pulser220(int speed,int price) {
		super(speed,price);
		this.speed=speed;
		this.price=price;
		
		super.speed=110;
		super.price=70000;
		
	}

	@Override
	public String toString() {
		return "Pulser220 [speed=" + speed + ", price=" + price + ", toString()=" + super.toString() + "]";
	}
	
	

	void display() {
		super.display();
		System.out.println("This is Pulser 220cc");
	}

}
