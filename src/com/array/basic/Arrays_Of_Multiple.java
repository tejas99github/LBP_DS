package com.array.basic;

import java.util.Scanner;

/*Implement a program to create an array with n elements by taking multiples of m.
*/
public class Arrays_Of_Multiple {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Input the size of the array (n) and the multiplier (m)
		System.out.print("Enter the size of the array (n): ");
		int n = scanner.nextInt();

		System.out.print("Enter the multiplier (m): ");
		int m = scanner.nextInt();

		// Create the array with n elements by taking multiples of m
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = (i + 1) * m; // Multiples of m starting from m
		}

		// Print the array
		System.out.println("Array with multiples of " + m + ":");
		for (int i = 0; i < n; i++) {
			System.out.print(array[i] + " ");
		}

		scanner.close();
	}
}
