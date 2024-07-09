package com.array.basic;

import java.util.Scanner;

/*Return the Sum of the Two Smallest Numbers
Create a function that takes an array of numbers and returns the sum of the two lowest positive numbers.
input -------> size and an array
con ---------> Dn't count negative numbers
output ------> sum of two smallest positive numbers
*/
public class SumofTwoSmallestNo {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);

		System.out.println("Enter the size of array : ");
		int size = obj.nextInt();

		int a[] = new int[size];

		System.out.println("Enter +ve & -ve element into array : ");
		for (int i = 0; i < size; i++) {
			a[i] = obj.nextInt();
		}

		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		for (int i = 0; i < size; i++) {

			if (a[i] > 0) {
				System.out.println(a[i] + a[i + 1]);
				break;
			}

		}
		obj.close();
	}

}
