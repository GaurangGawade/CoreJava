package com.edubridge.oopconceptdaytwo;
class Employee{
	String name;
	int age;
	
	Employee(){
		System.out.println("This is Employee");
	}
	
	Employee(String a,int b){
		name=a;
		age=b;
		System.out.println("Employee Name: "+a+"\nEmployee age: "+b);
	}
}

public class ConstructorOverloadingDemo {

	public static void main(String[] args) {
		Employee e1=new Employee();
		Employee e2=new Employee("John",23);
		
		

	}

}
