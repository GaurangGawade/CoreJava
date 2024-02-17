package com.edubridge.sychronization;

public class MyThread extends Thread{
	
	Welcome w;
	String str1;

	public MyThread(Welcome w) {
		super();
		this.w=w;
		
	}
	
	public void run() {
		//to access static method use ClassName.methodname
		Welcome.display(getName());
	}

}
