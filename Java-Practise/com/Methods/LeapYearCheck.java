package com.Methods;

import java.util.Scanner;

public class LeapYearCheck {
	static void LeapYear(int year) {
		if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
			System.out.println("Specified year is LeapYear " + year);
		} else {
			System.out.println("Specified year is Not a LeapYear " + year);
		}

	}

	public static void main(String[] args) {
		System.out.println("Enter an Year in the format(yyyy)");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		LeapYear(year);

	}

}
