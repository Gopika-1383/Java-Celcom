package com.celcom.day5;

interface One {
	int a = 10; // By default interface variable is public static final
}

interface Two {
	int a = 20;
}

interface Three extends One, Two {
	void addition ();
}

class Addition implements Three {
	
	public void addition () {
		System.out.println(One.a + Two.a);
	}
}
public class MultipleInheritance {

	public static void main(String[] args) {
		Addition add = new Addition();
		add.addition();
		

	}

}
