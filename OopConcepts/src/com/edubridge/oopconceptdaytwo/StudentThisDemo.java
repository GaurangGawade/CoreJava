package com.edubridge.oopconceptdaytwo;
class Student{
	String name;
	
	Student(String name){
		this.name=name;
	}
	void disp() {
		System.out.println(name);
	}
}


public class StudentThisDemo {

	public static void main(String[] args) {
		Student s1=new Student("John");
		s1.disp();

	}

}
