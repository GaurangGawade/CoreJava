package com.edubridge.typesofvariables;

public class TypesOfVariablesDemo {
	
    //Instance Variable
	float salary=80065.89f;
	//Static Variable
	static int num=123;
	
	String display()
	{
		//Local Variable
		@SuppressWarnings("unused")
		char x='z';
		System.out.println(x);
		return "Local Variable";
		
		
	}
		public static void main(String[] args) {
		System.out.println(num);
		TypesOfVariablesDemo obj=new TypesOfVariablesDemo();
		System.out.println(obj.display());
		System.out.println(obj.salary);
		
		
		

	}

}
