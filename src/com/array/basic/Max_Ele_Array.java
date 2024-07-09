 package com.array.basic;

import java.util.Scanner;

/*max element in an array
Implement a program to read array elements and find the max element in an array.
*/
public class Max_Ele_Array {

	static void sortArray(int ar[]) {
		for (int i = 0; i < ar.length; i++) {
			for (int j = i + 1; j < ar.length; j++) {
				if (ar[i] > ar[j]) {
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

		System.out.println("Maximum element in array is : ");
		System.out.println(a[size - 1]);

		obj.close();
	}
}
