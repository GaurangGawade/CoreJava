package com.edubridge.inheritance.singleiheritance;

public class Learner extends Trainer{
	public String learnerName;
	public int rollNo;
	
	public void display() {
		super.display();
		System.out.println(learnerName+" "+rollNo);
		
	}

}
