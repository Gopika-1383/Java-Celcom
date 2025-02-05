package com.celcom.day1;

import java.util.Scanner;

public class FactorialTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number :");
		
		int num = sc.nextInt();
		int factorial=1;
		for(int main = 1; main<=num; main++) {
			int num2=main;
			for(int index=1; index<=num2; index++) {
				factorial = factorial * index;
			}
			System.out.println("Factorial of "+ num2 + ": "+ factorial);
			factorial=1;
		}
		sc.close();

	}

}
