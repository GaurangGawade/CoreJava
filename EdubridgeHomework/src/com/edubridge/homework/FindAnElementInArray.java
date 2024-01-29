package com.edubridge.homework;

import java.util.Scanner;

public class FindAnElementInArray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Size of Array");
		int n=s.nextInt();
		int arr[]=new int[n];
		int flag=0;
		System.out.println("Enter the Element");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]= s.nextInt();
		}
		System.out.println("Element to find");
		int y=s.nextInt();
		for(int i=0;i<n;i++)
		{
			if(arr[i]==y)
				flag=1;
			
			
		}
		if(flag==1)
		{
			System.out.println("The number "+y+" is found");
		}
		else
			System.out.println("Number Not Found");
		s.close();
		

	}

}
