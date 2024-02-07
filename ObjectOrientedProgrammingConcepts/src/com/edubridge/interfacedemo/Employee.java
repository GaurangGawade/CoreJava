package com.edubridge.interfacedemo;

public class Employee implements Cloneable {
	
	public int empId;
	public String empName;
	public long salary;
	
	//If we are not implementing a Cloneable interface and if we are
	//invoking it in the driver class,we will get an exception as 
	//ClassNotSupported
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
	public Employee(int empId, String empName, long salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}
	


	void display() {
		System.out.println("Employee id "+empId+
				"\nEmployee Name "+empName+
				"\nSalary "+salary);
	}
	
	
	
}
