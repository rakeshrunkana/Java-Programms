package com.Methods;

public class InstanceMethod {

	public static void main(String[] args) {
		InstanceMethod meth = new InstanceMethod();
		System.out.println("The sum is: " + meth.add(12, 13));
	}

	int s;

	public int add(int a, int b) {
		s = a + b;
		return s;

	}

}
