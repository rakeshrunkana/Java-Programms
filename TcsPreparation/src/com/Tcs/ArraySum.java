package com.Tcs;

public class ArraySum {

	public static void main(String[] args) {
		System.out.println("Program to Print Array Summation ");
		int array[] = { 23, 40, 12, 4, 5, 2, 3, 8, };
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}
		System.out.println("Summation of Array " + sum);
	}

}
