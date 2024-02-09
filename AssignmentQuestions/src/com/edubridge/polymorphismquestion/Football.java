package com.edubridge.polymorphismquestion;

public class Football extends Sports{
	@Override
	public void play(String sportName, int totalMembers) {
		System.out.println(sportName+" "+totalMembers);
		
	}

}
