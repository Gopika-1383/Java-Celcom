package com.celcom.day3;

class Vehicle1 {
	String name = "I am a super class variable";
	
	Vehicle1 () {
		System.out.println("I am a super class constructor");
	}
	void noOfEngine () {
		System.out.println("I have One engine");
	}
}

class TwoWheeler1 extends Vehicle1 {
	
	TwoWheeler1 () {
		super ();
	}
	
	void noOfWheels () {
		System.out.println("I have Two Wheels");
		System.out.println(super.name);
	}
}

public class Super {

	public static void main(String[] args) {
		TwoWheeler1 two = new TwoWheeler1 ();
		two.noOfWheels();
	}

}
