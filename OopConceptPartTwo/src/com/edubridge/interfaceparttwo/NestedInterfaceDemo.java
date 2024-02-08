package com.edubridge.interfaceparttwo;

public class NestedInterfaceDemo implements Books,Books.StoryBooks{

	public static void main(String[] args) {
		NestedInterfaceDemo n=new NestedInterfaceDemo();
		n.showBooks();
		n.showStoryBooks();
		
	}

	@Override
	public void showBooks() {
		System.out.println("Theory Of Everything");
		
	}

	@Override
	public void showStoryBooks() {
		System.out.println("HarryPotter");
		
		
	}

}
