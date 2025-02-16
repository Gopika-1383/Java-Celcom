package com.celcom.collection_assignments;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class ReverseLinkedList {

	public static void main(String[] args) {
		List <String> list = new LinkedList <> ();
		Scanner sc = new Scanner (System.in);
		list.add(sc.next());
		list.add(sc.next());
		list.add(sc.next());
		
		ListIterator<String> it = list.listIterator(list.size());
        while (it.hasPrevious()) {
            System.out.println(it.previous());
        }

	}

}
