package com.celcom.day4;


public class MethodOverloading1 {
	
	void myMethod (int a) {
		int fact = 1;
		for (int i=1; i<=5; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial : " + fact);
	}
	
	void myMethod (int a, int b) {
		int sum = a + b;
		System.out.println ("Sum : " + sum);
	}
	
	void myMethod (String name) {
		System.out.println ("Hello " + name);
	}

	public static void main(String[] args) {
		MethodOverloading1 obj = new MethodOverloading1();
		obj.myMethod(10);
		obj.myMethod(5, 5);
		obj.myMethod("Gopika");
		

	}

}
