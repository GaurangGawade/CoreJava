package com.edubridge.uncheckedexception;

import java.util.Scanner;

public class CatchBlockDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int x=45;
		int y=s.nextInt();
		int arr[]= {10,20,40};
		try //Parent try block
		{
			
			System.out.println(x/y);
		}
			
		
		catch(Exception e) //Parent catch block
		{
			
			System.out.println(e);
			
			try //Child try block
			{
				System.out.println(arr[3]);
			}
			
			catch (ArithmeticException | ArrayIndexOutOfBoundsException e1) //Child catch block
			{
				System.out.println(e1);
			}
		}
			
		finally
		{
			System.out.println("It is always executed");
		}
		s.close();
		
	}
}


