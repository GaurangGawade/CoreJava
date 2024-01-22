package com.edubridge.loopingstatements;

import java.util.Scanner;

public class ForLoopIncrementDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		for (int i=1;i<=N;i++)
		{
			System.out.println("the no. is  "+i);
		}
		s.close();
		

	}

}
