package com.freq;

import java.util.Scanner;

/*LBP251 : multiples of 10

Given an array A of N integer numbers. 
The task is to rewrite the array by putting all multiples of 10 at the end of the given array.

Note: The order of the numbers which are not multiples of 10 should remain unaltered, and similarly. the order of all multiples of 10 should be unaltered.
10 11 20 15 30 45 50 ===> 11 15 45 10 20 30 50

*/
public class Multiple_Of_10 {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);

		System.out.println("Enter size of array : ");

		int size = obj.nextInt();

		int a[] = new int[size];

		System.out.println("Enter array elements : ");

		for (int i = 0; i < a.length; i++) {
			a[i] = obj.nextInt();
		}

		obj.close();

		for (int i = 0; i < size; i++) {
			if (a[i] % 10 != 0) {
				System.out.print(a[i] + " ");
			}
		}

		for (int i = 0; i < size; i++) {
			if (a[i] % 10 == 0) {
				System.out.print(a[i] + " ");
			}
		}

	}

}
