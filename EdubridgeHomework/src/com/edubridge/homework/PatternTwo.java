package com.edubridge.homework;

import java.util.Scanner;

public class PatternTwo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n =s.nextInt();
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.printf((i+j+2)%2+" ");
			}
			System.out.println();
		}
		s.close();
		

	}

}
