package com.edubridge.classandobjectdemo;
/*write a program to print area of rectangle by creating a class name rectangle with a method name area 
which returns area and length and breadth passed as parameters to its constructor.*/
class Rectangle
{
	int length;//instance variables
	int breadth;
	
	Rectangle(int l,int b)//Parameterized constructor
	{
		length=l;
		breadth=b;
		
	}
	Rectangle()//Non Parameterized constructor
	{
		System.out.println("This is Non Parameterized");
	}
	void areaPerimeter()
	{
		
		System.out.println("Area is "+length*breadth);
		System.out.println("Perimter is "+2*(length+breadth));
	}
	
}

public class AreaProblemUsingConstructors {

	public static void main(String[] args) {
		Rectangle r=new Rectangle();//Object of Non Parameterized Constructor
		Rectangle r1=new Rectangle(4,5);//Object of Parameterized Constructor because we are passing values
		Rectangle r2=new Rectangle(5,8);
		r1.areaPerimeter();
		r2.areaPerimeter();
		
	}

}
