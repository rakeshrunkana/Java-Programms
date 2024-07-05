package com.Tcs;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		System.out.println("Enter a Number!");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int remainder, sum = 0;
		int temp = 0;
		temp = num;
		while (num > 0) {
			remainder = num % 10;
			sum = sum + remainder * remainder * remainder;
			num = num / 10;
		}
		if (temp == sum) {
			System.out.println("Entered Number is Armstrong ");
		} else
			System.out.println("Entered Number is Not Armstrong ");

	}

}
