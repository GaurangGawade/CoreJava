package com.edubridge.abstractclassdemo;

import java.util.Scanner;

public class AbstractClassExecutor {

	public static void main(String[] args) {
		ISRO i=new ISRO();
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the input");
		i.display(s.next(), s.nextLong());
		
		System.out.println(i.display1());
		i.display();
		i.display("NASA", 999999000);
		
	}

}
