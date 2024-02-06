package com.edubridge.abstractclassdemo;

public class ISRO extends GovermentAgency{
	void display() {
		System.out.println("Indian Space Research"+" Organization");
	}
	void display(String AgencyName, long budget) {
		System.out.println("Agency name is "+AgencyName+"\nBudget of the agency is "+budget);	
	}


}
