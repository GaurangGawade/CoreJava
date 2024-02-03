package com.edubridge.homework;

import java.util.Scanner;

public class SeriesIV {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		float a=0.5f;
		float b=1.5f;
		float c=1f;
		System.out.print(a+" ");
		for(int i=1;i<=n;i++) {
			System.out.print(b+" ");
			c*=3;
			b+=c;
			
			
		}
		

	}

}
