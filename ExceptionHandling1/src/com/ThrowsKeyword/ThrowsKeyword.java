package com.ThrowsKeyword;

import java.io.*;

class M {
	void method() throws IOException {
		throw new IOException("device error");
	}
}

public class ThrowsKeyword {

	public static void main(String[] args) {
		try {
			M m = new M();
			m.method();
		} catch (Exception e) {
			System.out.println("Exception handled");
		}
		System.out.println("normal flow...");
	}

}
