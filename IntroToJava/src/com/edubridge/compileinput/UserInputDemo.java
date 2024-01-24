package com.edubridge.compileinput;
//program to Take User input as String Char & Boolean
import java.util.Scanner;
public class UserInputDemo{

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		char c=s.next().charAt(4);
		boolean b=s.nextBoolean();
		System.out.println(str);
		System.out.println(c);
		System.out.println(b);
		s.close();
	}

}
