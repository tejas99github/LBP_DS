package com.array.basic;

import java.util.Scanner;

/*sort the elements in an array DESC
Implement a program to sort the given array elements in DESC order.
*/
public class Sort_Array_Descending {

	static void sortArray(int ar[]) {
		for (int i = 0; i < ar.length; i++) {
			for (int j = i + 1; j < ar.length; j++) {
				if (ar[i] < ar[j]) {
					int temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
		}

	}

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Ente the array size : ");
		int size = obj.nextInt();

		int a[] = new int[size];

		System.out.println("Enter the element into array : ");

		for (int i = 0; i < size; i++) {
			a[i] = obj.nextInt();
		}

		sortArray(a);

		for (int i = 0; i < size; i++) {
			System.out.print(a[i] + " ");
		}

		// convert sorted array into string and print using built in method
//		System.out.println("\n Sorted array is : " + Arrays.toString(sortedArray));
		obj.close();
	}

}
