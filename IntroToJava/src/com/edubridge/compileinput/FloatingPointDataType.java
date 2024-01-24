package com.edubridge.compileinput;
//program to demonstrate User Input in Float,
import java.util.Scanner;
public class FloatingPointDataType {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		float x=s.nextFloat();
		double y=s.nextDouble();
		
		
		System.out.println(x);
		System.out.println(y);
		s.close();
	}

}
