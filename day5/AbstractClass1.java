package com.celcom.day5;

// Interface
interface VehiclePlan1 {
	void noOfEngine (); // public abstract
}

interface VehiclePlan2 {
	void noOfWheels ();
	void brandName ();
}

// Abstract class
abstract class Vehicle implements VehiclePlan1, VehiclePlan2 {
	public void noOfEngine () {
		System.out.println("I have one Engine");
	}
}

class Car extends Vehicle {
	public void noOfWheels () {
		System.out.println("I have Four Wheels");
	}
	
	public void brandName () {
		System.out.println("My brand name is Benz");
	}
}

public class AbstractClass1 {

	public static void main(String[] args) {
		
		Vehicle vec = new Car () ;
		vec.noOfEngine ();
		vec.noOfWheels(); 
		vec.brandName();  

	}

}
