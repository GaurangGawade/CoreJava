package com.edubridge.sychronization;

public class SynchronizedBlockDemo {

	public static void main(String[] args) {
		Flat f=new Flat();
		BlockA a=new BlockA(f);
		BlockB b=new BlockB(f);
		a.setPriority(2);
		b.setPriority(9);
		a.start();
		b.start();
		System.out.println(b.getPriority());
	}

}
