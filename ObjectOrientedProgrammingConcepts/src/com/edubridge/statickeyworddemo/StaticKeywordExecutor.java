package com.edubridge.statickeyworddemo;
class Learner{
	
	static String name;
	static int rollno;
	static String instituteName ="Edubridge";
	
	public static void print() {
		System.out.println(name+" "+rollno+" "+instituteName);
		
	}
}

public class StaticKeywordExecutor {

	public static void main(String[] args) {
		Learner.name="Gaurang";
		Learner.rollno=75;
		Learner.print();
		
		Learner.name="Durvesh";
		Learner.rollno=45;
		Learner.print();
		
		Learner.instituteName="Gemini";
		Learner.print();
	}

}
