package com.edubridge.homework;

import java.util.Scanner;

public class PatternThree {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
	    while(i<=n*2)
	    {
	    	int j=i;
	    	while(j<=n*2)
	    	{
	    		System.out.print(j+" ");
	    		j+=2;
	    	}
	    	
	    	System.out.println();
	    	i+=2;
	    }
	    s.close();

	}

}
