package com.edubridge.multithreadingdemo;

public class ThreadDemo extends Thread{
	
		public void run() {
			System.out.println("Thread is in the running state: "+Thread.currentThread());
		}

	public static void main(String[] args) {
			
		
		for(int i=1;i<4;i++) {
			ThreadDemo t1=new ThreadDemo();
			ThreadDemo t2=new ThreadDemo();
			/* When we call start() it automatically calls run()*/
			t1.start();
			t2.start();
			
			
		}
		
		

	}

}
