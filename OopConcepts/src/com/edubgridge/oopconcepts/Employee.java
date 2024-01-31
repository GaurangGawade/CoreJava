package com.edubgridge.oopconcepts;

public class Employee {
	int empid=101;
	String empname="John Smith";
	int age = 21;
	
	void testing() {
		System.out.println("Testing is in progess");
	}

	public static void main(String[] args) {
		//object using new keyword 
		Employee e1=new Employee();
		System.out.println("The employee id is : "+e1.empid+"\nThe Employee name is : "+e1.empname+"\nThe age of the employee is : "+e1.age);
		e1.testing();
	}

}
