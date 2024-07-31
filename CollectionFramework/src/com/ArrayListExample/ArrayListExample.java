package com.ArrayListExample;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		// Creating arraylist
		ArrayList<String> list = new ArrayList<>();
		list.add("Java");
		list.add("Python"); // Adding object in arraylist
		list.add("Ruby");
		list.add("JavaScript");
		//Sorting list
		Collections.sort(list);
		System.out.println(list);
		// Traversing list through iterator
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		// Traversing list through for-each loop
		for (String code : list)
			System.out.println(code);
	}

}
