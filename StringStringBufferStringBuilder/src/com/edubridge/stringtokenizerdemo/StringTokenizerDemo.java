package com.edubridge.stringtokenizerdemo;

import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {
		StringTokenizer t=new StringTokenizer(""+"Hey there m using whatsapp");
		System.out.println(t.countTokens());
		System.out.println(t.nextToken());//Hey
		while(t.hasMoreTokens())
		{
			System.out.println(t.nextToken());// there m using whatsapp
		}
		StringTokenizer a=new StringTokenizer("");
		a=new StringTokenizer("Edu-Bridge-India","-",true);
		while(a.hasMoreTokens())
		{
			System.out.println(a.nextToken());
		}

	}

}
