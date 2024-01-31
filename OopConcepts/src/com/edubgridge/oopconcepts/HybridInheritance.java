package com.edubgridge.oopconcepts;
class CC{
	void disp1() {
		System.out.println("This is class cc");
	}
}
class AA extends CC{
	void disp2() {
		System.out.println("This is class aa");
	}
}
class BB extends CC{
	void disp3() {
		System.out.println("This is class bb");
	}
}
class DD extends AA{
	void disp4(){
		System.out.println("This is class dd");
	}
}

public class HybridInheritance {

	public static void main(String[] args) {
		DD obj=new DD();
		obj.disp1();
		obj.disp2();
		obj.disp4();
		BB obj1=new BB();
		obj1.disp3();
		obj1.disp1();
	}

}
