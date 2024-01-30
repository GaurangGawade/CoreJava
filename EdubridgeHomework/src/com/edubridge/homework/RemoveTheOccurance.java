package com.edubridge.homework;

import java.util.Scanner;

public class RemoveTheOccurance {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		System.out.println(str.replaceAll("The", ""));
		s.close();

	}

}
