package com.edubridge.multithreadingdemo;

public class ThreadExecutor implements Runnable{
	

	public static void main(String[] args) {
		ThreadExecutor t3=new ThreadExecutor();
		t3.run();

	}

	@Override
	public void run() {
		for(int i=0;i<3;i++) {
			System.out.println("Thread "+i+" "+Thread.currentThread());
		}
		
		
	}

}
