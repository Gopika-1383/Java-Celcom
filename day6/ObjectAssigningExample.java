package com.celcom.day6;

public class ObjectAssigningExample {

	public static void main(String[] args) {
		
		ObjectAssigningExample obj1 = new ObjectAssigningExample();
		
		System.out.println(obj1.hashCode());
		
		ObjectAssigningExample obj2 = obj1; // Both pointing the same object, 2 Ref
		
		System.out.println(obj2.hashCode());

	}

}
