package com.celcom.collection_assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Sort {

	public static void main(String[] args) {
		List <Integer> list = new ArrayList <> ();
		Scanner sc = new Scanner (System.in);
		list.add(sc.nextInt());
		list.add(sc.nextInt());
		list.add(sc.nextInt());
		
		Collections.sort(list);
		System.out.println(list);

	}

}
