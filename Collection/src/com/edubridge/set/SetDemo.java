package com.edubridge.set;

import java.util.*;

public class SetDemo {

	public static void main(String[] args) {
		Set<String>obj=new HashSet<>();//Unordered Set
		obj.add("Abhishek");
		obj.add("Durvesh");
		obj.add("Neeraj");
		obj.add("Gaurang");
		System.out.println(obj);
		
		Set<String>obj1=new LinkedHashSet<>();//Insertion ordered Set
		obj1.add("Abhishek");
		obj1.add("Durvesh");
		obj1.add("Neeraj");
		obj1.add("Gaurang");
		System.out.println(obj1);
		
		Set<String>obj2=new TreeSet<>();//Alphabetical Ordered Set
		obj2.add("Abhishek");
		obj2.add("Durvesh");
		obj2.add("Neeraj");
		obj2.add("Gaurang");
		System.out.println(obj2);
		
		

	}

}
