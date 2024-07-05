package com.Tcs;

import java.util.Scanner;

public class SumofDigits {

	public static void main(String[] args) {
		System.out.println("Enter a number that should be more than 3 digits ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int sum = 0;
		for (int i = 0; i <= number; i++) {
			sum = sum + i;
		}
		System.out.println("Sum of the digits " + sum);
	}

}
