package com.edubgridge.oopconcepts;

class Dog{
	String color="Black";
	
}

class Cat extends Dog{ 
	//Dog is ParentClass and Cat is ChildClass
	String color1="White";
}

public class SingleLevelInheritanceDemo {

	public static void main(String[] args) {
		Cat c1=new Cat();//Cat inherits Dog so no need to create object for dog class
		System.out.println("Dog color is "+c1.color+"\nCat Color is "+c1.color1);
	}

}
