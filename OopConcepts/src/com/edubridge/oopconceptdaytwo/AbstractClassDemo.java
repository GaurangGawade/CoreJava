package com.edubridge.oopconceptdaytwo;

abstract class Orders{
	void show() {
		System.out.println("this is an abstract class");
	}
}

class Demo extends Orders{
	
}


public class AbstractClassDemo {

	public static void main(String[] args) {
		//Orders d1=new Orders();  Cannot create a object of abstract class
		Demo o1=new Demo();
		o1.show();

	}

}
