package com.edubridge.statickeyworddemo;


public class StaticBlockExecutor {
	int x=10;
	static String str;
	
	static {
		str="This is a static block";
	}
	
	static void print() {
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		StaticBlockExecutor.print();
		StaticBlockExecutor.str="Printing Outside Static block";
		StaticBlockExecutor.print();

	}

}
