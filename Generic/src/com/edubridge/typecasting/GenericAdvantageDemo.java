package com.edubridge.typecasting;

import java.util.ArrayList;
import java.util.List;

public class GenericAdvantageDemo {

	public static void main(String[] args) {
		//1. Type-Safety
		List<Integer>obj1=new ArrayList<>();
		obj1.add(12);
		
		//2. Compile Time-Checking
		//obj1.add("12");
		System.out.println(obj1);
		
		//3. With generic, Types-casting is not required
		List<String>obj2=new ArrayList<>();
		obj2.add("Durvesh");
		obj2.add("Gaurang");
		String str1 =obj2.get(0);	
		System.out.println(str1);
		
		//Without Generic, Type-casting is required
		//String str3=(String) obj2.get(0);
		
		
		
		
		
		

	}

}
