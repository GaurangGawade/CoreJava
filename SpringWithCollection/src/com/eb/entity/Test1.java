package com.eb.entity;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("bean.xml");
		Post pp = (Post)context.getBean("p1");
		pp.show();

	}

}
