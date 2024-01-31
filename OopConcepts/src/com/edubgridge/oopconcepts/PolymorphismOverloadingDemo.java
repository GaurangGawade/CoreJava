package com.edubgridge.oopconcepts;
class Calculation{
	void add(int a,int b) {
		System.out.println(a+b);
	}
	void add(String a,String b) {
		System.out.println(a+b);
		
	}
	void add(int a,int b,int c) {
		System.out.println(a+b+c);
	}
}

public class PolymorphismOverloadingDemo {

	public static void main(String[] args) {
		Calculation c=new Calculation();
		c.add(5, 7);
		c.add("Hello","World");
		c.add(5, 3, 7);

	}

}
