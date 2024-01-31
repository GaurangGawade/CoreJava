package com.edubgridge.oopconcepts;
class shape1{
	void disp4() {
		System.out.println("This is Shape");
	}
}
class circle1 extends shape1{
	void disp3() {
		System.out.println("This is a Circlular shape");
	}
}
class rectangle1 extends shape1{
	void disp2() {
		System.out.println("This is a Rectangular shape");
	}
}
class square1 extends rectangle1{
	void disp1() {
		System.out.println("Square is a Rectangle");
	}
}

public class TestFour {

	public static void main(String[] args) {
		square1 obj=new square1();
		obj.disp1();
		obj.disp2();
		obj.disp4();
		circle1 obj2=new circle1();
		obj2.disp3();
		obj2.disp4();

		
	}

}
