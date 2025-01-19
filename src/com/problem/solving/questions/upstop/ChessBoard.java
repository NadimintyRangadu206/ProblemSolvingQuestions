package com.problem.solving.questions.upstop;

import java.util.Scanner;

class ChessBoard {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a String...");

		String s = sc.next();

		String arr[][] = new String[][] {

				{ "Black", "White", "Black", "White", "Black", "White", "Black", "White" },
				{ "White", "Black", "White", " Black", "White", "Black", "White", "Black" },
				{ "Black", "White", "Black", "White", "Black", "White", "Black", "White" },
				{ "White", "Black", "White", " Black", "White", "Black", "White", "Black" },
				{ "Black", "White", "Black", "White", "Black", "White", "Black", "White" },
				{ "White", "Black", "White", " Black", "White", "Black", "White", "Black" },
				{ "Black", "White", "Black", "White", "Black", "White", "Black", "White" },
				{ "White", "Black", "White", " Black", "White", "Black", "White", "Black" },

		};

		String str = " ";

		System.out.println(arr.length);

		for (int i = 1, ch = 'a'; i < arr.length; i++, ch++) {

			char c = (char) ch;
			System.out.println(c);

			for (int j = 1; j < arr[i].length; j++) {
				System.out.println(j);

				String copy = String.valueOf(c) + j;

				if (copy.equals(s)) {
					str = arr[i][j];
					break;

				}

			}
		}

		System.out.print(str);

	}
}
