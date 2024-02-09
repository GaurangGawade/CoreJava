package com.edubridge.uncheckedexception;

import java.io.IOException;
import java.util.Scanner;

public class ThrowKeywordsDemos {
	
	public static void donate(int age,int weight) throws IOException {
		if(age>18 && weight>45)
			System.out.println("Eligible to"+"Donate the blood");
		else
			//throw keyword is used to throw an exception explicitly(In red line)
			throw new IOException("Not Eligible");
	}

	public static void main(String[] args) throws IOException{
			Scanner s=new Scanner(System.in);
			ThrowKeywordsDemos t=new ThrowKeywordsDemos();
			try {
				//Gives exception in blue line
				t.donate(s.nextInt(),s.nextInt());
			}
			catch(IOException e) {
				System.out.println(e);
			}
			s.close();
			
			

	}

}
