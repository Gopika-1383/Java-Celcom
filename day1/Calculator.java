package com.celcom.day1;

import java.util.Scanner;

public class Calculator {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int cont;
		System.out.println("Enter any number :");
		System.out.println("Enter another number :");
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println("1.Addition \n 2.Subtraction \n 3.Multiplication \n 4.Division \n 5.Exit");
		
		do {
			System.out.println("Enter the choice");
			int choice = sc.nextInt();
				switch(choice) {
				case 1:
					int sum = num1 + num2;
					System.out.println("Addition : "+sum);
					break;
				case 2:
					int difference = num1 - num2;
					System.out.println("Difference : "+difference);
					break;
				case 3:
					int mul = num1 * num2;
					System.out.println("Multiplication : "+ mul);
					break;
				case 4:
					int div = num1/num2;
					System.out.println("Division : "+div);
					break;
				case 5:
					System.out.println("End");
					break;
				default:
					System.out.println("Invalid choice");
					break;
				}
				System.out.println("If you want to continue enter 1 else 0");
			    cont=sc.nextInt();
		}
	    while(cont==1);
		sc.close();
		
	}
}
