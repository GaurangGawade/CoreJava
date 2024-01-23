package com.edubridge.compiletimearray;

import java.util.Scanner;

public class CompileTimeArray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n =s.nextInt();
		char[] arr= {'z','s','H','Z'};
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+"\n");
		}
       System.out.println("array of the given index is  "+arr[n]);
       s.close();
	}

}
