package com.celcom.day2;

import java.util.Arrays;

public class ArraySorting {

	public static void main(String[] args) {
		int arr[] = {0, 13, 8, 1, 2};
		
		Arrays.sort(arr);
		
		System.out.print("Array in Ascending order : ");
		for ( int index = 0 ; index < arr.length ; index++) {
			System.out.print(arr[index] + " ");
		} System.out.println();
		
		System.out.println ("Minimum element in Array : " + arr[0]);
		System.out.println ("Second Minimum element in Array : " + arr[1]);
		System.out.println ("Last element in Array : " + arr[arr.length - 1]);
		
		System.out.print("Array in Descending order : ");
		for ( int index = arr.length - 1 ; index >= 0 ; index--) {
			System.out.print(arr[index] + " ");
		}
	}

}
