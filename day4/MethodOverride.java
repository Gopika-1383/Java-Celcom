package com.celcom.day4;

class SuperClass {
	void myMethod() {
		System.out.println("I am from Sub Class");
	}
}

class SubClass extends SuperClass {
	void myMethod() {
		System.out.println("I am from Sub Class");
	}
}

public class MethodOverride {

	public static void main(String[] args) {
		SubClass obj = new SubClass();
		obj.myMethod();

	}

}
