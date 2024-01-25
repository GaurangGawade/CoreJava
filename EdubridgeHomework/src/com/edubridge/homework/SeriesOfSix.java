package com.edubridge.homework;

import java.util.Scanner;

public class SeriesOfSix {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int res=6;
		for(int i=0;i<n;i++)
		{ 
			 
			res+=5*i;
			System.out.print(res+"  ");
			 
		}
		s.close();

	}

}
