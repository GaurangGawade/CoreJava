package com.edubridge.runtime;

import java.util.Scanner;

//Program to demonstrate on multidimensional array
public class MultiDimensionalArrayDemo {

	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
		 int n=s.nextInt();
		 int m=s.nextInt();
		 //2d array declaration
		 int arr[][]=new int[m][n];
		 for(int i=0;i<m;i++)
		 {
			 for(int j=0;j<n;j++)
			 {
				  arr[i][j]=s.nextInt();
			 }
		 }
		 for(int i=0;i<m;i++)
		 {
			 for(int j=0;j<n;j++)
			 {
				 System.out.print(arr[i][j]+"  ");
			 }
			 System.out.println();
		 }
		 s.close();

	}

}
