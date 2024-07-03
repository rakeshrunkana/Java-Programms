package com.FileExample;

import java.io.FileOutputStream;

public class FileOutputStreamExample {

	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("C:/Users/rakesh/testout.txt");
			fos.write(65);
			fos.close();
			System.out.println("Success...");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
