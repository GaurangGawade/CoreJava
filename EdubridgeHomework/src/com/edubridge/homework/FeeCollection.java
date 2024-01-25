package com.edubridge.homework;

import java.util.Scanner;

public class FeeCollection {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		double feeamount=0;
		System.out.println("Enter Student Type");
		String st= s.next();
		System.out.println("Enter Tuition Fee");
		float tf=s.nextFloat();
		System.out.println("Enter Bus Fee");
		float bf=s.nextFloat();
		System.out.println("Enter Hostel Fee");
		float hf=s.nextFloat();
		
		switch(st)
		{
		case"MSDS":
			feeamount=tf+bf;
			System.out.printf("Total Fee Amount Will Be: %.2f",feeamount);
			break;
		case"MSH":
			feeamount=tf+hf;
			System.out.printf("Total Fee Amount Will Be: %.2f",feeamount);
			break;
		case"MGSDS":
			feeamount=1.5*tf+bf;
			System.out.printf("Total Fee Amount Will Be: %.2f",feeamount);
			break;
		case"MGSH":
			feeamount=1.5*tf+hf;
			System.out.printf("Total Fee Amount Will Be: %.2f",feeamount);
		default:
			System.out.print("Invalid Student type");
		}
		
       s.close();
	}

}
