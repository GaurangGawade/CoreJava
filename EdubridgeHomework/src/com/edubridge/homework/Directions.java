package com.edubridge.homework;

public enum Directions{
	NORTH(0),SOUTH(1),EAST(2),WEST(3);
	
	private int i;
	 Directions(int index) {
		this.i=index;
	}
	int display() {
		return i;
	}
	
public static void main(String[]args) {
	
		System.out.println(Directions.SOUTH);
		System.out.println(Directions.EAST.display());
		
	
    }
}
