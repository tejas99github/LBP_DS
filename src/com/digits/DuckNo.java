package com.digits;

import java.util.Scanner;
/*
 * Program to read a number and check whether it is duck number or not. 
 * 
 * Hint: A duck number is a number which has zeros present in it, but no zero present in
 * the begining of the number and at least contain one zero in it.
 */

public class DuckNo {

	// Function to check if a number is a duck number or not
	static boolean isDuck(int n) {
		while (n != 0) {
			// If the last digit of the number is 0
			if (n % 10 == 0)
				return true;
			n = n / 10;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();
		if (isDuck(number))
			System.out.println(number + " is a Duck number.");
		else
			System.out.println(number + " is not a Duck number.");
		scanner.close();
	}
}
