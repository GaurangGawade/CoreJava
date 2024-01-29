package com.edubridge.stringbuilderdemo;

public class StringBuilderDemo {

	public static void main(String[] args) {
		StringBuilder a=new StringBuilder("Gaurang");
		System.out.println(a);
		System.out.println(a.capacity());
		System.out.println(a.append(" Gawade"));
		System.out.println(a.capacity());//capacity does not change after append
		System.out.println(a.length());//length changes after append
		System.out.println(a.capacity()-a.length());

	}

}
