package com.edubgridge.oopconcepts;

class Shape{
	void Draw() {
		System.out.println("Draw the Shape");
	}
	
}

class Rectangle extends Shape{
	void RecArea(int l,int b) {
		System.out.println(l*b);
	}
}

class Square extends Rectangle{
	void SqArea(int s){
		System.out.println(s*s);
	}
}



public class MultiInheritanceDemo {

	public static void main(String[] args) {
		Square s1=new Square();
		s1.SqArea(10);
		s1.RecArea(5, 6);
		s1.Draw();

	}

}
