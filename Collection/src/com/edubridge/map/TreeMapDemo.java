package com.edubridge.map;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		SortedMap<String,Float>obj=new TreeMap<>();
		obj.put("Gaurang",78.8f);
		obj.put("Gauri",83.12f);
		obj.put("Gauresh",54.56f);
		for(Map.Entry<String,Float> itr : obj.entrySet())
		{
			System.out.println(itr.getKey()+" "+itr.getValue());
		}
		
		
		

	}

}
