package com.edubridge.polymorphism;

public class MethodOverridingExecutor {

	public static void main(String[] args) {
		GoogleMeet g=new GoogleMeet();
		g.accept("gpay","gpay@gmail.com");
		System.out.println(g instanceof Google);
		
		

	}

}
