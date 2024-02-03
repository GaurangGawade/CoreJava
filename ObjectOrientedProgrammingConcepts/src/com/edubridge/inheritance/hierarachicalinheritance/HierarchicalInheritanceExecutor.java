package com.edubridge.inheritance.hierarachicalinheritance;

public class HierarchicalInheritanceExecutor {

	public static void main(String[] args) {
		IphoneOS14 i1=new IphoneOS14();
		IphoneOS15 i2=new IphoneOS15();
		i1.deviceName="Iphone X";
		i1.version="Iphone 14.3";
		i2.deviceName="Iphone Xr";
		i2.version="Iphone 15.7";
		i1.print();
		i2.print();
		

	}

}
