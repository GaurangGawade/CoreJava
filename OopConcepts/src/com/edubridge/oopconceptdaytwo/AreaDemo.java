package com.edubridge.oopconceptdaytwo;

import java.util.Scanner;

class Area{
	int length;
	int breadth;
	
	public Area(int l,int b) {
		length=l;
		breadth=b;
		
	}
	
	public int getArea() {
		return length*breadth;
	}
}

public class AreaDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Length");
		int l=s.nextInt();
		System.out.println("Enter Breadth");
		int b=s.nextInt();
		Area a=new Area(l,b);
		System.out.println(a.getArea());
		
		
		

	}

}
