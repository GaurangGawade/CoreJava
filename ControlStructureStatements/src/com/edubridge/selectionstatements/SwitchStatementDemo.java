package com.edubridge.selectionstatements;

import java.util.Scanner;

public class SwitchStatementDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int map_no=s.nextInt();
		switch(map_no) {
		case 1:
			System.out.println("Welcome to Haven");
			break;
		case 2:
			System.out.println("Welcome to Icebox");
			break;
		case 3:
			System.out.println("Welcome to Accent");
			break;
		case 4:
			System.out.println("Welcome to Breeze");
			break;
		default:
			System.out.println("Invalid map .no");
		}
		s.close();
		

	}

}
