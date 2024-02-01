package com.edubridge.oopconceptdaytwo;
class Account{
	void deposite() {
		int amount =1000;
		System.out.println("Rs Amount Deposited is "+amount);
		
	}
	void Info() {
		this.deposite();
	}
}

public class AccountDemo {

	public static void main(String[] args) {
		Account a1=new Account();
		a1.Info();

	}

}
