package com.edubgridge.oopconcepts;

public class Product {
	String pname;
	int price;
	
	void disp(String p,int p1){
		pname=p;
		price=p1;
		System.out.println("Product Name : "+pname+"\nProduct Price : "+price);
		
	}

	public static void main(String[] args) {
		Product p= new Product();
		p.disp("Boat", 1000);
		p.disp("JBL", 2000);
		p.disp("HP Laptop", 3000);
		
		
		

	}

}
