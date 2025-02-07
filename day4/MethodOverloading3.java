package com.celcom.day4;

public class MethodOverloading3 {
	
	void concatenation (String greet, String name) {
		System.out.println("String concatenation : " + greet + " "+ name);
	}
	
	void concatenation (int a, int b) {
		System.out.println("Integer concatenation : " + a + b);
	}
	
	void concatenation (double a, double b) {
		System.out.println("Double concatenation : " + a + b);
	}

	public static void main(String[] args) {
		MethodOverloading3 obj = new MethodOverloading3();
		obj.concatenation("Hello", "Gopika");
		obj.concatenation(10, 10);
		obj.concatenation(20.0, 30.0);

	}

}
