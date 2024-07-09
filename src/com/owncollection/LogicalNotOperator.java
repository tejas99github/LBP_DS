package com.owncollection;

public class LogicalNotOperator {
	public static void main(String[] args) {
		boolean x = true;
		boolean y = false;

		// Using the logical NOT operator
		boolean result1 = !x; // Negating true gives false
		boolean result2 = !y; // Negating false gives true

		// Printing results
		System.out.println("Result of !x: " + result1); // Output: false
		System.out.println("Result of !y: " + result2); // Output: true
	}
}

/*
 * ! is the logical NOT operator in Java. It negates the result of the
 * expression that follows it
 */