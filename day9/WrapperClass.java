package com.celcom.day9;

public class WrapperClass {

	public static void main(String[] args) {
		int a =10;
		Integer obj = new Integer(a); // boxing
		int b = obj.intValue(); // unboxing
		
		//  from jdk 1.5
		
		Integer obj2 = a; // auto boxing
		int c = obj2; // auto un-boxing
	}

}
