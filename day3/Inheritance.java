package com.celcom.day3;

class Vehicle {
	void noOfEngine () {
		System.out.println("I have One engine");
	}
}

class TwoWheeler extends Vehicle {
	void noOfWheels () {
		System.out.println("I have Two Wheels");
	}
}

class Bike extends TwoWheeler {
	void brandName () {
		System.out.println("My brand Name is YAMAHA");
	}
}

class Scooty extends TwoWheeler {
	void brandName () {
		System.out.println("My brand name is FASINO");
	}
}
public class Inheritance {

	public static void main(String[] args) {
		Bike yamaha = new Bike ();
		yamaha.noOfEngine();
		yamaha.noOfWheels();
		yamaha.brandName();
		
		System.out.println();
		
		Scooty fasino = new Scooty ();
		fasino.noOfEngine();
		fasino.noOfWheels();
		fasino.brandName();

	}

}
