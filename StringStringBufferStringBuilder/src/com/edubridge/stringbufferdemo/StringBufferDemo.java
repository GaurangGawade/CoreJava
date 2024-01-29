package com.edubridge.stringbufferdemo;

import java.util.Scanner;

public class StringBufferDemo {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int z=scan.nextInt();
		StringBuffer a=new StringBuffer(z);
		StringBuffer b=new StringBuffer("Gaurang");
		String c="Reyna"; //Capacity Method is not allowed for String
		StringBuffer sc=new StringBuffer(c.length());
		StringBuffer x= new StringBuffer("Internet Of Things");
		StringBuffer y= new StringBuffer("Jeva");
		y.setCharAt(1,'a');
		
		
		
		
		
		
		
		//print statement
		System.out.println(a.capacity());
		System.out.println(b.length());
		System.out.println(b.capacity());
		System.out.println(sc.capacity());
		System.out.println(x.length());
		System.out.println(x.capacity());
		System.out.println(x.capacity()-x.length());
		System.out.println(b.append(" Gawade"));
		System.out.println(y);
		scan.close();
		
		
		

	}

}
