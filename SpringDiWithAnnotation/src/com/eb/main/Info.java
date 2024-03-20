package com.eb.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Info {
	
	@Autowired
	private DisplayInfoImpl di;
	public void disp(String name){
		System.out.println(di.disp(name));
		
	}
}
