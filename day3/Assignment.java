package com.celcom.day3;

import java.util.Scanner;

class Shape {
	int radius;
	int length;
	int breadth;
	int height;
	
	void calculateArea () {
		
	}
}

class Circle extends Shape {
	//int radius;
	
	Circle (int radius){
		this.radius=radius;
	}
	
	void calculateArea () {
		System.out.println(3.14 * radius * radius);
	}
}

class Rectangle extends Shape {
	//int length;
	//int breadth;
	
	Rectangle(int length, int breadth) {
		this.length=length;
		this.breadth=breadth;
	}
	
	void calculateArea () {
		System.out.println (length * breadth);
	}
}

class Triangle extends Shape {
	//int length;
	//int height;
	
	Triangle(int length,int height) {
		this.length=length;
		this.height = height;
	}
	
	void calculateArea () {
		System.out.println ( 1/2 * length * height);
	}
}
public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner sc = new Scanner ( System.in );
		System.out.println("Enter the choice");
		int choice = sc.nextInt();
		Shape shape = new Shape () ;
		switch (choice) {
		case 1 :
			shape = new Circle(5);
			shape.calculateArea();
			break;
		
		
		case 2:
			shape = new Rectangle(2,3);
			shape.calculateArea();
			break;
			
		case 3:
			shape = new Triangle(2,5);
			shape.calculateArea();
			break;
		}

	}

}
