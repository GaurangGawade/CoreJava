package com.edubridge.lambdaexpressiondemo;
@FunctionalInterface
public interface Product {

	//Abstract Method
	void displayProductPrice(int price);
	
	//Default Method
	default String displayProductName() {
		return "Perfume";
	}
	
	//Static Method
	static String ProductBrand() {
		return "Zara";
	}
	
	
	
}
