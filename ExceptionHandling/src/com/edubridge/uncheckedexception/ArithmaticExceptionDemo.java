package com.edubridge.uncheckedexception;

import java.util.Scanner;

public class ArithmaticExceptionDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int x=15;
		int y = s.nextInt();
		
		try 
		{
			
			System.out.println(x/y);
			//System.exit(0);
		}
		
		catch(Exception e) 
		{
			System.out.println("Exception is "+e);
			//System.exit(0);//Finally Block does not get executed
			
		}
		
		finally {
			System.exit(0);
			System.out.println("Finally");
		}
		
		s.close();
		

	}

}
