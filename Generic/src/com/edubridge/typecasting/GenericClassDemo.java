package com.edubridge.typecasting;

public class GenericClassDemo<T,T1> {
	
	T age;
	T1 name;
	
	void print(T1 name,T age) {
			this.name=name;
			this.age=age;
			System.out.println(name+" "+age);
	}

	public static void main(String[] args) {
		GenericClassDemo<String,Integer>obj1=new GenericClassDemo<>();
		obj1.print(22,"Gaurang");
		
		

	}

}
