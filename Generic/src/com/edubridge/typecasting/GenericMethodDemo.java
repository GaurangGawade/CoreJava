package com.edubridge.typecasting;

public class GenericMethodDemo {
	
	public static <E> void accept (E arr[]) {
		for(E itr:arr) {
			System.out.print(itr+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Integer[] arr1= {11,22,33};
		String[] arr2= {"Shiv","Mina","Sonu"};
		GenericMethodDemo.accept(arr1);
		GenericMethodDemo.accept(arr2);
		
		

	}

}
