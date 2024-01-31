package com.edubgridge.oopconcepts;
class Animal{
	void eat(){
		System.out.println("Animal Behaviour");
	}
}
class Catt{
	void eat(){
		System.out.println("Cat Behaviour");
	}
}
class Dogg{
	void eat(){
		System.out.println("Dog Behaviour");
	}
}

public class PolymorphismOverridingDemo {

	public static void main(String[] args) {
		Animal a=new Animal();
		Catt c=new Catt();
		Dogg d=new Dogg();
		c.eat();
		d.eat();
		a.eat();

	}

}
