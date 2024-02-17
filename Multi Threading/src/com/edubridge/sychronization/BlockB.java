package com.edubridge.sychronization;

public class BlockB extends Thread{

	Flat f2;
	
	public BlockB(Flat f2) {
		super();
		this.f2=f2;
	}
	
	public void run() {
		f2.print(7);
	}

}
