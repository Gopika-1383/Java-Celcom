package com.celcom.assignment2;

class Animal {
	void makeSound () {
		
	}
}

class Cat extends Animal {
	void makeSound() {
		System.out.println("Cat makes meow sound");
	}
}

public class Program8 {

	public static void main(String[] args) {
		Animal animal;
		
		animal = new Cat ();
		animal.makeSound();

	}

}
