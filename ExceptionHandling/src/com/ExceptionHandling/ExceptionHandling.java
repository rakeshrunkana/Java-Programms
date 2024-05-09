package com.ExceptionHandling;

public class ExceptionHandling {

	public static void main(String[] args) {
		int a, b, c;
		try {
			a = 5;
			b = 0;
			c = a / b;
			System.out.println("Result is " + c);
			System.out.println("End of Programm");
			System.out.println("Bye");
		} catch (ArithmeticException e) {
			System.out.println("Division by zero " + e);
		}
	}

}