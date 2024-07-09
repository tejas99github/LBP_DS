package com.array.basic;

import java.util.Scanner;

/*LBP146: Positive Count / Negative Sum

Create a function that takes an array of positive and negative numbers. 
Return an array where the first element is the count of positive numbers and 
the second element is the sum of negative numbers.
*/
public class PositiveCount_NegativeSum {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);

		System.out.println("Enter the size of array : ");
		int size = obj.nextInt();

		int a[] = new int[size];

		int sum = 0;
		int count = 0;

		System.out.println("Enter element into array : ");
		for (int i = 0; i < size; i++) {
			a[i] = obj.nextInt();
		}

		for (int i = 0; i < size; i++) {
			if (a[i] > 0) {
				count = count + 1;
			} else {
				sum = sum + a[i];
			}
		}

		if (size != 0) {
			System.out.print(count + " " + sum);
		} else {
			System.out.println(" ");
		}
		obj.close();
	}

}
