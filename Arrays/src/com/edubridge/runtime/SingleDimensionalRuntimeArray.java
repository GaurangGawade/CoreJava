package com.edubridge.runtime;

import java.util.Scanner;

public class SingleDimensionalRuntimeArray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		//Array declaration
		int arr[]=new int[n];
		//To initialize an array element
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.println("Array element are:");
		//to print an array element
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
        s.close();
	}

}
