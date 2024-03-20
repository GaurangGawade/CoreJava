package com.eb.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {

	public static void main(String[] args) {
		
		ApplicationContext c1= new AnnotationConfigApplicationContext("com.eb.main");	
		Info i1 = c1.getBean(Info.class);
		i1.disp("Gaurang");
		
	}

}
