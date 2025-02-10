package com.celcom.day5;

import java.util.Scanner;

interface Area {
	void calculateArea ();
}

interface Perimeter {
	void calculatePerimeter ();
}
abstract class Shape implements Area, Perimeter {
	int radius;
	int length;
	int breadth;
	int height;
	
	public abstract void calculateArea ();
	public abstract void calculatePerimeter ();
}

class Circle extends Shape {
	
	Circle (int radius){
		this.radius=radius;
	}
	
	public void calculateArea () {
		System.out.println(3.14 * radius * radius);
	}
	
	public void calculatePerimeter () {
		System.out.println (2 * 3.14 * radius);
	}
}

class Rectangle extends Shape {
	
	Rectangle(int length, int breadth) {
		this.length=length;
		this.breadth=breadth;
	}
	
	public void calculateArea () {
		System.out.println (length * breadth);
	}
	
	public void calculatePerimeter () {
		System.out.println (2 * (length * breadth));
	}
}

class Triangle extends Shape {
	
	Triangle(int length,int height, int breadth) {
		this.length=length;
		this.height = height;
		this.breadth = breadth;
	}
	
	public void calculateArea () {
		System.out.println ( 1/2 * length * height);
	}
	
	public void calculatePerimeter () {
		System.out.println ((length + breadth + height));
	}
}
public class AbstractInterface2 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner ( System.in );
		System.out.println("Enter the choice");
		int choice = sc.nextInt();
		Shape shape ;
		switch (choice) {
		case 1 :
			shape = new Circle(5);
			shape.calculateArea();
			shape.calculatePerimeter();
			break;
		
		
		case 2:
			shape = new Rectangle(2,3);
			shape.calculateArea();
			shape.calculatePerimeter();
			break;
			
		case 3:
			shape = new Triangle(2,5,3);
			shape.calculateArea();
			shape.calculatePerimeter();
			break;
		}

	}

}
