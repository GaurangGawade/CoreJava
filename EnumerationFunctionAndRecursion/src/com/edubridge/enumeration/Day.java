package com.edubridge.enumeration;

public enum Day {
	
	
	
	SUNDAY(0),MONDAY(1),TUESDAY(2),WEDNESDAY(3),THURSDAY(4),FRIDAY(5),STAURDAY(6);
	private int i;
	Day (int index)
	{
		this.i=index;
	}
	int displayIndex()
	{
		return i;
	}
	public static void main(String[] args)
	{
		System.out.println(Day.STAURDAY);
		System.out.println(Day.STAURDAY.compareTo(SUNDAY));
		System.out.println(Day.SUNDAY.displayIndex());
	}
}
