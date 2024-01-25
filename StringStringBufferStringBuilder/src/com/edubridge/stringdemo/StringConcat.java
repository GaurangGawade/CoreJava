package com.edubridge.stringdemo;

import java.util.Scanner;

public class StringConcat {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str1=s.next();
		String str2=new String(s.next());
		System.out.println(str1.concat(str2));
		System.out.println(20+30+"Hello"+20+30);
		System.out.println(2+"Yoooo"+23);
		s.close();

	}

}
