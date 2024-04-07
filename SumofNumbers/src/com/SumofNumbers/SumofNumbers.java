package com.SumofNumbers;

import java.util.Scanner;

public class SumofNumbers {

	public static void main(String[] args) {
		System.out.println("Enter a number ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int sum = 0;
		for (int i = 0; i <= number; i++) {
			sum = sum + i;
		}
		System.out.println("Sum of the numbers are " + sum);
	}

}
