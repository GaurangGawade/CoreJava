package com.edubridge.classandobjectdemo;

class Vegetables
{
	String vegetableName;
	int price;
	
	void print()
	{
		System.out.println("Vegetable Name: "+vegetableName+" "+"Price is "+price);
	}
}
//Driver class
public class ClassAndObjectExecutor {

	public static void main(String[] args) {
		Vegetables v=new Vegetables();
		v.vegetableName="Jackfruit";
		v.price=150;
		v.print();

	}

}
