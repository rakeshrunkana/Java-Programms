package com.Tcs;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		System.out.println("Enter A Number!");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int temp, remainder, reverse = 0;
		temp = number;
		while (number > 0) {
			remainder = number % 10;
			reverse = reverse * 10 + remainder;
			number = number / 10;
		}
		if (temp == reverse) {
			System.out.println("Entered Number is Palindrome ");
		} else {
			System.out.println("Entered Number is Not Palidrome ");
		}
	}

}
