package com.celcom.collection_assignments;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ElementsAndPosition {

	public static void main(String[] args) {
		List <String> list = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
        list.add(sc.next());
        list.add(sc.next());
        list.add(sc.next());
        list.add(sc.next());

        for (int i = 0; i < list.size(); i++) {
            System.out.println("Position " + i + ": Element " + list.get(i));
        }

	}

}
