package com.edubridge.encapsulation;

public class Customer extends HDFC {
	
	private String custName;
	private long custID;
	private int pinno;
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public long getCustID() {
		return custID;
	}
	public void setCustID(long custID) {
		this.custID = custID;
	}
	public int getPinno() {
		return pinno;
	}
	public void setPinno(int pinno) {
		this.pinno = pinno;
	}
	@Override
	public String toString() {
		return "Customer [custName=" + custName + ", custID=" + custID + ", pinno=" + pinno + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
	
	
	
	

}
