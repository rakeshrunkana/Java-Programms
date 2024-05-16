package com.MapSetExample;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapSetExample {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(100, "Amit");
		map.put(101, "Vijay");
		map.put(102, "Rahul");
		// Elements can traverse in any order
		for (Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());

		}
	}

}
