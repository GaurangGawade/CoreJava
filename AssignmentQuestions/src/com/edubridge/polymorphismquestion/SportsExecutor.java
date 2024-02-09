package com.edubridge.polymorphismquestion;

public class SportsExecutor {

	public static void main(String[] args) {
		Football f=new Football();
		f.play("Football", 11);
		Basketball b=new Basketball();
		b.play("Basketball", 13);
		Rugby r=new Rugby();
		r.play("Rugby", 12);
	}

}
