package com.celcom.day3;

class A {
	A () {
		super ();
		System.out.println("A");
	}
	
	A (int a) {
		System.out.println("A 1"); // When super keyword is not written manually in B (int) constructor, this will not be displayed
	}
}

class B extends A{
	B () {
		this(10); // This will go for B(int)
		System.out.println("B");
	}
	
	B (int a) {
		super (10); //Both A(int) and B(int) will be executed
		System.out.println("B 1");
	}
}

public class DefaultSuper {

	public static void main(String[] args) {
		B b = new B();

	}

}
