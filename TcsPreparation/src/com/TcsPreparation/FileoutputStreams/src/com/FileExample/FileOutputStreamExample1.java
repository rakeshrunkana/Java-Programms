package com.FileExample;

import java.io.FileOutputStream;

public class FileOutputStreamExample1 {

	public static void main(String[] args) {
    try {
    	FileOutputStream fos=new FileOutputStream("C:/Users/rakesh/testout.txt");
    	String s="Welcome to Java-Programming";
    	byte b[]=s.getBytes();//Converting string into byte array
    	fos.write(b);
    	fos.close();
    	System.out.println("Success...");
    }catch(Exception e) {
    		System.out.println(e);
    	
    }
	}

}
