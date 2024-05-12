package com.SwitchCase;

import java.util.Scanner;

public class LadderIf {

	public static void main(String[] args) {
		System.out.println("Please enter your age ");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if (age > 21) {
			if (age > 55) 
				System.out.println("Senior citizen account");
			 else if (age < 55) 
				System.out.println("Savings account");
		} else if (age < 21) 
				System.out.println("Ineligible");
			
		
	}

}
