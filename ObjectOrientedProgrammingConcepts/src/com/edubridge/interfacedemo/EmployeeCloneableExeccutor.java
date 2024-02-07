package com.edubridge.interfacedemo;

import java.util.Scanner;

public class EmployeeCloneableExeccutor {

	public static void main(String[] args) throws CloneNotSupportedException {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Employee ID");
		int empId=s.nextInt();
		System.out.println("Enter Employee Name");
		String empName=s.next();
		System.out.println("Enter Employee Salary");
		long salary=s.nextLong();
		
		Employee e1=new Employee(empId,empName,salary);
	
		Employee e2=(Employee)e1.clone();
		e2.display();
	}

}
