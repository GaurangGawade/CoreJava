package com.edubridge.operators;

public class IncrementAndDecrementOperatorDemo {

	public static void main(String[] args) {
		int a=6,b=3;
		int x=a++ - ++b;  //
		int y=--a + b--;  //
		System.out.println(a);
		System.out.println(b);

	}

}
