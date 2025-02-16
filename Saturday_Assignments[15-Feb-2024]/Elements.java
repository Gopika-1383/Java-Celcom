package com.celcom.collection_assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Elements {

	public static void main(String[] args) {
		List <Integer> list = new ArrayList<>();
		Scanner sc = new Scanner (System.in);
		list.add(sc.nextInt());
		list.add(sc.nextInt());
		list.add(sc.nextInt());
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
