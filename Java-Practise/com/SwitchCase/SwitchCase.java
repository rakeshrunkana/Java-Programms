package com.SwitchCase;

public class SwitchCase {

	public static void main(String[] args) {
		final int i = 0;
		int month = 9;
		switch (month) {
		case i:
			System.out.println("January");
			break;
		case 2:
			System.out.println("February");
			break;
		case 3:
			System.out.println("March");
			break;
		default:
			System.out.println("Hey Default");
		}
		System.out.println("Out of switch case ");
	}

}
