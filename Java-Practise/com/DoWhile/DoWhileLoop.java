package com.DoWhile;

import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
		/*
		 * do{ //Statements }while{ codition}
		 * 
		 * int counter = 0; do { System.out.println(counter + " I love java");
		 * counter++; } while (counter < 15); System.out.println("Out of the loop");
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Number to Check Factorial  ");
		int number = sc.nextInt();
		int fact = 1, i = 1;
		do {
			fact = fact * i;
			i++;
		} while (number >= i);
		System.out.println("Factorial Of " + number + " is " + fact);

	}

}
