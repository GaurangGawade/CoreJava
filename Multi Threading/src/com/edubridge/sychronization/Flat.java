package com.edubridge.sychronization;

public class Flat {
	
	public void print(int num) {
		
		synchronized(this) {
		for(int i=1;i<=5;i++) {
			System.out.println(num*i);
			try {
				Thread.sleep(1000);
				} 
			catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
											}
								}
							}
		
	}

}
