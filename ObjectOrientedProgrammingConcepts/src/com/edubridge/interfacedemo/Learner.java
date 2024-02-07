package com.edubridge.interfacedemo;
//Implementable class
public class Learner implements Deletable{
		
	//it provide runtime info about objects
	public boolean delete(Object o) {
			
			if(o instanceof Deletable)
				return true;
			return false;
			
		}
	

}
