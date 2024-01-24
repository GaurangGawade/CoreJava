package com.edubridge.compileinput;
import java.util.Scanner;
//program to demonstrate of Integral(byte,short,long,int)
public class IntergerDataTypeDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        byte num=s.nextByte();
        short a=s.nextShort();
        long b=s.nextLong();
        int c=s.nextInt();
		System.out.println("The byte num value is"+num);
		System.out.println("The short num value is"+a);
		System.out.println("The long num value is"+b);
		System.out.println("The integer num value is"+c);
		s.close();
	}

}

