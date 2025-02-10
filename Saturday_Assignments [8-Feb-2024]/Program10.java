package com.celcom.assignment2;

class Shape {
	
	void getArea (int length, int breadth) {
		System.out.println("Area can be calculated by various formula");
	}
}

class Rect extends Shape {
	
	void getArea (int length, int breadth) {
		System.out.println("Area of Rectangle : " + (length * breadth));
	}
	
}

public class Program10 {

	public static void main(String[] args) {
		Shape shape = new Shape ();
		shape.getArea(10, 2);
		
		Rect rect = new Rect();
		rect.getArea(10, 2);

	}

}
