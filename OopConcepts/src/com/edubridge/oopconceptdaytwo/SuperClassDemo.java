package com.edubridge.oopconceptdaytwo;
class All{
	int x=100;
}
class Ball extends All{
	int x=200;
	void show(){
		System.out.println(super.x);
	}
}
public class SuperClassDemo {

	public static void main(String[] args) {
		Ball b1=new Ball();
		System.out.println(b1.x);
		b1.show();

	}

}
