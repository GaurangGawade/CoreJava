package com.edubridge.stringdemo;

import java.util.Arrays;

public class StringMethodDemo {

	public static void main(String[] args) {
		String str1="John Cena";
		String str2="   WWE Champion   ";
		System.out.println(str1.length());
		char[] arr=new char[9];
		str1.getChars(0, 9, arr, 0);
		System.out.println(Arrays.toString(arr));
		System.out.println(str1.compareTo("john Cena"));
		System.out.println(str1.compareTo("johN cenA"));
		System.out.println(str1.compareTo("John Cena"));
		System.out.println(str1.compareToIgnoreCase("JoHn CeNA"));
		System.out.println(str1.isEmpty());//checks Whether string is empty
		System.out.println(str1.charAt(5));//Shows the Character at that index
		System.out.println(str1.startsWith("Jo"));//checks Starting letters of string
		System.out.println(str1.toUpperCase());//converts to upper case
		System.out.println(str1.toLowerCase());//Converts to lower case
		System.out.println(str2.trim()); //Clear Empty Spaces from start and end
		
		
	}

}
