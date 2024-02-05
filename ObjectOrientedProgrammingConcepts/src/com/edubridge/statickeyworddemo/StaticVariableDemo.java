package com.edubridge.statickeyworddemo;

public class StaticVariableDemo {
	//Static keyword with variable name
	/*1. When any var name is non-static and
	 * we are trying to access that variable
	 * inside the main method, then we will
	 * get error, so that we have to use
	 * static keyword with var name*/
	static float a=10.45f;

	public static void main(String[] args) {
		System.out.println(a);

	}

}
