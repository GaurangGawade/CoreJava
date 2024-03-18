package com.eb.model;

public class Course {
	private int cId;
	private String cName;
	public Course(int cId, String cName) {
		super();
		this.cId = cId;
		this.cName = cName;
	}
	public Course() {
		super();
		
	}
	@Override
	public String toString() {
		return "Course [cId=" + cId + ", cName=" + cName + "]";
	}
	
	public void disp() {
		System.out.println(cId+" "+cName);
	}

}
