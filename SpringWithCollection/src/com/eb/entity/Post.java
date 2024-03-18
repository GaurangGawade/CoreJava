package com.eb.entity;
import java.util.Iterator;
import java.util.List;

public class Post {
	
	private int postId;
	private String postName;
	private List<String>comments;
	public Post() {
		super();
		
	}
	public Post(int postId, String postName, List<String> comments) {
		super();
		this.postId = postId;
		this.postName = postName;
		this.comments = comments;
	}
	
	public void show() {
		
		System.out.println("Post Id is:"+postId+"\nPost Heading: "+postName);
		System.out.println("Comments are:");
		
		Iterator<String>itr=comments.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
}
