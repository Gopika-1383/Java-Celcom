package com.celcom.collection_assignments;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class IterateSpecificPosition {

	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		Scanner sc = new Scanner (System.in);
        list.add(sc.next());
        list.add(sc.next());
        list.add(sc.next());

        int startPosition = 2; 
        
        // Way - 1
        ListIterator <String> iterator = list.listIterator(startPosition);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        
        //Way - 2
        for(int i=1; i<list.size(); i++) {
        	System.out.println(list.get(i));
        }

	}

}
