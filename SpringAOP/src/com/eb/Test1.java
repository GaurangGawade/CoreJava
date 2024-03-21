package com.eb;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

	public static void main(String[] args) {
		ApplicationContext c1= new ClassPathXmlApplicationContext("bean.xml");
		Swiggy s = (Swiggy)c1.getBean("sw");
		System.out.println("Calling Methods :");
		s.starterMenu();
		s.nonVegMenu();
		s.vegMenu();
		
		
	}

}
