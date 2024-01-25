package com.edubridge.stringdemo;

public class StringExample {

	public static void main(String[] args) {
		//By using String literal
		String str1="Edubridge";
	    String str2="Edubridge";
	    //By using New String Keyword
	    String str3=new String("Edubridge");
	    String str4=new String("Edubridge");
	    String str5=new String("edubridge");
	    
	    System.out.println(str1==str2);
	    System.out.println(str1==str3);
	    System.out.println(str3==str4);
	    //Using equals method (Only Checks Content)
	    System.out.println(str1.equals(str4));
	    System.out.println(str1.equals(str5));
	}

}
