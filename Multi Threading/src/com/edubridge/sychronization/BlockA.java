package com.edubridge.sychronization;

public class BlockA extends Thread{

	Flat f1;
	
	public BlockA(Flat f1) {
		super();
		this.f1=f1;
	}
	
	public void run() {
		f1.print(5);
	}

}
