package com.edubridge.thiskeyworddemo;


public class ThisKeywordDemoTwo {
	
	void printOne( ThisKeywordDemoTwo obj) {
		System.out.println("Welcome To "+"Edubridge");
	}
	
	void printTwo() {
		printOne(this);
	}
	public static void main(String[] args) {
		ThisKeywordDemoTwo obj=new ThisKeywordDemoTwo();
		obj.printTwo();
		
	}

}
