package com.edubridge.polymorphism;

class Renault{
	String carName;
	String color;
	int noOfSeater;
	float price;
	String engine;
	
	Renault(String carName,String color,int noOfSeater){
		this.carName=carName;
		this.color=color;
		this.noOfSeater=noOfSeater;
		System.out.println(carName+" "+color+" "+noOfSeater);
		
	}
	Renault(String carName,String engine,float price){
		this.carName=carName;
		this.engine=engine;
		this.price=price;
		System.out.println(carName+" "+engine+" "+price);
	
	
	
    }
}

public class ConstructorOverloading {

	public static void main(String[] args) {
		Renault r1= new Renault("RXE","RED",4);
		Renault r2= new Renault("RTE","Fast",4354445f);
		
	}
	
}
		




