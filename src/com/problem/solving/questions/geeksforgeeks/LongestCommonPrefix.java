package com.problem.solving.questions.geeksforgeeks;

import java.util.Arrays;

public class LongestCommonPrefix {

	public static String longestCommonPrefix(String str[]) {

//		 approach 1    a,ab abc,abcd

		if (str.length == 1) {
			return str[0].toString();
		}

		Arrays.sort(str);

		String s1 = str[0];

		String s2 = str[str.length - 1];

		int x = 0;
		int y = 0;

		String ans = "";

		while (x < s1.length() && y < s2.length()) {

			if (s1.charAt(x) == s2.charAt(y)) {

				ans += s1.charAt(x);
				x++;
				y++;
			} else {
				break;
			}
		}

		if (ans.length() == 0) {
			return "-1";
		}

		return ans;
	}

	public static void main(String[] args) {

		System.out.println(longestCommonPrefix(new String[] { "geeksforgeeks", "geeks", "geek", "geezer" }));

	}

}
