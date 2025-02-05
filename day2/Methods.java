package com.celcom.day2;

public class Methods {
	
	void m1 () {
		System.out.println("Instance Method");
	}
	
	static void m2 () {
		System.out.println("Static Method");
	}

	public static void main(String[] args) {
		Methods obj = new Methods();
		obj.m1();
		
		Methods.m2();

	}

}
