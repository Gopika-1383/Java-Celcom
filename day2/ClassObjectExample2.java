package com.celcom.day2;

class Fruits {
	String color;
	int size;
	int price;
	
	Fruits ( String color, int size, int price) {
		this.color = color;
		this.size = size;
		this.price = price;
	}
	
	void display () {
		System.out.println("Fruit color : " + color);
		System.out.println("Fruit size : " + size);
		System.out.println("Fruit price : " + price);
	}
	
	void setPrice ( int price) {
		this.price = price;
	}
}
public class ClassObjectExample2 {

	public static void main(String[] args) {
		Fruits apple = new Fruits("red", 15, 100);
		apple.display();
		
		apple.setPrice(250);
		
		apple.display();

	}

}
