package com.ArrayPractise;

public class ArrayPractise {

	public static void main(String[] args) {
		// Array Declaration Methods
		int A[] = new int[10];

		int B[] = { 1, 2, 3, 4, 5 };

		int C[];
		C = new int[10];

		B[2] = 15;
		// for (int i = 0; i < B.length; i++) {
		// System.out.println(B[i]);
		// }
		for (int i=0;i<B.length;i++) {
			System.out.println(B[i]++);
		}
		for(int x: B)
        System.out.println(x);
	}

}
