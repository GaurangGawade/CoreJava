package com.edubridge.abstractclassdemo;

abstract public class GovermentAgency {
	private String AgencyName;
	private long budget;
	
	abstract void display();
	abstract void display(String AgencyName,long budget);
	public String getAgencyName() {
		return AgencyName;
	}
	public void setAgencyName(String agencyName) {
		AgencyName = agencyName;
	}
	public long getBudget() {
		return budget;
	}
	public void setBudget(long budget) {
		this.budget = budget;
	}
	
	String display1() {
		return "Concrete Method";
	}
	@Override
	public String toString() {
		return "GovermentAgency [AgencyName=" + AgencyName + ", budget=" + budget + "]";
	}
	
}
