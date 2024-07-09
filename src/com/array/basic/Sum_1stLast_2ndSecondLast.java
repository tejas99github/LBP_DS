package com.array.basic;

import java.util.Scanner;

/*LBP136
sum of first and last, second and second last and so on
Implement a program to find the sum of first and last, second and second last and so on in an array.
*/
public class Sum_1stLast_2ndSecondLast {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		System.out.println("Enter size of array : ");

		int size = obj.nextInt();

		int a[] = new int[size];

		System.out.println("Add element into array a : ");
		for (int i = 0; i < size; i++) {

			a[i] = obj.nextInt();
		}

		int i = 0;
		int j = size - 1;

		while (i <= j) {
			System.out.println((a[i] + a[j]) + " ");
			i++;
			j--;
		}
		obj.close();
	}

}
