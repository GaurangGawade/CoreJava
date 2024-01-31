package com.edubgridge.oopconcepts;

class Bank{
	String bankname ="Bank of India";
	String address ="Mumbai";
	String emailid ="boi@gmail.com";
}

class Facility extends Bank{
	void show() {
		float roi=8.5f;
		System.out.println("Bank Name: "+bankname+"\nRate of interest: "+roi);
	}
	
	
}

class Info extends Bank{
	void show1() {
		System.out.println("Bank Name: "+bankname+"\nBank Address: "+address+"\nEmail id: "+emailid);
	}
}


public class HierarchicalInheritanceDemo {

	public static void main(String[] args) {
		Facility f1=new Facility();
		Info i1=new Info();
		f1.show();
		i1.show1();
		

	}

}
