package com.edubridge.customexception;

public class LoginCredentials extends Exception {
	
	private String str;
	
	public LoginCredentials(String str) {
		super();
		this.str=str;
		
	}

	@Override
	public String toString() {
		return "LoginCredentials [str=" + str + "]";
	}
	
	
	

}
