package com.edubridge.list;

import java.util.List;
import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<String>obj=new ArrayList<>();
		obj.add("Gaurang");
		obj.add("Durvesh");
		obj.add("Abhishek");
		System.out.println(obj);
		List<Object>obj1=new ArrayList<>();
		obj1.add("Gaurang");
		obj1.add(8004);
		obj1.add(78.45);
		System.out.println(obj1);
		obj1.remove(2);
		List<Object>obj2=new ArrayList<>();
		obj2.addAll(obj1);
		System.out.println(obj2);
		//For Extracting Elements From List we use looping concept
		for(String i:obj) {
			System.out.print(i+" ");
		}
		
		
		
		
		

	}

}
