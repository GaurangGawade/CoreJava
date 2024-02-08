package com.edubridge.interfaceparttwo;

public class Boruto implements Naruto,Hinata{

	@Override
	public void powerTwo(int noOfChildren, String clan) {
		System.out.println(noOfChildren+" "+clan);
		
	}

	@Override
	public void power(int noOfChildren, String position) {
		System.out.println(noOfChildren+" "+position);
		
		
	}

	
	
	
	

}
