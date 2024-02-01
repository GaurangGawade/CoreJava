package com.edubridge.oopconceptdaytwo;
class A{
	A(){
		System.out.println("This is Default Constructor");
	}
	
	A(int x){
		this();//Instance of Class
		System.out.println(x);
	}
	A(int x,int y){
		this(10);
		System.out.println(x+" "+y);
	}
}

public class DefaultConstructor {

	public static void main(String[] args) {
		A x=new A(100,200);

	}

}
