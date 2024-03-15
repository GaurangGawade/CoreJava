package com.spring.entity;

public class Student {
	private int sId;
	private String sName;
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	
	public void show() {
		System.out.println("Studend id: "+sId+"\nStudent Name: "+sName);
	}

}
