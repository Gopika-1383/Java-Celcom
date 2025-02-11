package com.celcom.day6;


class Duplicate extends Exception {
	//@Overrride
	public String toString() {
		return "Duplicate value";
	}
}
public class Assignment1 {

	public static void main(String[] args) {
		
		int arr[] = {10, 10, 30};
		System.out.println("Enter the array elements ");
		
		for(int i=0; i < arr.length; i++) {
			for (int j=i+1; j<arr.length; j++) {
				if (arr[i] != arr[j]) {
					System.out.println("Unique");
				}
				else {
					try {
						throw new Duplicate();
					}
					catch (Duplicate e) {
						System.out.println(e);
					}
				}
			}
		}

	}

}
