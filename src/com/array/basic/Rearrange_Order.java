package com.array.basic;

import java.util.Scanner;

public class Rearrange_Order {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of array : ");

		// Input the size of the array
		int n = scanner.nextInt();

		System.out.println("Enter element into array : ");

		// Input the elements of the array
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}

		// Sorting the array using bubble sort
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

//		System.out.println("Sorted array : ");
//		for (int i = 0; i < a.length; i++) {
//			System.out.print(a[i] + " ");
//		}

		// Print the elements in pairs from both ends
		int i = 0;
		int j = n - 1;
		while (i <= j) {
			System.out.print("\n" + a[i] + " " + a[j] + " ");
			i++;
			j--;
		}

		scanner.close();
	}
}
