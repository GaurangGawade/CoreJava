package com.edubridge.thiskeyworddemo;

public class ThisKeywordDemoThree {
	
	static int x; 
	
	ThisKeywordDemoThree(){
		this(10);
		System.out.println("Non - parameterized");
	}
	
	ThisKeywordDemoThree(int x){	
		
		System.out.println("Parameterized");
	}

	public static void main(String[] args) {
		ThisKeywordDemoThree obj=new ThisKeywordDemoThree();
	}

}
