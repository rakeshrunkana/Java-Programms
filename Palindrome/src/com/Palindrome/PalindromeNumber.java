package com.Palindrome;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		System.out.println("Enter a Number ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int remainder, reverse = 0;
		int temp = number;
		while (number > 0) {
			remainder = number % 10;
			reverse = reverse * 10 + remainder;
			number = number / 10;
		}
		if (temp == reverse) {
			System.out.println("Entered number is palindrome " + reverse);
		} else
			System.out.println("Entered number is not palindrome " + reverse);
	}

}
