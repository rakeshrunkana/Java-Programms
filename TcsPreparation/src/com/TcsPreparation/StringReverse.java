package com.TcsPreparation;

public class StringReverse {

	public static void main(String[] args) {
		String name = "RAKESH";
		char[] nameArray = name.toCharArray();
		int start = 0;
		int end = nameArray.length - 1;
		char temp;
		while (start <= end) {
			temp = nameArray[start];
			nameArray[start] = nameArray[end];
			nameArray[end] = temp;
			start++;
			end--;
		}
		printArray(nameArray);
	}

	private static void printArray(char[] somearray) {
		System.out.println("Array printing begin");
		for (char c : somearray) {
			System.out.println(c);
		}
		System.out.println("Array printing end");
	}
}
