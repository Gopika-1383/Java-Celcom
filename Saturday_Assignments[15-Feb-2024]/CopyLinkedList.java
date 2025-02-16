package com.celcom.collection_assignments;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CopyLinkedList {

	public static void main(String[] args) {
		 List<String> list1 = new LinkedList <> ();
		 Scanner sc = new Scanner(System.in);
	     list1.add(sc.next());
	     list1.add(sc.next());
	     list1.add(sc.next());

	        
	     List<String> list2 = new LinkedList <> (list1);

	     System.out.println("Original List: " + list2);
	     System.out.println("Copied List: " + list2);

	}

}
