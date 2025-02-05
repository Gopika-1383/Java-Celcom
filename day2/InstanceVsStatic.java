package com.celcom.day2;

public class InstanceVsStatic {
	int a = 10; // Instance variable
	static int b = 20; // Static variable
	
	public static void main(String[] args) {
		InstanceVsStatic obj1 = new InstanceVsStatic();
		InstanceVsStatic obj2 = new InstanceVsStatic();
		
		System.out.println("Instance before modifying");
		System.out.println(obj1.a);
		System.out.println(obj2.a);
		
		obj1.a = 20;
		
		System.out.println("Instance after modifying");
		System.out.println(obj1.a);
		System.out.println(obj2.a);
		
		System.out.println("Static before modifying");
		System.out.println(InstanceVsStatic.b);
		System.out.println(InstanceVsStatic.b);
		
		InstanceVsStatic.b = 30;
		
		System.out.println("Static after modifying");
		System.out.println(InstanceVsStatic.b);
		System.out.println(InstanceVsStatic.b);

	}

}
