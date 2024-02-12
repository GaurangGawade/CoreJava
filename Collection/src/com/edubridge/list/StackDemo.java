package com.edubridge.list;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<Object>obj=new Stack<>();
		obj.add("Bhubhu");
		obj.add(13);
		obj.add('B');
		obj.add(13.44);
		System.out.println(obj.peek());
		obj.pop();
		System.out.println(obj);
		obj.push(45.78);
		System.out.println(obj);
		
		

	}

}
