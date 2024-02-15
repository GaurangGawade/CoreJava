package com.edubridge.regularexpression;

public class StringSplitDemo {

	public static void main(String[] args) {
			
		String str="Hey, Sakshi, Akshay, Priti";
		String str1[]=str.split(",");
		for(String itr:str1) {
			System.out.print(itr+" ");
		}
		
		String input="There are 4 members in my family";
		String regex="\\d+";
		String res = input.replaceAll(regex, "Four");
		System.out.println(res);
	}

}
