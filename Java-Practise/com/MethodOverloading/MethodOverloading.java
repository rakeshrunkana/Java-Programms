package com.MethodOverloading;

public class MethodOverloading {
	static int add(int a, int b) {
		return a + b;   //With same data types but different arguments
	}

	static int add(int a, int b, int c) {
		return a + b + c;
	}

	public static void main(String[] args) {
		System.out.println(MethodOverloading.add(11, 11));
		System.out.println(MethodOverloading.add(11, 11, 11));

	}

}
