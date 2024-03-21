package com.eb;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {

	public static void main(String[] args) {
		
		ApplicationContext context2=new ClassPathXmlApplicationContext("bean2.xml");
		Course cc=(Course)context2.getBean("co1");
		cc.getId();
		cc.getName();
		

	}

}
