package com.edubridge.polymorphism;

public class GoogleMeet extends Google{
	String appName;
	String email;
	
	public void accept(String appName,String email) {
		super.accept("Google","google@gmail.com");
		System.out.println(appName+" "+email);

		}
}
