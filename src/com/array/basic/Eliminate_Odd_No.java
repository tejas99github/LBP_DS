package com.array.basic;

import java.util.Scanner;

/*Eliminate Odd Numbers within an Array

Create a function that takes an array of numbers and returns only the even values.

Note:

Return all even numbers in the order they were given.
All test cases contain valid numbers ranging from 1 to 3000.
*/
public class Eliminate_Odd_No {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int n = obj.nextInt();

		int a[] = new int[n];

		System.out.println("Enter element into array : ");
		for (int i = 0; i < n; i++) {
			a[i] = obj.nextInt();
		}
		for (int i = 0; i < n; i++) {
			if (a[i] % 2 == 0) {
				System.out.print(a[i] + " ");
			}
		}
		obj.close();
	}

}
