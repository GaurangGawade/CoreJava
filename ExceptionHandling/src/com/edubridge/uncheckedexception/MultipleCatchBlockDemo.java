package com.edubridge.uncheckedexception;

import java.util.Scanner;

public class MultipleCatchBlockDemo {
	
	public static void displayArray(int arr[]){
		try {
			System.out.println(arr[3]);
			
		    }
		
		catch(Exception e) {
			System.out.println(e);
		
			}
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int x=45;
		int y=s.nextInt();
		int arr[]= {10,20,40};
		
		try 
		{
			System.out.println(x/y);
		}
		
		catch(Exception e) 
		{
			System.out.println(e);
		}
		
		MultipleCatchBlockDemo.displayArray(arr);
		s.close();
		
		

	}

}
