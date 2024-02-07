package com.edubridge.lambdaexpressiondemo;

public class ProductExecutor {

	public static void main(String[] args) {
		//Lambda Expression
		Product p=(price)->{
			System.out.println("Price is "+price);
			
		};
		
		System.out.println(p.displayProductName());
		System.out.println(Product.ProductBrand());
		p.displayProductPrice(599);
		

	}

}
