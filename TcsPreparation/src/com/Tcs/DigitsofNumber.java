package com.Tcs;

import java.util.Scanner;

public class DigitsofNumber {

	public static void main(String[] args) {
		System.out.println("Enter a Number ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int remainder;
		while (number > 0) {
			remainder = number % 10;
			number = number / 10;
			System.out.println(remainder);
		}
		System.out.println(number);
	}

}
