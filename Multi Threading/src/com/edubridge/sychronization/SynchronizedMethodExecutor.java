package com.edubridge.sychronization;

public class SynchronizedMethodExecutor {

	public static void main(String[] args) {
		SynchronizedMethod m=new SynchronizedMethod();
		ThreadOne t1=new ThreadOne(m);
		ThreadTwo t2=new ThreadTwo(m);
		t1.start();
		t2.start();

	}

}
