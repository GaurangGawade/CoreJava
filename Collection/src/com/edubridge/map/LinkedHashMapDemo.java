package com.edubridge.map;

import java.util.*;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		Map<Character,Object>obj=new LinkedHashMap<>();
		obj.put('G', 8004);
		obj.put('D',"Durvesh");
		obj.put('a',705.67);
		obj.put('g', false);
		System.out.println(obj);
		
		System.out.println(obj);
		
		//For extracting from hash table
		for(Map.Entry<Character, Object> itr : obj.entrySet())
		{
			System.out.println(itr.getKey()+" "+itr.getValue());
		}
		
		

	}

}
