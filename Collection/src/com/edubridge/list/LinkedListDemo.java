package com.edubridge.list;
import java.util.LinkedList;
import java.util.List;
public class LinkedListDemo {
	public static void main(String[] args) {
		List<Integer>obj=new LinkedList<>();
		obj.add(9);
		obj.add(10);
		obj.add(12);
		System.out.println("List is: "+obj);
		obj.add(2, 11);
		System.out.println(obj);
		System.out.println(obj.contains(13));
		obj.remove(2);
		System.out.println(obj);
		//For extracting element from list 
		for(Integer i:obj) {
			System.out.print(i+" ");
		}
		
	}

}
