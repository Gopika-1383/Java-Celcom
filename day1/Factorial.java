package com.celcom.day1;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number :");
		
		int num = sc.nextInt();
		int factorial=1;
		for(int index=1; index<=num; index++) {
			factorial = factorial * index;
		}
		System.out.println("Factorial : "+ factorial);
		
		sc.close();
	}

}
