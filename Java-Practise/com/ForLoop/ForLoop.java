package com.ForLoop;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		System.out.println("Enter A Number to check factorial ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of " + num + " is " + fact);

	}

}
