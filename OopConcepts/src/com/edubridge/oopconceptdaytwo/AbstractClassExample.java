package com.edubridge.oopconceptdaytwo;

abstract class BankDetail{
	String bankName="Bank Of India";
	String address="Mumbai";
	String accountHolderName="John Smith";
	String emailid="john@gmail.com";
	Long contact=9876574743L;
	void disp() {
		System.out.println("This is Bank Name: "+bankName+"\nAddress: "+address+"\nAccount Holder Name"+accountHolderName+"\nEmail ID: "+emailid+"\nContact"+contact);
		
	}
}

class atm extends BankDetail{
	int pin=1010;
	int amount=10000;
	void disp1() {
		System.out.println("Pin no is "+pin+"\nAmmount "+amount);
	}
	
}

public class AbstractClassExample {

	public static void main(String[] args) {
		atm a1=new atm();
		a1.disp1();
		a1.disp();//hidden data can be extracted through child class

	}

}
