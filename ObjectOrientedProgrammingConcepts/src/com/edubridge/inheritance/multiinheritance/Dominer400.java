package com.edubridge.inheritance.multiinheritance;

public class Dominer400 extends Pulser220{
	
	public int speed;
	public int price;
	
	
	public Dominer400(int speed,int price) {
		super(speed,price);
		this.speed=speed;
		this.price=price;
		super.speed=160;
		super.price=120000;
	}

	@Override
	public String toString() {
		return "Dominer400 [speed=" + speed + ", price=" + price + ", toString()=" + super.toString() + "]";
	}
	
	
	

	void display(){
		super.display();
		System.out.println("This is Dominer 400cc");
	}

}
