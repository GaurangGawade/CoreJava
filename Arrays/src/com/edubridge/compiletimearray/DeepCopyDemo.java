package com.edubridge.compiletimearray;
//Program to demonstrate on deep copy
public class DeepCopyDemo {

	public static void main(String[] args) {
		int arr1[]= {2,11,34,54,12};
		int arr2[]= arr1.clone();
		for(int i =0;i<arr2.length;i++)
		{
			System.out.print(arr2[i]+"  ");
		}

	}

}
