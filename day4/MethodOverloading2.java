package com.celcom.day4;

public class MethodOverloading2 {
	
	void addition(int a, int b) {
		System.out.println("Integer Addition : " + (a + b));
	}
	
	void addition (double a, double b) {
		System.out.println("Double Addition : " + (a + b));
	}
	
	void addition (long a, long b) {
		System.out.println("Long Addition : " + (a+b));
	}

	public static void main(String[] args) {
		
		MethodOverloading2 obj = new MethodOverloading2();
		obj.addition(10, 5);
		obj.addition(10.5, 4.5);
		obj.addition(20L, 20L);

	}

}
