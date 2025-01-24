package com.problem.solving.questions.codingninjas.mcq;

/**
 * Solution description If we are trying to print the instance variable inside
 * the static block or static method without creating the class instance then it
 * will give a compile-time error. non static variable x cannot be referenced
 * from a static context.
 * 
 * @author nadim
 *
 */
public class MockTest1 {

	int x = 10;

	public static void main(String[] args) {

		System.out.println(x);

	}

	static {
		System.out.println(x + 10);
	}

}
