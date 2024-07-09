package com.array.basic;

import java.util.Scanner;

/*LBP149: Mini Peaks
Write a function that returns all the elements in an array that are strictly greater than their adjacent left and right neighbors.
*/
public class Greater_ThanAdj_LeftRight {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);

		System.out.println("Enter the size of array : ");
		int size = obj.nextInt();

		int a[] = new int[size];

		System.out.println("Enter element into array : ");
		for (int i = 0; i < size; i++) {
			a[i] = obj.nextInt();
		}

		for (int i = 1; i < size - 1; i++) {
			if (a[i] > a[i - 1] && a[i] > a[i + 1]) {
				System.out.print(a[i] + " ");
			}
		}
		obj.close();
	}

}
