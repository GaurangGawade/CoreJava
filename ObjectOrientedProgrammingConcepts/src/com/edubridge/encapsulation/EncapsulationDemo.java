package com.edubridge.encapsulation;

public class EncapsulationDemo {

	public static void main(String[] args) {
		Customer c=new Customer();
		c.setBranch("Mulund");
		c.setCustID(78956);
		c.setCustName("Gaurang Gawade");
		c.setIFCCode("HDFC342");
		c.setPinno(4573);
		System.out.println(c.getBranch()+" "+c.getCustID());
		System.out.println(c);
		
	}

}
