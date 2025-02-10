package com.celcom.assignment2;


class Person {
	String name;
	int age;
	
	Person (String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void display () {
		System.out.println("Name of a person is " + name + " and age is " + age);
	}
}
public class Program1 {

	public static void main(String[] args) {
		Person person1 = new Person ("Gopika", 21);
		Person person2 = new Person ("Angel", 25);
		
		person1.display ();
		person2.display();

	}

}
