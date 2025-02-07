package com.celcom.day4;

public class ConstructorOverloading {

	ConstructorOverloading(int a, int b) {
		this(10.0, 20.0);
		System.out.println("Integer Addition : " + (a + b));
	}
	
	ConstructorOverloading(double a, double b) {
		this(10L, 20L);
		System.out.println("Double Addition : " + (a + b));
	}
	
	ConstructorOverloading (long a, long b) {
		System.out.println("Long Addition : " + (a+b));
	}
	
	public static void main(String[] args) {
		ConstructorOverloading obj1 = new ConstructorOverloading(10, 20);
		//ConstructorOverloading obj2 = new ConstructorOverloading(10.0, 20.0);
		//ConstructorOverloading obj3 = new ConstructorOverloading(10L, 20L);

	}

}
