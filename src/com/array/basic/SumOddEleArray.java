package com.array.basic;

import java.util.Scanner;

/*sum of odd numbers in an array
Implement a program to read an array elements and print sum of all odd elements.
*/
public class SumOddEleArray {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int size = obj.nextInt();
		int a[] = new int[size];
		int sum = 0;
		for (int i = 0; i < size; i++) {
			a[i] = obj.nextInt();
		}

		for (int i = 0; i < size; i++) {
			if (a[i] % 2 != 0) {
				sum = sum + a[i];
			}
		}

		System.out.println(sum);

		obj.close();
	}

}
