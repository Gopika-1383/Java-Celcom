package com.celcom.collection_assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Copy {

	public static void main(String[] args) {
		List <Integer> list1 = new ArrayList <> ();
		List <Integer> list2 = new ArrayList <> ();
		Scanner sc = new Scanner (System.in);
		list1.add(sc.nextInt());
		list1.add(sc.nextInt());
		list1.add(sc.nextInt());
		
		for(Integer i : list1) {
			list2.add(i);
		}
		
		System.out.println(list2);
		sc.close();

	}

}
