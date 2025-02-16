package com.celcom.collection_assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		List <Integer> list = new ArrayList<>();
		Scanner sc = new Scanner (System.in);
		list.add(sc.nextInt());
		list.add(sc.nextInt());
		list.add(sc.nextInt());
		
		System.out.println("Before Reverse : " + list);
		
		// Way - 1 using reverse()
		Collections.reverse(list);
		System.out.println("After Reverse : " + list);
		
		// Way -2 using loop
		for(int i=list.size()-1; i>=0; i--) {
			System.out.println(list.get(i));
		}

	}

}
