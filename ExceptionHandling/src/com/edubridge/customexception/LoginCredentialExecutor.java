package com.edubridge.customexception;

import java.util.Scanner;

public class LoginCredentialExecutor {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String emailID=s.nextLine();
		String password=s.nextLine();
		
		try 
		{
			
			if(emailID.equals("john@gmail.com") && password.equals("abc@123"))
				System.out.println("Login Successfully");
			
			else
				throw new LoginCredentials("Invalid Email or Password");
		}
				
		
				catch(LoginCredentials e) 
				{
					System.out.println(e);
				}
				
		
	}

}
