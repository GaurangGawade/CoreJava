package com.edubridge.homework;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		float x=s.nextFloat();
		char y=s.next().charAt(0);
		System.out.printf("%.2f",x);
		System.out.printf("\n%c is %d\n",y,(int)y);
		s.close();
		

	}

}
