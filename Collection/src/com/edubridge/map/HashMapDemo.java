package com.edubridge.map;

import java.util.*;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<Integer,String>obj=new HashMap<>();
		obj.put(4,"Durvesh");
		obj.put(1,"Neeraj");
		obj.put(10,"Abhishek");
		obj.put(2,"Gaurang");
		System.out.println(obj);
		obj.remove(1);
		System.out.println(obj);
		

	}

}
