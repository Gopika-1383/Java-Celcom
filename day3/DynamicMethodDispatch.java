package com.celcom.day3;

class Vehicle2 {
	
}

class Bike2 extends Vehicle2 {
	
}

class Car2 extends Vehicle2 {
	
}

public class DynamicMethodDispatch {

	public static void main(String[] args) {
		Bike2 bike = new Bike2();
		
		Vehicle2 veh = new Bike2();
		
		veh = new Car2();

	}

}
