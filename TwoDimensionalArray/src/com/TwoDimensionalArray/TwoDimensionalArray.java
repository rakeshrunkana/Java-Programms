package com.TwoDimensionalArray;

public class TwoDimensionalArray {

	public static void main(String[] args) {

		int A[][] = new int[5][5];

		int B[][] = { { 1, 2, 3, }, { 2, 4, 6, }, { 1, 3, 5 } };

		int C[][];
		C = new int[5][5];

		int D[][]; // Jagged Array Creation i.e No Order
		D = new int[3][];
		D[0] = new int[5];
		D[1] = new int[3];
		D[2] = new int[8];

		for (int i = 0; i < D.length; i++) {
			for (int j = 0; j < D[i].length; j++) {
				System.out.print(D[i][j] + " ");
			}
			System.out.println(" ");
		}

		for (int x[] : B) {
			for (int y : x) {
				System.out.print(y + " ");
			}
			System.out.println(" ");
		}

		for (int i = 0; i < B.length; i++) {
			for (int j = 0; j < B[0].length; j++) {
				System.out.print(B[i][j] + " ");
			}
			System.out.println("");
		}
	}

}
