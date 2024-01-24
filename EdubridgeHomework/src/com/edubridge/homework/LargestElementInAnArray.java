package com.edubridge.homework;

import java.util.Scanner;

public class LargestElementInAnArray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		int max = arr[0];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}System.out.println(max);
		
		s.close();
		
		

	}

}
