package com.problem.solving.questions.upstop;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MaryAndFlowers {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int t = scanner.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		int[] result = findFlowerIndexes(n, t, arr);
		System.out.println(result[0] + " " + result[1]);
	}

	public static int[] findFlowerIndexes(int n, int t, int[] arr) {
		// User will implement this function

		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < n; i++) {
			int complement = t - arr[i];

			// If the complement is already in the map, we found the pair
			if (map.containsKey(complement)) {
				return new int[] { map.get(complement), i };
			}

			// Otherwise, store the current element and its index in the map
			map.put(arr[i], i);
		}

		return new int[] { -1, -1 };
	}
}