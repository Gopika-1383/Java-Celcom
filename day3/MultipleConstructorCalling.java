package com.celcom.day3;

public class MultipleConstructorCalling {
	
	MultipleConstructorCalling () {
		this("Gopika");
		System.out.println ("A");
	}
	
	MultipleConstructorCalling (String name) {
		this(10);
		System.out.println ("B");
	}
	
	MultipleConstructorCalling (int a) {
		System.out.println("C");
	}

	public static void main(String[] args) {
		MultipleConstructorCalling obj = new MultipleConstructorCalling();

	}

}
