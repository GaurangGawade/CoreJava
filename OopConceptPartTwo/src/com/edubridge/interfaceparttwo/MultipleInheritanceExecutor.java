package com.edubridge.interfaceparttwo;

import java.util.Scanner;

public class MultipleInheritanceExecutor {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Boruto b=new Boruto();
		b.power(s.nextInt(),s.next());
		b.powerTwo(s.nextInt(), s.next());
		System.out.println(b.toString());
		s.close();
		

	}

}
