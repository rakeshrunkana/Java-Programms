package com.FileExample;

import java.io.*;

public class FileExample {

	public static void main(String[] args) throws FileNotFoundException {
		FileOutputStream fos = new FileOutputStream("C:/Users/rakesh/Test.txt");
		String str = "Java";
		byte b[]=str.getBytes();
		for(byte x:b)
			try {
				fos.write(x);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		try {
			fos.write(str.getBytes());
			fos.close();
		} catch (IOException e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}

}
