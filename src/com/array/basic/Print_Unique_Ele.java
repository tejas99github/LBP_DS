package com.array.basic;

import java.util.Scanner;

/*print unique elements in array
Implement a program to find the unique elements present in the given array.
*/
public class Print_Unique_Ele {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the size of the array: ");
		int size = scanner.nextInt();

		int[] array = new int[size];

		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}

		System.out.println("Unique elements in the array:");
		findUniqueElements(array);

		scanner.close();
	}

	public static void findUniqueElements(int[] array) {
		// Iterate through each element in the array
		for (int i = 0; i < array.length; i++) {
			boolean isUnique = true;

			// Check if the current element is repeated later in the array
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					isUnique = false;
					break;
				}
			}

			// If the current element is unique, print it
			if (isUnique) {
				System.out.print(array[i] + " ");
			}
		}
	}
}
