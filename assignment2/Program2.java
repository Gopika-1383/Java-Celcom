package com.celcom.assignment2;

class Dog {
	private String name;
	private String breed;
	
	Dog (String name, String breed) {
		this.name = name;
		this.breed = breed;
	}
	
	void display () {
		System.out.println("Dog name : "+ name + " Breed name : " + breed);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	
	
	
}
public class Program2 {

	public static void main(String[] args) {
		Dog dog1 = new Dog ("Alice", "Labrador Retriever");
		Dog dog2 = new Dog ("Alex", "Rajapalayam");
		
		System.out.println ("Before Modification");
		dog1.display();
		dog2.display();
		
		dog1.setName("Jony");
		dog1.setBreed("French Bulldog");
		
		System.out.println ("After Modification");
		dog1.display();
		

	}

}
