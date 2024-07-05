package com.Tcs;

import java.util.Scanner;

public class AirthmaticSeries {

	public static void main(String[] args) {
		System.out.println("Program to Print Ap Series ");
		System.out.println("Enter a, d, n ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int d = sc.nextInt();
		int n = sc.nextInt();
		int term = a;
		for (int i = 0; i < n; i++) {
			System.out.print(term + " , ");
			term = term + d;
		}
	}

}
