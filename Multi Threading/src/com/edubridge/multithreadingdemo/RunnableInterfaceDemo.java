package com.edubridge.multithreadingdemo;

public class RunnableInterfaceDemo implements Runnable{

	public static void main(String[] args) {
		RunnableInterfaceDemo r=new RunnableInterfaceDemo();
		Thread t1=new Thread(r);
		try {
			Thread.sleep(2000);
		} 
		
		catch (InterruptedException e) {
			System.out.println(e);
		}
		t1.start();
		
	
	}

	@Override
	public void run() {
		
		for(int i=0;i<5;i++) {
		System.out.println("Thread "+i+" is in a running");
		
		}
		
		
		
	}

}
