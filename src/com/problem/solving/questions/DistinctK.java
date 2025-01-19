package com.problem.solving.questions;

import java.util.ArrayList;
import java.util.Scanner;

class DistinctK {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int n = sc.nextInt();

		String str[] = new String[n];

		for (int i = 0; i < n; i++) {
//			System.out.println("Enter Strings");
			String s = sc.next();
			str[i] = s;
		}

		System.out.println("Enter a distinct No");

		int k = sc.nextInt();

		for (int i = 0; i < str.length; i++) {

			if (str[i] != "0") {

				for (int j = i + 1; j < str.length; j++) {

					if (str[i].equals(str[j])) {

						str[i] = "0";
						str[j] = "0";

					}

				}
			}
		}

		ArrayList<String> list = new ArrayList<>();
//		int count = 0;

		for (int i = 0; i < str.length; i++) {

			if (str[i] != "0") {
				list.add(str[i]);

			}
		}

		for (int i = 0; i < list.size(); i++) {

			if (!list.isEmpty() && (i + 1) == k) {
				System.out.println(list.get(i));
			} else if ((i + 1) < k) {
				System.out.println(-1);
			}

		}

//		3
//		dac
//		ba
//		a
//		1 

	}
}
