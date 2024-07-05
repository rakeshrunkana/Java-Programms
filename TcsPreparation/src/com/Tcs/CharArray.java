package com.Tcs;

public class CharArray {

	public static void main(String[] args) {
		String name = "Rakesh";
		char[] nameArray = name.toCharArray();
		int start = 0;
		int end = nameArray.length - 1;
		char temp = 0;
		while (start < end) {
			temp = nameArray[start];
			nameArray[start] = nameArray[end];
			nameArray[end] = temp;
			start++;
			end--;
		}
		printArray(nameArray);
	}

	public static void printArray(char[] somearray) {
		System.out.println("Array reverse printing begin ");
		for (char i : somearray) {
			System.out.println(i);
		}
		System.out.println("Array reverse printing end ");
	}

}
