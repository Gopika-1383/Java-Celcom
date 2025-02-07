package com.celcom.day4;

import java.util.Scanner;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		int pronic=0;
		
		for(int i=1; i<=num; i++) {
				if (( i * (i+1) ) ==num) {
					pronic = 1;
				}
		
		}
		if(pronic == 1) {
			System.out.println("It is a pronic number");
		}
		else {
			System.out.println("It is not a pronic number");
		}
		
	}

}
