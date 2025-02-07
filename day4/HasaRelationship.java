package com.celcom.day4;

class Vehicle {
	void engine () {
		System.out.println("All vehicle has a One Engine");
	}
	
	void wheels () {
		System.out.println("All vehicle has a wheels");
	}
}

class Wheels {
	void wheelModel () {
		System.out.println("Wheel Model is MRF");
	}
	
	void noOfWheels (String vehicleType) {
		if (vehicleType.contentEquals("Two Wheeler")) {
			System.out.println("I have Two Wheels");
		}
		else if (vehicleType.contentEquals("Four Wheeler")) {
			System.out.println("I have Four Wheels");
		}
	}
}

class Engine {
	void engineModel () {
		System.out.println("Wheel Model is MRF");
	}
}
class Car extends Vehicle { // IS - A
	Wheels wheel = new Wheels(); // HAS - A
	Engine engine = new Engine(); // HAS - A
	
	void engineModel () {
		engine.engineModel();
	}
	
	void wheelModel () {
		wheel.wheelModel();
	}
	
	void noOfWheels () {
		wheel.noOfWheels("Four Wheeler");
	}
}
public class HasaRelationship {

	public static void main(String[] args) {
		Car car = new Car();
		car.engine();
		car.engineModel();
		
		car.wheels();
		car.wheelModel();
		car.noOfWheels();
		

	}

}
