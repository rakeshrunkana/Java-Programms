package com.ArrayPractise;

public class SecondMaximumArray {

	public static void main(String[] args) {
		int A[] = { 3, 9, 7, 8, 12, 6, 15, 5, 4, 10 };
		int max1, max2;
		max1 = max2 = A[0];
		for (int i = 0; i < A.length; i++) {
			if (A[i] > max1) {
				max2 = max1;
				max1 = A[i];
			} else if (A[i] > max2) {
				max2 = A[i];
			}
		}
		System.out.println("Second Largest Element  Is " + max2);
	}

}
