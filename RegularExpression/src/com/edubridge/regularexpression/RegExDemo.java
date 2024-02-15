package com.edubridge.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo {

	public static void main(String[] args) {
		String input ="TV Price is 500 Rs";
		@SuppressWarnings("unused")
		String regex="(.*)(\\d+)(.*)";
		String regex1=".*s";
		
		Pattern p=Pattern.compile(regex1);
		Matcher m=p.matcher(input);
		Boolean b=m.matches();
		System.out.println(b);
		
	}

}
