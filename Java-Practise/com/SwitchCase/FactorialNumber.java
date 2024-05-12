package com.SwitchCase;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		System.out.println("Enter a number ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int fact = 1,i=1;
		while (number >= i) {
			fact = fact * i;
			i++;

		}
		System.out.println("Factorial of " + fact );


	}

}
