package com.Tcs;

import java.util.Scanner;

public class CountofDigits {

	public static void main(String[] args) {
		System.out.println("Enter a Number ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int count = 0;
		while (number > 0) {
			number = number / 10;
			count++;
		}
		System.out.println("Count of the digits " + count);
	}

}
