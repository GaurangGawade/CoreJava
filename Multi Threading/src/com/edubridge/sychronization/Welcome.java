package com.edubridge.sychronization;

public class Welcome {
	
	//Static Synchronization
	synchronized static void display(String str) {

		for(int i=0;i<=3;i++) {
			System.out.println("Welcome to Edubridge!");
			System.out.println(str);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				System.out.println(e);
			}
		}
	}

}
