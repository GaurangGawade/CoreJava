package com.edubridge.sychronization;
//Thread 1
public class ThreadOne extends Thread{
	
	SynchronizedMethod m1;
	
	public ThreadOne(SynchronizedMethod m1) {
		super();
		this.m1=m1;
	}
	
	public void run() {
		m1.print(5);
	}

}
