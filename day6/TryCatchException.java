package com.celcom.day6;

public class TryCatchException {

	public static void main(String[] args) {
		
		System.out.println ("Before Exception");
		
		try {
			//int a = 10 /0 ;
			//int a = Integer.parseInt("Hello");
			//int arr[] = new int[-5];
			int arr [] = {10, 20, 30};
			System.out.println(arr[3]);
		}
		catch (ArithmeticException e) {
			System.out.println("A");
			try {
				int a = Integer.parseInt("Hello");
			}
			catch (NumberFormatException e1){
				System.out.println(e1);
			}
		}
		catch (NumberFormatException e) {
			System.out.println("B");
		}
		catch (NegativeArraySizeException e) {
			System.out.println("C");
		}
		//catch (Exception e) {
			//System.out.println("D");
		//}
		finally {
			System.out.println("Inside Final");
		}
		System.out.println("After Exception");

	}

}
