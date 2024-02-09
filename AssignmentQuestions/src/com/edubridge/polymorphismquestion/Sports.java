package com.edubridge.polymorphismquestion;

public class Sports {
	int totalMembers;
	String sportName;
	
	public void play(String sportName, int totalMembers) {
		this.sportName=sportName;
		this.totalMembers=totalMembers;
		System.out.println(sportName+" "+totalMembers);
		
	}

}
