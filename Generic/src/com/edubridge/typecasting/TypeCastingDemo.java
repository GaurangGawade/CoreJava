package com.edubridge.typecasting;

public class TypeCastingDemo {

	public static void main(String[] args) {
		//Implicit or widening TypeCasting 
		char c='A';
		int num=c;
		System.out.println(num);
		
		//Explicit or narrowing TypeCasting
		int num1=122;
		char b= (char)num1;
		System.out.println(b);
		

	}

}
