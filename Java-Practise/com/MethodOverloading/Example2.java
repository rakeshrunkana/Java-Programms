package com.MethodOverloading;

public class Example2 {
	static int add(int a, int b) {
		return a + b; // With different data types
	}

	static double add(double a, double b) {
		return a + b;
	}

	public static void main(String[] args) {
		System.out.println(Example2.add(11, 11));
		System.out.println(Example2.add(12.3, 12.6));

	}

}
