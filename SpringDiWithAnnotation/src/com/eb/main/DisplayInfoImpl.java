package com.eb.main;

import org.springframework.stereotype.Service;

@Service
public class DisplayInfoImpl implements DisplayInfo {

	@Override
	public String disp(String name) {
		
		return "Hello "+ name;
	}

}
