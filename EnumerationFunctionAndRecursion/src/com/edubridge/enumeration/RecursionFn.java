package com.edubridge.enumeration;

public class RecursionFn {
	
	 public static int fact(int n)
	{
		if(n<=1)
		{
			return 1;
		}
		else {
			return n*fact(n-1);
		}
	}

	public static void main(String[] args) {
		int n=5;
		System.out.println("Factorial is"+fact(n));
		
	}
	
		
	

}
