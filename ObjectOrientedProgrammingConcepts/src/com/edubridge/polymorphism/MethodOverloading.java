package com.edubridge.polymorphism;

class Stock{
	
	String shareName;
	long sharePrice;
	String ShareType;
	
	public static void  displayStockDetails(String shareName,long sharePrice){
		System.out.println(shareName+" "+sharePrice);
		
	}
	
	public static void displayStockDetails(String shareName,String shareType){
		System.out.println(shareName+" "+shareType);
		
	}
	
}
public class MethodOverloading {

	public static void main(String[] args) {
		Stock.displayStockDetails("Tesla",4000);
		Stock.displayStockDetails("TATA", "IntraDay");
		

	}

}
