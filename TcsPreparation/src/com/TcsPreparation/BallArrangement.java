package com.TcsPreparation;

import java.util.*;

public class BallArrangement {
	public static void main(String[] args) {
		// Example input
		int G = 1, Y = 1, R = 1;

		// Get all arrangements
		Set<String> arrangements = findArrangements(G, Y, R);

		// Print the result
		System.out.println("Output: " + arrangements.size());
	}

	public static Set<String> findArrangements(int G, int Y, int R) {
		Set<String> result = new HashSet<>();
		arrangeBalls(G, Y, R, "", ' ', result);
		return result;
	}

	public static void arrangeBalls(int G, int Y, int R, String current, char lastBall, Set<String> result) {
		if (G == 0 && Y == 0 && R == 0) {
			result.add(current);
			return;
		}

		if (G > 0 && lastBall != 'G') {
			arrangeBalls(G - 1, Y, R, current + "G", 'G', result);
		}

		if (Y > 0 && lastBall != 'Y') {
			arrangeBalls(G, Y - 1, R, current + "Y", 'Y', result);
		}

		if (R > 0 && lastBall != 'R') {
			arrangeBalls(G, Y, R - 1, current + "R", 'R', result);
		}
	}
}
