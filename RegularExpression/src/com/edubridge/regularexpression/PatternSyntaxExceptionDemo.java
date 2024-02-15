package com.edubridge.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternSyntaxExceptionDemo {
	
	static String regex="[";
	static String input="I love Mumbai"+"Also I live in Mumbai";
	
	

	public static void main(String[] args) {
		try {
			Pattern p = Pattern.compile(regex);
			Matcher m=p.matcher(input);
			System.out.println(m.find());
		}
		
		catch(PatternSyntaxException e) {
			System.out.println(e);
			System.out.println("Description: "+e.getDescription());
			System.out.println("Exception at Index: "+e.getIndex());
			System.out.println("Exception pattern: "+e.getPattern());
			System.out.println("Message: "+e.getMessage());
		}
		

	}

}
