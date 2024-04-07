package com.Biggest;

import java.util.Scanner;

public class BiggestofThree {

	public static void main(String[] args) {
		System.out.println("Enter the three numbers ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if (a > b && a > c) {
			System.out.println("A is big " + a);
		} else {
			if (b > c) {
				System.out.println("B is big " + b);
			} else {
				System.out.println("C is big " + c);
			}
		}
	}

}
