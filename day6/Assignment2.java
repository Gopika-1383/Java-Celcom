package com.celcom.day6;

class Vowel extends Exception {
	
	public String toString () {
		return "Does not contain Vowel";
	}
}
public class Assignment2 {

	public static void main(String[] args) {
		String s1 = "Gopika";
		s1.toLowerCase();
		
		for(int i=0; i<s1.length(); i++) {
			if (s1.charAt(i) == 'a' || s1.charAt(i) == 'e' || s1.charAt(i) == 'i' || s1.charAt(i) == 'o' ||
					s1.charAt(i) == 'u') {
				System.out.println("Contain vowels");
			}
			else {
				try {
					throw new Vowel();
				}
				catch (Vowel e) {
					System.out.println(e);
				}
			}
		}

	}

}
