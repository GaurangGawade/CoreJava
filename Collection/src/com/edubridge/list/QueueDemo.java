package com.edubridge.list;
import java.util.Queue;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
public class QueueDemo {

	public static void main(String[] args) {
		Queue<Integer>obj=new PriorityQueue<>();
		obj.add(10);
		obj.add(5);
		obj.add(14);
		obj.add(2);
		System.out.println(obj);
		for(int i:obj) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		Deque<Integer>obj1=new LinkedList<>();
		obj1.addFirst(1);//
		obj1.add(5);
		obj1.add(14);
		obj1.addLast(21);
		System.out.println(obj1);
		System.out.println(obj1.peekLast());
		obj1.removeAll(obj1);//Removes every element from object
		System.out.println(obj1);
		obj1.poll();
		/* Does not give a exception error 
		if we are trying to remove element from empty queue*/
		
	}

}
