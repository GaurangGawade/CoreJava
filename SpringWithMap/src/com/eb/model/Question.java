package com.eb.model;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question {
	
	private int qId;
	private String qName;
	private Map<String,String>answers;
	
	public Question(int qId, String qName, Map<String, String>answers) {
		super();
		this.qId = qId;
		this.qName = qName;
		this.answers = answers;
	}
	
	public Question() {
		super();

	}
	
	public void disp() {
		
		System.out.println("Question No:"+qId+"\nQuestion:"+qName);
		System.out.println("*Answers**");
		
		Set<Entry<String,String>>set=answers.entrySet();
		
		Iterator<Entry<String,String>>itr=set.iterator();
			while(itr.hasNext()) {
				Entry<String,String>entry=itr.next();
		
		System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}
}
