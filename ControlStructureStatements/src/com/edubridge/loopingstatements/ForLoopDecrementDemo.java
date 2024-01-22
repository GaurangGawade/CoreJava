package com.edubridge.loopingstatements;

import java.util.Scanner;

public class ForLoopDecrementDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		for (int i=N;i>=1;i--)
		{
			System.out.println("the no. is  "+i);
		}
		s.close();
		

	}

}
