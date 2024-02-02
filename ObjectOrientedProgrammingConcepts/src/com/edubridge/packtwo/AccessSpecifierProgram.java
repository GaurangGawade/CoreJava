package com.edubridge.packtwo;

import com.edubridge.packone.AccessSpecifierDemo;
//import com.edubridge.packone.*

public class AccessSpecifierProgram {

	public static void main(String[] args) {
		AccessSpecifierDemo obj=new AccessSpecifierDemo();
		/*atm_pinNo is private and we can't access into another class*/
		obj.emailId="durveshpatil@gmail.com";
		obj.displayemailId();
	
		

	}

}
