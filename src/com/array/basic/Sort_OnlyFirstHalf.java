package com.array.basic;

import java.util.Scanner;

/*Sort only First half of the elements
Implement a program to sort only first half of the array and keep remaining elements as original.
*/
public class Sort_OnlyFirstHalf {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Input the size of the array
		System.out.print("Enter the size of the array: ");
		int n = scanner.nextInt();

		// Input the elements of the array
		System.out.println("Enter the elements of the array:");
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}

		// Sort the first half of the array
		for (int i = 0; i < n / 2; i++) {
			for (int j = i + 1; j < n / 2; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		// Print the sorted first half and the remaining elements
		System.out.println("Sorted first half of the array:");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}

		scanner.close();
	}
}
