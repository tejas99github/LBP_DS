package com.array.basic;

import java.util.Scanner;

/*binary search
Implement a program to search for an element in an array.
*/
public class Binary_Search {

	// Binary search implementation
	public static int binarySearch(int[] arr, int target) {
		int left = 0;
		int right = arr.length - 1;

		while (left <= right) {
			int mid = (left + right) / 2;

			if (arr[mid] == target) {
				return mid;
			} else if (arr[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return -1; // Element not found
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Input size of array
		System.out.print("Enter the size of the array: ");
		int size = scanner.nextInt();
		int[] arr = new int[size];

		// Input elements of the array
		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < size; i++) {
			arr[i] = scanner.nextInt();
		}

		// Bubble sort to sort the array
		for (int i = 0; i < size - 1; i++) {
			for (int j = 0; j < size - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					// Swap arr[j] and arr[j+1]
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		// Display sorted array
		System.out.println("Sorted array:");
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		// Input element to search
		System.out.print("Enter the element to search: ");
		int target = scanner.nextInt();

		// Searching the element in the sorted array
		int index = binarySearch(arr, target);

		// Display result
		if (index != -1) {
			System.out.println("Element found at index: " + index);
		} else {
			System.out.println("Element not found in the array.");
		}

		scanner.close();
	}

}
