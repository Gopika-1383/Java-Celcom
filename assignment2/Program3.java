package com.celcom.assignment2;


class Rectangle {
	int width;
	int height;
	
	void area ( int width, int height) {
		System.out.println ("Area of a Rectangle : " + (width * height));
	}
	
	void perimeter (int width, int height) {
		System.out.println ("Perimeter of a Rectangle : " + (2*(width + height)));
	}
}
public class Program3 {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		
		rectangle.area(5, 5);
		rectangle.perimeter(5, 5);

	}

}
