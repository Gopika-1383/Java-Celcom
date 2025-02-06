package com.celcom.day3;

class ClassRoom {
	String name;
	String color;
	int price;
	
	ClassRoom (String name, String color, int price) {
		this.name = name;
		this.color = color;
		this.price = price;
	}
	
	void display () {
		System.out.println("Property name : " + name);
		System.out.println("Property color : " + color);
		System.out.println("Propert price : " + price);
	}
}
public class ClassAndObject {
	
	public static void main ( String args[] ) {
		ClassRoom laptop = new ClassRoom("Dell", "Black", 50000);
		
		laptop.display();
	}

}
