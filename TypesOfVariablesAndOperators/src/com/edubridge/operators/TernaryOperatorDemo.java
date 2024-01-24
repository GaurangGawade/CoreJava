package com.edubridge.operators;

import java.util.Scanner;

public class TernaryOperatorDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		String x=(a%2==0)?"Even":"Odd";
		System.out.println(x);
		s.close();
		
		
		

	}

}
