package com.TryCatchExample;

public class FinallyBlock {

	public static void main(String[] args) {
		try {
			int data = 25 / 5;
			System.out.println(data);
		} catch (NullPointerException e) {
			System.out.println(e);
		} finally {
			System.out.println("Finally block is always executed ");
		}
		System.out.println("rest of phe code...");
	}

}
