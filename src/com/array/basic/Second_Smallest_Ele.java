package com.array.basic;

import java.util.Scanner;

/*second smallest element in an array
Implement a program to read array elements and find the second min element in an array.
*/
public class Second_Smallest_Ele {

	public static void sortArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int size = obj.nextInt();

		int a[] = new int[size];

		System.out.println("Add element into array : ");
		for (int i = 0; i < size; i++) {
			a[i] = obj.nextInt();
		}

		sortArray(a);

		System.out.println("Sorted Array : ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

		obj.close();

		System.out.println("\nSecond Smallest Element is : ");
		System.out.println(a[2 - 1]);

	}

}
