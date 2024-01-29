package com.edubridge.homework;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String a=s.next();
		for(int i=a.length();i>0;i--)
		{
			System.out.print(a.charAt(i-1));
		}
		s.close();

	}

}
