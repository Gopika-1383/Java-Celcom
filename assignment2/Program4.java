package com.celcom.assignment2;

class Circle {
	int radius;
	
	Circle (int radius) {
		this.radius = radius;
	}
	
	void area () {
		System.out.println("Area of a circle = " + (3.14 * radius * radius));
	}
	
	void circumference () {
		System.out.println("Circumference of a circle = " + (2 * 3.14 * radius));
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	
}
public class Program4 {

	public static void main(String[] args) {
		Circle circle = new Circle (10);
		
		circle .area();
		circle.circumference();
		
		circle.setRadius(5);
		circle.area();
		circle.circumference();

	}

}
