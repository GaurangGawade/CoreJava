package com.edubridge.finaldemo;

public class FinalExecutor {

	public static void main(String[] args) {
		Passport p=new Passport();
		p.setCardName("Debit Card");
		p.setDateOfExpiry("30/09/2027");
		System.out.println(p);
		p.accept(20);
		//x=30; cannot in initialize again
		p.accept(40);
		
		

	}

}
