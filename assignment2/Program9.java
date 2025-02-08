package com.celcom.assignment2;

class Vehicle {
	
	void drive () {
		System.out.println("Drive a vehicle");
	}
}

class Car extends Vehicle {
	
	void drive () {
		System.out.println("Repairing a car");
	}
}
public class Program9 {

	public static void main(String[] args) {
		
		Vehicle vehicle;
		
		vehicle = new Vehicle ();
		vehicle.drive();
		
		vehicle = new Car ();
		vehicle.drive();

	}

}
