package com.Tcs;

import java.util.Scanner;

public class ArraySearching {

	public static void main(String[] args) {
		System.out.println("Program to search array elements ");
		int array[] = { 2, 1, 5, 7, 20, 15, 13, 22, 12, 7 };
		System.out.println("Enter a key ");
		Scanner sc = new Scanner(System.in);
		int key;
		key = sc.nextInt();
		for (int i = 0; i < array.length; i++) {
			if (key == array[i]) {
				System.out.println("Element found at " + i);
				System.exit(0);
			}
		}
		System.out.println("Element not found ");
	}

}
