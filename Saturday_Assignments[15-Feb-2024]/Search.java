package com.celcom.collection_assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Search {

	public static void main(String[] args) {
		List <Integer> list = new ArrayList<>();
		Scanner sc = new Scanner (System.in);
		list.add(sc.nextInt());
		list.add(sc.nextInt());
		list.add(sc.nextInt());
		
		// Way - 1 to search using contain
		System.out.println(list.contains(10));
		
		// Way - 2 to search using element
		int a = 20; // element to be searched
		for(Integer i : list) {
			if (i==a) {
				System.out.println("Element found");
			}
		}
		
		// Way - 3 to search using indexOf
		System.out.println("Element at index 10 :  " + list.indexOf(10));
		sc.close();
		

	}

}
