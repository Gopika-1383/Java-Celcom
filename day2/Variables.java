package com.celcom.day2;

public class Variables {
	int b = 20; //Instance/Object variable
	static int c = 30; // Static variable
	
	public static void main(String[] args) {
		int a = 10; //Local variable
		System.out.println("Local Variable : " + a);
		
		Variables obj = new Variables();
		System.out.println("Instance Variable : " + obj.b);
		
		System.out.println("Static Variable : " + Variables.c);
		
	}

}
